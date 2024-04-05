package kotlinx.coroutines.channels;

/* renamed from: kotlinx.coroutines.channels.x */
public final class C19523x {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.channels.u} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (p628nj.C18263b.m30814I(r8, r0) == r1) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (p628nj.C18263b.m30814I(r6, r0) != r1) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m33272a(long r6, long r8, kotlinx.coroutines.channels.C19519u r10, kotlin.coroutines.C19340c r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0050
            if (r2 == r3) goto L_0x0045
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.u r8 = (kotlinx.coroutines.channels.C19519u) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x007d
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.u r8 = (kotlinx.coroutines.channels.C19519u) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0070
        L_0x0045:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.u r10 = (kotlinx.coroutines.channels.C19519u) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0060
        L_0x0050:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = p628nj.C18263b.m30814I(r8, r0)
            if (r8 != r1) goto L_0x0060
            goto L_0x007c
        L_0x0060:
            kotlin.m r8 = kotlin.C19394m.f43287a
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = r10.mo72188E(r8, r0)
            if (r8 != r1) goto L_0x006f
            goto L_0x007c
        L_0x006f:
            r8 = r10
        L_0x0070:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r9 = p628nj.C18263b.m30814I(r6, r0)
            if (r9 != r1) goto L_0x007d
        L_0x007c:
            return r1
        L_0x007d:
            r10 = r8
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19523x.m33272a(long, long, kotlinx.coroutines.channels.u, kotlin.coroutines.c):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        if (p628nj.C18263b.m30814I(r12 / 1000000, r1) != r2) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m33273b(long r21, long r23, kotlinx.coroutines.channels.C19519u r25, kotlin.coroutines.C19340c r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 2
            if (r3 == 0) goto L_0x0064
            if (r3 == r4) goto L_0x0056
            if (r3 == r7) goto L_0x0049
            if (r3 == r6) goto L_0x0037
            if (r3 != r5) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            long r3 = r1.J$1
            long r8 = r1.J$0
            java.lang.Object r10 = r1.L$0
            kotlinx.coroutines.channels.u r10 = (kotlinx.coroutines.channels.C19519u) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r0 = r10
        L_0x0043:
            r19 = r3
            r3 = r8
            r8 = r19
            goto L_0x008a
        L_0x0049:
            long r3 = r1.J$1
            long r8 = r1.J$0
            java.lang.Object r10 = r1.L$0
            kotlinx.coroutines.channels.u r10 = (kotlinx.coroutines.channels.C19519u) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r0 = r10
            goto L_0x00a1
        L_0x0056:
            long r3 = r1.J$1
            long r8 = r1.J$0
            java.lang.Object r10 = r1.L$0
            kotlinx.coroutines.channels.u r10 = (kotlinx.coroutines.channels.C19519u) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r0 = r10
            r10 = r8
            goto L_0x0086
        L_0x0064:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            long r8 = java.lang.System.nanoTime()
            long r10 = p001a0.C0005b.m30X(r23)
            long r8 = r8 + r10
            r0 = r25
            r1.L$0 = r0
            r10 = r21
            r1.J$0 = r10
            r1.J$1 = r8
            r1.label = r4
            r3 = r23
            java.lang.Object r3 = p628nj.C18263b.m30814I(r3, r1)
            if (r3 != r2) goto L_0x0085
            goto L_0x00e3
        L_0x0085:
            r3 = r8
        L_0x0086:
            long r8 = p001a0.C0005b.m30X(r10)
        L_0x008a:
            long r3 = r3 + r8
            kotlin.m r10 = kotlin.C19394m.f43287a
            r1.L$0 = r0
            r1.J$0 = r3
            r1.J$1 = r8
            r1.label = r7
            java.lang.Object r10 = r0.mo72188E(r10, r1)
            if (r10 != r2) goto L_0x009c
            goto L_0x00e3
        L_0x009c:
            r19 = r3
            r3 = r8
            r8 = r19
        L_0x00a1:
            long r10 = java.lang.System.nanoTime()
            long r12 = r8 - r10
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00ae
            r12 = r14
        L_0x00ae:
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 1000000(0xf4240, double:4.940656E-318)
            if (r16 != 0) goto L_0x00d3
            int r14 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x00d3
            long r8 = r10 - r8
            long r8 = r8 % r3
            long r8 = r3 - r8
            long r10 = r10 + r8
            long r8 = r8 / r17
            r1.L$0 = r0
            r1.J$0 = r10
            r1.J$1 = r3
            r1.label = r6
            java.lang.Object r8 = p628nj.C18263b.m30814I(r8, r1)
            if (r8 != r2) goto L_0x00d0
            goto L_0x00e3
        L_0x00d0:
            r8 = r3
            r3 = r10
            goto L_0x008a
        L_0x00d3:
            long r12 = r12 / r17
            r1.L$0 = r0
            r1.J$0 = r8
            r1.J$1 = r3
            r1.label = r5
            java.lang.Object r10 = p628nj.C18263b.m30814I(r12, r1)
            if (r10 != r2) goto L_0x0043
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19523x.m33273b(long, long, kotlinx.coroutines.channels.u, kotlin.coroutines.c):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }
}
