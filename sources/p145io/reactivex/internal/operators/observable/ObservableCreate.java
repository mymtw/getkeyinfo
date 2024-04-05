package p145io.reactivex.internal.operators.observable;

import android.provider.MediaStore;
import com.etsy.android.lib.util.C8879a0;
import com.etsy.android.lib.util.C8927y;
import com.etsy.android.lib.util.C8928z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.CancellableDisposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8061n;
import p248tp.C8063o;
import p248tp.C8064p;
import p287xp.C8338f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableCreate */
public final class ObservableCreate<T> extends C8061n<T> {

    /* renamed from: b */
    public final C8064p<T> f42727b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCreate$CreateEmitter */
    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements C8063o<T>, Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        public final Observer<? super T> observer;

        public CreateEmitter(Observer<? super T> observer2) {
            this.observer = observer2;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C18981a.m32123b(th);
            }
        }

        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.observer.onNext(t);
            }
        }

        public C8063o<T> serialize() {
            return new SerializedEmitter(this);
        }

        public void setCancellable(C8338f fVar) {
            setDisposable(new CancellableDisposable(fVar));
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{CreateEmitter.class.getSimpleName(), super.toString()});
        }

        /* JADX INFO: finally extract failed */
        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCreate$SerializedEmitter */
    public static final class SerializedEmitter<T> extends AtomicInteger implements C8063o<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final C8063o<T> emitter;
        public final AtomicThrowable error = new AtomicThrowable();
        public final C19213a<T> queue = new C19213a<>(16);

        public SerializedEmitter(C8063o<T> oVar) {
            this.emitter = oVar;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            C8063o<T> oVar = this.emitter;
            C19213a<T> aVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int i = 1;
            while (!oVar.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    aVar.clear();
                    oVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                T poll = aVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    oVar.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    oVar.onNext(poll);
                }
            }
            aVar.clear();
        }

        public boolean isDisposed() {
            return this.emitter.isDisposed();
        }

        public void onComplete() {
            if (!this.emitter.isDisposed() && !this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C18981a.m32123b(th);
            }
        }

        public void onNext(T t) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C19213a<T> aVar = this.queue;
                    synchronized (aVar) {
                        aVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.emitter.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        public C8063o<T> serialize() {
            return this;
        }

        public void setCancellable(C8338f fVar) {
            this.emitter.setCancellable(fVar);
        }

        public void setDisposable(Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        public String toString() {
            return this.emitter.toString();
        }

        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }
    }

    public ObservableCreate(C8879a0 a0Var) {
        this.f42727b = a0Var;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            C8879a0 a0Var = (C8879a0) this.f42727b;
            a0Var.getClass();
            C8927y yVar = new C8927y(a0Var, createEmitter);
            a0Var.f19625a.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, yVar);
            createEmitter.setCancellable(new C8928z(a0Var, yVar));
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            createEmitter.onError(th);
        }
    }
}
