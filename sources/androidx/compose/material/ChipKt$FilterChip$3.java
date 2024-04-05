package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0708a0;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p174m0.C7282b;
import p202p.C7644f;
import p202p.C7645g;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class ChipKt$FilterChip$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C1222p1 $colors;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1342k1<C1545s> $contentColor;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $selectedIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$3(C1342k1<C1545s> k1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, boolean z, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, C1222p1 p1Var, boolean z2, int i2) {
        super(2);
        this.$contentColor = k1Var;
        this.$leadingIcon = pVar;
        this.$selected = z;
        this.$selectedIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$content = qVar;
        this.$$dirty1 = i;
        this.$colors = p1Var;
        this.$enabled = z2;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(this.$contentColor.getValue().f3366a)))};
            final C19861p<C1302d, Integer, C19394m> pVar = this.$leadingIcon;
            final boolean z = this.$selected;
            final C19861p<C1302d, Integer, C19394m> pVar2 = this.$selectedIcon;
            final C19861p<C1302d, Integer, C19394m> pVar3 = this.$trailingIcon;
            final C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
            final int i2 = this.$$dirty1;
            final C1222p1 p1Var = this.$colors;
            final boolean z2 = this.$enabled;
            final int i3 = this.$$dirty;
            final C1342k1<C1545s> k1Var = this.$contentColor;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 1582291359, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C2023s sVar = ((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2411j;
                        final C19861p<C1302d, Integer, C19394m> pVar = pVar;
                        final boolean z = z;
                        final C19861p<C1302d, Integer, C19394m> pVar2 = pVar2;
                        final C19861p<C1302d, Integer, C19394m> pVar3 = pVar3;
                        final C19862q<C0763z, C1302d, Integer, C19394m> qVar = qVar;
                        final int i2 = i2;
                        final C1222p1 p1Var = p1Var;
                        final boolean z2 = z2;
                        final int i3 = i3;
                        final C1342k1<C1545s> k1Var = k1Var;
                        TextKt.m2282a(sVar, C18263b.m30805A(dVar, -1543702066, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                C0708a0 a0Var;
                                boolean z;
                                long j;
                                C1436d dVar2;
                                C1302d dVar3 = dVar;
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    C1436d.C1437a aVar = C1436d.C1437a.f3125b;
                                    C1436d J0 = C15588c1.m25287J0(SizeKt.m1484d(aVar, C1252t.f2613a, 1), (pVar != null || (z && pVar2 != null)) ? (float) 0 : C1256u.f2622a, 0.0f, pVar3 == null ? C1256u.f2622a : (float) 0, 0.0f, 10);
                                    C0718d.C0727i iVar = C0718d.f1476a;
                                    C1432b.C1434b bVar = C1428a.C1429a.f3114j;
                                    C19861p<C1302d, Integer, C19394m> pVar = pVar;
                                    boolean z2 = z;
                                    C19861p<C1302d, Integer, C19394m> pVar2 = pVar2;
                                    C19862q<C0763z, C1302d, Integer, C19394m> qVar = qVar;
                                    int i2 = i2;
                                    C19861p<C1302d, Integer, C19394m> pVar3 = pVar3;
                                    C1222p1 p1Var = p1Var;
                                    boolean z3 = z2;
                                    int i3 = i3;
                                    C1342k1<C1545s> k1Var = k1Var;
                                    dVar3.mo5465u(693286680);
                                    C1711v a = RowKt.m1480a(iVar, bVar, dVar3);
                                    dVar3.mo5465u(-1323940314);
                                    C1345l1 l1Var = CompositionLocalsKt.f4019e;
                                    C7282b bVar2 = (C7282b) dVar3.mo5410J(l1Var);
                                    boolean z4 = z3;
                                    C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
                                    C1345l1 l1Var3 = l1Var;
                                    LayoutDirection layoutDirection = (LayoutDirection) dVar3.mo5410J(l1Var2);
                                    C1345l1 l1Var4 = l1Var2;
                                    C1345l1 l1Var5 = CompositionLocalsKt.f4029o;
                                    C1342k1<C1545s> k1Var2 = k1Var;
                                    C1843j1 j1Var = (C1843j1) dVar3.mo5410J(l1Var5);
                                    ComposeUiNode.f3776c0.getClass();
                                    C1345l1 l1Var6 = l1Var5;
                                    C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
                                    ComposableLambdaImpl a2 = C1700o.m3617a(J0);
                                    if (dVar.mo5446k() instanceof C1299c) {
                                        dVar.mo5392A();
                                        if (dVar.mo5436f()) {
                                            dVar3.mo5450m(aVar2);
                                        } else {
                                            dVar.mo5452n();
                                        }
                                        dVar.mo5394B();
                                        C19861p<ComposeUiNode, C1711v, C19394m> pVar4 = ComposeUiNode.Companion.f3781e;
                                        Updater.m2571b(dVar3, a, pVar4);
                                        C19861p<ComposeUiNode, C7282b, C19394m> pVar5 = ComposeUiNode.Companion.f3780d;
                                        Updater.m2571b(dVar3, bVar2, pVar5);
                                        C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar6 = ComposeUiNode.Companion.f3782f;
                                        Updater.m2571b(dVar3, layoutDirection, pVar6);
                                        C19861p<ComposeUiNode, C1843j1, C19394m> pVar7 = ComposeUiNode.Companion.f3783g;
                                        C19861p<ComposeUiNode, C1711v, C19394m> pVar8 = pVar4;
                                        C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar9 = pVar6;
                                        C19861p<ComposeUiNode, C1843j1, C19394m> pVar10 = pVar7;
                                        C1345l1 l1Var7 = l1Var3;
                                        C1342k1<C1545s> k1Var3 = k1Var2;
                                        int i4 = i3;
                                        C19861p<C1302d, Integer, C19394m> pVar11 = pVar3;
                                        C19846a<ComposeUiNode> aVar3 = aVar2;
                                        C1345l1 l1Var8 = l1Var4;
                                        C19862q<C0763z, C1302d, Integer, C19394m> qVar2 = qVar;
                                        C1345l1 l1Var9 = l1Var8;
                                        C1345l1 l1Var10 = l1Var6;
                                        int i5 = i2;
                                        C1345l1 l1Var11 = l1Var10;
                                        C0472h.m1246i(0, a2, C0073e.m204d(dVar3, j1Var, pVar7, dVar3), dVar, 2058660585, -678309503);
                                        C0708a0 a0Var2 = C0708a0.f1463a;
                                        dVar3.mo5465u(1218705642);
                                        dVar3.mo5465u(-1943412137);
                                        int i6 = 6;
                                        if (pVar != null || (z2 && pVar2 != null)) {
                                            C15588c1.m25324f(SizeKt.m1495o(aVar, C1256u.f2623b), dVar3, 6);
                                            dVar3.mo5465u(733328855);
                                            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, dVar3);
                                            dVar3.mo5465u(-1323940314);
                                            C7282b bVar3 = (C7282b) dVar3.mo5410J(l1Var7);
                                            LayoutDirection layoutDirection2 = (LayoutDirection) dVar3.mo5410J(l1Var9);
                                            C1843j1 j1Var2 = (C1843j1) dVar3.mo5410J(l1Var11);
                                            ComposableLambdaImpl a3 = C1700o.m3617a(aVar);
                                            if (dVar.mo5446k() instanceof C1299c) {
                                                dVar.mo5392A();
                                                if (dVar.mo5436f()) {
                                                    dVar3.mo5450m(aVar3);
                                                } else {
                                                    dVar.mo5452n();
                                                }
                                                dVar.mo5394B();
                                                C19861p<ComposeUiNode, C1711v, C19394m> pVar12 = pVar8;
                                                Updater.m2571b(dVar3, c, pVar12);
                                                Updater.m2571b(dVar3, bVar3, pVar5);
                                                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar13 = pVar9;
                                                Updater.m2571b(dVar3, layoutDirection2, pVar13);
                                                C19861p<ComposeUiNode, C1843j1, C19394m> pVar14 = pVar10;
                                                Updater.m2571b(dVar3, j1Var2, pVar14);
                                                dVar.mo5430c();
                                                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar15 = pVar13;
                                                C19861p<ComposeUiNode, C1843j1, C19394m> pVar16 = pVar14;
                                                C19861p<ComposeUiNode, C1711v, C19394m> pVar17 = pVar12;
                                                C1345l1 l1Var12 = l1Var7;
                                                a0Var = a0Var2;
                                                C0472h.m1246i(0, a3, new C1295a1(dVar3), dVar, 2058660585, -2137368960);
                                                dVar3.mo5465u(-626917591);
                                                dVar3.mo5465u(649985595);
                                                if (pVar != null) {
                                                    z = z4;
                                                    C1338j0 a4 = p1Var.mo5237a(z, z2, dVar3);
                                                    CompositionLocalKt.m2530a(new C1412t0[]{ContentColorKt.f2199a.mo5908b(a4.getValue()), ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(((C1545s) a4.getValue()).f3366a)))}, pVar, dVar3, ((i4 >> 21) & 112) | 8);
                                                } else {
                                                    z = z4;
                                                }
                                                dVar.mo5406H();
                                                dVar3.mo5465u(-1943411323);
                                                if (z2 && pVar2 != null) {
                                                    long j2 = k1Var3.getValue().f3366a;
                                                    dVar3.mo5465u(649986426);
                                                    if (pVar != null) {
                                                        C1436d j3 = SizeKt.m1490j(aVar, C1256u.f2626e);
                                                        long j4 = k1Var3.getValue().f3366a;
                                                        C7644f fVar = C7645g.f16941a;
                                                        dVar2 = C19543e0.m33286B(C0761x.m1655A(j3, j4, fVar), fVar);
                                                        j = ((C1545s) p1Var.mo5238b(z, z2, dVar3).getValue()).f3366a;
                                                    } else {
                                                        j = j2;
                                                        dVar2 = aVar;
                                                    }
                                                    dVar.mo5406H();
                                                    C1432b bVar4 = C1428a.C1429a.f3108d;
                                                    dVar3.mo5465u(733328855);
                                                    C1711v c2 = BoxKt.m1457c(bVar4, false, dVar3);
                                                    dVar3.mo5465u(-1323940314);
                                                    C7282b bVar5 = (C7282b) dVar3.mo5410J(l1Var12);
                                                    LayoutDirection layoutDirection3 = (LayoutDirection) dVar3.mo5410J(l1Var9);
                                                    C1843j1 j1Var3 = (C1843j1) dVar3.mo5410J(l1Var11);
                                                    ComposableLambdaImpl a5 = C1700o.m3617a(dVar2);
                                                    if (dVar.mo5446k() instanceof C1299c) {
                                                        dVar.mo5392A();
                                                        if (dVar.mo5436f()) {
                                                            dVar3.mo5450m(aVar3);
                                                        } else {
                                                            dVar.mo5452n();
                                                        }
                                                        dVar.mo5394B();
                                                        Updater.m2571b(dVar3, c2, pVar17);
                                                        Updater.m2571b(dVar3, bVar5, pVar5);
                                                        Updater.m2571b(dVar3, layoutDirection3, pVar15);
                                                        Updater.m2571b(dVar3, j1Var3, pVar16);
                                                        dVar.mo5430c();
                                                        C0472h.m1246i(0, a5, new C1295a1(dVar3), dVar, 2058660585, -2137368960);
                                                        dVar3.mo5465u(-370889391);
                                                        CompositionLocalKt.m2530a(new C1412t0[]{ContentColorKt.f2199a.mo5908b(new C1545s(j))}, pVar2, dVar3, ((i4 >> 24) & 112) | 8);
                                                        dVar.mo5406H();
                                                        dVar.mo5406H();
                                                        dVar.mo5406H();
                                                        dVar.mo5456p();
                                                        dVar.mo5406H();
                                                        dVar.mo5406H();
                                                    } else {
                                                        C0005b.m45j0();
                                                        throw null;
                                                    }
                                                }
                                                dVar.mo5406H();
                                                dVar.mo5406H();
                                                dVar.mo5406H();
                                                dVar.mo5406H();
                                                dVar.mo5456p();
                                                dVar.mo5406H();
                                                dVar.mo5406H();
                                                i6 = 6;
                                                C15588c1.m25324f(SizeKt.m1495o(aVar, C1256u.f2624c), dVar3, 6);
                                            } else {
                                                C0005b.m45j0();
                                                throw null;
                                            }
                                        } else {
                                            a0Var = a0Var2;
                                        }
                                        dVar.mo5406H();
                                        qVar2.invoke(a0Var, dVar3, Integer.valueOf((i5 & 112) | i6));
                                        if (pVar11 != null) {
                                            float f = C1256u.f2625d;
                                            C15588c1.m25324f(SizeKt.m1495o(aVar, f), dVar3, i6);
                                            pVar11.invoke(dVar3, Integer.valueOf(i5 & 14));
                                            C15588c1.m25324f(SizeKt.m1495o(aVar, f), dVar3, i6);
                                        }
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
                                dVar.mo5396C();
                            }
                        }), dVar, 48);
                        return;
                    }
                    dVar.mo5396C();
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
