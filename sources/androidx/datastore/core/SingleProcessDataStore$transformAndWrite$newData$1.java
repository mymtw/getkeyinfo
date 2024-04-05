package androidx.datastore.core;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", mo70541f = "SingleProcessDataStore.kt", mo70542l = {402}, mo70543m = "invokeSuspend")
final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {
    public final /* synthetic */ Object $curData;
    public final /* synthetic */ C19861p<Object, C19340c<Object>, Object> $transform;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$newData$1(C19861p<Object, ? super C19340c<Object>, ? extends Object> pVar, Object obj, C19340c<? super SingleProcessDataStore$transformAndWrite$newData$1> cVar) {
        super(2, cVar);
        this.$transform = pVar;
        this.$curData = obj;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19861p<Object, C19340c<Object>, Object> pVar = this.$transform;
            Object obj2 = this.$curData;
            this.label = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
