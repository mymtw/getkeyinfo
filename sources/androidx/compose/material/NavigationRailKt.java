package androidx.compose.material;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.logging.type.LogSeverity;
import kotlin.C19394m;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

public final class NavigationRailKt {

    /* renamed from: a */
    public static final C0433j0<Float> f2227a = new C0433j0<>((int) LogSeverity.NOTICE_VALUE, (C0448r) C0450s.f1167a, 2);

    /* renamed from: b */
    public static final float f2228b = ((float) 72);

    /* renamed from: c */
    public static final float f2229c = ((float) 56);

    /* renamed from: d */
    public static final float f2230d;

    /* renamed from: e */
    public static final float f2231e;

    /* renamed from: f */
    public static final float f2232f = ((float) 16);

    /* renamed from: g */
    public static final float f2233g = ((float) 14);

    static {
        float f = (float) 8;
        f2230d = f;
        f2231e = f;
    }

    /* renamed from: a */
    public static final void m2195a(long j, long j2, boolean z, C19862q<? super Float, ? super C1302d, ? super Integer, C19394m> qVar, C1302d dVar, int i) {
        int i2;
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        C19862q<? super Float, ? super C1302d, ? super Integer, C19394m> qVar2 = qVar;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-207161906);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5434e(j3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5434e(j4) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5427a(z2) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(qVar2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            C0424f b = C0411a.m1106b(z2 ? 1.0f : 0.0f, f2227a, h, 48, 12);
            long e0 = C18263b.m30841e0(j4, ((Number) b.getValue()).floatValue(), j3);
            CompositionLocalKt.m2530a(new C1412t0[]{ContentColorKt.f2199a.mo5908b(new C1545s(C1545s.m3356b(e0, 1.0f))), ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C1545s.m3358d(e0)))}, C18263b.m30805A(h, -1688205042, new NavigationRailKt$NavigationRailTransition$1(qVar2, i2, b)), h, 56);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new NavigationRailKt$NavigationRailTransition$2(j, j2, z, qVar, i);
        }
    }

    /* renamed from: b */
    public static final void m2196b(C19861p pVar, C19861p pVar2, float f, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        C19846a<ComposeUiNode> aVar;
        C19861p pVar3 = pVar;
        C19861p pVar4 = pVar2;
        float f2 = f;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-1903861684);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(pVar3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar4) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5428b(f2) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 731) != 146 || !h.mo5442i()) {
            C1184f1 f1Var = new C1184f1(pVar4, f2);
            h.mo5465u(-1323940314);
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(aVar2);
            C1345l1 l1Var4 = l1Var3;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar3);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, f1Var, pVar5);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar6);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar7);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar9 = pVar8;
                C19846a<ComposeUiNode> aVar4 = aVar3;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar10 = pVar5;
                C1345l1 l1Var5 = l1Var2;
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, pVar8, h), h, 2058660585, 1943278197);
                C1436d S = C1993m.m4358S(aVar2, ResponseConstants.ICON);
                h.mo5465u(733328855);
                C1432b bVar2 = C1428a.C1429a.f3105a;
                C1711v c = BoxKt.m1457c(bVar2, false, h);
                h.mo5465u(-1323940314);
                C7282b bVar3 = (C7282b) h.mo5410J(l1Var);
                LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var5);
                C1345l1 l1Var6 = l1Var4;
                C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var6);
                ComposableLambdaImpl a2 = C1700o.m3617a(S);
                if (h.f2715a instanceof C1299c) {
                    h.mo5392A();
                    if (h.f2702K) {
                        aVar = aVar4;
                        h.mo5450m(aVar);
                    } else {
                        aVar = aVar4;
                        h.mo5452n();
                    }
                    h.f2738x = false;
                    C19846a<ComposeUiNode> aVar5 = aVar;
                    C1345l1 l1Var7 = l1Var6;
                    ComposerImpl composerImpl2 = h;
                    C1432b bVar4 = bVar2;
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar11 = pVar7;
                    C0326j.m868m(0, a2, C0023f.m106g(h, c, pVar10, composerImpl2, bVar3, pVar6, h, layoutDirection2, pVar11, h, j1Var2, pVar9, h), composerImpl2, 2058660585, -2137368960);
                    h.mo5465u(1405563567);
                    boolean z = false;
                    C19861p<ComposeUiNode, C7282b, C19394m> pVar12 = pVar6;
                    C1345l1 l1Var8 = l1Var;
                    C1436d.C1437a aVar6 = aVar2;
                    int i5 = i4;
                    ComposerImpl composerImpl3 = h;
                    C0472h.m1247j(i4 & 14, pVar, h, false, false, false);
                    C0071c.m194f(composerImpl3, true, false, false);
                    if (pVar4 != null) {
                        C1436d I = C0005b.m15I(C1993m.m4358S(aVar6, ResponseConstants.LABEL), f2);
                        composerImpl3.mo5465u(733328855);
                        C1711v c2 = BoxKt.m1457c(bVar4, false, composerImpl3);
                        composerImpl3.mo5465u(-1323940314);
                        C7282b bVar5 = (C7282b) composerImpl3.mo5410J(l1Var8);
                        LayoutDirection layoutDirection3 = (LayoutDirection) composerImpl3.mo5410J(l1Var5);
                        C1843j1 j1Var3 = (C1843j1) composerImpl3.mo5410J(l1Var7);
                        ComposableLambdaImpl a3 = C1700o.m3617a(I);
                        if (composerImpl3.f2715a instanceof C1299c) {
                            composerImpl3.mo5392A();
                            if (composerImpl3.f2702K) {
                                composerImpl3.mo5450m(aVar5);
                            } else {
                                composerImpl3.mo5452n();
                            }
                            composerImpl3.f2738x = false;
                            composerImpl = composerImpl3;
                            C0326j.m868m(0, a3, C0023f.m106g(composerImpl3, c2, pVar10, composerImpl3, bVar5, pVar12, composerImpl, layoutDirection3, pVar11, composerImpl, j1Var3, pVar9, composerImpl), composerImpl, 2058660585, -2137368960);
                            composerImpl.mo5465u(2107148020);
                            z = false;
                            C0472h.m1247j((i5 >> 3) & 14, pVar2, composerImpl, false, false, false);
                            C0071c.m194f(composerImpl, true, false, false);
                        } else {
                            C0005b.m45j0();
                            throw null;
                        }
                    } else {
                        composerImpl = composerImpl3;
                    }
                    C0087d.m238h(composerImpl, z, z, true, z);
                } else {
                    C0005b.m45j0();
                    throw null;
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
            U.f3081d = new NavigationRailKt$NavigationRailItemBaselineLayout$3(pVar, pVar4, f2, i3);
        }
    }
}
