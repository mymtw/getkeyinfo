package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo70541f = "Combine.kt", mo70542l = {57, 79, 82}, mo70543m = "invokeSuspend")
final class CombineKt$combineInternal$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<Object[]> $arrayFactory;
    public final /* synthetic */ C19597d<Object>[] $flows;
    public final /* synthetic */ C19600e<Object> $this_combineInternal;
    public final /* synthetic */ C19862q<C19600e<Object>, Object[], C19340c<? super C19394m>, Object> $transform;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(C19597d<Object>[] dVarArr, C19846a<Object[]> aVar, C19862q<? super C19600e<Object>, ? super Object[], ? super C19340c<? super C19394m>, ? extends Object> qVar, C19600e<Object> eVar, C19340c<? super CombineKt$combineInternal$2> cVar) {
        super(2, cVar);
        this.$flows = dVarArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, cVar);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CombineKt$combineInternal$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: kotlinx.coroutines.internal.t[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5 A[LOOP:1: B:28:0x00d5->B:34:0x00f5, LOOP_START, PHI: r6 r9 
      PHI: (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:25:0x00d0, B:34:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v2 kotlin.collections.x) = (r9v1 kotlin.collections.x), (r9v17 kotlin.collections.x) binds: [B:25:0x00d0, B:34:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 3
            if (r2 == 0) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 == r3) goto L_0x0034
            if (r2 != r5) goto L_0x002c
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d r8 = (kotlinx.coroutines.channels.C19499d) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r21)
            r10 = r0
        L_0x0025:
            r19 = r6
            r6 = r2
            r2 = r19
            goto L_0x014e
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0034:
            int r6 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d r8 = (kotlinx.coroutines.channels.C19499d) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r21)
            r10 = r0
            goto L_0x00ad
        L_0x004a:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d r8 = (kotlinx.coroutines.channels.C19499d) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r21)
            r10 = r21
            kotlinx.coroutines.channels.g r10 = (kotlinx.coroutines.channels.C19503g) r10
            java.lang.Object r10 = r10.f43450a
            r14 = r0
            r15 = r9
            goto L_0x00ca
        L_0x0067:
            androidx.compose.foundation.layout.C0761x.m1684O0(r21)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.C19525d0) r2
            kotlinx.coroutines.flow.d<java.lang.Object>[] r7 = r0.$flows
            int r7 = r7.length
            if (r7 != 0) goto L_0x0076
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x0076:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            kotlinx.coroutines.internal.t r8 = p772tq.C20203a.f44779i
            kotlin.collections.C19318k.m32610b1(r9, r8)
            r8 = 6
            r10 = 0
            kotlinx.coroutines.channels.AbstractChannel r8 = p568fn.C17782b.m29872l(r7, r10, r8)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r7)
            r13 = 0
        L_0x0089:
            if (r13 >= r7) goto L_0x00a4
            int r17 = r13 + 1
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r14 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
            kotlinx.coroutines.flow.d<java.lang.Object>[] r12 = r0.$flows
            r16 = 0
            r11 = r14
            r6 = r14
            r14 = r15
            r18 = r15
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            kotlinx.coroutines.C19697g.m33468f(r2, r10, r10, r6, r5)
            r13 = r17
            r15 = r18
            goto L_0x0089
        L_0x00a4:
            byte[] r2 = new byte[r7]
            r10 = r0
            r6 = 0
            r19 = r7
            r7 = r2
        L_0x00ab:
            r2 = r19
        L_0x00ad:
            int r6 = r6 + r4
            byte r6 = (byte) r6
            r10.L$0 = r9
            r10.L$1 = r8
            r10.L$2 = r7
            r10.I$0 = r2
            r10.I$1 = r6
            r10.label = r4
            java.lang.Object r11 = r8.mo72146y(r10)
            if (r11 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            r15 = r9
            r14 = r10
            r10 = r11
            r19 = r6
            r6 = r2
            r2 = r19
        L_0x00ca:
            java.lang.Object r9 = kotlinx.coroutines.channels.C19503g.m33188b(r10)
            kotlin.collections.x r9 = (kotlin.collections.C19331x) r9
            if (r9 != 0) goto L_0x00d5
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x00d5:
            int r10 = r9.f43190a
            r11 = r15[r10]
            T r9 = r9.f43191b
            r15[r10] = r9
            kotlinx.coroutines.internal.t r9 = p772tq.C20203a.f44779i
            if (r11 != r9) goto L_0x00e3
            int r6 = r6 + -1
        L_0x00e3:
            byte r9 = r7[r10]
            if (r9 != r2) goto L_0x00e8
            goto L_0x00f7
        L_0x00e8:
            byte r9 = (byte) r2
            r7[r10] = r9
            java.lang.Object r9 = r8.mo72144w()
            java.lang.Object r9 = kotlinx.coroutines.channels.C19503g.m33188b(r9)
            kotlin.collections.x r9 = (kotlin.collections.C19331x) r9
            if (r9 != 0) goto L_0x00d5
        L_0x00f7:
            if (r6 != 0) goto L_0x0149
            kq.a<java.lang.Object[]> r9 = r14.$arrayFactory
            java.lang.Object r9 = r9.invoke()
            r13 = r9
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            if (r13 != 0) goto L_0x0121
            kq.q<kotlinx.coroutines.flow.e<java.lang.Object>, java.lang.Object[], kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r9 = r14.$transform
            kotlinx.coroutines.flow.e<java.lang.Object> r10 = r14.$this_combineInternal
            r14.L$0 = r15
            r14.L$1 = r8
            r14.L$2 = r7
            r14.I$0 = r6
            r14.I$1 = r2
            r14.label = r3
            java.lang.Object r9 = r9.invoke(r10, r15, r14)
            if (r9 != r1) goto L_0x011b
            return r1
        L_0x011b:
            r10 = r14
            r9 = r15
            r19 = r6
            r6 = r2
            goto L_0x00ab
        L_0x0121:
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 14
            r9 = r15
            r10 = r13
            r3 = r13
            r13 = r16
            r4 = r14
            r14 = r17
            kotlin.collections.C19318k.m32605W0(r9, r10, r11, r12, r13, r14)
            kq.q<kotlinx.coroutines.flow.e<java.lang.Object>, java.lang.Object[], kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r9 = r4.$transform
            kotlinx.coroutines.flow.e<java.lang.Object> r10 = r4.$this_combineInternal
            r4.L$0 = r15
            r4.L$1 = r8
            r4.L$2 = r7
            r4.I$0 = r6
            r4.I$1 = r2
            r4.label = r5
            java.lang.Object r3 = r9.invoke(r10, r3, r4)
            if (r3 != r1) goto L_0x014a
            return r1
        L_0x0149:
            r4 = r14
        L_0x014a:
            r10 = r4
            r9 = r15
            goto L_0x0025
        L_0x014e:
            r3 = 2
            r4 = 1
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
