package com.etsy.collagecompose;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
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
import com.etsy.collagecompose.C12122a;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

final class AlertKt$AlertsPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C19846a<C19394m> $altClickToaster;
    public final /* synthetic */ C19846a<C19394m> $backgroundClickToaster;
    public final /* synthetic */ C19846a<C19394m> $dismissClickToaster;
    public final /* synthetic */ C19846a<C19394m> $mainClickToaster;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertKt$AlertsPreview$1(C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19846a<C19394m> aVar3, C19846a<C19394m> aVar4) {
        super(2);
        this.$backgroundClickToaster = aVar;
        this.$dismissClickToaster = aVar2;
        this.$mainClickToaster = aVar3;
        this.$altClickToaster = aVar4;
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
            C1436d H0 = C15588c1.m25283H0(g, 0.0f, ((C12159j) dVar2.mo5410J(l1Var)).f27179g, 1);
            C0718d.C0727i iVar = C0718d.f1476a;
            C0718d.C0726h g2 = C0718d.m1571g(((C12159j) dVar2.mo5410J(l1Var)).f27177e);
            C1432b.C1433a aVar2 = C1428a.C1429a.f3117m;
            C19846a<C19394m> aVar3 = this.$backgroundClickToaster;
            C19846a<C19394m> aVar4 = this.$dismissClickToaster;
            C19846a<C19394m> aVar5 = this.$mainClickToaster;
            C19846a<C19394m> aVar6 = this.$altClickToaster;
            dVar2.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(g2, aVar2, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(H0);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar7);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -1163856341);
                C19846a<C19394m> aVar8 = aVar3;
                String str = "Alerts";
                TextKt.m19958a(str, C15588c1.m25287J0(aVar, ((C12159j) dVar2.mo5410J(l1Var)).f27179g, 0.0f, 0.0f, 0.0f, 14), 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar2.mo5410J(TypographyKt.f27060a)).f27195a, dVar, 6, 0, 4092);
                AlertType alertType = AlertType.Success;
                C1436d.C1437a aVar9 = aVar;
                AlertKt.m19937a(alertType, "You’re a pro!", TestTagKt.m3948a(aVar9, "success"), (C12122a.C12125c) null, (C12122a.C12123a) null, (C12122a.C12124b) null, aVar8, "You created your first list. Tap to view it.", (String) null, R.drawable.clg_icon_core_bestseller_v1, (String) null, false, false, (AnchorDirection) null, 0.0f, false, false, dVar, 12583350, 0, 130360);
                C1436d.C1437a aVar10 = aVar9;
                C1302d dVar3 = dVar;
                AlertKt.m19937a(alertType, "Your privacy settings are updated.", TestTagKt.m3948a(aVar10, "success_floating"), (C12122a.C12125c) null, (C12122a.C12123a) null, (C12122a.C12124b) null, (C19846a<C19394m>) null, (String) null, (String) null, 0, "clg_icon_core_check_v1", false, false, (AnchorDirection) null, 0.0f, true, false, dVar3, 438, 196614, 97272);
                AlertType alertType2 = AlertType.News;
                AlertKt.m19937a(alertType2, "New items just for you", TestTagKt.m3948a(aVar10, "news_floating"), (C12122a.C12125c) null, (C12122a.C12123a) null, (C12122a.C12124b) null, aVar8, (String) null, (String) null, 0, (String) null, false, false, AnchorDirection.End, 0.0f, true, true, dVar, 438, 1772544, 24504);
                C12122a.C12124b bVar2 = r2;
                C12122a.C12124b bVar3 = new C12122a.C12124b(aVar4);
                AlertKt.m19937a(alertType2, "Do you like what you see?", TestTagKt.m3948a(aVar10, "news"), (C12122a.C12125c) null, (C12122a.C12123a) null, bVar2, (C19846a<C19394m>) null, "Favorite 5 more items to get even better recommendations.", (String) null, R.drawable.clg_icon_core_heart_fill_v1, (String) null, false, false, (AnchorDirection) null, 0.0f, false, false, dVar, 12583350, 0, 130392);
                C1436d a3 = TestTagKt.m3948a(aVar10, "news_largeTitle_anchor_buttons");
                C12122a.C12125c cVar = r2;
                C19846a<C19394m> aVar11 = aVar5;
                C12122a.C12125c cVar2 = new C12122a.C12125c("Show me", aVar11);
                C12122a.C12123a aVar12 = r2;
                C19846a<C19394m> aVar13 = aVar6;
                C12122a.C12123a aVar14 = new C12122a.C12123a("No thanks", aVar13);
                C1436d.C1437a aVar15 = aVar10;
                AlertKt.m19937a(alertType2, "Find out about sales and new items from your favorite shops.", a3, cVar, aVar12, (C12122a.C12124b) null, (C19846a<C19394m>) null, (String) null, "New!", 0, (String) null, false, true, AnchorDirection.Start, 240.0f, true, false, dVar, 100663734, 224640, 69344);
                AlertType alertType3 = AlertType.Info;
                C12122a.C12125c cVar3 = r1;
                C19846a<C19394m> aVar16 = aVar11;
                C12122a.C12125c cVar4 = new C12122a.C12125c("I understand", aVar16);
                C12122a.C12123a aVar17 = r1;
                C19846a<C19394m> aVar18 = aVar13;
                C12122a.C12123a aVar19 = new C12122a.C12123a("Learn more", aVar18);
                C1436d.C1437a aVar20 = aVar15;
                AlertKt.m19937a(alertType3, "Our privacy policy has been updated.", TestTagKt.m3948a(aVar20, "info_buttons"), cVar3, aVar17, (C12122a.C12124b) null, (C19846a<C19394m>) null, "We use cookies to deliver a reliable and personalised Etsy experience. By browsing Etsy, you agree to our use of cookies.", (String) null, 0, (String) null, true, false, (AnchorDirection) null, 0.0f, false, false, dVar3, 12583350, 48, 128864);
                AlertType alertType4 = AlertType.InfoSubtle;
                AlertKt.m19937a(alertType4, "Sorry your expectations weren't met", TestTagKt.m3948a(aVar20, "infosubtle_icon"), (C12122a.C12125c) null, (C12122a.C12123a) null, (C12122a.C12124b) null, (C19846a<C19394m>) null, "HTML in descriptions is currently out of scope.", (String) null, R.drawable.clg_icon_core_truck_v1, (String) null, true, false, (AnchorDirection) null, 0.0f, false, false, dVar, 12583350, 48, 128376);
                C12122a.C12125c cVar5 = r1;
                C12122a.C12125c cVar6 = new C12122a.C12125c("I understand", aVar16);
                C12122a.C12123a aVar21 = r1;
                C12122a.C12123a aVar22 = new C12122a.C12123a("Learn more", aVar18);
                AlertKt.m19937a(alertType4, "Our privacy policy has been updated.", TestTagKt.m3948a(aVar20, "infosubtle_buttons"), cVar5, aVar21, (C12122a.C12124b) null, (C19846a<C19394m>) null, "We use cookies to deliver a reliable and personalised Etsy experience. By browsing Etsy, you agree to our use of cookies.", (String) null, 0, (String) null, true, false, (AnchorDirection) null, 0.0f, false, false, dVar, 12583350, 48, 128864);
                AlertType alertType5 = AlertType.Warning;
                C12122a.C12123a aVar23 = r1;
                C12122a.C12123a aVar24 = new C12122a.C12123a("Choose another option", aVar18);
                AlertKt.m19937a(alertType5, "This option is unavailable. ", TestTagKt.m3948a(aVar20, "warning_anchor_button"), (C12122a.C12125c) null, aVar23, (C12122a.C12124b) null, (C19846a<C19394m>) null, "The color you selected is not available.", (String) null, R.drawable.clg_icon_core_exclamation_v1, (String) null, false, false, AnchorDirection.Bottom, 0.0f, true, false, dVar, 12583350, 199680, 89448);
                AlertType alertType6 = AlertType.Error;
                AlertKt.m19937a(alertType6, "Your account has been suspended", TestTagKt.m3948a(aVar20, "error_fullwidth"), (C12122a.C12125c) null, (C12122a.C12123a) null, (C12122a.C12124b) null, (C19846a<C19394m>) null, "You did not comply with Etsy’s customer service standards.", (String) null, R.drawable.clg_icon_core_exclamation_v1, (String) null, true, false, (AnchorDirection) null, 0.0f, false, false, dVar, 12583350, 48, 128376);
                C12122a.C12123a aVar25 = r1;
                C12122a.C12123a aVar26 = new C12122a.C12123a("Learn about Etsy standards", aVar18);
                AlertKt.m19937a(alertType6, "Your account has been suspended", TestTagKt.m3948a(aVar20, "error_fullwidth_button"), (C12122a.C12125c) null, aVar25, (C12122a.C12124b) null, (C19846a<C19394m>) null, "You did not comply with Etsy’s customer service standards.", (String) null, R.drawable.clg_icon_core_exclamation_v1, (String) null, true, false, (AnchorDirection) null, 0.0f, false, false, dVar, 12583350, 48, 128360);
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
