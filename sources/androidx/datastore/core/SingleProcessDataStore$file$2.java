package androidx.datastore.core;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class SingleProcessDataStore$file$2 extends Lambda implements C19846a<File> {
    public final /* synthetic */ SingleProcessDataStore<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore<Object> singleProcessDataStore) {
        super(0);
        this.this$0 = singleProcessDataStore;
    }

    public final File invoke() {
        File invoke = this.this$0.f5728a.invoke();
        String absolutePath = invoke.getAbsolutePath();
        synchronized (SingleProcessDataStore.f5727l) {
            LinkedHashSet linkedHashSet = SingleProcessDataStore.f5726k;
            if (!linkedHashSet.contains(absolutePath)) {
                C19383o.m32796f(absolutePath, "it");
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + invoke + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return invoke;
    }
}
