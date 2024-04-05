package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0426g;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", mo70541f = "SnackbarHost.kt", mo70542l = {350}, mo70543m = "invokeSuspend")
final class SnackbarHostKt$animatedOpacity$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Animatable<Float, C0426g> $alpha;
    public final /* synthetic */ C0422e<Float> $animation;
    public final /* synthetic */ C19846a<C19394m> $onAnimationFinish;
    public final /* synthetic */ boolean $visible;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2(Animatable<Float, C0426g> animatable, boolean z, C0422e<Float> eVar, C19846a<C19394m> aVar, C19340c<? super SnackbarHostKt$animatedOpacity$2> cVar) {
        super(2, cVar);
        this.$alpha = animatable;
        this.$visible = z;
        this.$animation = eVar;
        this.$onAnimationFinish = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SnackbarHostKt$animatedOpacity$2(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SnackbarHostKt$animatedOpacity$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Animatable<Float, C0426g> animatable = this.$alpha;
            Float f = new Float(this.$visible ? 1.0f : 0.0f);
            C0422e<Float> eVar = this.$animation;
            this.label = 1;
            if (Animatable.m1065d(animatable, f, eVar, (Float) null, (C19857l) null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$onAnimationFinish.invoke();
        return C19394m.f43287a;
    }
}
