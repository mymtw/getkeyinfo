package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0742j;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
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
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class NavigationRailKt$NavigationRail$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $header;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$1(C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, int i, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar2) {
        super(2);
        this.$header = qVar;
        this.$$dirty = i;
        this.$content = qVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d a = SelectableGroupKt.m1943a(C15588c1.m25283H0(SizeKt.m1485e(aVar), 0.0f, NavigationRailKt.f2230d, 1));
            C1432b.C1433a aVar2 = C1428a.C1429a.f3117m;
            C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$header;
            int i2 = this.$$dirty;
            C19862q<C0739i, C1302d, Integer, C19394m> qVar2 = this.$content;
            dVar.mo5465u(-483455358);
            C1711v a2 = ColumnKt.m1461a(C0718d.f1478c, aVar2, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a3 = C1700o.m3617a(a);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar3);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, a2, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a3, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -1163856341);
                C0742j jVar = C0742j.f1527a;
                dVar.mo5465u(-497173955);
                dVar.mo5465u(65525382);
                if (qVar != null) {
                    qVar.invoke(jVar, dVar, Integer.valueOf(((i2 >> 9) & 112) | 6));
                    C15588c1.m25324f(SizeKt.m1488h(aVar, NavigationRailKt.f2231e), dVar, 6);
                }
                dVar.mo5406H();
                qVar2.invoke(jVar, dVar, Integer.valueOf(6 | ((i2 >> 12) & 112)));
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
