package kotlin.sequences;

import androidx.compose.foundation.layout.C0761x;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p568fn.C17782b;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", mo70541f = "Sequences.kt", mo70542l = {332}, mo70543m = "invokeSuspend")
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements C19861p<C19433i<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<Object, Iterator<Object>> $iterator;
    public final /* synthetic */ C19431g<Object> $source;
    public final /* synthetic */ C19861p<Integer, Object, Object> $transform;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$flatMapIndexed$1(C19431g<Object> gVar, C19861p<? super Integer, Object, Object> pVar, C19857l<Object, ? extends Iterator<Object>> lVar, C19340c<? super SequencesKt__SequencesKt$flatMapIndexed$1> cVar) {
        super(2, cVar);
        this.$source = gVar;
        this.$transform = pVar;
        this.$iterator = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, cVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    public final Object invoke(C19433i<Object> iVar, C19340c<? super C19394m> cVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19433i iVar;
        Iterator<Object> it;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj);
            i = 0;
            it = this.$source.iterator();
            iVar = (C19433i) this.L$0;
        } else if (i2 == 1) {
            i = this.I$0;
            it = (Iterator) this.L$1;
            iVar = (C19433i) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object next = it.next();
            C19861p<Integer, Object, Object> pVar = this.$transform;
            int i3 = i + 1;
            if (i >= 0) {
                Object invoke = pVar.invoke(new Integer(i), next);
                this.L$0 = iVar;
                this.L$1 = it;
                this.I$0 = i3;
                this.label = 1;
                if (iVar.mo72007b(this.$iterator.invoke(invoke), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = i3;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        return C19394m.f43287a;
    }
}
