package p145io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.MulticastProcessor */
public final class MulticastProcessor<T> extends C19250a<T> {

    /* renamed from: io.reactivex.processors.MulticastProcessor$MulticastSubscription */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        public final C20024c<? super T> downstream;
        public long emitted;
        public final MulticastProcessor<T> parent;

        public MulticastSubscription(C20024c<? super T> cVar, MulticastProcessor<T> multicastProcessor) {
            this.downstream = cVar;
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t);
            }
        }

        public void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        j3 = Long.MAX_VALUE;
                        if (j2 != Long.MAX_VALUE) {
                            long j4 = j2 + j;
                            if (j4 >= 0) {
                                j3 = j4;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                throw null;
            }
        }
    }
}
