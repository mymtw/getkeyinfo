package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;

/* renamed from: kotlinx.coroutines.q0 */
public final class C19769q0 extends C19705i {

    /* renamed from: b */
    public final C19766p0 f43724b;

    public C19769q0(C19766p0 p0Var) {
        this.f43724b = p0Var;
    }

    /* renamed from: a */
    public final void mo72155a(Throwable th) {
        this.f43724b.dispose();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72155a((Throwable) obj);
        return C19394m.f43287a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DisposeOnCancel[");
        h.append(this.f43724b);
        h.append(']');
        return h.toString();
    }
}
