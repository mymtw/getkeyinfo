package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import java.util.NoSuchElementException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19753l;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxAwaitKt", mo70541f = "RxAwait.kt", mo70542l = {64}, mo70543m = "awaitSingle")
final class RxAwaitKt$awaitSingle$1<T> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public RxAwaitKt$awaitSingle$1(C19340c<? super RxAwaitKt$awaitSingle$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        RxAwaitKt$awaitSingle$1 rxAwaitKt$awaitSingle$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            rxAwaitKt$awaitSingle$1 = this;
        } else {
            rxAwaitKt$awaitSingle$1 = new RxAwaitKt$awaitSingle$1(this);
        }
        Object obj2 = rxAwaitKt$awaitSingle$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rxAwaitKt$awaitSingle$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            rxAwaitKt$awaitSingle$1.label = 1;
            new C19753l(1, C19388s.m32873m0(rxAwaitKt$awaitSingle$1)).mo72548n();
            throw null;
        } else if (i2 == 1) {
            C0761x.m1684O0(obj2);
            if (obj2 != null) {
                return obj2;
            }
            throw new NoSuchElementException();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
