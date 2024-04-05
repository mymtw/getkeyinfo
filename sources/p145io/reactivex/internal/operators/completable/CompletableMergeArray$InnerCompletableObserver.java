package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8050c;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableMergeArray$InnerCompletableObserver */
final class CompletableMergeArray$InnerCompletableObserver extends AtomicInteger implements C8050c {
    private static final long serialVersionUID = -8360547806504310570L;
    public final C8050c downstream;
    public final AtomicBoolean once;
    public final C7091a set;

    public CompletableMergeArray$InnerCompletableObserver(C8050c cVar, AtomicBoolean atomicBoolean, C7091a aVar, int i) {
        this.downstream = cVar;
        this.once = atomicBoolean;
        this.set = aVar;
        lazySet(i);
    }

    public void onComplete() {
        if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.set.dispose();
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onError(th);
        } else {
            C18981a.m32123b(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        this.set.mo19403b(disposable);
    }
}
