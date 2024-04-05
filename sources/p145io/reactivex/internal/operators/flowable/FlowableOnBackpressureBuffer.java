package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p287xp.C8333a;
import p503zp.C13972h;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer */
public final class FlowableOnBackpressureBuffer<T> extends C19104a<T, T> {

    /* renamed from: d */
    public final int f42645d;

    /* renamed from: e */
    public final boolean f42646e = true;

    /* renamed from: f */
    public final boolean f42647f = false;

    /* renamed from: g */
    public final C8333a f42648g;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber */
    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements C8056i<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final C20024c<? super T> downstream;
        public Throwable error;
        public final C8333a onOverflow;
        public boolean outputFused;
        public final C13972h<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public Subscription upstream;

        public BackpressureBufferSubscriber(C20024c<? super T> cVar, int i, boolean z, boolean z2, C8333a aVar) {
            this.downstream = cVar;
            this.onOverflow = aVar;
            this.delayError = z2;
            this.queue = z ? new C19213a<>(i) : new SpscArrayQueue<>(i);
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, C20024c<? super T> cVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
        }

        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            int i;
            if (getAndIncrement() == 0) {
                C13972h<T> hVar = this.queue;
                C20024c<? super T> cVar = this.downstream;
                int i2 = 1;
                while (!checkTerminated(this.done, hVar.isEmpty(), cVar)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.done;
                        T poll = hVar.poll();
                        boolean z2 = poll == null;
                        if (!checkTerminated(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !checkTerminated(this.done, hVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public T poll() throws Exception {
            return this.queue.poll();
        }

        public void request(long j) {
            if (!this.outputFused && SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this.requested, j);
                drain();
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowableOnBackpressureBuffer(C19108e eVar, int i) {
        super(eVar);
        Functions.C12958c cVar = Functions.f28539c;
        this.f42645d = i;
        this.f42648g = cVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42671c.mo20619c(new BackpressureBufferSubscriber(cVar, this.f42645d, this.f42646e, this.f42647f, this.f42648g));
    }
}
