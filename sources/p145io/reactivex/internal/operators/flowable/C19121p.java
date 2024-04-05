package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.p */
public final class C19121p<T> implements C8056i<T> {

    /* renamed from: b */
    public final C20024c<? super T> f42689b;

    /* renamed from: c */
    public final SubscriptionArbiter f42690c;

    public C19121p(C20024c<? super T> cVar, SubscriptionArbiter subscriptionArbiter) {
        this.f42689b = cVar;
        this.f42690c = subscriptionArbiter;
    }

    public final void onComplete() {
        this.f42689b.onComplete();
    }

    public final void onError(Throwable th) {
        this.f42689b.onError(th);
    }

    public final void onNext(T t) {
        this.f42689b.onNext(t);
    }

    public final void onSubscribe(Subscription subscription) {
        this.f42690c.setSubscription(subscription);
    }
}
