package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p248tp.C8066r;
import p503zp.C13965a;
import p503zp.C13970f;
import p503zp.C13973i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn */
public final class FlowableObserveOn<T> extends C19104a<T, T> {

    /* renamed from: d */
    public final C8066r f42642d;

    /* renamed from: e */
    public final boolean f42643e = false;

    /* renamed from: f */
    public final int f42644f;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber */
    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements C8056i<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public boolean outputFused;
        public final int prefetch;
        public long produced;
        public C13973i<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public int sourceMode;
        public Subscription upstream;
        public final C8066r.C8069c worker;

        public BaseObserveOnSubscriber(C8066r.C8069c cVar, boolean z, int i) {
            this.worker = cVar;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean checkTerminated(boolean z, boolean z2, C20024c<?> cVar) {
            if (this.cancelled) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                trySchedule();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    trySchedule();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                trySchedule();
            }
        }

        public abstract /* synthetic */ void onSubscribe(Subscription subscription);

        public abstract /* synthetic */ T poll() throws Exception;

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this.requested, j);
                trySchedule();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
            if (getAndIncrement() == 0) {
                this.worker.mo20652a(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnConditionalSubscriber */
    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public long consumed;
        public final C13965a<? super T> downstream;

        public ObserveOnConditionalSubscriber(C13965a<? super T> aVar, C8066r.C8069c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.downstream = aVar;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof C13970f) {
                    C13970f fVar = (C13970f) subscription;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = fVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = fVar;
                        this.downstream.onSubscribe(this);
                        subscription.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                subscription.request((long) this.prefetch);
            }
        }

        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.request(j);
                } else {
                    this.consumed = j;
                }
            }
            return poll;
        }

        public void runAsync() {
            int i;
            C13965a<? super T> aVar = this.downstream;
            C13973i<T> iVar = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.done;
                    try {
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!checkTerminated(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.tryOnNext(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, iVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        this.consumed = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        public void runBackfused() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public void runSync() {
            C13965a<? super T> aVar = this.downstream;
            C13973i<T> iVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = iVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                aVar.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (aVar.tryOnNext(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (iVar.isEmpty()) {
                        this.cancelled = true;
                        aVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnSubscriber */
    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final C20024c<? super T> downstream;

        public ObserveOnSubscriber(C20024c<? super T> cVar, C8066r.C8069c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.downstream = cVar;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof C13970f) {
                    C13970f fVar = (C13970f) subscription;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = fVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = fVar;
                        this.downstream.onSubscribe(this);
                        subscription.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                subscription.request((long) this.prefetch);
            }
        }

        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.request(j);
                } else {
                    this.produced = j;
                }
            }
            return poll;
        }

        public void runAsync() {
            int i;
            C20024c<? super T> cVar = this.downstream;
            C13973i<T> iVar = this.queue;
            long j = this.produced;
            int i2 = 1;
            while (true) {
                long j2 = this.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.done;
                    try {
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!checkTerminated(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        iVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, iVar.isEmpty(), cVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        public void runBackfused() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public void runSync() {
            C20024c<? super T> cVar = this.downstream;
            C13973i<T> iVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = iVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                cVar.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            cVar.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (iVar.isEmpty()) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public FlowableObserveOn(C8054g gVar, C8066r rVar, int i) {
        super(gVar);
        this.f42642d = rVar;
        this.f42644f = i;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        C8066r.C8069c b = this.f42642d.mo20646b();
        if (cVar instanceof C13965a) {
            this.f42671c.mo20619c(new ObserveOnConditionalSubscriber((C13965a) cVar, b, this.f42643e, this.f42644f));
        } else {
            this.f42671c.mo20619c(new ObserveOnSubscriber(cVar, b, this.f42643e, this.f42644f));
        }
    }
}
