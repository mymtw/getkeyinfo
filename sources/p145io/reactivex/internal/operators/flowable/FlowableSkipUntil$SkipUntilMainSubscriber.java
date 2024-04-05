package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8056i;
import p503zp.C13965a;
import p514bk.C14088a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber */
final class FlowableSkipUntil$SkipUntilMainSubscriber<T> extends AtomicInteger implements C13965a<T>, Subscription {
    private static final long serialVersionUID = -6270983465606289181L;
    public final C20024c<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public volatile boolean gate;
    public final FlowableSkipUntil$SkipUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSkipUntil$SkipUntilMainSubscriber$OtherSubscriber */
    public final class OtherSubscriber extends AtomicReference<Subscription> implements C8056i<Object> {
        private static final long serialVersionUID = -5592042965931999169L;

        public OtherSubscriber() {
        }

        public void onComplete() {
            FlowableSkipUntil$SkipUntilMainSubscriber.this.gate = true;
        }

        public void onError(Throwable th) {
            SubscriptionHelper.cancel(FlowableSkipUntil$SkipUntilMainSubscriber.this.upstream);
            FlowableSkipUntil$SkipUntilMainSubscriber flowableSkipUntil$SkipUntilMainSubscriber = FlowableSkipUntil$SkipUntilMainSubscriber.this;
            C14088a.m21792u(flowableSkipUntil$SkipUntilMainSubscriber.downstream, th, flowableSkipUntil$SkipUntilMainSubscriber, flowableSkipUntil$SkipUntilMainSubscriber.error);
        }

        public void onNext(Object obj) {
            FlowableSkipUntil$SkipUntilMainSubscriber.this.gate = true;
            ((Subscription) get()).cancel();
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableSkipUntil$SkipUntilMainSubscriber(C20024c<? super T> cVar) {
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
        if (!tryOnNext(t)) {
            this.upstream.get().request(1);
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public boolean tryOnNext(T t) {
        if (!this.gate) {
            return false;
        }
        C14088a.m21794w(this.downstream, t, this, this.error);
        return true;
    }
}
