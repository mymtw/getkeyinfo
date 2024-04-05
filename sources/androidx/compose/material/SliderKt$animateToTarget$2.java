package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0426g;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.foundation.gestures.C0606d;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.reflect.C19421p;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SliderKt$animateToTarget$2", mo70541f = "Slider.kt", mo70542l = {927}, mo70543m = "invokeSuspend")
final class SliderKt$animateToTarget$2 extends SuspendLambda implements C19861p<C0606d, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ float $current;
    public final /* synthetic */ float $target;
    public final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f, float f2, float f3, C19340c<? super SliderKt$animateToTarget$2> cVar) {
        super(2, cVar);
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, cVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    public final Object invoke(C0606d dVar, C19340c<? super C19394m> cVar) {
        return ((SliderKt$animateToTarget$2) create(dVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0606d dVar = (C0606d) this.L$0;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            float f = this.$current;
            ref$FloatRef.element = f;
            Animatable m = C19421p.m32945m(f);
            Float f2 = new Float(this.$target);
            C0433j0<Float> j0Var = SliderKt.f2264g;
            Float f3 = new Float(this.$velocity);
            C11201 r8 = new C19857l<Animatable<Float, C0426g>, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Animatable<Float, C0426g>) (Animatable) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(Animatable<Float, C0426g> animatable) {
                    C19383o.m32797g(animatable, "$this$animateTo");
                    dVar.mo3734a(animatable.mo3375e().floatValue() - ref$FloatRef.element);
                    ref$FloatRef.element = animatable.mo3375e().floatValue();
                }
            };
            this.label = 1;
            if (m.mo3374c(f2, j0Var, f3, r8, this) == coroutineSingletons) {
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
