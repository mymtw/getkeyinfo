package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo70541f = "Channels.common.kt", mo70542l = {129}, mo70543m = "consumeEach")
final class ChannelsKt__Channels_commonKt$consumeEach$3<E> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$consumeEach$3(C19340c<? super ChannelsKt__Channels_commonKt$consumeEach$3> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$3;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            channelsKt__Channels_commonKt$consumeEach$3 = this;
        } else {
            channelsKt__Channels_commonKt$consumeEach$3 = new ChannelsKt__Channels_commonKt$consumeEach$3(this);
        }
        Object obj2 = channelsKt__Channels_commonKt$consumeEach$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelsKt__Channels_commonKt$consumeEach$3.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            C19502f fVar = (C19502f) channelsKt__Channels_commonKt$consumeEach$3.L$2;
            C19515q qVar = (C19515q) channelsKt__Channels_commonKt$consumeEach$3.L$1;
            C19857l lVar = (C19857l) channelsKt__Channels_commonKt$consumeEach$3.L$0;
            try {
                C0761x.m1684O0(obj2);
                while (((Boolean) obj2).booleanValue()) {
                    lVar.invoke(fVar.next());
                    channelsKt__Channels_commonKt$consumeEach$3.L$0 = lVar;
                    channelsKt__Channels_commonKt$consumeEach$3.L$1 = qVar;
                    channelsKt__Channels_commonKt$consumeEach$3.L$2 = fVar;
                    channelsKt__Channels_commonKt$consumeEach$3.label = 1;
                    obj2 = fVar.mo72148a(channelsKt__Channels_commonKt$consumeEach$3);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                C19394m mVar = C19394m.f43287a;
                qVar.mo72134a((CancellationException) null);
                return C19394m.f43287a;
            } catch (Throwable th) {
                qVar.mo72134a((CancellationException) null);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
