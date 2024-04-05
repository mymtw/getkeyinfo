package p145io.reactivex.internal.operators.single;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8073u;
import p287xp.C8339g;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable$FlatMapIterableObserver */
final class SingleFlatMapIterableFlowable$FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements C8073u<T> {
    private static final long serialVersionUID = -8938804753851907758L;
    public volatile boolean cancelled;
    public final C20024c<? super R> downstream;

    /* renamed from: it */
    public volatile Iterator<? extends R> f42900it;
    public final C8339g<? super T, ? extends Iterable<? extends R>> mapper;
    public boolean outputFused;
    public final AtomicLong requested = new AtomicLong();
    public Disposable upstream;

    public SingleFlatMapIterableFlowable$FlatMapIterableObserver(C20024c<? super R> cVar, C8339g<? super T, ? extends Iterable<? extends R>> gVar) {
        this.downstream = cVar;
        this.mapper = gVar;
    }

    public void cancel() {
        this.cancelled = true;
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
    }

    public void clear() {
        this.f42900it = null;
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            C20024c<? super R> cVar = this.downstream;
            Iterator<? extends R> it = this.f42900it;
            if (!this.outputFused || it == null) {
                int i = 1;
                while (true) {
                    if (it != null) {
                        long j = this.requested.get();
                        if (j == Long.MAX_VALUE) {
                            slowPath(cVar, it);
                            return;
                        }
                        long j2 = 0;
                        while (j2 != j) {
                            if (!this.cancelled) {
                                try {
                                    Object next = it.next();
                                    C12965a.m20650b(next, "The iterator returned a null value");
                                    cVar.onNext(next);
                                    if (!this.cancelled) {
                                        j2++;
                                        try {
                                            if (!it.hasNext()) {
                                                cVar.onComplete();
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C19421p.m32940h0(th);
                                            cVar.onError(th);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    C19421p.m32940h0(th2);
                                    cVar.onError(th2);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (j2 != 0) {
                            C19382n.m32774u0(this.requested, j2);
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (it == null) {
                            it = this.f42900it;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                cVar.onNext(null);
                cVar.onComplete();
            }
        }
    }

    public boolean isEmpty() {
        return this.f42900it == null;
    }

    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        try {
            Iterator<? extends R> it = ((Iterable) this.mapper.apply(t)).iterator();
            if (!it.hasNext()) {
                this.downstream.onComplete();
                return;
            }
            this.f42900it = it;
            drain();
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }

    public R poll() throws Exception {
        Iterator<? extends R> it = this.f42900it;
        if (it == null) {
            return null;
        }
        R next = it.next();
        C12965a.m20650b(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f42900it = null;
        }
        return next;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
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

    public void slowPath(C20024c<? super R> cVar, Iterator<? extends R> it) {
        while (!this.cancelled) {
            try {
                cVar.onNext(it.next());
                if (!this.cancelled) {
                    try {
                        if (!it.hasNext()) {
                            cVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        C19421p.m32940h0(th);
                        cVar.onError(th);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                cVar.onError(th2);
                return;
            }
        }
    }
}
