package kotlin.sequences;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", mo70541f = "_Sequences.kt", mo70542l = {2344, 2347}, mo70543m = "invokeSuspend")
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements C19861p<C19433i<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<Object, Object, Object> $operation;
    public final /* synthetic */ C19431g<Object> $this_runningReduce;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(C19431g<Object> gVar, C19861p<Object, Object, Object> pVar, C19340c<? super SequencesKt___SequencesKt$runningReduce$1> cVar) {
        super(2, cVar);
        this.$this_runningReduce = gVar;
        this.$operation = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, cVar);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    public final Object invoke(C19433i<Object> iVar, C19340c<? super C19394m> cVar) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.sequences.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0015:
            java.lang.Object r1 = r6.L$2
            java.lang.Object r3 = r6.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r6.L$0
            kotlin.sequences.i r4 = (kotlin.sequences.C19433i) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x004b
        L_0x0023:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            java.lang.Object r7 = r6.L$0
            r4 = r7
            kotlin.sequences.i r4 = (kotlin.sequences.C19433i) r4
            kotlin.sequences.g<java.lang.Object> r7 = r6.$this_runningReduce
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r7.next()
            r6.L$0 = r4
            r6.L$1 = r7
            r6.L$2 = r1
            r6.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r4.mo72006a(r1, r6)
            if (r3 != r0) goto L_0x004a
            return r0
        L_0x004a:
            r3 = r7
        L_0x004b:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x006a
            kq.p<java.lang.Object, java.lang.Object, java.lang.Object> r7 = r6.$operation
            java.lang.Object r5 = r3.next()
            java.lang.Object r1 = r7.invoke(r1, r5)
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = r4.mo72006a(r1, r6)
            if (r7 != r0) goto L_0x004b
            return r0
        L_0x006a:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
