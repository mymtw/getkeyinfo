package kotlinx.coroutines.rx2;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxChannelKt", mo70541f = "RxChannel.kt", mo70542l = {104}, mo70543m = "collect")
final class RxChannelKt$collect$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public RxChannelKt$collect$1(C19340c<? super RxChannelKt$collect$1> cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        kotlin.jvm.internal.C19388s.m32827J(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.result = r8
            int r8 = r7.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.label = r8
            r1 = r8 & r0
            if (r1 == 0) goto L_0x0012
            int r8 = r8 - r0
            r7.label = r8
            r8 = r7
            goto L_0x0017
        L_0x0012:
            kotlinx.coroutines.rx2.RxChannelKt$collect$1 r8 = new kotlinx.coroutines.rx2.RxChannelKt$collect$1
            r8.<init>(r7)
        L_0x0017:
            java.lang.Object r0 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.label
            r3 = 0
            if (r2 == 0) goto L_0x0066
            r4 = 1
            if (r2 != r4) goto L_0x005e
            java.lang.Object r2 = r8.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r5 = r8.L$1
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r8.L$0
            kq.l r6 = (p753kq.C19857l) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x0050 }
        L_0x0032:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0050 }
            r6.invoke(r0)     // Catch:{ all -> 0x0050 }
            r8.L$0 = r6     // Catch:{ all -> 0x0050 }
            r8.L$1 = r5     // Catch:{ all -> 0x0050 }
            r8.L$2 = r2     // Catch:{ all -> 0x0050 }
            r8.label = r4     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r2.mo72148a(r8)     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0032
            goto L_0x0057
        L_0x0050:
            r8 = move-exception
            goto L_0x0058
        L_0x0052:
            kotlin.jvm.internal.C19388s.m32827J(r5, r3)
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x0057:
            return r1
        L_0x0058:
            throw r8     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r5, r8)
            throw r0
        L_0x005e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0066:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            kotlinx.coroutines.rx2.d r8 = new kotlinx.coroutines.rx2.d
            r8.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxChannelKt$collect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
