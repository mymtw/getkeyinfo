package kotlinx.coroutines;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", mo70541f = "Interruptible.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {
    public final /* synthetic */ C19846a<Object> $block;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(C19846a<Object> aVar, C19340c<? super InterruptibleKt$runInterruptible$2> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, cVar);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((InterruptibleKt$runInterruptible$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19467a2 a2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            CoroutineContext coroutineContext = ((C19525d0) this.L$0).getCoroutineContext();
            C19846a<Object> aVar = this.$block;
            try {
                a2Var = new C19467a2(C1993m.m4345F(coroutineContext));
                a2Var.mo72104c();
                Object invoke = aVar.invoke();
                a2Var.mo72103a();
                return invoke;
            } catch (InterruptedException e) {
                throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
            } catch (Throwable th) {
                a2Var.mo72103a();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
