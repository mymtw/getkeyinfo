package androidx.datastore.core;

import java.util.LinkedHashSet;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore", mo70541f = "SingleProcessDataStore.kt", mo70542l = {359, 362, 365}, mo70543m = "readDataOrHandleCorruption")
public final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, C19340c<? super SingleProcessDataStore$readDataOrHandleCorruption$1> cVar) {
        super(cVar);
        this.this$0 = singleProcessDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f5726k;
        return singleProcessDataStore.mo9310h(this);
    }
}
