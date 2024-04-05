package p145io.reactivex.internal.operators.parallel;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p287xp.C8334b;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelCollect$ParallelCollectSubscriber */
final class ParallelCollect$ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
    private static final long serialVersionUID = -4767392946044436228L;
    public C collection;
    public final C8334b<? super C, ? super T> collector;
    public boolean done;

    public ParallelCollect$ParallelCollectSubscriber(C20024c<? super C> cVar, C c, C8334b<? super C, ? super T> bVar) {
        super(cVar);
        this.collection = c;
        this.collector = bVar;
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            C c = this.collection;
            this.collection = null;
            complete(c);
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.collection = null;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                this.collector.mo20917a();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                cancel();
                onError(th);
            }
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
