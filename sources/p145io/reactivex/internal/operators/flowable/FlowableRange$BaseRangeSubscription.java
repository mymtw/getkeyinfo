package p145io.reactivex.internal.operators.flowable;

import kotlin.jvm.internal.C19382n;
import p145io.reactivex.internal.subscriptions.BasicQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRange$BaseRangeSubscription */
abstract class FlowableRange$BaseRangeSubscription extends BasicQueueSubscription<Integer> {
    private static final long serialVersionUID = -2252972430506210021L;
    public volatile boolean cancelled;
    public final int end;
    public int index;

    public FlowableRange$BaseRangeSubscription(int i, int i2) {
        this.index = i;
        this.end = i2;
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

    public final Integer poll() {
        int i = this.index;
        if (i == this.end) {
            return null;
        }
        this.index = i + 1;
        return Integer.valueOf(i);
    }
}
