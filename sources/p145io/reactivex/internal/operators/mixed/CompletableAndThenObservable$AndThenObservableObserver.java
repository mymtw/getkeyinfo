package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.mixed.CompletableAndThenObservable$AndThenObservableObserver */
final class CompletableAndThenObservable$AndThenObservableObserver<R> extends AtomicReference<Disposable> implements Observer<R>, C8050c, Disposable {
    private static final long serialVersionUID = -8948264376121066672L;
    public final Observer<? super R> downstream;
    public C8065q<? extends R> other;

    public CompletableAndThenObservable$AndThenObservableObserver(Observer<? super R> observer, C8065q<? extends R> qVar) {
        this.other = qVar;
        this.downstream = observer;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        C8065q<? extends R> qVar = this.other;
        if (qVar == null) {
            this.downstream.onComplete();
            return;
        }
        this.other = null;
        qVar.subscribe(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this, disposable);
    }
}
