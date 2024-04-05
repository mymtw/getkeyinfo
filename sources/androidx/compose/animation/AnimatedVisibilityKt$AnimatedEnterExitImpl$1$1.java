package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1333i1;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", mo70541f = "AnimatedVisibility.kt", mo70542l = {748}, mo70543m = "invokeSuspend")
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Transition<EnterExitState> $childTransition;
    public final /* synthetic */ C1338j0<Boolean> $isAnimationVisible;
    public int label;

    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1$a */
    public static final class C0379a implements C19600e<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ C1338j0<Boolean> f974b;

        public C0379a(C1338j0<Boolean> j0Var) {
            this.f974b = j0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            this.f974b.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, C1338j0<Boolean> j0Var, C19340c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> cVar) {
        super(2, cVar);
        this.$childTransition = transition;
        this.$isAnimationVisible = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.$childTransition, this.$isAnimationVisible, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final Transition<EnterExitState> transition = this.$childTransition;
            C19665q1 b = C1333i1.m2796b(new C19846a<Boolean>() {
                public final Boolean invoke() {
                    EnterExitState b = transition.mo3410b();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(b == enterExitState || transition.mo3412d() == enterExitState);
                }
            });
            C0379a aVar = new C0379a(this.$isAnimationVisible);
            this.label = 1;
            if (b.collect(aVar, this) == coroutineSingletons) {
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
