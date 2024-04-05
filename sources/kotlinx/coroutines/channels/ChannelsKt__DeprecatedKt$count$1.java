package kotlinx.coroutines.channels;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo70541f = "Deprecated.kt", mo70542l = {487}, mo70543m = "count")
final class ChannelsKt__DeprecatedKt$count$1<E> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$count$1(C19340c<? super ChannelsKt__DeprecatedKt$count$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19508j.m33192b(this);
    }
}
