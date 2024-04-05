package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ProgressIndicatorKt$CircularProgressIndicator$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $strokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$4(C1436d dVar, long j, float f, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$color = j;
        this.$strokeWidth = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1436d dVar2 = this.$modifier;
        C1193i1.m2326a(this.$strokeWidth, this.$$changed | 1, this.$$default, this.$color, dVar, dVar2);
    }
}
