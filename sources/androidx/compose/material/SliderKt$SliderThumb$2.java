package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0733f;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SliderKt$SliderThumb$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $offset;
    public final /* synthetic */ C0733f $this_SliderThumb;
    public final /* synthetic */ float $thumbSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$2(C0733f fVar, C1436d dVar, float f, C0640j jVar, C1228r1 r1Var, boolean z, float f2, int i) {
        super(2);
        this.$this_SliderThumb = fVar;
        this.$modifier = dVar;
        this.$offset = f;
        this.$interactionSource = jVar;
        this.$colors = r1Var;
        this.$enabled = z;
        this.$thumbSize = f2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SliderKt.m2212a(this.$this_SliderThumb, this.$modifier, this.$offset, this.$interactionSource, this.$colors, this.$enabled, this.$thumbSize, dVar, this.$$changed | 1);
    }
}
