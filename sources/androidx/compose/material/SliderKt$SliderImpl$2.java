package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class SliderKt$SliderImpl$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $positionFraction;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$2(boolean z, float f, List<Float> list, C1228r1 r1Var, float f2, C0640j jVar, C1436d dVar, int i) {
        super(2);
        this.$enabled = z;
        this.$positionFraction = f;
        this.$tickFractions = list;
        this.$colors = r1Var;
        this.$width = f2;
        this.$interactionSource = jVar;
        this.$modifier = dVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SliderKt.m2216e(this.$enabled, this.$positionFraction, this.$tickFractions, this.$colors, this.$width, this.$interactionSource, this.$modifier, dVar, this.$$changed | 1);
    }
}
