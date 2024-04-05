package androidx.compose.material;

import android.support.p013v4.media.session.C0087d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0733f;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
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
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p003a2.C0023f;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class BadgeKt$BadgedBox$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0733f, C1302d, Integer, C19394m> $badge;
    public final /* synthetic */ C19862q<C0733f, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$3(C19862q<? super C0733f, ? super C1302d, ? super Integer, C19394m> qVar, C1436d dVar, C19862q<? super C0733f, ? super C1302d, ? super Integer, C19394m> qVar2, int i, int i2) {
        super(2);
        this.$badge = qVar;
        this.$modifier = dVar;
        this.$content = qVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        int i3;
        int i4;
        C1436d dVar2;
        boolean z;
        C19862q<C0733f, C1302d, Integer, C19394m> qVar = this.$badge;
        C1436d dVar3 = this.$modifier;
        C19862q<C0733f, C1302d, Integer, C19394m> qVar2 = this.$content;
        int i5 = this.$$changed | 1;
        int i6 = this.$$default;
        float f = C1179e.f2415a;
        C19383o.m32797g(qVar, "badge");
        C19383o.m32797g(qVar2, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(859805272);
        if ((i6 & 1) != 0) {
            i2 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i2 = (h.mo5408I(qVar) ? 4 : 2) | i5;
        } else {
            i2 = i5;
        }
        int i7 = i6 & 2;
        if (i7 != 0) {
            i2 |= 48;
        } else if ((i5 & 112) == 0) {
            i2 |= h.mo5408I(dVar3) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i2 |= 384;
        } else if ((i5 & 896) == 0) {
            i2 |= h.mo5408I(qVar2) ? 256 : 128;
        }
        int i8 = i2;
        if ((i8 & 731) != 146 || !h.mo5442i()) {
            if (i7 != 0) {
                dVar3 = C1436d.C1437a.f3125b;
            }
            BadgeKt$BadgedBox$2 badgeKt$BadgedBox$2 = BadgeKt$BadgedBox$2.f2175a;
            h.mo5465u(-1323940314);
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var);
            C1345l1 l1Var2 = CompositionLocalsKt.f4025k;
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(l1Var2);
            C1345l1 l1Var3 = CompositionLocalsKt.f4029o;
            C1843j1 j1Var = (C1843j1) h.mo5410J(l1Var3);
            ComposeUiNode.f3776c0.getClass();
            i3 = i6;
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            i4 = i5;
            ComposableLambdaImpl a = C1700o.m3617a(dVar3);
            int i9 = (((i8 & 112) << 9) & 7168) | 6;
            C1436d dVar4 = dVar3;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                C19861p<ComposeUiNode, C1711v, C19394m> pVar = ComposeUiNode.Companion.f3781e;
                Updater.m2571b(h, badgeKt$BadgedBox$2, pVar);
                C19861p<ComposeUiNode, C7282b, C19394m> pVar2 = ComposeUiNode.Companion.f3780d;
                Updater.m2571b(h, bVar, pVar2);
                C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar3 = ComposeUiNode.Companion.f3782f;
                Updater.m2571b(h, layoutDirection, pVar3);
                C19861p<ComposeUiNode, C1843j1, C19394m> pVar4 = ComposeUiNode.Companion.f3783g;
                C19861p<ComposeUiNode, C7282b, C19394m> pVar5 = pVar2;
                a.invoke(C13983i.m21490i(h, j1Var, pVar4, h), h, Integer.valueOf((i9 >> 3) & 112));
                h.mo5465u(2058660585);
                h.mo5465u(1799938959);
                if (((i9 >> 9) & 14 & 11) != 2 || !h.mo5442i()) {
                    C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
                    C1436d S = C1993m.m4358S(aVar2, "anchor");
                    C1432b bVar2 = C1428a.C1429a.f3108d;
                    int i10 = ((i8 << 3) & 7168) | 54;
                    h.mo5465u(733328855);
                    C1711v c = BoxKt.m1457c(bVar2, false, h);
                    C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar6 = pVar3;
                    h.mo5465u(-1323940314);
                    C7282b bVar3 = (C7282b) h.mo5410J(l1Var);
                    LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(l1Var2);
                    C1843j1 j1Var2 = (C1843j1) h.mo5410J(l1Var3);
                    ComposableLambdaImpl a2 = C1700o.m3617a(S);
                    int i11 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
                    if (h.f2715a instanceof C1299c) {
                        h.mo5392A();
                        if (h.f2702K) {
                            h.mo5450m(aVar);
                        } else {
                            h.mo5452n();
                        }
                        h.f2738x = false;
                        C19861p<ComposeUiNode, C7282b, C19394m> pVar7 = pVar5;
                        C19861p<ComposeUiNode, LayoutDirection, C19394m> pVar8 = pVar6;
                        C19861p<ComposeUiNode, C1843j1, C19394m> pVar9 = pVar4;
                        C19862q<C0733f, C1302d, Integer, C19394m> qVar3 = qVar;
                        C1345l1 l1Var4 = l1Var3;
                        C19861p<ComposeUiNode, C1711v, C19394m> pVar10 = pVar;
                        C1345l1 l1Var5 = l1Var2;
                        C19846a<ComposeUiNode> aVar3 = aVar;
                        C1345l1 l1Var6 = l1Var;
                        int i12 = i8;
                        a2.invoke(C0023f.m106g(h, c, pVar, h, bVar3, pVar7, h, layoutDirection2, pVar6, h, j1Var2, pVar9, h), h, Integer.valueOf((i11 >> 3) & 112));
                        h.mo5465u(2058660585);
                        h.mo5465u(-2137368960);
                        if (((i11 >> 9) & 14 & 11) != 2 || !h.mo5442i()) {
                            qVar2.invoke(C19543e0.f43489b, h, Integer.valueOf(((i10 >> 6) & 112) | 6));
                        } else {
                            h.mo5396C();
                        }
                        C0087d.m238h(h, false, false, true, false);
                        h.mo5418R(false);
                        C1436d S2 = C1993m.m4358S(aVar2, "badge");
                        int i13 = ((i12 << 9) & 7168) | 6;
                        h.mo5465u(733328855);
                        C1711v c2 = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
                        h.mo5465u(-1323940314);
                        C7282b bVar4 = (C7282b) h.mo5410J(l1Var6);
                        LayoutDirection layoutDirection3 = (LayoutDirection) h.mo5410J(l1Var5);
                        C1843j1 j1Var3 = (C1843j1) h.mo5410J(l1Var4);
                        ComposableLambdaImpl a3 = C1700o.m3617a(S2);
                        int i14 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
                        if (h.f2715a instanceof C1299c) {
                            h.mo5392A();
                            if (h.f2702K) {
                                h.mo5450m(aVar3);
                            } else {
                                h.mo5452n();
                            }
                            h.f2738x = false;
                            a3.invoke(C0023f.m106g(h, c2, pVar10, h, bVar4, pVar7, h, layoutDirection3, pVar8, h, j1Var3, pVar9, h), h, Integer.valueOf((i14 >> 3) & 112));
                            h.mo5465u(2058660585);
                            h.mo5465u(-2137368960);
                            if (((i14 >> 9) & 14 & 11) != 2 || !h.mo5442i()) {
                                qVar = qVar3;
                                qVar.invoke(C19543e0.f43489b, h, Integer.valueOf(((i13 >> 6) & 112) | 6));
                            } else {
                                h.mo5396C();
                                qVar = qVar3;
                            }
                            z = false;
                            C0087d.m238h(h, false, false, true, false);
                            h.mo5418R(false);
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
                    z = false;
                }
                C0087d.m238h(h, z, z, true, z);
                dVar2 = dVar4;
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            dVar2 = dVar3;
            i4 = i5;
            i3 = i6;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BadgeKt$BadgedBox$3(qVar, dVar2, qVar2, i4, i3);
        }
    }
}
