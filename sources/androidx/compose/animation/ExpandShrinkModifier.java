package androidx.compose.animation;

import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;

public final class ExpandShrinkModifier extends C0481p {

    /* renamed from: b */
    public final Transition<EnterExitState>.a<C7290i, C0428h> f984b;

    /* renamed from: c */
    public final Transition<EnterExitState>.a<C7287g, C0428h> f985c;

    /* renamed from: d */
    public final C1342k1<C0470f> f986d;

    /* renamed from: e */
    public final C1342k1<C0470f> f987e;

    /* renamed from: f */
    public final C1342k1<C1428a> f988f;

    /* renamed from: g */
    public C1428a f989g;

    /* renamed from: h */
    public final C19857l<Transition.C0402b<EnterExitState>, C0454t<C7290i>> f990h = new ExpandShrinkModifier$sizeTransitionSpec$1(this);

    /* renamed from: androidx.compose.animation.ExpandShrinkModifier$a */
    public /* synthetic */ class C0385a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f991a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f991a = iArr;
        }
    }

    public ExpandShrinkModifier(Transition.C0400a aVar, Transition.C0400a aVar2, C1342k1 k1Var, C1342k1 k1Var2, C1338j0 j0Var) {
        C19383o.m32797g(aVar, "sizeAnimation");
        C19383o.m32797g(aVar2, "offsetAnimation");
        C19383o.m32797g(k1Var, "expand");
        C19383o.m32797g(k1Var2, "shrink");
        this.f984b = aVar;
        this.f985c = aVar2;
        this.f986d = k1Var;
        this.f987e = k1Var2;
        this.f988f = j0Var;
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        long j2;
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        long a = C0761x.m1707a(J.f3722b, J.f3723c);
        long j3 = ((C7290i) this.f984b.mo3418a(this.f990h, new ExpandShrinkModifier$measure$currentSize$1(this, a)).getValue()).f16171a;
        long j4 = ((C7287g) this.f985c.mo3418a(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, a)).getValue()).f16166a;
        C1428a aVar = this.f989g;
        if (aVar != null) {
            j2 = aVar.mo6133a(a, j3, LayoutDirection.Ltr);
        } else {
            j2 = C7287g.f16164b;
        }
        return xVar.mo4387Z((int) (j3 >> 32), C7290i.m13995b(j3), C19294b0.m32559p0(), new ExpandShrinkModifier$measure$1(J, j2, j4));
    }
}
