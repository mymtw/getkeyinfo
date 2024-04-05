package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", mo70541f = "Deprecated.kt", mo70542l = {211, 212, 212}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements C19861p {
    public final /* synthetic */ C19862q $predicate;
    public final /* synthetic */ C19515q $this_filterIndexed;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(C19515q qVar, C19862q qVar2, C19340c cVar) {
        super(2, cVar);
        this.$this_filterIndexed = qVar;
        this.$predicate = qVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, cVar);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    public final Object invoke(C19513o oVar, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r1 == 0) goto L_0x0050
            if (r1 == r5) goto L_0x003d
            if (r1 == r3) goto L_0x0026
            if (r1 != r4) goto L_0x001e
            int r1 = r13.I$0
            java.lang.Object r6 = r13.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r13.L$0
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x005f
        L_0x001e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0026:
            int r1 = r13.I$0
            java.lang.Object r6 = r13.L$2
            java.lang.Object r7 = r13.L$1
            kotlinx.coroutines.channels.f r7 = (kotlinx.coroutines.channels.C19502f) r7
            java.lang.Object r8 = r13.L$0
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.C19513o) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r10 = r1
            r1 = r0
            r0 = r13
            r12 = r7
            r7 = r6
        L_0x003a:
            r6 = r12
            goto L_0x00a2
        L_0x003d:
            int r1 = r13.I$0
            java.lang.Object r6 = r13.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r13.L$0
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r13
            goto L_0x0078
        L_0x0050:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            java.lang.Object r14 = r13.L$0
            r7 = r14
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            r1 = 0
            kotlinx.coroutines.channels.q r14 = r13.$this_filterIndexed
            kotlinx.coroutines.channels.f r6 = r14.iterator()
        L_0x005f:
            r14 = r13
        L_0x0060:
            r14.L$0 = r7
            r14.L$1 = r6
            r14.L$2 = r2
            r14.I$0 = r1
            r14.label = r5
            java.lang.Object r8 = r6.mo72148a(r14)
            if (r8 != r0) goto L_0x0071
            return r0
        L_0x0071:
            r12 = r0
            r0 = r14
            r14 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r12
        L_0x0078:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00c0
            java.lang.Object r14 = r7.next()
            kq.q r9 = r0.$predicate
            int r10 = r6 + 1
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r6)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r14
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r11, r14, r0)
            if (r6 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r12 = r7
            r7 = r14
            r14 = r6
            goto L_0x003a
        L_0x00a2:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00bb
            r0.L$0 = r8
            r0.L$1 = r6
            r0.L$2 = r2
            r0.I$0 = r10
            r0.label = r4
            java.lang.Object r14 = r8.mo72188E(r7, r0)
            if (r14 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            r14 = r0
            r0 = r1
            r7 = r8
            r1 = r10
            goto L_0x0060
        L_0x00c0:
            kotlin.m r14 = kotlin.C19394m.f43287a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
