package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.e1 */
public final class C19544e1 extends C19704h1 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43498g = AtomicIntegerFieldUpdater.newUpdater(C19544e1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: f */
    public final C19857l<Throwable, C19394m> f43499f;

    public C19544e1(C19857l<? super Throwable, C19394m> lVar) {
        this.f43499f = lVar;
    }

    /* renamed from: F */
    public final void mo72253F(Throwable th) {
        if (f43498g.compareAndSet(this, 0, 1)) {
            this.f43499f.invoke(th);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72253F((Throwable) obj);
        return C19394m.f43287a;
    }
}
