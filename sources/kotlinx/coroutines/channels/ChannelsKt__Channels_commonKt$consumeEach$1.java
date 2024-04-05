package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19388s;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo70541f = "Channels.common.kt", mo70542l = {104}, mo70543m = "consumeEach")
final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$consumeEach$1(C19340c<? super ChannelsKt__Channels_commonKt$consumeEach$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            channelsKt__Channels_commonKt$consumeEach$1 = this;
        } else {
            channelsKt__Channels_commonKt$consumeEach$1 = new ChannelsKt__Channels_commonKt$consumeEach$1(this);
        }
        Object obj2 = channelsKt__Channels_commonKt$consumeEach$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelsKt__Channels_commonKt$consumeEach$1.label;
        C19515q qVar = null;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else if (i2 == 1) {
            C19502f fVar = (C19502f) channelsKt__Channels_commonKt$consumeEach$1.L$2;
            C19515q qVar2 = (C19515q) channelsKt__Channels_commonKt$consumeEach$1.L$1;
            C19857l lVar = (C19857l) channelsKt__Channels_commonKt$consumeEach$1.L$0;
            try {
                C0761x.m1684O0(obj2);
                while (((Boolean) obj2).booleanValue()) {
                    lVar.invoke(fVar.next());
                    channelsKt__Channels_commonKt$consumeEach$1.L$0 = lVar;
                    channelsKt__Channels_commonKt$consumeEach$1.L$1 = qVar2;
                    channelsKt__Channels_commonKt$consumeEach$1.L$2 = fVar;
                    channelsKt__Channels_commonKt$consumeEach$1.label = 1;
                    obj2 = fVar.mo72148a(channelsKt__Channels_commonKt$consumeEach$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                C19394m mVar = C19394m.f43287a;
                C19388s.m32827J(qVar2, (Throwable) null);
                return C19394m.f43287a;
            } catch (Throwable th2) {
                th = th2;
                qVar = qVar2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    C19388s.m32827J(qVar, th);
                    throw th3;
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
