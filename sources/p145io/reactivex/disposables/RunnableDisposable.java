package p145io.reactivex.disposables;

import android.support.p013v4.media.C0072d;

/* renamed from: io.reactivex.disposables.RunnableDisposable */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RunnableDisposable(disposed=");
        h.append(isDisposed());
        h.append(", ");
        h.append(get());
        h.append(")");
        return h.toString();
    }

    public void onDisposed(Runnable runnable) {
        runnable.run();
    }
}
