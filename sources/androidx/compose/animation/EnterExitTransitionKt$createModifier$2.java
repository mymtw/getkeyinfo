package androidx.compose.animation;

import androidx.compose.animation.core.C0437l0;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class EnterExitTransitionKt$createModifier$2 extends Lambda implements C19857l<C1549v, C19394m> {
    public final /* synthetic */ C1342k1<Float> $alpha$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2(C1342k1<Float> k1Var) {
        super(1);
        this.$alpha$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1549v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1549v vVar) {
        C19383o.m32797g(vVar, "$this$graphicsLayer");
        C1342k1<Float> k1Var = this.$alpha$delegate;
        C0437l0 l0Var = EnterExitTransitionKt.f978a;
        vVar.setAlpha(k1Var.getValue().floatValue());
    }
}
