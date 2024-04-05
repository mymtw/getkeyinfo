package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8050c;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableMergeIterable$MergeCompletableObserver */
final class CompletableMergeIterable$MergeCompletableObserver extends AtomicBoolean implements C8050c {
    private static final long serialVersionUID = -7730517613164279224L;
    public final C8050c downstream;
    public final C7091a set;
    public final AtomicInteger wip;

    public CompletableMergeIterable$MergeCompletableObserver(C8050c cVar, C7091a aVar, AtomicInteger atomicInteger) {
        this.downstream = cVar;
        this.set = aVar;
        this.wip = atomicInteger;
    }

    public void onComplete() {
        if (this.wip.decrementAndGet() == 0 && compareAndSet(false, true)) {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.set.dispose();
        if (compareAndSet(false, true)) {
            this.downstream.onError(th);
        } else {
            C18981a.m32123b(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        this.set.mo19403b(disposable);
    }
}
