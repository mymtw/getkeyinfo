package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1293a;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.vector.g */
public final class C1579g extends C1293a<C1578f> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1579g(C1552b bVar) {
        super(bVar);
        C19383o.m32797g(bVar, "root");
    }

    /* renamed from: j */
    public static C1552b m3412j(C1578f fVar) {
        if (fVar instanceof C1552b) {
            return (C1552b) fVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    /* renamed from: a */
    public final void mo5639a(int i, int i2, int i3) {
        C1552b j = m3412j((C1578f) this.f2796c);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                j.f3413c.remove(i);
                j.f3413c.add(i2, (C1578f) j.f3413c.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                j.f3413c.remove(i);
                j.f3413c.add(i2 - 1, (C1578f) j.f3413c.get(i));
                i4++;
            }
        }
        j.mo6510c();
    }

    /* renamed from: b */
    public final void mo5640b(int i, int i2) {
        m3412j((C1578f) this.f2796c).mo6441e(i, i2);
    }

    /* renamed from: c */
    public final void mo5641c(int i, Object obj) {
        C1578f fVar = (C1578f) obj;
        C19383o.m32797g(fVar, "instance");
        C1552b j = m3412j((C1578f) this.f2796c);
        j.getClass();
        if (i < j.f3413c.size()) {
            j.f3413c.set(i, fVar);
        } else {
            j.f3413c.add(fVar);
        }
        fVar.mo6440d(j.f3418h);
        j.mo6510c();
    }

    /* renamed from: f */
    public final void mo5643f(int i, Object obj) {
        C19383o.m32797g((C1578f) obj, "instance");
    }

    /* renamed from: i */
    public final void mo5615i() {
        C1552b j = m3412j((C1578f) this.f2794a);
        j.mo6441e(0, j.f3413c.size());
    }
}
