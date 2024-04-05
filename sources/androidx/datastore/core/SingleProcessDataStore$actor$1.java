package androidx.datastore.core;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SingleProcessDataStore$actor$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ SingleProcessDataStore<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore<Object> singleProcessDataStore) {
        super(1);
        this.this$0 = singleProcessDataStore;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            this.this$0.f5735h.setValue(new C2480g(th));
        }
        Object obj = SingleProcessDataStore.f5727l;
        SingleProcessDataStore<Object> singleProcessDataStore = this.this$0;
        synchronized (obj) {
            SingleProcessDataStore.f5726k.remove(singleProcessDataStore.mo9304c().getAbsolutePath());
            C19394m mVar = C19394m.f43287a;
        }
    }
}
