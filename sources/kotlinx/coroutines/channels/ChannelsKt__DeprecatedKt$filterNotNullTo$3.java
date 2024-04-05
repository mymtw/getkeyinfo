package kotlinx.coroutines.channels;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C19519u;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo70541f = "Deprecated.kt", mo70542l = {487, 242}, mo70543m = "filterNotNullTo")
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends C19519u<? super E>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(C19340c<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19508j.m33196f(this);
    }
}
