package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.sync.MutexImpl;
import p174m0.C7282b;

public final class PressGestureScopeImpl implements C0612j, C7282b {

    /* renamed from: b */
    public final /* synthetic */ C7282b f1334b;

    /* renamed from: c */
    public boolean f1335c;

    /* renamed from: d */
    public boolean f1336d;

    /* renamed from: e */
    public final MutexImpl f1337e = new MutexImpl(false);

    public PressGestureScopeImpl(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        this.f1334b = bVar;
    }

    /* renamed from: A */
    public final long mo3788A(long j) {
        return this.f1334b.mo3788A(j);
    }

    /* renamed from: B0 */
    public final float mo3789B0(float f) {
        return this.f1334b.mo3789B0(f);
    }

    /* renamed from: E0 */
    public final int mo3790E0(long j) {
        return this.f1334b.mo3790E0(j);
    }

    /* renamed from: V */
    public final int mo3791V(float f) {
        return this.f1334b.mo3791V(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3792a0(kotlin.coroutines.C19340c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            boolean r5 = r4.f1335c
            if (r5 != 0) goto L_0x004c
            boolean r5 = r4.f1336d
            if (r5 != 0) goto L_0x004c
            kotlinx.coroutines.sync.MutexImpl r5 = r4.f1337e
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = r5.mo72641c(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            boolean r5 = r0.f1335c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.mo3792a0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b0 */
    public final float mo3793b0(long j) {
        return this.f1334b.mo3793b0(j);
    }

    /* renamed from: e */
    public final float mo3794e(long j) {
        return this.f1334b.mo3794e(j);
    }

    public final float getDensity() {
        return this.f1334b.getDensity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3796l0(kotlin.coroutines.C19340c<? super kotlin.C19394m> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x003b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            r0.label = r3
            java.lang.Object r5 = r4.mo3792a0(r0)
            if (r5 != r1) goto L_0x003b
            return r1
        L_0x003b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0046
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x0046:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.mo3796l0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: p */
    public final float mo3797p(int i) {
        return this.f1334b.mo3797p(i);
    }

    /* renamed from: q */
    public final float mo3798q(float f) {
        return this.f1334b.mo3798q(f);
    }

    /* renamed from: w */
    public final long mo3799w(long j) {
        return this.f1334b.mo3799w(j);
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f1334b.mo3800w0();
    }
}
