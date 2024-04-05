package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class DrawerKt$BottomDrawerScrim$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19846a<C19394m> $onDismiss;
    public final /* synthetic */ boolean $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerScrim$2(long j, C19846a<C19394m> aVar, boolean z, int i) {
        super(2);
        this.$color = j;
        this.$onDismiss = aVar;
        this.$visible = z;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        DrawerKt.m2179b(this.$color, this.$onDismiss, this.$visible, dVar, this.$$changed | 1);
    }
}
