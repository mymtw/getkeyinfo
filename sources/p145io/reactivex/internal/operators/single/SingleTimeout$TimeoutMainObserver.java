package p145io.reactivex.internal.operators.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8073u;
import p248tp.C8075w;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver */
final class SingleTimeout$TimeoutMainObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Runnable, Disposable {
    private static final long serialVersionUID = 37497744973048446L;
    public final C8073u<? super T> downstream;
    public final TimeoutFallbackObserver<T> fallback;
    public C8075w<? extends T> other;
    public final AtomicReference<Disposable> task = new AtomicReference<>();
    public final long timeout;
    public final TimeUnit unit;

    /* renamed from: io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver */
    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements C8073u<T> {
        private static final long serialVersionUID = 2071387740092105509L;
        public final C8073u<? super T> downstream;

        public TimeoutFallbackObserver(C8073u<? super T> uVar) {
            this.downstream = uVar;
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public SingleTimeout$TimeoutMainObserver(C8073u<? super T> uVar, C8075w<? extends T> wVar, long j, TimeUnit timeUnit) {
        this.downstream = uVar;
        this.other = wVar;
        this.timeout = j;
        this.unit = timeUnit;
        if (wVar != null) {
            this.fallback = new TimeoutFallbackObserver<>(uVar);
        } else {
            this.fallback = null;
        }
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.task);
        TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
        if (timeoutFallbackObserver != null) {
            DisposableHelper.dispose(timeoutFallbackObserver);
        }
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onError(Throwable th) {
        Disposable disposable = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
            C18981a.m32123b(th);
            return;
        }
        DisposableHelper.dispose(this.task);
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        Disposable disposable = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper && compareAndSet(disposable, disposableHelper)) {
            DisposableHelper.dispose(this.task);
            this.downstream.onSuccess(t);
        }
    }

    public void run() {
        Disposable disposable = (Disposable) get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper && compareAndSet(disposable, disposableHelper)) {
            if (disposable != null) {
                disposable.dispose();
            }
            C8075w<? extends T> wVar = this.other;
            if (wVar == null) {
                this.downstream.onError(new TimeoutException(ExceptionHelper.m32484c(this.timeout, this.unit)));
                return;
            }
            this.other = null;
            wVar.mo20655a(this.fallback);
        }
    }
}
