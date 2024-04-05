package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", mo70541f = "DebugCoroutineInfoImpl.kt", mo70542l = {80}, mo70543m = "yieldFrames")
final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19535b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(C19535b bVar, C19340c<? super DebugCoroutineInfoImpl$yieldFrames$1> cVar) {
        super(cVar);
        this.this$0 = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.result = r8
            int r8 = r7.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.label = r8
            kotlinx.coroutines.debug.internal.b r8 = r7.this$0
            r8.getClass()
            int r1 = r7.label
            r2 = r1 & r0
            if (r2 == 0) goto L_0x0019
            int r1 = r1 - r0
            r7.label = r1
            r0 = r7
            goto L_0x001e
        L_0x0019:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r8, r7)
        L_0x001e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r5) goto L_0x003a
            java.lang.Object r8 = r0.L$2
            gq.b r8 = (p744gq.C19059b) r8
            java.lang.Object r3 = r0.L$1
            kotlin.sequences.i r3 = (kotlin.sequences.C19433i) r3
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.debug.internal.b r4 = (kotlinx.coroutines.debug.internal.C19535b) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x0065
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0042:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r1 = r4
        L_0x0046:
            if (r4 != 0) goto L_0x004b
            kotlin.m r2 = kotlin.C19394m.f43287a
            goto L_0x0072
        L_0x004b:
            java.lang.StackTraceElement r3 = r4.getStackTraceElement()
            if (r3 != 0) goto L_0x0052
            goto L_0x0069
        L_0x0052:
            r0.L$0 = r8
            r0.L$1 = r1
            r0.L$2 = r4
            r0.label = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r1.mo72006a(r3, r0)
            if (r3 != r2) goto L_0x0061
            goto L_0x0072
        L_0x0061:
            r3 = r1
            r6 = r4
            r4 = r8
            r8 = r6
        L_0x0065:
            r1 = r3
            r6 = r4
            r4 = r8
            r8 = r6
        L_0x0069:
            gq.b r4 = r4.getCallerFrame()
            if (r4 == 0) goto L_0x0070
            goto L_0x0046
        L_0x0070:
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
