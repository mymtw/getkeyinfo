package kotlinx.coroutines;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.TimeoutKt", mo70541f = "Timeout.kt", mo70542l = {100}, mo70543m = "withTimeoutOrNull")
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public TimeoutKt$withTimeoutOrNull$1(C19340c<? super TimeoutKt$withTimeoutOrNull$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimeoutKt.m33071b(0, (C19861p) null, this);
    }
}
