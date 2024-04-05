package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8050c;
import p514bk.C14088a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver */
final class ObservableMergeWithCompletable$MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = -4592979584110982903L;
    public final Observer<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
    public volatile boolean mainDone;
    public volatile boolean otherDone;
    public final OtherObserver otherObserver = new OtherObserver(this);

    /* renamed from: io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver */
    public static final class OtherObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = -2935427570954647017L;
        public final ObservableMergeWithCompletable$MergeWithObserver<?> parent;

        public OtherObserver(ObservableMergeWithCompletable$MergeWithObserver<?> observableMergeWithCompletable$MergeWithObserver) {
            this.parent = observableMergeWithCompletable$MergeWithObserver;
        }

        public void onComplete() {
            this.parent.otherComplete();
        }

        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableMergeWithCompletable$MergeWithObserver(Observer<? super T> observer) {
        this.downstream = observer;
    }

    public void dispose() {
        DisposableHelper.dispose(this.mainDisposable);
        DisposableHelper.dispose(this.otherObserver);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.mainDisposable.get());
    }

    public void onComplete() {
        this.mainDone = true;
        if (this.otherDone) {
            C14088a.m21789r(this.downstream, this, this.error);
        }
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.otherObserver);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C14088a.m21793v(this.downstream, t, this, this.error);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.mainDisposable, disposable);
    }

    public void otherComplete() {
        this.otherDone = true;
        if (this.mainDone) {
            C14088a.m21789r(this.downstream, this, this.error);
        }
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.mainDisposable);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }
}
