package p145io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionArbiter */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2189523197179400958L;
    public Subscription actual;
    public final boolean cancelOnReplace;
    public volatile boolean cancelled;
    public final AtomicLong missedProduced = new AtomicLong();
    public final AtomicLong missedRequested = new AtomicLong();
    public final AtomicReference<Subscription> missedSubscription = new AtomicReference<>();
    public long requested;
    public boolean unbounded;

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drainLoop() {
        int i = 1;
        Subscription subscription = null;
        long j = 0;
        do {
            Subscription subscription2 = this.missedSubscription.get();
            if (subscription2 != null) {
                subscription2 = this.missedSubscription.getAndSet((Object) null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            Subscription subscription3 = this.actual;
            if (this.cancelled) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.actual = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C19382n.m32707F(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            SubscriptionHelper.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (subscription2 != null) {
                    if (subscription3 != null && this.cancelOnReplace) {
                        subscription3.cancel();
                    }
                    this.actual = subscription2;
                    if (j4 != 0) {
                        j = C19382n.m32707F(j, j4);
                        subscription = subscription2;
                    }
                } else if (!(subscription3 == null || j2 == 0)) {
                    j = C19382n.m32707F(j, j2);
                    subscription = subscription3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            subscription.request(j);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C19382n.m32703D(this.missedProduced, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    SubscriptionHelper.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() != 0) {
                drainLoop();
            }
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C19382n.m32703D(this.missedRequested, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long F = C19382n.m32707F(j2, j);
                this.requested = F;
                if (F == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            Subscription subscription = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (subscription != null) {
                subscription.request(j);
            }
        }
    }

    public final void setSubscription(Subscription subscription) {
        if (this.cancelled) {
            subscription.cancel();
        } else if (subscription == null) {
            throw new NullPointerException("s is null");
        } else if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription andSet = this.missedSubscription.getAndSet(subscription);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
        } else {
            Subscription subscription2 = this.actual;
            if (subscription2 != null && this.cancelOnReplace) {
                subscription2.cancel();
            }
            this.actual = subscription;
            long j = this.requested;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (j != 0) {
                subscription.request(j);
            }
        }
    }
}
