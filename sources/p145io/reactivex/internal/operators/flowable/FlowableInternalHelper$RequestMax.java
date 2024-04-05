package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax */
public enum FlowableInternalHelper$RequestMax implements Consumer<Subscription> {
    INSTANCE;

    public void accept(Subscription subscription) throws Exception {
        subscription.request(Long.MAX_VALUE);
    }
}
