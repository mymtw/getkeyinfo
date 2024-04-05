package p145io.reactivex.processors;

import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.AsyncProcessor */
public final class AsyncProcessor<T> extends C19250a<T> {

    /* renamed from: io.reactivex.processors.AsyncProcessor$AsyncSubscription */
    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        public final AsyncProcessor<T> parent;

        public AsyncSubscription(C20024c<? super T> cVar, AsyncProcessor<T> asyncProcessor) {
            super(cVar);
        }

        public void cancel() {
            if (super.tryCancel()) {
                throw null;
            }
        }

        public void onComplete() {
            if (!isCancelled()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (isCancelled()) {
                C18981a.m32123b(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
