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
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", mo70541f = "SnackbarHost.kt", mo70542l = {363}, mo70543m = "invokeSuspend")
final class SnackbarHostKt$animatedScale$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0422e<Float> $animation;
    public final /* synthetic */ Animatable<Float, C0426g> $scale;
    public final /* synthetic */ boolean $visible;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1(Animatable<Float, C0426g> animatable, boolean z, C0422e<Float> eVar, C19340c<? super SnackbarHostKt$animatedScale$1> cVar) {
        super(2, cVar);
        this.$scale = animatable;
        this.$visible = z;
        this.$animation = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SnackbarHostKt$animatedScale$1(this.$scale, this.$visible, this.$animation, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SnackbarHostKt$animatedScale$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Animatable<Float, C0426g> animatable = this.$scale;
            Float f = new Float(this.$visible ? 1.0f : 0.8f);
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
        return C19394m.f43287a;
    }
}
