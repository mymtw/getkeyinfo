package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", mo70541f = "Clickable.kt", mo70542l = {406, 409}, mo70543m = "invokeSuspend")
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<C19846a<Boolean>> $delayPressInteraction;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public final /* synthetic */ C1338j0<C0643m> $pressedInteraction;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(C1342k1<? extends C19846a<Boolean>> k1Var, long j, C0640j jVar, C1338j0<C0643m> j0Var, C19340c<? super ClickableKt$handlePressInteraction$2$delayJob$1> cVar) {
        super(2, cVar);
        this.$delayPressInteraction = k1Var;
        this.$pressPoint = j;
        this.$interactionSource = jVar;
        this.$pressedInteraction = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C0643m mVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            if (((Boolean) this.$delayPressInteraction.getValue().invoke()).booleanValue()) {
                long j = C0620h.f1362a;
                this.label = 1;
                if (C18263b.m30814I(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else if (i == 2) {
            mVar = (C0643m) this.L$0;
            C0761x.m1684O0(obj);
            this.$pressedInteraction.setValue(mVar);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0643m mVar2 = new C0643m(this.$pressPoint);
        C0640j jVar = this.$interactionSource;
        this.L$0 = mVar2;
        this.label = 2;
        if (jVar.mo3870a(mVar2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar = mVar2;
        this.$pressedInteraction.setValue(mVar);
        return C19394m.f43287a;
    }
}
