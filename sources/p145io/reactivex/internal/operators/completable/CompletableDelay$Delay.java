package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.completable.CompletableDelay$Delay */
final class CompletableDelay$Delay extends AtomicReference<Disposable> implements C8050c, Runnable, Disposable {
    private static final long serialVersionUID = 465972761105851022L;
    public final long delay;
    public final boolean delayError;
    public final C8050c downstream;
    public Throwable error;
    public final C8066r scheduler;
    public final TimeUnit unit;

    public CompletableDelay$Delay(C8050c cVar, long j, TimeUnit timeUnit, C8066r rVar, boolean z) {
        this.downstream = cVar;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = rVar;
        this.delayError = z;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        DisposableHelper.replace(this, this.scheduler.mo20648d(this, this.delay, this.unit));
    }

    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.mo20648d(this, this.delayError ? this.delay : 0, this.unit));
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void run() {
        Throwable th = this.error;
        this.error = null;
        if (th != null) {
            this.downstream.onError(th);
        } else {
            this.downstream.onComplete();
        }
    }
}
