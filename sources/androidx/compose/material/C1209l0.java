package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.window.C2092e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7285e;
import p174m0.C7289h;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.l0 */
public final class C1209l0 implements C2092e {

    /* renamed from: a */
    public final long f2517a;

    /* renamed from: b */
    public final C7282b f2518b;

    /* renamed from: c */
    public final C19861p<C7289h, C7289h, C19394m> f2519c;

    public C1209l0() {
        throw null;
    }

    public C1209l0(long j, C7282b bVar, C19861p pVar) {
        this.f2517a = j;
        this.f2518b = bVar;
        this.f2519c = pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo4694a(p174m0.C7289h r16, long r17, androidx.compose.p015ui.unit.LayoutDirection r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r19
            java.lang.String r3 = "layoutDirection"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            m0.b r3 = r0.f2518b
            float r4 = androidx.compose.material.MenuKt.f2220b
            int r3 = r3.mo3791V(r4)
            m0.b r4 = r0.f2518b
            long r5 = r0.f2517a
            float r5 = p174m0.C7285e.m13985a(r5)
            int r4 = r4.mo3791V(r5)
            m0.b r5 = r0.f2518b
            long r6 = r0.f2517a
            float r6 = p174m0.C7285e.m13986b(r6)
            int r5 = r5.mo3791V(r6)
            int r6 = r1.f16167a
            int r6 = r6 + r4
            int r7 = r1.f16169c
            int r7 = r7 - r4
            r4 = 32
            long r8 = r20 >> r4
            int r8 = (int) r8
            int r7 = r7 - r8
            long r9 = r17 >> r4
            int r4 = (int) r9
            int r9 = r4 - r8
            androidx.compose.ui.unit.LayoutDirection r10 = androidx.compose.p015ui.unit.LayoutDirection.Ltr
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r2 != r10) goto L_0x0062
            java.lang.Integer[] r2 = new java.lang.Integer[r11]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r14] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r2[r13] = r6
            int r6 = r1.f16167a
            if (r6 < 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r9 = r14
        L_0x0057:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r2[r12] = r6
            kotlin.sequences.g r2 = kotlin.sequences.C19435k.m33002l1(r2)
            goto L_0x007f
        L_0x0062:
            java.lang.Integer[] r2 = new java.lang.Integer[r11]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r2[r14] = r10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r13] = r6
            int r6 = r1.f16169c
            if (r6 > r4) goto L_0x0075
            r9 = r14
        L_0x0075:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r2[r12] = r6
            kotlin.sequences.g r2 = kotlin.sequences.C19435k.m33002l1(r2)
        L_0x007f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0083:
            boolean r6 = r2.hasNext()
            r9 = 0
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r6 = r2.next()
            r10 = r6
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 < 0) goto L_0x009c
            int r10 = r10 + r8
            if (r10 > r4) goto L_0x009c
            r10 = r13
            goto L_0x009d
        L_0x009c:
            r10 = r14
        L_0x009d:
            if (r10 == 0) goto L_0x0083
            goto L_0x00a1
        L_0x00a0:
            r6 = r9
        L_0x00a1:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x00a9
            int r7 = r6.intValue()
        L_0x00a9:
            int r2 = r1.f16170d
            int r2 = r2 + r5
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r1.f16168b
            int r4 = r4 - r5
            int r5 = p174m0.C7290i.m13995b(r20)
            int r4 = r4 - r5
            int r5 = r1.f16168b
            int r6 = p174m0.C7290i.m13995b(r20)
            int r6 = r6 / r12
            int r5 = r5 - r6
            int r6 = p174m0.C7290i.m13995b(r17)
            int r10 = p174m0.C7290i.m13995b(r20)
            int r6 = r6 - r10
            int r6 = r6 - r3
            r10 = 4
            java.lang.Integer[] r10 = new java.lang.Integer[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r14] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r10[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r10[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r10[r11] = r2
            kotlin.sequences.g r2 = kotlin.sequences.C19435k.m33002l1(r10)
            java.util.Iterator r2 = r2.iterator()
        L_0x00ed:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0112
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 < r3) goto L_0x010e
            int r10 = p174m0.C7290i.m13995b(r20)
            int r10 = r10 + r6
            int r6 = p174m0.C7290i.m13995b(r17)
            int r6 = r6 - r3
            if (r10 > r6) goto L_0x010e
            r6 = r13
            goto L_0x010f
        L_0x010e:
            r6 = r14
        L_0x010f:
            if (r6 == 0) goto L_0x00ed
            r9 = r5
        L_0x0112:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x011a
            int r4 = r9.intValue()
        L_0x011a:
            kq.p<m0.h, m0.h, kotlin.m> r2 = r0.f2519c
            m0.h r3 = new m0.h
            int r8 = r8 + r7
            int r5 = p174m0.C7290i.m13995b(r20)
            int r5 = r5 + r4
            r3.<init>(r7, r4, r8, r5)
            r2.invoke(r1, r3)
            long r1 = kotlin.reflect.C19421p.m32949o(r7, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C1209l0.mo4694a(m0.h, long, androidx.compose.ui.unit.LayoutDirection, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1209l0)) {
            return false;
        }
        C1209l0 l0Var = (C1209l0) obj;
        long j = this.f2517a;
        long j2 = l0Var.f2517a;
        int i = C7285e.f16158d;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && C19383o.m32792b(this.f2518b, l0Var.f2518b) && C19383o.m32792b(this.f2519c, l0Var.f2519c);
    }

    public final int hashCode() {
        long j = this.f2517a;
        int i = C7285e.f16158d;
        int hashCode = this.f2518b.hashCode();
        return this.f2519c.hashCode() + ((hashCode + (Long.hashCode(j) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DropdownMenuPositionProvider(contentOffset=");
        h.append(C7285e.m13987c(this.f2517a));
        h.append(", density=");
        h.append(this.f2518b);
        h.append(", onPositionCalculated=");
        h.append(this.f2519c);
        h.append(')');
        return h.toString();
    }
}
