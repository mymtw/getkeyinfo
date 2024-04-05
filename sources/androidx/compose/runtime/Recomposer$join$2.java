package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.Recomposer;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer$join$2", mo70541f = "Recomposer.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class Recomposer$join$2 extends SuspendLambda implements C19861p<Recomposer.State, C19340c<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public Recomposer$join$2(C19340c<? super Recomposer$join$2> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(cVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    public final Object invoke(Recomposer.State state, C19340c<? super Boolean> cVar) {
        return ((Recomposer$join$2) create(state, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return Boolean.valueOf(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
