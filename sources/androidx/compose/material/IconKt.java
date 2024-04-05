package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.vector.C1553c;
import androidx.compose.p015ui.graphics.vector.VectorPainterKt;
import androidx.compose.runtime.C1302d;

public final class IconKt {

    /* renamed from: a */
    public static final C1436d f2214a = SizeKt.m1492l(C1436d.C1437a.f3125b, (float) 24);

    static {
        int i = C1436d.f3124a0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2185a(androidx.compose.p015ui.graphics.painter.Painter r15, java.lang.String r16, androidx.compose.p015ui.C1436d r17, long r18, androidx.compose.runtime.C1302d r20, int r21, int r22) {
        /*
            r2 = r16
            java.lang.String r0 = "painter"
            r1 = r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = -1142959010(0xffffffffbbdfd45e, float:-0.006830736)
            r3 = r20
            androidx.compose.runtime.ComposerImpl r0 = r3.mo5440h(r0)
            r3 = r22 & 4
            if (r3 == 0) goto L_0x0019
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r10 = r3
            goto L_0x001b
        L_0x0019:
            r10 = r17
        L_0x001b:
            r3 = r22 & 8
            if (r3 == 0) goto L_0x003b
            androidx.compose.runtime.t r3 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r3 = r0.mo5410J(r3)
            androidx.compose.ui.graphics.s r3 = (androidx.compose.p015ui.graphics.C1545s) r3
            long r3 = r3.f3366a
            androidx.compose.runtime.t r5 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Object r5 = r0.mo5410J(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r5)
            r11 = r3
            goto L_0x003d
        L_0x003b:
            r11 = r18
        L_0x003d:
            long r3 = androidx.compose.p015ui.graphics.C1545s.f3364i
            boolean r3 = androidx.compose.p015ui.graphics.C1545s.m3357c(r11, r3)
            if (r3 == 0) goto L_0x0048
            r3 = 0
            r8 = r3
            goto L_0x006a
        L_0x0048:
            r3 = 5
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x0056
            androidx.compose.ui.graphics.k r4 = androidx.compose.p015ui.graphics.C1529k.f3326a
            android.graphics.BlendModeColorFilter r3 = r4.mo6367a(r11, r3)
            goto L_0x0064
        L_0x0056:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            int r5 = p628nj.C18263b.m30859o0(r11)
            android.graphics.PorterDuff$Mode r3 = androidx.compose.p015ui.graphics.C1489a.m3160b(r3)
            r4.<init>(r5, r3)
            r3 = r4
        L_0x0064:
            androidx.compose.ui.graphics.t r4 = new androidx.compose.ui.graphics.t
            r4.<init>(r3)
            r8 = r4
        L_0x006a:
            r3 = 1547385429(0x5c3b3a55, float:2.1079983E17)
            r0.mo5465u(r3)
            r13 = 0
            if (r2 == 0) goto L_0x009b
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r4 = 1157296644(0x44faf204, float:2007.563)
            r0.mo5465u(r4)
            boolean r4 = r0.mo5408I(r2)
            java.lang.Object r5 = r0.mo5431c0()
            if (r4 != 0) goto L_0x0089
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r4) goto L_0x0091
        L_0x0089:
            androidx.compose.material.IconKt$Icon$semantics$1$1 r5 = new androidx.compose.material.IconKt$Icon$semantics$1$1
            r5.<init>(r2)
            r0.mo5407H0(r5)
        L_0x0091:
            r0.mo5418R(r13)
            kq.l r5 = (p753kq.C19857l) r5
            androidx.compose.ui.d r3 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r3, r13, r5)
            goto L_0x009d
        L_0x009b:
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x009d:
            r14 = r3
            r0.mo5418R(r13)
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r10, r3)
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r3 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            long r3 = r15.mo6390c()
            long r5 = p288y.C8347f.f18314c
            boolean r3 = p288y.C8347f.m16653a(r3, r5)
            if (r3 != 0) goto L_0x00d5
            long r3 = r15.mo6390c()
            float r5 = p288y.C8347f.m16656d(r3)
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x00ce
            float r3 = p288y.C8347f.m16654b(r3)
            boolean r3 = java.lang.Float.isInfinite(r3)
            if (r3 == 0) goto L_0x00ce
            r3 = 1
            goto L_0x00cf
        L_0x00ce:
            r3 = r13
        L_0x00cf:
            if (r3 == 0) goto L_0x00d2
            goto L_0x00d5
        L_0x00d2:
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x00d7
        L_0x00d5:
            androidx.compose.ui.d r3 = f2214a
        L_0x00d7:
            androidx.compose.ui.d r3 = r10.mo6148i0(r3)
            androidx.compose.ui.layout.c$a$a r6 = androidx.compose.p015ui.layout.C1670c.C1671a.f3712a
            r5 = 0
            r7 = 0
            r9 = 22
            r4 = r15
            androidx.compose.ui.d r3 = kotlin.jvm.internal.C19382n.m32772t0(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.d r3 = r3.mo6148i0(r14)
            androidx.compose.foundation.layout.BoxKt.m1455a(r3, r0, r13)
            androidx.compose.runtime.v0 r8 = r0.mo5421U()
            if (r8 != 0) goto L_0x00f4
            goto L_0x0105
        L_0x00f4:
            androidx.compose.material.IconKt$Icon$1 r9 = new androidx.compose.material.IconKt$Icon$1
            r0 = r9
            r1 = r15
            r2 = r16
            r3 = r10
            r4 = r11
            r6 = r21
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.f3081d = r9
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconKt.m2185a(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.d, long, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: b */
    public static final void m2186b(C1553c cVar, String str, C1436d dVar, long j, C1302d dVar2, int i, int i2) {
        dVar2.mo5465u(-800853103);
        if ((i2 & 4) != 0) {
            dVar = C1436d.C1437a.f3125b;
        }
        C1436d dVar3 = dVar;
        if ((i2 & 8) != 0) {
            j = C1545s.m3356b(((C1545s) dVar2.mo5410J(ContentColorKt.f2199a)).f3366a, ((Number) dVar2.mo5410J(ContentAlphaKt.f2198a)).floatValue());
        }
        m2185a(VectorPainterKt.m3393b(cVar, dVar2), str, dVar3, j, dVar2, (i & 112) | 8 | (i & 896) | (i & 7168), 0);
        dVar2.mo5406H();
    }
}
