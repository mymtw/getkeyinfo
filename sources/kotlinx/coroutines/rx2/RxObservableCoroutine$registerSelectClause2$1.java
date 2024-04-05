package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.selects.C19805f;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxObservableCoroutine$registerSelectClause2$1", mo70541f = "RxObservable.kt", mo70542l = {106}, mo70543m = "invokeSuspend")
final class RxObservableCoroutine$registerSelectClause2$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<C19340c<Object>, Object> $clause;
    public final /* synthetic */ C19805f<Object> $select;
    public int label;
    public final /* synthetic */ RxObservableCoroutine<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxObservableCoroutine$registerSelectClause2$1(RxObservableCoroutine<Object> rxObservableCoroutine, C19805f<Object> fVar, C19857l<? super C19340c<Object>, ? extends Object> lVar, C19340c<? super RxObservableCoroutine$registerSelectClause2$1> cVar) {
        super(2, cVar);
        this.this$0 = rxObservableCoroutine;
        this.$select = fVar;
        this.$clause = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new RxObservableCoroutine$registerSelectClause2$1(this.this$0, this.$select, this.$clause, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((RxObservableCoroutine$registerSelectClause2$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            RxObservableCoroutine<Object> rxObservableCoroutine = this.this$0;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RxObservableCoroutine.f43756d;
            rxObservableCoroutine.getClass();
            this.label = 1;
            throw null;
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            if (this.$select.mo72634k()) {
                C19543e0.m33320l0(this.$clause, this.$select.mo72635l());
                return C19394m.f43287a;
            }
            RxObservableCoroutine<Object> rxObservableCoroutine2 = this.this$0;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = RxObservableCoroutine.f43756d;
            rxObservableCoroutine2.getClass();
            throw null;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
