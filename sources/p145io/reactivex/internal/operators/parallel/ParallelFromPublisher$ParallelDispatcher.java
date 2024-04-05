package p145io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher */
final class ParallelFromPublisher$ParallelDispatcher<T> extends AtomicInteger implements C8056i<T> {
    private static final long serialVersionUID = -4470634016609963609L;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final long[] emissions;
    public Throwable error;
    public int index;
    public final int limit;
    public final int prefetch;
    public int produced;
    public C13973i<T> queue;
    public final AtomicLongArray requests;
    public int sourceMode;
    public final AtomicInteger subscriberCount = new AtomicInteger();
    public final C20024c<? super T>[] subscribers;
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher$a */
    public final class C19192a implements Subscription {

        /* renamed from: b */
        public final int f42888b;

        /* renamed from: c */
        public final int f42889c;

        public C19192a(int i, int i2) {
            this.f42888b = i;
            this.f42889c = i2;
        }

        public final void cancel() {
            if (ParallelFromPublisher$ParallelDispatcher.this.requests.compareAndSet(this.f42888b + this.f42889c, 0, 1)) {
                ParallelFromPublisher$ParallelDispatcher parallelFromPublisher$ParallelDispatcher = ParallelFromPublisher$ParallelDispatcher.this;
                int i = this.f42889c;
                parallelFromPublisher$ParallelDispatcher.cancel(i + i);
            }
        }

        public final void request(long j) {
            long j2;
            if (SubscriptionHelper.validate(j)) {
                AtomicLongArray atomicLongArray = ParallelFromPublisher$ParallelDispatcher.this.requests;
                do {
                    j2 = atomicLongArray.get(this.f42888b);
                    if (j2 != Long.MAX_VALUE) {
                    } else {
                        return;
                    }
                } while (!atomicLongArray.compareAndSet(this.f42888b, j2, C19382n.m32707F(j2, j)));
                if (ParallelFromPublisher$ParallelDispatcher.this.subscriberCount.get() == this.f42889c) {
                    ParallelFromPublisher$ParallelDispatcher.this.drain();
                }
            }
        }
    }

    public ParallelFromPublisher$ParallelDispatcher(C20024c<? super T>[] cVarArr, int i) {
        this.subscribers = cVarArr;
        this.prefetch = i;
        this.limit = i - (i >> 2);
        int length = cVarArr.length;
        int i2 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.requests = atomicLongArray;
        atomicLongArray.lazySet(i2, (long) length);
        this.emissions = new long[length];
    }

    public void cancel(int i) {
        if (this.requests.decrementAndGet(i) == 0) {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }
    }

    public void drainAsync() {
        Throwable th;
        C13973i<T> iVar = this.queue;
        C20024c<? super T>[] cVarArr = this.subscribers;
        AtomicLongArray atomicLongArray = this.requests;
        long[] jArr = this.emissions;
        int length = jArr.length;
        int i = this.index;
        int i2 = this.produced;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            int i5 = 0;
            while (!this.cancelled) {
                boolean z = this.done;
                if (!z || (th = this.error) == null) {
                    boolean isEmpty = iVar.isEmpty();
                    if (!z || !isEmpty) {
                        if (!isEmpty) {
                            long j = atomicLongArray.get(i);
                            long j2 = jArr[i];
                            if (j == j2 || atomicLongArray.get(length + i) != 0) {
                                i5++;
                            } else {
                                try {
                                    T poll = iVar.poll();
                                    if (poll != null) {
                                        cVarArr[i].onNext(poll);
                                        jArr[i] = j2 + 1;
                                        i2++;
                                        if (i2 == this.limit) {
                                            this.upstream.request((long) i2);
                                            i2 = 0;
                                        }
                                        i5 = 0;
                                    }
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    C19421p.m32940h0(th3);
                                    this.upstream.cancel();
                                    int length2 = cVarArr.length;
                                    while (i4 < length2) {
                                        cVarArr[i4].onError(th3);
                                        i4++;
                                    }
                                    return;
                                }
                            }
                            i++;
                            if (i == length) {
                                i = 0;
                                continue;
                            }
                            if (i5 == length) {
                            }
                        }
                        int i6 = get();
                        if (i6 == i3) {
                            this.index = i;
                            this.produced = i2;
                            i3 = addAndGet(-i3);
                            if (i3 == 0) {
                                return;
                            }
                        } else {
                            i3 = i6;
                        }
                    } else {
                        int length3 = cVarArr.length;
                        while (i4 < length3) {
                            cVarArr[i4].onComplete();
                            i4++;
                        }
                        return;
                    }
                } else {
                    iVar.clear();
                    int length4 = cVarArr.length;
                    while (i4 < length4) {
                        cVarArr[i4].onError(th);
                        i4++;
                    }
                    return;
                }
            }
            iVar.clear();
            return;
        }
    }

    public void drainSync() {
        C13973i<T> iVar = this.queue;
        C20024c<? super T>[] cVarArr = this.subscribers;
        AtomicLongArray atomicLongArray = this.requests;
        long[] jArr = this.emissions;
        int length = jArr.length;
        int i = this.index;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            int i4 = 0;
            while (!this.cancelled) {
                if (iVar.isEmpty()) {
                    int length2 = cVarArr.length;
                    while (i3 < length2) {
                        cVarArr[i3].onComplete();
                        i3++;
                    }
                    return;
                }
                long j = atomicLongArray.get(i);
                long j2 = jArr[i];
                if (j == j2 || atomicLongArray.get(length + i) != 0) {
                    i4++;
                } else {
                    try {
                        T poll = iVar.poll();
                        if (poll == null) {
                            int length3 = cVarArr.length;
                            while (i3 < length3) {
                                cVarArr[i3].onComplete();
                                i3++;
                            }
                            return;
                        }
                        cVarArr[i].onNext(poll);
                        jArr[i] = j2 + 1;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        C19421p.m32940h0(th2);
                        this.upstream.cancel();
                        int length4 = cVarArr.length;
                        while (i3 < length4) {
                            cVarArr[i3].onError(th2);
                            i3++;
                        }
                        return;
                    }
                }
                i++;
                if (i == length) {
                    i = 0;
                    continue;
                }
                if (i4 == length) {
                    int i5 = get();
                    if (i5 == i2) {
                        this.index = i;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i5;
                    }
                }
            }
            iVar.clear();
            return;
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
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            drain();
            return;
        }
        this.upstream.cancel();
        onError(new MissingBackpressureException("Queue is full?"));
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    setupSubscribers();
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    setupSubscribers();
                    subscription.request((long) this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            setupSubscribers();
            subscription.request((long) this.prefetch);
        }
    }

    public void setupSubscribers() {
        C20024c<? super T>[] cVarArr = this.subscribers;
        int length = cVarArr.length;
        int i = 0;
        while (i < length && !this.cancelled) {
            int i2 = i + 1;
            this.subscriberCount.lazySet(i2);
            cVarArr[i].onSubscribe(new C19192a(i, length));
            i = i2;
        }
    }
}
