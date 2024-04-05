package com.etsy.collagecompose;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.collagecompose.ComposableSingletons$ButtonKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ButtonKt$lambda1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$ButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$ButtonKt$lambda1$1();

    public ComposableSingletons$ButtonKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d g = SizeKt.m1487g(SizeKt.m1485e(ScrollKt.m1317c(C1436d.C1437a.f3125b, ScrollKt.m1315a(dVar))));
            C1345l1 l1Var = DimensKt.f27051e;
            C1436d G0 = C15588c1.m25281G0(g, ((C12159j) dVar.mo5410J(l1Var)).f27179g, ((C12159j) dVar.mo5410J(l1Var)).f27179g);
            C0718d.C0727i iVar = C0718d.f1476a;
            C0718d.C0726h g2 = C0718d.m1571g(((C12159j) dVar.mo5410J(l1Var)).f27176d);
            dVar.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(g2, C1428a.C1429a.f3116l, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(G0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, 2058660585, -1163856341);
                ButtonKt.m19944f(dVar, 0);
                ButtonKt.m19942d(dVar, 0);
                ButtonKt.m19945g(dVar, 0);
                ButtonKt.m19946h(dVar, 0);
                ButtonKt.m19943e(dVar, 0);
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
