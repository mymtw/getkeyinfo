package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p744gq.C19060c;
import p753kq.C19857l;
import p772tq.C20203a;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", mo70541f = "Delay.kt", mo70542l = {233}, mo70543m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19600e<Object> $downstream;
    public final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(C19600e<Object> eVar, Ref$ObjectRef<Object> ref$ObjectRef, C19340c<? super FlowKt__DelayKt$debounceInternal$1$3$1> cVar) {
        super(1, cVar);
        this.$downstream = eVar;
        this.$lastValue = ref$ObjectRef;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, this.$lastValue, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19600e<Object> eVar = this.$downstream;
            T t = C20203a.f44778h;
            T t2 = this.$lastValue.element;
            if (t2 == t) {
                t2 = null;
            }
            this.label = 1;
            if (eVar.emit(t2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$lastValue.element = null;
        return C19394m.f43287a;
    }
}
