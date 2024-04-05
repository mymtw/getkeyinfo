package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", mo70541f = "Scrollable.kt", mo70542l = {445}, mo70543m = "invokeSuspend")
public final class ScrollDraggableState$drag$2 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C0610h, C19340c<? super C19394m>, Object> $block;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ScrollDraggableState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, C19861p<? super C0610h, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super ScrollDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollDraggableState;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, cVar);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((ScrollDraggableState$drag$2) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C0614l lVar = (C0614l) this.L$0;
            ScrollDraggableState scrollDraggableState = this.this$0;
            scrollDraggableState.getClass();
            C19383o.m32797g(lVar, "<set-?>");
            scrollDraggableState.f1339b = lVar;
            C19861p<C0610h, C19340c<? super C19394m>, Object> pVar = this.$block;
            ScrollDraggableState scrollDraggableState2 = this.this$0;
            this.label = 1;
            if (pVar.invoke(scrollDraggableState2, this) == coroutineSingletons) {
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
