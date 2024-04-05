package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.ErrorMode;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8056i;
import p287xp.C8339g;
import p503zp.C13972h;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver */
final class FlowableConcatMapCompletable$ConcatMapCompletableObserver<T> extends AtomicInteger implements C8056i<T>, Disposable {
    private static final long serialVersionUID = 3610901111000061034L;
    public volatile boolean active;
    public int consumed;
    public volatile boolean disposed;
    public volatile boolean done;
    public final C8050c downstream;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
    public final C8339g<? super T, ? extends C8052e> mapper;
    public final int prefetch;
    public final C13972h<T> queue;
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver */
    public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = 5638352172918776687L;
        public final FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> parent;

        public ConcatMapInnerObserver(FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> flowableConcatMapCompletable$ConcatMapCompletableObserver) {
            this.parent = flowableConcatMapCompletable$ConcatMapCompletableObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
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

    public FlowableConcatMapCompletable$ConcatMapCompletableObserver(C8050c cVar, C8339g<? super T, ? extends C8052e> gVar, ErrorMode errorMode2, int i) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.errorMode = errorMode2;
        this.prefetch = i;
        this.queue = new SpscArrayQueue(i);
    }

    public void dispose() {
        this.disposed = true;
        this.upstream.cancel();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            while (!this.disposed) {
                if (!this.active) {
                    if (this.errorMode != ErrorMode.BOUNDARY || this.errors.get() == null) {
                        boolean z = this.done;
                        T poll = this.queue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable terminate = this.errors.terminate();
                            if (terminate != null) {
                                this.downstream.onError(terminate);
                                return;
                            } else {
                                this.downstream.onComplete();
                                return;
                            }
                        } else if (!z2) {
                            int i = this.prefetch;
                            int i2 = i - (i >> 1);
                            int i3 = this.consumed + 1;
                            if (i3 == i2) {
                                this.consumed = 0;
                                this.upstream.request((long) i2);
                            } else {
                                this.consumed = i3;
                            }
                            try {
                                Object apply = this.mapper.apply(poll);
                                C12965a.m20650b(apply, "The mapper returned a null CompletableSource");
                                C8052e eVar = (C8052e) apply;
                                this.active = true;
                                eVar.mo20607a(this.inner);
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                this.queue.clear();
                                this.upstream.cancel();
                                this.errors.addThrowable(th);
                                this.downstream.onError(this.errors.terminate());
                                return;
                            }
                        }
                    } else {
                        this.queue.clear();
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    public void innerError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.upstream.cancel();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.f43031a) {
                this.downstream.onError(terminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        } else {
            this.active = false;
            drain();
        }
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.inner.dispose();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.f43031a) {
                this.downstream.onError(terminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        } else {
            this.done = true;
            drain();
        }
    }

    public void onNext(T t) {
        if (this.queue.offer(t)) {
            drain();
            return;
        }
        this.upstream.cancel();
        onError(new MissingBackpressureException("Queue full?!"));
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request((long) this.prefetch);
        }
    }
}
