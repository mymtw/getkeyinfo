package androidx.compose.animation;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;

final class AnimatedContentScope$slideOutOfContainer$5 extends Lambda implements C19857l<Integer, Integer> {
    public final /* synthetic */ C19857l<Integer, Integer> $targetOffset;
    public final /* synthetic */ AnimatedContentScope<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$slideOutOfContainer$5(AnimatedContentScope<Object> animatedContentScope, C19857l<? super Integer, Integer> lVar) {
        super(1);
        this.this$0 = animatedContentScope;
        this.$targetOffset = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        AnimatedContentScope<Object> animatedContentScope = this.this$0;
        C1342k1 k1Var = (C1342k1) animatedContentScope.f967d.get(animatedContentScope.f964a.mo3412d());
        long j = k1Var != null ? ((C7290i) k1Var.getValue()).f16171a : 0;
        return this.$targetOffset.invoke(Integer.valueOf(C7290i.m13995b(j) + (-C7287g.m13992b(AnimatedContentScope.m1014d(this.this$0, C0761x.m1707a(i, i), j)))));
    }
}
