package p145io.reactivex.processors;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.ReplayProcessor */
public final class ReplayProcessor<T> extends C19250a<T> {

    /* renamed from: io.reactivex.processors.ReplayProcessor$Node */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    /* renamed from: io.reactivex.processors.ReplayProcessor$ReplaySubscription */
    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final C20024c<? super T> downstream;
        public long emitted;
        public Object index;
        public final AtomicLong requested = new AtomicLong();
        public final ReplayProcessor<T> state;

        public ReplaySubscription(C20024c<? super T> cVar, ReplayProcessor<T> replayProcessor) {
            this.downstream = cVar;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                throw null;
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this.requested, j);
                throw null;
            }
        }
    }

    /* renamed from: io.reactivex.processors.ReplayProcessor$TimedNode */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }
}
