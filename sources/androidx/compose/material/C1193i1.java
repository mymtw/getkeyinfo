package androidx.compose.material;

import androidx.activity.C0114h;
import androidx.compose.animation.core.C0438m;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.reflect.C19421p;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8416i;

/* renamed from: androidx.compose.material.i1 */
public final class C1193i1 {

    /* renamed from: a */
    public static final float f2473a = C1190h1.f2470a;

    /* renamed from: b */
    public static final float f2474b = ((float) 240);

    /* renamed from: c */
    public static final float f2475c = ((float) 40);

    /* renamed from: d */
    public static final C0438m f2476d = new C0438m(0.2f, 0.8f);

    /* renamed from: e */
    public static final C0438m f2477e = new C0438m(0.4f, 1.0f);

    /* renamed from: f */
    public static final C0438m f2478f = new C0438m(0.0f, 0.65f);

    /* renamed from: g */
    public static final C0438m f2479g = new C0438m(0.1f, 0.45f);

    /* renamed from: h */
    public static final C0438m f2480h = new C0438m(0.4f, 0.2f);

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2326a(float r17, int r18, int r19, long r20, androidx.compose.runtime.C1302d r22, androidx.compose.p015ui.C1436d r23) {
        /*
            r5 = r18
            r0 = -392089979(0xffffffffe8a12e85, float:-6.089273E24)
            r1 = r22
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r19 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0016
            r3 = r5 | 6
            r4 = r3
            r3 = r23
            goto L_0x002a
        L_0x0016:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0027
            r3 = r23
            boolean r4 = r0.mo5408I(r3)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = r2
        L_0x0025:
            r4 = r4 | r5
            goto L_0x002a
        L_0x0027:
            r3 = r23
            r4 = r5
        L_0x002a:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r19 & 2
            if (r6 != 0) goto L_0x003d
            r6 = r20
            boolean r8 = r0.mo5434e(r6)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003d:
            r6 = r20
        L_0x003f:
            r8 = 16
        L_0x0041:
            r4 = r4 | r8
            goto L_0x0045
        L_0x0043:
            r6 = r20
        L_0x0045:
            r8 = r19 & 4
            if (r8 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r17
            boolean r10 = r0.mo5428b(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r17
        L_0x0061:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r4 != r10) goto L_0x0076
            boolean r4 = r0.mo5442i()
            if (r4 != 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            r0.mo5396C()
            r1 = r3
            r2 = r6
            r4 = r9
            goto L_0x013d
        L_0x0076:
            r0.mo5466u0()
            r4 = r5 & 1
            if (r4 == 0) goto L_0x008a
            boolean r4 = r0.mo5425Y()
            if (r4 == 0) goto L_0x0084
            goto L_0x008a
        L_0x0084:
            r0.mo5396C()
            r1 = r3
            r3 = r6
            goto L_0x00a9
        L_0x008a:
            if (r1 == 0) goto L_0x008f
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0090
        L_0x008f:
            r1 = r3
        L_0x0090:
            r3 = r19 & 2
            if (r3 == 0) goto L_0x00a1
            androidx.compose.runtime.l1 r3 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r3 = r0.mo5410J(r3)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r3 = r3.mo5359f()
            goto L_0x00a2
        L_0x00a1:
            r3 = r6
        L_0x00a2:
            if (r8 == 0) goto L_0x00a9
            float r6 = androidx.compose.material.C1190h1.f2470a
            r15 = r1
            r1 = r6
            goto L_0x00ab
        L_0x00a9:
            r15 = r1
            r1 = r9
        L_0x00ab:
            r0.mo5419S()
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r6 = r0.mo5410J(r6)
            m0.b r6 = (p174m0.C7282b) r6
            z.i r13 = new z.i
            float r8 = r6.mo3789B0(r1)
            r9 = 0
            r10 = 2
            r11 = 0
            r12 = 26
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = 0
            androidx.compose.animation.core.InfiniteTransition r12 = androidx.compose.animation.core.C0412a0.m1110c(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r6 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            androidx.compose.animation.core.l0 r9 = androidx.compose.animation.core.VectorConvertersKt.f1077b
            r6 = 6660(0x1a04, float:9.333E-42)
            androidx.compose.animation.core.s$a r11 = androidx.compose.animation.core.C0450s.C0451a.f1169a
            androidx.compose.animation.core.j0 r6 = androidx.compose.foundation.layout.C0761x.m1706Z0(r6, r14, r11, r2)
            androidx.compose.animation.core.z r10 = androidx.compose.foundation.layout.C0761x.m1727i0(r6)
            r6 = r12
            r5 = r11
            r11 = r0
            androidx.compose.animation.core.InfiniteTransition$a r11 = androidx.compose.animation.core.C0412a0.m1109b(r6, r7, r8, r9, r10, r11)
            r6 = 1133445120(0x438f0000, float:286.0)
            r7 = 1332(0x534, float:1.867E-42)
            androidx.compose.animation.core.j0 r2 = androidx.compose.foundation.layout.C0761x.m1706Z0(r7, r14, r5, r2)
            androidx.compose.animation.core.z r2 = androidx.compose.foundation.layout.C0761x.m1727i0(r2)
            androidx.compose.animation.core.InfiniteTransition$a r2 = androidx.compose.animation.core.C0412a0.m1108a(r12, r6, r2, r0)
            r5 = 1133576192(0x43910000, float:290.0)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 r6 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE
            androidx.compose.animation.core.b0 r6 = androidx.compose.foundation.layout.C0761x.m1743s0(r6)
            androidx.compose.animation.core.z r6 = androidx.compose.foundation.layout.C0761x.m1727i0(r6)
            androidx.compose.animation.core.InfiniteTransition$a r16 = androidx.compose.animation.core.C0412a0.m1108a(r12, r5, r6, r0)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2 r6 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE
            androidx.compose.animation.core.b0 r6 = androidx.compose.foundation.layout.C0761x.m1743s0(r6)
            androidx.compose.animation.core.z r6 = androidx.compose.foundation.layout.C0761x.m1727i0(r6)
            androidx.compose.animation.core.InfiniteTransition$a r5 = androidx.compose.animation.core.C0412a0.m1108a(r12, r5, r6, r0)
            androidx.compose.ui.d r6 = androidx.compose.foundation.ProgressSemanticsKt.m1313a(r15)
            float r7 = f2475c
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.SizeKt.m1492l(r6, r7)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3 r10 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
            r6 = r10
            r7 = r1
            r8 = r3
            r17 = r1
            r1 = r10
            r10 = r13
            r13 = r12
            r12 = r16
            r20 = r3
            r3 = r13
            r13 = r5
            r4 = r14
            r14 = r2
            r6.<init>(r7, r8, r10, r11, r12, r13, r14)
            androidx.compose.foundation.CanvasKt.m1294a(r3, r1, r0, r4)
            r4 = r17
            r2 = r20
            r1 = r15
        L_0x013d:
            androidx.compose.runtime.v0 r7 = r0.mo5421U()
            if (r7 != 0) goto L_0x0144
            goto L_0x0150
        L_0x0144:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4 r8 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            r0 = r8
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r4, r5, r6)
            r7.f3081d = r8
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C1193i1.m2326a(float, int, int, long, androidx.compose.runtime.d, androidx.compose.ui.d):void");
    }

    /* renamed from: b */
    public static final void m2327b(C8412e eVar, float f, float f2, long j, C8416i iVar) {
        float f3 = (float) 2;
        float f4 = iVar.f18434a / f3;
        float d = C8347f.m16656d(eVar.mo6913b()) - (f3 * f4);
        C8412e.m16781C(eVar, j, f, f2, C19421p.m32952q(f4, f4), C0114h.m319t(d, d), iVar);
    }

    /* renamed from: c */
    public static final void m2328c(C8412e eVar, float f, float f2, long j, float f3) {
        float d = C8347f.m16656d(eVar.mo6913b());
        float b = C8347f.m16654b(eVar.mo6913b()) / ((float) 2);
        boolean z = eVar.getLayoutDirection() == LayoutDirection.Ltr;
        C8412e.m16787d0(eVar, j, C19421p.m32952q((z ? f : 1.0f - f2) * d, b), C19421p.m32952q((z ? f2 : 1.0f - f) * d, b), f3, 0, 496);
    }
}
