package kotlinx.coroutines.channels;

import java.util.Collection;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo70541f = "Deprecated.kt", mo70542l = {487}, mo70543m = "toCollection")
final class ChannelsKt__DeprecatedKt$toCollection$1<E, C extends Collection<? super E>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$toCollection$1(C19340c<? super ChannelsKt__DeprecatedKt$toCollection$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19508j.m33209s(this);
    }
}
