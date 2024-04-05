package androidx.datastore.core;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore", mo70541f = "SingleProcessDataStore.kt", mo70542l = {426}, mo70543m = "writeData$datastore_core")
public final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, C19340c<? super SingleProcessDataStore$writeData$1> cVar) {
        super(cVar);
        this.this$0 = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo9312j(null, this);
    }
}
