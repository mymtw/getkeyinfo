package androidx.compose.p015ui.node;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1679f;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7287g;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.k */
public final class C1745k extends LayoutNodeWrapper {

    /* renamed from: G */
    public static final C1516e f3932G;

    /* renamed from: C */
    public LayoutNodeWrapper f3933C;

    /* renamed from: D */
    public C1702p f3934D;

    /* renamed from: E */
    public boolean f3935E;

    /* renamed from: F */
    public C1338j0<C1702p> f3936F;

    static {
        C1516e eVar = new C1516e();
        eVar.mo6241e(C1545s.f3361f);
        eVar.mo6334t(1.0f);
        eVar.mo6335u(1);
        f3932G = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1745k(LayoutNodeWrapper layoutNodeWrapper, C1702p pVar) {
        super(layoutNodeWrapper.f3850f);
        C19383o.m32797g(layoutNodeWrapper, "wrapped");
        C19383o.m32797g(pVar, "modifier");
        this.f3933C = layoutNodeWrapper;
        this.f3934D = pVar;
    }

    /* renamed from: D */
    public final int mo6664D(int i) {
        return mo6929v1().mo3562f(mo6790a1(), this.f3933C, i);
    }

    /* renamed from: J */
    public final C1686i0 mo6665J(long j) {
        mo6679y0(j);
        mo6805p1(this.f3934D.mo3271v(mo6790a1(), this.f3933C, j));
        C1749o oVar = this.f3867w;
        if (oVar != null) {
            oVar.m34780resizeozmzZPI(this.f3724d);
        }
        mo6801l1();
        return this;
    }

    /* renamed from: R0 */
    public final int mo6781R0(C1665a aVar) {
        C19383o.m32797g(aVar, "alignmentLine");
        if (mo6789Z0().mo4345d().containsKey(aVar)) {
            Integer num = mo6789Z0().mo4345d().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int M = this.f3933C.mo6661M(aVar);
        if (M == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        this.f3862r = true;
        mo6662q0(this.f3860p, this.f3861q, this.f3853i);
        this.f3862r = false;
        return aVar instanceof C1679f ? C7287g.m13992b(this.f3933C.f3860p) + M : ((int) (this.f3933C.f3860p >> 32)) + M;
    }

    /* renamed from: a1 */
    public final C1713x mo6790a1() {
        return this.f3933C.mo6790a1();
    }

    /* renamed from: d1 */
    public final LayoutNodeWrapper mo6793d1() {
        return this.f3933C;
    }

    /* renamed from: i */
    public final int mo6667i(int i) {
        return mo6929v1().mo3565t(mo6790a1(), this.f3933C, i);
    }

    /* renamed from: m1 */
    public final void mo6802m1() {
        super.mo6802m1();
        C1338j0<C1702p> j0Var = this.f3936F;
        if (j0Var != null) {
            j0Var.setValue(this.f3934D);
        }
    }

    /* renamed from: n1 */
    public final void mo6803n1(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        this.f3933C.mo6785V0(oVar);
        if (C15588c1.m25291L0(this.f3850f).getShowLayoutBounds()) {
            mo6786W0(oVar, f3932G);
        }
    }

    /* renamed from: q0 */
    public final void mo6662q0(long j, float f, C19857l<? super C1549v, C19394m> lVar) {
        super.mo6662q0(j, f, lVar);
        LayoutNodeWrapper layoutNodeWrapper = this.f3851g;
        boolean z = true;
        if (layoutNodeWrapper == null || !layoutNodeWrapper.f3862r) {
            z = false;
        }
        if (!z) {
            for (T t = this.f3864t[4]; t != null; t = t.f3921d) {
                ((C1678e0) ((C1756u) t).f3920c).mo3725D(this);
            }
            C1686i0.C1687a.C1688a aVar = C1686i0.C1687a.f3726a;
            LayoutDirection layoutDirection = mo6790a1().getLayoutDirection();
            aVar.getClass();
            int i = C1686i0.C1687a.f3728c;
            LayoutDirection layoutDirection2 = C1686i0.C1687a.f3727b;
            C1686i0.C1687a.f3728c = (int) (this.f3724d >> 32);
            C1686i0.C1687a.f3727b = layoutDirection;
            mo6789Z0().mo4344c();
            C1686i0.C1687a.f3728c = i;
            C1686i0.C1687a.f3727b = layoutDirection2;
        }
    }

    /* renamed from: s */
    public final int mo6668s(int i) {
        return mo6929v1().mo3564s(mo6790a1(), this.f3933C, i);
    }

    /* renamed from: v1 */
    public final C1702p mo6929v1() {
        C1338j0<C1702p> j0Var = this.f3936F;
        if (j0Var == null) {
            j0Var = C0761x.m1751w0(this.f3934D, C1351n1.f2948a);
        }
        this.f3936F = j0Var;
        return j0Var.getValue();
    }

    /* renamed from: w1 */
    public final void mo6930w1() {
        C1749o oVar = this.f3867w;
        if (oVar != null) {
            oVar.invalidate();
        }
        this.f3933C.f3851g = this;
    }

    /* renamed from: z */
    public final int mo6669z(int i) {
        return mo6929v1().mo3563r(mo6790a1(), this.f3933C, i);
    }
}
