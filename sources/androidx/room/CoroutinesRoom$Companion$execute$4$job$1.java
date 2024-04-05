package androidx.room;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19747k;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", mo70541f = "CoroutinesRoom.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Callable<Object> $callable;
    public final /* synthetic */ C19747k<Object> $continuation;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<Object> callable, C19747k<Object> kVar, C19340c<? super CoroutinesRoom$Companion$execute$4$job$1> cVar) {
        super(2, cVar);
        this.$callable = callable;
        this.$continuation = kVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            try {
                this.$continuation.resumeWith(Result.m35480constructorimpl(this.$callable.call()));
            } catch (Throwable th) {
                this.$continuation.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
