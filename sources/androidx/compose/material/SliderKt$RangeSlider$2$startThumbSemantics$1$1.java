package androidx.compose.material;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p764pq.C20052d;
import p764pq.C20053e;

public final class SliderKt$RangeSlider$2$startThumbSemantics$1$1 extends Lambda implements C19857l<Float, C19394m> {
    public final /* synthetic */ float $coercedEnd;
    public final /* synthetic */ C1342k1<C19857l<C20053e<Float>, C19394m>> $onValueChangeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$startThumbSemantics$1$1(C1342k1<? extends C19857l<? super C20053e<Float>, C19394m>> k1Var, float f) {
        super(1);
        this.$onValueChangeState = k1Var;
        this.$coercedEnd = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f) {
        this.$onValueChangeState.getValue().invoke(new C20052d(f, this.$coercedEnd));
    }
}
