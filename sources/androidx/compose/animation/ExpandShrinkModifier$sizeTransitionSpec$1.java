package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

final class ExpandShrinkModifier$sizeTransitionSpec$1 extends Lambda implements C19857l<Transition.C0402b<EnterExitState>, C0454t<C7290i>> {
    public final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.this$0 = expandShrinkModifier;
    }

    public final C0454t<C7290i> invoke(Transition.C0402b<EnterExitState> bVar) {
        C19383o.m32797g(bVar, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        C0454t<C7290i> tVar = null;
        if (bVar.mo3420c(enterExitState, enterExitState2)) {
            C0470f value = this.this$0.f986d.getValue();
            if (value != null) {
                tVar = value.f1209c;
            }
        } else if (bVar.mo3420c(enterExitState2, EnterExitState.PostExit)) {
            C0470f value2 = this.this$0.f987e.getValue();
            if (value2 != null) {
                tVar = value2.f1209c;
            }
        } else {
            tVar = EnterExitTransitionKt.f982e;
        }
        return tVar == null ? EnterExitTransitionKt.f982e : tVar;
    }
}
