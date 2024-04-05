package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber */
final class FlowableGroupJoin$LeftRightSubscriber extends AtomicReference<Subscription> implements C8056i<Object>, Disposable {
    private static final long serialVersionUID = 1883890389173668373L;
    public final boolean isLeft;
    public final C19111g parent;

    public FlowableGroupJoin$LeftRightSubscriber(C19111g gVar, boolean z) {
        this.parent = gVar;
        this.isLeft = z;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        this.parent.innerComplete(this);
    }

    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    public void onNext(Object obj) {
        this.parent.innerValue(this.isLeft, obj);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
