package androidx.compose.foundation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1440b;
import androidx.compose.p015ui.draw.C1445g;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19862q;

final class BorderKt$border$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1533m $brush;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$border$2(float f, C1530k0 k0Var, C1533m mVar) {
        super(3);
        this.$width = f;
        this.$shape = k0Var;
        this.$brush = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-1498088849);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new C1754s();
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final C1754s sVar = (C1754s) v;
        final float f = this.$width;
        final C1530k0 k0Var = this.$shape;
        final C1533m mVar = this.$brush;
        C1436d i0 = dVar.mo6148i0(DrawModifierKt.m3071b(new C19857l<C1440b, C1445g>() {
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x0161, code lost:
                if (r9 != false) goto L_0x0163;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final androidx.compose.p015ui.draw.C1445g invoke(androidx.compose.p015ui.draw.C1440b r37) {
                /*
                    r36 = this;
                    r0 = r36
                    r1 = r37
                    java.lang.String r2 = "$this$drawWithCache"
                    kotlin.jvm.internal.C19383o.m32797g(r1, r2)
                    float r2 = r1
                    float r3 = r37.getDensity()
                    float r3 = r3 * r2
                    r2 = 0
                    int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                    r5 = 0
                    if (r3 < 0) goto L_0x0024
                    long r6 = r37.mo6168b()
                    float r3 = p288y.C8347f.m16655c(r6)
                    int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                    if (r3 <= 0) goto L_0x0024
                    r3 = 1
                    goto L_0x0025
                L_0x0024:
                    r3 = r5
                L_0x0025:
                    if (r3 != 0) goto L_0x002f
                    androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1 r2 = androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1.INSTANCE
                    androidx.compose.ui.draw.g r1 = r1.mo6169c(r2)
                    goto L_0x03a3
                L_0x002f:
                    float r3 = r1
                    boolean r2 = p174m0.C7284d.m13983a(r3, r2)
                    if (r2 == 0) goto L_0x003a
                    r2 = 1065353216(0x3f800000, float:1.0)
                    goto L_0x0047
                L_0x003a:
                    float r2 = r1
                    float r3 = r37.getDensity()
                    float r3 = r3 * r2
                    double r2 = (double) r3
                    double r2 = java.lang.Math.ceil(r2)
                    float r2 = (float) r2
                L_0x0047:
                    long r6 = r37.mo6168b()
                    float r3 = p288y.C8347f.m16655c(r6)
                    r6 = 2
                    float r6 = (float) r6
                    float r3 = r3 / r6
                    double r7 = (double) r3
                    double r7 = java.lang.Math.ceil(r7)
                    float r3 = (float) r7
                    float r2 = java.lang.Math.min(r2, r3)
                    float r3 = r2 / r6
                    long r14 = kotlin.reflect.C19421p.m32952q(r3, r3)
                    long r7 = r37.mo6168b()
                    float r7 = p288y.C8347f.m16656d(r7)
                    float r7 = r7 - r2
                    long r8 = r37.mo6168b()
                    float r8 = p288y.C8347f.m16654b(r8)
                    float r8 = r8 - r2
                    long r16 = androidx.activity.C0114h.m319t(r7, r8)
                    float r8 = r2 * r6
                    long r6 = r37.mo6168b()
                    float r6 = p288y.C8347f.m16655c(r6)
                    int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                    if (r6 <= 0) goto L_0x0088
                    r6 = 1
                    goto L_0x0089
                L_0x0088:
                    r6 = r5
                L_0x0089:
                    androidx.compose.ui.graphics.k0 r7 = r2
                    long r9 = r37.mo6168b()
                    androidx.compose.ui.draw.a r11 = r1.f3132b
                    androidx.compose.ui.unit.LayoutDirection r11 = r11.getLayoutDirection()
                    androidx.compose.ui.graphics.z r7 = r7.mo3864a(r9, r11, r1)
                    boolean r9 = r7 instanceof androidx.compose.p015ui.graphics.C1606z.C1607a
                    if (r9 == 0) goto L_0x02ce
                    androidx.compose.ui.node.s<androidx.compose.foundation.e> r2 = r7
                    androidx.compose.ui.graphics.m r3 = r3
                    androidx.compose.ui.graphics.z$a r7 = (androidx.compose.p015ui.graphics.C1606z.C1607a) r7
                    if (r6 == 0) goto L_0x00b0
                    androidx.compose.foundation.BorderKt$drawGenericBorder$1 r2 = new androidx.compose.foundation.BorderKt$drawGenericBorder$1
                    r2.<init>(r7, r3)
                    androidx.compose.ui.draw.g r1 = r1.mo6169c(r2)
                    goto L_0x02ca
                L_0x00b0:
                    boolean r6 = r3 instanceof androidx.compose.p015ui.graphics.C1532l0
                    if (r6 == 0) goto L_0x00de
                    r6 = r3
                    androidx.compose.ui.graphics.l0 r6 = (androidx.compose.p015ui.graphics.C1532l0) r6
                    long r10 = r6.f3331a
                    r6 = 5
                    int r12 = android.os.Build.VERSION.SDK_INT
                    r13 = 29
                    if (r12 < r13) goto L_0x00c7
                    androidx.compose.ui.graphics.k r12 = androidx.compose.p015ui.graphics.C1529k.f3326a
                    android.graphics.BlendModeColorFilter r6 = r12.mo6367a(r10, r6)
                    goto L_0x00d5
                L_0x00c7:
                    android.graphics.PorterDuffColorFilter r12 = new android.graphics.PorterDuffColorFilter
                    int r10 = p628nj.C18263b.m30859o0(r10)
                    android.graphics.PorterDuff$Mode r6 = androidx.compose.p015ui.graphics.C1489a.m3160b(r6)
                    r12.<init>(r10, r6)
                    r6 = r12
                L_0x00d5:
                    androidx.compose.ui.graphics.t r10 = new androidx.compose.ui.graphics.t
                    r10.<init>(r6)
                    r16 = r10
                    r6 = 1
                    goto L_0x00e1
                L_0x00de:
                    r6 = r5
                    r16 = 0
                L_0x00e1:
                    androidx.compose.ui.graphics.b0 r10 = r7.f3571a
                    y.d r15 = r10.getBounds()
                    T r10 = r2.f3945a
                    androidx.compose.foundation.e r10 = (androidx.compose.foundation.C0554e) r10
                    if (r10 != 0) goto L_0x00f4
                    androidx.compose.foundation.e r10 = new androidx.compose.foundation.e
                    r10.<init>(r5)
                    r2.f3945a = r10
                L_0x00f4:
                    androidx.compose.ui.graphics.b0 r2 = r10.f1303d
                    if (r2 != 0) goto L_0x00fe
                    androidx.compose.ui.graphics.g r2 = p628nj.C18263b.m30838d()
                    r10.f1303d = r2
                L_0x00fe:
                    r2.reset()
                    r2.mo6284k(r15)
                    androidx.compose.ui.graphics.b0 r11 = r7.f3571a
                    r2.mo6283j(r2, r11, r5)
                    kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
                    r14.<init>()
                    float r11 = r15.f18303c
                    float r12 = r15.f18301a
                    float r11 = r11 - r12
                    double r11 = (double) r11
                    double r11 = java.lang.Math.ceil(r11)
                    float r11 = (float) r11
                    int r11 = (int) r11
                    float r12 = r15.f18304d
                    float r13 = r15.f18302b
                    float r12 = r12 - r13
                    double r12 = (double) r12
                    double r12 = java.lang.Math.ceil(r12)
                    float r12 = (float) r12
                    int r12 = (int) r12
                    long r17 = androidx.compose.foundation.layout.C0761x.m1707a(r11, r12)
                    androidx.compose.ui.graphics.x r11 = r10.f1300a
                    androidx.compose.ui.graphics.o r12 = r10.f1301b
                    if (r11 == 0) goto L_0x013a
                    int r13 = r11.mo6320b()
                    androidx.compose.ui.graphics.y r9 = new androidx.compose.ui.graphics.y
                    r9.<init>(r13)
                    goto L_0x013b
                L_0x013a:
                    r9 = 0
                L_0x013b:
                    if (r9 != 0) goto L_0x013e
                    goto L_0x0144
                L_0x013e:
                    int r9 = r9.f3570a
                    if (r9 != 0) goto L_0x0144
                    r9 = 1
                    goto L_0x0145
                L_0x0144:
                    r9 = r5
                L_0x0145:
                    if (r9 != 0) goto L_0x0163
                    if (r11 == 0) goto L_0x0154
                    int r9 = r11.mo6320b()
                    androidx.compose.ui.graphics.y r13 = new androidx.compose.ui.graphics.y
                    r13.<init>(r9)
                    r9 = r13
                    goto L_0x0155
                L_0x0154:
                    r9 = 0
                L_0x0155:
                    boolean r13 = r9 instanceof androidx.compose.p015ui.graphics.C1605y
                    if (r13 != 0) goto L_0x015b
                L_0x0159:
                    r9 = r5
                    goto L_0x0161
                L_0x015b:
                    int r9 = r9.f3570a
                    if (r6 == r9) goto L_0x0160
                    goto L_0x0159
                L_0x0160:
                    r9 = 1
                L_0x0161:
                    if (r9 == 0) goto L_0x0164
                L_0x0163:
                    r5 = 1
                L_0x0164:
                    if (r11 == 0) goto L_0x018c
                    if (r12 == 0) goto L_0x018c
                    long r19 = r37.mo6168b()
                    float r9 = p288y.C8347f.m16656d(r19)
                    int r13 = r11.getWidth()
                    float r13 = (float) r13
                    int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                    if (r9 > 0) goto L_0x018c
                    long r19 = r37.mo6168b()
                    float r9 = p288y.C8347f.m16654b(r19)
                    int r13 = r11.getHeight()
                    float r13 = (float) r13
                    int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                    if (r9 > 0) goto L_0x018c
                    if (r5 != 0) goto L_0x01a3
                L_0x018c:
                    r5 = 32
                    long r11 = r17 >> r5
                    int r5 = (int) r11
                    int r9 = p174m0.C7290i.m13995b(r17)
                    r11 = 24
                    androidx.compose.ui.graphics.d r11 = kotlin.reflect.C19421p.m32947n(r5, r9, r6, r11)
                    r10.f1300a = r11
                    androidx.compose.ui.graphics.b r12 = kotlin.jvm.internal.C19382n.m32742d(r11)
                    r10.f1301b = r12
                L_0x01a3:
                    r5 = r11
                    r6 = r12
                    z.a r9 = r10.f1302c
                    if (r9 != 0) goto L_0x01b0
                    z.a r9 = new z.a
                    r9.<init>()
                    r10.f1302c = r9
                L_0x01b0:
                    r13 = r9
                    long r9 = androidx.compose.foundation.layout.C0761x.m1698V0(r17)
                    androidx.compose.ui.draw.a r11 = r1.f3132b
                    androidx.compose.ui.unit.LayoutDirection r11 = r11.getLayoutDirection()
                    z.a$a r12 = r13.f18422b
                    m0.b r4 = r12.f18426a
                    r28 = r14
                    androidx.compose.ui.unit.LayoutDirection r14 = r12.f18427b
                    r29 = r14
                    androidx.compose.ui.graphics.o r14 = r12.f18428c
                    r31 = r14
                    r30 = r15
                    long r14 = r12.f18429d
                    r12.f18426a = r1
                    r12.mo20987a(r11)
                    r12.f18428c = r6
                    r12.f18429d = r9
                    r6.mo6264r()
                    long r20 = androidx.compose.p015ui.graphics.C1545s.f3357b
                    r22 = 0
                    r26 = 0
                    r27 = 58
                    r19 = r13
                    r24 = r9
                    p297z.C8412e.m16785N(r19, r20, r22, r24, r26, r27)
                    r12 = r30
                    float r9 = r12.f18301a
                    float r11 = -r9
                    float r9 = r12.f18302b
                    float r10 = -r9
                    z.a$b r9 = r13.f18423c
                    z.b r9 = r9.f18430a
                    r9.mo21000g(r11, r10)
                    androidx.compose.ui.graphics.b0 r9 = r7.f3571a
                    r19 = 0
                    z.i r20 = new z.i
                    r21 = 0
                    r22 = 0
                    r23 = 30
                    r24 = 0
                    r7 = r20
                    r25 = r9
                    r9 = r21
                    r32 = r10
                    r10 = r22
                    r33 = r11
                    r11 = r24
                    r21 = r12
                    r12 = r23
                    r7.<init>(r8, r9, r10, r11, r12)
                    r7 = 52
                    r9 = r13
                    r10 = r25
                    r11 = r3
                    r12 = r19
                    r8 = r13
                    r13 = r20
                    r34 = r14
                    r15 = r28
                    r0 = r29
                    r1 = r31
                    r14 = r7
                    p297z.C8412e.m16784J0(r9, r10, r11, r12, r13, r14)
                    long r9 = r8.mo6913b()
                    float r7 = p288y.C8347f.m16656d(r9)
                    r9 = 1
                    float r9 = (float) r9
                    float r7 = r7 + r9
                    long r10 = r8.mo6913b()
                    float r10 = p288y.C8347f.m16656d(r10)
                    float r7 = r7 / r10
                    long r10 = r8.mo6913b()
                    float r10 = p288y.C8347f.m16654b(r10)
                    float r10 = r10 + r9
                    long r11 = r8.mo6913b()
                    float r9 = p288y.C8347f.m16654b(r11)
                    float r10 = r10 / r9
                    long r11 = r8.mo6907K0()
                    z.a$b r14 = r8.f18423c
                    r29 = r0
                    r31 = r1
                    long r0 = r14.mo20992b()
                    androidx.compose.ui.graphics.o r9 = r14.mo20991a()
                    r9.mo6264r()
                    z.b r9 = r14.f18430a
                    r9.mo20998e(r7, r11, r10)
                    r12 = 0
                    r13 = 0
                    r7 = 28
                    r9 = r8
                    r10 = r2
                    r11 = r3
                    r2 = r14
                    r14 = r7
                    p297z.C8412e.m16784J0(r9, r10, r11, r12, r13, r14)
                    androidx.compose.ui.graphics.o r3 = r2.mo20991a()
                    r3.mo6261m()
                    r2.mo20993c(r0)
                    z.a$b r0 = r8.f18423c
                    z.b r0 = r0.f18430a
                    r1 = r33
                    float r1 = -r1
                    r2 = r32
                    float r2 = -r2
                    r0.mo21000g(r1, r2)
                    r6.mo6261m()
                    z.a$a r0 = r8.f18422b
                    r0.getClass()
                    java.lang.String r1 = "<set-?>"
                    kotlin.jvm.internal.C19383o.m32797g(r4, r1)
                    r0.f18426a = r4
                    r2 = r29
                    r0.mo20987a(r2)
                    r2 = r31
                    kotlin.jvm.internal.C19383o.m32797g(r2, r1)
                    r0.f18428c = r2
                    r1 = r34
                    r0.f18429d = r1
                    r5.mo6319a()
                    r15.element = r5
                    androidx.compose.foundation.BorderKt$drawGenericBorder$3 r0 = new androidx.compose.foundation.BorderKt$drawGenericBorder$3
                    r11 = r0
                    r12 = r21
                    r13 = r15
                    r14 = r17
                    r11.<init>(r12, r13, r14, r16)
                    r1 = r37
                    androidx.compose.ui.draw.g r0 = r1.mo6169c(r0)
                    r1 = r0
                L_0x02ca:
                    r0 = r36
                    goto L_0x03a3
                L_0x02ce:
                    boolean r0 = r7 instanceof androidx.compose.p015ui.graphics.C1606z.C1609c
                    if (r0 == 0) goto L_0x0370
                    r0 = r36
                    androidx.compose.ui.node.s<androidx.compose.foundation.e> r4 = r7
                    androidx.compose.ui.graphics.m r13 = r3
                    androidx.compose.ui.graphics.z$c r7 = (androidx.compose.p015ui.graphics.C1606z.C1609c) r7
                    y.e r8 = r7.f3573a
                    boolean r8 = androidx.compose.foundation.layout.C0761x.m1740q0(r8)
                    if (r8 == 0) goto L_0x0305
                    y.e r4 = r7.f3573a
                    long r4 = r4.f18309e
                    z.i r18 = new z.i
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 30
                    r7 = r18
                    r8 = r2
                    r7.<init>(r8, r9, r10, r11, r12)
                    androidx.compose.foundation.BorderKt$drawRoundRectBorder$1 r12 = new androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
                    r7 = r12
                    r8 = r6
                    r9 = r13
                    r10 = r4
                    r4 = r12
                    r12 = r3
                    r13 = r2
                    r7.<init>(r8, r9, r10, r12, r13, r14, r16, r18)
                    androidx.compose.ui.draw.g r1 = r1.mo6169c(r4)
                    goto L_0x03a3
                L_0x0305:
                    T r3 = r4.f3945a
                    androidx.compose.foundation.e r3 = (androidx.compose.foundation.C0554e) r3
                    if (r3 != 0) goto L_0x0312
                    androidx.compose.foundation.e r3 = new androidx.compose.foundation.e
                    r3.<init>(r5)
                    r4.f3945a = r3
                L_0x0312:
                    androidx.compose.ui.graphics.b0 r4 = r3.f1303d
                    if (r4 != 0) goto L_0x031c
                    androidx.compose.ui.graphics.g r4 = p628nj.C18263b.m30838d()
                    r3.f1303d = r4
                L_0x031c:
                    y.e r3 = r7.f3573a
                    r4.reset()
                    r4.mo6277d(r3)
                    if (r6 != 0) goto L_0x0365
                    androidx.compose.ui.graphics.g r6 = p628nj.C18263b.m30838d()
                    float r7 = r3.f18307c
                    float r8 = r3.f18305a
                    float r7 = r7 - r8
                    float r10 = r7 - r2
                    float r7 = r3.f18308d
                    float r8 = r3.f18306b
                    float r7 = r7 - r8
                    float r11 = r7 - r2
                    long r7 = r3.f18309e
                    long r14 = androidx.compose.foundation.C0555f.m1344c(r7, r2)
                    long r7 = r3.f18310f
                    long r16 = androidx.compose.foundation.C0555f.m1344c(r7, r2)
                    long r7 = r3.f18312h
                    long r18 = androidx.compose.foundation.C0555f.m1344c(r7, r2)
                    long r7 = r3.f18311g
                    long r20 = androidx.compose.foundation.C0555f.m1344c(r7, r2)
                    y.e r3 = new y.e
                    r7 = r3
                    r8 = r2
                    r9 = r2
                    r2 = r13
                    r12 = r14
                    r14 = r16
                    r16 = r20
                    r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
                    r6.mo6277d(r3)
                    r4.mo6283j(r4, r6, r5)
                    goto L_0x0366
                L_0x0365:
                    r2 = r13
                L_0x0366:
                    androidx.compose.foundation.BorderKt$drawRoundRectBorder$2 r3 = new androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                    r3.<init>(r4, r2)
                    androidx.compose.ui.draw.g r1 = r1.mo6169c(r3)
                    goto L_0x03a3
                L_0x0370:
                    r0 = r36
                    boolean r3 = r7 instanceof androidx.compose.p015ui.graphics.C1606z.C1608b
                    if (r3 == 0) goto L_0x03a4
                    androidx.compose.ui.graphics.m r3 = r3
                    if (r6 == 0) goto L_0x037c
                    long r14 = p288y.C8343c.f18295b
                L_0x037c:
                    if (r6 == 0) goto L_0x0382
                    long r16 = r37.mo6168b()
                L_0x0382:
                    if (r6 == 0) goto L_0x0388
                    z.h r2 = p297z.C8415h.f18433a
                    r13 = r2
                    goto L_0x0395
                L_0x0388:
                    z.i r4 = new z.i
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 30
                    r7 = r4
                    r8 = r2
                    r7.<init>(r8, r9, r10, r11, r12)
                    r13 = r4
                L_0x0395:
                    androidx.compose.foundation.BorderKt$drawRectBorder$1 r2 = new androidx.compose.foundation.BorderKt$drawRectBorder$1
                    r7 = r2
                    r8 = r3
                    r9 = r14
                    r11 = r16
                    r7.<init>(r8, r9, r11, r13)
                    androidx.compose.ui.draw.g r1 = r1.mo6169c(r2)
                L_0x03a3:
                    return r1
                L_0x03a4:
                    kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                    r1.<init>()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt$border$2.C04941.invoke(androidx.compose.ui.draw.b):androidx.compose.ui.draw.g");
            }
        }));
        dVar2.mo5406H();
        return i0;
    }
}
