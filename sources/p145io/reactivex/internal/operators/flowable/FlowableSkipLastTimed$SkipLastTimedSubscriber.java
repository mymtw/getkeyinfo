package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSkipLastTimed$SkipLastTimedSubscriber */
final class FlowableSkipLastTimed$SkipLastTimedSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -5677354903406201275L;
    public volatile boolean cancelled;
    public final boolean delayError;
    public volatile boolean done;
    public final C20024c<? super T> downstream;
    public Throwable error;
    public final C19213a<Object> queue;
    public final AtomicLong requested = new AtomicLong();
    public final C8066r scheduler;
    public final long time;
    public final TimeUnit unit;
    public Subscription upstream;

    public FlowableSkipLastTimed$SkipLastTimedSubscriber(C20024c<? super T> cVar, long j, TimeUnit timeUnit, C8066r rVar, int i, boolean z) {
        this.downstream = cVar;
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = rVar;
        this.queue = new C19213a<>(i);
        this.delayError = z;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, C20024c<? super T> cVar, boolean z3) {
        if (this.cancelled) {
            this.queue.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    cVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cVar.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                Throwable th2 = this.error;
                if (th2 != null) {
                    cVar.onError(th2);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C20024c<? super T> cVar = this.downstream;
            C19213a<Object> aVar = this.queue;
            boolean z = this.delayError;
            TimeUnit timeUnit = this.unit;
            C8066r rVar = this.scheduler;
            long j = this.time;
            int i = 1;
            do {
                long j2 = this.requested.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z2 = this.done;
                    Long l = (Long) aVar.peek();
                    boolean z3 = l == null;
                    rVar.getClass();
                    boolean z4 = (z3 || l.longValue() <= C8066r.m16244a(timeUnit) - j) ? z3 : true;
                    if (!checkTerminated(z2, z4, cVar, z)) {
                        if (z4) {
                            break;
                        }
                        aVar.poll();
                        cVar.onNext(aVar.poll());
                        j3++;
                    } else {
                        return;
                    }
                }
                if (j3 != 0) {
                    C19382n.m32774u0(this.requested, j3);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        this.queue.mo71258a(Long.valueOf(C8066r.m16244a(timeUnit)), t);
        drain();
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
