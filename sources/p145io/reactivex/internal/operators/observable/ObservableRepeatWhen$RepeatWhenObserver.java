package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.subjects.C19257c;
import p248tp.C8065q;
import p514bk.C14088a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver */
final class ObservableRepeatWhen$RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = 802743776666017014L;
    public volatile boolean active;
    public final Observer<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final ObservableRepeatWhen$RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
    public final C19257c<Object> signaller;
    public final C8065q<T> source;
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();
    public final AtomicInteger wip = new AtomicInteger();

    /* renamed from: io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver$InnerRepeatObserver */
    public final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
        private static final long serialVersionUID = 3254781284376480842L;

        public InnerRepeatObserver() {
        }

        public void onComplete() {
            ObservableRepeatWhen$RepeatWhenObserver.this.innerComplete();
        }

        public void onError(Throwable th) {
            ObservableRepeatWhen$RepeatWhenObserver.this.innerError(th);
        }

        public void onNext(Object obj) {
            ObservableRepeatWhen$RepeatWhenObserver.this.innerNext();
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableRepeatWhen$RepeatWhenObserver(Observer<? super T> observer, C19257c<Object> cVar, C8065q<T> qVar) {
        this.downstream = observer;
        this.signaller = cVar;
        this.source = qVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.inner);
    }

    public void innerComplete() {
        DisposableHelper.dispose(this.upstream);
        C14088a.m21789r(this.downstream, this, this.error);
    }

    public void innerError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }

    public void innerNext() {
        subscribeNext();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    public void onComplete() {
        DisposableHelper.replace(this.upstream, (Disposable) null);
        this.active = false;
        this.signaller.onNext(0);
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.inner);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C14088a.m21793v(this.downstream, t, this, this.error);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void subscribeNext() {
        if (this.wip.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.active) {
                    this.active = true;
                    this.source.subscribe(this);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
