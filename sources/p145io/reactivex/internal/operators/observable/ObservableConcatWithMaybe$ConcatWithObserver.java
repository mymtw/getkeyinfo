package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8059l;

/* renamed from: io.reactivex.internal.operators.observable.ObservableConcatWithMaybe$ConcatWithObserver */
final class ObservableConcatWithMaybe$ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, C8058k<T>, Disposable {
    private static final long serialVersionUID = -1953724749712440952L;
    public final Observer<? super T> downstream;
    public boolean inMaybe;
    public C8059l<? extends T> other;

    public ObservableConcatWithMaybe$ConcatWithObserver(Observer<? super T> observer, C8059l<? extends T> lVar) {
        this.downstream = observer;
        this.other = lVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        if (this.inMaybe) {
            this.downstream.onComplete();
            return;
        }
        this.inMaybe = true;
        DisposableHelper.replace(this, (Disposable) null);
        C8059l<? extends T> lVar = this.other;
        this.other = null;
        lVar.mo20624a(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable) && !this.inMaybe) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.downstream.onNext(t);
        this.downstream.onComplete();
    }
}
