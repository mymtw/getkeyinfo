package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", mo70541f = "Deprecated.kt", mo70542l = {487, 333, 333}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19515q<Object> $this_map;
    public final /* synthetic */ C19861p<Object, C19340c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$map$1(C19515q<Object> qVar, C19861p<Object, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super ChannelsKt__DeprecatedKt$map$1> cVar) {
        super(2, cVar);
        this.$this_map = qVar;
        this.$transform = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, cVar);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098 A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
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
            if (r1 == 0) goto L_0x0067
            if (r1 == r3) goto L_0x004e
            if (r1 == r4) goto L_0x002c
            if (r1 != r5) goto L_0x0024
            java.lang.Object r1 = r12.L$3
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r6 = r12.L$2
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r12.L$1
            kq.p r7 = (p753kq.C19861p) r7
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.C19513o) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x00d7 }
            goto L_0x0077
        L_0x0024:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x002c:
            java.lang.Object r1 = r12.L$4
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.C19513o) r1
            java.lang.Object r6 = r12.L$3
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r12.L$2
            kotlinx.coroutines.channels.q r7 = (kotlinx.coroutines.channels.C19515q) r7
            java.lang.Object r8 = r12.L$1
            kq.p r8 = (p753kq.C19861p) r8
            java.lang.Object r9 = r12.L$0
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.C19513o) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x004b }
            r10 = r9
            r9 = r8
            r8 = r1
            r1 = r0
            r0 = r13
            r13 = r12
            goto L_0x00b3
        L_0x004b:
            r13 = move-exception
            goto L_0x00d9
        L_0x004e:
            java.lang.Object r1 = r12.L$3
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r6 = r12.L$2
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r12.L$1
            kq.p r7 = (p753kq.C19861p) r7
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.C19513o) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)     // Catch:{ all -> 0x00d7 }
            r9 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r12
            goto L_0x0090
        L_0x0067:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            java.lang.Object r13 = r12.L$0
            r8 = r13
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.C19513o) r8
            kotlinx.coroutines.channels.q<java.lang.Object> r6 = r12.$this_map
            kq.p<java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r7 = r12.$transform
            kotlinx.coroutines.channels.f r1 = r6.iterator()     // Catch:{ all -> 0x00d7 }
        L_0x0077:
            r13 = r12
        L_0x0078:
            r13.L$0 = r8     // Catch:{ all -> 0x00d7 }
            r13.L$1 = r7     // Catch:{ all -> 0x00d7 }
            r13.L$2 = r6     // Catch:{ all -> 0x00d7 }
            r13.L$3 = r1     // Catch:{ all -> 0x00d7 }
            r13.label = r3     // Catch:{ all -> 0x00d7 }
            java.lang.Object r9 = r1.mo72148a(r13)     // Catch:{ all -> 0x00d7 }
            if (r9 != r0) goto L_0x0089
            return r0
        L_0x0089:
            r11 = r0
            r0 = r13
            r13 = r9
            r9 = r7
            r7 = r6
            r6 = r1
            r1 = r11
        L_0x0090:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x00d4 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x00d4 }
            if (r13 == 0) goto L_0x00cc
            java.lang.Object r13 = r6.next()     // Catch:{ all -> 0x00d4 }
            r0.L$0 = r8     // Catch:{ all -> 0x00d4 }
            r0.L$1 = r9     // Catch:{ all -> 0x00d4 }
            r0.L$2 = r7     // Catch:{ all -> 0x00d4 }
            r0.L$3 = r6     // Catch:{ all -> 0x00d4 }
            r0.L$4 = r8     // Catch:{ all -> 0x00d4 }
            r0.label = r4     // Catch:{ all -> 0x00d4 }
            java.lang.Object r13 = r9.invoke(r13, r0)     // Catch:{ all -> 0x00d4 }
            if (r13 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r10 = r8
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x00b3:
            r13.L$0 = r10     // Catch:{ all -> 0x004b }
            r13.L$1 = r9     // Catch:{ all -> 0x004b }
            r13.L$2 = r7     // Catch:{ all -> 0x004b }
            r13.L$3 = r6     // Catch:{ all -> 0x004b }
            r13.L$4 = r2     // Catch:{ all -> 0x004b }
            r13.label = r5     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r8.mo72188E(r0, r13)     // Catch:{ all -> 0x004b }
            if (r0 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            r0 = r1
            r1 = r6
            r6 = r7
            r7 = r9
            r8 = r10
            goto L_0x0078
        L_0x00cc:
            kotlin.m r13 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00d4 }
            kotlin.jvm.internal.C19388s.m32827J(r7, r2)
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        L_0x00d4:
            r13 = move-exception
            r6 = r7
            goto L_0x00d8
        L_0x00d7:
            r13 = move-exception
        L_0x00d8:
            r7 = r6
        L_0x00d9:
            throw r13     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r7, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
