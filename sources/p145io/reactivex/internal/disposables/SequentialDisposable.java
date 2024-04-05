package p145io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.disposables.SequentialDisposable */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public boolean replace(Disposable disposable) {
        return DisposableHelper.replace(this, disposable);
    }

    public boolean update(Disposable disposable) {
        return DisposableHelper.set(this, disposable);
    }

    public SequentialDisposable(Disposable disposable) {
        lazySet(disposable);
    }
}
