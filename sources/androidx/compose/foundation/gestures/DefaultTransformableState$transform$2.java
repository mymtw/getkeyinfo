package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", mo70541f = "TransformableState.kt", mo70542l = {249}, mo70543m = "invokeSuspend")
final class DefaultTransformableState$transform$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C0617o, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ MutatePriority $transformPriority;
    public int label;
    public final /* synthetic */ C0600b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTransformableState$transform$2(C0600b bVar, MutatePriority mutatePriority, C19861p<? super C0617o, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super DefaultTransformableState$transform$2> cVar) {
        super(2, cVar);
        this.$transformPriority = mutatePriority;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DefaultTransformableState$transform$2((C0600b) null, this.$transformPriority, this.$block, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DefaultTransformableState$transform$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            throw null;
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
