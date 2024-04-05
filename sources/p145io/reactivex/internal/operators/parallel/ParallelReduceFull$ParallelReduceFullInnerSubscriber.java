package p145io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8335c;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullInnerSubscriber */
final class ParallelReduceFull$ParallelReduceFullInnerSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T> {
    private static final long serialVersionUID = -7954444275102466525L;
    public boolean done;
    public final ParallelReduceFull$ParallelReduceFullMainSubscriber<T> parent;
    public final C8335c<T, T, T> reducer;
    public T value;

    public ParallelReduceFull$ParallelReduceFullInnerSubscriber(ParallelReduceFull$ParallelReduceFullMainSubscriber<T> parallelReduceFull$ParallelReduceFullMainSubscriber, C8335c<T, T, T> cVar) {
        this.parent = parallelReduceFull$ParallelReduceFullMainSubscriber;
        this.reducer = cVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.parent.innerComplete(this.value);
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.parent.innerError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
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
                ((Subscription) get()).cancel();
                onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
