package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeDelay$DelayMaybeObserver */
final class MaybeDelay$DelayMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable, Runnable {
    private static final long serialVersionUID = 5566860102500855068L;
    public final long delay;
    public final C8058k<? super T> downstream;
    public Throwable error;
    public final C8066r scheduler;
    public final TimeUnit unit;
    public T value;

    public MaybeDelay$DelayMaybeObserver(C8058k<? super T> kVar, long j, TimeUnit timeUnit, C8066r rVar) {
        this.downstream = kVar;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = rVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        schedule();
    }

    public void onError(Throwable th) {
        this.error = th;
        schedule();
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.value = t;
        schedule();
    }

    public void run() {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            this.downstream.onSuccess(t);
        } else {
            this.downstream.onComplete();
        }
    }

    public void schedule() {
        DisposableHelper.replace(this, this.scheduler.mo20648d(this, this.delay, this.unit));
    }
}
