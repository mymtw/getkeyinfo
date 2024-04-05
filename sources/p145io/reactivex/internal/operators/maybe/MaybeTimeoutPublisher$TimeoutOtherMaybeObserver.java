package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver */
final class MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Subscription> implements C8056i<Object> {
    private static final long serialVersionUID = 8663801314800248617L;
    public final MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> parent;

    public MaybeTimeoutPublisher$TimeoutOtherMaybeObserver(MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> maybeTimeoutPublisher$TimeoutMainMaybeObserver) {
        this.parent = maybeTimeoutPublisher$TimeoutMainMaybeObserver;
    }

    public void onComplete() {
        this.parent.otherComplete();
    }

    public void onError(Throwable th) {
        this.parent.otherError(th);
    }

    public void onNext(Object obj) {
        ((Subscription) get()).cancel();
        this.parent.otherComplete();
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
