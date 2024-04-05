package androidx.compose.runtime;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.runtime.PausableMonotonicFrameClock", mo70541f = "PausableMonotonicFrameClock.kt", mo70542l = {62, 63}, mo70543m = "withFrameNanos")
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, C19340c<? super PausableMonotonicFrameClock$withFrameNanos$1> cVar) {
        super(cVar);
        this.this$0 = pausableMonotonicFrameClock;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5381Q((C19857l) null, this);
    }
}
