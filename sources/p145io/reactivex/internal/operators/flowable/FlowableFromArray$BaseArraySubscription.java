package p145io.reactivex.internal.operators.flowable;

import kotlin.jvm.internal.C19382n;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.BasicQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromArray$BaseArraySubscription */
abstract class FlowableFromArray$BaseArraySubscription<T> extends BasicQueueSubscription<T> {
    private static final long serialVersionUID = -2252972430506210021L;
    public final T[] array;
    public volatile boolean cancelled;
    public int index;

    public FlowableFromArray$BaseArraySubscription(T[] tArr) {
        this.array = tArr;
    }

    public final void cancel() {
        this.cancelled = true;
    }

    public final void clear() {
        this.index = this.array.length;
    }

    public abstract void fastPath();

    public final boolean isEmpty() {
        return this.index == this.array.length;
    }

    public final T poll() {
        int i = this.index;
        T[] tArr = this.array;
        if (i == tArr.length) {
            return null;
        }
        this.index = i + 1;
        T t = tArr[i];
        C12965a.m20650b(t, "array element is null");
        return t;
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
}
