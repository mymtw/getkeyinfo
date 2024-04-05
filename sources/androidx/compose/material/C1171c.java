package androidx.compose.material;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0472h;
import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.SubcomposeLayoutKt;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19388s;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

/* renamed from: androidx.compose.material.c */
public final class C1171c {

    /* renamed from: a */
    public static final float f2385a = ((float) 20);

    /* renamed from: a */
    public static final void m2300a(BackdropValue backdropValue, C19861p pVar, C19861p pVar2, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        BackdropValue backdropValue2 = backdropValue;
        C19861p pVar3 = pVar;
        C19861p pVar4 = pVar2;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(-950970976);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(backdropValue2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(pVar4) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 731) != 146 || !h.mo5442i()) {
            C0424f b = C0411a.m1106b(backdropValue2 == BackdropValue.Revealed ? 0.0f : 2.0f, new C0433j0(0, (C0448r) null, 7), h, 0, 12);
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            float B0 = ((C7282b) h.mo5410J(l1Var)).mo3789B0(f2385a);
            float f = (float) 1;
            float L = C19388s.m32831L(((Number) b.getValue()).floatValue() - f, 0.0f, 1.0f);
            float L2 = C19388s.m32831L(f - ((Number) b.getValue()).floatValue(), 0.0f, 1.0f);
            h.mo5465u(733328855);
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1432b bVar = C1428a.C1429a.f3105a;
            C1711v c = BoxKt.m1457c(bVar, false, h);
            h.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) h.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            float f2 = L2;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var2);
            float f3 = f;
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1345l1 l1Var4 = l1Var2;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            C1345l1 l1Var5 = l1Var3;
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(aVar);
            C1432b bVar3 = bVar;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar2);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar5 = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, c, pVar5);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar6 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar2, pVar6);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar7 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar7);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar8 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C7282b, C19394m> pVar9 = pVar6;
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar10 = pVar7;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar11 = pVar5;
                C19846a<ComposeUiNode> aVar3 = aVar2;
                float f4 = f3;
                C1345l1 l1Var6 = l1Var5;
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, pVar8, h), h, 2058660585, -2137368960);
                h.mo5465u(2065804710);
                float f5 = L;
                C1436d k0 = C19388s.m32869k0(C15588c1.m25307T0(aVar, f5), 0.0f, 0.0f, f5, (f4 - f5) * B0, 0.0f, (C1530k0) null, false, 65515);
                h.mo5465u(733328855);
                C1432b bVar4 = bVar3;
                C1711v c2 = BoxKt.m1457c(bVar4, false, h);
                h.mo5465u(-1323940314);
                C7282b bVar5 = (C7282b) h.mo5410J(l1Var);
                C1345l1 l1Var7 = l1Var4;
                LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var7);
                C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var6);
                ComposableLambdaImpl a2 = C1700o.m3617a(k0);
                if (h.f2715a instanceof C1299c) {
                    h.mo5392A();
                    if (h.f2702K) {
                        h.mo5450m(aVar3);
                    } else {
                        h.mo5452n();
                    }
                    h.f2738x = false;
                    C1345l1 l1Var8 = l1Var7;
                    ComposerImpl composerImpl2 = h;
                    C1432b bVar6 = bVar4;
                    C0326j.m868m(0, a2, C0023f.m106g(h, c2, pVar11, composerImpl2, bVar5, pVar9, h, layoutDirection2, pVar10, h, j1Var2, pVar8, h), composerImpl2, 2058660585, -2137368960);
                    h.mo5465u(-1057690836);
                    float f6 = f2;
                    C19861p<ComposeUiNode, C1843j1, C19394m> pVar12 = pVar8;
                    int i5 = i4;
                    ComposerImpl composerImpl3 = h;
                    C0472h.m1247j((i4 >> 3) & 14, pVar, h, false, false, false);
                    C0071c.m194f(composerImpl3, true, false, false);
                    C1436d k02 = C19388s.m32869k0(C15588c1.m25307T0(aVar, f6), 0.0f, 0.0f, f6, (f4 - f6) * (-B0), 0.0f, (C1530k0) null, false, 65515);
                    composerImpl3.mo5465u(733328855);
                    C1711v c3 = BoxKt.m1457c(bVar6, false, composerImpl3);
                    composerImpl3.mo5465u(-1323940314);
                    C7282b bVar7 = (C7282b) composerImpl3.mo5410J(l1Var);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerImpl3.mo5410J(l1Var8);
                    C1843j1 j1Var3 = (C1843j1) composerImpl3.mo5410J(l1Var6);
                    ComposableLambdaImpl a3 = C1700o.m3617a(k02);
                    if (composerImpl3.f2715a instanceof C1299c) {
                        composerImpl3.mo5392A();
                        if (composerImpl3.f2702K) {
                            composerImpl3.mo5450m(aVar3);
                        } else {
                            composerImpl3.mo5452n();
                        }
                        composerImpl3.f2738x = false;
                        composerImpl = composerImpl3;
                        C0326j.m868m(0, a3, C0023f.m106g(composerImpl3, c3, pVar11, composerImpl3, bVar7, pVar9, composerImpl, layoutDirection3, pVar10, composerImpl, j1Var3, pVar12, composerImpl), composerImpl, 2058660585, -2137368960);
                        composerImpl.mo5465u(-676544093);
                        C0472h.m1247j((i5 >> 6) & 14, pVar2, composerImpl, false, false, false);
                        C0087d.m238h(composerImpl, true, false, false, false);
                        C0087d.m238h(composerImpl, false, false, true, false);
                        composerImpl.mo5418R(false);
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
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
            U.f3081d = new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, pVar, pVar4, i3);
        }
    }

    /* renamed from: b */
    public static final void m2301b(C1436d dVar, C19861p pVar, C19857l lVar, C19863r rVar, C1302d dVar2, int i) {
        int i2;
        ComposerImpl h = dVar2.mo5440h(-1248995194);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(lVar) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.mo5408I(rVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            h.mo5465u(1618982084);
            boolean I = h.mo5408I(pVar) | h.mo5408I(lVar) | h.mo5408I(rVar);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new BackdropScaffoldKt$BackdropStack$1$1(pVar, lVar, rVar, i2);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            SubcomposeLayoutKt.m3531a(dVar, (C19861p) c0, h, i2 & 14, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BackdropScaffoldKt$BackdropStack$2(dVar, pVar, lVar, rVar, i);
        }
    }

    /* renamed from: c */
    public static final void m2302c(long j, C19846a aVar, boolean z, C1302d dVar, int i) {
        int i2;
        C1436d dVar2;
        ComposerImpl h = dVar.mo5440h(-92141505);
        if ((i & 14) == 0) {
            i2 = (h.mo5434e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(aVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5427a(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            boolean z2 = true;
            if (j == C1545s.f3364i) {
                z2 = false;
            }
            if (z2) {
                float f = 0.0f;
                if (z) {
                    f = 1.0f;
                }
                C0424f b = C0411a.m1106b(f, new C0433j0(0, (C0448r) null, 7), h, 0, 12);
                h.mo5465u(1010547004);
                if (z) {
                    C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
                    C19394m mVar = C19394m.f43287a;
                    h.mo5465u(1157296644);
                    boolean I = h.mo5408I(aVar);
                    Object c0 = h.mo5431c0();
                    if (I || c0 == C1302d.C1303a.f2828a) {
                        c0 = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(aVar, (C19340c<? super BackdropScaffoldKt$Scrim$dismissModifier$1$1>) null);
                        h.mo5407H0(c0);
                    }
                    h.mo5418R(false);
                    dVar2 = SuspendingPointerInputFilterKt.m3484b(aVar2, mVar, (C19861p) c0);
                } else {
                    dVar2 = C1436d.C1437a.f3125b;
                }
                h.mo5418R(false);
                C1436d i0 = SizeKt.m1486f(C1436d.C1437a.f3125b).mo6148i0(dVar2);
                C1545s sVar = new C1545s(j);
                h.mo5465u(511388516);
                boolean I2 = h.mo5408I(sVar) | h.mo5408I(b);
                Object c02 = h.mo5431c0();
                if (I2 || c02 == C1302d.C1303a.f2828a) {
                    c02 = new BackdropScaffoldKt$Scrim$1$1(j, b);
                    h.mo5407H0(c02);
                }
                h.mo5418R(false);
                CanvasKt.m1294a(i0, (C19857l) c02, h, 0);
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BackdropScaffoldKt$Scrim$2(j, aVar, z, i);
        }
    }
}
