package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.Observer;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainEmitLast */
final class ObservableSampleWithObservable$SampleMainEmitLast<T> extends ObservableSampleWithObservable$SampleMainObserver<T> {
    private static final long serialVersionUID = -3029755663834015785L;
    public volatile boolean done;
    public final AtomicInteger wip = new AtomicInteger();

    public ObservableSampleWithObservable$SampleMainEmitLast(Observer<? super T> observer, C8065q<?> qVar) {
        super(observer, qVar);
    }

    public void completion() {
        this.done = true;
        if (this.wip.getAndIncrement() == 0) {
            emit();
            this.downstream.onComplete();
        }
    }

    public void run() {
        if (this.wip.getAndIncrement() == 0) {
            do {
                boolean z = this.done;
                emit();
                if (z) {
                    this.downstream.onComplete();
                    return;
                }
            } while (this.wip.decrementAndGet() != 0);
        }
    }
}
