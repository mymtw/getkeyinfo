package androidx.compose.animation;

import androidx.compose.animation.core.C0429h0;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0437l0;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.C0467z0;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7287g;
import p174m0.C7290i;
import p288y.C8345d;
import p753kq.C19857l;

public final class EnterExitTransitionKt {

    /* renamed from: a */
    public static final C0437l0 f978a = VectorConvertersKt.m1104a(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);

    /* renamed from: b */
    public static final ParcelableSnapshotMutableState f979b = C0761x.m1751w0(Float.valueOf(1.0f), C1351n1.f2948a);

    /* renamed from: c */
    public static final C0429h0<Float> f980c = C0761x.m1678L0(0.0f, 400.0f, (Object) null, 5);

    /* renamed from: d */
    public static final C0429h0<C7287g> f981d = C0761x.m1678L0(0.0f, 400.0f, new C7287g(C19421p.m32949o(1, 1)), 1);

    /* renamed from: e */
    public static final C0429h0<C7290i> f982e = C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1);

    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$a */
    public /* synthetic */ class C0384a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f983a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f983a = iArr;
        }
    }

    static {
        int i = C7287g.f16165c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p015ui.C1436d m1032a(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r21, androidx.compose.animation.C0473i r22, androidx.compose.animation.C0475k r23, java.lang.String r24, androidx.compose.runtime.C1302d r25, int r26) {
        /*
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "enter"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "exit"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = 914000546(0x367a8aa2, float:3.7333598E-6)
            r11.mo5465u(r0)
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.animation.x r1 = r22.mo3546a()
            androidx.compose.animation.u r1 = r1.f1234b
            androidx.compose.runtime.j0 r1 = androidx.compose.foundation.layout.C0761x.m1664E0(r1, r11)
            androidx.compose.animation.x r2 = r23.mo3550a()
            androidx.compose.animation.u r2 = r2.f1234b
            androidx.compose.runtime.j0 r2 = androidx.compose.foundation.layout.C0761x.m1664E0(r2, r11)
            androidx.compose.animation.EnterExitTransitionKt$slideInOut$1 r3 = new androidx.compose.animation.EnterExitTransitionKt$slideInOut$1
            r3.<init>(r7, r1, r2, r10)
            androidx.compose.ui.d r0 = androidx.compose.p015ui.ComposedModifierKt.m3049a(r0, androidx.compose.p015ui.platform.InspectableValueKt.f4032a, r3)
            androidx.compose.animation.x r1 = r22.mo3546a()
            androidx.compose.animation.f r1 = r1.f1235c
            androidx.compose.runtime.j0 r1 = androidx.compose.foundation.layout.C0761x.m1664E0(r1, r11)
            androidx.compose.animation.x r2 = r23.mo3550a()
            androidx.compose.animation.f r2 = r2.f1235c
            androidx.compose.runtime.j0 r2 = androidx.compose.foundation.layout.C0761x.m1664E0(r2, r11)
            androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1 r3 = new androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1
            r3.<init>(r7, r1, r2, r10)
            androidx.compose.ui.d r12 = androidx.compose.p015ui.ComposedModifierKt.m3049a(r0, androidx.compose.p015ui.platform.InspectableValueKt.f4032a, r3)
            r13 = r26 & 14
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.mo5465u(r0)
            boolean r1 = r11.mo5408I(r7)
            java.lang.Object r2 = r25.mo5467v()
            if (r1 != 0) goto L_0x0076
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r1) goto L_0x007f
        L_0x0076:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.foundation.layout.C0761x.m1751w0(r1, androidx.compose.runtime.C1351n1.f2948a)
            r11.mo5454o(r2)
        L_0x007f:
            r25.mo5406H()
            r14 = r2
            androidx.compose.runtime.j0 r14 = (androidx.compose.runtime.C1338j0) r14
            r11.mo5465u(r0)
            boolean r0 = r11.mo5408I(r7)
            java.lang.Object r1 = r25.mo5467v()
            if (r0 != 0) goto L_0x0096
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r0) goto L_0x009f
        L_0x0096:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = androidx.compose.foundation.layout.C0761x.m1751w0(r0, androidx.compose.runtime.C1351n1.f2948a)
            r11.mo5454o(r1)
        L_0x009f:
            r25.mo5406H()
            r15 = r1
            androidx.compose.runtime.j0 r15 = (androidx.compose.runtime.C1338j0) r15
            java.lang.Object r0 = r21.mo3410b()
            java.lang.Object r1 = r21.mo3412d()
            if (r0 != r1) goto L_0x00be
            boolean r0 = r21.mo3413e()
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setValue(r0)
            r15.setValue(r0)
            goto L_0x00e8
        L_0x00be:
            androidx.compose.animation.x r0 = r22.mo3546a()
            androidx.compose.animation.m r0 = r0.f1233a
            if (r0 != 0) goto L_0x00ce
            androidx.compose.animation.x r0 = r23.mo3550a()
            androidx.compose.animation.m r0 = r0.f1233a
            if (r0 == 0) goto L_0x00d3
        L_0x00ce:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r14.setValue(r0)
        L_0x00d3:
            androidx.compose.animation.x r0 = r22.mo3546a()
            androidx.compose.animation.q r0 = r0.f1236d
            if (r0 != 0) goto L_0x00e3
            androidx.compose.animation.x r0 = r23.mo3550a()
            androidx.compose.animation.q r0 = r0.f1236d
            if (r0 == 0) goto L_0x00e8
        L_0x00e3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.setValue(r0)
        L_0x00e8:
            r0 = 1657240548(0x62c77be4, float:1.8399147E21)
            r11.mo5465u(r0)
            java.lang.Object r0 = r14.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r16 = 57344(0xe000, float:8.0356E-41)
            r17 = 1065353216(0x3f800000, float:1.0)
            r6 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3 = 1
            r1 = 3
            if (r0 == 0) goto L_0x01f8
            androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
            r0.<init>(r8, r9)
            r11.mo5465u(r5)
            java.lang.Object r5 = r25.mo5467v()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r2) goto L_0x012e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r5 = " alpha"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r11.mo5454o(r5)
        L_0x012e:
            r25.mo5406H()
            java.lang.String r5 = (java.lang.String) r5
            r2 = r13 | 384(0x180, float:5.38E-43)
            r11.mo5465u(r4)
            androidx.compose.animation.core.l0 r18 = androidx.compose.animation.core.VectorConvertersKt.f1076a
            r19 = r2 & 14
            int r2 = r2 << r1
            r4 = r2 & 896(0x380, float:1.256E-42)
            r4 = r19 | r4
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r4
            r2 = r2 & r16
            r1 = r1 | r2
            r11.mo5465u(r6)
            java.lang.Object r2 = r21.mo3410b()
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r4 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            r11.mo5465u(r4)
            int[] r20 = androidx.compose.animation.EnterExitTransitionKt.C0384a.f983a
            int r2 = r2.ordinal()
            r2 = r20[r2]
            if (r2 == r3) goto L_0x0182
            r6 = 2
            if (r2 == r6) goto L_0x0177
            r6 = 3
            if (r2 != r6) goto L_0x0171
            androidx.compose.animation.x r2 = r23.mo3550a()
            androidx.compose.animation.m r2 = r2.f1233a
            if (r2 == 0) goto L_0x0182
            float r2 = r2.f1217a
            goto L_0x0184
        L_0x0171:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0177:
            androidx.compose.animation.x r2 = r22.mo3546a()
            androidx.compose.animation.m r2 = r2.f1233a
            if (r2 == 0) goto L_0x0182
            float r2 = r2.f1217a
            goto L_0x0184
        L_0x0182:
            r2 = r17
        L_0x0184:
            r25.mo5406H()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r6 = r21.mo3412d()
            androidx.compose.animation.EnterExitState r6 = (androidx.compose.animation.EnterExitState) r6
            r11.mo5465u(r4)
            int r4 = r6.ordinal()
            r4 = r20[r4]
            r6 = 2
            if (r4 == r3) goto L_0x01be
            if (r4 == r6) goto L_0x01b3
            r3 = 3
            if (r4 != r3) goto L_0x01ad
            androidx.compose.animation.x r3 = r23.mo3550a()
            androidx.compose.animation.m r3 = r3.f1233a
            if (r3 == 0) goto L_0x01be
            float r3 = r3.f1217a
            goto L_0x01c0
        L_0x01ad:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b3:
            androidx.compose.animation.x r3 = r22.mo3546a()
            androidx.compose.animation.m r3 = r3.f1233a
            if (r3 == 0) goto L_0x01be
            float r3 = r3.f1217a
            goto L_0x01c0
        L_0x01be:
            r3 = r17
        L_0x01c0:
            r25.mo5406H()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.animation.core.Transition$b r4 = r21.mo3411c()
            r19 = 3
            int r1 = r1 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r4, r11, r1)
            r4 = r0
            androidx.compose.animation.core.t r4 = (androidx.compose.animation.core.C0454t) r4
            r0 = r21
            r7 = r19
            r1 = r2
            r2 = r3
            r3 = r4
            r7 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r4 = r18
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6 = r25
            androidx.compose.animation.core.Transition$d r0 = androidx.compose.animation.core.TransitionKt.m1101c(r0, r1, r2, r3, r4, r5, r6)
            r25.mo5406H()
            r25.mo5406H()
            goto L_0x01fb
        L_0x01f8:
            r7 = r5
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = f979b
        L_0x01fb:
            r6 = r0
            r25.mo5406H()
            java.lang.Object r0 = r15.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0459
            androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
            r0.<init>(r8, r9)
            r11.mo5465u(r7)
            java.lang.Object r1 = r25.mo5467v()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r2) goto L_0x022f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r2 = " scale"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r11.mo5454o(r1)
        L_0x022f:
            r25.mo5406H()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r13 | 384(0x180, float:5.38E-43)
            r2 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r11.mo5465u(r2)
            androidx.compose.animation.core.l0 r4 = androidx.compose.animation.core.VectorConvertersKt.f1076a
            r2 = r1 & 14
            r3 = 3
            int r1 = r1 << r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r16
            r1 = r1 | r2
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r11.mo5465u(r7)
            java.lang.Object r2 = r21.mo3410b()
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r3 = -596129937(0xffffffffdc77c76f, float:-2.78974395E17)
            r11.mo5465u(r3)
            int[] r10 = androidx.compose.animation.EnterExitTransitionKt.C0384a.f983a
            int r2 = r2.ordinal()
            r2 = r10[r2]
            r14 = 1
            if (r2 == r14) goto L_0x028b
            r15 = 2
            if (r2 == r15) goto L_0x0280
            r7 = 3
            if (r2 != r7) goto L_0x027a
            androidx.compose.animation.x r2 = r23.mo3550a()
            androidx.compose.animation.q r2 = r2.f1236d
            if (r2 == 0) goto L_0x028c
            float r2 = r2.f1226a
            goto L_0x028e
        L_0x027a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0280:
            androidx.compose.animation.x r2 = r22.mo3546a()
            androidx.compose.animation.q r2 = r2.f1236d
            if (r2 == 0) goto L_0x028c
            float r2 = r2.f1226a
            goto L_0x028e
        L_0x028b:
            r15 = 2
        L_0x028c:
            r2 = r17
        L_0x028e:
            r25.mo5406H()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r7 = r21.mo3412d()
            androidx.compose.animation.EnterExitState r7 = (androidx.compose.animation.EnterExitState) r7
            r11.mo5465u(r3)
            int r3 = r7.ordinal()
            r3 = r10[r3]
            if (r3 == r14) goto L_0x02c8
            if (r3 == r15) goto L_0x02bc
            r7 = 3
            if (r3 != r7) goto L_0x02b6
            androidx.compose.animation.x r3 = r23.mo3550a()
            androidx.compose.animation.q r3 = r3.f1236d
            if (r3 == 0) goto L_0x02c8
            float r3 = r3.f1226a
            goto L_0x02c6
        L_0x02b6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02bc:
            androidx.compose.animation.x r3 = r22.mo3546a()
            androidx.compose.animation.q r3 = r3.f1236d
            if (r3 == 0) goto L_0x02c8
            float r3 = r3.f1226a
        L_0x02c6:
            r17 = r3
        L_0x02c8:
            r25.mo5406H()
            java.lang.Float r3 = java.lang.Float.valueOf(r17)
            androidx.compose.animation.core.Transition$b r7 = r21.mo3411c()
            r16 = 3
            int r1 = r1 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r7, r11, r1)
            r7 = r0
            androidx.compose.animation.core.t r7 = (androidx.compose.animation.core.C0454t) r7
            r0 = r21
            r1 = r2
            r2 = r3
            r3 = r7
            r7 = r6
            r6 = r25
            androidx.compose.animation.core.Transition$d r6 = androidx.compose.animation.core.TransitionKt.m1101c(r0, r1, r2, r3, r4, r5, r6)
            r25.mo5406H()
            r25.mo5406H()
            java.lang.Object r0 = r21.mo3410b()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r0 != r1) goto L_0x031e
            androidx.compose.animation.x r0 = r22.mo3546a()
            androidx.compose.animation.q r0 = r0.f1236d
            if (r0 == 0) goto L_0x030e
            long r0 = r0.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r0)
            goto L_0x033f
        L_0x030e:
            androidx.compose.animation.x r0 = r23.mo3550a()
            androidx.compose.animation.q r0 = r0.f1236d
            if (r0 == 0) goto L_0x033e
            long r0 = r0.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r0)
            goto L_0x033f
        L_0x031e:
            androidx.compose.animation.x r0 = r23.mo3550a()
            androidx.compose.animation.q r0 = r0.f1236d
            if (r0 == 0) goto L_0x032e
            long r0 = r0.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r0)
            goto L_0x033f
        L_0x032e:
            androidx.compose.animation.x r0 = r22.mo3546a()
            androidx.compose.animation.q r0 = r0.f1236d
            if (r0 == 0) goto L_0x033e
            long r0 = r0.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r0)
            goto L_0x033f
        L_0x033e:
            r3 = 0
        L_0x033f:
            androidx.compose.animation.core.l0 r4 = f978a
            r0 = r13 | 3136(0xc40, float:4.394E-42)
            r1 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r11.mo5465u(r1)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1 r1 = androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE
            java.lang.Object r5 = r21.mo3410b()
            androidx.compose.animation.EnterExitState r5 = (androidx.compose.animation.EnterExitState) r5
            r13 = -288165413(0xffffffffeed2f1db, float:-3.2642119E28)
            r11.mo5465u(r13)
            int r5 = r5.ordinal()
            r5 = r10[r5]
            if (r5 == r14) goto L_0x03ac
            if (r5 == r15) goto L_0x038a
            r2 = 3
            if (r5 != r2) goto L_0x0384
            androidx.compose.animation.x r2 = r23.mo3550a()
            androidx.compose.animation.q r2 = r2.f1236d
            if (r2 == 0) goto L_0x0374
            long r14 = r2.f1227b
            androidx.compose.ui.graphics.p0 r2 = new androidx.compose.ui.graphics.p0
            r2.<init>(r14)
            goto L_0x03ad
        L_0x0374:
            androidx.compose.animation.x r2 = r22.mo3546a()
            androidx.compose.animation.q r2 = r2.f1236d
            if (r2 == 0) goto L_0x03aa
            long r14 = r2.f1227b
            androidx.compose.ui.graphics.p0 r2 = new androidx.compose.ui.graphics.p0
            r2.<init>(r14)
            goto L_0x03ad
        L_0x0384:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x038a:
            androidx.compose.animation.x r2 = r22.mo3546a()
            androidx.compose.animation.q r2 = r2.f1236d
            if (r2 == 0) goto L_0x039a
            long r14 = r2.f1227b
            androidx.compose.ui.graphics.p0 r2 = new androidx.compose.ui.graphics.p0
            r2.<init>(r14)
            goto L_0x03ad
        L_0x039a:
            androidx.compose.animation.x r2 = r23.mo3550a()
            androidx.compose.animation.q r2 = r2.f1236d
            if (r2 == 0) goto L_0x03aa
            long r14 = r2.f1227b
            androidx.compose.ui.graphics.p0 r2 = new androidx.compose.ui.graphics.p0
            r2.<init>(r14)
            goto L_0x03ad
        L_0x03aa:
            r2 = 0
            goto L_0x03ad
        L_0x03ac:
            r2 = r3
        L_0x03ad:
            if (r2 == 0) goto L_0x03b2
            long r14 = r2.f3339a
            goto L_0x03b4
        L_0x03b2:
            long r14 = androidx.compose.p015ui.graphics.C1540p0.f3337b
        L_0x03b4:
            r25.mo5406H()
            androidx.compose.ui.graphics.p0 r2 = new androidx.compose.ui.graphics.p0
            r2.<init>(r14)
            java.lang.Object r5 = r21.mo3412d()
            androidx.compose.animation.EnterExitState r5 = (androidx.compose.animation.EnterExitState) r5
            r11.mo5465u(r13)
            int r5 = r5.ordinal()
            r5 = r10[r5]
            r10 = 1
            if (r5 == r10) goto L_0x041b
            r10 = 2
            if (r5 == r10) goto L_0x03fa
            r3 = 3
            if (r5 != r3) goto L_0x03f4
            androidx.compose.animation.x r3 = r23.mo3550a()
            androidx.compose.animation.q r3 = r3.f1236d
            if (r3 == 0) goto L_0x03e4
            long r8 = r3.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r8)
            goto L_0x041b
        L_0x03e4:
            androidx.compose.animation.x r3 = r22.mo3546a()
            androidx.compose.animation.q r3 = r3.f1236d
            if (r3 == 0) goto L_0x041a
            long r8 = r3.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r8)
            goto L_0x041b
        L_0x03f4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03fa:
            androidx.compose.animation.x r3 = r22.mo3546a()
            androidx.compose.animation.q r3 = r3.f1236d
            if (r3 == 0) goto L_0x040a
            long r8 = r3.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r8)
            goto L_0x041b
        L_0x040a:
            androidx.compose.animation.x r3 = r23.mo3550a()
            androidx.compose.animation.q r3 = r3.f1236d
            if (r3 == 0) goto L_0x041a
            long r8 = r3.f1227b
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r8)
            goto L_0x041b
        L_0x041a:
            r3 = 0
        L_0x041b:
            if (r3 == 0) goto L_0x0420
            long r8 = r3.f3339a
            goto L_0x0422
        L_0x0420:
            long r8 = androidx.compose.p015ui.graphics.C1540p0.f3337b
        L_0x0422:
            r25.mo5406H()
            androidx.compose.ui.graphics.p0 r3 = new androidx.compose.ui.graphics.p0
            r3.<init>(r8)
            androidx.compose.animation.core.Transition$b r5 = r21.mo3411c()
            r8 = 3
            int r0 = r0 >> r8
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r5, r11, r0)
            r5 = r0
            androidx.compose.animation.core.t r5 = (androidx.compose.animation.core.C0454t) r5
            java.lang.String r8 = "TransformOriginInterruptionHandling"
            r0 = r21
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r8
            r8 = r6
            r6 = r25
            androidx.compose.animation.core.Transition$d r0 = androidx.compose.animation.core.TransitionKt.m1101c(r0, r1, r2, r3, r4, r5, r6)
            r25.mo5406H()
            androidx.compose.animation.EnterExitTransitionKt$createModifier$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$1
            r1.<init>(r7, r8, r0)
            androidx.compose.ui.d r12 = kotlin.jvm.internal.C19388s.m32868j0(r12, r1)
            goto L_0x046f
        L_0x0459:
            r7 = r6
            java.lang.Object r0 = r14.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x046f
            androidx.compose.animation.EnterExitTransitionKt$createModifier$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$2
            r0.<init>(r7)
            androidx.compose.ui.d r12 = kotlin.jvm.internal.C19388s.m32868j0(r12, r0)
        L_0x046f:
            r25.mo5406H()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.m1032a(androidx.compose.animation.core.Transition, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, androidx.compose.runtime.d, int):androidx.compose.ui.d");
    }

    /* renamed from: b */
    public static C0474j m1033b() {
        C8345d dVar = C0467z0.f1203a;
        C0429h0 L0 = C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1);
        C1432b.C1433a aVar = C1428a.C1429a.f3118n;
        EnterExitTransitionKt$expandHorizontally$1 enterExitTransitionKt$expandHorizontally$1 = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        C19383o.m32797g(enterExitTransitionKt$expandHorizontally$1, "initialWidth");
        return m1034c(L0, C19383o.m32792b(aVar, C1428a.C1429a.f3116l) ? C1428a.C1429a.f3107c : C19383o.m32792b(aVar, aVar) ? C1428a.C1429a.f3109e : C1428a.C1429a.f3108d, new EnterExitTransitionKt$expandHorizontally$2(enterExitTransitionKt$expandHorizontally$1), true);
    }

    /* renamed from: c */
    public static final C0474j m1034c(C0454t tVar, C1428a aVar, C19857l lVar, boolean z) {
        C19383o.m32797g(tVar, "animationSpec");
        C19383o.m32797g(aVar, "expandFrom");
        C19383o.m32797g(lVar, "initialSize");
        return new C0474j(new C0489x((C0477m) null, new C0470f(tVar, aVar, lVar, z), (C0482q) null, 11));
    }

    /* renamed from: d */
    public static C0474j m1035d() {
        C8345d dVar = C0467z0.f1203a;
        return m1034c(C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1), C1428a.C1429a.f3112h, EnterExitTransitionKt$expandIn$1.INSTANCE, true);
    }

    /* renamed from: e */
    public static C0474j m1036e() {
        C8345d dVar = C0467z0.f1203a;
        C0429h0 L0 = C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1);
        C1432b.C1434b bVar = C1428a.C1429a.f3115k;
        EnterExitTransitionKt$expandVertically$1 enterExitTransitionKt$expandVertically$1 = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        C19383o.m32797g(enterExitTransitionKt$expandVertically$1, "initialHeight");
        return m1034c(L0, C19383o.m32792b(bVar, C1428a.C1429a.f3113i) ? C1428a.C1429a.f3106b : C19383o.m32792b(bVar, bVar) ? C1428a.C1429a.f3111g : C1428a.C1429a.f3108d, new EnterExitTransitionKt$expandVertically$2(enterExitTransitionKt$expandVertically$1), true);
    }

    /* renamed from: f */
    public static C0474j m1037f(C0433j0 j0Var, int i) {
        C0454t tVar = j0Var;
        if ((i & 1) != 0) {
            tVar = C0761x.m1678L0(0.0f, 400.0f, (Object) null, 5);
        }
        C19383o.m32797g(tVar, "animationSpec");
        return new C0474j(new C0489x(new C0477m(0.0f, tVar), (C0470f) null, (C0482q) null, 14));
    }

    /* renamed from: g */
    public static C0476l m1038g(C0433j0 j0Var, int i) {
        C0454t tVar = j0Var;
        if ((i & 1) != 0) {
            tVar = C0761x.m1678L0(0.0f, 400.0f, (Object) null, 5);
        }
        C19383o.m32797g(tVar, "animationSpec");
        return new C0476l(new C0489x(new C0477m(0.0f, tVar), (C0470f) null, (C0482q) null, 14));
    }

    /* renamed from: h */
    public static C0474j m1039h(C0433j0 j0Var) {
        return new C0474j(new C0489x((C0477m) null, (C0470f) null, new C0482q(0.92f, C1540p0.f3337b, j0Var), 7));
    }

    /* renamed from: i */
    public static C0476l m1040i() {
        C8345d dVar = C0467z0.f1203a;
        C0429h0 L0 = C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1);
        C1432b.C1433a aVar = C1428a.C1429a.f3118n;
        EnterExitTransitionKt$shrinkHorizontally$1 enterExitTransitionKt$shrinkHorizontally$1 = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        C19383o.m32797g(enterExitTransitionKt$shrinkHorizontally$1, "targetWidth");
        return m1041j(L0, C19383o.m32792b(aVar, C1428a.C1429a.f3116l) ? C1428a.C1429a.f3107c : C19383o.m32792b(aVar, aVar) ? C1428a.C1429a.f3109e : C1428a.C1429a.f3108d, new EnterExitTransitionKt$shrinkHorizontally$2(enterExitTransitionKt$shrinkHorizontally$1), true);
    }

    /* renamed from: j */
    public static final C0476l m1041j(C0454t tVar, C1428a aVar, C19857l lVar, boolean z) {
        C19383o.m32797g(tVar, "animationSpec");
        C19383o.m32797g(aVar, "shrinkTowards");
        C19383o.m32797g(lVar, "targetSize");
        return new C0476l(new C0489x((C0477m) null, new C0470f(tVar, aVar, lVar, z), (C0482q) null, 11));
    }

    /* renamed from: k */
    public static C0476l m1042k() {
        C8345d dVar = C0467z0.f1203a;
        return m1041j(C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1), C1428a.C1429a.f3112h, EnterExitTransitionKt$shrinkOut$1.INSTANCE, true);
    }

    /* renamed from: l */
    public static C0476l m1043l() {
        C8345d dVar = C0467z0.f1203a;
        C0429h0 L0 = C0761x.m1678L0(0.0f, 400.0f, new C7290i(C0761x.m1707a(1, 1)), 1);
        C1432b.C1434b bVar = C1428a.C1429a.f3115k;
        EnterExitTransitionKt$shrinkVertically$1 enterExitTransitionKt$shrinkVertically$1 = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        C19383o.m32797g(enterExitTransitionKt$shrinkVertically$1, "targetHeight");
        return m1041j(L0, C19383o.m32792b(bVar, C1428a.C1429a.f3113i) ? C1428a.C1429a.f3106b : C19383o.m32792b(bVar, bVar) ? C1428a.C1429a.f3111g : C1428a.C1429a.f3108d, new EnterExitTransitionKt$shrinkVertically$2(enterExitTransitionKt$shrinkVertically$1), true);
    }
}
