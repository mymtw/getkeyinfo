package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8056i;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber */
final class FlowableSwitchMap$SwitchMapSubscriber<T, R> extends AtomicInteger implements C8056i<T>, Subscription {
    public static final FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> CANCELLED;
    private static final long serialVersionUID = -3491074160481096299L;
    public final AtomicReference<FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
    public final int bufferSize;
    public volatile boolean cancelled;
    public final boolean delayErrors;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public final AtomicThrowable error;
    public final C8339g<? super T, ? extends C20023b<? extends R>> mapper;
    public final AtomicLong requested = new AtomicLong();
    public volatile long unique;
    public Subscription upstream;

    static {
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber = new FlowableSwitchMap$SwitchMapInnerSubscriber<>((FlowableSwitchMap$SwitchMapSubscriber) null, -1, 1);
        CANCELLED = flowableSwitchMap$SwitchMapInnerSubscriber;
        flowableSwitchMap$SwitchMapInnerSubscriber.cancel();
    }

    public FlowableSwitchMap$SwitchMapSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends C20023b<? extends R>> gVar, int i, boolean z) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.bufferSize = i;
        this.delayErrors = z;
        this.error = new AtomicThrowable();
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }
    }

    public void disposeInner() {
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> andSet;
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber2 = CANCELLED;
        if (flowableSwitchMap$SwitchMapInnerSubscriber != flowableSwitchMap$SwitchMapInnerSubscriber2 && (andSet = this.active.getAndSet(flowableSwitchMap$SwitchMapInnerSubscriber2)) != flowableSwitchMap$SwitchMapInnerSubscriber2 && andSet != null) {
            andSet.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r14 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[LOOP:1: B:41:0x0096->B:44:0x00a2, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae A[LOOP:2: B:48:0x00ae->B:51:0x00ba, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0116 A[LOOP:4: B:78:0x0116->B:81:0x0121, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0128 A[LOOP:5: B:84:0x0128->B:87:0x0133, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drain() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r17.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            or.c<? super R> r2 = r1.downstream
            r4 = 1
        L_0x000c:
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r1.done
            if (r0 == 0) goto L_0x005c
            boolean r0 = r1.delayErrors
            if (r0 == 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x005c
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0035
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Throwable r0 = r0.terminate()
            r2.onError(r0)
            goto L_0x0038
        L_0x0035:
            r2.onComplete()
        L_0x0038:
            return
        L_0x0039:
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0050
            r17.disposeInner()
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Throwable r0 = r0.terminate()
            r2.onError(r0)
            return
        L_0x0050:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x005c
            r2.onComplete()
            return
        L_0x005c:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
            java.lang.Object r0 = r0.get()
            r5 = r0
            io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r5 = (p145io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber) r5
            r6 = 0
            if (r5 == 0) goto L_0x006c
            zp.i<R> r0 = r5.queue
            r7 = r0
            goto L_0x006d
        L_0x006c:
            r7 = r6
        L_0x006d:
            if (r7 == 0) goto L_0x015e
            boolean r0 = r5.done
            if (r0 == 0) goto L_0x00be
            boolean r0 = r1.delayErrors
            if (r0 != 0) goto L_0x00a6
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x008e
            r17.disposeInner()
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Throwable r0 = r0.terminate()
            r2.onError(r0)
            return
        L_0x008e:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00be
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
        L_0x0096:
            boolean r7 = r0.compareAndSet(r5, r6)
            if (r7 == 0) goto L_0x009e
            goto L_0x000c
        L_0x009e:
            java.lang.Object r7 = r0.get()
            if (r7 == r5) goto L_0x0096
            goto L_0x000c
        L_0x00a6:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00be
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
        L_0x00ae:
            boolean r7 = r0.compareAndSet(r5, r6)
            if (r7 == 0) goto L_0x00b6
            goto L_0x000c
        L_0x00b6:
            java.lang.Object r7 = r0.get()
            if (r7 == r5) goto L_0x00ae
            goto L_0x000c
        L_0x00be:
            java.util.concurrent.atomic.AtomicLong r0 = r1.requested
            long r8 = r0.get()
            r10 = 0
            r12 = r10
        L_0x00c7:
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            r14 = 0
            if (r0 == 0) goto L_0x0140
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L_0x00d1
            return
        L_0x00d1:
            boolean r0 = r5.done
            java.lang.Object r15 = r7.poll()     // Catch:{ all -> 0x00d8 }
            goto L_0x00e7
        L_0x00d8:
            r0 = move-exception
            r15 = r0
            kotlin.reflect.C19421p.m32940h0(r15)
            r5.cancel()
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            r0.addThrowable(r15)
            r15 = r6
            r0 = 1
        L_0x00e7:
            if (r15 != 0) goto L_0x00ec
            r16 = 1
            goto L_0x00ee
        L_0x00ec:
            r16 = r14
        L_0x00ee:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r3 = r1.active
            java.lang.Object r3 = r3.get()
            if (r5 == r3) goto L_0x00f8
        L_0x00f6:
            r14 = 1
            goto L_0x0140
        L_0x00f8:
            if (r0 == 0) goto L_0x0136
            boolean r0 = r1.delayErrors
            if (r0 != 0) goto L_0x0124
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0112
            io.reactivex.internal.util.AtomicThrowable r0 = r1.error
            java.lang.Throwable r0 = r0.terminate()
            r2.onError(r0)
            return
        L_0x0112:
            if (r16 == 0) goto L_0x0136
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
        L_0x0116:
            boolean r3 = r0.compareAndSet(r5, r6)
            if (r3 == 0) goto L_0x011d
            goto L_0x0123
        L_0x011d:
            java.lang.Object r3 = r0.get()
            if (r3 == r5) goto L_0x0116
        L_0x0123:
            goto L_0x00f6
        L_0x0124:
            if (r16 == 0) goto L_0x0136
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
        L_0x0128:
            boolean r3 = r0.compareAndSet(r5, r6)
            if (r3 == 0) goto L_0x012f
            goto L_0x0135
        L_0x012f:
            java.lang.Object r3 = r0.get()
            if (r3 == r5) goto L_0x0128
        L_0x0135:
            goto L_0x00f6
        L_0x0136:
            if (r16 == 0) goto L_0x0139
            goto L_0x0140
        L_0x0139:
            r2.onNext(r15)
            r14 = 1
            long r12 = r12 + r14
            goto L_0x00c7
        L_0x0140:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x015a
            boolean r0 = r1.cancelled
            if (r0 != 0) goto L_0x015a
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0157
            java.util.concurrent.atomic.AtomicLong r0 = r1.requested
            long r6 = -r12
            r0.addAndGet(r6)
        L_0x0157:
            r5.request(r12)
        L_0x015a:
            if (r14 == 0) goto L_0x015e
            goto L_0x000c
        L_0x015e:
            int r0 = -r4
            int r4 = r1.addAndGet(r0)
            if (r4 != 0) goto L_0x000c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber.drain():void");
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            drain();
        }
    }

    public void onError(Throwable th) {
        if (this.done || !this.error.addThrowable(th)) {
            C18981a.m32123b(th);
            return;
        }
        if (!this.delayErrors) {
            disposeInner();
        }
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        boolean z;
        if (!this.done) {
            long j = this.unique + 1;
            this.unique = j;
            FlowableSwitchMap$SwitchMapInnerSubscriber flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
            if (flowableSwitchMap$SwitchMapInnerSubscriber != null) {
                flowableSwitchMap$SwitchMapInnerSubscriber.cancel();
            }
            try {
                Object apply = this.mapper.apply(t);
                C12965a.m20650b(apply, "The publisher returned is null");
                C20023b bVar = (C20023b) apply;
                FlowableSwitchMap$SwitchMapInnerSubscriber flowableSwitchMap$SwitchMapInnerSubscriber2 = new FlowableSwitchMap$SwitchMapInnerSubscriber(this, j, this.bufferSize);
                do {
                    FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> flowableSwitchMap$SwitchMapInnerSubscriber3 = this.active.get();
                    if (flowableSwitchMap$SwitchMapInnerSubscriber3 != CANCELLED) {
                        AtomicReference<FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
                        while (true) {
                            if (!atomicReference.compareAndSet(flowableSwitchMap$SwitchMapInnerSubscriber3, flowableSwitchMap$SwitchMapInnerSubscriber2)) {
                                if (atomicReference.get() != flowableSwitchMap$SwitchMapInnerSubscriber3) {
                                    z = false;
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
                } while (!z);
                bVar.subscribe(flowableSwitchMap$SwitchMapInnerSubscriber2);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.upstream.cancel();
                onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            if (this.unique == 0) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                drain();
            }
        }
    }
}
