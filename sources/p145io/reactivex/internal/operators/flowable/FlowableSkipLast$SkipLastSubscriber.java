package p145io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSkipLast$SkipLastSubscriber */
final class FlowableSkipLast$SkipLastSubscriber<T> extends ArrayDeque<T> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -3807491841935125653L;
    public final C20024c<? super T> downstream;
    public final int skip;
    public Subscription upstream;

    public FlowableSkipLast$SkipLastSubscriber(C20024c<? super T> cVar, int i) {
        super(i);
        this.downstream = cVar;
        this.skip = i;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (this.skip == size()) {
            this.downstream.onNext(poll());
        } else {
            this.upstream.request(1);
        }
        offer(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.upstream.request(j);
    }
}
