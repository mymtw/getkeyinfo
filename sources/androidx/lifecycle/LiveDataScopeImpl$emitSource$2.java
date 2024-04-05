package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19766p0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", mo70541f = "CoroutineLiveData.kt", mo70542l = {94}, mo70543m = "invokeSuspend")
final class LiveDataScopeImpl$emitSource$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19766p0>, Object> {
    public final /* synthetic */ LiveData<Object> $source;
    public int label;
    public final /* synthetic */ C2893x<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emitSource$2(C2893x<Object> xVar, LiveData<Object> liveData, C19340c<? super LiveDataScopeImpl$emitSource$2> cVar) {
        super(2, cVar);
        this.this$0 = xVar;
        this.$source = liveData;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LiveDataScopeImpl$emitSource$2(this.this$0, this.$source, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19766p0> cVar) {
        return ((LiveDataScopeImpl$emitSource$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.this$0.getClass();
            this.label = 1;
            throw null;
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
