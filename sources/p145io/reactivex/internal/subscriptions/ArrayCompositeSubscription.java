package p145io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.subscriptions.ArrayCompositeSubscription */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<Subscription> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    public void dispose() {
        Subscription subscription;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                Subscription subscription2 = (Subscription) get(i);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (!(subscription2 == subscriptionHelper || (subscription = (Subscription) getAndSet(i, subscriptionHelper)) == subscriptionHelper || subscription == null)) {
                    subscription.cancel();
                }
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public Subscription replaceResource(int i, Subscription subscription) {
        Subscription subscription2;
        do {
            subscription2 = (Subscription) get(i);
            if (subscription2 == SubscriptionHelper.CANCELLED) {
                if (subscription == null) {
                    return null;
                }
                subscription.cancel();
                return null;
            }
        } while (!compareAndSet(i, subscription2, subscription));
        return subscription2;
    }

    public boolean setResource(int i, Subscription subscription) {
        Subscription subscription2;
        do {
            subscription2 = (Subscription) get(i);
            if (subscription2 == SubscriptionHelper.CANCELLED) {
                if (subscription == null) {
                    return false;
                }
                subscription.cancel();
                return false;
            }
        } while (!compareAndSet(i, subscription2, subscription));
        if (subscription2 == null) {
            return true;
        }
        subscription2.cancel();
        return true;
    }
}
