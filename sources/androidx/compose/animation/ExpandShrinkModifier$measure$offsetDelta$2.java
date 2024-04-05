package androidx.compose.animation;

import androidx.compose.animation.ExpandShrinkModifier;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;

public final class ExpandShrinkModifier$measure$offsetDelta$2 extends Lambda implements C19857l<EnterExitState, C7287g> {
    public final /* synthetic */ long $measuredSize;
    public final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$offsetDelta$2(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7287g(m34631invokeBjo55l4((EnterExitState) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34631invokeBjo55l4(EnterExitState enterExitState) {
        C19383o.m32797g(enterExitState, "it");
        ExpandShrinkModifier expandShrinkModifier = this.this$0;
        long j = this.$measuredSize;
        expandShrinkModifier.getClass();
        if (expandShrinkModifier.f989g == null) {
            return C7287g.f16164b;
        }
        if (expandShrinkModifier.f988f.getValue() == null) {
            return C7287g.f16164b;
        }
        if (C19383o.m32792b(expandShrinkModifier.f989g, expandShrinkModifier.f988f.getValue())) {
            return C7287g.f16164b;
        }
        int i = ExpandShrinkModifier.C0385a.f991a[enterExitState.ordinal()];
        if (i == 1) {
            return C7287g.f16164b;
        }
        if (i == 2) {
            return C7287g.f16164b;
        }
        if (i == 3) {
            C0470f value = expandShrinkModifier.f987e.getValue();
            if (value == null) {
                return C7287g.f16164b;
            }
            long j2 = value.f1208b.invoke(new C7290i(j)).f16171a;
            C1428a value2 = expandShrinkModifier.f988f.getValue();
            C19383o.m32794d(value2);
            long j3 = j;
            long j4 = j2;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long a = value2.mo6133a(j3, j4, layoutDirection);
            C1428a aVar = expandShrinkModifier.f989g;
            C19383o.m32794d(aVar);
            long a2 = aVar.mo6133a(j3, j4, layoutDirection);
            return C19421p.m32949o(((int) (a >> 32)) - ((int) (a2 >> 32)), C7287g.m13992b(a) - C7287g.m13992b(a2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
