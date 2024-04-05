package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.ErrorMode;
import p248tp.C8056i;
import p287xp.C8339g;
import p503zp.C13973i;
import p734bq.C18977a;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber */
final class FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements C8056i<T>, Subscription, C18977a<R> {
    private static final long serialVersionUID = -4255299542215038287L;
    public volatile boolean cancelled;
    public volatile InnerQueuedSubscriber<R> current;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final C8339g<? super T, ? extends C20023b<? extends R>> mapper;
    public final int maxConcurrency;
    public final int prefetch;
    public final AtomicLong requested = new AtomicLong();
    public final C19213a<InnerQueuedSubscriber<R>> subscribers;
    public Subscription upstream;

    public FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends C20023b<? extends R>> gVar, int i, int i2, ErrorMode errorMode2) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode2;
        this.subscribers = new C19213a<>(Math.min(i2, i));
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.cancel();
            drainAndCancel();
        }
    }

    public void cancelAll() {
        InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
        this.current = null;
        if (innerQueuedSubscriber != null) {
            innerQueuedSubscriber.cancel();
        }
        while (true) {
            InnerQueuedSubscriber poll = this.subscribers.poll();
            if (poll != null) {
                poll.cancel();
            } else {
                return;
            }
        }
    }

    public void drain() {
        InnerQueuedSubscriber<R> innerQueuedSubscriber;
        int i;
        long j;
        long j2;
        boolean z;
        C13973i<R> queue;
        int i2;
        if (getAndIncrement() == 0) {
            InnerQueuedSubscriber<R> innerQueuedSubscriber2 = this.current;
            C20024c<? super R> cVar = this.downstream;
            ErrorMode errorMode2 = this.errorMode;
            int i3 = 1;
            while (true) {
                long j3 = this.requested.get();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber = innerQueuedSubscriber2;
                } else if (errorMode2 == ErrorMode.END || ((Throwable) this.errors.get()) == null) {
                    boolean z2 = this.done;
                    innerQueuedSubscriber = this.subscribers.poll();
                    if (z2 && innerQueuedSubscriber == null) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            cVar.onError(terminate);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    } else if (innerQueuedSubscriber != null) {
                        this.current = innerQueuedSubscriber;
                    }
                } else {
                    cancelAll();
                    cVar.onError(this.errors.terminate());
                    return;
                }
                if (innerQueuedSubscriber == null || (queue = innerQueuedSubscriber.queue()) == null) {
                    i = i3;
                    z = false;
                    j2 = 0;
                    j = 0;
                } else {
                    j = 0;
                    while (true) {
                        i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                        i = i3;
                        if (i2 == 0) {
                            break;
                        } else if (this.cancelled) {
                            cancelAll();
                            return;
                        } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.errors.get()) == null) {
                            boolean isDone = innerQueuedSubscriber.isDone();
                            try {
                                R poll = queue.poll();
                                boolean z3 = poll == null;
                                if (isDone && z3) {
                                    this.current = null;
                                    this.upstream.request(1);
                                    innerQueuedSubscriber = null;
                                    z = true;
                                    break;
                                } else if (z3) {
                                    break;
                                } else {
                                    cVar.onNext(poll);
                                    j++;
                                    innerQueuedSubscriber.requestOne();
                                    i3 = i;
                                }
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                C19421p.m32940h0(th2);
                                this.current = null;
                                innerQueuedSubscriber.cancel();
                                cancelAll();
                                cVar.onError(th2);
                                return;
                            }
                        } else {
                            this.current = null;
                            innerQueuedSubscriber.cancel();
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                    }
                    z = false;
                    if (i2 == 0) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.errors.get()) == null) {
                            boolean isDone2 = innerQueuedSubscriber.isDone();
                            boolean isEmpty = queue.isEmpty();
                            if (isDone2 && isEmpty) {
                                this.current = null;
                                this.upstream.request(1);
                                innerQueuedSubscriber = null;
                                z = true;
                            }
                        } else {
                            this.current = null;
                            innerQueuedSubscriber.cancel();
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                    }
                    j2 = 0;
                }
                if (!(j == j2 || j3 == Long.MAX_VALUE)) {
                    this.requested.addAndGet(-j);
                }
                if (z) {
                    innerQueuedSubscriber2 = innerQueuedSubscriber;
                    i3 = i;
                } else {
                    i3 = addAndGet(-i);
                    if (i3 != 0) {
                        innerQueuedSubscriber2 = innerQueuedSubscriber;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void drainAndCancel() {
        if (getAndIncrement() == 0) {
            do {
                cancelAll();
            } while (decrementAndGet() != 0);
        }
    }

    public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
        innerQueuedSubscriber.setDone();
        drain();
    }

    public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
        if (this.errors.addThrowable(th)) {
            innerQueuedSubscriber.setDone();
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
        if (innerQueuedSubscriber.queue().offer(r)) {
            drain();
            return;
        }
        innerQueuedSubscriber.cancel();
        innerError(innerQueuedSubscriber, new MissingBackpressureException());
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null Publisher");
            C20023b bVar = (C20023b) apply;
            InnerQueuedSubscriber innerQueuedSubscriber = new InnerQueuedSubscriber(this, this.prefetch);
            if (!this.cancelled) {
                this.subscribers.offer(innerQueuedSubscriber);
                bVar.subscribe(innerQueuedSubscriber);
                if (this.cancelled) {
                    innerQueuedSubscriber.cancel();
                    drainAndCancel();
                }
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.upstream.cancel();
            onError(th);
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            int i = this.maxConcurrency;
            subscription.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
