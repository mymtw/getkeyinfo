package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8048a;
import p248tp.C8050c;

/* renamed from: io.reactivex.internal.operators.completable.CompletableCache */
public final class CompletableCache extends C8048a implements C8050c {

    /* renamed from: io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache */
    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 8943152917179642732L;
        public final C8050c downstream;
        public final /* synthetic */ CompletableCache this$0;

        public InnerCompletableCache(CompletableCache completableCache, C8050c cVar) {
            this.downstream = cVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }
}
