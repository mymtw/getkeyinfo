package androidx.compose.animation;

import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.runtime.C1342k1;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7287g;
import p753kq.C19857l;

public final class SlideModifier extends C0481p {

    /* renamed from: b */
    public final Transition<EnterExitState>.a<C7287g, C0428h> f998b;

    /* renamed from: c */
    public final C1342k1<C0486u> f999c;

    /* renamed from: d */
    public final C1342k1<C0486u> f1000d;

    /* renamed from: e */
    public final C19857l<Transition.C0402b<EnterExitState>, C0454t<C7287g>> f1001e = new SlideModifier$transitionSpec$1(this);

    /* renamed from: androidx.compose.animation.SlideModifier$a */
    public /* synthetic */ class C0387a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1002a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f1002a = iArr;
        }
    }

    public SlideModifier(Transition<EnterExitState>.a<C7287g, C0428h> aVar, C1342k1<C0486u> k1Var, C1342k1<C0486u> k1Var2) {
        C19383o.m32797g(aVar, "lazyAnimation");
        C19383o.m32797g(k1Var, "slideIn");
        C19383o.m32797g(k1Var2, "slideOut");
        this.f998b = aVar;
        this.f999c = k1Var;
        this.f1000d = k1Var2;
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new SlideModifier$measure$1(this, J, C0761x.m1707a(J.f3722b, J.f3723c)));
    }
}
