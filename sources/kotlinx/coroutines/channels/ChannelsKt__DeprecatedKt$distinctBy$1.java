package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", mo70541f = "Deprecated.kt", mo70542l = {387, 388, 390}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<Object, C19340c<Object>, Object> $selector;
    public final /* synthetic */ C19515q<Object> $this_distinctBy;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$distinctBy$1(C19515q<Object> qVar, C19861p<Object, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super ChannelsKt__DeprecatedKt$distinctBy$1> cVar) {
        super(2, cVar);
        this.$this_distinctBy = qVar;
        this.$selector = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, cVar);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 1
            r3 = 2
            r4 = 3
            if (r1 == 0) goto L_0x0058
            if (r1 == r2) goto L_0x0043
            if (r1 == r3) goto L_0x002b
            if (r1 != r4) goto L_0x0023
            java.lang.Object r1 = r11.L$3
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C19502f) r5
            java.lang.Object r6 = r11.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            r12 = r11
            goto L_0x00c9
        L_0x0023:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x002b:
            java.lang.Object r1 = r11.L$3
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C19502f) r5
            java.lang.Object r6 = r11.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.C19513o) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r11
            goto L_0x00ac
        L_0x0043:
            java.lang.Object r1 = r11.L$2
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r5 = r11.L$1
            java.util.HashSet r5 = (java.util.HashSet) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r11
            goto L_0x0088
        L_0x0058:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.o r12 = (kotlinx.coroutines.channels.C19513o) r12
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            kotlinx.coroutines.channels.q<java.lang.Object> r5 = r11.$this_distinctBy
            kotlinx.coroutines.channels.f r5 = r5.iterator()
            r6 = r12
            r12 = r11
            r10 = r5
            r5 = r1
            r1 = r10
        L_0x006f:
            r12.L$0 = r6
            r12.L$1 = r5
            r12.L$2 = r1
            r7 = 0
            r12.L$3 = r7
            r12.label = r2
            java.lang.Object r7 = r1.mo72148a(r12)
            if (r7 != r0) goto L_0x0081
            return r0
        L_0x0081:
            r10 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r10
        L_0x0088:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00d6
            java.lang.Object r12 = r5.next()
            kq.p<java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r8 = r0.$selector
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r12
            r0.label = r3
            java.lang.Object r8 = r8.invoke(r12, r0)
            if (r8 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r10 = r6
            r6 = r12
            r12 = r8
            r8 = r7
            r7 = r10
        L_0x00ac:
            boolean r9 = r7.contains(r12)
            if (r9 != 0) goto L_0x00d0
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r5
            r0.L$3 = r12
            r0.label = r4
            java.lang.Object r6 = r8.mo72188E(r6, r0)
            if (r6 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r6 = r7
            r7 = r8
            r10 = r1
            r1 = r12
            r12 = r0
            r0 = r10
        L_0x00c9:
            r6.add(r1)
            r1 = r5
            r5 = r6
            r6 = r7
            goto L_0x006f
        L_0x00d0:
            r12 = r0
            r0 = r1
            r1 = r5
            r5 = r7
            r6 = r8
            goto L_0x006f
        L_0x00d6:
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
