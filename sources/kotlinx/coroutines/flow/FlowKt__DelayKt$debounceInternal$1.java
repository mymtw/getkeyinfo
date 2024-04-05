package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", mo70541f = "Delay.kt", mo70542l = {222, 355}, mo70543m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements C19862q<C19525d0, C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object> $this_debounceInternal;
    public final /* synthetic */ C19857l<Object, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(C19857l<Object, Long> lVar, C19597d<Object> dVar, C19340c<? super FlowKt__DelayKt$debounceInternal$1> cVar) {
        super(3, cVar);
        this.$timeoutMillisSelector = lVar;
        this.$this_debounceInternal = dVar;
    }

    public final Object invoke(C19525d0 d0Var, C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, cVar);
        flowKt__DelayKt$debounceInternal$1.L$0 = d0Var;
        flowKt__DelayKt$debounceInternal$1.L$1 = eVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|30|34|35|36|(2:38|(1:50)(2:40|(5:42|43|44|45|(1:47))))|51|54|(1:56)(5:57|10|(10:12|(7:14|(1:16)|17|(1:19)(1:20)|(1:31)(1:(5:23|(1:25)|26|(1:28)(9:29|30|34|35|36|(0)|51|54|(0))|28))|31|32)|33|34|35|36|(0)|51|54|(0)(0))|58|59)|56) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0101, code lost:
        r13.resumeWith(kotlin.Result.m35480constructorimpl(androidx.compose.foundation.layout.C0761x.m1673J(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0133, code lost:
        r13.mo72630H(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc A[Catch:{ all -> 0x0100, all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r7) goto L_0x002e
            if (r2 != r6) goto L_0x0026
            java.lang.Object r2 = r1.L$3
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref$LongRef) r2
            java.lang.Object r2 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r9 = r1.L$1
            kotlinx.coroutines.channels.q r9 = (kotlinx.coroutines.channels.C19515q) r9
            java.lang.Object r10 = r1.L$0
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C19600e) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            goto L_0x0062
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x002e:
            java.lang.Object r2 = r1.L$3
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref$LongRef) r2
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            java.lang.Object r10 = r1.L$1
            kotlinx.coroutines.channels.q r10 = (kotlinx.coroutines.channels.C19515q) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.C19600e) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            r12 = r11
            r11 = r1
            goto L_0x00ad
        L_0x0045:
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.C19525d0) r2
            java.lang.Object r9 = r1.L$1
            r10 = r9
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C19600e) r10
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.d<java.lang.Object> r11 = r1.$this_debounceInternal
            r9.<init>(r11, r8)
            r11 = 3
            kotlinx.coroutines.channels.n r9 = kotlinx.coroutines.channels.ProduceKt.m33139b(r2, r5, r9, r11)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
        L_0x0062:
            r11 = r1
        L_0x0063:
            T r12 = r2.element
            kotlinx.coroutines.internal.t r13 = p772tq.C20203a.f44780j
            if (r12 == r13) goto L_0x0147
            kotlin.jvm.internal.Ref$LongRef r12 = new kotlin.jvm.internal.Ref$LongRef
            r12.<init>()
            T r13 = r2.element
            if (r13 == 0) goto L_0x00c1
            kq.l<java.lang.Object, java.lang.Long> r14 = r11.$timeoutMillisSelector
            kotlinx.coroutines.internal.t r15 = p772tq.C20203a.f44778h
            if (r13 != r15) goto L_0x0079
            r13 = r8
        L_0x0079:
            java.lang.Object r13 = r14.invoke(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            r12.element = r13
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x008b
            r14 = r7
            goto L_0x008c
        L_0x008b:
            r14 = r5
        L_0x008c:
            if (r14 == 0) goto L_0x00b5
            if (r13 != 0) goto L_0x00c1
            T r13 = r2.element
            if (r13 != r15) goto L_0x0095
            r13 = r8
        L_0x0095:
            r11.L$0 = r10
            r11.L$1 = r9
            r11.L$2 = r2
            r11.L$3 = r12
            r11.label = r7
            java.lang.Object r13 = r10.emit(r13, r11)
            if (r13 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            r17 = r9
            r9 = r2
            r2 = r12
            r12 = r10
            r10 = r17
        L_0x00ad:
            r9.element = r8
            r17 = r2
            r2 = r0
            r0 = r17
            goto L_0x00c9
        L_0x00b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Debounce timeout should not be negative"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00c1:
            r17 = r2
            r2 = r0
            r0 = r12
            r12 = r10
            r10 = r9
            r9 = r17
        L_0x00c9:
            r11.L$0 = r12
            r11.L$1 = r10
            r11.L$2 = r9
            r11.L$3 = r0
            r11.label = r6
            kotlinx.coroutines.selects.a r13 = new kotlinx.coroutines.selects.a
            r13.<init>(r11)
            T r14 = r9.element     // Catch:{ all -> 0x0132 }
            if (r14 == 0) goto L_0x0125
            long r14 = r0.element     // Catch:{ all -> 0x0132 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1     // Catch:{ all -> 0x0132 }
            r0.<init>(r12, r9, r8)     // Catch:{ all -> 0x0132 }
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 > 0) goto L_0x010d
            boolean r14 = r13.mo72634k()     // Catch:{ all -> 0x0132 }
            if (r14 == 0) goto L_0x0125
            kotlin.jvm.internal.C19389t.m32910d(r7, r0)     // Catch:{ all -> 0x0100 }
            java.lang.Object r0 = r0.invoke(r13)     // Catch:{ all -> 0x0100 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r14 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0132 }
            if (r0 == r14) goto L_0x0125
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x0132 }
            r13.resumeWith(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x0125
        L_0x0100:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)     // Catch:{ all -> 0x0132 }
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x0132 }
            r13.resumeWith(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x0125
        L_0x010d:
            kotlinx.coroutines.selects.b r3 = new kotlinx.coroutines.selects.b     // Catch:{ all -> 0x0132 }
            r3.<init>(r13, r0)     // Catch:{ all -> 0x0132 }
            kotlin.coroutines.CoroutineContext r0 = r13.getContext()     // Catch:{ all -> 0x0132 }
            kotlinx.coroutines.j0 r0 = p628nj.C18263b.m30821P(r0)     // Catch:{ all -> 0x0132 }
            kotlin.coroutines.CoroutineContext r4 = r13.getContext()     // Catch:{ all -> 0x0132 }
            kotlinx.coroutines.p0 r0 = r0.mo72115i(r14, r3, r4)     // Catch:{ all -> 0x0132 }
            r13.mo72632h(r0)     // Catch:{ all -> 0x0132 }
        L_0x0125:
            kotlinx.coroutines.selects.d r0 = r10.mo72140q()     // Catch:{ all -> 0x0132 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2     // Catch:{ all -> 0x0132 }
            r3.<init>(r9, r12, r8)     // Catch:{ all -> 0x0132 }
            r0.mo72161A(r13, r3)     // Catch:{ all -> 0x0132 }
            goto L_0x0136
        L_0x0132:
            r0 = move-exception
            r13.mo72630H(r0)
        L_0x0136:
            java.lang.Object r0 = r13.mo72629G()
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r0 != r2) goto L_0x013f
            return r2
        L_0x013f:
            r0 = r2
            r2 = r9
            r9 = r10
            r10 = r12
            r3 = 0
            goto L_0x0063
        L_0x0147:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
