package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishAlt$InnerSubscription */
final class FlowablePublishAlt$InnerSubscription<T> extends AtomicLong implements Subscription {
    private static final long serialVersionUID = 2845000326761540265L;
    public final C20024c<? super T> downstream;
    public long emitted;
    public final FlowablePublishAlt$PublishConnection<T> parent;

    public FlowablePublishAlt$InnerSubscription(C20024c<? super T> cVar, FlowablePublishAlt$PublishConnection<T> flowablePublishAlt$PublishConnection) {
        this.downstream = cVar;
        this.parent = flowablePublishAlt$PublishConnection;
    }

    public void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.parent.remove(this);
            this.parent.drain();
        }
    }

    public boolean isCancelled() {
        return get() == Long.MIN_VALUE;
    }

    public void request(long j) {
        C19382n.m32705E(this, j);
        this.parent.drain();
    }
}
