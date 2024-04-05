package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo70541f = "Reduce.kt", mo70542l = {44}, mo70543m = "fold")
final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$fold$1(C19340c<? super FlowKt__ReduceKt$fold$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        FlowKt__ReduceKt$fold$1 flowKt__ReduceKt$fold$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            flowKt__ReduceKt$fold$1 = this;
        } else {
            flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(this);
        }
        Object obj2 = flowKt__ReduceKt$fold$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$fold$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = null;
            flowKt__ReduceKt$fold$1.L$0 = ref$ObjectRef;
            flowKt__ReduceKt$fold$1.label = 1;
            throw null;
        } else if (i2 == 1) {
            C0761x.m1684O0(obj2);
            return ((Ref$ObjectRef) flowKt__ReduceKt$fold$1.L$0).element;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
