package com.etsy.android.p327ui.home.etsylens;

import android.support.p013v4.media.C0073e;
import android.view.View;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.window.AndroidPopup_androidKt;
import androidx.compose.p015ui.window.C2093f;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$EtsyLensOnboardingPromptComposable$2 */
public final class C9957x883f9e29 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
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
    public final /* synthetic */ View $target;
    public final /* synthetic */ String $title;
    public final /* synthetic */ int $top;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9957x883f9e29(View view, C19846a<C19394m> aVar, int i, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, int i2, int i3, String str, C19846a<C19394m> aVar2, String str2, C19846a<C19394m> aVar3, String str3, C19846a<C19394m> aVar4, int i4, String str4, String str5, float f) {
        super(2);
        this.$target = view;
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
            C1436d f = SizeKt.m1486f(C1436d.C1437a.f3125b);
            View view = this.$target;
            C19846a<C19394m> aVar = this.$onBackgroundClicked;
            int i2 = this.$$dirty;
            Ref$FloatRef ref$FloatRef = this.$tapWidth;
            Ref$FloatRef ref$FloatRef2 = this.$tapHeight;
            int i3 = this.$left;
            int i4 = this.$top;
            String str = this.$searchByImageLabel;
            C19846a<C19394m> aVar2 = this.$onCameraButtonClicked;
            String str2 = this.$mainButton;
            C19846a<C19394m> aVar3 = this.$onMainButtonClicked;
            String str3 = this.$altButton;
            C19846a<C19394m> aVar4 = this.$onAltButtonClicked;
            C19846a<C19394m> aVar5 = aVar2;
            int i5 = this.$bottom;
            String str4 = this.$title;
            String str5 = this.$badge;
            float f2 = this.$anchorOffset;
            dVar2.mo5465u(733328855);
            C19846a<C19394m> aVar6 = aVar4;
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            String str6 = str3;
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C19846a<C19394m> aVar7 = aVar3;
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            String str7 = str2;
            C19846a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(f);
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
                C19846a<C19394m> aVar9 = aVar6;
                ComposableLambdaImpl composableLambdaImpl = a;
                String str8 = str6;
                C19846a<C19394m> aVar10 = aVar7;
                String str9 = str7;
                float f3 = f2;
                int i6 = i5;
                String str10 = str4;
                String str11 = str5;
                C19846a<C19394m> aVar11 = aVar5;
                C0472h.m1246i(0, composableLambdaImpl, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -2137368960);
                EtsyLensOnboardingPromptComposableKt.m18161b(view, dVar2, 8);
                C2093f fVar = new C2093f(true, true, true, false, 24);
                dVar2.mo5465u(1157296644);
                boolean I = dVar2.mo5408I(aVar);
                Object v = dVar.mo5467v();
                if (I || v == C1302d.C1303a.f2828a) {
                    v = new C9958xeea2ab50(aVar);
                    dVar2.mo5454o(v);
                }
                dVar.mo5406H();
                AndroidPopup_androidKt.m4515b((C1428a) null, 0, (C19846a) v, fVar, C18263b.m30805A(dVar2, 1034379197, new C9959x5937b84(aVar, i2, ref$FloatRef, ref$FloatRef2, i3, i4, str, aVar11, str9, aVar10, str8, aVar9, i6, str10, str11, f3)), dVar, 24576, 3);
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
