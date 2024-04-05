package kotlin.sequences;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", mo70541f = "_Sequences.kt", mo70542l = {2864}, mo70543m = "invokeSuspend")
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements C19861p<C19433i<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19431g<Object> $this_zipWithNext;
    public final /* synthetic */ C19861p<Object, Object, Object> $transform;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(C19431g<Object> gVar, C19861p<Object, Object, Object> pVar, C19340c<? super SequencesKt___SequencesKt$zipWithNext$2> cVar) {
        super(2, cVar);
        this.$this_zipWithNext = gVar;
        this.$transform = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, cVar);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    public final Object invoke(C19433i<Object> iVar, C19340c<? super C19394m> cVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.sequences.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r1 = r6.L$2
            java.lang.Object r3 = r6.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r6.L$0
            kotlin.sequences.i r4 = (kotlin.sequences.C19433i) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x003a
        L_0x0017:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            java.lang.Object r7 = r6.L$0
            r4 = r7
            kotlin.sequences.i r4 = (kotlin.sequences.C19433i) r4
            kotlin.sequences.g<java.lang.Object> r7 = r6.$this_zipWithNext
            java.util.Iterator r3 = r7.iterator()
            boolean r7 = r3.hasNext()
            if (r7 != 0) goto L_0x0036
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        L_0x0036:
            java.lang.Object r1 = r3.next()
        L_0x003a:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x005b
            java.lang.Object r7 = r3.next()
            kq.p<java.lang.Object, java.lang.Object, java.lang.Object> r5 = r6.$transform
            java.lang.Object r1 = r5.invoke(r1, r7)
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r7
            r6.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = r4.mo72006a(r1, r6)
            if (r1 != r0) goto L_0x0059
            return r0
        L_0x0059:
            r1 = r7
            goto L_0x003a
        L_0x005b:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
