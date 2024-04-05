package kotlin.sequences;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", mo70541f = "_Sequences.kt", mo70542l = {2314, 2319}, mo70543m = "invokeSuspend")
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements C19861p<C19433i<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Object $initial;
    public final /* synthetic */ C19862q<Integer, Object, Object, Object> $operation;
    public final /* synthetic */ C19431g<Object> $this_runningFoldIndexed;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, C19431g<Object> gVar, C19862q<? super Integer, Object, Object, Object> qVar, C19340c<? super SequencesKt___SequencesKt$runningFoldIndexed$1> cVar) {
        super(2, cVar);
        this.$initial = obj;
        this.$this_runningFoldIndexed = gVar;
        this.$operation = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    public final Object invoke(C19433i<Object> iVar, C19340c<? super C19394m> cVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x002d
            if (r1 == r2) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            int r1 = r9.I$0
            java.lang.Object r2 = r9.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r9.L$1
            java.lang.Object r5 = r9.L$0
            kotlin.sequences.i r5 = (kotlin.sequences.C19433i) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x004b
        L_0x001c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0024:
            java.lang.Object r1 = r9.L$0
            kotlin.sequences.i r1 = (kotlin.sequences.C19433i) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r5 = r1
            goto L_0x0042
        L_0x002d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            kotlin.sequences.i r10 = (kotlin.sequences.C19433i) r10
            java.lang.Object r1 = r9.$initial
            r9.L$0 = r10
            r9.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = r10.mo72006a(r1, r9)
            if (r1 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r5 = r10
        L_0x0042:
            r1 = 0
            java.lang.Object r4 = r9.$initial
            kotlin.sequences.g<java.lang.Object> r10 = r9.$this_runningFoldIndexed
            java.util.Iterator r2 = r10.iterator()
        L_0x004b:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x007c
            java.lang.Object r10 = r2.next()
            kq.q<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> r6 = r9.$operation
            int r7 = r1 + 1
            if (r1 < 0) goto L_0x0077
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r1)
            java.lang.Object r4 = r6.invoke(r8, r4, r10)
            r9.L$0 = r5
            r9.L$1 = r4
            r9.L$2 = r2
            r9.I$0 = r7
            r9.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = r5.mo72006a(r4, r9)
            if (r10 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r1 = r7
            goto L_0x004b
        L_0x0077:
            p568fn.C17782b.m29877o0()
            r10 = 0
            throw r10
        L_0x007c:
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
