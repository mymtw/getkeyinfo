package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", mo70541f = "Deprecated.kt", mo70542l = {254, 255}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements C19861p {

    /* renamed from: $n */
    public final /* synthetic */ int f43432$n;
    public final /* synthetic */ C19515q $this_take;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, C19515q qVar, C19340c cVar) {
        super(2, cVar);
        this.f43432$n = i;
        this.$this_take = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f43432$n, this.$this_take, cVar);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    public final Object invoke(C19513o oVar, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0034
            if (r1 == r2) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            int r1 = r8.I$0
            java.lang.Object r4 = r8.L$1
            kotlinx.coroutines.channels.f r4 = (kotlinx.coroutines.channels.C19502f) r4
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            r9 = r5
            r5 = r8
            goto L_0x007e
        L_0x001c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0024:
            int r1 = r8.I$0
            java.lang.Object r4 = r8.L$1
            kotlinx.coroutines.channels.f r4 = (kotlinx.coroutines.channels.C19502f) r4
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.C19513o) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            r6 = r5
            r5 = r8
            goto L_0x0062
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.C19513o) r9
            int r1 = r8.f43432$n
            if (r1 != 0) goto L_0x0042
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x0042:
            if (r1 < 0) goto L_0x0046
            r4 = r2
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            if (r4 == 0) goto L_0x0088
            kotlinx.coroutines.channels.q r4 = r8.$this_take
            kotlinx.coroutines.channels.f r4 = r4.iterator()
            r5 = r8
        L_0x0050:
            r5.L$0 = r9
            r5.L$1 = r4
            r5.I$0 = r1
            r5.label = r2
            java.lang.Object r6 = r4.mo72148a(r5)
            if (r6 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r7 = r6
            r6 = r9
            r9 = r7
        L_0x0062:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0085
            java.lang.Object r9 = r4.next()
            r5.L$0 = r6
            r5.L$1 = r4
            r5.I$0 = r1
            r5.label = r3
            java.lang.Object r9 = r6.mo72188E(r9, r5)
            if (r9 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r9 = r6
        L_0x007e:
            int r1 = r1 + -1
            if (r1 != 0) goto L_0x0050
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x0085:
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x0088:
            java.lang.String r9 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r9 = android.support.p013v4.media.C0069a.m175f(r9, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
