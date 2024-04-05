package com.etsy.android.config.flags.p073ui.switchconfigflag;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0756s;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.C1237c;
import androidx.compose.material.ripple.C1244j;
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
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.collagecompose.BadgeKt;
import com.etsy.collagecompose.BadgeStyle;
import com.etsy.collagecompose.SwitchKt;
import com.etsy.collagecompose.TextKt;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.SwitchConfigComposableKt */
public final class SwitchConfigComposableKt {
    /* renamed from: a */
    public static final void m12835a(String str, String str2, boolean z, String str3, BadgeStyle badgeStyle, Integer num, C19846a<C19394m> aVar, C19857l<? super Boolean, C19394m> lVar, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        C1436d.C1437a aVar2;
        C1436d.C1437a aVar3;
        String str4 = str;
        String str5 = str2;
        boolean z2 = z;
        String str6 = str3;
        BadgeStyle badgeStyle2 = badgeStyle;
        C19846a<C19394m> aVar4 = aVar;
        C19857l<? super Boolean, C19394m> lVar2 = lVar;
        int i3 = i;
        C19383o.m32797g(str4, "flagName");
        C19383o.m32797g(str5, "description");
        C19383o.m32797g(badgeStyle2, "statusStyle");
        C19383o.m32797g(aVar4, "onClick");
        C19383o.m32797g(lVar2, "onLongClick");
        ComposerImpl h = dVar.mo5440h(222518878);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(str4) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(str5) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5427a(z2) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(str6) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((57344 & i3) == 0) {
            i2 |= h.mo5408I(badgeStyle2) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        Integer num2 = num;
        if ((458752 & i3) == 0) {
            i2 |= h.mo5408I(num2) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i2 |= h.mo5408I(aVar4) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= h.mo5408I(lVar2) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((i4 & 23967451) != 4793490 || !h.mo5442i()) {
            C0718d.C0724f fVar = C0718d.f1482g;
            C1432b.C1434b bVar = C1428a.C1429a.f3114j;
            C1436d.C1437a aVar5 = C1436d.C1437a.f3125b;
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            Object obj = C1302d.C1303a.f2828a;
            if (c0 == obj) {
                c0 = C0072d.m198e(h);
            }
            h.mo5418R(false);
            C0640j jVar = (C0640j) c0;
            Object obj2 = obj;
            C1436d.C1437a aVar6 = aVar5;
            C1432b.C1434b bVar2 = bVar;
            C0718d.C0724f fVar2 = fVar;
            C1237c a = C1244j.m2369a(false, 0.0f, C0005b.m35c0(h).f27121a, h, 0, 3);
            Boolean valueOf = Boolean.valueOf(z);
            int i5 = i4 >> 3;
            h.mo5465u(511388516);
            boolean I = h.mo5408I(valueOf) | h.mo5408I(lVar2);
            Object c02 = h.mo5431c0();
            if (I || c02 == obj2) {
                c02 = new SwitchConfigComposableKt$SwitchConfig$2$1(lVar2, z2);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            ComposerImpl composerImpl3 = h;
            C1436d G0 = C15588c1.m25281G0(SizeKt.m1489i(SizeKt.m1487g(ClickableKt.m1299e(jVar, a, true, (String) null, (C1900g) null, (String) null, (C19846a) c02, (C19846a) null, aVar)), C0005b.m36d0(composerImpl3).f27181i, 0.0f, 2), C0005b.m36d0(composerImpl3).f27179g, C0005b.m36d0(composerImpl3).f27177e);
            ComposerImpl composerImpl4 = composerImpl3;
            composerImpl4.mo5465u(693286680);
            C1711v a2 = RowKt.m1480a(fVar2, bVar2, composerImpl4);
            composerImpl4.mo5465u(-1323940314);
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar3 = (C7282b) composerImpl4.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) composerImpl4.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) composerImpl4.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a3 = C1700o.m3617a(G0);
            C1345l1 l1Var4 = l1Var3;
            if (composerImpl4.f2715a instanceof C1299c) {
                composerImpl4.mo5392A();
                if (composerImpl4.f2702K) {
                    composerImpl4.mo5450m(aVar7);
                } else {
                    composerImpl4.mo5452n();
                }
                composerImpl4.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(composerImpl4, a2, pVar);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar2 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(composerImpl4, bVar3, pVar2);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar3 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(composerImpl4, layoutDirection, pVar3);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar4 = ComposeUiNode.Companion.f3783g;
                C1295a1 i6 = C13983i.m21490i(composerImpl4, j1Var, pVar4, composerImpl4);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar5 = pVar3;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar6 = pVar4;
                ComposableLambdaImpl composableLambdaImpl = a3;
                C19846a<ComposeUiNode> aVar8 = aVar7;
                C1345l1 l1Var5 = l1Var4;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar7 = pVar;
                C1345l1 l1Var6 = l1Var2;
                C0326j.m868m(0, composableLambdaImpl, i6, composerImpl4, 2058660585, -678309503);
                if (((double) 0.8f) > ShadowDrawableWrapper.COS_45) {
                    C19857l<C1859o0, C19394m> lVar3 = InspectableValueKt.f4032a;
                    C0756s sVar = new C0756s(0.8f, true);
                    composerImpl4.mo5465u(-483455358);
                    C1711v a4 = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, composerImpl4);
                    composerImpl4.mo5465u(-1323940314);
                    C7282b bVar4 = (C7282b) composerImpl4.mo5410J(l1Var);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerImpl4.mo5410J(l1Var6);
                    C1843j1 j1Var2 = (C1843j1) composerImpl4.mo5410J(l1Var5);
                    ComposableLambdaImpl a5 = C1700o.m3617a(sVar);
                    if (composerImpl4.f2715a instanceof C1299c) {
                        composerImpl4.mo5392A();
                        if (composerImpl4.f2702K) {
                            composerImpl4.mo5450m(aVar8);
                        } else {
                            composerImpl4.mo5452n();
                        }
                        composerImpl4.f2738x = false;
                        C0326j.m868m(0, a5, C0023f.m106g(composerImpl4, a4, pVar7, composerImpl4, bVar4, pVar2, composerImpl4, layoutDirection2, pVar5, composerImpl4, j1Var2, pVar6, composerImpl4), composerImpl4, 2058660585, -1163856341);
                        ComposerImpl composerImpl5 = composerImpl4;
                        ComposerImpl composerImpl6 = composerImpl5;
                        TextKt.m19958a(str, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, C0005b.m41h0(composerImpl5).f27199e, composerImpl6, i4 & 14, 0, 4094);
                        composerImpl6.mo5465u(1764163054);
                        if (!C19457k.m33020X0(str2)) {
                            C1436d.C1437a aVar9 = aVar6;
                            C15588c1.m25324f(SizeKt.m1488h(aVar9, C0005b.m36d0(composerImpl6).f27176d), composerImpl6, 0);
                            aVar2 = aVar9;
                            composerImpl2 = composerImpl6;
                            TextKt.m19958a(str2, (C1436d) null, C0005b.m35c0(composerImpl6).f27131f, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, C0005b.m41h0(composerImpl6).f27200f, composerImpl6, i5 & 14, 0, 4090);
                        } else {
                            composerImpl2 = composerImpl6;
                            aVar2 = aVar6;
                        }
                        composerImpl = composerImpl2;
                        composerImpl.mo5418R(false);
                        composerImpl.mo5465u(-377106773);
                        if (str3 == null) {
                            aVar3 = aVar2;
                        } else {
                            aVar3 = aVar2;
                            C15588c1.m25324f(SizeKt.m1488h(aVar3, C0005b.m36d0(composerImpl).f27177e), composerImpl, 0);
                            int i7 = i4 >> 9;
                            BadgeKt.m19938a(str3, badgeStyle, (C1436d) null, num, composerImpl, (i7 & 112) | (i7 & 14) | ((i4 >> 6) & 7168), 4);
                            C19394m mVar = C19394m.f43287a;
                        }
                        C0087d.m238h(composerImpl, false, false, false, true);
                        composerImpl.mo5418R(false);
                        composerImpl.mo5418R(false);
                        SwitchKt.m19956a(z, (C19857l<? super Boolean, C19394m>) null, C15588c1.m25287J0(aVar3, C0005b.m36d0(composerImpl).f27177e, 0.0f, 0.0f, 0.0f, 14), composerImpl, ((i4 >> 6) & 14) | 48, 0);
                        C0087d.m238h(composerImpl, false, false, true, false);
                        composerImpl.mo5418R(false);
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException("invalid weight 0.8; must be greater than zero".toString());
                }
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new SwitchConfigComposableKt$SwitchConfig$4(str, str2, z, str3, badgeStyle, num, aVar, lVar, i);
        }
    }
}
