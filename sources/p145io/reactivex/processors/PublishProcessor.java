package p145io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.PublishProcessor */
public final class PublishProcessor<T> extends C19250a<T> {

    /* renamed from: io.reactivex.processors.PublishProcessor$PublishSubscription */
    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        public final C20024c<? super T> downstream;
        public final PublishProcessor<T> parent;

        public PublishSubscription(C20024c<? super T> cVar, PublishProcessor<T> publishProcessor) {
            this.downstream = cVar;
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        public boolean isFull() {
            return get() == 0;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                C18981a.m32123b(th);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.downstream.onNext(t);
                    C19382n.m32776v0(this, 1);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32705E(this, j);
            }
        }
    }
}
