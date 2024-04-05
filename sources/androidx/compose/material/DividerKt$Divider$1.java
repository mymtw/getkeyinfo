package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class DividerKt$Divider$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $startIndent;
    public final /* synthetic */ float $thickness;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DividerKt$Divider$1(C1436d dVar, long j, float f, float f2, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$color = j;
        this.$thickness = f;
        this.$startIndent = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1436d dVar2 = this.$modifier;
        C1192i0.m2325a(this.$thickness, this.$startIndent, this.$$changed | 1, this.$$default, this.$color, dVar, dVar2);
    }
}
