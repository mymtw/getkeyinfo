package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", mo70541f = "Deprecated.kt", mo70542l = {164, 169, 170}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements C19861p {

    /* renamed from: $n */
    public final /* synthetic */ int f43431$n;
    public final /* synthetic */ C19515q $this_drop;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, C19515q qVar, C19340c cVar) {
        super(2, cVar);
        this.f43431$n = i;
        this.$this_drop = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f43431$n, this.$this_drop, cVar);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    public final Object invoke(C19513o oVar, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 2
            r4 = 3
            if (r1 == 0) goto L_0x004f
            if (r1 == r2) goto L_0x0039
            if (r1 == r3) goto L_0x0027
            if (r1 != r4) goto L_0x001f
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r2 = r9.L$0
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.C19513o) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r10 = r1
            r1 = r0
            r0 = r9
            goto L_0x00a9
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r2 = r9.L$0
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.C19513o) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            goto L_0x00bd
        L_0x0039:
            int r1 = r9.I$0
            java.lang.Object r5 = r9.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C19502f) r5
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.C19513o) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r9
            goto L_0x0082
        L_0x004f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.channels.o r10 = (kotlinx.coroutines.channels.C19513o) r10
            int r1 = r9.f43431$n
            if (r1 < 0) goto L_0x005c
            r5 = r2
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            if (r5 == 0) goto L_0x00df
            if (r1 <= 0) goto L_0x00a0
            kotlinx.coroutines.channels.q r5 = r9.$this_drop
            kotlinx.coroutines.channels.f r5 = r5.iterator()
            r6 = r10
            r10 = r9
        L_0x0069:
            r10.L$0 = r6
            r10.L$1 = r5
            r10.I$0 = r1
            r10.label = r2
            java.lang.Object r7 = r5.mo72148a(r10)
            if (r7 != r0) goto L_0x0078
            return r0
        L_0x0078:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        L_0x0082:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x009c
            r6.next()
            int r10 = r2 + -1
            if (r10 != 0) goto L_0x0092
            goto L_0x009c
        L_0x0092:
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
            goto L_0x0069
        L_0x009c:
            r3 = r4
            r4 = r5
            r2 = r7
            goto L_0x00a3
        L_0x00a0:
            r2 = r10
            r1 = r0
            r0 = r9
        L_0x00a3:
            kotlinx.coroutines.channels.q r10 = r0.$this_drop
            kotlinx.coroutines.channels.f r10 = r10.iterator()
        L_0x00a9:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r5 = r10.mo72148a(r0)
            if (r5 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r8 = r1
            r1 = r10
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
        L_0x00bd:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00dc
            java.lang.Object r10 = r1.next()
            r0.L$0 = r3
            r0.L$1 = r1
            r0.label = r5
            java.lang.Object r10 = r3.mo72188E(r10, r0)
            if (r10 != r2) goto L_0x00d6
            return r2
        L_0x00d6:
            r10 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            goto L_0x00a9
        L_0x00dc:
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        L_0x00df:
            java.lang.String r10 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r10 = android.support.p013v4.media.C0069a.m175f(r10, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
