package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0428h;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7287g;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", mo70541f = "LazyListItemPlacementAnimator.kt", mo70542l = {266}, mo70543m = "invokeSuspend")
final class LazyListItemPlacementAnimator$getAnimatedOffset$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0867z $item;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemPlacementAnimator$getAnimatedOffset$1(C0867z zVar, C19340c<? super LazyListItemPlacementAnimator$getAnimatedOffset$1> cVar) {
        super(2, cVar);
        this.$item = zVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LazyListItemPlacementAnimator$getAnimatedOffset$1(this.$item, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LazyListItemPlacementAnimator$getAnimatedOffset$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C0867z zVar = this.$item;
            Animatable<C7287g, C0428h> animatable = zVar.f1874b;
            C7287g gVar = new C7287g(zVar.f1875c);
            this.label = 1;
            if (animatable.mo3376f(gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$item.f1876d.setValue(Boolean.FALSE);
        return C19394m.f43287a;
    }
}
