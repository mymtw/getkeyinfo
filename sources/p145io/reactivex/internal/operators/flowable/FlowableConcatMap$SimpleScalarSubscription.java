package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$SimpleScalarSubscription */
final class FlowableConcatMap$SimpleScalarSubscription<T> extends AtomicBoolean implements Subscription {
    public final C20024c<? super T> downstream;
    public final T value;

    public FlowableConcatMap$SimpleScalarSubscription(T t, C20024c<? super T> cVar) {
        this.value = t;
        this.downstream = cVar;
    }

    public void cancel() {
    }

    public void request(long j) {
        if (j > 0 && compareAndSet(false, true)) {
            C20024c<? super T> cVar = this.downstream;
            cVar.onNext(this.value);
            cVar.onComplete();
        }
    }
}
