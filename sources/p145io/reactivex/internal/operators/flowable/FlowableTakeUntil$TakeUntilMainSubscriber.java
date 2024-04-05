package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8056i;
import p514bk.C14088a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber */
final class FlowableTakeUntil$TakeUntilMainSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -4945480365982832967L;
    public final C20024c<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final FlowableTakeUntil$TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntil$TakeUntilMainSubscriber$OtherSubscriber */
    public final class OtherSubscriber extends AtomicReference<Subscription> implements C8056i<Object> {
        private static final long serialVersionUID = -3592821756711087922L;

        public OtherSubscriber() {
        }

        public void onComplete() {
            SubscriptionHelper.cancel(FlowableTakeUntil$TakeUntilMainSubscriber.this.upstream);
            FlowableTakeUntil$TakeUntilMainSubscriber flowableTakeUntil$TakeUntilMainSubscriber = FlowableTakeUntil$TakeUntilMainSubscriber.this;
            C14088a.m21790s(flowableTakeUntil$TakeUntilMainSubscriber.downstream, flowableTakeUntil$TakeUntilMainSubscriber, flowableTakeUntil$TakeUntilMainSubscriber.error);
        }

        public void onError(Throwable th) {
            SubscriptionHelper.cancel(FlowableTakeUntil$TakeUntilMainSubscriber.this.upstream);
            FlowableTakeUntil$TakeUntilMainSubscriber flowableTakeUntil$TakeUntilMainSubscriber = FlowableTakeUntil$TakeUntilMainSubscriber.this;
            C14088a.m21792u(flowableTakeUntil$TakeUntilMainSubscriber.downstream, th, flowableTakeUntil$TakeUntilMainSubscriber, flowableTakeUntil$TakeUntilMainSubscriber.error);
        }

        public void onNext(Object obj) {
            SubscriptionHelper.cancel(this);
            onComplete();
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableTakeUntil$TakeUntilMainSubscriber(C20024c<? super T> cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        SubscriptionHelper.cancel(this.other);
    }

    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        C14088a.m21790s(this.downstream, this, this.error);
    }

    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        C14088a.m21792u(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C14088a.m21794w(this.downstream, t, this, this.error);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
