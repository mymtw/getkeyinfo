package kotlinx.coroutines.channels;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo70541f = "Channels.common.kt", mo70542l = {148}, mo70543m = "toList")
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$toList$1(C19340c<? super ChannelsKt__Channels_commonKt$toList$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19507i.m33190a(this);
    }
}
