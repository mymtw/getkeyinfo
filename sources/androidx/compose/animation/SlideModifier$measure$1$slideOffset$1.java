package androidx.compose.animation;

import androidx.compose.animation.SlideModifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class SlideModifier$measure$1$slideOffset$1 extends Lambda implements C19857l<EnterExitState, C7287g> {
    public final /* synthetic */ long $measuredSize;
    public final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1$slideOffset$1(SlideModifier slideModifier, long j) {
        super(1);
        this.this$0 = slideModifier;
        this.$measuredSize = j;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7287g(m34632invokeBjo55l4((EnterExitState) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34632invokeBjo55l4(EnterExitState enterExitState) {
        C19383o.m32797g(enterExitState, "it");
        SlideModifier slideModifier = this.this$0;
        slideModifier.getClass();
        C0486u value = slideModifier.f999c.getValue();
        long j = C7287g.f16164b;
        C0486u value2 = slideModifier.f1000d.getValue();
        int i = SlideModifier.C0387a.f1002a[enterExitState.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return j;
        }
        throw new NoWhenBranchMatchedException();
    }
}
