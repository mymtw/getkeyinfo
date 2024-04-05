package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0442o;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.gestures.a */
public final class C0599a implements C0608f {

    /* renamed from: a */
    public final C0442o<Float> f1353a;

    public C0599a(C0442o<Float> oVar) {
        C19383o.m32797g(oVar, "flingDecay");
        this.f1353a = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3858a(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2.C0583a r7, float r8, kotlin.coroutines.C19340c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref$FloatRef) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0066
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            float r9 = java.lang.Math.abs(r8)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0068
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.element = r8
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            r4 = 0
            r5 = 28
            androidx.compose.animation.core.f r8 = androidx.activity.C0114h.m311p(r4, r8, r5)
            androidx.compose.animation.core.o<java.lang.Float> r4 = r6.f1353a
            androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 r5 = new androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2
            r5.<init>(r2, r7, r9)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r7 = androidx.compose.animation.core.SuspendAnimationKt.m1073d(r8, r4, r5, r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r7 = r9
        L_0x0066:
            float r8 = r7.element
        L_0x0068:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0599a.mo3858a(androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$a, float, kotlin.coroutines.c):java.lang.Object");
    }
}
