package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver */
final class MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T> {
    private static final long serialVersionUID = 8663801314800248617L;
    public final C8058k<? super T> downstream;

    public MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver(C8058k<? super T> kVar) {
        this.downstream = kVar;
    }

    public void onComplete() {
        this.downstream.onComplete();
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
