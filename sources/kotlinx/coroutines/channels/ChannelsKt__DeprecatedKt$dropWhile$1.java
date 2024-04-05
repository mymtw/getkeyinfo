package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", mo70541f = "Deprecated.kt", mo70542l = {181, 182, 183, 187, 188}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements C19861p {
    public final /* synthetic */ C19861p $predicate;
    public final /* synthetic */ C19515q $this_dropWhile;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(C19515q qVar, C19861p pVar, C19340c cVar) {
        super(2, cVar);
        this.$this_dropWhile = qVar;
        this.$predicate = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, cVar);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    public final Object invoke(C19513o oVar, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            if (r1 == 0) goto L_0x006c
            if (r1 == r3) goto L_0x005c
            if (r1 == r4) goto L_0x004a
            if (r1 == r5) goto L_0x003e
            if (r1 == r6) goto L_0x002e
            if (r1 != r7) goto L_0x0026
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r2 = r12.L$0
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.C19513o) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r13 = r1
            r1 = r0
            r0 = r12
            goto L_0x00d6
        L_0x0026:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x002e:
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r2 = r12.L$0
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.C19513o) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r3 = r2
            r2 = r0
            r0 = r12
            goto L_0x00e8
        L_0x003e:
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.C19513o) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r10 = r1
            r1 = r0
            r0 = r12
            goto L_0x00c8
        L_0x004a:
            java.lang.Object r1 = r12.L$2
            java.lang.Object r8 = r12.L$1
            kotlinx.coroutines.channels.f r8 = (kotlinx.coroutines.channels.C19502f) r8
            java.lang.Object r9 = r12.L$0
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.C19513o) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r12
            goto L_0x00b1
        L_0x005c:
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.C19513o) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r9 = r8
            r8 = r1
            r1 = r0
            r0 = r12
            goto L_0x0090
        L_0x006c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.channels.o r13 = (kotlinx.coroutines.channels.C19513o) r13
            kotlinx.coroutines.channels.q r1 = r12.$this_dropWhile
            kotlinx.coroutines.channels.f r1 = r1.iterator()
            r8 = r13
            r13 = r12
        L_0x007b:
            r13.L$0 = r8
            r13.L$1 = r1
            r13.L$2 = r2
            r13.label = r3
            java.lang.Object r9 = r1.mo72148a(r13)
            if (r9 != r0) goto L_0x008a
            return r0
        L_0x008a:
            r11 = r0
            r0 = r13
            r13 = r9
            r9 = r8
            r8 = r1
            r1 = r11
        L_0x0090:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00cf
            java.lang.Object r13 = r8.next()
            kq.p r10 = r0.$predicate
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r13
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r13, r0)
            if (r10 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r11 = r9
            r9 = r13
            r13 = r10
            r10 = r11
        L_0x00b1:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x00ca
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r13 = r10.mo72188E(r9, r0)
            if (r13 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            r2 = r10
            goto L_0x00d0
        L_0x00ca:
            r13 = r0
            r0 = r1
            r1 = r8
            r8 = r10
            goto L_0x007b
        L_0x00cf:
            r2 = r9
        L_0x00d0:
            kotlinx.coroutines.channels.q r13 = r0.$this_dropWhile
            kotlinx.coroutines.channels.f r13 = r13.iterator()
        L_0x00d6:
            r0.L$0 = r2
            r0.L$1 = r13
            r0.label = r6
            java.lang.Object r3 = r13.mo72148a(r0)
            if (r3 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            r11 = r1
            r1 = r13
            r13 = r3
            r3 = r2
            r2 = r11
        L_0x00e8:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0105
            java.lang.Object r13 = r1.next()
            r0.L$0 = r3
            r0.L$1 = r1
            r0.label = r7
            java.lang.Object r13 = r3.mo72188E(r13, r0)
            if (r13 != r2) goto L_0x0101
            return r2
        L_0x0101:
            r13 = r1
            r1 = r2
            r2 = r3
            goto L_0x00d6
        L_0x0105:
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
