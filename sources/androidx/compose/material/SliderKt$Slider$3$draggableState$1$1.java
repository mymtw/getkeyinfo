package androidx.compose.material;

import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p753kq.C19857l;
import p764pq.C20053e;

public final class SliderKt$Slider$3$draggableState$1$1 extends Lambda implements C19857l<Float, C19394m> {
    public final /* synthetic */ Ref$FloatRef $maxPx;
    public final /* synthetic */ Ref$FloatRef $minPx;
    public final /* synthetic */ C1342k1<C19857l<Float, C19394m>> $onValueChangeState;
    public final /* synthetic */ C1338j0<Float> $pressOffset;
    public final /* synthetic */ C1338j0<Float> $rawOffset;
    public final /* synthetic */ C20053e<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$draggableState$1$1(C1338j0<Float> j0Var, C1338j0<Float> j0Var2, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C1342k1<? extends C19857l<? super Float, C19394m>> k1Var, C20053e<Float> eVar) {
        super(1);
        this.$rawOffset = j0Var;
        this.$pressOffset = j0Var2;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
        this.$onValueChangeState = k1Var;
        this.$valueRange = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f) {
        C1338j0<Float> j0Var = this.$rawOffset;
        j0Var.setValue(Float.valueOf(this.$pressOffset.getValue().floatValue() + j0Var.getValue().floatValue() + f));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        this.$onValueChangeState.getValue().invoke(Float.valueOf(SliderKt$Slider$3.access$invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, C19388s.m32831L(this.$rawOffset.getValue().floatValue(), this.$minPx.element, this.$maxPx.element))));
    }
}
