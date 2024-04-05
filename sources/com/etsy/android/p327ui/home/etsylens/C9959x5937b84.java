package com.etsy.android.p327ui.home.etsylens;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.C1237c;
import androidx.compose.material.ripple.C1244j;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.collagecompose.AlertKt;
import com.etsy.collagecompose.AlertType;
import com.etsy.collagecompose.AnchorDirection;
import com.etsy.collagecompose.C12122a;
import com.etsy.collagecompose.C12158i;
import com.etsy.collagecompose.ColorsKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p202p.C7645g;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$EtsyLensOnboardingPromptComposable$2$1$2 */
public final class C9959x5937b84 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ String $altButton;
    public final /* synthetic */ float $anchorOffset;
    public final /* synthetic */ String $badge;
    public final /* synthetic */ int $bottom;
    public final /* synthetic */ int $left;
    public final /* synthetic */ String $mainButton;
    public final /* synthetic */ C19846a<C19394m> $onAltButtonClicked;
    public final /* synthetic */ C19846a<C19394m> $onBackgroundClicked;
    public final /* synthetic */ C19846a<C19394m> $onCameraButtonClicked;
    public final /* synthetic */ C19846a<C19394m> $onMainButtonClicked;
    public final /* synthetic */ String $searchByImageLabel;
    public final /* synthetic */ Ref$FloatRef $tapHeight;
    public final /* synthetic */ Ref$FloatRef $tapWidth;
    public final /* synthetic */ String $title;
    public final /* synthetic */ int $top;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9959x5937b84(C19846a<C19394m> aVar, int i, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, int i2, int i3, String str, C19846a<C19394m> aVar2, String str2, C19846a<C19394m> aVar3, String str3, C19846a<C19394m> aVar4, int i4, String str4, String str5, float f) {
        super(2);
        this.$onBackgroundClicked = aVar;
        this.$$dirty = i;
        this.$tapWidth = ref$FloatRef;
        this.$tapHeight = ref$FloatRef2;
        this.$left = i2;
        this.$top = i3;
        this.$searchByImageLabel = str;
        this.$onCameraButtonClicked = aVar2;
        this.$mainButton = str2;
        this.$onMainButtonClicked = aVar3;
        this.$altButton = str3;
        this.$onAltButtonClicked = aVar4;
        this.$bottom = i4;
        this.$title = str4;
        this.$badge = str5;
        this.$anchorOffset = f;
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
            C19846a<C19394m> aVar2 = this.$onBackgroundClicked;
            dVar2.mo5465u(1157296644);
            boolean I = dVar2.mo5408I(aVar2);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new C9960xd0b3335e(aVar2);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            C1436d d = ClickableKt.m1298d(f, (C19846a) v);
            Ref$FloatRef ref$FloatRef = this.$tapWidth;
            Ref$FloatRef ref$FloatRef2 = this.$tapHeight;
            int i2 = this.$left;
            int i3 = this.$top;
            String str = this.$searchByImageLabel;
            C19846a<C19394m> aVar3 = this.$onCameraButtonClicked;
            String str2 = this.$mainButton;
            C19846a<C19394m> aVar4 = this.$onMainButtonClicked;
            String str3 = this.$altButton;
            C19846a<C19394m> aVar5 = this.$onAltButtonClicked;
            int i4 = this.$bottom;
            String str4 = this.$title;
            C19846a<C19394m> aVar6 = aVar4;
            String str5 = this.$badge;
            float f2 = this.$anchorOffset;
            dVar2.mo5465u(733328855);
            String str6 = str4;
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            int i5 = i4;
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C19846a<C19394m> aVar7 = aVar5;
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            String str7 = str3;
            C19846a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(d);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar8);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                String str8 = str6;
                int i6 = i5;
                C19846a<C19394m> aVar9 = aVar7;
                String str9 = str7;
                float f3 = f2;
                C19846a<C19394m> aVar10 = aVar6;
                String str10 = str5;
                C0472h.m1246i(0, a, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -2137368960);
                C1436d m = SizeKt.m1493m(aVar, ref$FloatRef.element, ref$FloatRef2.element);
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i3);
                dVar2.mo5465u(511388516);
                boolean I2 = dVar2.mo5408I(valueOf) | dVar2.mo5408I(valueOf2);
                Object v2 = dVar.mo5467v();
                if (I2 || v2 == C1302d.C1303a.f2828a) {
                    v2 = new C9961x70c1efec(i2, i3);
                    dVar2.mo5454o(v2);
                }
                dVar.mo5406H();
                C1436d B = C19543e0.m33286B(C0761x.m1655A(C1993m.m4360U(m, (C19857l) v2), C1545s.f3363h, C1517e0.f3292a), C7645g.f16941a);
                dVar2.mo5465u(-492369756);
                Object v3 = dVar.mo5467v();
                Object obj = C1302d.C1303a.f2828a;
                if (v3 == obj) {
                    v3 = new C0641k();
                    dVar2.mo5454o(v3);
                }
                dVar.mo5406H();
                C0640j jVar = (C0640j) v3;
                C1237c a2 = C1244j.m2369a(false, 0.0f, ((C12158i) dVar2.mo5410J(ColorsKt.f27041n)).f27121a, dVar, 0, 3);
                C1900g gVar = new C1900g(0);
                dVar2.mo5465u(1157296644);
                boolean I3 = dVar2.mo5408I(aVar3);
                Object v4 = dVar.mo5467v();
                if (I3 || v4 == obj) {
                    v4 = new C9962x70c1f76e(aVar3);
                    dVar2.mo5454o(v4);
                }
                dVar.mo5406H();
                C1436d c2 = ClickableKt.m1297c(B, jVar, a2, false, str, gVar, (C19846a) v4, 4);
                dVar2.mo5465u(1157296644);
                boolean I4 = dVar2.mo5408I(str);
                Object v5 = dVar.mo5467v();
                if (I4 || v5 == obj) {
                    v5 = new C9963x70c1fb2f(str);
                    dVar2.mo5454o(v5);
                }
                dVar.mo5406H();
                BoxKt.m1455a(SemanticsModifierKt.m4174a(c2, false, (C19857l) v5), dVar2, 0);
                AlertType alertType = AlertType.News;
                C12122a.C12125c cVar = new C12122a.C12125c(str2, aVar10);
                C12122a.C12123a aVar11 = new C12122a.C12123a(str9, aVar9);
                AnchorDirection anchorDirection = AnchorDirection.Top;
                Integer valueOf3 = Integer.valueOf(i6);
                dVar2.mo5465u(1157296644);
                boolean I5 = dVar2.mo5408I(valueOf3);
                Object v6 = dVar.mo5467v();
                if (I5 || v6 == obj) {
                    v6 = new C9964x70c1fef0(i6);
                    dVar2.mo5454o(v6);
                }
                dVar.mo5406H();
                AlertKt.m19937a(alertType, str8, C1993m.m4360U(aVar, (C19857l) v6), cVar, aVar11, (C12122a.C12124b) null, (C19846a<C19394m>) null, (String) null, str10, 0, (String) null, false, true, anchorDirection, f3, false, false, dVar, 6, 3456, 102112);
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
