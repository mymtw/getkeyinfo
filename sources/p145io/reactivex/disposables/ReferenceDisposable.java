package p145io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.disposables.ReferenceDisposable */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReferenceDisposable(T t) {
        super(t);
        if (t != null) {
            return;
        }
        throw new NullPointerException("value is null");
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            onDisposed(andSet);
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }

    public abstract void onDisposed(T t);
}
