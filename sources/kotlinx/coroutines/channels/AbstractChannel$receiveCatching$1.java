package kotlinx.coroutines.channels;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.AbstractChannel", mo70541f = "AbstractChannel.kt", mo70542l = {633}, mo70543m = "receiveCatching-JP2dKIU")
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, C19340c<? super AbstractChannel$receiveCatching$1> cVar) {
        super(cVar);
        this.this$0 = abstractChannel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object y = this.this$0.mo72146y(this);
        return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : new C19503g(y);
    }
}
