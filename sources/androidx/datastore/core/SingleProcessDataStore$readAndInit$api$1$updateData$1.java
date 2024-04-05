package androidx.datastore.core;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", mo70541f = "SingleProcessDataStore.kt", mo70542l = {503, 337, 339}, mo70543m = "updateData")
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, C19340c<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> cVar) {
        super(cVar);
        this.this$0 = singleProcessDataStore$readAndInit$api$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo9323a((C19861p) null, this);
    }
}
