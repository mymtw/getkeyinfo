package androidx.compose.animation;

import androidx.compose.animation.core.C0437l0;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19862q;

final class EnterExitTransitionKt$slideInOut$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ String $labelPrefix;
    public final /* synthetic */ C1342k1<C0486u> $slideIn;
    public final /* synthetic */ C1342k1<C0486u> $slideOut;
    public final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInOut$1(Transition<EnterExitState> transition, C1342k1<C0486u> k1Var, C1342k1<C0486u> k1Var2, String str) {
        super(3);
        this.$transition = transition;
        this.$slideIn = k1Var;
        this.$slideOut = k1Var2;
        this.$labelPrefix = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(158379472);
        Transition<EnterExitState> transition = this.$transition;
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(transition);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1338j0 j0Var = (C1338j0) v;
        if (this.$transition.mo3410b() == this.$transition.mo3412d() && !this.$transition.mo3413e()) {
            j0Var.setValue(Boolean.FALSE);
        } else if (!(this.$slideIn.getValue() == null && this.$slideOut.getValue() == null)) {
            j0Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) j0Var.getValue()).booleanValue()) {
            Transition<EnterExitState> transition2 = this.$transition;
            int i2 = C7287g.f16165c;
            C0437l0 l0Var = VectorConvertersKt.f1082g;
            String str = this.$labelPrefix;
            dVar2.mo5465u(-492369756);
            Object v2 = dVar2.mo5467v();
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            if (v2 == aVar) {
                v2 = str + " slide";
                dVar2.mo5454o(v2);
            }
            dVar2.mo5406H();
            Transition.C0400a b = TransitionKt.m1100b(transition2, l0Var, (String) v2, dVar2, 0);
            Transition<EnterExitState> transition3 = this.$transition;
            C1342k1<C0486u> k1Var = this.$slideIn;
            C1342k1<C0486u> k1Var2 = this.$slideOut;
            dVar2.mo5465u(1157296644);
            boolean I2 = dVar2.mo5408I(transition3);
            Object v3 = dVar2.mo5467v();
            if (I2 || v3 == aVar) {
                v3 = new SlideModifier(b, k1Var, k1Var2);
                dVar2.mo5454o(v3);
            }
            dVar2.mo5406H();
            dVar = dVar.mo6148i0((SlideModifier) v3);
        }
        dVar2.mo5406H();
        return dVar;
    }
}
