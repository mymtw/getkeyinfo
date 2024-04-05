package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber */
final class FlowablePublish$InnerSubscriber<T> extends AtomicLong implements Subscription {
    private static final long serialVersionUID = -4453897557930727610L;
    public final C20024c<? super T> child;
    public long emitted;
    public volatile FlowablePublish$PublishSubscriber<T> parent;

    public FlowablePublish$InnerSubscriber(C20024c<? super T> cVar) {
        this.child = cVar;
    }

    public void cancel() {
        FlowablePublish$PublishSubscriber<T> flowablePublish$PublishSubscriber;
        if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE && (flowablePublish$PublishSubscriber = this.parent) != null) {
            flowablePublish$PublishSubscriber.remove(this);
            flowablePublish$PublishSubscriber.dispatch();
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32705E(this, j);
            FlowablePublish$PublishSubscriber<T> flowablePublish$PublishSubscriber = this.parent;
            if (flowablePublish$PublishSubscriber != null) {
                flowablePublish$PublishSubscriber.dispatch();
            }
        }
    }
}
