package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p287xp.C8335c;
import p503zp.C13965a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWithLatestFrom$WithLatestFromSubscriber */
final class FlowableWithLatestFrom$WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements C13965a<T>, Subscription {
    private static final long serialVersionUID = -312246233408980075L;
    public final C8335c<? super T, ? super U, ? extends R> combiner;
    public final C20024c<? super R> downstream;
    public final AtomicReference<Subscription> other = new AtomicReference<>();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public FlowableWithLatestFrom$WithLatestFromSubscriber(C20024c<? super R> cVar, C8335c<? super T, ? super U, ? extends R> cVar2) {
        this.downstream = cVar;
        this.combiner = cVar2;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        SubscriptionHelper.cancel(this.other);
    }

    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!tryOnNext(t)) {
            this.upstream.get().request(1);
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void otherError(Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        this.downstream.onError(th);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public boolean setOther(Subscription subscription) {
        return SubscriptionHelper.setOnce(this.other, subscription);
    }

    public boolean tryOnNext(T t) {
        Object obj = get();
        if (obj == null) {
            return false;
        }
        try {
            Object apply = this.combiner.apply(t, obj);
            C12965a.m20650b(apply, "The combiner returned a null value");
            this.downstream.onNext(apply);
            return true;
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            cancel();
            this.downstream.onError(th);
            return false;
        }
    }
}
