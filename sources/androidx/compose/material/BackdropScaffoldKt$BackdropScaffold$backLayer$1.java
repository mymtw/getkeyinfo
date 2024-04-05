package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.ColumnKt;
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
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;

final class BackdropScaffoldKt$BackdropScaffold$backLayer$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $appBar;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $backLayerContent;
    public final /* synthetic */ boolean $persistentAppBar;
    public final /* synthetic */ C1175d $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$backLayer$1(boolean z, C1175d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i) {
        super(2);
        this.$persistentAppBar = z;
        this.$scaffoldState = dVar;
        this.$appBar = pVar;
        this.$backLayerContent = pVar2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) == 2 && dVar.mo5442i()) {
            dVar.mo5396C();
        } else if (this.$persistentAppBar) {
            dVar.mo5465u(-1017265331);
            C19861p<C1302d, Integer, C19394m> pVar = this.$appBar;
            int i2 = this.$$dirty;
            C19861p<C1302d, Integer, C19394m> pVar2 = this.$backLayerContent;
            dVar.mo5465u(-483455358);
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1711v a = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(aVar);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -1163856341);
                dVar.mo5465u(-18835878);
                pVar.invoke(dVar, Integer.valueOf(i2 & 14));
                pVar2.invoke(dVar, Integer.valueOf((i2 >> 3) & 14));
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5456p();
                dVar.mo5406H();
                dVar.mo5406H();
                dVar.mo5406H();
                return;
            }
            C0005b.m45j0();
            throw null;
        } else {
            dVar.mo5465u(-1017265219);
            C19861p<C1302d, Integer, C19394m> pVar3 = this.$appBar;
            C19861p<C1302d, Integer, C19394m> pVar4 = this.$backLayerContent;
            int i3 = this.$$dirty << 3;
            C1171c.m2300a((BackdropValue) this.$scaffoldState.mo5117e(), pVar3, pVar4, dVar, (i3 & 896) | (i3 & 112));
            dVar.mo5406H();
        }
    }
}
