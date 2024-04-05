package androidx.compose.animation.core;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19857l;

public final class SuspendAnimationKt$animate$9 extends Lambda implements C19857l<Long, C19394m> {
    public final /* synthetic */ C0413b<T, V> $animation;
    public final /* synthetic */ C19857l<C0419d<T, V>, C19394m> $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ Ref$ObjectRef<C0419d<T, V>> $lateInitScope;
    public final /* synthetic */ C0424f<T, V> $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$9(Ref$ObjectRef<C0419d<T, V>> ref$ObjectRef, float f, C0413b<T, V> bVar, C0424f<T, V> fVar, C19857l<? super C0419d<T, V>, C19394m> lVar) {
        super(1);
        this.$lateInitScope = ref$ObjectRef;
        this.$durationScale = f;
        this.$animation = bVar;
        this.$this_animate = fVar;
        this.$block = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C19394m.f43287a;
    }

    public final void invoke(long j) {
        T t = this.$lateInitScope.element;
        C19383o.m32794d(t);
        SuspendAnimationKt.m1075f((C0419d) t, j, this.$durationScale, this.$animation, this.$this_animate, this.$block);
    }
}
