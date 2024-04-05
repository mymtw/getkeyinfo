package p145io.reactivex.internal.operators.flowable;

import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SampleMainNoLast */
final class FlowableSamplePublisher$SampleMainNoLast<T> extends FlowableSamplePublisher$SamplePublisherSubscriber<T> {
    private static final long serialVersionUID = -3029755663834015785L;

    public FlowableSamplePublisher$SampleMainNoLast(C20024c<? super T> cVar, C20023b<?> bVar) {
        super(cVar, bVar);
    }

    public void completion() {
        this.downstream.onComplete();
    }

    public void run() {
        emit();
    }
}
