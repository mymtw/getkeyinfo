package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p287xp.C8339g;
import p503zp.C13965a;
import p514bk.C14088a;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber */
final class FlowableWithLatestFromMany$WithLatestFromSubscriber<T, R> extends AtomicInteger implements C13965a<T>, Subscription {
    private static final long serialVersionUID = 1577321883966341961L;
    public final C8339g<? super Object[], R> combiner;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public final AtomicThrowable error;
    public final AtomicLong requested;
    public final FlowableWithLatestFromMany$WithLatestInnerSubscriber[] subscribers;
    public final AtomicReference<Subscription> upstream;
    public final AtomicReferenceArray<Object> values;

    public FlowableWithLatestFromMany$WithLatestFromSubscriber(C20024c<? super R> cVar, C8339g<? super Object[], R> gVar, int i) {
        this.downstream = cVar;
        this.combiner = gVar;
        FlowableWithLatestFromMany$WithLatestInnerSubscriber[] flowableWithLatestFromMany$WithLatestInnerSubscriberArr = new FlowableWithLatestFromMany$WithLatestInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            flowableWithLatestFromMany$WithLatestInnerSubscriberArr[i2] = new FlowableWithLatestFromMany$WithLatestInnerSubscriber(this, i2);
        }
        this.subscribers = flowableWithLatestFromMany$WithLatestInnerSubscriberArr;
        this.values = new AtomicReferenceArray<>(i);
        this.upstream = new AtomicReference<>();
        this.requested = new AtomicLong();
        this.error = new AtomicThrowable();
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        for (FlowableWithLatestFromMany$WithLatestInnerSubscriber dispose : this.subscribers) {
            dispose.dispose();
        }
    }

    public void cancelAllBut(int i) {
        FlowableWithLatestFromMany$WithLatestInnerSubscriber[] flowableWithLatestFromMany$WithLatestInnerSubscriberArr = this.subscribers;
        for (int i2 = 0; i2 < flowableWithLatestFromMany$WithLatestInnerSubscriberArr.length; i2++) {
            if (i2 != i) {
                flowableWithLatestFromMany$WithLatestInnerSubscriberArr[i2].dispose();
            }
        }
    }

    public void innerComplete(int i, boolean z) {
        if (!z) {
            this.done = true;
            SubscriptionHelper.cancel(this.upstream);
            cancelAllBut(i);
            C14088a.m21790s(this.downstream, this, this.error);
        }
    }

    public void innerError(int i, Throwable th) {
        this.done = true;
        SubscriptionHelper.cancel(this.upstream);
        cancelAllBut(i);
        C14088a.m21792u(this.downstream, th, this, this.error);
    }

    public void innerNext(int i, Object obj) {
        this.values.set(i, obj);
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            cancelAllBut(-1);
            C14088a.m21790s(this.downstream, this, this.error);
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        C14088a.m21792u(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        if (!tryOnNext(t) && !this.done) {
            this.upstream.get().request(1);
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public void subscribe(C20023b<?>[] bVarArr, int i) {
        FlowableWithLatestFromMany$WithLatestInnerSubscriber[] flowableWithLatestFromMany$WithLatestInnerSubscriberArr = this.subscribers;
        AtomicReference<Subscription> atomicReference = this.upstream;
        for (int i2 = 0; i2 < i && atomicReference.get() != SubscriptionHelper.CANCELLED; i2++) {
            bVarArr[i2].subscribe(flowableWithLatestFromMany$WithLatestInnerSubscriberArr[i2]);
        }
    }

    public boolean tryOnNext(T t) {
        if (this.done) {
            return false;
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.values;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[(length + 1)];
        objArr[0] = t;
        int i = 0;
        while (i < length) {
            Object obj = atomicReferenceArray.get(i);
            if (obj == null) {
                return false;
            }
            i++;
            objArr[i] = obj;
        }
        try {
            R apply = this.combiner.apply(objArr);
            C12965a.m20650b(apply, "The combiner returned a null value");
            C14088a.m21794w(this.downstream, apply, this, this.error);
            return true;
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            cancel();
            onError(th);
            return false;
        }
    }
}
