package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8066r;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.single.SingleUnsubscribeOn$UnsubscribeOnSingleObserver */
final class SingleUnsubscribeOn$UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable, Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    public final C8073u<? super T> downstream;

    /* renamed from: ds */
    public Disposable f42911ds;
    public final C8066r scheduler;

    public SingleUnsubscribeOn$UnsubscribeOnSingleObserver(C8073u<? super T> uVar, C8066r rVar) {
        this.downstream = uVar;
        this.scheduler = rVar;
    }

    public void dispose() {
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        Disposable disposable = (Disposable) getAndSet(disposableHelper);
        if (disposable != disposableHelper) {
            this.f42911ds = disposable;
            this.scheduler.mo20647c(this);
        }
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
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
        this.f42911ds.dispose();
    }
}
