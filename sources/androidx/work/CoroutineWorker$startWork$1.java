package androidx.work;

import androidx.compose.foundation.layout.C0761x;
import androidx.work.ListenableWorker;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.work.CoroutineWorker$startWork$1", mo70541f = "CoroutineWorker.kt", mo70542l = {68}, mo70543m = "invokeSuspend")
final class CoroutineWorker$startWork$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, C19340c<? super CoroutineWorker$startWork$1> cVar) {
        super(2, cVar);
        this.this$0 = coroutineWorker;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CoroutineWorker$startWork$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CoroutineWorker$startWork$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            CoroutineWorker coroutineWorker = this.this$0;
            this.label = 1;
            obj = coroutineWorker.mo12814h();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                this.this$0.f7850h.mo12918j(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f7850h.mo12917i((ListenableWorker.C3367a) obj);
        return C19394m.f43287a;
    }
}
