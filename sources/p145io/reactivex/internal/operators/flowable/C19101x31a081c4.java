package p145io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.BackpressureOverflowStrategy;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8333a;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber */
final class C19101x31a081c4<T> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 3240706908776709697L;
    public final long bufferSize;
    public volatile boolean cancelled;
    public final Deque<T> deque = new ArrayDeque();
    public volatile boolean done;
    public final C20024c<? super T> downstream;
    public Throwable error;
    public final C8333a onOverflow;
    public final AtomicLong requested = new AtomicLong();
    public final BackpressureOverflowStrategy strategy;
    public Subscription upstream;

    public C19101x31a081c4(C20024c<? super T> cVar, C8333a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
        this.downstream = cVar;
        this.onOverflow = aVar;
        this.strategy = backpressureOverflowStrategy;
        this.bufferSize = j;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            clear(this.deque);
        }
    }

    public void clear(Deque<T> deque2) {
        synchronized (deque2) {
            deque2.clear();
        }
    }

    public void drain() {
        int i;
        boolean isEmpty;
        T poll;
        if (getAndIncrement() == 0) {
            Deque<T> deque2 = this.deque;
            C20024c<? super T> cVar = this.downstream;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (this.cancelled) {
                        clear(deque2);
                        return;
                    } else {
                        boolean z = this.done;
                        synchronized (deque2) {
                            poll = deque2.poll();
                        }
                        boolean z2 = poll == null;
                        if (z) {
                            Throwable th = this.error;
                            if (th != null) {
                                clear(deque2);
                                cVar.onError(th);
                                return;
                            } else if (z2) {
                                cVar.onComplete();
                                return;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        cVar.onNext(poll);
                        j2++;
                    }
                }
                if (i == 0) {
                    if (this.cancelled) {
                        clear(deque2);
                        return;
                    }
                    boolean z3 = this.done;
                    synchronized (deque2) {
                        isEmpty = deque2.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            clear(deque2);
                            cVar.onError(th2);
                            return;
                        } else if (isEmpty) {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C19382n.m32774u0(this.requested, j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        boolean z;
        boolean z2;
        if (!this.done) {
            Deque<T> deque2 = this.deque;
            synchronized (deque2) {
                z = false;
                z2 = true;
                if (((long) deque2.size()) == this.bufferSize) {
                    int i = C19112h.f42678a[this.strategy.ordinal()];
                    if (i == 1) {
                        deque2.pollLast();
                        deque2.offer(t);
                    } else if (i == 2) {
                        deque2.poll();
                        deque2.offer(t);
                    }
                    z2 = false;
                    z = true;
                } else {
                    deque2.offer(t);
                    z2 = false;
                }
            }
            if (z) {
                C8333a aVar = this.onOverflow;
                if (aVar != null) {
                    try {
                        aVar.run();
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.upstream.cancel();
                        onError(th);
                    }
                }
            } else if (z2) {
                this.upstream.cancel();
                onError(new MissingBackpressureException());
            } else {
                drain();
            }
        }
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
