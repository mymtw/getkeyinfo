package kotlinx.coroutines;

import androidx.compose.foundation.layout.C0761x;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19388s;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.DelayKt", mo70541f = "Delay.kt", mo70542l = {148}, mo70543m = "awaitCancellation")
final class DelayKt$awaitCancellation$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public DelayKt$awaitCancellation$1(C19340c<? super DelayKt$awaitCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            delayKt$awaitCancellation$1 = this;
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(this);
        }
        Object obj2 = delayKt$awaitCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = delayKt$awaitCancellation$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            delayKt$awaitCancellation$1.label = 1;
            C19753l lVar = new C19753l(1, C19388s.m32873m0(delayKt$awaitCancellation$1));
            lVar.mo72548n();
            if (lVar.mo72547l() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj2);
        }
        throw new KotlinNothingValueException();
    }
}
