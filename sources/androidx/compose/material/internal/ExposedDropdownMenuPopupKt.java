package androidx.compose.material.internal;

import android.support.p013v4.media.session.C0087d;
import android.view.View;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.window.C2092e;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.C1366b;
import androidx.compose.runtime.saveable.C1374h;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.UUID;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

public final class ExposedDropdownMenuPopupKt {

    /* renamed from: a */
    public static final C1411t f2482a = CompositionLocalKt.m2531b(ExposedDropdownMenuPopupKt$LocalPopupTestTag$1.INSTANCE);

    /* renamed from: a */
    public static final void m2329a(C19846a<C19394m> aVar, C2092e eVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i, int i2) {
        int i3;
        C19846a<C19394m> aVar2;
        C1345l1 l1Var;
        C2092e eVar2 = eVar;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        int i4 = i;
        C19383o.m32797g(eVar2, "popupPositionProvider");
        C19383o.m32797g(pVar2, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-841446797);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i4 | 6;
            aVar2 = aVar;
        } else if ((i4 & 14) == 0) {
            aVar2 = aVar;
            i3 = (h.mo5408I(aVar2) ? 4 : 2) | i4;
        } else {
            aVar2 = aVar;
            i3 = i4;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i4 & 112) == 0) {
            i3 |= h.mo5408I(eVar2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i4 & 896) == 0) {
            i3 |= h.mo5408I(pVar2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !h.mo5442i()) {
            C19846a<C19394m> aVar3 = i5 != 0 ? null : aVar2;
            View view = (View) h.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
            C1345l1 l1Var2 = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var2);
            String str = (String) h.mo5410J(f2482a);
            C1345l1 l1Var3 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var3);
            C1324g m0 = C0005b.m50m0(h);
            C1338j0 E0 = C0761x.m1664E0(pVar2, h);
            UUID uuid = (UUID) C1366b.m2863a(new Object[0], (C1374h) null, ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1.INSTANCE, h, 6);
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            if (c0 == C1302d.C1303a.f2828a) {
                C19383o.m32796f(uuid, "popupId");
                PopupLayout popupLayout = r0;
                C1338j0 j0Var = E0;
                l1Var = l1Var3;
                C1324g gVar = m0;
                PopupLayout popupLayout2 = new PopupLayout(aVar3, str, view, bVar, eVar, uuid);
                ComposableLambdaImpl B = C18263b.m30807B(new C1196x6408c734(popupLayout, j0Var), 144472904, true);
                C19383o.m32797g(gVar, ResponseConstants.PARENT);
                popupLayout.setParentCompositionContext(gVar);
                popupLayout.f2500n.setValue(B);
                popupLayout.f2501o = true;
                h.mo5407H0(popupLayout);
                c0 = popupLayout;
            } else {
                l1Var = l1Var3;
            }
            h.mo5418R(false);
            PopupLayout popupLayout3 = (PopupLayout) c0;
            C1415u.m3028b(popupLayout3, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1(popupLayout3, aVar3, str, layoutDirection), h);
            C1415u.m3033g(new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2(popupLayout3, aVar3, str, layoutDirection), h);
            C1415u.m3028b(eVar2, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3(popupLayout3, eVar2), h);
            C1436d A0 = C15588c1.m25270A0(C1436d.C1437a.f3125b, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(popupLayout3));
            ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 exposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6(popupLayout3, layoutDirection);
            h.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) h.mo5410J(l1Var2);
            LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(A0);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar4);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, exposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection2, ComposeUiNode.Companion.f3782f);
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -261830998);
                C0087d.m238h(h, false, false, true, false);
                aVar2 = aVar3;
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7(aVar2, eVar, pVar, i, i2);
        }
    }
}
