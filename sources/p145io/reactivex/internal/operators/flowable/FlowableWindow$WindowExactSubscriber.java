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

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWindow$WindowExactSubscriber */
final class FlowableWindow$WindowExactSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = -2365647875069161133L;
    public final int bufferSize;
    public final C20024c<? super C8054g<T>> downstream;
    public long index;
    public final AtomicBoolean once = new AtomicBoolean();
    public final long size;
    public Subscription upstream;
    public UnicastProcessor<T> window;

    public FlowableWindow$WindowExactSubscriber(C20024c<? super C8054g<T>> cVar, long j, int i) {
        super(1);
        this.downstream = cVar;
        this.size = j;
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
        unicastProcessor.onNext(t);
        if (j2 == this.size) {
            this.index = 0;
            this.window = null;
            unicastProcessor.onComplete();
            return;
        }
        this.index = j2;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.request(C19382n.m32770s0(this.size, j));
        }
    }

    public void run() {
        if (decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
