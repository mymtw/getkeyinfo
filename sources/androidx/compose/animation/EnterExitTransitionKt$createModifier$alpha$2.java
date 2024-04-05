package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class EnterExitTransitionKt$createModifier$alpha$2 extends Lambda implements C19862q<Transition.C0402b<EnterExitState>, C1302d, Integer, C0454t<Float>> {
    public final /* synthetic */ C0473i $enter;
    public final /* synthetic */ C0475k $exit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$alpha$2(C0473i iVar, C0475k kVar) {
        super(3);
        this.$enter = iVar;
        this.$exit = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<EnterExitState>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0454t<Float> invoke(Transition.C0402b<EnterExitState> bVar, C1302d dVar, int i) {
        C0454t<Float> tVar;
        C19383o.m32797g(bVar, "$this$animateFloat");
        dVar.mo5465u(-57153604);
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (bVar.mo3420c(enterExitState, enterExitState2)) {
            C0477m mVar = this.$enter.mo3546a().f1233a;
            if (mVar == null || (tVar = mVar.f1218b) == null) {
                tVar = EnterExitTransitionKt.f980c;
            }
        } else if (bVar.mo3420c(enterExitState2, EnterExitState.PostExit)) {
            C0477m mVar2 = this.$exit.mo3550a().f1233a;
            if (mVar2 == null || (tVar = mVar2.f1218b) == null) {
                tVar = EnterExitTransitionKt.f980c;
            }
        } else {
            tVar = EnterExitTransitionKt.f980c;
        }
        dVar.mo5406H();
        return tVar;
    }
}
