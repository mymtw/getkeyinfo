package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", mo70541f = "Errors.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements C19861p<Throwable, C19340c<? super Boolean>, Object> {
    public int label;

    public FlowKt__ErrorsKt$retry$1(C19340c<? super FlowKt__ErrorsKt$retry$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FlowKt__ErrorsKt$retry$1(cVar);
    }

    public final Object invoke(Throwable th, C19340c<? super Boolean> cVar) {
        return ((FlowKt__ErrorsKt$retry$1) create(th, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
