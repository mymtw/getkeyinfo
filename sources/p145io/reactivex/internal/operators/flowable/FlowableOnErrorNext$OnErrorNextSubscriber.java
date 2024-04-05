package p145io.reactivex.internal.operators.flowable;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnErrorNext$OnErrorNextSubscriber */
final class FlowableOnErrorNext$OnErrorNextSubscriber<T> extends SubscriptionArbiter implements C8056i<T> {
    private static final long serialVersionUID = 4063763155303814625L;
    public final boolean allowFatal;
    public boolean done;
    public final C20024c<? super T> downstream;
    public final C8339g<? super Throwable, ? extends C20023b<? extends T>> nextSupplier;
    public boolean once;
    public long produced;

    public FlowableOnErrorNext$OnErrorNextSubscriber(C20024c<? super T> cVar, C8339g<? super Throwable, ? extends C20023b<? extends T>> gVar, boolean z) {
        super(false);
        this.downstream = cVar;
        this.nextSupplier = gVar;
        this.allowFatal = z;
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (!this.once) {
            this.once = true;
            if (!this.allowFatal || (th instanceof Exception)) {
                try {
                    Object apply = this.nextSupplier.apply(th);
                    C12965a.m20650b(apply, "The nextSupplier returned a null Publisher");
                    C20023b bVar = (C20023b) apply;
                    long j = this.produced;
                    if (j != 0) {
                        produced(j);
                    }
                    bVar.subscribe(this);
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    this.downstream.onError(new CompositeException(th, th2));
                }
            } else {
                this.downstream.onError(th);
            }
        } else if (this.done) {
            C18981a.m32123b(th);
        } else {
            this.downstream.onError(th);
        }
    }

    public void onNext(T t) {
        if (!this.done) {
            if (!this.once) {
                this.produced++;
            }
            this.downstream.onNext(t);
        }
    }

    public void onSubscribe(Subscription subscription) {
        setSubscription(subscription);
    }
}
