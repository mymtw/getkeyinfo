package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", mo70541f = "CoroutineLiveData.kt", mo70542l = {98}, mo70543m = "invokeSuspend")
final class LiveDataScopeImpl$emit$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ C2893x<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(C2893x<Object> xVar, Object obj, C19340c<? super LiveDataScopeImpl$emit$2> cVar) {
        super(2, cVar);
        this.this$0 = xVar;
        this.$value = obj;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LiveDataScopeImpl$emit$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.this$0.getClass();
            this.label = 1;
            throw null;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj);
            this.this$0.getClass();
            throw null;
        }
    }
}
