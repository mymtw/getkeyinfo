package p145io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber */
final class FlowableElementAt$ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements C8056i<T> {
    private static final long serialVersionUID = 4066607327284737757L;
    public long count;
    public final T defaultValue;
    public boolean done;
    public final boolean errorOnFewer;
    public final long index;
    public Subscription upstream;

    public FlowableElementAt$ElementAtSubscriber(C20024c<? super T> cVar, long j, T t, boolean z) {
        super(cVar);
        this.index = j;
        this.defaultValue = t;
        this.errorOnFewer = z;
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            T t = this.defaultValue;
            if (t != null) {
                complete(t);
            } else if (this.errorOnFewer) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            long j = this.count;
            if (j == this.index) {
                this.done = true;
                this.upstream.cancel();
                complete(t);
                return;
            }
            this.count = j + 1;
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
