package p145io.reactivex.internal.operators.flowable;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8334b;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCollect$CollectSubscriber */
final class FlowableCollect$CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements C8056i<T> {
    private static final long serialVersionUID = -3589550218733891694L;
    public final C8334b<? super U, ? super T> collector;
    public boolean done;

    /* renamed from: u */
    public final U f42625u;
    public Subscription upstream;

    public FlowableCollect$CollectSubscriber(C20024c<? super U> cVar, U u, C8334b<? super U, ? super T> bVar) {
        super(cVar);
        this.collector = bVar;
        this.f42625u = u;
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            complete(this.f42625u);
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
            try {
                this.collector.mo20917a();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.upstream.cancel();
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
