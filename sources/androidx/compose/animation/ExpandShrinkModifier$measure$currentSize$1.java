package androidx.compose.animation;

import androidx.compose.animation.ExpandShrinkModifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

public final class ExpandShrinkModifier$measure$currentSize$1 extends Lambda implements C19857l<EnterExitState, C7290i> {
    public final /* synthetic */ long $measuredSize;
    public final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7290i(m34630invokeYEO4UFw((EnterExitState) obj));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m34630invokeYEO4UFw(EnterExitState enterExitState) {
        C19383o.m32797g(enterExitState, "it");
        ExpandShrinkModifier expandShrinkModifier = this.this$0;
        long j = this.$measuredSize;
        expandShrinkModifier.getClass();
        C0470f value = expandShrinkModifier.f986d.getValue();
        long j2 = value != null ? value.f1208b.invoke(new C7290i(j)).f16171a : j;
        C0470f value2 = expandShrinkModifier.f987e.getValue();
        long j3 = value2 != null ? value2.f1208b.invoke(new C7290i(j)).f16171a : j;
        int i = ExpandShrinkModifier.C0385a.f991a[enterExitState.ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j2;
        }
        if (i == 3) {
            return j3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
