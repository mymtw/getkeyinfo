package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest */
public final class FlowableOnBackpressureLatest<T> extends C19104a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest$BackpressureLatestSubscriber */
    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription {
        private static final long serialVersionUID = 163080509307634843L;
        public volatile boolean cancelled;
        public final AtomicReference<T> current = new AtomicReference<>();
        public volatile boolean done;
        public final C20024c<? super T> downstream;
        public Throwable error;
        public final AtomicLong requested = new AtomicLong();
        public Subscription upstream;

        public BackpressureLatestSubscriber(C20024c<? super T> cVar) {
            this.downstream = cVar;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet((Object) null);
                }
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, C20024c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
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
            boolean z;
            if (getAndIncrement() == 0) {
                C20024c<? super T> cVar = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.done;
                        T andSet = atomicReference.getAndSet((Object) null);
                        boolean z3 = andSet == null;
                        if (!checkTerminated(z2, z3, cVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (checkTerminated(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C19382n.m32774u0(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            this.current.lazySet(t);
            drain();
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this.requested, j);
                drain();
            }
        }
    }

    public FlowableOnBackpressureLatest(C19108e eVar) {
        super(eVar);
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42671c.mo20619c(new BackpressureLatestSubscriber(cVar));
    }
}
