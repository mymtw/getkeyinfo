package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedNoLast */
final class FlowableSampleTimed$SampleTimedNoLast<T> extends FlowableSampleTimed$SampleTimedSubscriber<T> {
    private static final long serialVersionUID = -7139995637533111443L;

    public FlowableSampleTimed$SampleTimedNoLast(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r rVar) {
        super(cVar, j, timeUnit, rVar);
    }

    public void complete() {
        this.downstream.onComplete();
    }

    public void run() {
        emit();
    }
}
