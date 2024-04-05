package androidx.compose.animation;

import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

final class AnimatedContentScope$slideIntoContainer$3 extends Lambda implements C19857l<Integer, Integer> {
    public final /* synthetic */ C19857l<Integer, Integer> $initialOffset;
    public final /* synthetic */ AnimatedContentScope<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$slideIntoContainer$3(C19857l<? super Integer, Integer> lVar, AnimatedContentScope<Object> animatedContentScope) {
        super(1);
        this.$initialOffset = lVar;
        this.this$0 = animatedContentScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        C19857l<Integer, Integer> lVar = this.$initialOffset;
        long d = AnimatedContentScope.m1014d(this.this$0, C0761x.m1707a(i, i), AnimatedContentScope.m1015e(this.this$0));
        int i2 = C7287g.f16165c;
        return lVar.invoke(Integer.valueOf((-((int) (d >> 32))) - i));
    }
}
