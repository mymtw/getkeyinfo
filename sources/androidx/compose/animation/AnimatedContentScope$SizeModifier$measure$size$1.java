package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

public final class AnimatedContentScope$SizeModifier$measure$size$1 extends Lambda implements C19857l<Transition.C0402b<S>, C0454t<C7290i>> {
    public final /* synthetic */ AnimatedContentScope<S> this$0;
    public final /* synthetic */ AnimatedContentScope<S>.SizeModifier this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$SizeModifier$measure$size$1(AnimatedContentScope<S> animatedContentScope, AnimatedContentScope<S>.SizeModifier sizeModifier) {
        super(1);
        this.this$0 = animatedContentScope;
        this.this$1 = sizeModifier;
    }

    public final C0454t<C7290i> invoke(Transition.C0402b<S> bVar) {
        C0454t<C7290i> c;
        C19383o.m32797g(bVar, "$this$animate");
        C1342k1 k1Var = (C1342k1) this.this$0.f967d.get(bVar.mo3270b());
        long j = 0;
        long j2 = k1Var != null ? ((C7290i) k1Var.getValue()).f16171a : 0;
        C1342k1 k1Var2 = (C1342k1) this.this$0.f967d.get(bVar.mo3269a());
        if (k1Var2 != null) {
            j = ((C7290i) k1Var2.getValue()).f16171a;
        }
        C0484s value = this.this$1.f970c.getValue();
        return (value == null || (c = value.mo3570c(j2, j)) == null) ? C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7) : c;
    }
}
