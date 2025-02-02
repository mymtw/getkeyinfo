package p145io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.disposables.ArrayCompositeDisposable */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    public void dispose() {
        Disposable disposable;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                Disposable disposable2 = (Disposable) get(i);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (!(disposable2 == disposableHelper || (disposable = (Disposable) getAndSet(i, disposableHelper)) == disposableHelper || disposable == null)) {
                    disposable.dispose();
                }
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public Disposable replaceResource(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) get(i);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.dispose();
                return null;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        return disposable2;
    }

    public boolean setResource(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) get(i);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.dispose();
        return true;
    }
}
