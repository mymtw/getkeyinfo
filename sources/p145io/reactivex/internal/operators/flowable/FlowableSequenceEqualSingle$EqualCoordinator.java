package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8073u;
import p287xp.C8336d;
import p503zp.C13973i;
import p736cq.C18981a;
import p762or.C20023b;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle$EqualCoordinator */
final class FlowableSequenceEqualSingle$EqualCoordinator<T> extends AtomicInteger implements Disposable, C19117m {
    private static final long serialVersionUID = -6178010334400373240L;
    public final C8336d<? super T, ? super T> comparer;
    public final C8073u<? super Boolean> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final FlowableSequenceEqual$EqualSubscriber<T> first;
    public final FlowableSequenceEqual$EqualSubscriber<T> second;

    /* renamed from: v1 */
    public T f42659v1;

    /* renamed from: v2 */
    public T f42660v2;

    public FlowableSequenceEqualSingle$EqualCoordinator(C8073u<? super Boolean> uVar, int i, C8336d<? super T, ? super T> dVar) {
        this.downstream = uVar;
        this.comparer = dVar;
        this.first = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
        this.second = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
    }

    public void cancelAndClear() {
        this.first.cancel();
        this.first.clear();
        this.second.cancel();
        this.second.clear();
    }

    public void dispose() {
        this.first.cancel();
        this.second.cancel();
        if (getAndIncrement() == 0) {
            this.first.clear();
            this.second.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            int i = 1;
            do {
                C13973i<T> iVar = this.first.queue;
                C13973i<T> iVar2 = this.second.queue;
                if (iVar != null && iVar2 != null) {
                    while (!isDisposed()) {
                        if (((Throwable) this.error.get()) != null) {
                            cancelAndClear();
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                        boolean z = this.first.done;
                        T t = this.f42659v1;
                        if (t == null) {
                            try {
                                t = iVar.poll();
                                this.f42659v1 = t;
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
                        T t2 = this.f42660v2;
                        if (t2 == null) {
                            try {
                                t2 = iVar2.poll();
                                this.f42660v2 = t2;
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
                            this.downstream.onSuccess(Boolean.TRUE);
                            return;
                        } else if (z && z4 && z3 != z2) {
                            cancelAndClear();
                            this.downstream.onSuccess(Boolean.FALSE);
                            return;
                        } else if (!z3 && !z2) {
                            try {
                                ((C12965a.C12966a) this.comparer).getClass();
                                if (!C12965a.m20649a(t, t2)) {
                                    cancelAndClear();
                                    this.downstream.onSuccess(Boolean.FALSE);
                                    return;
                                }
                                this.f42659v1 = null;
                                this.f42660v2 = null;
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
                } else if (isDisposed()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (((Throwable) this.error.get()) != null) {
                    cancelAndClear();
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                i = addAndGet(-i);
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

    public boolean isDisposed() {
        return this.first.get() == SubscriptionHelper.CANCELLED;
    }

    public void subscribe(C20023b<? extends T> bVar, C20023b<? extends T> bVar2) {
        bVar.subscribe(this.first);
        bVar2.subscribe(this.second);
    }
}
