package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SurfaceKt$Surface$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$2(C1436d dVar, C1530k0 k0Var, long j, long j2, C0556g gVar, float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$shape = k0Var;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = gVar;
        this.$elevation = f;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SurfaceKt.m2234a(this.$modifier, this.$shape, this.$color, this.$contentColor, this.$border, this.$elevation, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
