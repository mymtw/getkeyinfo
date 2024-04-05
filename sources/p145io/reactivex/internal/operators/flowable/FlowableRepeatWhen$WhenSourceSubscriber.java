package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p145io.reactivex.processors.C19250a;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber */
abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements C8056i<T> {
    private static final long serialVersionUID = -5604623027276966720L;
    public final C20024c<? super T> downstream;
    public final C19250a<U> processor;
    private long produced;
    public final Subscription receiver;

    public FlowableRepeatWhen$WhenSourceSubscriber(C20024c<? super T> cVar, C19250a<U> aVar, Subscription subscription) {
        super(false);
        this.downstream = cVar;
        this.processor = aVar;
        this.receiver = subscription;
    }

    public final void again(U u) {
        setSubscription(EmptySubscription.INSTANCE);
        long j = this.produced;
        if (j != 0) {
            this.produced = 0;
            produced(j);
        }
        this.receiver.request(1);
        this.processor.onNext(u);
    }

    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public final void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    public final void onSubscribe(Subscription subscription) {
        setSubscription(subscription);
    }
}
