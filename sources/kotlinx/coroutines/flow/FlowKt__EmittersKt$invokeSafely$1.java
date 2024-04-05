package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", mo70541f = "Emitters.kt", mo70542l = {216}, mo70543m = "invokeSafely$FlowKt__EmittersKt")
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__EmittersKt$invokeSafely$1(C19340c<? super FlowKt__EmittersKt$invokeSafely$1> cVar) {
        super(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            r4.result = r5
            int r5 = r4.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r0
            r4.label = r5
            r1 = r5 & r0
            if (r1 == 0) goto L_0x0012
            int r5 = r5 - r0
            r4.label = r5
            r5 = r4
            goto L_0x0017
        L_0x0012:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r5 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r5.<init>(r4)
        L_0x0017:
            java.lang.Object r0 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r5 = r5.L$0
            r3 = r5
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x003e }
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r5.L$0 = r3     // Catch:{ all -> 0x003e }
            r5.label = r2     // Catch:{ all -> 0x003e }
            throw r3     // Catch:{ all -> 0x003e }
        L_0x003e:
            r5 = move-exception
            if (r3 == 0) goto L_0x0046
            if (r3 == r5) goto L_0x0046
            p568fn.C17782b.m29886t(r5, r3)
        L_0x0046:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
