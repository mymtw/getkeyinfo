package p145io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import kotlin.jvm.internal.C19382n;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.BasicQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription */
abstract class FlowableFromIterable$BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
    private static final long serialVersionUID = -2252972430506210021L;
    public volatile boolean cancelled;

    /* renamed from: it */
    public Iterator<? extends T> f42641it;
    public boolean once;

    public FlowableFromIterable$BaseRangeSubscription(Iterator<? extends T> it) {
        this.f42641it = it;
    }

    public final void cancel() {
        this.cancelled = true;
    }

    public final void clear() {
        this.f42641it = null;
    }

    public abstract void fastPath();

    public final boolean isEmpty() {
        Iterator<? extends T> it = this.f42641it;
        return it == null || !it.hasNext();
    }

    public final T poll() {
        Iterator<? extends T> it = this.f42641it;
        if (it == null) {
            return null;
        }
        if (!this.once) {
            this.once = true;
        } else if (!it.hasNext()) {
            return null;
        }
        T next = this.f42641it.next();
        C12965a.m20650b(next, "Iterator.next() returned a null value");
        return next;
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
