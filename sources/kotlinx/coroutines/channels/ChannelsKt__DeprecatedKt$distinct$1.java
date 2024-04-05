package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", mo70541f = "Deprecated.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$distinct$1 extends SuspendLambda implements C19861p {
    public /* synthetic */ Object L$0;
    public int label;

    public ChannelsKt__DeprecatedKt$distinct$1(C19340c<? super ChannelsKt__DeprecatedKt$distinct$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__DeprecatedKt$distinct$1 channelsKt__DeprecatedKt$distinct$1 = new ChannelsKt__DeprecatedKt$distinct$1(cVar);
        channelsKt__DeprecatedKt$distinct$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinct$1;
    }

    public final Object invoke(Object obj, C19340c cVar) {
        return ((ChannelsKt__DeprecatedKt$distinct$1) create(obj, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return this.L$0;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
