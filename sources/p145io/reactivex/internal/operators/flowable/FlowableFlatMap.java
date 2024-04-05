package p145io.reactivex.internal.operators.flowable;

import com.etsy.android.lib.push.registration.C8834g;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.ScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p287xp.C8339g;
import p503zp.C13970f;
import p503zp.C13972h;
import p503zp.C13973i;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMap */
public final class FlowableFlatMap<T, U> extends C19104a<T, U> {

    /* renamed from: d */
    public final C8339g<? super T, ? extends C20023b<? extends U>> f42636d;

    /* renamed from: e */
    public final boolean f42637e = false;

    /* renamed from: f */
    public final int f42638f;

    /* renamed from: g */
    public final int f42639g;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber */
    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements C8056i<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;

        /* renamed from: id */
        public final long f42640id;
        public final int limit;
        public final MergeSubscriber<T, U> parent;
        public long produced;
        public volatile C13973i<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.f42640id = j;
            this.parent = mergeSubscriber;
            int i = mergeSubscriber.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        public void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof C13970f) {
                    C13970f fVar = (C13970f) subscription;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = fVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = fVar;
                    }
                }
                subscription.request((long) this.bufferSize);
            }
        }

        public void requestMore(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((Subscription) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber */
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements C8056i<T>, Subscription {
        public static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];
        public static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final C20024c<? super U> downstream;
        public final AtomicThrowable errs = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final C8339g<? super T, ? extends C20023b<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile C13972h<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        public long uniqueId;
        public Subscription upstream;

        public MergeSubscriber(C20024c<? super U> cVar, C8339g<? super T, ? extends C20023b<? extends U>> gVar, boolean z, int i, int i2) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = gVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(EMPTY);
        }

        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            boolean z;
            do {
                InnerSubscriber<?, ?>[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                z = false;
                if (innerSubscriberArr != CANCELLED) {
                    int length = innerSubscriberArr.length;
                    InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                    AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                    while (true) {
                        if (!atomicReference.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            if (atomicReference.get() != innerSubscriberArr) {
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    innerSubscriber.dispose();
                    return false;
                }
            } while (!z);
            return true;
        }

        public void cancel() {
            C13972h<U> hVar;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0 && (hVar = this.queue) != null) {
                    hVar.clear();
                }
            }
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                clearScalarQueue();
                Throwable terminate = this.errs.terminate();
                if (terminate != ExceptionHelper.f43031a) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
        }

        public void clearScalarQueue() {
            C13972h<U> hVar = this.queue;
            if (hVar != null) {
                hVar.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr3 = CANCELLED;
            if (innerSubscriberArr2 != innerSubscriberArr3 && (innerSubscriberArr = (InnerSubscriber[]) this.subscribers.getAndSet(innerSubscriberArr3)) != innerSubscriberArr3) {
                for (InnerSubscriber<?, ?> dispose : innerSubscriberArr) {
                    dispose.dispose();
                }
                Throwable terminate = this.errs.terminate();
                if (terminate != null && terminate != ExceptionHelper.f43031a) {
                    C18981a.m32123b(terminate);
                }
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            long j;
            boolean z;
            long j2;
            long j3;
            int i;
            int i2;
            long j4;
            C20024c<? super U> cVar = this.downstream;
            int i3 = 1;
            while (!checkTerminate()) {
                C13972h<U> hVar = this.queue;
                long j5 = this.requested.get();
                boolean z2 = j5 == Long.MAX_VALUE;
                long j6 = 0;
                long j7 = 0;
                if (hVar != null) {
                    while (true) {
                        long j8 = 0;
                        U u = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            U poll = hVar.poll();
                            if (!checkTerminate()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j7++;
                                j8++;
                                j5--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            j5 = z2 ? Long.MAX_VALUE : this.requested.addAndGet(-j8);
                        }
                        if (j5 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.done;
                C13972h<U> hVar2 = this.queue;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (!z3 || ((hVar2 != null && !hVar2.isEmpty()) || length != 0)) {
                    int i4 = i3;
                    if (length != 0) {
                        long j9 = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || innerSubscriberArr[i5].f42640id != j9) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && innerSubscriberArr[i5].f42640id != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = innerSubscriberArr[i5].f42640id;
                        }
                        int i7 = i5;
                        boolean z4 = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                z = z4;
                                break;
                            } else if (!checkTerminate()) {
                                InnerSubscriber innerSubscriber = innerSubscriberArr[i7];
                                U u2 = null;
                                while (!checkTerminate()) {
                                    C13973i<U> iVar = innerSubscriber.queue;
                                    if (iVar == null) {
                                        i = length;
                                    } else {
                                        i = length;
                                        U u3 = u2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                U poll2 = iVar.poll();
                                                if (poll2 == null) {
                                                    u3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                cVar.onNext(poll2);
                                                if (!checkTerminate()) {
                                                    j--;
                                                    j10++;
                                                    u3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C19421p.m32940h0(th2);
                                                innerSubscriber.dispose();
                                                this.errs.addThrowable(th2);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!checkTerminate()) {
                                                    removeInner(innerSubscriber);
                                                    i8++;
                                                    z4 = true;
                                                    i2 = 1;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            j = !z2 ? this.requested.addAndGet(-j10) : Long.MAX_VALUE;
                                            innerSubscriber.requestMore(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || u3 == null)) {
                                            length = i;
                                            u2 = u3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z5 = innerSubscriber.done;
                                    C13973i<U> iVar2 = innerSubscriber.queue;
                                    if (z5 && (iVar2 == null || iVar2.isEmpty())) {
                                        removeInner(innerSubscriber);
                                        if (!checkTerminate()) {
                                            j7++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        z = z4;
                                        break;
                                    }
                                    i7++;
                                    if (i7 == i) {
                                        i7 = 0;
                                    }
                                    i2 = 1;
                                    i8 += i2;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i7;
                        this.lastId = innerSubscriberArr[i7].f42640id;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z = false;
                    }
                    if (j3 != j2 && !this.cancelled) {
                        this.upstream.request(j3);
                    }
                    if (z) {
                        i3 = i4;
                    } else {
                        i3 = addAndGet(-i4);
                        if (i3 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable terminate = this.errs.terminate();
                    if (terminate == ExceptionHelper.f43031a) {
                        return;
                    }
                    if (terminate == null) {
                        cVar.onComplete();
                        return;
                    } else {
                        cVar.onError(terminate);
                        return;
                    }
                }
            }
        }

        public C13973i<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            C13973i<U> iVar = innerSubscriber.queue;
            if (iVar != null) {
                return iVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        public C13973i<U> getMainQueue() {
            C13972h<U> hVar = this.queue;
            if (hVar == null) {
                hVar = this.maxConcurrency == Integer.MAX_VALUE ? new C19213a<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = hVar;
            }
            return hVar;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.errs.addThrowable(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (InnerSubscriber dispose : (InnerSubscriber[]) this.subscribers.getAndSet(CANCELLED)) {
                        dispose.dispose();
                    }
                }
                drain();
                return;
            }
            C18981a.m32123b(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
            } else if (this.errs.addThrowable(th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (InnerSubscriber dispose : (InnerSubscriber[]) this.subscribers.getAndSet(CANCELLED)) {
                        dispose.dispose();
                    }
                }
                drain();
            } else {
                C18981a.m32123b(th);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    Object apply = this.mapper.apply(t);
                    C12965a.m20650b(apply, "The mapper returned a null Publisher");
                    C20023b bVar = (C20023b) apply;
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                tryEmitScalar(call);
                            } else if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i = this.scalarEmitted + 1;
                                this.scalarEmitted = i;
                                int i2 = this.scalarLimit;
                                if (i == i2) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C19421p.m32940h0(th);
                            this.errs.addThrowable(th);
                            drain();
                        }
                    } else {
                        long j = this.uniqueId;
                        this.uniqueId = 1 + j;
                        InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                        if (addInner(innerSubscriber)) {
                            bVar.subscribe(innerSubscriber);
                        }
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
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        subscription.request(Long.MAX_VALUE);
                    } else {
                        subscription.request((long) i);
                    }
                }
            }
        }

        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            boolean z;
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            do {
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length != 0) {
                    int i = -1;
                    z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerSubscriberArr2[i2] == innerSubscriber) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriberArr = EMPTY;
                        } else {
                            InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i);
                            System.arraycopy(innerSubscriberArr2, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                            innerSubscriberArr = innerSubscriberArr3;
                        }
                        AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                        while (true) {
                            if (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                                if (atomicReference.get() != innerSubscriberArr2) {
                                    continue;
                                    break;
                                }
                            } else {
                                z = true;
                                continue;
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!z);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this.requested, j);
                drain();
            }
        }

        public void tryEmit(U u, InnerSubscriber<T, U> innerSubscriber) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13973i iVar = innerSubscriber.queue;
                if (iVar == null) {
                    iVar = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = iVar;
                }
                if (!iVar.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.requested.get();
                C13973i<U> iVar2 = innerSubscriber.queue;
                if (j == 0 || (iVar2 != null && !iVar2.isEmpty())) {
                    if (iVar2 == null) {
                        iVar2 = getInnerQueue(innerSubscriber);
                    }
                    if (!iVar2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                C13973i iVar = this.queue;
                if (j == 0 || (iVar != null && !iVar.isEmpty())) {
                    if (iVar == null) {
                        iVar = getMainQueue();
                    }
                    if (!iVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public FlowableFlatMap(C19126u uVar, C8834g gVar, int i, int i2) {
        super(uVar);
        this.f42636d = gVar;
        this.f42638f = i;
        this.f42639g = i2;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super U> cVar) {
        boolean z;
        C8054g<T> gVar = this.f42671c;
        C8339g<? super T, ? extends C20023b<? extends U>> gVar2 = this.f42636d;
        if (gVar instanceof Callable) {
            z = true;
            try {
                Object call = ((Callable) gVar).call();
                if (call == null) {
                    EmptySubscription.complete(cVar);
                } else {
                    try {
                        Object apply = gVar2.apply(call);
                        C12965a.m20650b(apply, "The mapper returned a null Publisher");
                        C20023b bVar = (C20023b) apply;
                        if (bVar instanceof Callable) {
                            try {
                                Object call2 = ((Callable) bVar).call();
                                if (call2 == null) {
                                    EmptySubscription.complete(cVar);
                                } else {
                                    cVar.onSubscribe(new ScalarSubscription(cVar, call2));
                                }
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                EmptySubscription.error(th, cVar);
                            }
                        } else {
                            bVar.subscribe(cVar);
                        }
                    } catch (Throwable th2) {
                        C19421p.m32940h0(th2);
                        EmptySubscription.error(th2, cVar);
                    }
                }
            } catch (Throwable th3) {
                C19421p.m32940h0(th3);
                EmptySubscription.error(th3, cVar);
            }
        } else {
            z = false;
        }
        if (!z) {
            this.f42671c.mo20619c(new MergeSubscriber(cVar, this.f42636d, this.f42637e, this.f42638f, this.f42639g));
        }
    }
}
