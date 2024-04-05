package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0426g;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19792s;
import p288y.C8343c;

public final class RippleAnimation {

    /* renamed from: a */
    public C8343c f2561a;

    /* renamed from: b */
    public final float f2562b;

    /* renamed from: c */
    public final boolean f2563c;

    /* renamed from: d */
    public Float f2564d;

    /* renamed from: e */
    public Float f2565e;

    /* renamed from: f */
    public C8343c f2566f;

    /* renamed from: g */
    public final Animatable<Float, C0426g> f2567g = C19421p.m32945m(0.0f);

    /* renamed from: h */
    public final Animatable<Float, C0426g> f2568h = C19421p.m32945m(0.0f);

    /* renamed from: i */
    public final Animatable<Float, C0426g> f2569i = C19421p.m32945m(0.0f);

    /* renamed from: j */
    public final C19792s f2570j = new C19792s((C19699g1) null);

    /* renamed from: k */
    public final ParcelableSnapshotMutableState f2571k;

    /* renamed from: l */
    public final ParcelableSnapshotMutableState f2572l;

    public RippleAnimation(C8343c cVar, float f, boolean z) {
        this.f2561a = cVar;
        this.f2562b = f;
        this.f2563c = z;
        Boolean bool = Boolean.FALSE;
        this.f2571k = C0761x.m1751w0(bool, C1351n1.f2948a);
        this.f2572l = C0761x.m1751w0(bool, C1351n1.f2948a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5305a(kotlin.coroutines.C19340c<? super kotlin.C19394m> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x008b
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0073
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x005f
        L_0x0046:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            r0.L$0 = r7
            r0.label = r5
            androidx.compose.material.ripple.RippleAnimation$fadeIn$2 r8 = new androidx.compose.material.ripple.RippleAnimation$fadeIn$2
            r8.<init>(r7, r6)
            java.lang.Object r8 = kotlinx.coroutines.C19697g.m33466d(r8, r0)
            if (r8 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            kotlin.m r8 = kotlin.C19394m.f43287a
        L_0x005b:
            if (r8 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r7
        L_0x005f:
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r2.f2571k
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r8.setValue(r5)
            kotlinx.coroutines.s r8 = r2.f2570j
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.mo72507I(r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r0.L$0 = r6
            r0.label = r3
            r2.getClass()
            androidx.compose.material.ripple.RippleAnimation$fadeOut$2 r8 = new androidx.compose.material.ripple.RippleAnimation$fadeOut$2
            r8.<init>(r2, r6)
            java.lang.Object r8 = kotlinx.coroutines.C19697g.m33466d(r8, r0)
            if (r8 != r1) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            kotlin.m r8 = kotlin.C19394m.f43287a
        L_0x0088:
            if (r8 != r1) goto L_0x008b
            return r1
        L_0x008b:
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.mo5305a(kotlin.coroutines.c):java.lang.Object");
    }
}
