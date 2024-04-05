package p145io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferSkipSubscriber */
final class FlowableBuffer$PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -5616169793639412593L;
    public C buffer;
    public final Callable<C> bufferSupplier;
    public boolean done;
    public final C20024c<? super C> downstream;
    public int index;
    public final int size;
    public final int skip;
    public Subscription upstream;

    public FlowableBuffer$PublisherBufferSkipSubscriber(C20024c<? super C> cVar, int i, int i2, Callable<C> callable) {
        this.downstream = cVar;
        this.size = i;
        this.skip = i2;
        this.bufferSupplier = callable;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            C c = this.buffer;
            this.buffer = null;
            if (c != null) {
                this.downstream.onNext(c);
            }
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.buffer = null;
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            C c = this.buffer;
            int i = this.index;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    C call = this.bufferSupplier.call();
                    C12965a.m20650b(call, "The bufferSupplier returned a null buffer");
                    c = (Collection) call;
                    this.buffer = c;
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c != null) {
                c.add(t);
                if (c.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c);
                }
            }
            if (i2 == this.skip) {
                i2 = 0;
            }
            this.index = i2;
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        if (!SubscriptionHelper.validate(j)) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            this.upstream.request(C19382n.m32770s0((long) this.skip, j));
            return;
        }
        this.upstream.request(C19382n.m32707F(C19382n.m32770s0(j, (long) this.size), C19382n.m32770s0((long) (this.skip - this.size), j - 1)));
    }
}
