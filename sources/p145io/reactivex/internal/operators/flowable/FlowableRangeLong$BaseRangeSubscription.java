package p145io.reactivex.internal.operators.flowable;

import kotlin.jvm.internal.C19382n;
import p145io.reactivex.internal.subscriptions.BasicQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription */
abstract class FlowableRangeLong$BaseRangeSubscription extends BasicQueueSubscription<Long> {
    private static final long serialVersionUID = -2252972430506210021L;
    public volatile boolean cancelled;
    public final long end;
    public long index;

    public FlowableRangeLong$BaseRangeSubscription(long j, long j2) {
        this.index = j;
        this.end = j2;
    }

    public final void cancel() {
        this.cancelled = true;
    }

    public final void clear() {
        this.index = this.end;
    }

    public abstract void fastPath();

    public final boolean isEmpty() {
        return this.index == this.end;
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && C19382n.m32703D(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                fastPath();
            } else {
                slowPath(j);
            }
        }
    }

    public final int requestFusion(int i) {
        return i & 1;
    }

    public abstract void slowPath(long j);

    public final Long poll() {
        long j = this.index;
        if (j == this.end) {
            return null;
        }
        this.index = 1 + j;
        return Long.valueOf(j);
    }
}
