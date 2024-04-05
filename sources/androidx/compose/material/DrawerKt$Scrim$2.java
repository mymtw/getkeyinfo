package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class DrawerKt$Scrim$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19846a<Float> $fraction;
    public final /* synthetic */ C19846a<C19394m> $onClose;
    public final /* synthetic */ boolean $open;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$2(boolean z, C19846a<C19394m> aVar, C19846a<Float> aVar2, long j, int i) {
        super(2);
        this.$open = z;
        this.$onClose = aVar;
        this.$fraction = aVar2;
        this.$color = j;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        DrawerKt.m2180c(this.$open, this.$onClose, this.$fraction, this.$color, dVar, this.$$changed | 1);
    }
}
