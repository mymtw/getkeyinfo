package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1$1$1", mo70541f = "RxScheduler.kt", mo70542l = {60}, mo70543m = "invokeSuspend")
public final class DispatcherScheduler$scheduleDirect$1$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<C19340c<? super C19394m>, Object> $task;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispatcherScheduler$scheduleDirect$1$1$1(C19857l<? super C19340c<? super C19394m>, ? extends Object> lVar, C19340c<? super DispatcherScheduler$scheduleDirect$1$1$1> cVar) {
        super(2, cVar);
        this.$task = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DispatcherScheduler$scheduleDirect$1$1$1(this.$task, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DispatcherScheduler$scheduleDirect$1$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19857l<C19340c<? super C19394m>, Object> lVar = this.$task;
            this.label = 1;
            if (lVar.invoke(this) == coroutineSingletons) {
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
