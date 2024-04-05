package p145io.reactivex.internal.operators.flowable;

import androidx.compose.p015ui.text.input.C1993m;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8337e;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableBuffer$PublisherBufferOverlappingSubscriber */
final class FlowableBuffer$PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements C8056i<T>, Subscription, C8337e {
    private static final long serialVersionUID = -7370244972039324525L;
    public final Callable<C> bufferSupplier;
    public final ArrayDeque<C> buffers = new ArrayDeque<>();
    public volatile boolean cancelled;
    public boolean done;
    public final C20024c<? super C> downstream;
    public int index;
    public final AtomicBoolean once = new AtomicBoolean();
    public long produced;
    public final int size;
    public final int skip;
    public Subscription upstream;

    public FlowableBuffer$PublisherBufferOverlappingSubscriber(C20024c<? super C> cVar, int i, int i2, Callable<C> callable) {
        this.downstream = cVar;
        this.size = i;
        this.skip = i2;
        this.bufferSupplier = callable;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
    }

    public boolean getAsBoolean() {
        return this.cancelled;
    }

    public void onComplete() {
        long j;
        long j2;
        if (!this.done) {
            this.done = true;
            long j3 = this.produced;
            if (j3 != 0) {
                C19382n.m32774u0(this, j3);
            }
            C20024c<? super C> cVar = this.downstream;
            ArrayDeque<C> arrayDeque = this.buffers;
            if (arrayDeque.isEmpty()) {
                cVar.onComplete();
            } else if (!C1993m.m4362W(get(), cVar, arrayDeque, this, this)) {
                do {
                    j = get();
                    if ((j & Long.MIN_VALUE) == 0) {
                        j2 = Long.MIN_VALUE | j;
                    } else {
                        return;
                    }
                } while (!compareAndSet(j, j2));
                if (j != 0) {
                    C1993m.m4362W(j2, cVar, arrayDeque, this, this);
                }
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.buffers.clear();
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            ArrayDeque<C> arrayDeque = this.buffers;
            int i = this.index;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    C call = this.bufferSupplier.call();
                    C12965a.m20650b(call, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer((Collection) call);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator<C> it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t);
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
        long j2;
        boolean z;
        if (SubscriptionHelper.validate(j)) {
            C20024c<? super C> cVar = this.downstream;
            ArrayDeque<C> arrayDeque = this.buffers;
            do {
                j2 = get();
            } while (!compareAndSet(j2, C19382n.m32707F(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
            if (j2 == Long.MIN_VALUE) {
                C1993m.m4362W(j | Long.MIN_VALUE, cVar, arrayDeque, this, this);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.once.get() || !this.once.compareAndSet(false, true)) {
                    this.upstream.request(C19382n.m32770s0((long) this.skip, j));
                    return;
                }
                this.upstream.request(C19382n.m32707F((long) this.size, C19382n.m32770s0((long) this.skip, j - 1)));
            }
        }
    }
}
