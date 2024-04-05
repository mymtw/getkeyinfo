package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeZipArray$ZipMaybeObserver */
final class MaybeZipArray$ZipMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T> {
    private static final long serialVersionUID = 3323743579927613702L;
    public final int index;
    public final MaybeZipArray$ZipCoordinator<T, ?> parent;

    public MaybeZipArray$ZipMaybeObserver(MaybeZipArray$ZipCoordinator<T, ?> maybeZipArray$ZipCoordinator, int i) {
        this.parent = maybeZipArray$ZipCoordinator;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public void onComplete() {
        this.parent.innerComplete(this.index);
    }

    public void onError(Throwable th) {
        this.parent.innerError(th, this.index);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        this.parent.innerSuccess(t, this.index);
    }
}
