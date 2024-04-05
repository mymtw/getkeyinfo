package androidx.compose.material;

import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0438m;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.OffsetModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.core.widget.NestedScrollView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7284d;
import p753kq.C19857l;
import p753kq.C19862q;

final class TabRowDefaults$tabIndicatorOffset$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1271y1 $currentTabPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(C1271y1 y1Var) {
        super(3);
        this.$currentTabPosition = y1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-398757863);
        float f = this.$currentTabPosition.f2669b;
        C0438m mVar = C0450s.f1167a;
        C0424f a = C0411a.m1105a(f, C0761x.m1706Z0(NestedScrollView.ANIMATED_SCROLL_GAP, 0, mVar, 2), dVar2, 0);
        C0424f a2 = C0411a.m1105a(this.$currentTabPosition.f2668a, C0761x.m1706Z0(NestedScrollView.ANIMATED_SCROLL_GAP, 0, mVar, 2), dVar2, 0);
        C1436d q = SizeKt.m1497q(SizeKt.m1487g(dVar), C1428a.C1429a.f3110f);
        C19383o.m32797g(q, "$this$offset");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        C1436d o = SizeKt.m1495o(q.mo6148i0(new OffsetModifier(((C7284d) a2.getValue()).f16155b, (float) 0)), ((C7284d) a.getValue()).f16155b);
        dVar2.mo5406H();
        return o;
    }
}
