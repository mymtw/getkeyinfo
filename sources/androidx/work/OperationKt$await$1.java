package androidx.work;

import androidx.compose.foundation.layout.C0761x;
import com.google.common.util.concurrent.C16388l;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.work.OperationKt", mo70541f = "Operation.kt", mo70542l = {39}, mo70543m = "await")
final class OperationKt$await$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public OperationKt$await$1(C19340c<? super OperationKt$await$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        OperationKt$await$1 operationKt$await$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            operationKt$await$1 = this;
        } else {
            operationKt$await$1 = new OperationKt$await$1(this);
        }
        Object obj2 = operationKt$await$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = operationKt$await$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            C16388l lVar = (C16388l) operationKt$await$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32796f(obj2, "result.await()");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
