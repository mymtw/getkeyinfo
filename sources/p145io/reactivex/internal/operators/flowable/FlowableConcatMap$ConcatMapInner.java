package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner */
final class FlowableConcatMap$ConcatMapInner<R> extends SubscriptionArbiter implements C8056i<R> {
    private static final long serialVersionUID = 897683679971470653L;
    public final C19106c<R> parent;
    public long produced;

    public FlowableConcatMap$ConcatMapInner(C19106c<R> cVar) {
        super(false);
        this.parent = cVar;
    }

    public void onComplete() {
        long j = this.produced;
        if (j != 0) {
            this.produced = 0;
            produced(j);
        }
        this.parent.innerComplete();
    }

    public void onError(Throwable th) {
        long j = this.produced;
        if (j != 0) {
            this.produced = 0;
            produced(j);
        }
        this.parent.innerError(th);
    }

    public void onNext(R r) {
        this.produced++;
        this.parent.innerNext(r);
    }

    public void onSubscribe(Subscription subscription) {
        setSubscription(subscription);
    }
}
