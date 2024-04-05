package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.compose.p015ui.input.nestedscroll.C1617a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19747k;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7294l;
import p288y.C8343c;

public final class WindowInsetsNestedScrollConnection implements C1617a, WindowInsetsAnimationControlListener {

    /* renamed from: b */
    public final C0716c f1445b;

    /* renamed from: c */
    public final View f1446c;

    /* renamed from: d */
    public final C0710b0 f1447d;

    /* renamed from: e */
    public final C7282b f1448e;

    /* renamed from: f */
    public WindowInsetsAnimationController f1449f;

    /* renamed from: g */
    public boolean f1450g;

    /* renamed from: h */
    public final CancellationSignal f1451h = new CancellationSignal();

    /* renamed from: i */
    public float f1452i;

    /* renamed from: j */
    public C19699g1 f1453j;

    /* renamed from: k */
    public C19747k<? super WindowInsetsAnimationController> f1454k;

    public WindowInsetsNestedScrollConnection(C0716c cVar, View view, C0710b0 b0Var, C7282b bVar) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(b0Var, "sideCalculator");
        C19383o.m32797g(bVar, "density");
        this.f1445b = cVar;
        this.f1446c = view;
        this.f1447d = b0Var;
        this.f1448e = bVar;
    }

    /* renamed from: c */
    public static final void m1511c(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection.f1449f;
        if (windowInsetsAnimationController != null) {
            Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
            C19383o.m32796f(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(windowInsetsNestedScrollConnection.f1447d.mo4077c(currentInsets, C7279a.m13954l(f)), 1.0f, 0.0f);
        }
    }

    /* renamed from: a */
    public final Object mo3814a(long j, long j2, C19340c<? super C7294l> cVar) {
        return mo4016h(j2, this.f1447d.mo4075a(C7294l.m14004b(j2), C7294l.m14005c(j2)), true, cVar);
    }

    /* renamed from: b */
    public final long mo4012b(int i, long j) {
        return mo4018j(j, this.f1447d.mo4078d(C8343c.m16642c(j), C8343c.m16643d(j)));
    }

    /* renamed from: d */
    public final long mo3815d(long j, long j2, int i) {
        return mo4018j(j2, this.f1447d.mo4075a(C8343c.m16642c(j2), C8343c.m16643d(j2)));
    }

    /* renamed from: e */
    public final Object mo4013e(long j, C19340c<? super C7294l> cVar) {
        return mo4016h(j, this.f1447d.mo4078d(C7294l.m14004b(j), C7294l.m14005c(j)), false, cVar);
    }

    /* renamed from: f */
    public final void mo4014f() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f1449f;
        boolean z = true;
        if (windowInsetsAnimationController2 == null || !windowInsetsAnimationController2.isReady()) {
            z = false;
        }
        if (z && (windowInsetsAnimationController = this.f1449f) != null) {
            windowInsetsAnimationController.finish(((Boolean) this.f1445b.f1474d.getValue()).booleanValue());
        }
        this.f1449f = null;
        C19747k<? super WindowInsetsAnimationController> kVar = this.f1454k;
        if (kVar != null) {
            kVar.mo72503v(WindowInsetsNestedScrollConnection$animationEnded$1.INSTANCE, (Object) null);
        }
        this.f1454k = null;
        C19699g1 g1Var = this.f1453j;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.f1453j = null;
        this.f1452i = 0.0f;
        this.f1450g = false;
    }

    /* renamed from: g */
    public final void mo4015g() {
        C19747k<? super WindowInsetsAnimationController> kVar = this.f1454k;
        if (kVar != null) {
            kVar.mo72503v(WindowInsetsNestedScrollConnection$dispose$1.INSTANCE, (Object) null);
        }
        C19699g1 g1Var = this.f1453j;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f1449f;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!C19383o.m32792b(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4016h(long r27, float r29, boolean r30, kotlin.coroutines.C19340c<? super p174m0.C7294l> r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            r3 = r31
            boolean r4 = r3 instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r4.label
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 2
            r12 = 1
            if (r6 == 0) goto L_0x0061
            if (r6 == r12) goto L_0x0055
            if (r6 == r10) goto L_0x0046
            if (r6 != r7) goto L_0x003e
            long r1 = r4.J$0
            java.lang.Object r4 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r3)
            goto L_0x0169
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            long r1 = r4.J$0
            java.lang.Object r5 = r4.L$1
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref$FloatRef) r5
            java.lang.Object r4 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r3)
            goto L_0x01a5
        L_0x0055:
            float r1 = r4.F$0
            long r13 = r4.J$0
            java.lang.Object r2 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r2 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r3)
            goto L_0x00bf
        L_0x0061:
            androidx.compose.foundation.layout.C0761x.m1684O0(r3)
            kotlinx.coroutines.g1 r3 = r0.f1453j
            if (r3 == 0) goto L_0x006b
            r3.mo72134a(r9)
        L_0x006b:
            r0.f1453j = r9
            r0.f1452i = r8
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0075
            r3 = r12
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            if (r3 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x008e
        L_0x007a:
            android.view.WindowInsetsAnimationController r3 = r0.f1449f
            if (r3 != 0) goto L_0x0096
            androidx.compose.foundation.layout.c r3 = r0.f1445b
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.f1474d
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r2) goto L_0x0096
        L_0x008e:
            long r1 = p174m0.C7294l.f16176b
            m0.l r3 = new m0.l
            r3.<init>(r1)
            return r3
        L_0x0096:
            r4.L$0 = r0
            r2 = r27
            r4.J$0 = r2
            r4.F$0 = r1
            r4.label = r12
            android.view.WindowInsetsAnimationController r6 = r0.f1449f
            if (r6 != 0) goto L_0x00b9
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l
            kotlin.coroutines.c r13 = kotlin.jvm.internal.C19388s.m32873m0(r4)
            r6.<init>(r12, r13)
            r6.mo72548n()
            r0.f1454k = r6
            r26.mo4017i()
            java.lang.Object r6 = r6.mo72547l()
        L_0x00b9:
            if (r6 != r5) goto L_0x00bc
            return r5
        L_0x00bc:
            r13 = r2
            r3 = r6
            r2 = r0
        L_0x00bf:
            android.view.WindowInsetsAnimationController r3 = (android.view.WindowInsetsAnimationController) r3
            if (r3 != 0) goto L_0x00cb
            long r1 = p174m0.C7294l.f16176b
            m0.l r3 = new m0.l
            r3.<init>(r1)
            return r3
        L_0x00cb:
            androidx.compose.foundation.layout.b0 r6 = r2.f1447d
            android.graphics.Insets r15 = r3.getHiddenStateInsets()
            java.lang.String r11 = "animationController.hiddenStateInsets"
            kotlin.jvm.internal.C19383o.m32796f(r15, r11)
            int r6 = r6.mo4079e(r15)
            androidx.compose.foundation.layout.b0 r11 = r2.f1447d
            android.graphics.Insets r15 = r3.getShownStateInsets()
            java.lang.String r12 = "animationController.shownStateInsets"
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            int r11 = r11.mo4079e(r15)
            android.graphics.Insets r12 = r3.getCurrentInsets()
            java.lang.String r15 = "animationController.currentInsets"
            kotlin.jvm.internal.C19383o.m32796f(r12, r15)
            androidx.compose.foundation.layout.b0 r15 = r2.f1447d
            int r12 = r15.mo4079e(r12)
            int r15 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r15 > 0) goto L_0x00fe
            if (r12 == r6) goto L_0x0104
        L_0x00fe:
            int r15 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x0116
            if (r12 != r11) goto L_0x0116
        L_0x0104:
            if (r12 != r11) goto L_0x0108
            r11 = 1
            goto L_0x0109
        L_0x0108:
            r11 = 0
        L_0x0109:
            r3.finish(r11)
            r2.f1449f = r9
            long r1 = p174m0.C7294l.f16176b
            m0.l r3 = new m0.l
            r3.<init>(r1)
            return r3
        L_0x0116:
            androidx.compose.foundation.layout.c0 r9 = new androidx.compose.foundation.layout.c0
            m0.b r15 = r2.f1448e
            r9.<init>(r15)
            float r15 = (float) r12
            float r17 = r9.mo4091f(r1)
            float r17 = r17 + r15
            float r15 = (float) r6
            float r18 = r17 - r15
            int r10 = r11 - r6
            float r10 = (float) r10
            float r18 = r18 / r10
            r10 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0135
            r24 = 1
            goto L_0x0137
        L_0x0135:
            r24 = 0
        L_0x0137:
            if (r24 == 0) goto L_0x013c
            r18 = r11
            goto L_0x013e
        L_0x013c:
            r18 = r6
        L_0x013e:
            float r10 = (float) r11
            int r10 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x0175
            int r10 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x0148
            goto L_0x0175
        L_0x0148:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 r6 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3
            r22 = 0
            r15 = r6
            r16 = r2
            r17 = r12
            r19 = r1
            r20 = r3
            r21 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r4.L$0 = r2
            r4.J$0 = r13
            r4.label = r7
            java.lang.Object r1 = kotlinx.coroutines.C19697g.m33466d(r6, r4)
            if (r1 != r5) goto L_0x0167
            return r5
        L_0x0167:
            r4 = r2
            r1 = r13
        L_0x0169:
            androidx.compose.foundation.layout.b0 r3 = r4.f1447d
            long r1 = r3.mo4081g(r1, r8)
            m0.l r3 = new m0.l
            r3.<init>(r1)
            return r3
        L_0x0175:
            kotlin.jvm.internal.Ref$FloatRef r7 = new kotlin.jvm.internal.Ref$FloatRef
            r7.<init>()
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 r8 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2
            r25 = 0
            r15 = r8
            r16 = r2
            r17 = r12
            r18 = r1
            r19 = r9
            r20 = r6
            r21 = r11
            r22 = r7
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.L$0 = r2
            r4.L$1 = r7
            r4.J$0 = r13
            r1 = 2
            r4.label = r1
            java.lang.Object r1 = kotlinx.coroutines.C19697g.m33466d(r8, r4)
            if (r1 != r5) goto L_0x01a2
            return r5
        L_0x01a2:
            r4 = r2
            r5 = r7
            r1 = r13
        L_0x01a5:
            androidx.compose.foundation.layout.b0 r3 = r4.f1447d
            float r4 = r5.element
            long r1 = r3.mo4081g(r1, r4)
            m0.l r3 = new m0.l
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.mo4016h(long, float, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i */
    public final void mo4017i() {
        if (!this.f1450g) {
            this.f1450g = true;
            WindowInsetsController windowInsetsController = this.f1446c.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.controlWindowInsetsAnimation(this.f1445b.f1471a, -1, (Interpolator) null, this.f1451h, this);
            }
        }
    }

    /* renamed from: j */
    public final long mo4018j(long j, float f) {
        C19699g1 g1Var = this.f1453j;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
            this.f1453j = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f1449f;
        boolean z = false;
        if (!(f == 0.0f)) {
            boolean booleanValue = ((Boolean) this.f1445b.f1474d.getValue()).booleanValue();
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i > 0) {
                z = true;
            }
            if (!(booleanValue == z && windowInsetsAnimationController == null)) {
                if (windowInsetsAnimationController == null) {
                    this.f1452i = 0.0f;
                    mo4017i();
                    return this.f1447d.mo4080f(j);
                }
                C0710b0 b0Var = this.f1447d;
                Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                C19383o.m32796f(hiddenStateInsets, "animationController.hiddenStateInsets");
                int e = b0Var.mo4079e(hiddenStateInsets);
                C0710b0 b0Var2 = this.f1447d;
                Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                C19383o.m32796f(shownStateInsets, "animationController.shownStateInsets");
                int e2 = b0Var2.mo4079e(shownStateInsets);
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                C19383o.m32796f(currentInsets, "animationController.currentInsets");
                int e3 = this.f1447d.mo4079e(currentInsets);
                if (e3 == (i > 0 ? e2 : e)) {
                    this.f1452i = 0.0f;
                    return C8343c.f18295b;
                }
                float f2 = ((float) e3) + f + this.f1452i;
                int M = C19388s.m32833M(C7279a.m13954l(f2), e, e2);
                this.f1452i = f2 - ((float) C7279a.m13954l(f2));
                if (M != e3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f1447d.mo4077c(currentInsets, M), 1.0f, 0.0f);
                }
                return this.f1447d.mo4080f(j);
            }
        }
        return C8343c.f18295b;
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        mo4014f();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        C19383o.m32797g(windowInsetsAnimationController, "controller");
        mo4014f();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        C19383o.m32797g(windowInsetsAnimationController, "controller");
        this.f1449f = windowInsetsAnimationController;
        this.f1450g = false;
        C19747k<? super WindowInsetsAnimationController> kVar = this.f1454k;
        if (kVar != null) {
            kVar.mo72503v(WindowInsetsNestedScrollConnection$onReady$1.INSTANCE, windowInsetsAnimationController);
        }
        this.f1454k = null;
    }
}
