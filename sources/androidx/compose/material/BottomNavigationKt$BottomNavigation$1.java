package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0708a0;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomNavigationKt$BottomNavigation$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigation$1(C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$content = qVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d a = SelectableGroupKt.m1943a(SizeKt.m1488h(SizeKt.m1487g(C1436d.C1437a.f3125b), BottomNavigationKt.f2177b));
            C0718d.C0724f fVar = C0718d.f1482g;
            C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
            int i2 = ((this.$$dirty >> 3) & 7168) | 48;
            dVar.mo5465u(693286680);
            C1711v a2 = RowKt.m1480a(fVar, C1428a.C1429a.f3113i, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a3 = C1700o.m3617a(a);
            int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, a2, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                a3.invoke(C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, Integer.valueOf((i3 >> 3) & 112));
                dVar.mo5465u(2058660585);
                dVar.mo5465u(-678309503);
                if (((i3 >> 9) & 14 & 11) != 2 || !dVar.mo5442i()) {
                    qVar.invoke(C0708a0.f1463a, dVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
                } else {
                    dVar.mo5396C();
                }
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
