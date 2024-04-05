package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19753l;
import p744gq.C19060c;
import p753kq.C19846a;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxAwaitKt", mo70541f = "RxAwait.kt", mo70542l = {174}, mo70543m = "awaitFirstOrElse")
final class RxAwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public RxAwaitKt$awaitFirstOrElse$1(C19340c<? super RxAwaitKt$awaitFirstOrElse$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        RxAwaitKt$awaitFirstOrElse$1 rxAwaitKt$awaitFirstOrElse$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            rxAwaitKt$awaitFirstOrElse$1 = this;
        } else {
            rxAwaitKt$awaitFirstOrElse$1 = new RxAwaitKt$awaitFirstOrElse$1(this);
        }
        Object obj2 = rxAwaitKt$awaitFirstOrElse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rxAwaitKt$awaitFirstOrElse$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            Mode mode = Mode.FIRST;
            rxAwaitKt$awaitFirstOrElse$1.L$0 = null;
            rxAwaitKt$awaitFirstOrElse$1.label = 1;
            new C19753l(1, C19388s.m32873m0(rxAwaitKt$awaitFirstOrElse$1)).mo72548n();
            throw null;
        } else if (i2 == 1) {
            C19846a aVar = (C19846a) rxAwaitKt$awaitFirstOrElse$1.L$0;
            C0761x.m1684O0(obj2);
            return obj2 == null ? aVar.invoke() : obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
