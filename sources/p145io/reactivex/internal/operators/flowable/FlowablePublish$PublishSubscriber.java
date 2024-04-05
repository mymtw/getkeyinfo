package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber */
final class FlowablePublish$PublishSubscriber<T> extends AtomicInteger implements C8056i<T>, Disposable {
    public static final FlowablePublish$InnerSubscriber[] EMPTY = new FlowablePublish$InnerSubscriber[0];
    public static final FlowablePublish$InnerSubscriber[] TERMINATED = new FlowablePublish$InnerSubscriber[0];
    private static final long serialVersionUID = -202316842419149694L;
    public final int bufferSize;
    public final AtomicReference<FlowablePublish$PublishSubscriber<T>> current;
    public volatile C13973i<T> queue;
    public final AtomicBoolean shouldConnect;
    public int sourceMode;
    public final AtomicReference<FlowablePublish$InnerSubscriber<T>[]> subscribers = new AtomicReference<>(EMPTY);
    public volatile Object terminalEvent;
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public FlowablePublish$PublishSubscriber(AtomicReference<FlowablePublish$PublishSubscriber<T>> atomicReference, int i) {
        this.current = atomicReference;
        this.shouldConnect = new AtomicBoolean();
        this.bufferSize = i;
    }

    public boolean add(FlowablePublish$InnerSubscriber<T> flowablePublish$InnerSubscriber) {
        boolean z;
        do {
            FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr = (FlowablePublish$InnerSubscriber[]) this.subscribers.get();
            z = false;
            if (flowablePublish$InnerSubscriberArr != TERMINATED) {
                int length = flowablePublish$InnerSubscriberArr.length;
                FlowablePublish$InnerSubscriber[] flowablePublish$InnerSubscriberArr2 = new FlowablePublish$InnerSubscriber[(length + 1)];
                System.arraycopy(flowablePublish$InnerSubscriberArr, 0, flowablePublish$InnerSubscriberArr2, 0, length);
                flowablePublish$InnerSubscriberArr2[length] = flowablePublish$InnerSubscriber;
                AtomicReference<FlowablePublish$InnerSubscriber<T>[]> atomicReference = this.subscribers;
                while (true) {
                    if (!atomicReference.compareAndSet(flowablePublish$InnerSubscriberArr, flowablePublish$InnerSubscriberArr2)) {
                        if (atomicReference.get() != flowablePublish$InnerSubscriberArr) {
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

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[LOOP:2: B:15:0x003a->B:18:0x0045, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000f A[LOOP:0: B:6:0x000f->B:9:0x001a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkTerminated(java.lang.Object r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0065
            boolean r1 = p145io.reactivex.internal.util.NotificationLite.isComplete(r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0034
            if (r6 == 0) goto L_0x0065
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r5 = r4.current
        L_0x000f:
            boolean r6 = r5.compareAndSet(r4, r2)
            if (r6 == 0) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            java.lang.Object r6 = r5.get()
            if (r6 == r4) goto L_0x000f
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r5 = r4.subscribers
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r6 = TERMINATED
            java.lang.Object r5 = r5.getAndSet(r6)
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r5 = (p145io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]) r5
            int r6 = r5.length
        L_0x0027:
            if (r0 >= r6) goto L_0x0033
            r1 = r5[r0]
            or.c<? super T> r1 = r1.child
            r1.onComplete()
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0033:
            return r3
        L_0x0034:
            java.lang.Throwable r5 = p145io.reactivex.internal.util.NotificationLite.getError(r5)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r6 = r4.current
        L_0x003a:
            boolean r1 = r6.compareAndSet(r4, r2)
            if (r1 == 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            java.lang.Object r1 = r6.get()
            if (r1 == r4) goto L_0x003a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r6 = r4.subscribers
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = TERMINATED
            java.lang.Object r6 = r6.getAndSet(r1)
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r6 = (p145io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]) r6
            int r1 = r6.length
            if (r1 == 0) goto L_0x0061
            int r1 = r6.length
        L_0x0055:
            if (r0 >= r1) goto L_0x0064
            r2 = r6[r0]
            or.c<? super T> r2 = r2.child
            r2.onError(r5)
            int r0 = r0 + 1
            goto L_0x0055
        L_0x0061:
            p736cq.C18981a.m32123b(r5)
        L_0x0064:
            return r3
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber.checkTerminated(java.lang.Object, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013b, code lost:
        if (r11 == 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0140, code lost:
        if (r1.sourceMode == 1) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0142, code lost:
        r1.upstream.get().request(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014e, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0153, code lost:
        if (r14 == 0) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0155, code lost:
        if (r8 != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0014, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatch() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r25.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r2 = r1.subscribers
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (p145io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]) r0
            r3 = 1
            r4 = r0
            r5 = r3
        L_0x0014:
            java.lang.Object r0 = r1.terminalEvent
            zp.i<T> r6 = r1.queue
            if (r6 == 0) goto L_0x0023
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r8 = 0
            goto L_0x0024
        L_0x0023:
            r8 = r3
        L_0x0024:
            boolean r0 = r1.checkTerminated(r0, r8)
            if (r0 == 0) goto L_0x002b
            return
        L_0x002b:
            if (r8 != 0) goto L_0x0159
            int r0 = r4.length
            int r9 = r4.length
            r12 = 0
            r13 = 0
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0036:
            r16 = -9223372036854775808
            if (r12 >= r9) goto L_0x0052
            r7 = r4[r12]
            long r18 = r7.get()
            int r16 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r16 == 0) goto L_0x004d
            long r10 = r7.emitted
            long r10 = r18 - r10
            long r14 = java.lang.Math.min(r14, r10)
            goto L_0x004f
        L_0x004d:
            int r13 = r13 + 1
        L_0x004f:
            int r12 = r12 + 1
            goto L_0x0036
        L_0x0052:
            r9 = 1
            if (r0 != r13) goto L_0x0090
            java.lang.Object r0 = r1.terminalEvent
            java.lang.Object r7 = r6.poll()     // Catch:{ all -> 0x005d }
            goto L_0x0074
        L_0x005d:
            r0 = move-exception
            r6 = r0
            kotlin.reflect.C19421p.m32940h0(r6)
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.cancel()
            java.lang.Object r0 = p145io.reactivex.internal.util.NotificationLite.error(r6)
            r1.terminalEvent = r0
            r7 = 0
        L_0x0074:
            if (r7 != 0) goto L_0x0078
            r7 = r3
            goto L_0x0079
        L_0x0078:
            r7 = 0
        L_0x0079:
            boolean r0 = r1.checkTerminated(r0, r7)
            if (r0 == 0) goto L_0x0080
            return
        L_0x0080:
            int r0 = r1.sourceMode
            if (r0 == r3) goto L_0x0014
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r9)
            goto L_0x0014
        L_0x0090:
            r11 = 0
        L_0x0091:
            long r12 = (long) r11
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            java.lang.Object r0 = r1.terminalEvent
            java.lang.Object r8 = r6.poll()     // Catch:{ all -> 0x009d }
            goto L_0x00b4
        L_0x009d:
            r0 = move-exception
            r8 = r0
            kotlin.reflect.C19421p.m32940h0(r8)
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.cancel()
            java.lang.Object r0 = p145io.reactivex.internal.util.NotificationLite.error(r8)
            r1.terminalEvent = r0
            r8 = 0
        L_0x00b4:
            if (r8 != 0) goto L_0x00b8
            r7 = r3
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            boolean r0 = r1.checkTerminated(r0, r7)
            if (r0 == 0) goto L_0x00c0
            return
        L_0x00c0:
            if (r7 == 0) goto L_0x00c5
            r8 = r7
            goto L_0x013b
        L_0x00c5:
            java.lang.Object r0 = p145io.reactivex.internal.util.NotificationLite.getValue(r8)
            int r8 = r4.length
            r12 = 0
            r13 = 0
        L_0x00cc:
            if (r12 >= r8) goto L_0x0107
            r3 = r4[r12]
            long r22 = r3.get()
            int r24 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r24 == 0) goto L_0x00f5
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r22 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r22 == 0) goto L_0x00eb
            r22 = r6
            r23 = r7
            long r6 = r3.emitted
            long r6 = r6 + r9
            r3.emitted = r6
            goto L_0x00ef
        L_0x00eb:
            r22 = r6
            r23 = r7
        L_0x00ef:
            or.c<? super T> r3 = r3.child
            r3.onNext(r0)
            goto L_0x00ff
        L_0x00f5:
            r22 = r6
            r23 = r7
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 1
        L_0x00ff:
            int r12 = r12 + 1
            r6 = r22
            r7 = r23
            r3 = 1
            goto L_0x00cc
        L_0x0107:
            r22 = r6
            r23 = r7
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = r11 + 1
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (p145io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]) r0
            if (r13 != 0) goto L_0x0124
            if (r0 == r4) goto L_0x011d
            goto L_0x0124
        L_0x011d:
            r6 = r22
            r8 = r23
            r3 = 1
            goto L_0x0091
        L_0x0124:
            if (r11 == 0) goto L_0x0137
            int r3 = r1.sourceMode
            r4 = 1
            if (r3 == r4) goto L_0x0137
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r1.upstream
            java.lang.Object r3 = r3.get()
            org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
            long r6 = (long) r11
            r3.request(r6)
        L_0x0137:
            r4 = r0
            r3 = 1
            goto L_0x0014
        L_0x013b:
            if (r11 == 0) goto L_0x014e
            int r0 = r1.sourceMode
            r3 = 1
            if (r0 == r3) goto L_0x014f
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r12)
            goto L_0x014f
        L_0x014e:
            r3 = 1
        L_0x014f:
            r6 = 0
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0159
            if (r8 != 0) goto L_0x0159
            goto L_0x0014
        L_0x0159:
            int r0 = -r5
            int r5 = r1.addAndGet(r0)
            if (r5 != 0) goto L_0x0161
            return
        L_0x0161:
            java.lang.Object r0 = r2.get()
            r4 = r0
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r4 = (p145io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]) r4
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber.dispatch():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017 A[LOOP:0: B:5:0x0017->B:8:0x0022, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r3.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = TERMINATED
            if (r0 == r1) goto L_0x0029
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r3.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (p145io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]) r0
            if (r0 == r1) goto L_0x0029
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r0 = r3.current
            r1 = 0
        L_0x0017:
            boolean r2 = r0.compareAndSet(r3, r1)
            if (r2 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            java.lang.Object r2 = r0.get()
            if (r2 == r3) goto L_0x0017
        L_0x0024:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.upstream
            p145io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber.dispose():void");
    }

    public boolean isDisposed() {
        return this.subscribers.get() == TERMINATED;
    }

    public void onComplete() {
        if (this.terminalEvent == null) {
            this.terminalEvent = NotificationLite.complete();
            dispatch();
        }
    }

    public void onError(Throwable th) {
        if (this.terminalEvent == null) {
            this.terminalEvent = NotificationLite.error(th);
            dispatch();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            dispatch();
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
                    this.terminalEvent = NotificationLite.complete();
                    dispatch();
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

    public void remove(FlowablePublish$InnerSubscriber<T> flowablePublish$InnerSubscriber) {
        boolean z;
        FlowablePublish$InnerSubscriber[] flowablePublish$InnerSubscriberArr;
        do {
            FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr2 = (FlowablePublish$InnerSubscriber[]) this.subscribers.get();
            int length = flowablePublish$InnerSubscriberArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (flowablePublish$InnerSubscriberArr2[i2].equals(flowablePublish$InnerSubscriber)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        flowablePublish$InnerSubscriberArr = EMPTY;
                    } else {
                        FlowablePublish$InnerSubscriber[] flowablePublish$InnerSubscriberArr3 = new FlowablePublish$InnerSubscriber[(length - 1)];
                        System.arraycopy(flowablePublish$InnerSubscriberArr2, 0, flowablePublish$InnerSubscriberArr3, 0, i);
                        System.arraycopy(flowablePublish$InnerSubscriberArr2, i + 1, flowablePublish$InnerSubscriberArr3, i, (length - i) - 1);
                        flowablePublish$InnerSubscriberArr = flowablePublish$InnerSubscriberArr3;
                    }
                    AtomicReference<FlowablePublish$InnerSubscriber<T>[]> atomicReference = this.subscribers;
                    while (true) {
                        if (!atomicReference.compareAndSet(flowablePublish$InnerSubscriberArr2, flowablePublish$InnerSubscriberArr)) {
                            if (atomicReference.get() != flowablePublish$InnerSubscriberArr2) {
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
