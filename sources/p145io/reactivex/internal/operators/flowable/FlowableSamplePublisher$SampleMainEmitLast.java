package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SampleMainEmitLast */
final class FlowableSamplePublisher$SampleMainEmitLast<T> extends FlowableSamplePublisher$SamplePublisherSubscriber<T> {
    private static final long serialVersionUID = -3029755663834015785L;
    public volatile boolean done;
    public final AtomicInteger wip = new AtomicInteger();

    public FlowableSamplePublisher$SampleMainEmitLast(C20024c<? super T> cVar, C20023b<?> bVar) {
        super(cVar, bVar);
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
