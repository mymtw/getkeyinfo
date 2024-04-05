package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", mo70541f = "CommonRipple.kt", mo70542l = {87}, mo70543m = "invokeSuspend")
public final class CommonRippleIndicationInstance$addRipple$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0643m $interaction;
    public final /* synthetic */ RippleAnimation $rippleAnimation;
    public int label;
    public final /* synthetic */ CommonRippleIndicationInstance this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, C0643m mVar, C19340c<? super CommonRippleIndicationInstance$addRipple$2> cVar) {
        super(2, cVar);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleIndicationInstance;
        this.$interaction = mVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            RippleAnimation rippleAnimation = this.$rippleAnimation;
            this.label = 1;
            if (rippleAnimation.mo5305a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                this.this$0.f2558g.remove(this.$interaction);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f2558g.remove(this.$interaction);
        return C19394m.f43287a;
    }
}
