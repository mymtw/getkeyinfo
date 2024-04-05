package androidx.compose.material;

import android.view.View;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.focus.C1478l;
import androidx.compose.p015ui.focus.FocusRequesterModifierKt;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C1218o0, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onExpandedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$6(boolean z, C19857l<? super Boolean, C19394m> lVar, C1436d dVar, C19862q<? super C1218o0, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$expanded = z;
        this.$onExpandedChange = lVar;
        this.$modifier = dVar;
        this.$content = qVar;
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
        C19857l<Boolean, C19394m> lVar;
        C1436d dVar2;
        boolean z = this.$expanded;
        C19857l<Boolean, C19394m> lVar2 = this.$onExpandedChange;
        C1436d dVar3 = this.$modifier;
        C19862q<C1218o0, C1302d, Integer, C19394m> qVar = this.$content;
        int i5 = this.$$changed | 1;
        int i6 = this.$$default;
        C19383o.m32797g(lVar2, "onExpandedChange");
        C19383o.m32797g(qVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(1456052980);
        if ((i6 & 1) != 0) {
            i2 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i2 = (h.mo5427a(z) ? 4 : 2) | i5;
        } else {
            i2 = i5;
        }
        if ((i6 & 2) != 0) {
            i2 |= 48;
        } else if ((i5 & 112) == 0) {
            i2 |= h.mo5408I(lVar2) ? 32 : 16;
        }
        int i7 = i6 & 4;
        if (i7 != 0) {
            i2 |= 384;
        } else if ((i5 & 896) == 0) {
            i2 |= h.mo5408I(dVar3) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i2 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i2 |= h.mo5408I(qVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !h.mo5442i()) {
            if (i7 != 0) {
                dVar3 = C1436d.C1437a.f3125b;
            }
            C1345l1 l1Var = CompositionLocalsKt.f4019e;
            C7282b bVar = (C7282b) h.mo5410J(l1Var);
            View view = (View) h.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            if (c0 == aVar) {
                c0 = C0761x.m1751w0(0, C1351n1.f2948a);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1338j0 j0Var = (C1338j0) c0;
            h.mo5465u(-492369756);
            Object c02 = h.mo5431c0();
            if (c02 == aVar) {
                c02 = C0761x.m1751w0(0, C1351n1.f2948a);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            C1338j0 j0Var2 = (C1338j0) c02;
            int V = bVar.mo3791V(MenuKt.f2220b);
            h.mo5465u(-492369756);
            Object c03 = h.mo5431c0();
            if (c03 == aVar) {
                c03 = new C1754s();
                h.mo5407H0(c03);
            }
            int i9 = V;
            h.mo5418R(false);
            C1754s sVar = (C1754s) c03;
            Integer valueOf = Integer.valueOf(((Number) j0Var2.getValue()).intValue());
            i3 = i6;
            Integer valueOf2 = Integer.valueOf(((Number) j0Var.getValue()).intValue());
            i4 = i5;
            h.mo5465u(1618982084);
            boolean I = h.mo5408I(bVar) | h.mo5408I(valueOf) | h.mo5408I(valueOf2);
            Object c04 = h.mo5431c0();
            if (I || c04 == aVar) {
                c04 = new C1224q0(bVar, j0Var2, j0Var);
                h.mo5407H0(c04);
            }
            h.mo5418R(false);
            C1224q0 q0Var = (C1224q0) c04;
            h.mo5465u(-492369756);
            Object c05 = h.mo5431c0();
            if (c05 == aVar) {
                c05 = new C1478l();
                h.mo5407H0(c05);
            }
            h.mo5418R(false);
            C1478l lVar3 = (C1478l) c05;
            int i10 = i9;
            C1436d A0 = C15588c1.m25270A0(dVar3, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(sVar, view, i10, j0Var, j0Var2));
            Boolean valueOf3 = Boolean.valueOf(z);
            h.mo5465u(511388516);
            boolean I2 = h.mo5408I(valueOf3) | h.mo5408I(lVar2);
            Object c06 = h.mo5431c0();
            if (I2 || c06 == aVar) {
                c06 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(lVar2, z);
                h.mo5407H0(c06);
            }
            h.mo5418R(false);
            C19846a aVar2 = (C19846a) c06;
            dVar2 = dVar3;
            C1338j0 j0Var3 = j0Var2;
            C1436d a = FocusRequesterModifierKt.m3105a(SemanticsModifierKt.m4174a(SuspendingPointerInputFilterKt.m3484b(A0, C19394m.f43287a, new ExposedDropdownMenuKt$expandable$1(aVar2, (C19340c<? super ExposedDropdownMenuKt$expandable$1>) null)), false, new ExposedDropdownMenuKt$expandable$2(C1993m.m4350K(4, h), aVar2)), lVar3);
            h.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
            h.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) h.mo5410J(l1Var);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(a);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar3);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                lVar = lVar2;
                View view2 = view;
                C0326j.m868m(0, a2, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -2137368960);
                h.mo5465u(-443225682);
                qVar.invoke(q0Var, h, Integer.valueOf((i8 >> 6) & 112));
                h.mo5418R(false);
                h.mo5418R(false);
                h.mo5418R(false);
                h.mo5418R(true);
                h.mo5418R(false);
                h.mo5418R(false);
                C1415u.m3033g(new ExposedDropdownMenuKt$ExposedDropdownMenuBox$4(z, lVar3), h);
                C1415u.m3028b(view2, new ExposedDropdownMenuKt$ExposedDropdownMenuBox$5(view2, sVar, i10, j0Var3), h);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
            dVar2 = dVar3;
            lVar = lVar2;
            i4 = i5;
            i3 = i6;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$6(z, lVar, dVar2, qVar, i4, i3);
        }
    }
}
