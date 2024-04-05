package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19771r;
import p753kq.C19861p;

final class SingleProcessDataStore$actor$2 extends Lambda implements C19861p<SingleProcessDataStore.C2467a<Object>, Throwable, C19394m> {
    public static final SingleProcessDataStore$actor$2 INSTANCE = new SingleProcessDataStore$actor$2();

    public SingleProcessDataStore$actor$2() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((SingleProcessDataStore.C2467a<Object>) (SingleProcessDataStore.C2467a) obj, (Throwable) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(SingleProcessDataStore.C2467a<Object> aVar, Throwable th) {
        C19383o.m32797g(aVar, "msg");
        if (aVar instanceof SingleProcessDataStore.C2467a.C2469b) {
            C19771r<T> rVar = ((SingleProcessDataStore.C2467a.C2469b) aVar).f5740b;
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            rVar.mo72565x(th);
        }
    }
}
