package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", mo70541f = "Broadcast.kt", mo70542l = {53, 54}, mo70543m = "invokeSuspend")
final class BroadcastKt$broadcast$2 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19515q<Object> $this_broadcast;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastKt$broadcast$2(C19515q<Object> qVar, C19340c<? super BroadcastKt$broadcast$2> cVar) {
        super(2, cVar);
        this.$this_broadcast = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.$this_broadcast, cVar);
        broadcastKt$broadcast$2.L$0 = obj;
        return broadcastKt$broadcast$2;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((BroadcastKt$broadcast$2) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0030
            if (r1 == r2) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.C19513o) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x003e
        L_0x0018:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0020:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.C19513o) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r7
            goto L_0x0052
        L_0x0030:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.C19513o) r4
            kotlinx.coroutines.channels.q<java.lang.Object> r8 = r7.$this_broadcast
            kotlinx.coroutines.channels.f r1 = r8.iterator()
        L_0x003e:
            r8 = r7
        L_0x003f:
            r8.L$0 = r4
            r8.L$1 = r1
            r8.label = r2
            java.lang.Object r5 = r1.mo72148a(r8)
            if (r5 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r6 = r0
            r0 = r8
            r8 = r5
            r5 = r4
            r4 = r1
            r1 = r6
        L_0x0052:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0070
            java.lang.Object r8 = r4.next()
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r8 = r5.mo72188E(r8, r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r8 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L_0x003f
        L_0x0070:
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
