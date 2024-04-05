package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8065q;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver */
abstract class ObservableSampleWithObservable$SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -3517602651313910099L;
    public final Observer<? super T> downstream;
    public final AtomicReference<Disposable> other = new AtomicReference<>();
    public final C8065q<?> sampler;
    public Disposable upstream;

    public ObservableSampleWithObservable$SampleMainObserver(Observer<? super T> observer, C8065q<?> qVar) {
        this.downstream = observer;
        this.sampler = qVar;
    }

    public void complete() {
        this.upstream.dispose();
        completion();
    }

    public abstract void completion();

    public void dispose() {
        DisposableHelper.dispose(this.other);
        this.upstream.dispose();
    }

    public void emit() {
        Object andSet = getAndSet((Object) null);
        if (andSet != null) {
            this.downstream.onNext(andSet);
        }
    }

    public void error(Throwable th) {
        this.upstream.dispose();
        this.downstream.onError(th);
    }

    public boolean isDisposed() {
        return this.other.get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        DisposableHelper.dispose(this.other);
        completion();
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        lazySet(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
            if (this.other.get() == null) {
                this.sampler.subscribe(new C19184u(this));
            }
        }
    }

    public abstract void run();

    public boolean setOther(Disposable disposable) {
        return DisposableHelper.setOnce(this.other, disposable);
    }
}
