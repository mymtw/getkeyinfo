package kotlinx.coroutines.sync;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19846a;

@C19060c(mo70540c = "kotlinx.coroutines.sync.SemaphoreKt", mo70541f = "Semaphore.kt", mo70542l = {85}, mo70543m = "withPermit")
final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public SemaphoreKt$withPermit$1(C19340c<? super SemaphoreKt$withPermit$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        SemaphoreKt$withPermit$1 semaphoreKt$withPermit$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = C19818f.f43814a;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            semaphoreKt$withPermit$1 = this;
        } else {
            semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(this);
        }
        Object obj2 = semaphoreKt$withPermit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = semaphoreKt$withPermit$1.label;
        if (i3 == 0) {
            C0761x.m1684O0(obj2);
            semaphoreKt$withPermit$1.L$0 = null;
            semaphoreKt$withPermit$1.L$1 = null;
            semaphoreKt$withPermit$1.label = 1;
            throw null;
        } else if (i3 == 1) {
            C19846a aVar = (C19846a) semaphoreKt$withPermit$1.L$1;
            C19816d dVar = (C19816d) semaphoreKt$withPermit$1.L$0;
            C0761x.m1684O0(obj2);
            try {
                return aVar.invoke();
            } finally {
                dVar.release();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
