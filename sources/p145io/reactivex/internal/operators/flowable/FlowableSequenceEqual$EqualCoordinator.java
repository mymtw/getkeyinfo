package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.util.AtomicThrowable;
import p287xp.C8336d;
import p503zp.C13973i;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinator */
final class FlowableSequenceEqual$EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements C19117m {
    private static final long serialVersionUID = -6178010334400373240L;
    public final C8336d<? super T, ? super T> comparer;
    public final AtomicThrowable error;
    public final FlowableSequenceEqual$EqualSubscriber<T> first;
    public final FlowableSequenceEqual$EqualSubscriber<T> second;

    /* renamed from: v1 */
    public T f42657v1;

    /* renamed from: v2 */
    public T f42658v2;
    public final AtomicInteger wip = new AtomicInteger();

    public FlowableSequenceEqual$EqualCoordinator(C20024c<? super Boolean> cVar, int i, C8336d<? super T, ? super T> dVar) {
        super(cVar);
        this.comparer = dVar;
        this.first = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
        this.second = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
        this.error = new AtomicThrowable();
    }

    public void cancel() {
        super.cancel();
        this.first.cancel();
        this.second.cancel();
        if (this.wip.getAndIncrement() == 0) {
            this.first.clear();
            this.second.clear();
        }
    }

    public void cancelAndClear() {
        this.first.cancel();
        this.first.clear();
        this.second.cancel();
        this.second.clear();
    }

    public void drain() {
        if (this.wip.getAndIncrement() == 0) {
            int i = 1;
            do {
                C13973i<T> iVar = this.first.queue;
                C13973i<T> iVar2 = this.second.queue;
                if (iVar != null && iVar2 != null) {
                    while (!isCancelled()) {
                        if (((Throwable) this.error.get()) != null) {
                            cancelAndClear();
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                        boolean z = this.first.done;
                        T t = this.f42657v1;
                        if (t == null) {
                            try {
                                t = iVar.poll();
                                this.f42657v1 = t;
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                cancelAndClear();
                                this.error.addThrowable(th);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z2 = false;
                        boolean z3 = t == null;
                        boolean z4 = this.second.done;
                        T t2 = this.f42658v2;
                        if (t2 == null) {
                            try {
                                t2 = iVar2.poll();
                                this.f42658v2 = t2;
                            } catch (Throwable th2) {
                                C19421p.m32940h0(th2);
                                cancelAndClear();
                                this.error.addThrowable(th2);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        if (t2 == null) {
                            z2 = true;
                        }
                        if (z && z4 && z3 && z2) {
                            complete(Boolean.TRUE);
                            return;
                        } else if (z && z4 && z3 != z2) {
                            cancelAndClear();
                            complete(Boolean.FALSE);
                            return;
                        } else if (!z3 && !z2) {
                            try {
                                ((C12965a.C12966a) this.comparer).getClass();
                                if (!C12965a.m20649a(t, t2)) {
                                    cancelAndClear();
                                    complete(Boolean.FALSE);
                                    return;
                                }
                                this.f42657v1 = null;
                                this.f42658v2 = null;
                                this.first.request();
                                this.second.request();
                            } catch (Throwable th3) {
                                C19421p.m32940h0(th3);
                                cancelAndClear();
                                this.error.addThrowable(th3);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                    }
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (isCancelled()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (((Throwable) this.error.get()) != null) {
                    cancelAndClear();
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                i = this.wip.addAndGet(-i);
            } while (i != 0);
        }
    }

    public void innerError(Throwable th) {
        if (this.error.addThrowable(th)) {
            drain();
        } else {
            C18981a.m32123b(th);
        }
    }

    public void subscribe(C20023b<? extends T> bVar, C20023b<? extends T> bVar2) {
        bVar.subscribe(this.first);
        bVar2.subscribe(this.second);
    }
}
