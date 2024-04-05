package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", mo70541f = "Channel.kt", mo70542l = {584}, mo70543m = "next")
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ChannelIterator$next0$1(C19340c<? super ChannelIterator$next0$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        ChannelIterator$next0$1 channelIterator$next0$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            channelIterator$next0$1 = this;
        } else {
            channelIterator$next0$1 = new ChannelIterator$next0$1(this);
        }
        Object obj2 = channelIterator$next0$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelIterator$next0$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            channelIterator$next0$1.L$0 = null;
            channelIterator$next0$1.label = 1;
            throw null;
        } else if (i2 == 1) {
            C19502f fVar = (C19502f) channelIterator$next0$1.L$0;
            C0761x.m1684O0(obj2);
            if (((Boolean) obj2).booleanValue()) {
                return fVar.next();
            }
            throw new ClosedReceiveChannelException("Channel was closed");
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
