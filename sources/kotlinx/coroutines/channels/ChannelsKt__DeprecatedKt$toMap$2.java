package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo70541f = "Deprecated.kt", mo70542l = {487}, mo70543m = "toMap")
final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$toMap$2(C19340c<? super ChannelsKt__DeprecatedKt$toMap$2> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19508j.m33210t(this);
    }
}
