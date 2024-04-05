package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class NavigationRailKt$NavigationRailItem$2$1 extends Lambda implements C19862q<Float, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $alwaysShowLabel;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $styledLabel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$2$1(boolean z, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i) {
        super(3);
        this.$alwaysShowLabel = z;
        this.$icon = pVar;
        this.$styledLabel = pVar2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).floatValue(), (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f, C1302d dVar, int i) {
        if ((i & 14) == 0) {
            i |= dVar.mo5428b(f) ? 4 : 2;
        }
        if ((i & 91) != 18 || !dVar.mo5442i()) {
            if (this.$alwaysShowLabel) {
                f = 1.0f;
            }
            NavigationRailKt.m2196b(this.$icon, this.$styledLabel, f, dVar, (this.$$dirty >> 6) & 14);
            return;
        }
        dVar.mo5396C();
    }
}
