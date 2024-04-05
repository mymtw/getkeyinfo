package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8066r;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver */
final class MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable, Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    public final C8058k<? super T> downstream;

    /* renamed from: ds */
    public Disposable f42715ds;
    public final C8066r scheduler;

    public MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver(C8058k<? super T> kVar, C8066r rVar) {
        this.downstream = kVar;
        this.scheduler = rVar;
    }

    public void dispose() {
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        Disposable disposable = (Disposable) getAndSet(disposableHelper);
        if (disposable != disposableHelper) {
            this.f42715ds = disposable;
            this.scheduler.mo20647c(this);
        }
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    public void run() {
        this.f42715ds.dispose();
    }
}
