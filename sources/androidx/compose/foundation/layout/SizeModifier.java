package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p174m0.C7280a;
import p174m0.C7284d;
import p753kq.C19857l;

public final class SizeModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final float f1434c;

    /* renamed from: d */
    public final float f1435d;

    /* renamed from: e */
    public final float f1436e;

    /* renamed from: f */
    public final float f1437f;

    /* renamed from: g */
    public final boolean f1438g;

    public SizeModifier() {
        throw null;
    }

    public SizeModifier(float f, float f2, float f3, float f4, boolean z) {
        super(InspectableValueKt.f4032a);
        this.f1434c = f;
        this.f1435d = f2;
        this.f1436e = f3;
        this.f1437f = f4;
        this.f1438g = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r5 != Integer.MAX_VALUE) goto L_0x0066;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo4000b(p174m0.C7282b r8) {
        /*
            r7 = this;
            float r0 = r7.f1436e
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = p174m0.C7284d.m13983a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L_0x0029
            float r0 = r7.f1436e
            m0.d r4 = new m0.d
            r4.<init>(r0)
            float r0 = (float) r3
            m0.d r5 = new m0.d
            r5.<init>(r0)
            int r0 = r4.compareTo(r5)
            if (r0 >= 0) goto L_0x0022
            r4 = r5
        L_0x0022:
            float r0 = r4.f16155b
            int r0 = r8.mo3791V(r0)
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            float r4 = r7.f1437f
            boolean r4 = p174m0.C7284d.m13983a(r4, r1)
            if (r4 != 0) goto L_0x004d
            float r4 = r7.f1437f
            m0.d r5 = new m0.d
            r5.<init>(r4)
            float r4 = (float) r3
            m0.d r6 = new m0.d
            r6.<init>(r4)
            int r4 = r5.compareTo(r6)
            if (r4 >= 0) goto L_0x0046
            r5 = r6
        L_0x0046:
            float r4 = r5.f16155b
            int r4 = r8.mo3791V(r4)
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            float r5 = r7.f1434c
            boolean r5 = p174m0.C7284d.m13983a(r5, r1)
            if (r5 != 0) goto L_0x0065
            float r5 = r7.f1434c
            int r5 = r8.mo3791V(r5)
            if (r5 <= r0) goto L_0x005f
            r5 = r0
        L_0x005f:
            if (r5 >= 0) goto L_0x0062
            r5 = r3
        L_0x0062:
            if (r5 == r2) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r5 = r3
        L_0x0066:
            float r6 = r7.f1435d
            boolean r1 = p174m0.C7284d.m13983a(r6, r1)
            if (r1 != 0) goto L_0x007d
            float r1 = r7.f1435d
            int r8 = r8.mo3791V(r1)
            if (r8 <= r4) goto L_0x0077
            r8 = r4
        L_0x0077:
            if (r8 >= 0) goto L_0x007a
            r8 = r3
        L_0x007a:
            if (r8 == r2) goto L_0x007d
            r3 = r8
        L_0x007d:
            long r0 = androidx.activity.C0114h.m313q(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeModifier.mo4000b(m0.b):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) obj;
        return C7284d.m13983a(this.f1434c, sizeModifier.f1434c) && C7284d.m13983a(this.f1435d, sizeModifier.f1435d) && C7284d.m13983a(this.f1436e, sizeModifier.f1436e) && C7284d.m13983a(this.f1437f, sizeModifier.f1437f) && this.f1438g == sizeModifier.f1438g;
    }

    /* renamed from: f */
    public final int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        long b = mo4000b(xVar);
        return C7280a.m13961f(b) ? C7280a.m13963h(b) : C0114h.m287R(layoutNodeWrapper.mo6664D(i), b);
    }

    public final int hashCode() {
        return C0023f.m104c(this.f1437f, C0023f.m104c(this.f1436e, C0023f.m104c(this.f1435d, Float.hashCode(this.f1434c) * 31, 31), 31), 31);
    }

    /* renamed from: r */
    public final int mo3563r(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        long b = mo4000b(xVar);
        return C7280a.m13961f(b) ? C7280a.m13963h(b) : C0114h.m287R(layoutNodeWrapper.mo6669z(i), b);
    }

    /* renamed from: s */
    public final int mo3564s(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        long b = mo4000b(xVar);
        return C7280a.m13960e(b) ? C7280a.m13962g(b) : C0114h.m286Q(layoutNodeWrapper.mo6668s(i), b);
    }

    /* renamed from: t */
    public final int mo3565t(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        long b = mo4000b(xVar);
        return C7280a.m13960e(b) ? C7280a.m13962g(b) : C0114h.m286Q(layoutNodeWrapper.mo6667i(i), b);
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        long b = mo4000b(xVar);
        if (this.f1438g) {
            j2 = C0114h.m285P(j, b);
        } else {
            if (!C7284d.m13983a(this.f1434c, Float.NaN)) {
                i = C7280a.m13965j(b);
            } else {
                i = C7280a.m13965j(j);
                int h = C7280a.m13963h(b);
                if (i > h) {
                    i = h;
                }
            }
            if (!C7284d.m13983a(this.f1436e, Float.NaN)) {
                i2 = C7280a.m13963h(b);
            } else {
                i2 = C7280a.m13963h(j);
                int j3 = C7280a.m13965j(b);
                if (i2 < j3) {
                    i2 = j3;
                }
            }
            if (!C7284d.m13983a(this.f1435d, Float.NaN)) {
                i3 = C7280a.m13964i(b);
            } else {
                i3 = C7280a.m13964i(j);
                int g = C7280a.m13962g(b);
                if (i3 > g) {
                    i3 = g;
                }
            }
            if (!C7284d.m13983a(this.f1437f, Float.NaN)) {
                i4 = C7280a.m13962g(b);
            } else {
                i4 = C7280a.m13962g(j);
                int i5 = C7280a.m13964i(b);
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            j2 = C0114h.m313q(i, i2, i3, i4);
        }
        C1686i0 J = uVar.mo6665J(j2);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new SizeModifier$measure$1(J));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
    }
}
