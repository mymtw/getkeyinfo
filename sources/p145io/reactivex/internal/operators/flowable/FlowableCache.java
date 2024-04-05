package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCache */
public final class FlowableCache<T> extends C19104a<T, T> implements C8056i<T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCache$CacheSubscription */
    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        public final C20024c<? super T> downstream;
        public long index;
        public C19097a<T> node;
        public int offset;
        public final FlowableCache<T> parent;
        public final AtomicLong requested;

        public CacheSubscription(C20024c<? super T> cVar, FlowableCache<T> flowableCache) {
            this.downstream = cVar;
            throw null;
        }

        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32705E(this.requested, j);
                throw null;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCache$a */
    public static final class C19097a<T> {
    }
}
