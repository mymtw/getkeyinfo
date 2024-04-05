package p145io.reactivex.internal.operators.parallel;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinInnerSubscriber */
final class ParallelSortedJoin$SortedJoinInnerSubscriber<T> extends AtomicReference<Subscription> implements C8056i<List<T>> {
    private static final long serialVersionUID = 6751017204873808094L;
    public final int index;
    public final ParallelSortedJoin$SortedJoinSubscription<T> parent;

    public ParallelSortedJoin$SortedJoinInnerSubscriber(ParallelSortedJoin$SortedJoinSubscription<T> parallelSortedJoin$SortedJoinSubscription, int i) {
        this.parent = parallelSortedJoin$SortedJoinSubscription;
        this.index = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }

    public void onNext(List<T> list) {
        this.parent.innerNext(list, this.index);
    }
}
