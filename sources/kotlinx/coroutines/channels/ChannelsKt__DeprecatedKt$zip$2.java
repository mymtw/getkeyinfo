package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", mo70541f = "Deprecated.kt", mo70542l = {487, 469, 471}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19515q<Object> $other;
    public final /* synthetic */ C19515q<Object> $this_zip;
    public final /* synthetic */ C19861p<Object, Object, Object> $transform;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$zip$2(C19515q<Object> qVar, C19515q<Object> qVar2, C19861p<Object, Object, Object> pVar, C19340c<? super ChannelsKt__DeprecatedKt$zip$2> cVar) {
        super(2, cVar);
        this.$other = qVar;
        this.$this_zip = qVar2;
        this.$transform = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, cVar);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlinx.coroutines.channels.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd A[Catch:{ all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 1
            r3 = 2
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x0076
            if (r1 == r2) goto L_0x0057
            if (r1 == r3) goto L_0x0031
            if (r1 != r4) goto L_0x0029
            java.lang.Object r1 = r13.L$4
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r6 = r13.L$3
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r13.L$2
            kq.p r7 = (p753kq.C19861p) r7
            java.lang.Object r8 = r13.L$1
            kotlinx.coroutines.channels.f r8 = (kotlinx.coroutines.channels.C19502f) r8
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.C19513o) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ all -> 0x010e }
            goto L_0x008c
        L_0x0029:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0031:
            java.lang.Object r1 = r13.L$5
            java.lang.Object r6 = r13.L$4
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C19502f) r6
            java.lang.Object r7 = r13.L$3
            kotlinx.coroutines.channels.q r7 = (kotlinx.coroutines.channels.C19515q) r7
            java.lang.Object r8 = r13.L$2
            kq.p r8 = (p753kq.C19861p) r8
            java.lang.Object r9 = r13.L$1
            kotlinx.coroutines.channels.f r9 = (kotlinx.coroutines.channels.C19502f) r9
            java.lang.Object r10 = r13.L$0
            kotlinx.coroutines.channels.o r10 = (kotlinx.coroutines.channels.C19513o) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ all -> 0x0054 }
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r13
            goto L_0x00d4
        L_0x0054:
            r14 = move-exception
            goto L_0x010c
        L_0x0057:
            java.lang.Object r1 = r13.L$4
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r6 = r13.L$3
            kotlinx.coroutines.channels.q r6 = (kotlinx.coroutines.channels.C19515q) r6
            java.lang.Object r7 = r13.L$2
            kq.p r7 = (p753kq.C19861p) r7
            java.lang.Object r8 = r13.L$1
            kotlinx.coroutines.channels.f r8 = (kotlinx.coroutines.channels.C19502f) r8
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.C19513o) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)     // Catch:{ all -> 0x010e }
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r13
            goto L_0x00ab
        L_0x0076:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            java.lang.Object r14 = r13.L$0
            r9 = r14
            kotlinx.coroutines.channels.o r9 = (kotlinx.coroutines.channels.C19513o) r9
            kotlinx.coroutines.channels.q<java.lang.Object> r14 = r13.$other
            kotlinx.coroutines.channels.f r8 = r14.iterator()
            kotlinx.coroutines.channels.q<java.lang.Object> r6 = r13.$this_zip
            kq.p<java.lang.Object, java.lang.Object, java.lang.Object> r7 = r13.$transform
            kotlinx.coroutines.channels.f r1 = r6.iterator()     // Catch:{ all -> 0x010e }
        L_0x008c:
            r14 = r13
        L_0x008d:
            r14.L$0 = r9     // Catch:{ all -> 0x010e }
            r14.L$1 = r8     // Catch:{ all -> 0x010e }
            r14.L$2 = r7     // Catch:{ all -> 0x010e }
            r14.L$3 = r6     // Catch:{ all -> 0x010e }
            r14.L$4 = r1     // Catch:{ all -> 0x010e }
            r14.L$5 = r5     // Catch:{ all -> 0x010e }
            r14.label = r2     // Catch:{ all -> 0x010e }
            java.lang.Object r10 = r1.mo72148a(r14)     // Catch:{ all -> 0x010e }
            if (r10 != r0) goto L_0x00a2
            return r0
        L_0x00a2:
            r12 = r0
            r0 = r14
            r14 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r12
        L_0x00ab:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0054 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0054 }
            if (r14 == 0) goto L_0x0104
            java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x0054 }
            r0.L$0 = r10     // Catch:{ all -> 0x0054 }
            r0.L$1 = r9     // Catch:{ all -> 0x0054 }
            r0.L$2 = r8     // Catch:{ all -> 0x0054 }
            r0.L$3 = r7     // Catch:{ all -> 0x0054 }
            r0.L$4 = r6     // Catch:{ all -> 0x0054 }
            r0.L$5 = r14     // Catch:{ all -> 0x0054 }
            r0.label = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r11 = r9.mo72148a(r0)     // Catch:{ all -> 0x0054 }
            if (r11 != r1) goto L_0x00cc
            return r1
        L_0x00cc:
            r12 = r6
            r6 = r14
            r14 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r12
        L_0x00d4:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0102 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0102 }
            if (r14 != 0) goto L_0x00dd
            goto L_0x00fa
        L_0x00dd:
            java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x0102 }
            java.lang.Object r14 = r9.invoke(r6, r14)     // Catch:{ all -> 0x0102 }
            r0.L$0 = r11     // Catch:{ all -> 0x0102 }
            r0.L$1 = r10     // Catch:{ all -> 0x0102 }
            r0.L$2 = r9     // Catch:{ all -> 0x0102 }
            r0.L$3 = r8     // Catch:{ all -> 0x0102 }
            r0.L$4 = r7     // Catch:{ all -> 0x0102 }
            r0.L$5 = r5     // Catch:{ all -> 0x0102 }
            r0.label = r4     // Catch:{ all -> 0x0102 }
            java.lang.Object r14 = r11.mo72188E(r14, r0)     // Catch:{ all -> 0x0102 }
            if (r14 != r1) goto L_0x00fa
            return r1
        L_0x00fa:
            r14 = r0
            r0 = r1
            r1 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            goto L_0x008d
        L_0x0102:
            r14 = move-exception
            goto L_0x0110
        L_0x0104:
            kotlin.m r14 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0054 }
            kotlin.jvm.internal.C19388s.m32827J(r7, r5)
            kotlin.m r14 = kotlin.C19394m.f43287a
            return r14
        L_0x010c:
            r8 = r7
            goto L_0x0110
        L_0x010e:
            r14 = move-exception
            r8 = r6
        L_0x0110:
            throw r14     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r8, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
