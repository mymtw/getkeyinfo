package androidx.compose.material;

import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20052d;
import p764pq.C20053e;

public final class SliderKt$RangeSlider$2$onDrag$1$1 extends Lambda implements C19861p<Boolean, Float, C19394m> {
    public final /* synthetic */ Ref$FloatRef $maxPx;
    public final /* synthetic */ Ref$FloatRef $minPx;
    public final /* synthetic */ C1342k1<C19857l<C20053e<Float>, C19394m>> $onValueChangeState;
    public final /* synthetic */ C1338j0<Float> $rawOffsetEnd;
    public final /* synthetic */ C1338j0<Float> $rawOffsetStart;
    public final /* synthetic */ C20053e<Float> $valueRange;
    public final /* synthetic */ C20053e<Float> $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$onDrag$1$1(C1338j0<Float> j0Var, C1338j0<Float> j0Var2, C20053e<Float> eVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C1342k1<? extends C19857l<? super C20053e<Float>, C19394m>> k1Var, C20053e<Float> eVar2) {
        super(2);
        this.$rawOffsetStart = j0Var;
        this.$rawOffsetEnd = j0Var2;
        this.$values = eVar;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
        this.$onValueChangeState = k1Var;
        this.$valueRange = eVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z, float f) {
        C20052d dVar;
        if (z) {
            C1338j0<Float> j0Var = this.$rawOffsetStart;
            j0Var.setValue(Float.valueOf(j0Var.getValue().floatValue() + f));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt$RangeSlider$2.m2223a(this.$minPx, this.$maxPx, this.$valueRange, this.$values.mo74311g().floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            dVar = new C20052d(C19388s.m32831L(this.$rawOffsetStart.getValue().floatValue(), this.$minPx.element, floatValue), floatValue);
        } else {
            C1338j0<Float> j0Var2 = this.$rawOffsetEnd;
            j0Var2.setValue(Float.valueOf(j0Var2.getValue().floatValue() + f));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt$RangeSlider$2.m2223a(this.$minPx, this.$maxPx, this.$valueRange, this.$values.mo74309c().floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            dVar = new C20052d(floatValue2, C19388s.m32831L(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, this.$maxPx.element));
        }
        this.$onValueChangeState.getValue().invoke(SliderKt$RangeSlider$2.access$invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, dVar));
    }
}
