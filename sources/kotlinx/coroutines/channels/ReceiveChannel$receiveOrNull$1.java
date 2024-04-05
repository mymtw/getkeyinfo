package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", mo70541f = "Channel.kt", mo70542l = {354}, mo70543m = "receiveOrNull")
final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public ReceiveChannel$receiveOrNull$1(C19340c<? super ReceiveChannel$receiveOrNull$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            receiveChannel$receiveOrNull$1 = this;
        } else {
            receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(this);
        }
        Object obj2 = receiveChannel$receiveOrNull$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = receiveChannel$receiveOrNull$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            receiveChannel$receiveOrNull$1.label = 1;
            throw null;
        } else if (i2 == 1) {
            C0761x.m1684O0(obj2);
            return C19503g.m33188b(((C19503g) obj2).f43450a);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
