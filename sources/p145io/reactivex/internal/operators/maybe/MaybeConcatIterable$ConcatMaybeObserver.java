package p145io.reactivex.internal.operators.maybe;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8058k;
import p248tp.C8059l;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeConcatIterable$ConcatMaybeObserver */
final class MaybeConcatIterable$ConcatMaybeObserver<T> extends AtomicInteger implements C8058k<T>, Subscription {
    private static final long serialVersionUID = 3520831347801429610L;
    public final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);
    public final SequentialDisposable disposables = new SequentialDisposable();
    public final C20024c<? super T> downstream;
    public long produced;
    public final AtomicLong requested = new AtomicLong();
    public final Iterator<? extends C8059l<? extends T>> sources;

    public MaybeConcatIterable$ConcatMaybeObserver(C20024c<? super T> cVar, Iterator<? extends C8059l<? extends T>> it) {
        this.downstream = cVar;
        this.sources = it;
    }

    public void cancel() {
        this.disposables.dispose();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            AtomicReference<Object> atomicReference = this.current;
            C20024c<? super T> cVar = this.downstream;
            SequentialDisposable sequentialDisposable = this.disposables;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j = this.produced;
                        if (j != this.requested.get()) {
                            this.produced = j + 1;
                            atomicReference.lazySet((Object) null);
                            cVar.onNext(obj);
                        } else {
                            z = false;
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    if (z && !sequentialDisposable.isDisposed()) {
                        try {
                            if (this.sources.hasNext()) {
                                try {
                                    Object next = this.sources.next();
                                    C12965a.m20650b(next, "The source Iterator returned a null MaybeSource");
                                    ((C8059l) next).mo20624a(this);
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    cVar.onError(th);
                                    return;
                                }
                            } else {
                                cVar.onComplete();
                            }
                        } catch (Throwable th2) {
                            C19421p.m32940h0(th2);
                            cVar.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet((Object) null);
        }
    }

    public void onComplete() {
        this.current.lazySet(NotificationLite.COMPLETE);
        drain();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        this.disposables.replace(disposable);
    }

    public void onSuccess(T t) {
        this.current.lazySet(t);
        drain();
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
