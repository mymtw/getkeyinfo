package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7280a;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;

final class BackdropScaffoldKt$BackdropScaffold$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $backLayer;
    public final /* synthetic */ C19857l<C7280a, C7280a> $calculateBackLayerConstraints;
    public final /* synthetic */ long $frontLayerBackgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $frontLayerContent;
    public final /* synthetic */ long $frontLayerContentColor;
    public final /* synthetic */ float $frontLayerElevation;
    public final /* synthetic */ long $frontLayerScrimColor;
    public final /* synthetic */ C1530k0 $frontLayerShape;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ float $headerHeight;
    public final /* synthetic */ float $headerHeightPx;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $peekHeight;
    public final /* synthetic */ float $peekHeightPx;
    public final /* synthetic */ C1175d $scaffoldState;
    public final /* synthetic */ C19862q<C1254t1, C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19857l<? super C7280a, C7280a> lVar, float f, boolean z, boolean z2, C1175d dVar2, float f2, int i, C1530k0 k0Var, long j, long j2, float f3, int i2, float f4, float f5, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, long j3, C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(2);
        this.$modifier = dVar;
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$headerHeightPx = f;
        this.$stickyFrontLayer = z;
        this.$gesturesEnabled = z2;
        this.$scaffoldState = dVar2;
        this.$peekHeightPx = f2;
        this.$$dirty = i;
        this.$frontLayerShape = k0Var;
        this.$frontLayerBackgroundColor = j;
        this.$frontLayerContentColor = j2;
        this.$frontLayerElevation = f3;
        this.$$dirty1 = i2;
        this.$headerHeight = f4;
        this.$peekHeight = f5;
        this.$frontLayerContent = pVar2;
        this.$frontLayerScrimColor = j3;
        this.$snackbarHost = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            dVar2.mo5465u(773894976);
            dVar2.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            if (v == C1302d.C1303a.f2828a) {
                C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
                dVar2.mo5454o(mVar);
                v = mVar;
            }
            dVar.mo5406H();
            final C19525d0 d0Var = ((C1346m) v).f2939b;
            dVar.mo5406H();
            C1436d f = SizeKt.m1486f(this.$modifier);
            C19861p<C1302d, Integer, C19394m> pVar = this.$backLayer;
            C19857l<C7280a, C7280a> lVar = this.$calculateBackLayerConstraints;
            final float f2 = this.$headerHeightPx;
            final boolean z = this.$stickyFrontLayer;
            final boolean z2 = this.$gesturesEnabled;
            final C1175d dVar3 = this.$scaffoldState;
            final float f3 = this.$peekHeightPx;
            final int i2 = this.$$dirty;
            final C1530k0 k0Var = this.$frontLayerShape;
            final long j = this.$frontLayerBackgroundColor;
            final long j2 = this.$frontLayerContentColor;
            final float f4 = this.$frontLayerElevation;
            final int i3 = this.$$dirty1;
            final float f5 = this.$headerHeight;
            final float f6 = this.$peekHeight;
            final C19861p<C1302d, Integer, C19394m> pVar2 = this.$frontLayerContent;
            final long j3 = this.$frontLayerScrimColor;
            final C19862q<C1254t1, C1302d, Integer, C19394m> qVar = this.$snackbarHost;
            C1171c.m2301b(f, pVar, lVar, C18263b.m30805A(dVar2, 1800047509, new C19863r<C7280a, Float, C1302d, Integer, C19394m>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    m34740invokejYbf7pk(((C7280a) obj).f16152a, ((Number) obj2).floatValue(), (C1302d) obj3, ((Number) obj4).intValue());
                    return C19394m.f43287a;
                }

                /* JADX WARNING: Removed duplicated region for block: B:45:0x01b9  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x0214  */
                /* renamed from: invoke-jYbf7pk  reason: not valid java name */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void m34740invokejYbf7pk(long r31, float r33, androidx.compose.runtime.C1302d r34, int r35) {
                    /*
                        r30 = this;
                        r0 = r30
                        r1 = r33
                        r13 = r34
                        r2 = r35 & 14
                        r3 = 2
                        r4 = r31
                        if (r2 != 0) goto L_0x0019
                        boolean r2 = r13.mo5434e(r4)
                        if (r2 == 0) goto L_0x0015
                        r2 = 4
                        goto L_0x0016
                    L_0x0015:
                        r2 = r3
                    L_0x0016:
                        r2 = r35 | r2
                        goto L_0x001b
                    L_0x0019:
                        r2 = r35
                    L_0x001b:
                        r6 = r35 & 112(0x70, float:1.57E-43)
                        if (r6 != 0) goto L_0x002b
                        boolean r6 = r13.mo5428b(r1)
                        if (r6 == 0) goto L_0x0028
                        r6 = 32
                        goto L_0x002a
                    L_0x0028:
                        r6 = 16
                    L_0x002a:
                        r2 = r2 | r6
                    L_0x002b:
                        r2 = r2 & 731(0x2db, float:1.024E-42)
                        r6 = 146(0x92, float:2.05E-43)
                        if (r2 != r6) goto L_0x003d
                        boolean r2 = r34.mo5442i()
                        if (r2 != 0) goto L_0x0038
                        goto L_0x003d
                    L_0x0038:
                        r34.mo5396C()
                        goto L_0x0213
                    L_0x003d:
                        int r2 = p174m0.C7280a.m13962g(r31)
                        float r14 = (float) r2
                        float r2 = r7
                        float r2 = r14 - r2
                        boolean r4 = r8
                        if (r4 == 0) goto L_0x004e
                        float r2 = java.lang.Math.min(r2, r1)
                    L_0x004e:
                        r15 = r2
                        boolean r1 = r9
                        r2 = 0
                        if (r1 == 0) goto L_0x005f
                        androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
                        androidx.compose.material.d r4 = r10
                        androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1 r4 = r4.f2390r
                        androidx.compose.ui.d r1 = androidx.compose.p015ui.input.nestedscroll.NestedScrollModifierKt.m3433a(r1, r4, r2)
                        goto L_0x0061
                    L_0x005f:
                        androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
                    L_0x0061:
                        androidx.compose.ui.d$a r12 = androidx.compose.p015ui.C1436d.C1437a.f3125b
                        java.lang.String r2 = "other"
                        kotlin.jvm.internal.C19383o.m32797g(r1, r2)
                        androidx.compose.material.d r2 = r10
                        kotlin.Pair[] r3 = new kotlin.Pair[r3]
                        float r4 = r11
                        java.lang.Float r4 = java.lang.Float.valueOf(r4)
                        androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
                        kotlin.Pair r6 = new kotlin.Pair
                        r6.<init>(r4, r5)
                        r4 = 0
                        r3[r4] = r6
                        java.lang.Float r5 = java.lang.Float.valueOf(r15)
                        androidx.compose.material.BackdropValue r11 = androidx.compose.material.BackdropValue.Revealed
                        kotlin.Pair r6 = new kotlin.Pair
                        r6.<init>(r5, r11)
                        r27 = 1
                        r3[r27] = r6
                        java.util.Map r18 = kotlin.collections.C19294b0.m32562s0(r3)
                        androidx.compose.foundation.gestures.Orientation r19 = androidx.compose.foundation.gestures.Orientation.Vertical
                        boolean r3 = r9
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 496(0x1f0, float:6.95E-43)
                        r16 = r1
                        r17 = r2
                        r20 = r3
                        androidx.compose.ui.d r1 = androidx.compose.material.C1261v1.m2395d(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1 r2 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                        androidx.compose.material.d r3 = r10
                        kotlinx.coroutines.d0 r5 = r21
                        r2.<init>(r3, r5)
                        androidx.compose.ui.d r1 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r1, r4, r2)
                        androidx.compose.material.d r2 = r10
                        r3 = 1157296644(0x44faf204, float:2007.563)
                        r13.mo5465u(r3)
                        boolean r3 = r13.mo5408I(r2)
                        java.lang.Object r4 = r34.mo5467v()
                        if (r3 != 0) goto L_0x00cc
                        androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
                        if (r4 != r3) goto L_0x00d4
                    L_0x00cc:
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1 r4 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                        r4.<init>(r2)
                        r13.mo5454o(r4)
                    L_0x00d4:
                        r34.mo5406H()
                        kq.l r4 = (p753kq.C19857l) r4
                        androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4360U(r12, r4)
                        androidx.compose.ui.d r1 = r2.mo6148i0(r1)
                        androidx.compose.ui.graphics.k0 r2 = r13
                        long r3 = r14
                        long r5 = r16
                        float r8 = r18
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2 r7 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2
                        float r9 = r22
                        kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r10 = r23
                        r31 = r11
                        int r11 = r12
                        r26 = r14
                        r32 = r15
                        long r14 = r24
                        r33 = r12
                        androidx.compose.material.d r12 = r10
                        r35 = r8
                        int r8 = r19
                        r28 = r5
                        boolean r5 = r9
                        kotlinx.coroutines.d0 r6 = r21
                        r16 = r7
                        r17 = r9
                        r18 = r10
                        r19 = r11
                        r20 = r14
                        r22 = r12
                        r23 = r8
                        r24 = r5
                        r25 = r6
                        r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25)
                        r5 = -1065299503(0xffffffffc080d1d1, float:-4.0256124)
                        androidx.compose.runtime.internal.ComposableLambdaImpl r9 = p628nj.C18263b.m30805A(r13, r5, r7)
                        r5 = 1572864(0x180000, float:2.204052E-39)
                        int r6 = r19
                        int r7 = r6 >> 3
                        r7 = r7 & 112(0x70, float:1.57E-43)
                        r5 = r5 | r7
                        int r7 = r6 >> 6
                        r8 = r7 & 896(0x380, float:1.256E-42)
                        r5 = r5 | r8
                        r7 = r7 & 7168(0x1c00, float:1.0045E-41)
                        r5 = r5 | r7
                        r7 = 458752(0x70000, float:6.42848E-40)
                        int r6 = r6 << 6
                        r6 = r6 & r7
                        r11 = r5 | r6
                        r12 = 16
                        r7 = 0
                        r14 = 0
                        r5 = r28
                        r8 = r35
                        r10 = r34
                        r15 = r31
                        r16 = r33
                        androidx.compose.material.SurfaceKt.m2234a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        androidx.compose.material.d r1 = r10
                        java.lang.Object r1 = r1.mo5116d()
                        if (r1 != r15) goto L_0x015a
                        r1 = r27
                        goto L_0x015b
                    L_0x015a:
                        r1 = r14
                    L_0x015b:
                        if (r1 == 0) goto L_0x016d
                        float r1 = r7
                        float r1 = r26 - r1
                        int r1 = (r32 > r1 ? 1 : (r32 == r1 ? 0 : -1))
                        if (r1 != 0) goto L_0x0166
                        goto L_0x0168
                    L_0x0166:
                        r27 = r14
                    L_0x0168:
                        if (r27 == 0) goto L_0x016d
                        float r1 = r20
                        goto L_0x016e
                    L_0x016d:
                        float r1 = (float) r14
                    L_0x016e:
                        r8 = r1
                        r9 = 7
                        r4 = r16
                        androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r4, r5, r6, r7, r8, r9)
                        androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3111g
                        kq.q<androidx.compose.material.t1, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r26
                        androidx.compose.material.d r8 = r10
                        int r9 = r19
                        r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
                        r13.mo5465u(r3)
                        androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.BoxKt.m1457c(r2, r14, r13)
                        r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                        r13.mo5465u(r3)
                        androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
                        java.lang.Object r3 = r13.mo5410J(r3)
                        m0.b r3 = (p174m0.C7282b) r3
                        androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
                        java.lang.Object r4 = r13.mo5410J(r4)
                        androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
                        androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
                        java.lang.Object r5 = r13.mo5410J(r5)
                        androidx.compose.ui.platform.j1 r5 = (androidx.compose.p015ui.platform.C1843j1) r5
                        androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
                        r6.getClass()
                        kq.a<androidx.compose.ui.node.ComposeUiNode> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
                        androidx.compose.runtime.internal.ComposableLambdaImpl r10 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
                        androidx.compose.runtime.c r1 = r34.mo5446k()
                        boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
                        if (r1 == 0) goto L_0x0214
                        r34.mo5392A()
                        boolean r1 = r34.mo5436f()
                        if (r1 == 0) goto L_0x01c6
                        r13.mo5450m(r6)
                        goto L_0x01c9
                    L_0x01c6:
                        r34.mo5452n()
                    L_0x01c9:
                        r34.mo5394B()
                        kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
                        androidx.compose.runtime.Updater.m2571b(r13, r2, r1)
                        kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
                        androidx.compose.runtime.Updater.m2571b(r13, r3, r1)
                        kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
                        androidx.compose.runtime.Updater.m2571b(r13, r4, r1)
                        kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
                        androidx.compose.runtime.a1 r3 = android.support.p013v4.media.C0073e.m204d(r13, r5, r1, r13)
                        r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                        r6 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
                        r1 = r14
                        r2 = r10
                        r4 = r34
                        androidx.compose.animation.C0472h.m1246i(r1, r2, r3, r4, r5, r6)
                        r1 = 1815906203(0x6c3c879b, float:9.116737E26)
                        r13.mo5465u(r1)
                        androidx.compose.material.t1 r1 = r8.f2389q
                        int r2 = r9 >> 18
                        r2 = r2 & 112(0x70, float:1.57E-43)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r7.invoke(r1, r13, r2)
                        r34.mo5406H()
                        r34.mo5406H()
                        r34.mo5406H()
                        r34.mo5456p()
                        r34.mo5406H()
                        r34.mo5406H()
                    L_0x0213:
                        return
                    L_0x0214:
                        p001a0.C0005b.m45j0()
                        r1 = 0
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.C10381.m34740invokejYbf7pk(long, float, androidx.compose.runtime.d, int):void");
                }
            }), dVar, 3120);
            return;
        }
        dVar.mo5396C();
    }
}
