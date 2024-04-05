package p145io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatArray$ConcatArraySubscriber */
final class FlowableConcatArray$ConcatArraySubscriber<T> extends SubscriptionArbiter implements C8056i<T> {
    private static final long serialVersionUID = -8158322871608889516L;
    public final boolean delayError;
    public final C20024c<? super T> downstream;
    public List<Throwable> errors;
    public int index;
    public long produced;
    public final C20023b<? extends T>[] sources;
    public final AtomicInteger wip = new AtomicInteger();

    public FlowableConcatArray$ConcatArraySubscriber(C20023b<? extends T>[] bVarArr, boolean z, C20024c<? super T> cVar) {
        super(false);
        this.downstream = cVar;
        this.sources = bVarArr;
        this.delayError = z;
    }

    public void onComplete() {
        if (this.wip.getAndIncrement() == 0) {
            C20023b<? extends T>[] bVarArr = this.sources;
            int length = bVarArr.length;
            int i = this.index;
            while (i != length) {
                C20023b<? extends T> bVar = bVarArr[i];
                if (bVar == null) {
                    NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                    if (this.delayError) {
                        List list = this.errors;
                        if (list == null) {
                            list = new ArrayList((length - i) + 1);
                            this.errors = list;
                        }
                        list.add(nullPointerException);
                        i++;
                    } else {
                        this.downstream.onError(nullPointerException);
                        return;
                    }
                } else {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        produced(j);
                    }
                    bVar.subscribe(this);
                    i++;
                    this.index = i;
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
            List<Throwable> list2 = this.errors;
            if (list2 == null) {
                this.downstream.onComplete();
            } else if (list2.size() == 1) {
                this.downstream.onError(list2.get(0));
            } else {
                this.downstream.onError(new CompositeException((Iterable<? extends Throwable>) list2));
            }
        }
    }

    public void onError(Throwable th) {
        if (this.delayError) {
            List list = this.errors;
            if (list == null) {
                list = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = list;
            }
            list.add(th);
            onComplete();
            return;
        }
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        setSubscription(subscription);
    }
}
