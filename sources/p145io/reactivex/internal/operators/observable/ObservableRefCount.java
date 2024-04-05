package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8061n;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRefCount */
public final class ObservableRefCount<T> extends C8061n<T> {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final ObservableRefCount<?> parent;
        public long subscriberCount;
        public Disposable timer;

        public RefConnection(ObservableRefCount<?> observableRefCount) {
        }

        public void run() {
            throw null;
        }

        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.replace(this, disposable);
            throw null;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableRefCount$RefCountObserver */
    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        public final RefConnection connection;
        public final Observer<? super T> downstream;
        public final ObservableRefCount<T> parent;
        public Disposable upstream;

        public RefCountObserver(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = observer;
            this.connection = refConnection;
        }

        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                C18981a.m32123b(th);
                return;
            }
            throw null;
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
