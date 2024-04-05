package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SliderKt$Track$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $positionFractionEnd;
    public final /* synthetic */ float $positionFractionStart;
    public final /* synthetic */ float $thumbPx;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$2(C1436d dVar, C1228r1 r1Var, boolean z, float f, float f2, List<Float> list, float f3, float f4, int i) {
        super(2);
        this.$modifier = dVar;
        this.$colors = r1Var;
        this.$enabled = z;
        this.$positionFractionStart = f;
        this.$positionFractionEnd = f2;
        this.$tickFractions = list;
        this.$thumbPx = f3;
        this.$trackStrokeWidth = f4;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SliderKt.m2213b(this.$modifier, this.$colors, this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$thumbPx, this.$trackStrokeWidth, dVar, this.$$changed | 1);
    }
}
