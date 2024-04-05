package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0426g;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", mo70541f = "RippleAnimation.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class RippleAnimation$fadeOut$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19699g1>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RippleAnimation this$0;

    @C19060c(mo70540c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", mo70541f = "RippleAnimation.kt", mo70542l = {112}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1 */
    public static final class C12331 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C12331(rippleAnimation, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C12331) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                Animatable<Float, C0426g> animatable = rippleAnimation.f2567g;
                Float f = new Float(0.0f);
                C0433j0 Z0 = C0761x.m1706Z0(150, 0, C0450s.C0451a.f1169a, 2);
                this.label = 1;
                if (Animatable.m1065d(animatable, f, Z0, (Float) null, (C19857l) null, this, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, C19340c<? super RippleAnimation$fadeOut$2> cVar) {
        super(2, cVar);
        this.this$0 = rippleAnimation;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.this$0, cVar);
        rippleAnimation$fadeOut$2.L$0 = obj;
        return rippleAnimation$fadeOut$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19699g1> cVar) {
        return ((RippleAnimation$fadeOut$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            final RippleAnimation rippleAnimation = this.this$0;
            return C19697g.m33468f((C19525d0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C12331((C19340c<? super C12331>) null), 3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
