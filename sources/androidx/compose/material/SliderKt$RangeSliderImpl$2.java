package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class SliderKt$RangeSliderImpl$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $endInteractionSource;
    public final /* synthetic */ C1436d $endThumbSemantics;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $positionFractionEnd;
    public final /* synthetic */ float $positionFractionStart;
    public final /* synthetic */ C0640j $startInteractionSource;
    public final /* synthetic */ C1436d $startThumbSemantics;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2(boolean z, float f, float f2, List<Float> list, C1228r1 r1Var, float f3, C0640j jVar, C0640j jVar2, C1436d dVar, C1436d dVar2, C1436d dVar3, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$positionFractionStart = f;
        this.$positionFractionEnd = f2;
        this.$tickFractions = list;
        this.$colors = r1Var;
        this.$width = f3;
        this.$startInteractionSource = jVar;
        this.$endInteractionSource = jVar2;
        this.$modifier = dVar;
        this.$startThumbSemantics = dVar2;
        this.$endThumbSemantics = dVar3;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SliderKt.m2215d(this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$colors, this.$width, this.$startInteractionSource, this.$endInteractionSource, this.$modifier, this.$startThumbSemantics, this.$endThumbSemantics, dVar, this.$$changed | 1, this.$$changed1);
    }
}
