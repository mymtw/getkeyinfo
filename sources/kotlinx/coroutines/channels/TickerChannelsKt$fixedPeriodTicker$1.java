package kotlinx.coroutines.channels;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.channels.TickerChannelsKt", mo70541f = "TickerChannels.kt", mo70542l = {84, 88, 94, 96}, mo70543m = "fixedPeriodTicker")
final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public TickerChannelsKt$fixedPeriodTicker$1(C19340c<? super TickerChannelsKt$fixedPeriodTicker$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19523x.m33273b(0, 0, (C19519u) null, this);
    }
}
