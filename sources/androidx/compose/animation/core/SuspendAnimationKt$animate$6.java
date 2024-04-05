package androidx.compose.animation.core;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;
import p753kq.C19857l;

public final class SuspendAnimationKt$animate$6 extends Lambda implements C19857l<Long, C19394m> {
    public final /* synthetic */ C0413b<T, V> $animation;
    public final /* synthetic */ C19857l<C0419d<T, V>, C19394m> $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ T $initialValue;
    public final /* synthetic */ V $initialVelocityVector;
    public final /* synthetic */ Ref$ObjectRef<C0419d<T, V>> $lateInitScope;
    public final /* synthetic */ C0424f<T, V> $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$6(Ref$ObjectRef<C0419d<T, V>> ref$ObjectRef, T t, C0413b<T, V> bVar, V v, C0424f<T, V> fVar, float f, C19857l<? super C0419d<T, V>, C19394m> lVar) {
        super(1);
        this.$lateInitScope = ref$ObjectRef;
        this.$initialValue = t;
        this.$animation = bVar;
        this.$initialVelocityVector = v;
        this.$this_animate = fVar;
        this.$durationScale = f;
        this.$block = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C19394m.f43287a;
    }

    public final void invoke(long j) {
        Ref$ObjectRef<C0419d<T, V>> ref$ObjectRef = this.$lateInitScope;
        T t = this.$initialValue;
        C0435k0<T, V> e = this.$animation.mo3467e();
        V v = this.$initialVelocityVector;
        T g = this.$animation.mo3469g();
        final C0424f<T, V> fVar = this.$this_animate;
        C0419d dVar = new C0419d(t, e, v, j, g, j, new C19846a<C19394m>() {
            public final void invoke() {
                fVar.f1114g = false;
            }
        });
        SuspendAnimationKt.m1075f(dVar, j, this.$durationScale, this.$animation, this.$this_animate, this.$block);
        ref$ObjectRef.element = dVar;
    }
}
