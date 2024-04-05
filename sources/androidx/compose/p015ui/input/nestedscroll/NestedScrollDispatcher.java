package androidx.compose.p015ui.input.nestedscroll;

import kotlinx.coroutines.C19525d0;
import p288y.C8343c;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher */
public final class NestedScrollDispatcher {

    /* renamed from: a */
    public C19846a<? extends C19525d0> f3593a = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    /* renamed from: b */
    public C19525d0 f3594b;

    /* renamed from: c */
    public C1617a f3595c;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo6535a(long r8, long r10, kotlin.coroutines.C19340c<? super p174m0.C7294l> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            goto L_0x0042
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            androidx.compose.ui.input.nestedscroll.a r1 = r7.f3595c
            if (r1 == 0) goto L_0x0047
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo3814a(r2, r4, r6)
            if (r12 != r0) goto L_0x0042
            return r0
        L_0x0042:
            m0.l r12 = (p174m0.C7294l) r12
            long r8 = r12.f16178a
            goto L_0x004b
        L_0x0047:
            int r8 = p174m0.C7294l.f16177c
            long r8 = p174m0.C7294l.f16176b
        L_0x004b:
            m0.l r10 = new m0.l
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher.mo6535a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final long mo6536b(long j, long j2, int i) {
        C1617a aVar = this.f3595c;
        if (aVar != null) {
            return aVar.mo3815d(j, j2, i);
        }
        int i2 = C8343c.f18298e;
        return C8343c.f18295b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo6537c(long r5, kotlin.coroutines.C19340c<? super p174m0.C7294l> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x003f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            androidx.compose.ui.input.nestedscroll.a r7 = r4.f3595c
            if (r7 == 0) goto L_0x0044
            r0.label = r3
            java.lang.Object r7 = r7.mo4013e(r5, r0)
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            m0.l r7 = (p174m0.C7294l) r7
            long r5 = r7.f16178a
            goto L_0x0048
        L_0x0044:
            int r5 = p174m0.C7294l.f16177c
            long r5 = p174m0.C7294l.f16176b
        L_0x0048:
            m0.l r7 = new m0.l
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher.mo6537c(long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final C19525d0 mo6538d() {
        C19525d0 d0Var = (C19525d0) this.f3593a.invoke();
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
