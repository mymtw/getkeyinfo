package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8054g;
import p248tp.C8073u;
import p503zp.C13972h;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithSingle$MergeWithObserver */
final class ObservableMergeWithSingle$MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
    public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
    public static final int OTHER_STATE_HAS_VALUE = 1;
    private static final long serialVersionUID = -4592979584110982903L;
    public volatile boolean disposed;
    public final Observer<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
    public volatile boolean mainDone;
    public final OtherObserver<T> otherObserver = new OtherObserver<>(this);
    public volatile int otherState;
    public volatile C13972h<T> queue;
    public T singleItem;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithSingle$MergeWithObserver$OtherObserver */
    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements C8073u<T> {
        private static final long serialVersionUID = -2935427570954647017L;
        public final ObservableMergeWithSingle$MergeWithObserver<T> parent;

        public OtherObserver(ObservableMergeWithSingle$MergeWithObserver<T> observableMergeWithSingle$MergeWithObserver) {
            this.parent = observableMergeWithSingle$MergeWithObserver;
        }

        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.parent.otherSuccess(t);
        }
    }

    public ObservableMergeWithSingle$MergeWithObserver(Observer<? super T> observer) {
        this.downstream = observer;
    }

    public void dispose() {
        this.disposed = true;
        DisposableHelper.dispose(this.mainDisposable);
        DisposableHelper.dispose(this.otherObserver);
        if (getAndIncrement() == 0) {
            this.queue = null;
            this.singleItem = null;
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        Observer<? super T> observer = this.downstream;
        int i = 1;
        while (!this.disposed) {
            if (this.error.get() != null) {
                this.singleItem = null;
                this.queue = null;
                observer.onError(this.error.terminate());
                return;
            }
            int i2 = this.otherState;
            if (i2 == 1) {
                T t = this.singleItem;
                this.singleItem = null;
                this.otherState = 2;
                observer.onNext(t);
                i2 = 2;
            }
            boolean z = this.mainDone;
            C13972h<T> hVar = this.queue;
            T poll = hVar != null ? hVar.poll() : null;
            boolean z2 = poll == null;
            if (z && z2 && i2 == 2) {
                this.queue = null;
                observer.onComplete();
                return;
            } else if (z2) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                observer.onNext(poll);
            }
        }
        this.singleItem = null;
        this.queue = null;
    }

    public C13972h<T> getOrCreateQueue() {
        C13972h<T> hVar = this.queue;
        if (hVar != null) {
            return hVar;
        }
        C19213a aVar = new C19213a(C8054g.f17572b);
        this.queue = aVar;
        return aVar;
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.mainDisposable.get());
    }

    public void onComplete() {
        this.mainDone = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.error.addThrowable(th)) {
            DisposableHelper.dispose(this.otherObserver);
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (compareAndSet(0, 1)) {
            this.downstream.onNext(t);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            getOrCreateQueue().offer(t);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.mainDisposable, disposable);
    }

    public void otherError(Throwable th) {
        if (this.error.addThrowable(th)) {
            DisposableHelper.dispose(this.mainDisposable);
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void otherSuccess(T t) {
        if (compareAndSet(0, 1)) {
            this.downstream.onNext(t);
            this.otherState = 2;
        } else {
            this.singleItem = t;
            this.otherState = 1;
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }
}
