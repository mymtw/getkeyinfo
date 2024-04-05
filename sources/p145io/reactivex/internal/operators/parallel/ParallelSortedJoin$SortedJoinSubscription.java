package p145io.reactivex.internal.operators.parallel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinSubscription */
final class ParallelSortedJoin$SortedJoinSubscription<T> extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = 3481980673745556697L;
    public volatile boolean cancelled;
    public final Comparator<? super T> comparator;
    public final C20024c<? super T> downstream;
    public final AtomicReference<Throwable> error = new AtomicReference<>();
    public final int[] indexes;
    public final List<T>[] lists;
    public final AtomicInteger remaining = new AtomicInteger();
    public final AtomicLong requested = new AtomicLong();
    public final ParallelSortedJoin$SortedJoinInnerSubscriber<T>[] subscribers;

    public ParallelSortedJoin$SortedJoinSubscription(C20024c<? super T> cVar, int i, Comparator<? super T> comparator2) {
        this.downstream = cVar;
        this.comparator = comparator2;
        ParallelSortedJoin$SortedJoinInnerSubscriber<T>[] parallelSortedJoin$SortedJoinInnerSubscriberArr = new ParallelSortedJoin$SortedJoinInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            parallelSortedJoin$SortedJoinInnerSubscriberArr[i2] = new ParallelSortedJoin$SortedJoinInnerSubscriber<>(this, i2);
        }
        this.subscribers = parallelSortedJoin$SortedJoinInnerSubscriberArr;
        this.lists = new List[i];
        this.indexes = new int[i];
        this.remaining.lazySet(i);
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }
    }

    public void cancelAll() {
        for (ParallelSortedJoin$SortedJoinInnerSubscriber<T> cancel : this.subscribers) {
            cancel.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
        if (r13 != 0) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r1.cancelled == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        java.util.Arrays.fill(r3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        r10 = r1.error.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r10 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c9, code lost:
        cancelAll();
        java.util.Arrays.fill(r3, (java.lang.Object) null);
        r2.onError(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d4, code lost:
        if (r5 >= r4) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00de, code lost:
        if (r0[r5] == r3[r5].size()) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e0, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e2, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e5, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e6, code lost:
        if (r14 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e8, code lost:
        java.util.Arrays.fill(r3, (java.lang.Object) null);
        r2.onComplete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f4, code lost:
        if (r11 == 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fd, code lost:
        if (r7 == Long.MAX_VALUE) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ff, code lost:
        r1.requested.addAndGet(-r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0105, code lost:
        r5 = get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0109, code lost:
        if (r5 != r6) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010b, code lost:
        r5 = addAndGet(-r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0110, code lost:
        if (r5 != 0) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0112, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drain() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r17.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            or.c<? super T> r2 = r1.downstream
            java.util.List<T>[] r3 = r1.lists
            int[] r0 = r1.indexes
            int r4 = r0.length
            r6 = 1
        L_0x0011:
            java.util.concurrent.atomic.AtomicLong r7 = r1.requested
            long r7 = r7.get()
            r11 = 0
        L_0x0019:
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r15 = 0
            if (r13 == 0) goto L_0x00b2
            boolean r13 = r1.cancelled
            if (r13 == 0) goto L_0x0026
            java.util.Arrays.fill(r3, r15)
            return
        L_0x0026:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r13 = r1.error
            java.lang.Object r13 = r13.get()
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            if (r13 == 0) goto L_0x003a
            r17.cancelAll()
            java.util.Arrays.fill(r3, r15)
            r2.onError(r13)
            return
        L_0x003a:
            r13 = -1
            r9 = r15
            r14 = 0
        L_0x003d:
            if (r14 >= r4) goto L_0x009a
            r10 = r3[r14]
            r5 = r0[r14]
            int r15 = r10.size()
            if (r15 == r5) goto L_0x0096
            if (r9 != 0) goto L_0x0051
            java.lang.Object r9 = r10.get(r5)
        L_0x004f:
            r13 = r14
            goto L_0x0096
        L_0x0051:
            java.lang.Object r5 = r10.get(r5)
            java.util.Comparator<? super T> r10 = r1.comparator     // Catch:{ all -> 0x0064 }
            int r10 = r10.compare(r9, r5)     // Catch:{ all -> 0x0064 }
            if (r10 <= 0) goto L_0x005f
            r10 = 1
            goto L_0x0060
        L_0x005f:
            r10 = 0
        L_0x0060:
            if (r10 == 0) goto L_0x0096
            r9 = r5
            goto L_0x004f
        L_0x0064:
            r0 = move-exception
            r5 = r0
            kotlin.reflect.C19421p.m32940h0(r5)
            r17.cancelAll()
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r10 = r1.error
        L_0x0072:
            boolean r0 = r10.compareAndSet(r4, r5)
            if (r0 == 0) goto L_0x007b
            r16 = 1
            goto L_0x0083
        L_0x007b:
            java.lang.Object r0 = r10.get()
            if (r0 == 0) goto L_0x0094
            r16 = 0
        L_0x0083:
            if (r16 != 0) goto L_0x0088
            p736cq.C18981a.m32123b(r5)
        L_0x0088:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r2.onError(r0)
            return
        L_0x0094:
            r4 = 0
            goto L_0x0072
        L_0x0096:
            int r14 = r14 + 1
            r15 = 0
            goto L_0x003d
        L_0x009a:
            if (r9 != 0) goto L_0x00a4
            r5 = 0
            java.util.Arrays.fill(r3, r5)
            r2.onComplete()
            return
        L_0x00a4:
            r2.onNext(r9)
            r5 = r0[r13]
            r9 = 1
            int r5 = r5 + r9
            r0[r13] = r5
            r13 = 1
            long r11 = r11 + r13
            goto L_0x0019
        L_0x00b2:
            r9 = 1
            if (r13 != 0) goto L_0x00f0
            boolean r5 = r1.cancelled
            if (r5 == 0) goto L_0x00be
            r5 = 0
            java.util.Arrays.fill(r3, r5)
            return
        L_0x00be:
            r5 = 0
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r10 = r1.error
            java.lang.Object r10 = r10.get()
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto L_0x00d3
            r17.cancelAll()
            java.util.Arrays.fill(r3, r5)
            r2.onError(r10)
            return
        L_0x00d3:
            r5 = 0
        L_0x00d4:
            if (r5 >= r4) goto L_0x00e5
            r10 = r0[r5]
            r13 = r3[r5]
            int r13 = r13.size()
            if (r10 == r13) goto L_0x00e2
            r14 = 0
            goto L_0x00e6
        L_0x00e2:
            int r5 = r5 + 1
            goto L_0x00d4
        L_0x00e5:
            r14 = r9
        L_0x00e6:
            if (r14 == 0) goto L_0x00f0
            r5 = 0
            java.util.Arrays.fill(r3, r5)
            r2.onComplete()
            return
        L_0x00f0:
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0105
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0105
            java.util.concurrent.atomic.AtomicLong r5 = r1.requested
            long r7 = -r11
            r5.addAndGet(r7)
        L_0x0105:
            int r5 = r17.get()
            if (r5 != r6) goto L_0x0113
            int r5 = -r6
            int r5 = r1.addAndGet(r5)
            if (r5 != 0) goto L_0x0113
            return
        L_0x0113:
            r6 = r5
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinSubscription.drain():void");
    }

    public void innerError(Throwable th) {
        boolean z;
        AtomicReference<Throwable> atomicReference = this.error;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, th)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            drain();
        } else if (th != this.error.get()) {
            C18981a.m32123b(th);
        }
    }

    public void innerNext(List<T> list, int i) {
        this.lists[i] = list;
        if (this.remaining.decrementAndGet() == 0) {
            drain();
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            if (this.remaining.get() == 0) {
                drain();
            }
        }
    }
}
