package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber */
final class FlowableReplay$ReplaySubscriber<T> extends AtomicReference<Subscription> implements C8056i<T>, Disposable {
    public static final FlowableReplay$InnerSubscription[] EMPTY = new FlowableReplay$InnerSubscription[0];
    public static final FlowableReplay$InnerSubscription[] TERMINATED = new FlowableReplay$InnerSubscription[0];
    private static final long serialVersionUID = 7224554242710036740L;
    public final C19114j<T> buffer;
    public boolean done;
    public final AtomicInteger management = new AtomicInteger();
    public long maxChildRequested;
    public long maxUpstreamRequested;
    public final AtomicBoolean shouldConnect = new AtomicBoolean();
    public final AtomicReference<FlowableReplay$InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

    public FlowableReplay$ReplaySubscriber(C19114j<T> jVar) {
        this.buffer = jVar;
    }

    public boolean add(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription) {
        boolean z;
        flowableReplay$InnerSubscription.getClass();
        do {
            FlowableReplay$InnerSubscription<T>[] flowableReplay$InnerSubscriptionArr = (FlowableReplay$InnerSubscription[]) this.subscribers.get();
            z = false;
            if (flowableReplay$InnerSubscriptionArr != TERMINATED) {
                int length = flowableReplay$InnerSubscriptionArr.length;
                FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr2 = new FlowableReplay$InnerSubscription[(length + 1)];
                System.arraycopy(flowableReplay$InnerSubscriptionArr, 0, flowableReplay$InnerSubscriptionArr2, 0, length);
                flowableReplay$InnerSubscriptionArr2[length] = flowableReplay$InnerSubscription;
                AtomicReference<FlowableReplay$InnerSubscription<T>[]> atomicReference = this.subscribers;
                while (true) {
                    if (!atomicReference.compareAndSet(flowableReplay$InnerSubscriptionArr, flowableReplay$InnerSubscriptionArr2)) {
                        if (atomicReference.get() != flowableReplay$InnerSubscriptionArr) {
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

    public void dispose() {
        this.subscribers.set(TERMINATED);
        SubscriptionHelper.cancel(this);
    }

    public boolean isDisposed() {
        return this.subscribers.get() == TERMINATED;
    }

    public void manageRequests() {
        if (this.management.getAndIncrement() == 0) {
            int i = 1;
            while (!isDisposed()) {
                FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr = (FlowableReplay$InnerSubscription[]) this.subscribers.get();
                long j = this.maxChildRequested;
                long j2 = j;
                for (FlowableReplay$InnerSubscription flowableReplay$InnerSubscription : flowableReplay$InnerSubscriptionArr) {
                    j2 = Math.max(j2, flowableReplay$InnerSubscription.totalRequested.get());
                }
                long j3 = this.maxUpstreamRequested;
                Subscription subscription = (Subscription) get();
                long j4 = j2 - j;
                if (j4 != 0) {
                    this.maxChildRequested = j2;
                    if (subscription == null) {
                        long j5 = j3 + j4;
                        if (j5 < 0) {
                            j5 = Long.MAX_VALUE;
                        }
                        this.maxUpstreamRequested = j5;
                    } else if (j3 != 0) {
                        this.maxUpstreamRequested = 0;
                        subscription.request(j3 + j4);
                    } else {
                        subscription.request(j4);
                    }
                } else if (!(j3 == 0 || subscription == null)) {
                    this.maxUpstreamRequested = 0;
                    subscription.request(j3);
                }
                i = this.management.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.buffer.complete();
            for (FlowableReplay$InnerSubscription replay : (FlowableReplay$InnerSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(replay);
            }
        }
    }

    public void onError(Throwable th) {
        if (!this.done) {
            this.done = true;
            this.buffer.error(th);
            for (FlowableReplay$InnerSubscription replay : (FlowableReplay$InnerSubscription[]) this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(replay);
            }
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            this.buffer.next(t);
            for (FlowableReplay$InnerSubscription replay : (FlowableReplay$InnerSubscription[]) this.subscribers.get()) {
                this.buffer.replay(replay);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            manageRequests();
            for (FlowableReplay$InnerSubscription replay : (FlowableReplay$InnerSubscription[]) this.subscribers.get()) {
                this.buffer.replay(replay);
            }
        }
    }

    public void remove(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription) {
        boolean z;
        FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr;
        do {
            FlowableReplay$InnerSubscription<T>[] flowableReplay$InnerSubscriptionArr2 = (FlowableReplay$InnerSubscription[]) this.subscribers.get();
            int length = flowableReplay$InnerSubscriptionArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (flowableReplay$InnerSubscriptionArr2[i2].equals(flowableReplay$InnerSubscription)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        flowableReplay$InnerSubscriptionArr = EMPTY;
                    } else {
                        FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr3 = new FlowableReplay$InnerSubscription[(length - 1)];
                        System.arraycopy(flowableReplay$InnerSubscriptionArr2, 0, flowableReplay$InnerSubscriptionArr3, 0, i);
                        System.arraycopy(flowableReplay$InnerSubscriptionArr2, i + 1, flowableReplay$InnerSubscriptionArr3, i, (length - i) - 1);
                        flowableReplay$InnerSubscriptionArr = flowableReplay$InnerSubscriptionArr3;
                    }
                    AtomicReference<FlowableReplay$InnerSubscription<T>[]> atomicReference = this.subscribers;
                    while (true) {
                        if (!atomicReference.compareAndSet(flowableReplay$InnerSubscriptionArr2, flowableReplay$InnerSubscriptionArr)) {
                            if (atomicReference.get() != flowableReplay$InnerSubscriptionArr2) {
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
}
