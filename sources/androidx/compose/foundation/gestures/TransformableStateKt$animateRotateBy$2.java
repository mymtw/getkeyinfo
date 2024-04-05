package androidx.compose.foundation.gestures;

import androidx.activity.C0114h;
import androidx.compose.animation.core.C0419d;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0426g;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$FloatRef;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", mo70541f = "TransformableState.kt", mo70542l = {158}, mo70543m = "invokeSuspend")
final class TransformableStateKt$animateRotateBy$2 extends SuspendLambda implements C19861p<C0617o, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ float $degrees;
    public final /* synthetic */ Ref$FloatRef $previous;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateRotateBy$2(Ref$FloatRef ref$FloatRef, float f, C0422e<Float> eVar, C19340c<? super TransformableStateKt$animateRotateBy$2> cVar) {
        super(2, cVar);
        this.$previous = ref$FloatRef;
        this.$degrees = f;
        this.$animationSpec = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.$previous, this.$degrees, this.$animationSpec, cVar);
        transformableStateKt$animateRotateBy$2.L$0 = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    public final Object invoke(C0617o oVar, C19340c<? super C19394m> cVar) {
        return ((TransformableStateKt$animateRotateBy$2) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0617o oVar = (C0617o) this.L$0;
            C0424f p = C0114h.m311p(this.$previous.element, 0.0f, 30);
            Float f = new Float(this.$degrees);
            C0422e<Float> eVar = this.$animationSpec;
            final Ref$FloatRef ref$FloatRef = this.$previous;
            C05971 r9 = new C19857l<C0419d<Float, C0426g>, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C0419d<Float, C0426g>) (C0419d) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C0419d<Float, C0426g> dVar) {
                    C19383o.m32797g(dVar, "$this$animateTo");
                    C0617o.m1432a(oVar, 0.0f, 0, dVar.mo3481b().floatValue() - ref$FloatRef.element, 3);
                    ref$FloatRef.element = dVar.mo3481b().floatValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m1074e(p, f, eVar, false, r9, this, 4) == coroutineSingletons) {
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
