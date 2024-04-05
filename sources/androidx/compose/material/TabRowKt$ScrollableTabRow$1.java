package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class TabRowKt$ScrollableTabRow$1 extends Lambda implements C19862q<List<? extends C1271y1>, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$1(int i) {
        super(3);
        this.$selectedTabIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((List<C1271y1>) (List) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(List<C1271y1> list, C1302d dVar, int i) {
        C19383o.m32797g(list, "tabPositions");
        C1274z1 z1Var = C1274z1.f2677a;
        C1271y1 y1Var = list.get(this.$selectedTabIndex);
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C19383o.m32797g(y1Var, "currentTabPosition");
        z1Var.mo5380b(0.0f, 3072, 6, 0, dVar, ComposedModifierKt.m3049a(aVar, InspectableValueKt.f4032a, new TabRowDefaults$tabIndicatorOffset$2(y1Var)));
    }
}
