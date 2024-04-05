package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8059l;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe$TimeoutMainMaybeObserver */
final class MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = -5955289211445418871L;
    public final C8058k<? super T> downstream;
    public final C8059l<? extends T> fallback;
    public final MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<T, U> other = new MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<>(this);
    public final MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> otherObserver;

    public MaybeTimeoutMaybe$TimeoutMainMaybeObserver(C8058k<? super T> kVar, C8059l<? extends T> lVar) {
        this.downstream = kVar;
        this.fallback = lVar;
        this.otherObserver = lVar != null ? new MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<>(kVar) : null;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.other);
        MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> maybeTimeoutMaybe$TimeoutFallbackMaybeObserver = this.otherObserver;
        if (maybeTimeoutMaybe$TimeoutFallbackMaybeObserver != null) {
            DisposableHelper.dispose(maybeTimeoutMaybe$TimeoutFallbackMaybeObserver);
        }
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onError(th);
        } else {
            C18981a.m32123b(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherComplete() {
        if (DisposableHelper.dispose(this)) {
            C8059l<? extends T> lVar = this.fallback;
            if (lVar == null) {
                this.downstream.onError(new TimeoutException());
            } else {
                lVar.mo20624a(this.otherObserver);
            }
        }
    }

    public void otherError(Throwable th) {
        if (DisposableHelper.dispose(this)) {
            this.downstream.onError(th);
        } else {
            C18981a.m32123b(th);
        }
    }
}
