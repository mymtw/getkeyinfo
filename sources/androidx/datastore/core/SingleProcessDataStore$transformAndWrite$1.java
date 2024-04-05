package androidx.datastore.core;

import java.util.LinkedHashSet;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore", mo70541f = "SingleProcessDataStore.kt", mo70542l = {402, 410}, mo70543m = "transformAndWrite")
final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessDataStore<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore<Object> singleProcessDataStore, C19340c<? super SingleProcessDataStore$transformAndWrite$1> cVar) {
        super(cVar);
        this.this$0 = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SingleProcessDataStore<Object> singleProcessDataStore = this.this$0;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f5726k;
        return singleProcessDataStore.mo9311i(this, (CoroutineContext) null, (C19861p) null);
    }
}
