package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.functions.C12965a;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed */
final class FlowableConcatMap$ConcatMapDelayed<T, R> extends FlowableConcatMap$BaseConcatMapSubscriber<T, R> {
    private static final long serialVersionUID = -2945777694260521066L;
    public final C20024c<? super R> downstream;
    public final boolean veryEnd;

    public FlowableConcatMap$ConcatMapDelayed(C20024c<? super R> cVar, C8339g<? super T, ? extends C20023b<? extends R>> gVar, int i, boolean z) {
        super(gVar, i);
        this.downstream = cVar;
        this.veryEnd = z;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }
    }

    public void drain() {
        Object obj;
        if (getAndIncrement() == 0) {
            while (!this.cancelled) {
                if (!this.active) {
                    boolean z = this.done;
                    if (!z || this.veryEnd || ((Throwable) this.errors.get()) == null) {
                        try {
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
                                try {
                                    Object apply = this.mapper.apply(poll);
                                    C12965a.m20650b(apply, "The mapper returned a null Publisher");
                                    C20023b bVar = (C20023b) apply;
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request((long) i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (bVar instanceof Callable) {
                                        try {
                                            obj = ((Callable) bVar).call();
                                        } catch (Throwable th) {
                                            C19421p.m32940h0(th);
                                            this.errors.addThrowable(th);
                                            if (!this.veryEnd) {
                                                this.upstream.cancel();
                                                this.downstream.onError(this.errors.terminate());
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.inner.isUnbounded()) {
                                            this.downstream.onNext(obj);
                                        } else {
                                            this.active = true;
                                            this.inner.setSubscription(new FlowableConcatMap$SimpleScalarSubscription(obj, this.inner));
                                        }
                                    } else {
                                        this.active = true;
                                        bVar.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    C19421p.m32940h0(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C19421p.m32940h0(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    } else {
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public void innerError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            if (!this.veryEnd) {
                this.upstream.cancel();
                this.done = true;
            }
            this.active = false;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerNext(R r) {
        this.downstream.onNext(r);
    }

    public void onError(Throwable th) {
        if (this.errors.addThrowable(th)) {
            this.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void request(long j) {
        this.inner.request(j);
    }

    public void subscribeActual() {
        this.downstream.onSubscribe(this);
    }
}
