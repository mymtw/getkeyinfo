package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class NavigationRailKt$NavigationRailTransition$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $activeColor;
    public final /* synthetic */ C19862q<Float, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $inactiveColor;
    public final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailTransition$2(long j, long j2, boolean z, C19862q<? super Float, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$activeColor = j;
        this.$inactiveColor = j2;
        this.$selected = z;
        this.$content = qVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        NavigationRailKt.m2195a(this.$activeColor, this.$inactiveColor, this.$selected, this.$content, dVar, this.$$changed | 1);
    }
}
