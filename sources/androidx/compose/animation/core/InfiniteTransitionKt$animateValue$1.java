package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class InfiniteTransitionKt$animateValue$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C0466z<Object> $animationSpec;
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ Object $targetValue;
    public final /* synthetic */ InfiniteTransition.C0394a<Object, Object> $transitionAnimation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1(Object obj, InfiniteTransition.C0394a<Object, Object> aVar, Object obj2, C0466z<Object> zVar) {
        super(0);
        this.$initialValue = obj;
        this.$transitionAnimation = aVar;
        this.$targetValue = obj2;
        this.$animationSpec = zVar;
    }

    public final void invoke() {
        if (!C19383o.m32792b(this.$initialValue, this.$transitionAnimation.f1021b) || !C19383o.m32792b(this.$targetValue, this.$transitionAnimation.f1022c)) {
            InfiniteTransition.C0394a<Object, Object> aVar = this.$transitionAnimation;
            T t = this.$initialValue;
            T t2 = this.$targetValue;
            C0466z<Object> zVar = this.$animationSpec;
            aVar.getClass();
            C19383o.m32797g(zVar, "animationSpec");
            aVar.f1021b = t;
            aVar.f1022c = t2;
            aVar.f1024e = zVar;
            aVar.f1026g = new C0431i0<>(zVar, aVar.f1023d, t, t2);
            aVar.f1030k.f1018b.setValue(Boolean.TRUE);
            aVar.f1027h = false;
            aVar.f1028i = true;
        }
    }
}
