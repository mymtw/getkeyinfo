package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p248tp.C8050c;
import p248tp.C8052e;

/* renamed from: io.reactivex.internal.operators.completable.CompletableConcatArray$ConcatInnerObserver */
final class CompletableConcatArray$ConcatInnerObserver extends AtomicInteger implements C8050c {
    private static final long serialVersionUID = -7965400327305809232L;
    public final C8050c downstream;
    public int index;

    /* renamed from: sd */
    public final SequentialDisposable f42600sd = new SequentialDisposable();
    public final C8052e[] sources;

    public CompletableConcatArray$ConcatInnerObserver(C8050c cVar, C8052e[] eVarArr) {
        this.downstream = cVar;
        this.sources = eVarArr;
    }

    public void next() {
        if (!this.f42600sd.isDisposed() && getAndIncrement() == 0) {
            C8052e[] eVarArr = this.sources;
            while (!this.f42600sd.isDisposed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == eVarArr.length) {
                    this.downstream.onComplete();
                    return;
                }
                eVarArr[i].mo20607a(this);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public void onComplete() {
        next();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        this.f42600sd.replace(disposable);
    }
}
