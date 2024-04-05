package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0733f;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.C1244j;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1448j;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.coroutines.C19340c;
import p174m0.C7284d;
import p202p.C7644f;
import p202p.C7645g;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SwitchKt {

    /* renamed from: a */
    public static final float f2301a;

    /* renamed from: b */
    public static final float f2302b = ((float) 14);

    /* renamed from: c */
    public static final float f2303c;

    /* renamed from: d */
    public static final float f2304d = ((float) 24);

    /* renamed from: e */
    public static final float f2305e = ((float) 2);

    /* renamed from: f */
    public static final float f2306f;

    /* renamed from: g */
    public static final float f2307g;

    /* renamed from: h */
    public static final float f2308h;

    /* renamed from: i */
    public static final C0433j0<Float> f2309i = new C0433j0<>(100, (C0448r) null, 6);

    /* renamed from: j */
    public static final float f2310j = ((float) 1);

    /* renamed from: k */
    public static final float f2311k = ((float) 6);

    static {
        float f = (float) 34;
        f2301a = f;
        float f2 = (float) 20;
        f2303c = f2;
        f2306f = f;
        f2307g = f2;
        f2308h = f - f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2253a(boolean r35, p753kq.C19857l<? super java.lang.Boolean, kotlin.C19394m> r36, androidx.compose.p015ui.C1436d r37, boolean r38, androidx.compose.foundation.interaction.C0640j r39, androidx.compose.material.C1267x1 r40, androidx.compose.runtime.C1302d r41, int r42, int r43) {
        /*
            r7 = r36
            r8 = r42
            r0 = 25866825(0x18ab249, float:5.094902E-38)
            r1 = r41
            androidx.compose.runtime.ComposerImpl r6 = r1.mo5440h(r0)
            r0 = r43 & 1
            if (r0 == 0) goto L_0x0016
            r0 = r8 | 6
            r5 = r35
            goto L_0x0028
        L_0x0016:
            r0 = r8 & 14
            r5 = r35
            if (r0 != 0) goto L_0x0027
            boolean r0 = r6.mo5427a(r5)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r8
            goto L_0x0028
        L_0x0027:
            r0 = r8
        L_0x0028:
            r1 = r43 & 2
            if (r1 == 0) goto L_0x002f
            r0 = r0 | 48
            goto L_0x003f
        L_0x002f:
            r1 = r8 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x003f
            boolean r1 = r6.mo5408I(r7)
            if (r1 == 0) goto L_0x003c
            r1 = 32
            goto L_0x003e
        L_0x003c:
            r1 = 16
        L_0x003e:
            r0 = r0 | r1
        L_0x003f:
            r1 = r43 & 4
            if (r1 == 0) goto L_0x0046
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0046:
            r2 = r8 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0059
            r2 = r37
            boolean r3 = r6.mo5408I(r2)
            if (r3 == 0) goto L_0x0055
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r0 = r0 | r3
            goto L_0x005b
        L_0x0059:
            r2 = r37
        L_0x005b:
            r3 = r43 & 8
            if (r3 == 0) goto L_0x0062
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r4 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0075
            r4 = r38
            boolean r9 = r6.mo5427a(r4)
            if (r9 == 0) goto L_0x0071
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r0 = r0 | r9
            goto L_0x0077
        L_0x0075:
            r4 = r38
        L_0x0077:
            r9 = r43 & 16
            if (r9 == 0) goto L_0x007e
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x007e:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r8
            if (r10 != 0) goto L_0x0093
            r10 = r39
            boolean r11 = r6.mo5408I(r10)
            if (r11 == 0) goto L_0x008f
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r0 = r0 | r11
            goto L_0x0095
        L_0x0093:
            r10 = r39
        L_0x0095:
            r21 = 458752(0x70000, float:6.42848E-40)
            r11 = r8 & r21
            if (r11 != 0) goto L_0x00b0
            r11 = r43 & 32
            if (r11 != 0) goto L_0x00aa
            r11 = r40
            boolean r12 = r6.mo5408I(r11)
            if (r12 == 0) goto L_0x00ac
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r11 = r40
        L_0x00ac:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r0 = r0 | r12
            goto L_0x00b2
        L_0x00b0:
            r11 = r40
        L_0x00b2:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r0
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00cb
            boolean r12 = r6.mo5442i()
            if (r12 != 0) goto L_0x00c2
            goto L_0x00cb
        L_0x00c2:
            r6.mo5396C()
            r3 = r2
            r2 = r6
            r5 = r10
            r6 = r11
            goto L_0x0309
        L_0x00cb:
            r6.mo5466u0()
            r12 = r8 & 1
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r22 = -458753(0xfffffffffff8ffff, float:NaN)
            r13 = 1
            r15 = 0
            if (r12 == 0) goto L_0x00ec
            boolean r12 = r6.mo5425Y()
            if (r12 == 0) goto L_0x00e1
            goto L_0x00ec
        L_0x00e1:
            r6.mo5396C()
            r1 = r43 & 32
            if (r1 == 0) goto L_0x00ea
            r0 = r0 & r22
        L_0x00ea:
            r1 = r2
            goto L_0x012c
        L_0x00ec:
            if (r1 == 0) goto L_0x00f1
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x00f2
        L_0x00f1:
            r1 = r2
        L_0x00f2:
            if (r3 == 0) goto L_0x00f5
            r4 = r13
        L_0x00f5:
            if (r9 == 0) goto L_0x010c
            r6.mo5465u(r14)
            java.lang.Object r2 = r6.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0106
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r6)
        L_0x0106:
            r6.mo5418R(r15)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            goto L_0x010d
        L_0x010c:
            r2 = r10
        L_0x010d:
            r3 = r43 & 32
            if (r3 == 0) goto L_0x0135
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r3 = 0
            r20 = 1023(0x3ff, float:1.434E-42)
            r14 = r15
            r16 = r17
            r18 = r3
            r19 = r6
            androidx.compose.material.f0 r3 = kotlinx.coroutines.C19543e0.m33288D(r9, r11, r13, r14, r16, r18, r19, r20)
            r0 = r0 & r22
            r10 = r2
            r11 = r3
        L_0x012c:
            r9 = r0
            r15 = r1
            r17 = r4
            r18 = r10
        L_0x0132:
            r19 = r11
            goto L_0x013c
        L_0x0135:
            r9 = r0
            r15 = r1
            r18 = r2
            r17 = r4
            goto L_0x0132
        L_0x013c:
            r6.mo5419S()
            androidx.compose.runtime.l1 r10 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r0 = r6.mo5410J(r10)
            m0.b r0 = (p174m0.C7282b) r0
            float r1 = f2308h
            float r11 = r0.mo3789B0(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r35)
            if (r7 != 0) goto L_0x0156
            androidx.compose.material.SwitchKt$Switch$swipeableState$1 r1 = androidx.compose.material.SwitchKt$Switch$swipeableState$1.INSTANCE
            goto L_0x0157
        L_0x0156:
            r1 = r7
        L_0x0157:
            androidx.compose.animation.core.j0<java.lang.Float> r2 = f2309i
            java.lang.String r3 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            java.lang.String r3 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r3 = 1156387078(0x44ed1106, float:1896.532)
            r6.mo5465u(r3)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo5465u(r3)
            java.lang.Object r4 = r6.mo5431c0()
            androidx.compose.runtime.d$a$a r12 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r12) goto L_0x0181
            androidx.compose.material.SwipeableState r4 = new androidx.compose.material.SwipeableState
            androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1 r13 = androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.INSTANCE
            r4.<init>(r0, r2, r13)
            r6.mo5407H0(r4)
        L_0x0181:
            r2 = 0
            r6.mo5418R(r2)
            r13 = r4
            androidx.compose.material.SwipeableState r13 = (androidx.compose.material.SwipeableState) r13
            r6.mo5465u(r3)
            java.lang.Object r2 = r6.mo5431c0()
            if (r2 != r12) goto L_0x019a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.foundation.layout.C0761x.m1751w0(r2, androidx.compose.runtime.C1351n1.f2948a)
            r6.mo5407H0(r2)
        L_0x019a:
            r3 = 0
            r6.mo5418R(r3)
            androidx.compose.runtime.j0 r2 = (androidx.compose.runtime.C1338j0) r2
            java.lang.Object r3 = r2.getValue()
            androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1 r4 = new androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1
            r12 = 0
            r4.<init>(r0, r13, r12)
            androidx.compose.runtime.C1415u.m3030d(r0, r3, r4, r6)
            java.lang.Object r3 = r13.mo5116d()
            androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2 r4 = new androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2
            r4.<init>(r0, r13, r1, r2)
            androidx.compose.runtime.C1415u.m3028b(r3, r4, r6)
            r0 = 0
            r6.mo5418R(r0)
            androidx.compose.runtime.l1 r12 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r1 = r6.mo5410J(r12)
            androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
            if (r1 != r2) goto L_0x01c8
            r0 = 1
        L_0x01c8:
            r29 = r0
            if (r7 == 0) goto L_0x01e8
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = 0
            androidx.compose.ui.semantics.g r14 = new androidx.compose.ui.semantics.g
            r4 = 2
            r14.<init>(r4)
            r1 = r35
            r2 = r18
            r16 = r4
            r4 = r17
            r5 = r14
            r14 = r6
            r6 = r36
            androidx.compose.ui.d r0 = androidx.compose.foundation.selection.C0893a.m1946a(r0, r1, r2, r3, r4, r5, r6)
            r4 = r16
            goto L_0x01ec
        L_0x01e8:
            r14 = r6
            r4 = 2
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x01ec:
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            if (r7 == 0) goto L_0x01f4
            androidx.compose.ui.d r1 = androidx.compose.material.TouchTargetKt.m2285a(r1)
        L_0x01f4:
            androidx.compose.ui.d r1 = r15.mo6148i0(r1)
            androidx.compose.ui.d r24 = r1.mo6148i0(r0)
            kotlin.Pair[] r0 = new kotlin.Pair[r4]
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r2)
            r6 = 0
            r0[r6] = r3
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r2)
            r11 = 1
            r0[r11] = r3
            java.util.Map r26 = kotlin.collections.C19294b0.m32562s0(r0)
            androidx.compose.foundation.gestures.Orientation r27 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r17 == 0) goto L_0x0228
            if (r7 == 0) goto L_0x0228
            r28 = r11
            goto L_0x022a
        L_0x0228:
            r28 = r6
        L_0x022a:
            androidx.compose.material.SwitchKt$Switch$2 r31 = androidx.compose.material.SwitchKt$Switch$2.INSTANCE
            r32 = 0
            r33 = 0
            r34 = 256(0x100, float:3.59E-43)
            r25 = r13
            r30 = r18
            androidx.compose.ui.d r0 = androidx.compose.material.C1261v1.m2395d(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            androidx.compose.ui.b r1 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.SizeKt.m1497q(r0, r1)
            float r1 = f2305e
            androidx.compose.ui.d r0 = com.google.android.play.core.assetpacks.C15588c1.m25279F0(r0, r1)
            float r25 = f2306f
            float r26 = f2307g
            java.lang.String r1 = "$this$requiredSize"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r1 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            androidx.compose.foundation.layout.SizeModifier r1 = new androidx.compose.foundation.layout.SizeModifier
            r27 = 0
            r22 = r1
            r23 = r25
            r24 = r26
            r22.<init>(r23, r24, r25, r26, r27)
            androidx.compose.ui.d r0 = r0.mo6148i0(r1)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r14.mo5465u(r1)
            androidx.compose.ui.b r1 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.BoxKt.m1457c(r1, r6, r14)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo5465u(r2)
            java.lang.Object r2 = r14.mo5410J(r10)
            m0.b r2 = (p174m0.C7282b) r2
            java.lang.Object r3 = r14.mo5410J(r12)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p015ui.unit.LayoutDirection) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r4 = r14.mo5410J(r4)
            androidx.compose.ui.platform.j1 r4 = (androidx.compose.p015ui.platform.C1843j1) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r5.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            androidx.compose.runtime.c<?> r10 = r14.f2715a
            boolean r10 = r10 instanceof androidx.compose.runtime.C1299c
            if (r10 == 0) goto L_0x0321
            r14.mo5392A()
            boolean r10 = r14.f2702K
            if (r10 == 0) goto L_0x02a4
            r14.mo5450m(r5)
            goto L_0x02a7
        L_0x02a4:
            r14.mo5452n()
        L_0x02a7:
            r14.f2738x = r6
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r14, r1, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r14, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r14, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = p504ai.C13983i.m21490i(r14, r4, r1, r14)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r1 = r6
            r2 = r0
            r4 = r14
            r0 = r6
            r6 = r10
            androidx.appcompat.widget.C0326j.m868m(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.e0 r1 = kotlinx.coroutines.C19543e0.f43489b
            r2 = 1571176015(0x5da63e4f, float:1.49738737E18)
            r14.mo5465u(r2)
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = r13.f2282e
            int r2 = r9 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            int r4 = r9 >> 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r4 = r9 >> 6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r2 = r2 & r21
            r16 = r3 | r2
            r9 = r1
            r10 = r35
            r1 = r11
            r11 = r17
            r12 = r19
            r2 = r14
            r14 = r18
            r3 = r15
            r15 = r2
            m2254b(r9, r10, r11, r12, r13, r14, r15, r16)
            android.support.p013v4.media.session.C0087d.m238h(r2, r0, r0, r0, r1)
            r2.mo5418R(r0)
            r2.mo5418R(r0)
            r4 = r17
            r5 = r18
            r6 = r19
        L_0x0309:
            androidx.compose.runtime.v0 r9 = r2.mo5421U()
            if (r9 != 0) goto L_0x0310
            goto L_0x0320
        L_0x0310:
            androidx.compose.material.SwitchKt$Switch$4 r10 = new androidx.compose.material.SwitchKt$Switch$4
            r0 = r10
            r1 = r35
            r2 = r36
            r7 = r42
            r8 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f3081d = r10
        L_0x0320:
            return
        L_0x0321:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.m2253a(boolean, kq.l, androidx.compose.ui.d, boolean, androidx.compose.foundation.interaction.j, androidx.compose.material.x1, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: b */
    public static final void m2254b(C0733f fVar, boolean z, boolean z2, C1267x1 x1Var, C1342k1<Float> k1Var, C0639i iVar, C1302d dVar, int i) {
        int i2;
        float f;
        long j;
        C1436d.C1437a aVar;
        int i3;
        C0733f fVar2 = fVar;
        boolean z3 = z;
        boolean z4 = z2;
        C1267x1 x1Var2 = x1Var;
        C1342k1<Float> k1Var2 = k1Var;
        C0639i iVar2 = iVar;
        int i4 = i;
        ComposerImpl h = dVar.mo5440h(-1834839253);
        if ((i4 & 14) == 0) {
            i2 = (h.mo5408I(fVar2) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        if ((i4 & 112) == 0) {
            i2 |= h.mo5427a(z3) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i2 |= h.mo5427a(z4) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i2 |= h.mo5408I(x1Var2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((57344 & i4) == 0) {
            i2 |= h.mo5408I(k1Var2) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((458752 & i4) == 0) {
            i2 |= h.mo5408I(iVar2) ? 131072 : 65536;
        }
        if ((i2 & 374491) != 74898 || !h.mo5442i()) {
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            C1302d.C1303a.C1304a aVar2 = C1302d.C1303a.f2828a;
            if (c0 == aVar2) {
                c0 = new SnapshotStateList();
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            SnapshotStateList snapshotStateList = (SnapshotStateList) c0;
            h.mo5465u(511388516);
            boolean I = h.mo5408I(iVar2) | h.mo5408I(snapshotStateList);
            Object c02 = h.mo5431c0();
            if (I || c02 == aVar2) {
                c02 = new SwitchKt$SwitchImpl$1$1(iVar2, snapshotStateList, (C19340c<? super SwitchKt$SwitchImpl$1$1>) null);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            C1415u.m3031e(iVar2, (C19861p) c02, h);
            float f2 = snapshotStateList.isEmpty() ^ true ? f2311k : f2310j;
            C1338j0 a = x1Var2.mo5253a(z4, z3, h);
            C1436d.C1437a aVar3 = C1436d.C1437a.f3125b;
            C1436d f3 = SizeKt.m1486f(fVar2.mo4116g(aVar3, C1428a.C1429a.f3108d));
            h.mo5465u(1157296644);
            boolean I2 = h.mo5408I(a);
            Object c03 = h.mo5431c0();
            if (I2 || c03 == aVar2) {
                c03 = new SwitchKt$SwitchImpl$2$1(a);
                h.mo5407H0(c03);
            }
            h.mo5418R(false);
            CanvasKt.m1294a(f3, (C19857l) c03, h, 0);
            C1338j0 b = x1Var2.mo5254b(z4, z3, h);
            C1215n0 n0Var = (C1215n0) h.mo5410J(ElevationOverlayKt.f2206a);
            float f4 = ((C7284d) h.mo5410J(ElevationOverlayKt.f2207b)).f16155b + f2;
            h.mo5465u(-539245361);
            C1436d.C1437a aVar4 = aVar3;
            float f5 = f2;
            if (!C1545s.m3357c(((C1545s) b.getValue()).f3366a, ((C1259v) h.mo5410J(ColorsKt.f2187a)).mo5363j()) || n0Var == null) {
                f = f5;
                aVar = aVar4;
                i3 = 1157296644;
                j = ((C1545s) b.getValue()).f3366a;
            } else {
                i3 = 1157296644;
                aVar = aVar4;
                f = f5;
                j = n0Var.mo5221a(((C1545s) b.getValue()).f3366a, f4, h, 0);
            }
            long j2 = j;
            h.mo5418R(false);
            C1436d g = fVar2.mo4116g(aVar, C1428a.C1429a.f3107c);
            h.mo5465u(i3);
            boolean I3 = h.mo5408I(k1Var2);
            Object c04 = h.mo5431c0();
            if (I3 || c04 == aVar2) {
                c04 = new SwitchKt$SwitchImpl$3$1(k1Var2);
                h.mo5407H0(c04);
            }
            h.mo5418R(false);
            C1436d j3 = SizeKt.m1490j(IndicationKt.m1310a(C1993m.m4360U(g, (C19857l) c04), iVar2, C1244j.m2369a(false, f2304d, 0, h, 54, 4)), f2303c);
            C7644f fVar3 = C7645g.f16941a;
            C15588c1.m25324f(C0761x.m1655A(C1448j.m3094a(j3, f, fVar3, 24), j2, fVar3), h, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SwitchKt$SwitchImpl$4(fVar, z, z2, x1Var, k1Var, iVar, i);
        }
    }
}
