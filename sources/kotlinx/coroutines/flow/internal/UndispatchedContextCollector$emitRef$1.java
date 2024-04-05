package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo70541f = "ChannelFlow.kt", mo70542l = {212}, mo70543m = "invokeSuspend")
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements C19861p<T, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19600e<T> $downstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(C19600e<? super T> eVar, C19340c<? super UndispatchedContextCollector$emitRef$1> cVar) {
        super(2, cVar);
        this.$downstream = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, cVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    public final Object invoke(T t, C19340c<? super C19394m> cVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Object obj2 = this.L$0;
            C19600e<T> eVar = this.$downstream;
            this.label = 1;
            if (eVar.emit(obj2, this) == coroutineSingletons) {
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
