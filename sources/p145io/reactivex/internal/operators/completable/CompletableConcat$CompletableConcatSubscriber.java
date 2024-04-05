package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8054g;
import p248tp.C8056i;
import p503zp.C13970f;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber */
final class CompletableConcat$CompletableConcatSubscriber extends AtomicInteger implements C8056i<C8052e>, Disposable {
    private static final long serialVersionUID = 9032184911934499404L;
    public volatile boolean active;
    public int consumed;
    public volatile boolean done;
    public final C8050c downstream;
    public final ConcatInnerObserver inner = new ConcatInnerObserver(this);
    public final int limit;
    public final AtomicBoolean once = new AtomicBoolean();
    public final int prefetch;
    public C13973i<C8052e> queue;
    public int sourceFused;
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver */
    public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = -5454794857847146511L;
        public final CompletableConcat$CompletableConcatSubscriber parent;

        public ConcatInnerObserver(CompletableConcat$CompletableConcatSubscriber completableConcat$CompletableConcatSubscriber) {
            this.parent = completableConcat$CompletableConcatSubscriber;
        }

        public void onComplete() {
            this.parent.innerComplete();
        }

        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public CompletableConcat$CompletableConcatSubscriber(C8050c cVar, int i) {
        this.downstream = cVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public void dispose() {
        this.upstream.cancel();
        DisposableHelper.dispose(this.inner);
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        C8052e poll = this.queue.poll();
                        boolean z2 = poll == null;
                        if (!z || !z2) {
                            if (!z2) {
                                this.active = true;
                                poll.mo20607a(this.inner);
                                request();
                            }
                        } else if (this.once.compareAndSet(false, true)) {
                            this.downstream.onComplete();
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        innerError(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    public void innerError(Throwable th) {
        if (this.once.compareAndSet(false, true)) {
            this.upstream.cancel();
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) this.inner.get());
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.inner);
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            int i = this.prefetch;
            long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i;
            if (subscription instanceof C13970f) {
                C13970f fVar = (C13970f) subscription;
                int requestFusion = fVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.sourceFused = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                } else if (requestFusion == 2) {
                    this.sourceFused = requestFusion;
                    this.queue = fVar;
                    this.downstream.onSubscribe(this);
                    subscription.request(j);
                    return;
                }
            }
            if (this.prefetch == Integer.MAX_VALUE) {
                this.queue = new C19213a(C8054g.f17572b);
            } else {
                this.queue = new SpscArrayQueue(this.prefetch);
            }
            this.downstream.onSubscribe(this);
            subscription.request(j);
        }
    }

    public void request() {
        if (this.sourceFused != 1) {
            int i = this.consumed + 1;
            if (i == this.limit) {
                this.consumed = 0;
                this.upstream.request((long) i);
                return;
            }
            this.consumed = i;
        }
    }

    public void onNext(C8052e eVar) {
        if (this.sourceFused != 0 || this.queue.offer(eVar)) {
            drain();
        } else {
            onError(new MissingBackpressureException());
        }
    }
}
