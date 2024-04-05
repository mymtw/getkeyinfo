package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0708a0;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0731e;
import androidx.compose.foundation.layout.C0735g;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7280a;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class SwipeToDismissKt$SwipeToDismiss$2 extends Lambda implements C19862q<C0735g, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $background;
    public final /* synthetic */ Set<DismissDirection> $directions;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $dismissContent;
    public final /* synthetic */ C19857l<DismissDirection, C1174c2> $dismissThresholds;
    public final /* synthetic */ C1189h0 $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, C19857l<? super DismissDirection, ? extends C1174c2> lVar, int i, C1189h0 h0Var, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar2) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = lVar;
        this.$$dirty = i;
        this.$state = h0Var;
        this.$background = qVar;
        this.$dismissContent = qVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0735g) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0735g gVar, C1302d dVar, int i) {
        int i2;
        C0735g gVar2 = gVar;
        C1302d dVar2 = dVar;
        C19383o.m32797g(gVar2, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(gVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            float h = (float) C7280a.m13963h(gVar.mo4120b());
            C1345l1 l1Var = CompositionLocalsKt.f4025k;
            boolean z = dVar2.mo5410J(l1Var) == LayoutDirection.Rtl;
            Float valueOf = Float.valueOf(0.0f);
            DismissValue dismissValue = DismissValue.Default;
            LinkedHashMap t0 = C19294b0.m32563t0(new Pair(valueOf, dismissValue));
            Set<DismissDirection> set = this.$directions;
            DismissDirection dismissDirection = DismissDirection.StartToEnd;
            if (set.contains(dismissDirection)) {
                Pair pair = new Pair(Float.valueOf(h), DismissValue.DismissedToEnd);
                t0.put(pair.getFirst(), pair.getSecond());
            }
            Set<DismissDirection> set2 = this.$directions;
            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
            if (set2.contains(dismissDirection2)) {
                Pair pair2 = new Pair(Float.valueOf(-h), DismissValue.DismissedToStart);
                t0.put(pair2.getFirst(), pair2.getSecond());
            }
            C19857l<DismissDirection, C1174c2> lVar = this.$dismissThresholds;
            dVar2.mo5465u(1157296644);
            boolean I = dVar2.mo5408I(lVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(lVar);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            C19861p pVar = (C19861p) v;
            boolean contains = this.$directions.contains(dismissDirection2);
            float f = 10.0f;
            float f2 = contains ? 10.0f : 20.0f;
            if (!this.$directions.contains(dismissDirection)) {
                f = 20.0f;
            }
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d d = C1261v1.m2395d(aVar, this.$state, t0, Orientation.Horizontal, this.$state.mo5116d() == dismissValue, z, (C0640j) null, pVar, new C1213m1(h, f2, f), 0.0f, 288);
            C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$background;
            int i3 = this.$$dirty;
            C1189h0 h0Var = this.$state;
            C19862q<C0763z, C1302d, Integer, C19394m> qVar2 = this.$dismissContent;
            dVar2.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
            dVar2.mo5465u(-1323940314);
            C1345l1 l1Var2 = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) dVar2.mo5410J(l1Var2);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(l1Var);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(d);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                C19861p<ComposeUiNode, C1711v, C19394m> pVar2 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(dVar2, c, pVar2);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar3 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(dVar2, bVar, pVar3);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar4 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(dVar2, layoutDirection, pVar4);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar5 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar6 = pVar2;
                C19861p<ComposeUiNode, C7282b, C19394m> pVar7 = pVar3;
                C1436d.C1437a aVar3 = aVar;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = pVar5;
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar9 = pVar4;
                C0472h.m1246i(0, a, C0073e.m204d(dVar2, j1Var, pVar5, dVar2), dVar, 2058660585, -2137368960);
                dVar2.mo5465u(981834387);
                C1432b bVar2 = C1428a.C1429a.f3108d;
                C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
                C0731e eVar = new C0731e(bVar2, true);
                int i4 = (i3 >> 3) & 7168;
                dVar2.mo5465u(693286680);
                C0718d.C0727i iVar = C0718d.f1476a;
                C1432b.C1434b bVar3 = C1428a.C1429a.f3113i;
                C1711v a2 = RowKt.m1480a(iVar, bVar3, dVar2);
                C19862q<C0763z, C1302d, Integer, C19394m> qVar3 = qVar2;
                dVar2.mo5465u(-1323940314);
                C7282b bVar4 = (C7282b) dVar2.mo5410J(l1Var2);
                C1345l1 l1Var4 = l1Var;
                LayoutDirection layoutDirection2 = (LayoutDirection) dVar2.mo5410J(l1Var);
                C1345l1 l1Var5 = l1Var3;
                C1843j1 j1Var2 = (C1843j1) dVar2.mo5410J(l1Var3);
                ComposableLambdaImpl a3 = C1700o.m3617a(eVar);
                int i5 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
                C1345l1 l1Var6 = l1Var2;
                if (dVar.mo5446k() instanceof C1299c) {
                    dVar.mo5392A();
                    if (dVar.mo5436f()) {
                        dVar2.mo5450m(aVar2);
                    } else {
                        dVar.mo5452n();
                    }
                    dVar.mo5394B();
                    C19861p<ComposeUiNode, C1711v, C19394m> pVar10 = pVar6;
                    Updater.m2571b(dVar2, a2, pVar10);
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar11 = pVar7;
                    Updater.m2571b(dVar2, bVar4, pVar11);
                    Updater.m2571b(dVar2, layoutDirection2, pVar9);
                    C19861p<ComposeUiNode, C1843j1, C19394m> pVar12 = pVar8;
                    Updater.m2571b(dVar2, j1Var2, pVar12);
                    dVar.mo5430c();
                    a3.invoke(new C1295a1(dVar2), dVar2, Integer.valueOf((i5 >> 3) & 112));
                    dVar2.mo5465u(2058660585);
                    dVar2.mo5465u(-678309503);
                    if (((i5 >> 9) & 14 & 11) != 2 || !dVar.mo5442i()) {
                        qVar.invoke(C0708a0.f1463a, dVar2, Integer.valueOf(((i4 >> 6) & 112) | 6));
                    } else {
                        dVar.mo5396C();
                    }
                    dVar.mo5406H();
                    dVar.mo5406H();
                    dVar.mo5456p();
                    dVar.mo5406H();
                    dVar.mo5406H();
                    dVar2.mo5465u(1157296644);
                    boolean I2 = dVar2.mo5408I(h0Var);
                    Object v2 = dVar.mo5467v();
                    if (I2 || v2 == C1302d.C1303a.f2828a) {
                        v2 = new SwipeToDismissKt$SwipeToDismiss$2$1$1$1(h0Var);
                        dVar2.mo5454o(v2);
                    }
                    dVar.mo5406H();
                    C1436d U = C1993m.m4360U(aVar3, (C19857l) v2);
                    int i6 = (i3 >> 6) & 7168;
                    dVar2.mo5465u(693286680);
                    C1711v a4 = RowKt.m1480a(iVar, bVar3, dVar2);
                    dVar2.mo5465u(-1323940314);
                    C7282b bVar5 = (C7282b) dVar2.mo5410J(l1Var6);
                    LayoutDirection layoutDirection3 = (LayoutDirection) dVar2.mo5410J(l1Var4);
                    C1843j1 j1Var3 = (C1843j1) dVar2.mo5410J(l1Var5);
                    ComposableLambdaImpl a5 = C1700o.m3617a(U);
                    int i7 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
                    if (dVar.mo5446k() instanceof C1299c) {
                        dVar.mo5392A();
                        if (dVar.mo5436f()) {
                            dVar2.mo5450m(aVar2);
                        } else {
                            dVar.mo5452n();
                        }
                        dVar.mo5394B();
                        Updater.m2571b(dVar2, a4, pVar10);
                        Updater.m2571b(dVar2, bVar5, pVar11);
                        Updater.m2571b(dVar2, layoutDirection3, pVar9);
                        Updater.m2571b(dVar2, j1Var3, pVar12);
                        dVar.mo5430c();
                        a5.invoke(new C1295a1(dVar2), dVar2, Integer.valueOf((i7 >> 3) & 112));
                        dVar2.mo5465u(2058660585);
                        dVar2.mo5465u(-678309503);
                        if (((i7 >> 9) & 14 & 11) != 2 || !dVar.mo5442i()) {
                            qVar3.invoke(C0708a0.f1463a, dVar2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                        } else {
                            dVar.mo5396C();
                        }
                        dVar.mo5406H();
                        dVar.mo5406H();
                        dVar.mo5456p();
                        dVar.mo5406H();
                        dVar.mo5406H();
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
                C0005b.m45j0();
                throw null;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
