package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8058k;
import p248tp.C8059l;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeConcatArray$ConcatMaybeObserver */
final class MaybeConcatArray$ConcatMaybeObserver<T> extends AtomicInteger implements C8058k<T>, Subscription {
    private static final long serialVersionUID = 3520831347801429610L;
    public final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);
    public final SequentialDisposable disposables = new SequentialDisposable();
    public final C20024c<? super T> downstream;
    public int index;
    public long produced;
    public final AtomicLong requested = new AtomicLong();
    public final C8059l<? extends T>[] sources;

    public MaybeConcatArray$ConcatMaybeObserver(C20024c<? super T> cVar, C8059l<? extends T>[] lVarArr) {
        this.downstream = cVar;
        this.sources = lVarArr;
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
                        int i = this.index;
                        C8059l<? extends T>[] lVarArr = this.sources;
                        if (i == lVarArr.length) {
                            cVar.onComplete();
                            return;
                        } else {
                            this.index = i + 1;
                            lVarArr[i].mo20624a(this);
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
