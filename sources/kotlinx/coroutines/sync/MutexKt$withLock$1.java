package kotlinx.coroutines.sync;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19846a;

@C19060c(mo70540c = "kotlinx.coroutines.sync.MutexKt", mo70541f = "Mutex.kt", mo70542l = {112}, mo70543m = "withLock")
final class MutexKt$withLock$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public MutexKt$withLock$1(C19340c<? super MutexKt$withLock$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        MutexKt$withLock$1 mutexKt$withLock$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            mutexKt$withLock$1 = this;
        } else {
            mutexKt$withLock$1 = new MutexKt$withLock$1(this);
        }
        Object obj2 = mutexKt$withLock$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mutexKt$withLock$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            mutexKt$withLock$1.L$0 = null;
            mutexKt$withLock$1.L$1 = null;
            mutexKt$withLock$1.L$2 = null;
            mutexKt$withLock$1.label = 1;
            throw null;
        } else if (i2 == 1) {
            C19846a aVar = (C19846a) mutexKt$withLock$1.L$2;
            Object obj3 = mutexKt$withLock$1.L$1;
            C19814c cVar = (C19814c) mutexKt$withLock$1.L$0;
            C0761x.m1684O0(obj2);
            try {
                return aVar.invoke();
            } finally {
                cVar.mo72642d(obj3);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
