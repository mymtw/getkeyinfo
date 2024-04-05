package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8054g;
import p248tp.C8056i;
import p248tp.C8073u;
import p503zp.C13972h;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableMergeWithSingle$MergeWithObserver */
final class FlowableMergeWithSingle$MergeWithObserver<T> extends AtomicInteger implements C8056i<T>, Subscription {
    public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
    public static final int OTHER_STATE_HAS_VALUE = 1;
    private static final long serialVersionUID = -4592979584110982903L;
    public volatile boolean cancelled;
    public int consumed;
    public final C20024c<? super T> downstream;
    public long emitted;
    public final AtomicThrowable error = new AtomicThrowable();
    public final int limit;
    public volatile boolean mainDone;
    public final AtomicReference<Subscription> mainSubscription = new AtomicReference<>();
    public final OtherObserver<T> otherObserver = new OtherObserver<>(this);
    public volatile int otherState;
    public final int prefetch;
    public volatile C13972h<T> queue;
    public final AtomicLong requested = new AtomicLong();
    public T singleItem;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableMergeWithSingle$MergeWithObserver$OtherObserver */
    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements C8073u<T> {
        private static final long serialVersionUID = -2935427570954647017L;
        public final FlowableMergeWithSingle$MergeWithObserver<T> parent;

        public OtherObserver(FlowableMergeWithSingle$MergeWithObserver<T> flowableMergeWithSingle$MergeWithObserver) {
            this.parent = flowableMergeWithSingle$MergeWithObserver;
        }

        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.parent.otherSuccess(t);
        }
    }

    public FlowableMergeWithSingle$MergeWithObserver(C20024c<? super T> cVar) {
        this.downstream = cVar;
        int i = C8054g.f17572b;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public void cancel() {
        this.cancelled = true;
        SubscriptionHelper.cancel(this.mainSubscription);
        DisposableHelper.dispose(this.otherObserver);
        if (getAndIncrement() == 0) {
            this.queue = null;
            this.singleItem = null;
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        int i;
        C20024c<? super T> cVar = this.downstream;
        long j = this.emitted;
        int i2 = this.consumed;
        int i3 = this.limit;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            long j2 = this.requested.get();
            while (true) {
                i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i == 0) {
                    break;
                } else if (this.cancelled) {
                    this.singleItem = null;
                    this.queue = null;
                    return;
                } else if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    cVar.onError(this.error.terminate());
                    return;
                } else {
                    int i6 = this.otherState;
                    if (i6 == i4) {
                        T t = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        cVar.onNext(t);
                        j++;
                    } else {
                        boolean z = this.mainDone;
                        C13972h<T> hVar = this.queue;
                        T poll = hVar != null ? hVar.poll() : null;
                        boolean z2 = poll == null;
                        if (z && z2 && i6 == 2) {
                            this.queue = null;
                            cVar.onComplete();
                            return;
                        } else if (z2) {
                            break;
                        } else {
                            cVar.onNext(poll);
                            j++;
                            i2++;
                            if (i2 == i3) {
                                this.mainSubscription.get().request((long) i3);
                                i2 = 0;
                            }
                            i4 = 1;
                        }
                    }
                }
            }
            if (i == 0) {
                if (this.cancelled) {
                    this.singleItem = null;
                    this.queue = null;
                    return;
                } else if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    cVar.onError(this.error.terminate());
                    return;
                } else {
                    boolean z3 = this.mainDone;
                    C13972h<T> hVar2 = this.queue;
                    boolean z4 = hVar2 == null || hVar2.isEmpty();
                    if (z3 && z4 && this.otherState == 2) {
                        this.queue = null;
                        cVar.onComplete();
                        return;
                    }
                }
            }
            this.emitted = j;
            this.consumed = i2;
            i5 = addAndGet(-i5);
            if (i5 != 0) {
                i4 = 1;
            } else {
                return;
            }
        }
    }

    public C13972h<T> getOrCreateQueue() {
        C13972h<T> hVar = this.queue;
        if (hVar != null) {
            return hVar;
        }
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(C8054g.f17572b);
        this.queue = spscArrayQueue;
        return spscArrayQueue;
    }

    public void onComplete() {
        this.mainDone = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.error.addThrowable(th)) {
            DisposableHelper.dispose(this.otherObserver);
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (compareAndSet(0, 1)) {
            long j = this.emitted;
            if (this.requested.get() != j) {
                C13972h<T> hVar = this.queue;
                if (hVar == null || hVar.isEmpty()) {
                    this.emitted = j + 1;
                    this.downstream.onNext(t);
                    int i = this.consumed + 1;
                    if (i == this.limit) {
                        this.consumed = 0;
                        this.mainSubscription.get().request((long) i);
                    } else {
                        this.consumed = i;
                    }
                } else {
                    hVar.offer(t);
                }
            } else {
                getOrCreateQueue().offer(t);
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            getOrCreateQueue().offer(t);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this.mainSubscription, subscription, (long) this.prefetch);
    }

    public void otherError(Throwable th) {
        if (this.error.addThrowable(th)) {
            SubscriptionHelper.cancel(this.mainSubscription);
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void otherSuccess(T t) {
        if (compareAndSet(0, 1)) {
            long j = this.emitted;
            if (this.requested.get() != j) {
                this.emitted = j + 1;
                this.downstream.onNext(t);
                this.otherState = 2;
            } else {
                this.singleItem = t;
                this.otherState = 1;
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        } else {
            this.singleItem = t;
            this.otherState = 1;
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    public void request(long j) {
        C19382n.m32703D(this.requested, j);
        drain();
    }
}
