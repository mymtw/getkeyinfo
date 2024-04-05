package p145io.reactivex.internal.operators.flowable;

import java.util.Collection;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableToList$ToListSubscriber */
final class FlowableToList$ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -8134157938864266736L;
    public Subscription upstream;

    /* JADX WARNING: type inference failed for: r2v0, types: [T, U] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FlowableToList$ToListSubscriber(p762or.C20024c<? super U> r1, U r2) {
        /*
            r0 = this;
            r0.<init>(r1)
            r0.value = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableToList$ToListSubscriber.<init>(or.c, java.util.Collection):void");
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        complete(this.value);
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        Collection collection = (Collection) this.value;
        if (collection != null) {
            collection.add(t);
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }
}
