package p145io.reactivex.internal.operators.parallel;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p287xp.C8335c;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelReduce$ParallelReduceSubscriber */
final class ParallelReduce$ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
    private static final long serialVersionUID = 8200530050639449080L;
    public R accumulator;
    public boolean done;
    public final C8335c<R, ? super T, R> reducer;

    public ParallelReduce$ParallelReduceSubscriber(C20024c<? super R> cVar, R r, C8335c<R, ? super T, R> cVar2) {
        super(cVar);
        this.accumulator = r;
        this.reducer = cVar2;
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            R r = this.accumulator;
            this.accumulator = null;
            complete(r);
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.accumulator = null;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                R apply = this.reducer.apply(this.accumulator, t);
                C12965a.m20650b(apply, "The reducer returned a null value");
                this.accumulator = apply;
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
