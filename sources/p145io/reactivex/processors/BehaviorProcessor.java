package p145io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.C19237a;
import p145io.reactivex.internal.util.NotificationLite;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.BehaviorProcessor */
public final class BehaviorProcessor<T> extends C19250a<T> {

    /* renamed from: io.reactivex.processors.BehaviorProcessor$BehaviorSubscription */
    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, C19237a.C19238a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        public volatile boolean cancelled;
        public final C20024c<? super T> downstream;
        public boolean emitting;
        public boolean fastPath;
        public long index;
        public boolean next;
        public C19237a<Object> queue;
        public final BehaviorProcessor<T> state;

        public BehaviorSubscription(C20024c<? super T> cVar, BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = cVar;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                throw null;
            }
        }

        public void emitFirst() {
            if (!this.cancelled) {
                synchronized (this) {
                    if (!this.cancelled) {
                        if (!this.next) {
                            throw null;
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo71360c(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emitLoop() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.a<java.lang.Object> r0 = r2.queue     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.emitting = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.queue = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo71360c(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.emitLoop():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
            r2.fastPath = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emitNext(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.fastPath
                if (r0 != 0) goto L_0x0036
                monitor-enter(r2)
                boolean r0 = r2.cancelled     // Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x0010:
                long r0 = r2.index     // Catch:{ all -> 0x0033 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x0018:
                boolean r4 = r2.emitting     // Catch:{ all -> 0x0033 }
                if (r4 == 0) goto L_0x002c
                io.reactivex.internal.util.a<java.lang.Object> r4 = r2.queue     // Catch:{ all -> 0x0033 }
                if (r4 != 0) goto L_0x0027
                io.reactivex.internal.util.a r4 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0033 }
                r4.<init>()     // Catch:{ all -> 0x0033 }
                r2.queue = r4     // Catch:{ all -> 0x0033 }
            L_0x0027:
                r4.mo71359b(r3)     // Catch:{ all -> 0x0033 }
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x002c:
                r4 = 1
                r2.next = r4     // Catch:{ all -> 0x0033 }
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                r2.fastPath = r4
                goto L_0x0036
            L_0x0033:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                throw r3
            L_0x0036:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.emitNext(java.lang.Object, long):void");
        }

        public boolean isFull() {
            return get() == 0;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this, j);
            }
        }

        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.downstream.onComplete();
                return true;
            } else if (NotificationLite.isError(obj)) {
                this.downstream.onError(NotificationLite.getError(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.downstream.onNext(NotificationLite.getValue(obj));
                    if (j == Long.MAX_VALUE) {
                        return false;
                    }
                    decrementAndGet();
                    return false;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }
    }
}
