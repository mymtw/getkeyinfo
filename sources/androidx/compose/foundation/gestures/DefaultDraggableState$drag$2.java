package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", mo70541f = "Draggable.kt", mo70542l = {427}, mo70543m = "invokeSuspend")
public final class DefaultDraggableState$drag$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C0606d, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ MutatePriority $dragPriority;
    public int label;
    public final /* synthetic */ DefaultDraggableState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, C19861p<? super C0606d, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super DefaultDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DefaultDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DefaultDraggableState$drag$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            DefaultDraggableState defaultDraggableState = this.this$0;
            MutatorMutex mutatorMutex = defaultDraggableState.f1318c;
            DefaultDraggableState.C0558a aVar = defaultDraggableState.f1317b;
            MutatePriority mutatePriority = this.$dragPriority;
            C19861p<C0606d, C19340c<? super C19394m>, Object> pVar = this.$block;
            this.label = 1;
            if (mutatorMutex.mo3680b(aVar, mutatePriority, pVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
