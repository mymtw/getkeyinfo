package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$MainSubscriber */
final class FlowableDelaySubscriptionOther$MainSubscriber<T> extends AtomicLong implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 2259811067697317255L;
    public final C20024c<? super T> downstream;
    public final C20023b<? extends T> main;
    public final FlowableDelaySubscriptionOther$MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$MainSubscriber$OtherSubscriber */
    public final class OtherSubscriber extends AtomicReference<Subscription> implements C8056i<Object> {
        private static final long serialVersionUID = -3892798459447644106L;

        public OtherSubscriber() {
        }

        public void onComplete() {
            if (((Subscription) get()) != SubscriptionHelper.CANCELLED) {
                FlowableDelaySubscriptionOther$MainSubscriber.this.next();
            }
        }

        public void onError(Throwable th) {
            if (((Subscription) get()) != SubscriptionHelper.CANCELLED) {
                FlowableDelaySubscriptionOther$MainSubscriber.this.downstream.onError(th);
            } else {
                C18981a.m32123b(th);
            }
        }

        public void onNext(Object obj) {
            Subscription subscription = (Subscription) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                FlowableDelaySubscriptionOther$MainSubscriber.this.next();
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableDelaySubscriptionOther$MainSubscriber(C20024c<? super T> cVar, C20023b<? extends T> bVar) {
        this.downstream = cVar;
        this.main = bVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.other);
        SubscriptionHelper.cancel(this.upstream);
    }

    public void next() {
        this.main.subscribe(this);
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this, subscription);
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            SubscriptionHelper.deferredRequest(this.upstream, this, j);
        }
    }
}
