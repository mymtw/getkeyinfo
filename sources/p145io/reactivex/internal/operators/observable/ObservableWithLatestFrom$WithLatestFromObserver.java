package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p287xp.C8335c;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver */
final class ObservableWithLatestFrom$WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -312246233408980075L;
    public final C8335c<? super T, ? super U, ? extends R> combiner;
    public final Observer<? super R> downstream;
    public final AtomicReference<Disposable> other = new AtomicReference<>();
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();

    public ObservableWithLatestFrom$WithLatestFromObserver(Observer<? super R> observer, C8335c<? super T, ? super U, ? extends R> cVar) {
        this.downstream = observer;
        this.combiner = cVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.other);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    public void onComplete() {
        DisposableHelper.dispose(this.other);
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        Object obj = get();
        if (obj != null) {
            try {
                Object apply = this.combiner.apply(t, obj);
                C12965a.m20650b(apply, "The combiner returned a null value");
                this.downstream.onNext(apply);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                dispose();
                this.downstream.onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        this.downstream.onError(th);
    }

    public boolean setOther(Disposable disposable) {
        return DisposableHelper.setOnce(this.other, disposable);
    }
}
