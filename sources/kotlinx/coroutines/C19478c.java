package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.c */
public final class C19478c {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33095a(java.util.ArrayList r4, kotlin.coroutines.C19340c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.AwaitKt$joinAll$3
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt$joinAll$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x003a
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.g1 r5 = (kotlinx.coroutines.C19699g1) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo72394c0(r0)
            if (r5 != r1) goto L_0x003a
            return r1
        L_0x0051:
            kotlin.m r4 = kotlin.C19394m.f43287a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19478c.m33095a(java.util.ArrayList, kotlin.coroutines.c):java.lang.Object");
    }
}
