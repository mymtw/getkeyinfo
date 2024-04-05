package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", mo70541f = "Deprecated.kt", mo70542l = {344, 345, 345}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19515q<Object> $this_mapIndexed;
    public final /* synthetic */ C19862q<Integer, Object, C19340c<Object>, Object> $transform;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(C19515q<Object> qVar, C19862q<? super Integer, Object, ? super C19340c<Object>, ? extends Object> qVar2, C19340c<? super ChannelsKt__DeprecatedKt$mapIndexed$1> cVar) {
        super(2, cVar);
        this.$this_mapIndexed = qVar;
        this.$transform = qVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, cVar);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r4) goto L_0x003f
            if (r1 == r2) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            int r1 = r12.I$0
            java.lang.Object r5 = r12.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C19502f) r5
            java.lang.Object r6 = r12.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            goto L_0x0060
        L_0x001d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0025:
            int r1 = r12.I$0
            java.lang.Object r5 = r12.L$2
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            java.lang.Object r6 = r12.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r12.L$0
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r9 = r1
            r1 = r0
            r0 = r13
            r13 = r12
            r11 = r6
            r6 = r5
            r5 = r11
            goto L_0x00a1
        L_0x003f:
            int r1 = r12.I$0
            java.lang.Object r5 = r12.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C19502f) r5
            java.lang.Object r6 = r12.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r7 = r5
            r5 = r1
            r1 = r0
            r0 = r12
            goto L_0x0076
        L_0x0051:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            java.lang.Object r13 = r12.L$0
            r6 = r13
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            r1 = 0
            kotlinx.coroutines.channels.q<java.lang.Object> r13 = r12.$this_mapIndexed
            kotlinx.coroutines.channels.f r5 = r13.iterator()
        L_0x0060:
            r13 = r12
        L_0x0061:
            r13.L$0 = r6
            r13.L$1 = r5
            r13.I$0 = r1
            r13.label = r4
            java.lang.Object r7 = r5.mo72148a(r13)
            if (r7 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r11 = r0
            r0 = r13
            r13 = r7
            r7 = r5
            r5 = r1
            r1 = r11
        L_0x0076:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00b7
            java.lang.Object r13 = r7.next()
            kq.q<java.lang.Integer, java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r8 = r0.$transform
            int r9 = r5 + 1
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r6
            r0.I$0 = r9
            r0.label = r2
            java.lang.Object r13 = r8.invoke(r10, r13, r0)
            if (r13 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r5 = r7
            r7 = r6
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x00a1:
            r13.L$0 = r7
            r13.L$1 = r5
            r8 = 0
            r13.L$2 = r8
            r13.I$0 = r9
            r13.label = r3
            java.lang.Object r0 = r6.mo72188E(r0, r13)
            if (r0 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r0 = r1
            r6 = r7
            r1 = r9
            goto L_0x0061
        L_0x00b7:
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
