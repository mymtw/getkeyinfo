package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.observable.ObservableConcatWithSingle$ConcatWithObserver */
final class ObservableConcatWithSingle$ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, C8073u<T>, Disposable {
    private static final long serialVersionUID = -1953724749712440952L;
    public final Observer<? super T> downstream;
    public boolean inSingle;
    public C8075w<? extends T> other;

    public ObservableConcatWithSingle$ConcatWithObserver(Observer<? super T> observer, C8075w<? extends T> wVar) {
        this.downstream = observer;
        this.other = wVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.inSingle = true;
        DisposableHelper.replace(this, (Disposable) null);
        C8075w<? extends T> wVar = this.other;
        this.other = null;
        wVar.mo20655a(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable) && !this.inSingle) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.downstream.onNext(t);
        this.downstream.onComplete();
    }
}
