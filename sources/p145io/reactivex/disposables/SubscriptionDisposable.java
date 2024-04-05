package p145io.reactivex.disposables;

import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.disposables.SubscriptionDisposable */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(Subscription subscription) {
        super(subscription);
    }

    public void onDisposed(Subscription subscription) {
        subscription.cancel();
    }
}
