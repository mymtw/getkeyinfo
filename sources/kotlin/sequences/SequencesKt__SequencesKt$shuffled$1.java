package kotlin.sequences;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", mo70541f = "Sequences.kt", mo70542l = {145}, mo70543m = "invokeSuspend")
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements C19861p<C19433i<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Random $random;
    public final /* synthetic */ C19431g<Object> $this_shuffled;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(C19431g<Object> gVar, Random random, C19340c<? super SequencesKt__SequencesKt$shuffled$1> cVar) {
        super(2, cVar);
        this.$this_shuffled = gVar;
        this.$random = random;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, cVar);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    public final Object invoke(C19433i<Object> iVar, C19340c<? super C19394m> cVar) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.sequences.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r1 = r6.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r6.L$0
            kotlin.sequences.i r3 = (kotlin.sequences.C19433i) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x002b
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            java.lang.Object r7 = r6.L$0
            r3 = r7
            kotlin.sequences.i r3 = (kotlin.sequences.C19433i) r3
            kotlin.sequences.g<java.lang.Object> r7 = r6.$this_shuffled
            java.util.ArrayList r1 = kotlin.sequences.SequencesKt___SequencesKt.m32989t1(r7)
        L_0x002b:
            boolean r7 = r1.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0057
            kotlin.random.Random r7 = r6.$random
            int r4 = r1.size()
            int r7 = r7.nextInt(r4)
            java.lang.Object r4 = kotlin.collections.C19324q.m32632N0(r1)
            int r5 = r1.size()
            if (r7 >= r5) goto L_0x004a
            java.lang.Object r4 = r1.set(r7, r4)
        L_0x004a:
            r6.L$0 = r3
            r6.L$1 = r1
            r6.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = r3.mo72006a(r4, r6)
            if (r7 != r0) goto L_0x002b
            return r0
        L_0x0057:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
