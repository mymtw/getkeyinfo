package androidx.compose.material;

import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p764pq.C20053e;

final class SliderKt$CorrectValueSideEffect$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19857l<Float, Float> $scaleToOffset;
    public final /* synthetic */ C20053e<Float> $trackRange;
    public final /* synthetic */ float $value;
    public final /* synthetic */ C20053e<Float> $valueRange;
    public final /* synthetic */ C1338j0<Float> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$1$1(C20053e<Float> eVar, C19857l<? super Float, Float> lVar, float f, C1338j0<Float> j0Var, C20053e<Float> eVar2) {
        super(0);
        this.$valueRange = eVar;
        this.$scaleToOffset = lVar;
        this.$value = f;
        this.$valueState = j0Var;
        this.$trackRange = eVar2;
    }

    public final void invoke() {
        float floatValue = (this.$valueRange.mo74311g().floatValue() - this.$valueRange.mo74309c().floatValue()) / ((float) 1000);
        float floatValue2 = this.$scaleToOffset.invoke(Float.valueOf(this.$value)).floatValue();
        if (Math.abs(floatValue2 - this.$valueState.getValue().floatValue()) > floatValue && this.$trackRange.mo74315e(this.$valueState.getValue())) {
            this.$valueState.setValue(Float.valueOf(floatValue2));
        }
    }
}
