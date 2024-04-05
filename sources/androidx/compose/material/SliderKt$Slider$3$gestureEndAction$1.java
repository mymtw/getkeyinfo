package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1338j0;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SliderKt$Slider$3$gestureEndAction$1 extends Lambda implements C19857l<Float, C19394m> {
    public final /* synthetic */ SliderDraggableState $draggableState;
    public final /* synthetic */ Ref$FloatRef $maxPx;
    public final /* synthetic */ Ref$FloatRef $minPx;
    public final /* synthetic */ C19846a<C19394m> $onValueChangeFinished;
    public final /* synthetic */ C1338j0<Float> $rawOffset;
    public final /* synthetic */ C19525d0 $scope;
    public final /* synthetic */ List<Float> $tickFractions;

    @C19060c(mo70540c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", mo70541f = "Slider.kt", mo70542l = {204}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1 */
    public static final class C11181 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C11181(sliderDraggableState, floatValue, g, f2, aVar2, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C11181) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                SliderDraggableState sliderDraggableState = sliderDraggableState;
                float f = floatValue;
                float f2 = g;
                float f3 = f2;
                this.label = 1;
                float f4 = SliderKt.f2258a;
                Object b = sliderDraggableState.mo3733a(MutatePriority.Default, new SliderKt$animateToTarget$2(f, f2, f3, (C19340c<? super SliderKt$animateToTarget$2>) null), this);
                if (b != coroutineSingletons) {
                    b = C19394m.f43287a;
                }
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C19846a<C19394m> aVar = aVar2;
            if (aVar != null) {
                aVar.invoke();
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$gestureEndAction$1(C1338j0<Float> j0Var, List<Float> list, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C19525d0 d0Var, SliderDraggableState sliderDraggableState, C19846a<C19394m> aVar) {
        super(1);
        this.$rawOffset = j0Var;
        this.$tickFractions = list;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
        this.$scope = d0Var;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f) {
        C19846a<C19394m> aVar;
        final float floatValue = this.$rawOffset.getValue().floatValue();
        final float g = SliderKt.m2218g(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (!(floatValue == g)) {
            C19525d0 d0Var = this.$scope;
            final SliderDraggableState sliderDraggableState = this.$draggableState;
            final C19846a<C19394m> aVar2 = this.$onValueChangeFinished;
            final float f2 = f;
            C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C11181((C19340c<? super C11181>) null), 3);
        } else if (!((Boolean) this.$draggableState.f2254b.getValue()).booleanValue() && (aVar = this.$onValueChangeFinished) != null) {
            aVar.invoke();
        }
    }
}
