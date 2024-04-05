package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class SurfaceKt$Surface$8 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$8(boolean z, C19846a<C19394m> aVar, C1436d dVar, boolean z2, C1530k0 k0Var, long j, long j2, C0556g gVar, float f, C0640j jVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2, int i3) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$shape = k0Var;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = gVar;
        this.$elevation = f;
        this.$interactionSource = jVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        boolean z = this.$selected;
        boolean z2 = z;
        SurfaceKt.m2236c(z2, this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$color, this.$contentColor, this.$border, this.$elevation, this.$interactionSource, this.$content, dVar, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
