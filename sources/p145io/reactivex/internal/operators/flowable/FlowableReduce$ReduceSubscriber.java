package p145io.reactivex.internal.operators.flowable;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8335c;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableReduce$ReduceSubscriber */
final class FlowableReduce$ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements C8056i<T> {
    private static final long serialVersionUID = -4663883003264602070L;
    public final C8335c<T, T, T> reducer;
    public Subscription upstream;

    public FlowableReduce$ReduceSubscriber(C20024c<? super T> cVar, C8335c<T, T, T> cVar2) {
        super(cVar);
        this.reducer = cVar2;
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
        this.upstream = SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        Subscription subscription = this.upstream;
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription != subscriptionHelper) {
            this.upstream = subscriptionHelper;
            T t = this.value;
            if (t != null) {
                complete(t);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        Subscription subscription = this.upstream;
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription == subscriptionHelper) {
            C18981a.m32123b(th);
            return;
        }
        this.upstream = subscriptionHelper;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (this.upstream != SubscriptionHelper.CANCELLED) {
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                T apply = this.reducer.apply(t2, t);
                C12965a.m20650b(apply, "The reducer returned a null value");
                this.value = apply;
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
