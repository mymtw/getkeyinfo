package p145io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p287xp.C8338f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.disposables.CancellableDisposable */
public final class CancellableDisposable extends AtomicReference<C8338f> implements Disposable {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(C8338f fVar) {
        super(fVar);
    }

    public void dispose() {
        C8338f fVar;
        if (get() != null && (fVar = (C8338f) getAndSet((Object) null)) != null) {
            try {
                fVar.cancel();
            } catch (Exception e) {
                C19421p.m32940h0(e);
                C18981a.m32123b(e);
            }
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
