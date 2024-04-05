package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$State */
final class FlowableGroupBy$State<T, K> extends BasicIntQueueSubscription<T> implements C20023b<T> {
    private static final long serialVersionUID = -3852313036005250360L;
    public final AtomicReference<C20024c<? super T>> actual = new AtomicReference<>();
    public final AtomicBoolean cancelled = new AtomicBoolean();
    public final boolean delayError;
    public volatile boolean done;
    public Throwable error;
    public final K key;
    public final AtomicBoolean once = new AtomicBoolean();
    public boolean outputFused;
    public final FlowableGroupBy$GroupBySubscriber<?, K, T> parent;
    public int produced;
    public final C19213a<T> queue;
    public final AtomicLong requested = new AtomicLong();

    public FlowableGroupBy$State(int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, K k, boolean z) {
        this.queue = new C19213a<>(i);
        this.parent = flowableGroupBy$GroupBySubscriber;
        this.key = k;
        this.delayError = z;
    }

    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            this.parent.cancel(this.key);
            drain();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, C20024c<? super T> cVar, boolean z3, long j) {
        if (this.cancelled.get()) {
            while (this.queue.poll() != null) {
                j++;
            }
            if (j != 0) {
                this.parent.upstream.request(j);
            }
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

    public void clear() {
        C19213a<T> aVar = this.queue;
        while (aVar.poll() != null) {
            this.produced++;
        }
        tryReplenish();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }
    }

    public void drainFused() {
        Throwable th;
        C19213a<T> aVar = this.queue;
        C20024c cVar = this.actual.get();
        int i = 1;
        while (true) {
            if (cVar != null) {
                if (!this.cancelled.get()) {
                    boolean z = this.done;
                    if (!z || this.delayError || (th = this.error) == null) {
                        cVar.onNext(null);
                        if (z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                cVar.onError(th2);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        }
                    } else {
                        aVar.clear();
                        cVar.onError(th);
                        return;
                    }
                } else {
                    return;
                }
            }
            i = addAndGet(-i);
            if (i != 0) {
                if (cVar == null) {
                    cVar = this.actual.get();
                }
            } else {
                return;
            }
        }
    }

    public void drainNormal() {
        int i;
        C19213a<T> aVar = this.queue;
        boolean z = this.delayError;
        C20024c cVar = this.actual.get();
        int i2 = 1;
        while (true) {
            if (cVar != null) {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.done;
                    T poll = aVar.poll();
                    boolean z3 = poll == null;
                    T t = poll;
                    long j3 = j2;
                    if (!checkTerminated(z2, z3, cVar, z, j2)) {
                        if (z3) {
                            j2 = j3;
                            break;
                        } else {
                            cVar.onNext(t);
                            j2 = j3 + 1;
                        }
                    } else {
                        return;
                    }
                }
                if (i == 0) {
                    long j4 = j2;
                    if (!checkTerminated(this.done, aVar.isEmpty(), cVar, z, j2)) {
                        j2 = j4;
                    } else {
                        return;
                    }
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    this.parent.upstream.request(j2);
                }
            }
            i2 = addAndGet(-i2);
            if (i2 != 0) {
                if (cVar == null) {
                    cVar = this.actual.get();
                }
            } else {
                return;
            }
        }
    }

    public boolean isEmpty() {
        if (!this.queue.isEmpty()) {
            return false;
        }
        tryReplenish();
        return true;
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
        this.queue.offer(t);
        drain();
    }

    public T poll() {
        T poll = this.queue.poll();
        if (poll != null) {
            this.produced++;
            return poll;
        }
        tryReplenish();
        return null;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }

    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    public void subscribe(C20024c<? super T> cVar) {
        if (this.once.compareAndSet(false, true)) {
            cVar.onSubscribe(this);
            this.actual.lazySet(cVar);
            drain();
            return;
        }
        EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), cVar);
    }

    public void tryReplenish() {
        int i = this.produced;
        if (i != 0) {
            this.produced = 0;
            this.parent.upstream.request((long) i);
        }
    }
}
