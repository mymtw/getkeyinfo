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
import androidx.compose.p015ui.platform.TestTagKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.collagecompose.ComposableSingletons$BadgeKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$BadgeKt$lambda1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$BadgeKt$lambda1$1 INSTANCE = new ComposableSingletons$BadgeKt$lambda1$1();

    public ComposableSingletons$BadgeKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d g = SizeKt.m1487g(SizeKt.m1485e(ScrollKt.m1317c(aVar, ScrollKt.m1315a(dVar))));
            C1345l1 l1Var = DimensKt.f27051e;
            C1436d G0 = C15588c1.m25281G0(g, ((C12159j) dVar2.mo5410J(l1Var)).f27179g, ((C12159j) dVar2.mo5410J(l1Var)).f27179g);
            C0718d.C0727i iVar = C0718d.f1476a;
            C0718d.C0726h g2 = C0718d.m1571g(((C12159j) dVar2.mo5410J(l1Var)).f27176d);
            dVar2.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(g2, C1428a.C1429a.f3116l, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(G0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -1163856341);
                TextKt.m19958a("Badges", (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar2.mo5410J(TypographyKt.f27060a)).f27195a, dVar, 6, 0, 4094);
                C1302d dVar3 = dVar;
                C1436d.C1437a aVar3 = aVar;
                C15588c1.m25324f(SizeKt.m1488h(aVar3, ((C12159j) dVar3.mo5410J(l1Var)).f27177e), dVar3, 0);
                C1302d dVar4 = dVar;
                BadgeKt.m19938a("Tertiary", BadgeStyle.Tertiary, TestTagKt.m3948a(aVar3, "Tertiary"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Tertiary Outline", BadgeStyle.TertiaryOutline, TestTagKt.m3948a(aVar3, "TertiaryOutline"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Tertiary Ad", BadgeStyle.TertiaryAd, TestTagKt.m3948a(aVar3, "TertiaryAd"), (Integer) null, dVar4, 438, 8);
                BadgeStyle badgeStyle = BadgeStyle.Secondary;
                BadgeKt.m19938a("Secondary", badgeStyle, TestTagKt.m3948a(aVar3, "Secondary"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Secondary with icon", badgeStyle, TestTagKt.m3948a(aVar3, "SecondaryWithIcon"), Integer.valueOf(R.drawable.clg_icon_core_gear_fill_v1), dVar4, 438, 0);
                BadgeKt.m19938a("Secondary Text", BadgeStyle.SecondaryText, TestTagKt.m3948a(aVar3, "SecondaryText"), (Integer) null, dVar4, 438, 8);
                BadgeStyle badgeStyle2 = BadgeStyle.Primary;
                BadgeKt.m19938a("Primary", badgeStyle2, TestTagKt.m3948a(aVar3, "Primary"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Primary with icon", badgeStyle2, TestTagKt.m3948a(aVar3, "PrimaryWithIcon"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Primary Text", BadgeStyle.PrimaryText, TestTagKt.m3948a(aVar3, "PrimaryText"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Urgent", BadgeStyle.Urgent, TestTagKt.m3948a(aVar3, "Urgent"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Urgent Text", BadgeStyle.UrgentText, TestTagKt.m3948a(aVar3, "UrgentText"), (Integer) null, dVar4, 438, 8);
                BadgeStyle badgeStyle3 = BadgeStyle.PriceModifier;
                BadgeKt.m19938a("Price Modifier", badgeStyle3, TestTagKt.m3948a(aVar3, "PriceModifier"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Price Modifier with icon", badgeStyle3, TestTagKt.m3948a(aVar3, "PriceModifierWithIcon"), Integer.valueOf(R.drawable.clg_icon_core_barchart_v1), dVar4, 438, 0);
                BadgeStyle badgeStyle4 = BadgeStyle.PriceModifierText;
                BadgeKt.m19938a("Price Modifier Text", badgeStyle4, TestTagKt.m3948a(aVar3, "PriceModifierText"), (Integer) null, dVar4, 438, 8);
                BadgeKt.m19938a("Price Modifier Text with icon", badgeStyle4, TestTagKt.m3948a(aVar3, "PriceModifierTextWithIcon"), Integer.valueOf(R.drawable.clg_icon_core_tag_v1), dVar4, 438, 0);
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
