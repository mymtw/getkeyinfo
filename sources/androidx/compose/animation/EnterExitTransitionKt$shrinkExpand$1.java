package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class EnterExitTransitionKt$shrinkExpand$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1342k1<C0470f> $expand;
    public final /* synthetic */ String $labelPrefix;
    public final /* synthetic */ C1342k1<C0470f> $shrink;
    public final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, C1342k1<C0470f> k1Var, C1342k1<C0470f> k1Var2, String str) {
        super(3);
        this.$transition = transition;
        this.$expand = k1Var;
        this.$shrink = k1Var2;
        this.$labelPrefix = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        if (r2 == r8) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
        r5 = new androidx.compose.animation.ExpandShrinkModifier(r1, r7, r9, r10, r15);
        r14.mo5454o(r5);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
        r14.mo5406H();
        r2 = (androidx.compose.animation.ExpandShrinkModifier) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0166, code lost:
        if (r12.$transition.mo3410b() != r12.$transition.mo3412d()) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0168, code lost:
        r2.f989g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016d, code lost:
        if (r2.f989g != null) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016f, code lost:
        r15 = (androidx.compose.p015ui.C1428a) r15.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0175, code lost:
        if (r15 != null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        r15 = androidx.compose.p015ui.C1428a.C1429a.f3105a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0179, code lost:
        r2.f989g = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017b, code lost:
        r15 = r12.$expand.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0183, code lost:
        if (r15 == null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0187, code lost:
        if (r15.f1210d != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0189, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018b, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018c, code lost:
        if (r15 != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018e, code lost:
        r15 = r12.$shrink.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0196, code lost:
        if (r15 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019a, code lost:
        if (r15.f1210d != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019c, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019e, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019f, code lost:
        if (r15 == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a3, code lost:
        r15 = androidx.compose.p015ui.C1436d.C1437a.f3125b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a5, code lost:
        if (r3 == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a8, code lost:
        r15 = kotlinx.coroutines.C19543e0.m33287C(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ac, code lost:
        r13 = r13.mo6148i0(r15).mo6148i0(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.C1436d invoke(androidx.compose.p015ui.C1436d r13, androidx.compose.runtime.C1302d r14, int r15) {
        /*
            r12 = this;
            java.lang.String r15 = "$this$composed"
            kotlin.jvm.internal.C19383o.m32797g(r13, r15)
            r15 = -140634085(0xfffffffff79e181b, float:-6.413061E33)
            r14.mo5465u(r15)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r15 = r12.$transition
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.mo5465u(r0)
            boolean r15 = r14.mo5408I(r15)
            java.lang.Object r1 = r14.mo5467v()
            if (r15 != 0) goto L_0x0021
            androidx.compose.runtime.d$a$a r15 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r15) goto L_0x002a
        L_0x0021:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = androidx.compose.foundation.layout.C0761x.m1751w0(r15, androidx.compose.runtime.C1351n1.f2948a)
            r14.mo5454o(r1)
        L_0x002a:
            r14.mo5406H()
            androidx.compose.runtime.j0 r1 = (androidx.compose.runtime.C1338j0) r1
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r15 = r12.$transition
            java.lang.Object r15 = r15.mo3410b()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r12.$transition
            java.lang.Object r2 = r2.mo3412d()
            r3 = 1
            if (r15 != r2) goto L_0x004c
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r15 = r12.$transition
            boolean r15 = r15.mo3413e()
            if (r15 != 0) goto L_0x004c
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r1.setValue(r15)
            goto L_0x0061
        L_0x004c:
            androidx.compose.runtime.k1<androidx.compose.animation.f> r15 = r12.$expand
            java.lang.Object r15 = r15.getValue()
            if (r15 != 0) goto L_0x005c
            androidx.compose.runtime.k1<androidx.compose.animation.f> r15 = r12.$shrink
            java.lang.Object r15 = r15.getValue()
            if (r15 == 0) goto L_0x0061
        L_0x005c:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r1.setValue(r15)
        L_0x0061:
            java.lang.Object r15 = r1.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x01b4
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r15 = r12.$transition
            androidx.compose.animation.core.Transition$b r15 = r15.mo3411c()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r2 = androidx.compose.animation.EnterExitState.Visible
            boolean r15 = r15.mo3420c(r1, r2)
            androidx.compose.runtime.k1<androidx.compose.animation.f> r1 = r12.$expand
            androidx.compose.runtime.k1<androidx.compose.animation.f> r2 = r12.$shrink
            r4 = 0
            if (r15 == 0) goto L_0x0099
            java.lang.Object r15 = r1.getValue()
            androidx.compose.animation.f r15 = (androidx.compose.animation.C0470f) r15
            if (r15 == 0) goto L_0x008e
            androidx.compose.ui.a r15 = r15.f1207a
            if (r15 != 0) goto L_0x00b1
        L_0x008e:
            java.lang.Object r15 = r2.getValue()
            androidx.compose.animation.f r15 = (androidx.compose.animation.C0470f) r15
            if (r15 == 0) goto L_0x00b0
            androidx.compose.ui.a r15 = r15.f1207a
            goto L_0x00b1
        L_0x0099:
            java.lang.Object r15 = r2.getValue()
            androidx.compose.animation.f r15 = (androidx.compose.animation.C0470f) r15
            if (r15 == 0) goto L_0x00a5
            androidx.compose.ui.a r15 = r15.f1207a
            if (r15 != 0) goto L_0x00b1
        L_0x00a5:
            java.lang.Object r15 = r1.getValue()
            androidx.compose.animation.f r15 = (androidx.compose.animation.C0470f) r15
            if (r15 == 0) goto L_0x00b0
            androidx.compose.ui.a r15 = r15.f1207a
            goto L_0x00b1
        L_0x00b0:
            r15 = r4
        L_0x00b1:
            androidx.compose.runtime.j0 r15 = androidx.compose.foundation.layout.C0761x.m1664E0(r15, r14)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r1 = r12.$transition
            androidx.compose.animation.core.l0 r2 = androidx.compose.animation.core.VectorConvertersKt.f1083h
            java.lang.String r5 = r12.$labelPrefix
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo5465u(r6)
            java.lang.Object r7 = r14.mo5467v()
            androidx.compose.runtime.d$a$a r8 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r7 != r8) goto L_0x00dd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " shrink/expand"
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r14.mo5454o(r7)
        L_0x00dd:
            r14.mo5406H()
            java.lang.String r7 = (java.lang.String) r7
            r11 = 0
            androidx.compose.animation.core.Transition$a r1 = androidx.compose.animation.core.TransitionKt.m1100b(r1, r2, r7, r14, r11)
            r2 = -1553214637(0xffffffffa36bd353, float:-1.2784125E-17)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r5 = r12.$transition
            java.lang.Object r5 = r5.mo3410b()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r7 = r12.$transition
            java.lang.Object r7 = r7.mo3412d()
            if (r5 != r7) goto L_0x00fa
            r5 = r3
            goto L_0x00fb
        L_0x00fa:
            r5 = r11
        L_0x00fb:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r14.mo5475z(r2, r5)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r12.$transition
            int r5 = p174m0.C7287g.f16165c
            androidx.compose.animation.core.l0 r5 = androidx.compose.animation.core.VectorConvertersKt.f1082g
            java.lang.String r7 = r12.$labelPrefix
            r14.mo5465u(r6)
            java.lang.Object r6 = r14.mo5467v()
            if (r6 != r8) goto L_0x0127
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = " InterruptionHandlingOffset"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r14.mo5454o(r6)
        L_0x0127:
            r14.mo5406H()
            java.lang.String r6 = (java.lang.String) r6
            androidx.compose.animation.core.Transition$a r7 = androidx.compose.animation.core.TransitionKt.m1100b(r2, r5, r6, r14, r11)
            r14.mo5404G()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r12.$transition
            androidx.compose.runtime.k1<androidx.compose.animation.f> r9 = r12.$expand
            androidx.compose.runtime.k1<androidx.compose.animation.f> r10 = r12.$shrink
            r14.mo5465u(r0)
            boolean r0 = r14.mo5408I(r2)
            java.lang.Object r2 = r14.mo5467v()
            if (r0 != 0) goto L_0x0148
            if (r2 != r8) goto L_0x0155
        L_0x0148:
            androidx.compose.animation.ExpandShrinkModifier r2 = new androidx.compose.animation.ExpandShrinkModifier
            r5 = r2
            r6 = r1
            r8 = r9
            r9 = r10
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo5454o(r2)
        L_0x0155:
            r14.mo5406H()
            androidx.compose.animation.ExpandShrinkModifier r2 = (androidx.compose.animation.ExpandShrinkModifier) r2
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r0 = r12.$transition
            java.lang.Object r0 = r0.mo3410b()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r1 = r12.$transition
            java.lang.Object r1 = r1.mo3412d()
            if (r0 != r1) goto L_0x016b
            r2.f989g = r4
            goto L_0x017b
        L_0x016b:
            androidx.compose.ui.a r0 = r2.f989g
            if (r0 != 0) goto L_0x017b
            java.lang.Object r15 = r15.getValue()
            androidx.compose.ui.a r15 = (androidx.compose.p015ui.C1428a) r15
            if (r15 != 0) goto L_0x0179
            androidx.compose.ui.b r15 = androidx.compose.p015ui.C1428a.C1429a.f3105a
        L_0x0179:
            r2.f989g = r15
        L_0x017b:
            androidx.compose.runtime.k1<androidx.compose.animation.f> r15 = r12.$expand
            java.lang.Object r15 = r15.getValue()
            androidx.compose.animation.f r15 = (androidx.compose.animation.C0470f) r15
            if (r15 == 0) goto L_0x018b
            boolean r15 = r15.f1210d
            if (r15 != 0) goto L_0x018b
            r15 = r3
            goto L_0x018c
        L_0x018b:
            r15 = r11
        L_0x018c:
            if (r15 != 0) goto L_0x01a3
            androidx.compose.runtime.k1<androidx.compose.animation.f> r15 = r12.$shrink
            java.lang.Object r15 = r15.getValue()
            androidx.compose.animation.f r15 = (androidx.compose.animation.C0470f) r15
            if (r15 == 0) goto L_0x019e
            boolean r15 = r15.f1210d
            if (r15 != 0) goto L_0x019e
            r15 = r3
            goto L_0x019f
        L_0x019e:
            r15 = r11
        L_0x019f:
            if (r15 == 0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r3 = r11
        L_0x01a3:
            androidx.compose.ui.d$a r15 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            if (r3 == 0) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            androidx.compose.ui.d r15 = kotlinx.coroutines.C19543e0.m33287C(r15)
        L_0x01ac:
            androidx.compose.ui.d r13 = r13.mo6148i0(r15)
            androidx.compose.ui.d r13 = r13.mo6148i0(r2)
        L_0x01b4:
            r14.mo5406H()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.invoke(androidx.compose.ui.d, androidx.compose.runtime.d, int):androidx.compose.ui.d");
    }
}
