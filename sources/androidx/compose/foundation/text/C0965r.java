package androidx.compose.foundation.text;

import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.text.C2021q;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.text.r */
public final class C0965r {

    /* renamed from: a */
    public final C2021q f2042a;

    /* renamed from: b */
    public C1689j f2043b;

    /* renamed from: c */
    public C1689j f2044c;

    public C0965r(C2021q qVar) {
        C19383o.m32797g(qVar, "value");
        this.f2042a = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo4578a(long r5) {
        /*
            r4 = this;
            androidx.compose.ui.layout.j r0 = r4.f2043b
            if (r0 == 0) goto L_0x0019
            boolean r1 = r0.mo6685c()
            r2 = 0
            if (r1 == 0) goto L_0x0015
            androidx.compose.ui.layout.j r1 = r4.f2044c
            if (r1 == 0) goto L_0x0017
            r2 = 1
            y.d r2 = r1.mo6689v(r0, r2)
            goto L_0x0017
        L_0x0015:
            y.d r2 = p288y.C8345d.f18300e
        L_0x0017:
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            y.d r2 = p288y.C8345d.f18300e
        L_0x001b:
            float r0 = p288y.C8343c.m16642c(r5)
            float r1 = r2.f18301a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            float r0 = p288y.C8343c.m16642c(r5)
            float r1 = r2.f18303c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            float r1 = p288y.C8343c.m16642c(r5)
        L_0x0035:
            float r0 = p288y.C8343c.m16643d(r5)
            float r3 = r2.f18302b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            goto L_0x004f
        L_0x0040:
            float r0 = p288y.C8343c.m16643d(r5)
            float r3 = r2.f18304d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            float r3 = p288y.C8343c.m16643d(r5)
        L_0x004f:
            long r5 = kotlin.reflect.C19421p.m32952q(r1, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C0965r.mo4578a(long):long");
    }

    /* renamed from: b */
    public final int mo4579b(long j, boolean z) {
        if (z) {
            j = mo4578a(j);
        }
        return this.f2042a.mo7751l(mo4580c(j));
    }

    /* renamed from: c */
    public final long mo4580c(long j) {
        C8343c cVar;
        C1689j jVar = this.f2043b;
        if (jVar == null) {
            return j;
        }
        C1689j jVar2 = this.f2044c;
        if (jVar2 != null) {
            cVar = new C8343c((!jVar.mo6685c() || !jVar2.mo6685c()) ? j : jVar.mo6686m(jVar2, j));
        } else {
            cVar = null;
        }
        return cVar != null ? cVar.f18299a : j;
    }
}
