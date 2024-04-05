package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.processors.UnicastProcessor;
import p248tp.C8054g;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWindow$WindowSkipSubscriber */
final class FlowableWindow$WindowSkipSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = -8792836352386833856L;
    public final int bufferSize;
    public final C20024c<? super C8054g<T>> downstream;
    public final AtomicBoolean firstRequest = new AtomicBoolean();
    public long index;
    public final AtomicBoolean once = new AtomicBoolean();
    public final long size;
    public final long skip;
    public Subscription upstream;
    public UnicastProcessor<T> window;

    public FlowableWindow$WindowSkipSubscriber(C20024c<? super C8054g<T>> cVar, long j, long j2, int i) {
        super(1);
        this.downstream = cVar;
        this.size = j;
        this.skip = j2;
        this.bufferSize = i;
    }

    public void cancel() {
        if (this.once.compareAndSet(false, true)) {
            run();
        }
    }

    public void onComplete() {
        UnicastProcessor<T> unicastProcessor = this.window;
        if (unicastProcessor != null) {
            this.window = null;
            unicastProcessor.onComplete();
        }
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        UnicastProcessor<T> unicastProcessor = this.window;
        if (unicastProcessor != null) {
            this.window = null;
            unicastProcessor.onError(th);
        }
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        long j = this.index;
        UnicastProcessor<T> unicastProcessor = this.window;
        if (j == 0) {
            getAndIncrement();
            unicastProcessor = UnicastProcessor.m32491f(this, this.bufferSize);
            this.window = unicastProcessor;
            this.downstream.onNext(unicastProcessor);
        }
        long j2 = j + 1;
        if (unicastProcessor != null) {
            unicastProcessor.onNext(t);
        }
        if (j2 == this.size) {
            this.window = null;
            unicastProcessor.onComplete();
        }
        if (j2 == this.skip) {
            this.index = 0;
        } else {
            this.index = j2;
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
        if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
            this.upstream.request(C19382n.m32770s0(this.skip, j));
            return;
        }
        this.upstream.request(C19382n.m32707F(C19382n.m32770s0(this.size, j), C19382n.m32770s0(this.skip - this.size, j - 1)));
    }

    public void run() {
        if (decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
