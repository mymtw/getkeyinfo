package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p744gq.C19060c;
import p753kq.C19861p;
import p772tq.C20203a;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", mo70541f = "Delay.kt", mo70542l = {300}, mo70543m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements C19861p<C19394m, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19600e<Object> $downstream;
    public final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, C19600e<Object> eVar, C19340c<? super FlowKt__DelayKt$sample$2$1$2> cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, cVar);
    }

    public final Object invoke(C19394m mVar, C19340c<? super C19394m> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(mVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            T t = ref$ObjectRef.element;
            if (t == null) {
                return C19394m.f43287a;
            }
            ref$ObjectRef.element = null;
            C19600e<Object> eVar = this.$downstream;
            if (t == C20203a.f44778h) {
                t = null;
            }
            this.label = 1;
            if (eVar.emit(t, this) == coroutineSingletons) {
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
