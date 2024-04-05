package com.etsy.android.p327ui.shop.tabs.overview;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0731e;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.p327ui.shop.tabs.C11215b;
import com.etsy.android.p327ui.shop.tabs.C11224i;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import com.etsy.collagecompose.ButtonKt;
import com.etsy.collagecompose.C12142d;
import com.etsy.collagecompose.C12145e;
import com.etsy.collagecompose.C12159j;
import com.etsy.collagecompose.DimensKt;
import com.etsy.collagecompose.TextKt;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.shop.tabs.overview.GenericErrorStateKt$GenericErrorState$1 */
public final class GenericErrorStateKt$GenericErrorState$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ ShopViewModel $viewModel;
    public final /* synthetic */ C11224i.C11228d $viewState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenericErrorStateKt$GenericErrorState$1(C11224i.C11228d dVar, ShopViewModel shopViewModel) {
        super(2);
        this.$viewState = dVar;
        this.$viewModel = shopViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d f = SizeKt.m1486f(aVar);
            C11224i.C11228d dVar3 = this.$viewState;
            ShopViewModel shopViewModel = this.$viewModel;
            dVar2.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
            dVar2.mo5465u(-1323940314);
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) dVar2.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(f);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                C19861p<ComposeUiNode, C1711v, C19394m> pVar = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(dVar2, c, pVar);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar2 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(dVar2, bVar, pVar2);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar3 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(dVar2, layoutDirection, pVar3);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar4 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = pVar;
                C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = pVar2;
                ComposableLambdaImpl composableLambdaImpl = a;
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = pVar3;
                C1295a1 d = C0073e.m204d(dVar2, j1Var, pVar4, dVar2);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = pVar4;
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar9 = pVar7;
                C0472h.m1246i(0, composableLambdaImpl, d, dVar, 2058660585, -2137368960);
                C1432b bVar2 = C1428a.C1429a.f3108d;
                C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                C0731e eVar = new C0731e(bVar2, false);
                dVar2.mo5465u(-483455358);
                C1711v a2 = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, dVar2);
                dVar2.mo5465u(-1323940314);
                C7282b bVar3 = (C7282b) dVar2.mo5410J(l1Var);
                LayoutDirection layoutDirection2 = (LayoutDirection) dVar2.mo5410J(l1Var2);
                C1843j1 j1Var2 = (C1843j1) dVar2.mo5410J(l1Var3);
                ComposableLambdaImpl a3 = C1700o.m3617a(eVar);
                if (dVar.mo5446k() instanceof C1299c) {
                    dVar.mo5392A();
                    if (dVar.mo5436f()) {
                        dVar2.mo5450m(aVar2);
                    } else {
                        dVar.mo5452n();
                    }
                    dVar.mo5394B();
                    Updater.m2571b(dVar2, a2, pVar5);
                    Updater.m2571b(dVar2, bVar3, pVar6);
                    Updater.m2571b(dVar2, layoutDirection2, pVar9);
                    Updater.m2571b(dVar2, j1Var2, pVar8);
                    dVar.mo5430c();
                    C0472h.m1246i(0, a3, new C1295a1(dVar2), dVar, 2058660585, -1163856341);
                    ShopViewModel shopViewModel2 = shopViewModel;
                    C11224i.C11228d dVar4 = dVar3;
                    TextKt.m19958a(dVar3.f24808a, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, (C2023s) null, dVar, 0, 0, 8190);
                    C1302d dVar5 = dVar;
                    C15588c1.m25324f(SizeKt.m1488h(aVar, ((C12159j) dVar5.mo5410J(DimensKt.f27051e)).f27177e), dVar5, 0);
                    C11215b bVar4 = dVar4.f24809b;
                    if (bVar4 != null) {
                        ButtonKt.m19939a(C12145e.C12146a.f27083a, new GenericErrorStateKt$GenericErrorState$1$1$1$1$1(shopViewModel2, bVar4), (C1436d) null, "Retry", (String) null, (C12142d) null, (Integer) null, false, false, dVar, 3080, 500);
                        C19394m mVar = C19394m.f43287a;
                    }
                    dVar.mo5406H();
                    dVar.mo5406H();
                    dVar.mo5456p();
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
        dVar.mo5396C();
    }
}
