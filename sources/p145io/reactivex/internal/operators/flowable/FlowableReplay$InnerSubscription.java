package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription */
final class FlowableReplay$InnerSubscription<T> extends AtomicLong implements Subscription, Disposable {
    public static final long CANCELLED = Long.MIN_VALUE;
    private static final long serialVersionUID = -4453897557930727610L;
    public final C20024c<? super T> child;
    public boolean emitting;
    public Object index;
    public boolean missed;
    public final FlowableReplay$ReplaySubscriber<T> parent;
    public final AtomicLong totalRequested = new AtomicLong();

    public FlowableReplay$InnerSubscription(FlowableReplay$ReplaySubscriber<T> flowableReplay$ReplaySubscriber, C20024c<? super T> cVar) {
        this.parent = flowableReplay$ReplaySubscriber;
        this.child = cVar;
    }

    public void cancel() {
        dispose();
    }

    public void dispose() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.parent.remove(this);
            this.parent.manageRequests();
            this.index = null;
        }
    }

    public <U> U index() {
        return this.index;
    }

    public boolean isDisposed() {
        return get() == Long.MIN_VALUE;
    }

    public long produced(long j) {
        return C19382n.m32776v0(this, j);
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j) && C19382n.m32705E(this, j) != Long.MIN_VALUE) {
            C19382n.m32703D(this.totalRequested, j);
            this.parent.manageRequests();
            this.parent.buffer.replay(this);
        }
    }
}
