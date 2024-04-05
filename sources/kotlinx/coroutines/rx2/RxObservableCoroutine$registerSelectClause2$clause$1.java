package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C19519u;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxObservableCoroutine$registerSelectClause2$clause$1", mo70541f = "RxObservable.kt", mo70542l = {101}, mo70543m = "invokeSuspend")
final class RxObservableCoroutine$registerSelectClause2$clause$1 extends SuspendLambda implements C19857l<C19340c<Object>, Object> {
    public final /* synthetic */ C19861p<C19519u<Object>, C19340c<Object>, Object> $block;
    public final /* synthetic */ Object $element;
    public int label;
    public final /* synthetic */ RxObservableCoroutine<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxObservableCoroutine$registerSelectClause2$clause$1(RxObservableCoroutine<Object> rxObservableCoroutine, Object obj, C19861p<? super C19519u<Object>, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super RxObservableCoroutine$registerSelectClause2$clause$1> cVar) {
        super(1, cVar);
        this.this$0 = rxObservableCoroutine;
        this.$element = obj;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new RxObservableCoroutine$registerSelectClause2$clause$1(this.this$0, this.$element, this.$block, cVar);
    }

    public final Object invoke(C19340c<Object> cVar) {
        return ((RxObservableCoroutine$registerSelectClause2$clause$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            RxObservableCoroutine<Object> rxObservableCoroutine = this.this$0;
            Object obj2 = this.$element;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RxObservableCoroutine.f43756d;
            throw rxObservableCoroutine.mo72601E0(obj2);
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
