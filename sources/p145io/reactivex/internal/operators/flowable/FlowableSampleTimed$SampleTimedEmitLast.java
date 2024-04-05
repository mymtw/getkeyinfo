package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedEmitLast */
final class FlowableSampleTimed$SampleTimedEmitLast<T> extends FlowableSampleTimed$SampleTimedSubscriber<T> {
    private static final long serialVersionUID = -7139995637533111443L;
    public final AtomicInteger wip = new AtomicInteger(1);

    public FlowableSampleTimed$SampleTimedEmitLast(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r rVar) {
        super(cVar, j, timeUnit, rVar);
    }

    public void complete() {
        emit();
        if (this.wip.decrementAndGet() == 0) {
            this.downstream.onComplete();
        }
    }

    public void run() {
        if (this.wip.incrementAndGet() == 2) {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }
    }
}
