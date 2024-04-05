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

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeLastTimed$TakeLastTimedSubscriber */
final class FlowableTakeLastTimed$TakeLastTimedSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -5677354903406201275L;
    public volatile boolean cancelled;
    public final long count;
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

    public FlowableTakeLastTimed$TakeLastTimedSubscriber(C20024c<? super T> cVar, long j, long j2, TimeUnit timeUnit, C8066r rVar, int i, boolean z) {
        this.downstream = cVar;
        this.count = j;
        this.time = j2;
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

    public boolean checkTerminated(boolean z, C20024c<? super T> cVar, boolean z2) {
        if (this.cancelled) {
            this.queue.clear();
            return true;
        } else if (!z2) {
            Throwable th = this.error;
            if (th != null) {
                this.queue.clear();
                cVar.onError(th);
                return true;
            } else if (!z) {
                return false;
            } else {
                cVar.onComplete();
                return true;
            }
        } else if (!z) {
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

    public void drain() {
        if (getAndIncrement() == 0) {
            C20024c<? super T> cVar = this.downstream;
            C19213a<Object> aVar = this.queue;
            boolean z = this.delayError;
            int i = 1;
            do {
                if (this.done) {
                    if (!checkTerminated(aVar.isEmpty(), cVar, z)) {
                        long j = this.requested.get();
                        long j2 = 0;
                        while (true) {
                            if (!checkTerminated(aVar.peek() == null, cVar, z)) {
                                if (j != j2) {
                                    aVar.poll();
                                    cVar.onNext(aVar.poll());
                                    j2++;
                                } else if (j2 != 0) {
                                    C19382n.m32774u0(this.requested, j2);
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    public void onComplete() {
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        trim(C8066r.m16244a(timeUnit), this.queue);
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.delayError) {
            C8066r rVar = this.scheduler;
            TimeUnit timeUnit = this.unit;
            rVar.getClass();
            trim(C8066r.m16244a(timeUnit), this.queue);
        }
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        C19213a<Object> aVar = this.queue;
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        long a = C8066r.m16244a(timeUnit);
        aVar.mo71258a(Long.valueOf(a), t);
        trim(a, aVar);
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

    public void trim(long j, C19213a<Object> aVar) {
        long j2;
        long j3;
        long j4 = this.time;
        long j5 = this.count;
        boolean z = j5 == Long.MAX_VALUE;
        while (!aVar.isEmpty()) {
            if (((Long) aVar.peek()).longValue() >= j - j4) {
                if (!z) {
                    long j6 = aVar.f42961i.get();
                    while (true) {
                        j2 = aVar.f42954b.get();
                        j3 = aVar.f42961i.get();
                        if (j6 == j3) {
                            break;
                        }
                        j6 = j3;
                    }
                    if (((long) (((int) (j2 - j3)) >> 1)) <= j5) {
                        return;
                    }
                } else {
                    return;
                }
            }
            aVar.poll();
            aVar.poll();
        }
    }
}
