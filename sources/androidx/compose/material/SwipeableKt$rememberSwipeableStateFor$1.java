package androidx.compose.material;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", mo70541f = "Swipeable.kt", mo70542l = {512}, mo70543m = "invokeSuspend")
final class SwipeableKt$rememberSwipeableStateFor$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ SwipeableState<Object> $swipeableState;
    public final /* synthetic */ Object $value;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableStateFor$1(Object obj, SwipeableState<Object> swipeableState, C19340c<? super SwipeableKt$rememberSwipeableStateFor$1> cVar) {
        super(2, cVar);
        this.$value = obj;
        this.$swipeableState = swipeableState;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SwipeableKt$rememberSwipeableStateFor$1(this.$value, this.$swipeableState, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SwipeableKt$rememberSwipeableStateFor$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            if (!C19383o.m32792b(this.$value, this.$swipeableState.mo5116d())) {
                SwipeableState<Object> swipeableState = this.$swipeableState;
                Object obj2 = this.$value;
                this.label = 1;
                if (SwipeableState.m2243b(swipeableState, obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
