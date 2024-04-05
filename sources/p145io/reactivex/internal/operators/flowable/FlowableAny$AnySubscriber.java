package p145io.reactivex.internal.operators.flowable;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8340h;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableAny$AnySubscriber */
final class FlowableAny$AnySubscriber<T> extends DeferredScalarSubscription<Boolean> implements C8056i<T> {
    private static final long serialVersionUID = -2311252482644620661L;
    public boolean done;
    public final C8340h<? super T> predicate;
    public Subscription upstream;

    public FlowableAny$AnySubscriber(C20024c<? super Boolean> cVar, C8340h<? super T> hVar) {
        super(cVar);
        this.predicate = hVar;
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            complete(Boolean.FALSE);
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
                if (this.predicate.test(t)) {
                    this.done = true;
                    this.upstream.cancel();
                    complete(Boolean.TRUE);
                }
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
