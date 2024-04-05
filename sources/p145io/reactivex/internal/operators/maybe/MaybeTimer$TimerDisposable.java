package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeTimer$TimerDisposable */
final class MaybeTimer$TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
    private static final long serialVersionUID = 2875964065294031672L;
    public final C8058k<? super Long> downstream;

    public MaybeTimer$TimerDisposable(C8058k<? super Long> kVar) {
        this.downstream = kVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void run() {
        this.downstream.onSuccess(0L);
    }

    public void setFuture(Disposable disposable) {
        DisposableHelper.replace(this, disposable);
    }
}
