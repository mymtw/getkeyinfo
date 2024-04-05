package com.etsy.collagecompose;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0752o;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.material.C1225q1;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.SurfaceKt;
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
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment;
import com.google.accompanist.flowlayout.FlowKt;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.google.accompanist.flowlayout.SizeMode;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p202p.C7638a;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DialogKt$Dialog$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19846a<C19394m> $confirmButtonOnClick;
    public final /* synthetic */ String $confirmButtonText;
    public final /* synthetic */ C19846a<C19394m> $dismissButtonOnClick;
    public final /* synthetic */ String $dismissButtonText;
    public final /* synthetic */ String $message;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogKt$Dialog$1(C1436d dVar, int i, String str, String str2, String str3, C19846a<C19394m> aVar, String str4, C19846a<C19394m> aVar2) {
        super(2);
        this.$modifier = dVar;
        this.$$dirty = i;
        this.$title = str;
        this.$message = str2;
        this.$dismissButtonText = str3;
        this.$dismissButtonOnClick = aVar;
        this.$confirmButtonText = str4;
        this.$confirmButtonOnClick = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C7638a aVar = ((C1225q1) dVar2.mo5410J(ShapesKt.f2252a)).f2548b;
            float f = ((C12159j) dVar2.mo5410J(DimensKt.f27051e)).f27183k;
            C1345l1 l1Var = ColorsKt.f27041n;
            long j = ((C12158i) dVar2.mo5410J(l1Var)).f27147n;
            long j2 = ((C12158i) dVar2.mo5410J(l1Var)).f27121a;
            C1436d dVar3 = this.$modifier;
            final String str = this.$title;
            final String str2 = this.$message;
            final int i2 = this.$$dirty;
            final String str3 = this.$dismissButtonText;
            C19846a<C19394m> aVar2 = this.$dismissButtonOnClick;
            final String str4 = this.$confirmButtonText;
            final C19846a<C19394m> aVar3 = aVar2;
            final C19846a<C19394m> aVar4 = this.$confirmButtonOnClick;
            SurfaceKt.m2234a(dVar3, aVar, j, j2, (C0556g) null, f, C18263b.m30805A(dVar2, 1149665436, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    C19861p<ComposeUiNode, C1843j1, C19394m> pVar;
                    C1345l1 l1Var;
                    C1432b.C1433a aVar;
                    C1345l1 l1Var2;
                    C1345l1 l1Var3;
                    C19846a<ComposeUiNode> aVar2;
                    C19861p<ComposeUiNode, C1711v, C19394m> pVar2;
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar3;
                    C1345l1 l1Var4;
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar4;
                    String str;
                    C1436d.C1437a aVar3;
                    String str2;
                    int i2;
                    String str3;
                    C19846a<C19394m> aVar4;
                    String str4;
                    C1302d dVar2;
                    C1345l1 l1Var5;
                    C1302d dVar3 = dVar;
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C1436d.C1437a aVar5 = C1436d.C1437a.f3125b;
                        C1345l1 l1Var6 = DimensKt.f27051e;
                        C1436d G0 = C15588c1.m25281G0(aVar5, ((C12159j) dVar3.mo5410J(l1Var6)).f27180h, ((C12159j) dVar3.mo5410J(l1Var6)).f27179g);
                        String str5 = str;
                        String str6 = str2;
                        int i3 = i2;
                        String str7 = str3;
                        C19846a<C19394m> aVar6 = aVar3;
                        String str8 = str4;
                        C19846a<C19394m> aVar7 = aVar4;
                        dVar3.mo5465u(-483455358);
                        C0718d.C0728j jVar = C0718d.f1478c;
                        C1432b.C1433a aVar8 = C1428a.C1429a.f3116l;
                        C1711v a = ColumnKt.m1461a(jVar, aVar8, dVar3);
                        dVar3.mo5465u(-1323940314);
                        C1345l1 l1Var7 = CompositionLocalsKt.f4019e;
                        C7282b bVar = (C7282b) dVar3.mo5410J(l1Var7);
                        String str9 = str6;
                        C1345l1 l1Var8 = CompositionLocalsKt.f4025k;
                        LayoutDirection layoutDirection = (LayoutDirection) dVar3.mo5410J(l1Var8);
                        int i4 = i3;
                        C1345l1 l1Var9 = CompositionLocalsKt.f4029o;
                        C1345l1 l1Var10 = l1Var7;
                        C1843j1 j1Var = (C1843j1) dVar3.mo5410J(l1Var9);
                        ComposeUiNode.f3776c0.getClass();
                        String str10 = str7;
                        C19846a<ComposeUiNode> aVar9 = ComposeUiNode.Companion.f3778b;
                        ComposableLambdaImpl a2 = C1700o.m3617a(G0);
                        if (dVar.mo5446k() instanceof C1299c) {
                            dVar.mo5392A();
                            if (dVar.mo5436f()) {
                                dVar3.mo5450m(aVar9);
                            } else {
                                dVar.mo5452n();
                            }
                            dVar.mo5394B();
                            C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = ComposeUiNode.Companion.f3781e;
                            Updater.m2571b(dVar3, a, pVar5);
                            C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = ComposeUiNode.Companion.f3780d;
                            Updater.m2571b(dVar3, bVar, pVar6);
                            C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = ComposeUiNode.Companion.f3782f;
                            Updater.m2571b(dVar3, layoutDirection, pVar7);
                            C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = ComposeUiNode.Companion.f3783g;
                            C19846a<C19394m> aVar10 = aVar6;
                            C19861p<ComposeUiNode, C1711v, C19394m> pVar9 = pVar5;
                            C19861p<ComposeUiNode, C7282b, C19394m> pVar10 = pVar6;
                            C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar11 = pVar7;
                            C1345l1 l1Var11 = l1Var10;
                            C1432b.C1433a aVar11 = aVar8;
                            C19846a<C19394m> aVar12 = aVar7;
                            C0472h.m1246i(0, a2, C0073e.m204d(dVar3, j1Var, pVar8, dVar3), dVar, 2058660585, -1163856341);
                            dVar3.mo5465u(-1196786558);
                            if (str5 == null) {
                                pVar = pVar8;
                                str = "<this>";
                                str4 = str8;
                                pVar2 = pVar9;
                                aVar2 = aVar9;
                                l1Var3 = l1Var9;
                                l1Var = l1Var8;
                                l1Var2 = l1Var6;
                                dVar2 = dVar3;
                                aVar4 = aVar10;
                                pVar3 = pVar10;
                                pVar4 = pVar11;
                                l1Var4 = l1Var11;
                                aVar = aVar11;
                                aVar3 = aVar5;
                                str2 = str9;
                                i2 = i4;
                                str3 = str10;
                            } else {
                                float f = ((C12159j) dVar3.mo5410J(l1Var6)).f27177e;
                                str4 = str8;
                                C1436d J0 = C15588c1.m25287J0(aVar5, 0.0f, 0.0f, 0.0f, f, 7);
                                C19383o.m32797g(J0, "<this>");
                                C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                                C1432b.C1433a aVar13 = aVar11;
                                C1436d i0 = J0.mo6148i0(new C0752o(aVar13));
                                dVar3.mo5465u(733328855);
                                C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar3);
                                dVar3.mo5465u(-1323940314);
                                C7282b bVar2 = (C7282b) dVar3.mo5410J(l1Var11);
                                LayoutDirection layoutDirection2 = (LayoutDirection) dVar3.mo5410J(l1Var8);
                                String str11 = "<this>";
                                C1843j1 j1Var2 = (C1843j1) dVar3.mo5410J(l1Var9);
                                ComposableLambdaImpl a3 = C1700o.m3617a(i0);
                                if (dVar.mo5446k() instanceof C1299c) {
                                    dVar.mo5392A();
                                    if (dVar.mo5436f()) {
                                        dVar3.mo5450m(aVar9);
                                    } else {
                                        dVar.mo5452n();
                                    }
                                    dVar.mo5394B();
                                    Updater.m2571b(dVar3, c, pVar9);
                                    C19861p<ComposeUiNode, C7282b, C19394m> pVar12 = pVar10;
                                    Updater.m2571b(dVar3, bVar2, pVar12);
                                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar13 = pVar11;
                                    Updater.m2571b(dVar3, layoutDirection2, pVar13);
                                    Updater.m2571b(dVar3, j1Var2, pVar8);
                                    dVar.mo5430c();
                                    str = str11;
                                    pVar4 = pVar13;
                                    pVar3 = pVar12;
                                    l1Var4 = l1Var11;
                                    C0472h.m1246i(0, a3, new C1295a1(dVar3), dVar, 2058660585, -2137368960);
                                    pVar2 = pVar9;
                                    aVar4 = aVar10;
                                    aVar2 = aVar9;
                                    str3 = str10;
                                    l1Var3 = l1Var9;
                                    i2 = i4;
                                    str2 = str9;
                                    l1Var2 = l1Var6;
                                    aVar3 = aVar5;
                                    C1302d dVar4 = dVar3;
                                    aVar = aVar13;
                                    pVar = pVar8;
                                    l1Var = l1Var8;
                                    dVar2 = dVar4;
                                    TextKt.m19958a(str5, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar3.mo5410J(TypographyKt.f27060a)).f27196b, dVar, (i2 >> 6) & 14, 0, 4094);
                                    C0048b.m166e(dVar);
                                    C19394m mVar = C19394m.f43287a;
                                } else {
                                    C0005b.m45j0();
                                    throw null;
                                }
                            }
                            dVar.mo5406H();
                            dVar2.mo5465u(-1196786127);
                            if (str2 == null) {
                                l1Var5 = l1Var2;
                            } else {
                                C1345l1 l1Var12 = l1Var2;
                                C1436d J02 = C15588c1.m25287J0(aVar3, 0.0f, 0.0f, 0.0f, ((C12159j) dVar2.mo5410J(l1Var12)).f27179g, 7);
                                C19383o.m32797g(J02, str);
                                C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
                                C1436d i02 = J02.mo6148i0(new C0752o(aVar));
                                dVar2.mo5465u(733328855);
                                C1711v c2 = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar2);
                                dVar2.mo5465u(-1323940314);
                                C7282b bVar3 = (C7282b) dVar2.mo5410J(l1Var4);
                                LayoutDirection layoutDirection3 = (LayoutDirection) dVar2.mo5410J(l1Var);
                                C1843j1 j1Var3 = (C1843j1) dVar2.mo5410J(l1Var3);
                                ComposableLambdaImpl a4 = C1700o.m3617a(i02);
                                if (dVar.mo5446k() instanceof C1299c) {
                                    dVar.mo5392A();
                                    if (dVar.mo5436f()) {
                                        dVar2.mo5450m(aVar2);
                                    } else {
                                        dVar.mo5452n();
                                    }
                                    dVar.mo5394B();
                                    Updater.m2571b(dVar2, c2, pVar2);
                                    Updater.m2571b(dVar2, bVar3, pVar3);
                                    Updater.m2571b(dVar2, layoutDirection3, pVar4);
                                    Updater.m2571b(dVar2, j1Var3, pVar);
                                    dVar.mo5430c();
                                    C0472h.m1246i(0, a4, new C1295a1(dVar2), dVar, 2058660585, -2137368960);
                                    l1Var5 = l1Var12;
                                    TextKt.m19958a(str2, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar2.mo5410J(TypographyKt.f27060a)).f27199e, dVar, (i2 >> 9) & 14, 0, 4094);
                                    C0048b.m166e(dVar);
                                    C19394m mVar2 = C19394m.f43287a;
                                } else {
                                    C0005b.m45j0();
                                    throw null;
                                }
                            }
                            dVar.mo5406H();
                            MainAxisAlignment mainAxisAlignment = MainAxisAlignment.End;
                            C1345l1 l1Var13 = l1Var5;
                            FlowKt.m20295b((C1436d) null, SizeMode.Expand, mainAxisAlignment, ((C12159j) dVar2.mo5410J(l1Var13)).f27179g, (FlowCrossAxisAlignment) null, ((C12159j) dVar2.mo5410J(l1Var13)).f27174b, (MainAxisAlignment) null, C18263b.m30805A(dVar2, -1412586868, new DialogKt$Dialog$1$1$1$3(str3, aVar4, i2, str4, aVar12)), dVar, 12583344, 81);
                            C0048b.m166e(dVar);
                            return;
                        }
                        C0005b.m45j0();
                        throw null;
                    }
                    dVar.mo5396C();
                }
            }), dVar, ((this.$$dirty >> 3) & 14) | 1572864, 16);
            return;
        }
        dVar.mo5396C();
    }
}
