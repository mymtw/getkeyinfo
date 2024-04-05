package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", mo70541f = "Deprecated.kt", mo70542l = {198, 199, 199}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<Object, C19340c<? super Boolean>, Object> $predicate;
    public final /* synthetic */ C19515q<Object> $this_filter;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filter$1(C19515q<Object> qVar, C19861p<Object, ? super C19340c<? super Boolean>, ? extends Object> pVar, C19340c<? super ChannelsKt__DeprecatedKt$filter$1> cVar) {
        super(2, cVar);
        this.$this_filter = qVar;
        this.$predicate = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, cVar);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 3
            if (r1 == 0) goto L_0x0046
            if (r1 == r3) goto L_0x0036
            if (r1 == r4) goto L_0x0024
            if (r1 != r5) goto L_0x001c
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0054
        L_0x001c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0024:
            java.lang.Object r1 = r10.L$2
            java.lang.Object r6 = r10.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r10.L$0
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r10
            goto L_0x008b
        L_0x0036:
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            goto L_0x006a
        L_0x0046:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            java.lang.Object r11 = r10.L$0
            r6 = r11
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            kotlinx.coroutines.channels.q<java.lang.Object> r11 = r10.$this_filter
            kotlinx.coroutines.channels.f r1 = r11.iterator()
        L_0x0054:
            r11 = r10
        L_0x0055:
            r11.L$0 = r6
            r11.L$1 = r1
            r11.L$2 = r2
            r11.label = r3
            java.lang.Object r7 = r1.mo72148a(r11)
            if (r7 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L_0x006a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a7
            java.lang.Object r11 = r6.next()
            kq.p<java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r11, r0)
            if (r8 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r9 = r7
            r7 = r11
            r11 = r8
            r8 = r9
        L_0x008b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a2
            r0.L$0 = r8
            r0.L$1 = r6
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r11 = r8.mo72188E(r7, r0)
            if (r11 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r11 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            goto L_0x0055
        L_0x00a7:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
