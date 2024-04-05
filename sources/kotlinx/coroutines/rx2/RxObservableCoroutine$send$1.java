package kotlinx.coroutines.rx2;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxObservableCoroutine", mo70541f = "RxObservable.kt", mo70542l = {85}, mo70543m = "send")
public final class RxObservableCoroutine$send$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RxObservableCoroutine<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxObservableCoroutine$send$1(RxObservableCoroutine<T> rxObservableCoroutine, C19340c<? super RxObservableCoroutine$send$1> cVar) {
        super(cVar);
        this.this$0 = rxObservableCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72188E(null, this);
    }
}
