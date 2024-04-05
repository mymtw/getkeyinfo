package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C19383o;
import p514bk.C14088a;

/* renamed from: kotlinx.coroutines.j1 */
public abstract class C19746j1 extends C19836x implements C19766p0, C19466a1 {

    /* renamed from: e */
    public C19749k1 f43698e;

    /* renamed from: G */
    public final C19749k1 mo72494G() {
        C19749k1 k1Var = this.f43698e;
        if (k1Var != null) {
            return k1Var;
        }
        C19383o.m32805o("job");
        throw null;
    }

    /* renamed from: d */
    public final C19767p1 mo72101d() {
        return null;
    }

    public final void dispose() {
        boolean z;
        C19749k1 G = mo72494G();
        do {
            Object h0 = G.mo72521h0();
            if (h0 instanceof C19746j1) {
                if (h0 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C19749k1.f43700b;
                    C19793s0 s0Var = C14088a.f31038s;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(G, h0, s0Var)) {
                            if (atomicReferenceFieldUpdater.get(G) != h0) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((h0 instanceof C19466a1) && ((C19466a1) h0).mo72101d() != null) {
                mo72219A();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    public final boolean isActive() {
        return true;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + C19543e0.m33300R(this) + "[job@" + C19543e0.m33300R(mo72494G()) + ']';
    }
}
