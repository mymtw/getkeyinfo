package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20053e;

final class SliderKt$CorrectValueSideEffect$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19857l<Float, Float> $scaleToOffset;
    public final /* synthetic */ C20053e<Float> $trackRange;
    public final /* synthetic */ float $value;
    public final /* synthetic */ C20053e<Float> $valueRange;
    public final /* synthetic */ C1338j0<Float> $valueState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$2(C19857l<? super Float, Float> lVar, C20053e<Float> eVar, C20053e<Float> eVar2, C1338j0<Float> j0Var, float f, int i) {
        super(2);
        this.$scaleToOffset = lVar;
        this.$valueRange = eVar;
        this.$trackRange = eVar2;
        this.$valueState = j0Var;
        this.$value = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SliderKt.m2214c(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, dVar, this.$$changed | 1);
    }
}
