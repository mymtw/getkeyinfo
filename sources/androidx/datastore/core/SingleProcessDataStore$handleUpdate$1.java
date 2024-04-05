package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore", mo70541f = "SingleProcessDataStore.kt", mo70542l = {276, 281, 284}, mo70543m = "handleUpdate")
final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessDataStore<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<Object> singleProcessDataStore, C19340c<? super SingleProcessDataStore$handleUpdate$1> cVar) {
        super(cVar);
        this.this$0 = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SingleProcessDataStore.m5426b(this.this$0, (SingleProcessDataStore.C2467a.C2469b) null, this);
    }
}
