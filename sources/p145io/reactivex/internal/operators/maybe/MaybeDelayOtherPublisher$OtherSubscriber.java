package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber */
final class MaybeDelayOtherPublisher$OtherSubscriber<T> extends AtomicReference<Subscription> implements C8056i<Object> {
    private static final long serialVersionUID = -1215060610805418006L;
    public final C8058k<? super T> downstream;
    public Throwable error;
    public T value;

    public MaybeDelayOtherPublisher$OtherSubscriber(C8058k<? super T> kVar) {
        this.downstream = kVar;
    }

    public void onComplete() {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            this.downstream.onSuccess(t);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        Throwable th2 = this.error;
        if (th2 == null) {
            this.downstream.onError(th);
            return;
        }
        this.downstream.onError(new CompositeException(th2, th));
    }

    public void onNext(Object obj) {
        Subscription subscription = (Subscription) get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription != subscriptionHelper) {
            lazySet(subscriptionHelper);
            subscription.cancel();
            onComplete();
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
