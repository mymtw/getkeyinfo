package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class NavigationRailKt$NavigationRailItemBaselineLayout$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ float $iconPositionAnimationProgress;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItemBaselineLayout$3(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, float f, int i) {
        super(2);
        this.$icon = pVar;
        this.$label = pVar2;
        this.$iconPositionAnimationProgress = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        NavigationRailKt.m2196b(this.$icon, this.$label, this.$iconPositionAnimationProgress, dVar, this.$$changed | 1);
    }
}
