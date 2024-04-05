package p145io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.processors.UnicastProcessor;
import p248tp.C8054g;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20022a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableWindow$WindowOverlapSubscriber */
final class FlowableWindow$WindowOverlapSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = 2428527070996323976L;
    public final int bufferSize;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final C20024c<? super C8054g<T>> downstream;
    public Throwable error;
    public final AtomicBoolean firstRequest = new AtomicBoolean();
    public long index;
    public final AtomicBoolean once = new AtomicBoolean();
    public long produced;
    public final C19213a<UnicastProcessor<T>> queue;
    public final AtomicLong requested = new AtomicLong();
    public final long size;
    public final long skip;
    public Subscription upstream;
    public final ArrayDeque<UnicastProcessor<T>> windows = new ArrayDeque<>();
    public final AtomicInteger wip = new AtomicInteger();

    public FlowableWindow$WindowOverlapSubscriber(C20024c<? super C8054g<T>> cVar, long j, long j2, int i) {
        super(1);
        this.downstream = cVar;
        this.size = j;
        this.skip = j2;
        this.queue = new C19213a<>(i);
        this.bufferSize = i;
    }

    public void cancel() {
        this.cancelled = true;
        if (this.once.compareAndSet(false, true)) {
            run();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, C20024c<?> cVar, C19213a<?> aVar) {
        if (this.cancelled) {
            aVar.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.error;
            if (th != null) {
                aVar.clear();
                cVar.onError(th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                cVar.onComplete();
                return true;
            }
        }
    }

    public void drain() {
        int i;
        if (this.wip.getAndIncrement() == 0) {
            C20024c<? super C8054g<T>> cVar = this.downstream;
            C19213a<UnicastProcessor<T>> aVar = this.queue;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.done;
                    UnicastProcessor poll = aVar.poll();
                    boolean z2 = poll == null;
                    if (!checkTerminated(z, z2, cVar, aVar)) {
                        if (z2) {
                            break;
                        }
                        cVar.onNext(poll);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, aVar.isEmpty(), cVar, aVar)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.requested.addAndGet(-j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } else {
                    return;
                }
            } while (i2 != 0);
        }
    }

    public void onComplete() {
        if (!this.done) {
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        Iterator<UnicastProcessor<T>> it = this.windows.iterator();
        while (it.hasNext()) {
            it.next().onError(th);
        }
        this.windows.clear();
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        if (!this.done) {
            long j = this.index;
            if (j == 0 && !this.cancelled) {
                getAndIncrement();
                UnicastProcessor f = UnicastProcessor.m32491f(this, this.bufferSize);
                this.windows.offer(f);
                this.queue.offer(f);
                drain();
            }
            long j2 = j + 1;
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            long j3 = this.produced + 1;
            if (j3 == this.size) {
                this.produced = j3 - this.skip;
                C20022a poll = this.windows.poll();
                if (poll != null) {
                    poll.onComplete();
                }
            } else {
                this.produced = j3;
            }
            if (j2 == this.skip) {
                this.index = 0;
            } else {
                this.index = j2;
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
            if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                this.upstream.request(C19382n.m32770s0(this.skip, j));
            } else {
                this.upstream.request(C19382n.m32707F(this.size, C19382n.m32770s0(this.skip, j - 1)));
            }
            drain();
        }
    }

    public void run() {
        if (decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
