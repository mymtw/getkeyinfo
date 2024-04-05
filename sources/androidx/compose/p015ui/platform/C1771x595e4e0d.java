package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 */
final class C1771x595e4e0d extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1892z0 $scrollObservationScope;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1771x595e4e0d(C1892z0 z0Var, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = z0Var;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r6 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r9 = this;
            androidx.compose.ui.platform.z0 r0 = r9.$scrollObservationScope
            androidx.compose.ui.semantics.h r1 = r0.f4175f
            androidx.compose.ui.semantics.h r2 = r0.f4176g
            java.lang.Float r3 = r0.f4173d
            java.lang.Float r0 = r0.f4174e
            r4 = 0
            if (r1 == 0) goto L_0x0021
            if (r3 == 0) goto L_0x0021
            kq.a<java.lang.Float> r5 = r1.f4227a
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r3 = r3.floatValue()
            float r5 = r5 - r3
            goto L_0x0022
        L_0x0021:
            r5 = r4
        L_0x0022:
            if (r2 == 0) goto L_0x0038
            if (r0 == 0) goto L_0x0038
            kq.a<java.lang.Float> r3 = r2.f4227a
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r0 = r0.floatValue()
            float r3 = r3 - r0
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0041
            r0 = r7
            goto L_0x0042
        L_0x0041:
            r0 = r6
        L_0x0042:
            if (r0 == 0) goto L_0x004b
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            r6 = r7
        L_0x0049:
            if (r6 != 0) goto L_0x00c0
        L_0x004b:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r9.this$0
            androidx.compose.ui.platform.z0 r4 = r9.$scrollObservationScope
            int r4 = r4.f4171b
            int[] r6 = androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.f3953w
            int r0 = r0.mo7077p(r4)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r9.this$0
            r6 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 8
            androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3908s(r4, r0, r6, r7, r8)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r9.this$0
            r6 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r0 = r4.mo7069c(r0, r6)
            if (r1 == 0) goto L_0x008e
            kq.a<java.lang.Float> r4 = r1.f4227a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setScrollX(r4)
            kq.a<java.lang.Float> r4 = r1.f4228b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setMaxScrollX(r4)
        L_0x008e:
            if (r2 == 0) goto L_0x00b0
            kq.a<java.lang.Float> r4 = r2.f4227a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setScrollY(r4)
            kq.a<java.lang.Float> r4 = r2.f4228b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setMaxScrollY(r4)
        L_0x00b0:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 < r6) goto L_0x00bb
            int r4 = (int) r5
            int r3 = (int) r3
            androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C1765b.m3929a(r0, r4, r3)
        L_0x00bb:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r9.this$0
            r3.mo7078q(r0)
        L_0x00c0:
            if (r1 == 0) goto L_0x00ce
            androidx.compose.ui.platform.z0 r0 = r9.$scrollObservationScope
            kq.a<java.lang.Float> r1 = r1.f4227a
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.f4173d = r1
        L_0x00ce:
            if (r2 == 0) goto L_0x00dc
            androidx.compose.ui.platform.z0 r0 = r9.$scrollObservationScope
            kq.a<java.lang.Float> r1 = r2.f4227a
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.f4174e = r1
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1771x595e4e0d.invoke():void");
    }
}
