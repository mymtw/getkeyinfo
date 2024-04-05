package androidx.compose.p015ui.draw;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p173m.C7279a;
import p174m0.C7280a;
import p288y.C8347f;

/* renamed from: androidx.compose.ui.draw.PainterModifier */
public final class PainterModifier extends C1862p0 implements C1702p, C1444f {

    /* renamed from: c */
    public final Painter f3126c;

    /* renamed from: d */
    public final boolean f3127d;

    /* renamed from: e */
    public final C1428a f3128e;

    /* renamed from: f */
    public final C1670c f3129f;

    /* renamed from: g */
    public final float f3130g;

    /* renamed from: h */
    public final C1546t f3131h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PainterModifier(androidx.compose.p015ui.graphics.painter.Painter r3, boolean r4, androidx.compose.p015ui.C1428a r5, androidx.compose.p015ui.layout.C1670c r6, float r7, androidx.compose.p015ui.graphics.C1546t r8) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "painter"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3126c = r3
            r2.f3127d = r4
            r2.f3128e = r5
            r2.f3129f = r6
            r2.f3130g = r7
            r2.f3131h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.draw.PainterModifier.<init>(androidx.compose.ui.graphics.painter.Painter, boolean, androidx.compose.ui.a, androidx.compose.ui.layout.c, float, androidx.compose.ui.graphics.t):void");
    }

    /* renamed from: d */
    public static boolean m3073d(long j) {
        if (!C8347f.m16653a(j, C8347f.f18314c)) {
            float b = C8347f.m16654b(j);
            if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m3074e(long j) {
        if (!C8347f.m16653a(j, C8347f.f18314c)) {
            float d = C8347f.m16656d(j);
            if (!Float.isInfinite(d) && !Float.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a2  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3715P(androidx.compose.p015ui.node.C1741h r13) {
        /*
            r12 = this;
            androidx.compose.ui.graphics.painter.Painter r0 = r12.f3126c
            long r0 = r0.mo6390c()
            boolean r2 = m3074e(r0)
            if (r2 == 0) goto L_0x0011
            float r2 = p288y.C8347f.m16656d(r0)
            goto L_0x0019
        L_0x0011:
            long r2 = r13.mo6913b()
            float r2 = p288y.C8347f.m16656d(r2)
        L_0x0019:
            boolean r3 = m3073d(r0)
            if (r3 == 0) goto L_0x0024
            float r0 = p288y.C8347f.m16654b(r0)
            goto L_0x002c
        L_0x0024:
            long r0 = r13.mo6913b()
            float r0 = p288y.C8347f.m16654b(r0)
        L_0x002c:
            long r0 = androidx.activity.C0114h.m319t(r2, r0)
            long r2 = r13.mo6913b()
            float r2 = p288y.C8347f.m16656d(r2)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0041
            r2 = r4
            goto L_0x0042
        L_0x0041:
            r2 = r5
        L_0x0042:
            if (r2 != 0) goto L_0x0064
            long r6 = r13.mo6913b()
            float r2 = p288y.C8347f.m16654b(r6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0052
            r2 = r4
            goto L_0x0053
        L_0x0052:
            r2 = r5
        L_0x0053:
            if (r2 != 0) goto L_0x0064
            androidx.compose.ui.layout.c r2 = r12.f3129f
            long r6 = r13.mo6913b()
            long r6 = r2.mo6663a(r0, r6)
            long r0 = p001a0.C0005b.m54p0(r0, r6)
            goto L_0x0066
        L_0x0064:
            long r0 = p288y.C8347f.f18313b
        L_0x0066:
            androidx.compose.ui.a r6 = r12.f3128e
            float r2 = p288y.C8347f.m16656d(r0)
            int r2 = p173m.C7279a.m13954l(r2)
            float r7 = p288y.C8347f.m16654b(r0)
            int r7 = p173m.C7279a.m13954l(r7)
            long r7 = androidx.compose.foundation.layout.C0761x.m1707a(r2, r7)
            long r9 = r13.mo6913b()
            float r2 = p288y.C8347f.m16656d(r9)
            int r2 = p173m.C7279a.m13954l(r2)
            long r9 = r13.mo6913b()
            float r9 = p288y.C8347f.m16654b(r9)
            int r9 = p173m.C7279a.m13954l(r9)
            long r9 = androidx.compose.foundation.layout.C0761x.m1707a(r2, r9)
            androidx.compose.ui.unit.LayoutDirection r11 = r13.getLayoutDirection()
            long r6 = r6.mo6133a(r7, r9, r11)
            r2 = 32
            long r8 = r6 >> r2
            int r2 = (int) r8
            float r2 = (float) r2
            int r6 = p174m0.C7287g.m13992b(r6)
            float r6 = (float) r6
            z.a r7 = r13.f3917b
            z.a$b r7 = r7.f18423c
            z.b r7 = r7.f18430a
            r7.mo21000g(r2, r6)
            androidx.compose.ui.graphics.painter.Painter r7 = r12.f3126c
            float r8 = r12.f3130g
            androidx.compose.ui.graphics.t r9 = r12.f3131h
            r7.getClass()
            float r10 = r7.f3343d
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00c5
            r10 = r4
            goto L_0x00c6
        L_0x00c5:
            r10 = r5
        L_0x00c6:
            if (r10 != 0) goto L_0x00f6
            boolean r10 = r7.mo6388a(r8)
            if (r10 != 0) goto L_0x00f4
            r10 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x00d6
            r10 = r4
            goto L_0x00d7
        L_0x00d6:
            r10 = r5
        L_0x00d7:
            if (r10 == 0) goto L_0x00e4
            androidx.compose.ui.graphics.e r10 = r7.f3340a
            if (r10 != 0) goto L_0x00de
            goto L_0x00e1
        L_0x00de:
            r10.setAlpha(r8)
        L_0x00e1:
            r7.f3341b = r5
            goto L_0x00f4
        L_0x00e4:
            androidx.compose.ui.graphics.e r10 = r7.f3340a
            if (r10 != 0) goto L_0x00ef
            androidx.compose.ui.graphics.e r10 = new androidx.compose.ui.graphics.e
            r10.<init>()
            r7.f3340a = r10
        L_0x00ef:
            r10.setAlpha(r8)
            r7.f3341b = r4
        L_0x00f4:
            r7.f3343d = r8
        L_0x00f6:
            androidx.compose.ui.graphics.t r10 = r7.f3342c
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r9)
            if (r10 != 0) goto L_0x0124
            boolean r10 = r7.mo6389b(r9)
            if (r10 != 0) goto L_0x0122
            if (r9 != 0) goto L_0x0112
            androidx.compose.ui.graphics.e r4 = r7.f3340a
            if (r4 != 0) goto L_0x010b
            goto L_0x010f
        L_0x010b:
            r10 = 0
            r4.mo6247j(r10)
        L_0x010f:
            r7.f3341b = r5
            goto L_0x0122
        L_0x0112:
            androidx.compose.ui.graphics.e r5 = r7.f3340a
            if (r5 != 0) goto L_0x011d
            androidx.compose.ui.graphics.e r5 = new androidx.compose.ui.graphics.e
            r5.<init>()
            r7.f3340a = r5
        L_0x011d:
            r5.mo6247j(r9)
            r7.f3341b = r4
        L_0x0122:
            r7.f3342c = r9
        L_0x0124:
            androidx.compose.ui.unit.LayoutDirection r4 = r13.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r5 = r7.f3344e
            if (r5 == r4) goto L_0x0133
            java.lang.String r5 = "layoutDirection"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            r7.f3344e = r4
        L_0x0133:
            long r4 = r13.mo6913b()
            float r4 = p288y.C8347f.m16656d(r4)
            float r5 = p288y.C8347f.m16656d(r0)
            float r4 = r4 - r5
            long r9 = r13.mo6913b()
            float r5 = p288y.C8347f.m16654b(r9)
            float r9 = p288y.C8347f.m16654b(r0)
            float r5 = r5 - r9
            z.a r9 = r13.f3917b
            z.a$b r9 = r9.f18423c
            z.b r9 = r9.f18430a
            r9.mo20996c(r3, r3, r4, r5)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x01a5
            float r8 = p288y.C8347f.m16656d(r0)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x01a5
            float r8 = p288y.C8347f.m16654b(r0)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a5
            boolean r3 = r7.f3341b
            if (r3 == 0) goto L_0x01a2
            long r8 = p288y.C8343c.f18295b
            float r3 = p288y.C8347f.m16656d(r0)
            float r0 = p288y.C8347f.m16654b(r0)
            long r0 = androidx.activity.C0114h.m319t(r3, r0)
            y.d r0 = p001a0.C0005b.m40h(r8, r0)
            z.a r1 = r13.f3917b
            z.a$b r1 = r1.f18423c
            androidx.compose.ui.graphics.o r1 = r1.mo20991a()
            androidx.compose.ui.graphics.e r3 = r7.f3340a
            if (r3 != 0) goto L_0x0193
            androidx.compose.ui.graphics.e r3 = new androidx.compose.ui.graphics.e
            r3.<init>()
            r7.f3340a = r3
        L_0x0193:
            r1.mo6250a(r0, r3)     // Catch:{ all -> 0x019d }
            r7.mo6391d(r13)     // Catch:{ all -> 0x019d }
            r1.mo6261m()
            goto L_0x01a5
        L_0x019d:
            r13 = move-exception
            r1.mo6261m()
            throw r13
        L_0x01a2:
            r7.mo6391d(r13)
        L_0x01a5:
            z.a r0 = r13.f3917b
            z.a$b r0 = r0.f18423c
            z.b r0 = r0.f18430a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            float r3 = -r4
            float r4 = -r5
            r0.mo20996c(r1, r1, r3, r4)
            z.a r0 = r13.f3917b
            z.a$b r0 = r0.f18423c
            z.b r0 = r0.f18430a
            float r1 = -r2
            float r2 = -r6
            r0.mo21000g(r1, r2)
            r13.mo6911O0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.draw.PainterModifier.mo3715P(androidx.compose.ui.node.h):void");
    }

    /* renamed from: b */
    public final boolean mo6156b() {
        if (this.f3127d) {
            long c = this.f3126c.mo6390c();
            int i = C8347f.f18315d;
            if (c != C8347f.f18314c) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        PainterModifier painterModifier = obj instanceof PainterModifier ? (PainterModifier) obj : null;
        if (painterModifier == null || !C19383o.m32792b(this.f3126c, painterModifier.f3126c) || this.f3127d != painterModifier.f3127d || !C19383o.m32792b(this.f3128e, painterModifier.f3128e) || !C19383o.m32792b(this.f3129f, painterModifier.f3129f)) {
            return false;
        }
        return ((this.f3130g > painterModifier.f3130g ? 1 : (this.f3130g == painterModifier.f3130g ? 0 : -1)) == 0) && C19383o.m32792b(this.f3131h, painterModifier.f3131h);
    }

    /* renamed from: f */
    public final int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        if (!mo6156b()) {
            return layoutNodeWrapper.mo6664D(i);
        }
        long g = mo6158g(C0114h.m315r(0, i, 7));
        return Math.max(C7280a.m13965j(g), layoutNodeWrapper.mo6664D(i));
    }

    /* renamed from: g */
    public final long mo6158g(long j) {
        boolean z = true;
        boolean z2 = C7280a.m13959d(j) && C7280a.m13958c(j);
        boolean z3 = C7280a.m13961f(j) && C7280a.m13960e(j);
        if ((mo6156b() || !z2) && !z3) {
            long c = this.f3126c.mo6390c();
            long t = C0114h.m319t((float) C0114h.m287R(m3074e(c) ? C7279a.m13954l(C8347f.m16656d(c)) : C7280a.m13965j(j), j), (float) C0114h.m286Q(m3073d(c) ? C7279a.m13954l(C8347f.m16654b(c)) : C7280a.m13964i(j), j));
            if (mo6156b()) {
                long t2 = C0114h.m319t(!m3074e(this.f3126c.mo6390c()) ? C8347f.m16656d(t) : C8347f.m16656d(this.f3126c.mo6390c()), !m3073d(this.f3126c.mo6390c()) ? C8347f.m16654b(t) : C8347f.m16654b(this.f3126c.mo6390c()));
                if (!(C8347f.m16656d(t) == 0.0f)) {
                    if (C8347f.m16654b(t) != 0.0f) {
                        z = false;
                    }
                    if (!z) {
                        t = C0005b.m54p0(t2, this.f3129f.mo6663a(t2, t));
                    }
                }
                t = C8347f.f18313b;
            }
            return C7280a.m13956a(j, C0114h.m287R(C7279a.m13954l(C8347f.m16656d(t)), j), 0, C0114h.m286Q(C7279a.m13954l(C8347f.m16654b(t)), j), 0, 10);
        }
        return C7280a.m13956a(j, C7280a.m13963h(j), 0, C7280a.m13962g(j), 0, 10);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f3127d);
        int hashCode2 = this.f3128e.hashCode();
        int c = C0023f.m104c(this.f3130g, (this.f3129f.hashCode() + ((hashCode2 + ((hashCode + (this.f3126c.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        C1546t tVar = this.f3131h;
        return c + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: r */
    public final int mo3563r(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        if (!mo6156b()) {
            return layoutNodeWrapper.mo6669z(i);
        }
        long g = mo6158g(C0114h.m315r(0, i, 7));
        return Math.max(C7280a.m13965j(g), layoutNodeWrapper.mo6669z(i));
    }

    /* renamed from: s */
    public final int mo3564s(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        if (!mo6156b()) {
            return layoutNodeWrapper.mo6668s(i);
        }
        long g = mo6158g(C0114h.m315r(i, 0, 13));
        return Math.max(C7280a.m13964i(g), layoutNodeWrapper.mo6668s(i));
    }

    /* renamed from: t */
    public final int mo3565t(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        if (!mo6156b()) {
            return layoutNodeWrapper.mo6667i(i);
        }
        long g = mo6158g(C0114h.m315r(i, 0, 13));
        return Math.max(C7280a.m13964i(g), layoutNodeWrapper.mo6667i(i));
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PainterModifier(painter=");
        h.append(this.f3126c);
        h.append(", sizeToIntrinsics=");
        h.append(this.f3127d);
        h.append(", alignment=");
        h.append(this.f3128e);
        h.append(", alpha=");
        h.append(this.f3130g);
        h.append(", colorFilter=");
        h.append(this.f3131h);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(mo6158g(j));
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new PainterModifier$measure$1(J));
    }
}
