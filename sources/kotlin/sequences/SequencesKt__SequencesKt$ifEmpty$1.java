package kotlin.sequences;

import androidx.compose.foundation.layout.C0761x;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", mo70541f = "Sequences.kt", mo70542l = {69, 71}, mo70543m = "invokeSuspend")
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements C19861p<C19433i<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<C19431g<Object>> $defaultValue;
    public final /* synthetic */ C19431g<Object> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$ifEmpty$1(C19431g<Object> gVar, C19846a<? extends C19431g<Object>> aVar, C19340c<? super SequencesKt__SequencesKt$ifEmpty$1> cVar) {
        super(2, cVar);
        this.$this_ifEmpty = gVar;
        this.$defaultValue = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, cVar);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    public final Object invoke(C19433i<Object> iVar, C19340c<? super C19394m> cVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19433i iVar = (C19433i) this.L$0;
            Iterator<Object> it = this.$this_ifEmpty.iterator();
            if (it.hasNext()) {
                this.label = 1;
                if (iVar.mo72007b(it, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.label = 2;
                iVar.getClass();
                Object b = iVar.mo72007b(this.$defaultValue.invoke().iterator(), this);
                if (b != coroutineSingletons) {
                    b = C19394m.f43287a;
                }
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
