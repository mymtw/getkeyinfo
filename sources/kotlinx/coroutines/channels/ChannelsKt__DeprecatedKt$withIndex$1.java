package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", mo70541f = "Deprecated.kt", mo70542l = {370, 371}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements C19861p {
    public final /* synthetic */ C19515q $this_withIndex;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(C19515q qVar, C19340c cVar) {
        super(2, cVar);
        this.$this_withIndex = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, cVar);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    public final Object invoke(C19513o oVar, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.channels.f r4 = (kotlinx.coroutines.channels.C19502f) r4
            java.lang.Object r5 = r10.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0044
        L_0x001a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0022:
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.channels.f r4 = (kotlinx.coroutines.channels.C19502f) r4
            java.lang.Object r5 = r10.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r10
            goto L_0x005b
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            java.lang.Object r11 = r10.L$0
            r5 = r11
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            r1 = 0
            kotlinx.coroutines.channels.q r11 = r10.$this_withIndex
            kotlinx.coroutines.channels.f r4 = r11.iterator()
        L_0x0044:
            r11 = r10
        L_0x0045:
            r11.L$0 = r5
            r11.L$1 = r4
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r6 = r4.mo72148a(r11)
            if (r6 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r9 = r0
            r0 = r11
            r11 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r9
        L_0x005b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0083
            java.lang.Object r11 = r5.next()
            kotlin.collections.x r7 = new kotlin.collections.x
            int r8 = r4 + 1
            r7.<init>(r4, r11)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.I$0 = r8
            r0.label = r2
            java.lang.Object r11 = r6.mo72188E(r7, r0)
            if (r11 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r11 = r0
            r0 = r1
            r4 = r5
            r5 = r6
            r1 = r8
            goto L_0x0045
        L_0x0083:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
