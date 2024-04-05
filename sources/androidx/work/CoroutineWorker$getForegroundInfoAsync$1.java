package androidx.work;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", mo70541f = "CoroutineWorker.kt", mo70542l = {134}, mo70543m = "invokeSuspend")
public final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C3420j<C3382f> $jobFuture;
    public Object L$0;
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(C3420j<C3382f> jVar, CoroutineWorker coroutineWorker, C19340c<? super CoroutineWorker$getForegroundInfoAsync$1> cVar) {
        super(2, cVar);
        this.$jobFuture = jVar;
        this.this$0 = coroutineWorker;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.$jobFuture, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C3420j<C3382f> jVar = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = jVar;
            this.label = 1;
            coroutineWorker.getClass();
            throw new IllegalStateException("Not implemented");
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            ((C3420j) this.L$0).f8023c.mo12917i(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
