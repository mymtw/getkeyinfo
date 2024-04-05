package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", mo70541f = "Deprecated.kt", mo70542l = {269, 270, 271}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements C19861p {
    public final /* synthetic */ C19861p $predicate;
    public final /* synthetic */ C19515q $this_takeWhile;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$takeWhile$1(C19515q qVar, C19861p pVar, C19340c cVar) {
        super(2, cVar);
        this.$this_takeWhile = qVar;
        this.$predicate = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.$this_takeWhile, this.$predicate, cVar);
        channelsKt__DeprecatedKt$takeWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    public final Object invoke(C19513o oVar, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 2
            r4 = 3
            if (r1 == 0) goto L_0x0045
            if (r1 == r2) goto L_0x0035
            if (r1 == r3) goto L_0x0023
            if (r1 != r4) goto L_0x001b
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0053
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.L$2
            java.lang.Object r5 = r9.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C19502f) r5
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r9
            goto L_0x0088
        L_0x0035:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x0067
        L_0x0045:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            r5 = r10
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            kotlinx.coroutines.channels.q r10 = r9.$this_takeWhile
            kotlinx.coroutines.channels.f r1 = r10.iterator()
        L_0x0053:
            r10 = r9
        L_0x0054:
            r10.L$0 = r5
            r10.L$1 = r1
            r10.label = r2
            java.lang.Object r6 = r1.mo72148a(r10)
            if (r6 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L_0x0067:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00a8
            java.lang.Object r10 = r5.next()
            kq.p r7 = r0.$predicate
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r10
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r10, r0)
            if (r7 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r8 = r6
            r6 = r10
            r10 = r7
            r7 = r8
        L_0x0088:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0093
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        L_0x0093:
            r0.L$0 = r7
            r0.L$1 = r5
            r10 = 0
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r10 = r7.mo72188E(r6, r0)
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r10 = r0
            r0 = r1
            r1 = r5
            r5 = r7
            goto L_0x0054
        L_0x00a8:
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
