package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0426g;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7284d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.DefaultButtonElevation$elevation$2", mo70541f = "Button.kt", mo70542l = {551}, mo70543m = "invokeSuspend")
final class DefaultButtonElevation$elevation$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Animatable<C7284d, C0426g> $animatable;
    public final /* synthetic */ float $target;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$2(Animatable<C7284d, C0426g> animatable, float f, C19340c<? super DefaultButtonElevation$elevation$2> cVar) {
        super(2, cVar);
        this.$animatable = animatable;
        this.$target = f;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DefaultButtonElevation$elevation$2(this.$animatable, this.$target, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DefaultButtonElevation$elevation$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Animatable<C7284d, C0426g> animatable = this.$animatable;
            C7284d dVar = new C7284d(this.$target);
            this.label = 1;
            if (animatable.mo3376f(dVar, this) == coroutineSingletons) {
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
