package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowablePublishAlt$PublishConnection */
final class FlowablePublishAlt$PublishConnection<T> extends AtomicInteger implements C8056i<T>, Disposable {
    public static final FlowablePublishAlt$InnerSubscription[] EMPTY = new FlowablePublishAlt$InnerSubscription[0];
    public static final FlowablePublishAlt$InnerSubscription[] TERMINATED = new FlowablePublishAlt$InnerSubscription[0];
    private static final long serialVersionUID = -1672047311619175801L;
    public final int bufferSize;
    public final AtomicBoolean connect = new AtomicBoolean();
    public int consumed;
    public final AtomicReference<FlowablePublishAlt$PublishConnection<T>> current;
    public volatile boolean done;
    public Throwable error;
    public volatile C13973i<T> queue;
    public int sourceMode;
    public final AtomicReference<FlowablePublishAlt$InnerSubscription<T>[]> subscribers;
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public FlowablePublishAlt$PublishConnection(AtomicReference<FlowablePublishAlt$PublishConnection<T>> atomicReference, int i) {
        this.current = atomicReference;
        this.bufferSize = i;
        this.subscribers = new AtomicReference<>(EMPTY);
    }

    public boolean add(FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription) {
        boolean z;
        do {
            FlowablePublishAlt$InnerSubscription<T>[] flowablePublishAlt$InnerSubscriptionArr = (FlowablePublishAlt$InnerSubscription[]) this.subscribers.get();
            z = false;
            if (flowablePublishAlt$InnerSubscriptionArr != TERMINATED) {
                int length = flowablePublishAlt$InnerSubscriptionArr.length;
                FlowablePublishAlt$InnerSubscription[] flowablePublishAlt$InnerSubscriptionArr2 = new FlowablePublishAlt$InnerSubscription[(length + 1)];
                System.arraycopy(flowablePublishAlt$InnerSubscriptionArr, 0, flowablePublishAlt$InnerSubscriptionArr2, 0, length);
                flowablePublishAlt$InnerSubscriptionArr2[length] = flowablePublishAlt$InnerSubscription;
                AtomicReference<FlowablePublishAlt$InnerSubscription<T>[]> atomicReference = this.subscribers;
                while (true) {
                    if (!atomicReference.compareAndSet(flowablePublishAlt$InnerSubscriptionArr, flowablePublishAlt$InnerSubscriptionArr2)) {
                        if (atomicReference.get() != flowablePublishAlt$InnerSubscriptionArr) {
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
                return false;
            }
        } while (!z);
        return true;
    }

    public boolean checkTerminated(boolean z, boolean z2) {
        if (!z || !z2) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            signalError(th);
            return true;
        }
        for (FlowablePublishAlt$InnerSubscription flowablePublishAlt$InnerSubscription : (FlowablePublishAlt$InnerSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
            if (!flowablePublishAlt$InnerSubscription.isCancelled()) {
                flowablePublishAlt$InnerSubscription.downstream.onComplete();
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0009 A[LOOP:0: B:1:0x0009->B:4:0x0015, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishAlt$InnerSubscription<T>[]> r0 = r2.subscribers
            io.reactivex.internal.operators.flowable.FlowablePublishAlt$InnerSubscription[] r1 = TERMINATED
            r0.getAndSet(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishAlt$PublishConnection<T>> r0 = r2.current
        L_0x0009:
            r1 = 0
            boolean r1 = r0.compareAndSet(r2, r1)
            if (r1 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.Object r1 = r0.get()
            if (r1 == r2) goto L_0x0009
        L_0x0017:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.upstream
            p145io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowablePublishAlt$PublishConnection.dispose():void");
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C13973i<T> iVar = this.queue;
            int i = this.consumed;
            int i2 = this.bufferSize;
            int i3 = i2 - (i2 >> 2);
            boolean z = this.sourceMode != 1;
            int i4 = 1;
            int i5 = i;
            C13973i<T> iVar2 = iVar;
            int i6 = i5;
            while (true) {
                if (iVar2 != null) {
                    long j = Long.MAX_VALUE;
                    FlowablePublishAlt$InnerSubscription<T>[] flowablePublishAlt$InnerSubscriptionArr = (FlowablePublishAlt$InnerSubscription[]) this.subscribers.get();
                    boolean z2 = false;
                    for (FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription : flowablePublishAlt$InnerSubscriptionArr) {
                        long j2 = flowablePublishAlt$InnerSubscription.get();
                        if (j2 != Long.MIN_VALUE) {
                            j = Math.min(j2 - flowablePublishAlt$InnerSubscription.emitted, j);
                            z2 = true;
                        }
                    }
                    long j3 = 0;
                    if (!z2) {
                        j = 0;
                    }
                    while (true) {
                        if (j == j3) {
                            break;
                        }
                        boolean z3 = this.done;
                        try {
                            T poll = iVar2.poll();
                            boolean z4 = poll == null;
                            if (!checkTerminated(z3, z4)) {
                                if (z4) {
                                    break;
                                }
                                for (FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription2 : flowablePublishAlt$InnerSubscriptionArr) {
                                    if (!flowablePublishAlt$InnerSubscription2.isCancelled()) {
                                        flowablePublishAlt$InnerSubscription2.downstream.onNext(poll);
                                        flowablePublishAlt$InnerSubscription2.emitted++;
                                    }
                                }
                                if (z && (i6 = i6 + 1) == i3) {
                                    this.upstream.get().request((long) i3);
                                    i6 = 0;
                                }
                                j--;
                                if (flowablePublishAlt$InnerSubscriptionArr != this.subscribers.get()) {
                                    break;
                                }
                                j3 = 0;
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            C19421p.m32940h0(th2);
                            this.upstream.get().cancel();
                            iVar2.clear();
                            this.done = true;
                            signalError(th2);
                            return;
                        }
                    }
                    if (checkTerminated(this.done, iVar2.isEmpty())) {
                        return;
                    }
                }
                this.consumed = i6;
                i4 = addAndGet(-i4);
                if (i4 != 0) {
                    if (iVar2 == null) {
                        iVar2 = this.queue;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.subscribers.get() == TERMINATED;
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
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            drain();
        } else {
            onError(new MissingBackpressureException("Prefetch queue is full?!"));
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.sourceMode = requestFusion;
                    this.queue = fVar;
                    subscription.request((long) this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            subscription.request((long) this.bufferSize);
        }
    }

    public void remove(FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription) {
        boolean z;
        FlowablePublishAlt$InnerSubscription[] flowablePublishAlt$InnerSubscriptionArr;
        do {
            FlowablePublishAlt$InnerSubscription<T>[] flowablePublishAlt$InnerSubscriptionArr2 = (FlowablePublishAlt$InnerSubscription[]) this.subscribers.get();
            int length = flowablePublishAlt$InnerSubscriptionArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (flowablePublishAlt$InnerSubscriptionArr2[i2] == flowablePublishAlt$InnerSubscription) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        flowablePublishAlt$InnerSubscriptionArr = EMPTY;
                    } else {
                        FlowablePublishAlt$InnerSubscription[] flowablePublishAlt$InnerSubscriptionArr3 = new FlowablePublishAlt$InnerSubscription[(length - 1)];
                        System.arraycopy(flowablePublishAlt$InnerSubscriptionArr2, 0, flowablePublishAlt$InnerSubscriptionArr3, 0, i);
                        System.arraycopy(flowablePublishAlt$InnerSubscriptionArr2, i + 1, flowablePublishAlt$InnerSubscriptionArr3, i, (length - i) - 1);
                        flowablePublishAlt$InnerSubscriptionArr = flowablePublishAlt$InnerSubscriptionArr3;
                    }
                    AtomicReference<FlowablePublishAlt$InnerSubscription<T>[]> atomicReference = this.subscribers;
                    while (true) {
                        if (!atomicReference.compareAndSet(flowablePublishAlt$InnerSubscriptionArr2, flowablePublishAlt$InnerSubscriptionArr)) {
                            if (atomicReference.get() != flowablePublishAlt$InnerSubscriptionArr2) {
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

    public void signalError(Throwable th) {
        for (FlowablePublishAlt$InnerSubscription flowablePublishAlt$InnerSubscription : (FlowablePublishAlt$InnerSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
            if (!flowablePublishAlt$InnerSubscription.isCancelled()) {
                flowablePublishAlt$InnerSubscription.downstream.onError(th);
            }
        }
    }
}
