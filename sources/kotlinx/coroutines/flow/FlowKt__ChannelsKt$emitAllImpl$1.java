package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C19515q;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", mo70541f = "Channels.kt", mo70542l = {51, 62}, mo70543m = "emitAllImpl$FlowKt__ChannelsKt")
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ChannelsKt$emitAllImpl$1(C19340c<? super FlowKt__ChannelsKt$emitAllImpl$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m33370a((C19600e) null, (C19515q) null, false, this);
    }
}
