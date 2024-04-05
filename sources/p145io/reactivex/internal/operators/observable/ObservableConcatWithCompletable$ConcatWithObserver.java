package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p248tp.C8052e;

/* renamed from: io.reactivex.internal.operators.observable.ObservableConcatWithCompletable$ConcatWithObserver */
final class ObservableConcatWithCompletable$ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, C8050c, Disposable {
    private static final long serialVersionUID = -1953724749712440952L;
    public final Observer<? super T> downstream;
    public boolean inCompletable;
    public C8052e other;

    public ObservableConcatWithCompletable$ConcatWithObserver(Observer<? super T> observer, C8052e eVar) {
        this.downstream = observer;
        this.other = eVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        if (this.inCompletable) {
            this.downstream.onComplete();
            return;
        }
        this.inCompletable = true;
        DisposableHelper.replace(this, (Disposable) null);
        C8052e eVar = this.other;
        this.other = null;
        eVar.mo20607a(this);
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable) && !this.inCompletable) {
            this.downstream.onSubscribe(this);
        }
    }
}
