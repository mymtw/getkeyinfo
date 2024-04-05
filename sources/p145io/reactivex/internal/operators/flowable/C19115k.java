package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.k */
public final class C19115k<T> implements C8056i<Object> {

    /* renamed from: b */
    public final FlowableSamplePublisher$SamplePublisherSubscriber<T> f42679b;

    public C19115k(FlowableSamplePublisher$SamplePublisherSubscriber<T> flowableSamplePublisher$SamplePublisherSubscriber) {
        this.f42679b = flowableSamplePublisher$SamplePublisherSubscriber;
    }

    public final void onComplete() {
        this.f42679b.complete();
    }

    public final void onError(Throwable th) {
        this.f42679b.error(th);
    }

    public final void onNext(Object obj) {
        this.f42679b.run();
    }

    public final void onSubscribe(Subscription subscription) {
        this.f42679b.setOther(subscription);
    }
}
