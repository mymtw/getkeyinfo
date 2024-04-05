package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.ExceptionHelper;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator */
final class FlowableCombineLatest$CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
    private static final long serialVersionUID = -5082275438355852221L;
    public volatile boolean cancelled;
    public final C8339g<? super Object[], ? extends R> combiner;
    public int completedSources;
    public final boolean delayErrors;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public final AtomicReference<Throwable> error;
    public final Object[] latest;
    public int nonEmptySources;
    public boolean outputFused;
    public final C19213a<Object> queue;
    public final AtomicLong requested;
    public final FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] subscribers;

    public FlowableCombineLatest$CombineLatestCoordinator(C20024c<? super R> cVar, C8339g<? super Object[], ? extends R> gVar, int i, int i2, boolean z) {
        this.downstream = cVar;
        this.combiner = gVar;
        FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] flowableCombineLatest$CombineLatestInnerSubscriberArr = new FlowableCombineLatest$CombineLatestInnerSubscriber[i];
        for (int i3 = 0; i3 < i; i3++) {
            flowableCombineLatest$CombineLatestInnerSubscriberArr[i3] = new FlowableCombineLatest$CombineLatestInnerSubscriber<>(this, i3, i2);
        }
        this.subscribers = flowableCombineLatest$CombineLatestInnerSubscriberArr;
        this.latest = new Object[i];
        this.queue = new C19213a<>(i2);
        this.requested = new AtomicLong();
        this.error = new AtomicReference<>();
        this.delayErrors = z;
    }

    public void cancel() {
        this.cancelled = true;
        cancelAll();
    }

    public void cancelAll() {
        for (FlowableCombineLatest$CombineLatestInnerSubscriber<T> cancel : this.subscribers) {
            cancel.cancel();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, C20024c<?> cVar, C19213a<?> aVar) {
        if (this.cancelled) {
            cancelAll();
            aVar.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!this.delayErrors) {
                Throwable b = ExceptionHelper.m32483b(this.error);
                if (b != null && b != ExceptionHelper.f43031a) {
                    cancelAll();
                    aVar.clear();
                    cVar.onError(b);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cancelAll();
                    cVar.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                cancelAll();
                Throwable b2 = ExceptionHelper.m32483b(this.error);
                if (b2 == null || b2 == ExceptionHelper.f43031a) {
                    cVar.onComplete();
                } else {
                    cVar.onError(b2);
                }
                return true;
            }
        }
    }

    public void clear() {
        this.queue.clear();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }
    }

    public void drainAsync() {
        int i;
        C20024c<? super R> cVar = this.downstream;
        C19213a<Object> aVar = this.queue;
        int i2 = 1;
        do {
            long j = this.requested.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (i == 0) {
                    break;
                }
                boolean z = this.done;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                if (!checkTerminated(z, z2, cVar, aVar)) {
                    if (z2) {
                        break;
                    }
                    try {
                        Object apply = this.combiner.apply((Object[]) aVar.poll());
                        C12965a.m20650b(apply, "The combiner returned a null value");
                        cVar.onNext(apply);
                        ((FlowableCombineLatest$CombineLatestInnerSubscriber) poll).requestOne();
                        j2++;
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        cancelAll();
                        ExceptionHelper.m32482a(this.error, th);
                        cVar.onError(ExceptionHelper.m32483b(this.error));
                        return;
                    }
                } else {
                    return;
                }
            }
            if (i != 0 || !checkTerminated(this.done, aVar.isEmpty(), cVar, aVar)) {
                if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                    this.requested.addAndGet(-j2);
                }
                i2 = addAndGet(-i2);
            } else {
                return;
            }
        } while (i2 != 0);
    }

    public void drainOutput() {
        C20024c<? super R> cVar = this.downstream;
        C19213a<Object> aVar = this.queue;
        int i = 1;
        while (!this.cancelled) {
            Throwable th = this.error.get();
            if (th != null) {
                aVar.clear();
                cVar.onError(th);
                return;
            }
            boolean z = this.done;
            boolean isEmpty = aVar.isEmpty();
            if (!isEmpty) {
                cVar.onNext(null);
            }
            if (!z || !isEmpty) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                cVar.onComplete();
                return;
            }
        }
        aVar.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        drain();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void innerComplete(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object[] r0 = r2.latest     // Catch:{ all -> 0x001c }
            r3 = r0[r3]     // Catch:{ all -> 0x001c }
            r1 = 1
            if (r3 == 0) goto L_0x0015
            int r3 = r2.completedSources     // Catch:{ all -> 0x001c }
            int r3 = r3 + r1
            int r0 = r0.length     // Catch:{ all -> 0x001c }
            if (r3 != r0) goto L_0x0011
            r2.done = r1     // Catch:{ all -> 0x001c }
            goto L_0x0017
        L_0x0011:
            r2.completedSources = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return
        L_0x0015:
            r2.done = r1     // Catch:{ all -> 0x001c }
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            r2.drain()
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator.innerComplete(int):void");
    }

    public void innerError(int i, Throwable th) {
        if (!ExceptionHelper.m32482a(this.error, th)) {
            C18981a.m32123b(th);
        } else if (!this.delayErrors) {
            cancelAll();
            this.done = true;
            drain();
        } else {
            innerComplete(i);
        }
    }

    public void innerValue(int i, T t) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.latest;
            int i2 = this.nonEmptySources;
            if (objArr[i] == null) {
                i2++;
                this.nonEmptySources = i2;
            }
            objArr[i] = t;
            if (objArr.length == i2) {
                this.queue.mo71258a(this.subscribers[i], objArr.clone());
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            this.subscribers[i].requestOne();
        } else {
            drain();
        }
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public R poll() throws Exception {
        Object poll = this.queue.poll();
        if (poll == null) {
            return null;
        }
        R apply = this.combiner.apply((Object[]) this.queue.poll());
        C12965a.m20650b(apply, "The combiner returned a null value");
        ((FlowableCombineLatest$CombineLatestInnerSubscriber) poll).requestOne();
        return apply;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }

    public int requestFusion(int i) {
        boolean z = false;
        if ((i & 4) != 0) {
            return 0;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            z = true;
        }
        this.outputFused = z;
        return i2;
    }

    public void subscribe(C20023b<? extends T>[] bVarArr, int i) {
        FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] flowableCombineLatest$CombineLatestInnerSubscriberArr = this.subscribers;
        for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
            bVarArr[i2].subscribe(flowableCombineLatest$CombineLatestInnerSubscriberArr[i2]);
        }
    }
}
