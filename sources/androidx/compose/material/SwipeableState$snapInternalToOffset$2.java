package androidx.compose.material;

import androidx.compose.foundation.gestures.C0606d;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", mo70541f = "Swipeable.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements C19861p<C0606d, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SwipeableState<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f, SwipeableState<Object> swipeableState, C19340c<? super SwipeableState$snapInternalToOffset$2> cVar) {
        super(2, cVar);
        this.$target = f;
        this.this$0 = swipeableState;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, cVar);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    public final Object invoke(C0606d dVar, C19340c<? super C19394m> cVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(dVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            ((C0606d) this.L$0).mo3734a(this.$target - ((Number) this.this$0.f2284g.getValue()).floatValue());
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
