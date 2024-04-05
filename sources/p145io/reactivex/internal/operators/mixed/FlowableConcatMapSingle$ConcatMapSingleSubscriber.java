package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
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
import p248tp.C8056i;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;
import p503zp.C13972h;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle$ConcatMapSingleSubscriber */
final class FlowableConcatMapSingle$ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements C8056i<T>, Subscription {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_INACTIVE = 0;
    public static final int STATE_RESULT_VALUE = 2;
    private static final long serialVersionUID = -9140123220065488293L;
    public volatile boolean cancelled;
    public int consumed;
    public volatile boolean done;
    public final C20024c<? super R> downstream;
    public long emitted;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);
    public R item;
    public final C8339g<? super T, ? extends C8075w<? extends R>> mapper;
    public final int prefetch;
    public final C13972h<T> queue;
    public final AtomicLong requested = new AtomicLong();
    public volatile int state;
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver */
    public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements C8073u<R> {
        private static final long serialVersionUID = -3051469169682093892L;
        public final FlowableConcatMapSingle$ConcatMapSingleSubscriber<?, R> parent;

        public ConcatMapSingleObserver(FlowableConcatMapSingle$ConcatMapSingleSubscriber<?, R> flowableConcatMapSingle$ConcatMapSingleSubscriber) {
            this.parent = flowableConcatMapSingle$ConcatMapSingleSubscriber;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        public void onSuccess(R r) {
            this.parent.innerSuccess(r);
        }
    }

    public FlowableConcatMapSingle$ConcatMapSingleSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends C8075w<? extends R>> gVar, int i, ErrorMode errorMode2) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.prefetch = i;
        this.errorMode = errorMode2;
        this.queue = new SpscArrayQueue(i);
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
            this.item = null;
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C20024c<? super R> cVar = this.downstream;
            ErrorMode errorMode2 = this.errorMode;
            C13972h<T> hVar = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicLong atomicLong = this.requested;
            int i = this.prefetch;
            int i2 = i - (i >> 1);
            int i3 = 1;
            while (true) {
                if (this.cancelled) {
                    hVar.clear();
                    this.item = null;
                } else {
                    int i4 = this.state;
                    if (atomicThrowable.get() == null || !(errorMode2 == ErrorMode.IMMEDIATE || (errorMode2 == ErrorMode.BOUNDARY && i4 == 0))) {
                        if (i4 == 0) {
                            boolean z = this.done;
                            T poll = hVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable terminate = atomicThrowable.terminate();
                                if (terminate == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.onError(terminate);
                                    return;
                                }
                            } else if (!z2) {
                                int i5 = this.consumed + 1;
                                if (i5 == i2) {
                                    this.consumed = 0;
                                    this.upstream.request((long) i2);
                                } else {
                                    this.consumed = i5;
                                }
                                try {
                                    Object apply = this.mapper.apply(poll);
                                    C12965a.m20650b(apply, "The mapper returned a null SingleSource");
                                    C8075w wVar = (C8075w) apply;
                                    this.state = 1;
                                    wVar.mo20655a(this.inner);
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    this.upstream.cancel();
                                    hVar.clear();
                                    atomicThrowable.addThrowable(th);
                                    cVar.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.emitted;
                            if (j != atomicLong.get()) {
                                R r = this.item;
                                this.item = null;
                                cVar.onNext(r);
                                this.emitted = j + 1;
                                this.state = 0;
                            }
                        }
                    }
                }
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
            hVar.clear();
            this.item = null;
            cVar.onError(atomicThrowable.terminate());
        }
    }

    public void innerError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerSuccess(R r) {
        this.item = r;
        this.state = 2;
        drain();
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (!this.queue.offer(t)) {
            this.upstream.cancel();
            onError(new MissingBackpressureException("queue full?!"));
            return;
        }
        drain();
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request((long) this.prefetch);
        }
    }

    public void request(long j) {
        C19382n.m32703D(this.requested, j);
        drain();
    }
}
