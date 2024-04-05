package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe$TimeoutOtherMaybeObserver */
final class MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Disposable> implements C8058k<Object> {
    private static final long serialVersionUID = 8663801314800248617L;
    public final MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> parent;

    public MaybeTimeoutMaybe$TimeoutOtherMaybeObserver(MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> maybeTimeoutMaybe$TimeoutMainMaybeObserver) {
        this.parent = maybeTimeoutMaybe$TimeoutMainMaybeObserver;
    }

    public void onComplete() {
        this.parent.otherComplete();
    }

    public void onError(Throwable th) {
        this.parent.otherError(th);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(Object obj) {
        this.parent.otherComplete();
    }
}
