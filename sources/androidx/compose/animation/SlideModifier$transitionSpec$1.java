package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class SlideModifier$transitionSpec$1 extends Lambda implements C19857l<Transition.C0402b<EnterExitState>, C0454t<C7287g>> {
    public final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlideModifier$transitionSpec$1(SlideModifier slideModifier) {
        super(1);
        this.this$0 = slideModifier;
    }

    public final C0454t<C7287g> invoke(Transition.C0402b<EnterExitState> bVar) {
        C19383o.m32797g(bVar, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (bVar.mo3420c(enterExitState, enterExitState2)) {
            C0486u value = this.this$0.f999c.getValue();
            return EnterExitTransitionKt.f981d;
        } else if (!bVar.mo3420c(enterExitState2, EnterExitState.PostExit)) {
            return EnterExitTransitionKt.f981d;
        } else {
            C0486u value2 = this.this$0.f1000d.getValue();
            return EnterExitTransitionKt.f981d;
        }
    }
}
