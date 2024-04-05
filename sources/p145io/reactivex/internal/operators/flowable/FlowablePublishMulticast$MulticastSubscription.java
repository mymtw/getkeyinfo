package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription */
final class FlowablePublishMulticast$MulticastSubscription<T> extends AtomicLong implements Subscription {
    private static final long serialVersionUID = 8664815189257569791L;
    public final C20024c<? super T> downstream;
    public long emitted;
    public final C19113i<T> parent;

    public FlowablePublishMulticast$MulticastSubscription(C20024c<? super T> cVar, C19113i<T> iVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            throw null;
        }
    }

    public boolean isCancelled() {
        return get() == Long.MIN_VALUE;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32705E(this, j);
            throw null;
        }
    }
}
