package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19753l;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxAwaitKt", mo70541f = "RxAwait.kt", mo70542l = {108}, mo70543m = "awaitOrDefault")
final class RxAwaitKt$awaitOrDefault$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public RxAwaitKt$awaitOrDefault$1(C19340c<? super RxAwaitKt$awaitOrDefault$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        RxAwaitKt$awaitOrDefault$1 rxAwaitKt$awaitOrDefault$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            rxAwaitKt$awaitOrDefault$1 = this;
        } else {
            rxAwaitKt$awaitOrDefault$1 = new RxAwaitKt$awaitOrDefault$1(this);
        }
        Object obj2 = rxAwaitKt$awaitOrDefault$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rxAwaitKt$awaitOrDefault$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            rxAwaitKt$awaitOrDefault$1.L$0 = null;
            rxAwaitKt$awaitOrDefault$1.label = 1;
            new C19753l(1, C19388s.m32873m0(rxAwaitKt$awaitOrDefault$1)).mo72548n();
            throw null;
        } else if (i2 == 1) {
            Object obj3 = rxAwaitKt$awaitOrDefault$1.L$0;
            C0761x.m1684O0(obj2);
            return obj2 == null ? obj3 : obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
