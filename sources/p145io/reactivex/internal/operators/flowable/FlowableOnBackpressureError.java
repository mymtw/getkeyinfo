package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureError */
public final class FlowableOnBackpressureError<T> extends C19104a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureError$BackpressureErrorSubscriber */
    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription {
        private static final long serialVersionUID = -3176480756392482682L;
        public boolean done;
        public final C20024c<? super T> downstream;
        public Subscription upstream;

        public BackpressureErrorSubscriber(C20024c<? super T> cVar) {
            this.downstream = cVar;
        }

        public void cancel() {
            this.upstream.cancel();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    C19382n.m32774u0(this, 1);
                    return;
                }
                this.upstream.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this, j);
            }
        }
    }

    public FlowableOnBackpressureError(C19108e eVar) {
        super(eVar);
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42671c.mo20619c(new BackpressureErrorSubscriber(cVar));
    }
}
