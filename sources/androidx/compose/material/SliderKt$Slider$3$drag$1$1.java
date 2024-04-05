package androidx.compose.material;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", mo70541f = "Slider.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class SliderKt$Slider$3$drag$1$1 extends SuspendLambda implements C19862q<C19525d0, Float, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<C19857l<Float, C19394m>> $gestureEndAction;
    public /* synthetic */ float F$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$drag$1$1(C1342k1<? extends C19857l<? super Float, C19394m>> k1Var, C19340c<? super SliderKt$Slider$3$drag$1$1> cVar) {
        super(3, cVar);
        this.$gestureEndAction = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C19525d0) obj, ((Number) obj2).floatValue(), (C19340c<? super C19394m>) (C19340c) obj3);
    }

    public final Object invoke(C19525d0 d0Var, float f, C19340c<? super C19394m> cVar) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, cVar);
        sliderKt$Slider$3$drag$1$1.F$0 = f;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.$gestureEndAction.getValue().invoke(new Float(this.F$0));
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
