package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class TabRowDefaults$Indicator$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $height;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1274z1 $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$Indicator$1(C1274z1 z1Var, C1436d dVar, float f, long j, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = z1Var;
        this.$modifier = dVar;
        this.$height = f;
        this.$color = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1274z1 z1Var = this.$tmp0_rcvr;
        C1436d dVar2 = this.$modifier;
        z1Var.mo5380b(this.$height, this.$$changed | 1, this.$$default, this.$color, dVar, dVar2);
    }
}
