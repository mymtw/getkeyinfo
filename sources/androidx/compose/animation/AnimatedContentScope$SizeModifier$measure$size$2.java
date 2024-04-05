package androidx.compose.animation;

import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

public final class AnimatedContentScope$SizeModifier$measure$size$2 extends Lambda implements C19857l<S, C7290i> {
    public final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$SizeModifier$measure$size$2(AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.this$0 = animatedContentScope;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7290i(m34613invokeYEO4UFw(obj));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m34613invokeYEO4UFw(S s) {
        C1342k1 k1Var = (C1342k1) this.this$0.f967d.get(s);
        if (k1Var != null) {
            return ((C7290i) k1Var.getValue()).f16171a;
        }
        return 0;
    }
}
