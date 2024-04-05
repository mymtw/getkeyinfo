package androidx.compose.foundation.relocation;

import p219r.C7734e;

public final class BringIntoViewRequesterImpl implements C0882d {

    /* renamed from: a */
    public final C7734e<C0883e> f1884a = new C7734e<>(new C0883e[16]);

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r13 >= r2) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo4403a(p288y.C8345d r13, kotlin.coroutines.C19340c<? super kotlin.C19394m> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r13 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.L$0
            y.d r5 = (p288y.C8345d) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r14 = r5
            goto L_0x0092
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r.e<androidx.compose.foundation.relocation.e> r14 = r12.f1884a
            int r2 = r14.f17157d
            if (r2 <= 0) goto L_0x0095
            r4 = 0
            T[] r14 = r14.f17155b
            r11 = r14
            r14 = r13
            r13 = r4
            r4 = r11
        L_0x004c:
            r5 = r4[r13]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.C0883e) r5
            r0.L$0 = r14
            r0.L$1 = r4
            r0.I$0 = r2
            r0.I$1 = r13
            r0.label = r3
            androidx.compose.ui.layout.j r6 = r5.f1893d
            r7 = 0
            if (r6 == 0) goto L_0x0066
            boolean r8 = r6.mo6685c()
            if (r8 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r6 = r7
        L_0x0067:
            if (r6 != 0) goto L_0x006c
            kotlin.m r5 = kotlin.C19394m.f43287a
            goto L_0x008f
        L_0x006c:
            if (r14 != 0) goto L_0x007d
            long r7 = r6.mo6684a()
            long r7 = androidx.compose.foundation.layout.C0761x.m1698V0(r7)
            long r9 = p288y.C8343c.f18295b
            y.d r7 = p001a0.C0005b.m40h(r9, r7)
            goto L_0x007e
        L_0x007d:
            r7 = r14
        L_0x007e:
            androidx.compose.foundation.relocation.c r8 = r5.f1892c
            if (r8 != 0) goto L_0x0084
            androidx.compose.foundation.relocation.c r8 = r5.f1891b
        L_0x0084:
            java.lang.Object r5 = r8.mo4409a(r7, r6, r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r6) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            kotlin.m r5 = kotlin.C19394m.f43287a
        L_0x008f:
            if (r5 != r1) goto L_0x0092
            return r1
        L_0x0092:
            int r13 = r13 + r3
            if (r13 < r2) goto L_0x004c
        L_0x0095:
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.mo4403a(y.d, kotlin.coroutines.c):java.lang.Object");
    }
}
