package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber */
final class FlowableGroupJoin$LeftRightEndSubscriber extends AtomicReference<Subscription> implements C8056i<Object>, Disposable {
    private static final long serialVersionUID = 1883890389173668373L;
    public final int index;
    public final boolean isLeft;
    public final C19111g parent;

    public FlowableGroupJoin$LeftRightEndSubscriber(C19111g gVar, boolean z, int i) {
        this.parent = gVar;
        this.isLeft = z;
        this.index = i;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        this.parent.innerClose(this.isLeft, this);
    }

    public void onError(Throwable th) {
        this.parent.innerCloseError(th);
    }

    public void onNext(Object obj) {
        if (SubscriptionHelper.cancel(this)) {
            this.parent.innerClose(this.isLeft, this);
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
