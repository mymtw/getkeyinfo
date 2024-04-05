package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
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

public final class FloatingActionButtonKt$ExtendedFloatingActionButton$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, C19861p<? super C1302d, ? super Integer, C19394m> pVar2) {
        super(2);
        this.$icon = pVar;
        this.$$dirty = i;
        this.$text = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            float f = this.$icon == null ? FloatingActionButtonKt.f2212d : FloatingActionButtonKt.f2211c;
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d J0 = C15588c1.m25287J0(aVar, f, 0.0f, FloatingActionButtonKt.f2212d, 0.0f, 10);
            C1432b.C1434b bVar = C1428a.C1429a.f3114j;
            C19861p<C1302d, Integer, C19394m> pVar = this.$icon;
            int i2 = this.$$dirty;
            C19861p<C1302d, Integer, C19394m> pVar2 = this.$text;
            dVar2.mo5465u(693286680);
            C1711v a = RowKt.m1480a(C0718d.f1476a, bVar, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(J0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -678309503);
                dVar2.mo5465u(-388203689);
                dVar2.mo5465u(-1435223762);
                if (pVar != null) {
                    pVar.invoke(dVar2, Integer.valueOf((i2 >> 9) & 14));
                    C15588c1.m25324f(SizeKt.m1495o(aVar, FloatingActionButtonKt.f2211c), dVar2, 6);
                }
                dVar.mo5406H();
                pVar2.invoke(dVar2, Integer.valueOf(i2 & 14));
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
