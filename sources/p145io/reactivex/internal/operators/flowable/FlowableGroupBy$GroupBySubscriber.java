package p145io.reactivex.internal.operators.flowable;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p278wp.C8276a;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber */
public final class FlowableGroupBy$GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<C8276a<K, V>> implements C8056i<T> {
    public static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    public final int bufferSize;
    public final AtomicBoolean cancelled = new AtomicBoolean();
    public final boolean delayError;
    public boolean done;
    public final C20024c<? super C8276a<K, V>> downstream;
    public Throwable error;
    public final Queue<C19110f<K, V>> evictedGroups;
    public volatile boolean finished;
    public final AtomicInteger groupCount = new AtomicInteger(1);
    public final Map<Object, C19110f<K, V>> groups;
    public final C8339g<? super T, ? extends K> keySelector;
    public boolean outputFused;
    public final C19213a<C8276a<K, V>> queue;
    public final AtomicLong requested = new AtomicLong();
    public Subscription upstream;
    public final C8339g<? super T, ? extends V> valueSelector;

    public FlowableGroupBy$GroupBySubscriber(C20024c<? super C8276a<K, V>> cVar, C8339g<? super T, ? extends K> gVar, C8339g<? super T, ? extends V> gVar2, int i, boolean z, Map<Object, C19110f<K, V>> map, Queue<C19110f<K, V>> queue2) {
        this.downstream = cVar;
        this.keySelector = gVar;
        this.valueSelector = gVar2;
        this.bufferSize = i;
        this.delayError = z;
        this.groups = map;
        this.evictedGroups = queue2;
        this.queue = new C19213a<>(i);
    }

    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            mo70701d();
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, C20024c<?> cVar, C19213a<?> aVar) {
        if (this.cancelled.get()) {
            aVar.clear();
            return true;
        } else if (this.delayError) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th2 = this.error;
            if (th2 != null) {
                aVar.clear();
                cVar.onError(th2);
                return true;
            } else if (!z2) {
                return false;
            } else {
                cVar.onComplete();
                return true;
            }
        }
    }

    public void clear() {
        this.queue.clear();
    }

    /* renamed from: d */
    public final void mo70701d() {
        if (this.evictedGroups != null) {
            int i = 0;
            while (true) {
                C19110f poll = this.evictedGroups.poll();
                if (poll == null) {
                    break;
                }
                poll.f42677d.onComplete();
                i++;
            }
            if (i != 0) {
                this.groupCount.addAndGet(-i);
            }
        }
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
        C19213a<C8276a<K, V>> aVar = this.queue;
        C20024c<? super C8276a<K, V>> cVar = this.downstream;
        int i = 1;
        while (!this.cancelled.get()) {
            boolean z = this.finished;
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
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                aVar.clear();
                cVar.onError(th);
                return;
            }
        }
    }

    public void drainNormal() {
        int i;
        C19213a<C8276a<K, V>> aVar = this.queue;
        C20024c<? super C8276a<K, V>> cVar = this.downstream;
        int i2 = 1;
        do {
            long j = this.requested.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (i == 0) {
                    break;
                }
                boolean z = this.finished;
                C8276a poll = aVar.poll();
                boolean z2 = poll == null;
                if (!checkTerminated(z, z2, cVar, aVar)) {
                    if (z2) {
                        break;
                    }
                    cVar.onNext(poll);
                    j2++;
                } else {
                    return;
                }
            }
            if (i != 0 || !checkTerminated(this.finished, aVar.isEmpty(), cVar, aVar)) {
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    this.upstream.request(j2);
                }
                i2 = addAndGet(-i2);
            } else {
                return;
            }
        } while (i2 != 0);
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public void onComplete() {
        if (!this.done) {
            for (C19110f<K, V> fVar : this.groups.values()) {
                fVar.f42677d.onComplete();
            }
            this.groups.clear();
            Queue<C19110f<K, V>> queue2 = this.evictedGroups;
            if (queue2 != null) {
                queue2.clear();
            }
            this.done = true;
            this.finished = true;
            drain();
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        for (C19110f<K, V> fVar : this.groups.values()) {
            fVar.f42677d.onError(th);
        }
        this.groups.clear();
        Queue<C19110f<K, V>> queue2 = this.evictedGroups;
        if (queue2 != null) {
            queue2.clear();
        }
        this.error = th;
        this.finished = true;
        drain();
    }

    public void onNext(T t) {
        if (!this.done) {
            C19213a<C8276a<K, V>> aVar = this.queue;
            try {
                Object apply = this.keySelector.apply(t);
                boolean z = false;
                Object obj = apply != null ? apply : NULL_KEY;
                C19110f fVar = this.groups.get(obj);
                if (fVar == null) {
                    if (!this.cancelled.get()) {
                        int i = this.bufferSize;
                        boolean z2 = this.delayError;
                        int i2 = C19110f.f42676e;
                        fVar = new C19110f(apply, new FlowableGroupBy$State(i, this, apply, z2));
                        this.groups.put(obj, fVar);
                        this.groupCount.getAndIncrement();
                        z = true;
                    } else {
                        return;
                    }
                }
                try {
                    Object apply2 = this.valueSelector.apply(t);
                    C12965a.m20650b(apply2, "The valueSelector returned null");
                    fVar.f42677d.onNext(apply2);
                    mo70701d();
                    if (z) {
                        aVar.offer(fVar);
                        drain();
                    }
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.upstream.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request((long) this.bufferSize);
        }
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

    public C8276a<K, V> poll() {
        return this.queue.poll();
    }

    public void cancel(K k) {
        if (k == null) {
            k = NULL_KEY;
        }
        this.groups.remove(k);
        if (this.groupCount.decrementAndGet() == 0) {
            this.upstream.cancel();
            if (!this.outputFused && getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }
}
