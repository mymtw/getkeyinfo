package p145io.reactivex.internal.subscribers;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.subscribers.DeferredScalarSubscriber */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements C8056i<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    public boolean hasValue;
    public Subscription upstream;

    public DeferredScalarSubscriber(C20024c<? super R> cVar) {
        super(cVar);
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public abstract /* synthetic */ void onNext(T t);

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }
}
