package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", mo70541f = "Draggable.kt", mo70542l = {478}, mo70543m = "invokeSuspend")
public final class IgnorePointerDraggableState$drag$2 extends SuspendLambda implements C19861p<C0606d, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C0610h, C19340c<? super C19394m>, Object> $block;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ IgnorePointerDraggableState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgnorePointerDraggableState$drag$2(IgnorePointerDraggableState ignorePointerDraggableState, C19861p<? super C0610h, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super IgnorePointerDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.this$0 = ignorePointerDraggableState;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        IgnorePointerDraggableState$drag$2 ignorePointerDraggableState$drag$2 = new IgnorePointerDraggableState$drag$2(this.this$0, this.$block, cVar);
        ignorePointerDraggableState$drag$2.L$0 = obj;
        return ignorePointerDraggableState$drag$2;
    }

    public final Object invoke(C0606d dVar, C19340c<? super C19394m> cVar) {
        return ((IgnorePointerDraggableState$drag$2) create(dVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            IgnorePointerDraggableState ignorePointerDraggableState = this.this$0;
            ignorePointerDraggableState.f1333b = (C0606d) this.L$0;
            C19861p<C0610h, C19340c<? super C19394m>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(ignorePointerDraggableState, this) == coroutineSingletons) {
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
