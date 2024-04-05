package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;

/* renamed from: io.reactivex.internal.operators.completable.CompletableTimer$TimerDisposable */
final class CompletableTimer$TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
    private static final long serialVersionUID = 3167244060586201109L;
    public final C8050c downstream;

    public CompletableTimer$TimerDisposable(C8050c cVar) {
        this.downstream = cVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void run() {
        this.downstream.onComplete();
    }

    public void setFuture(Disposable disposable) {
        DisposableHelper.replace(this, disposable);
    }
}
