package p145io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8065q;
import p248tp.C8073u;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.mixed.SingleFlatMapObservable$FlatMapObserver */
final class SingleFlatMapObservable$FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, C8073u<T>, Disposable {
    private static final long serialVersionUID = -8948264376121066672L;
    public final Observer<? super R> downstream;
    public final C8339g<? super T, ? extends C8065q<? extends R>> mapper;

    public SingleFlatMapObservable$FlatMapObserver(Observer<? super R> observer, C8339g<? super T, ? extends C8065q<? extends R>> gVar) {
        this.downstream = observer;
        this.mapper = gVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
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

    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this, disposable);
    }

    public void onSuccess(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null Publisher");
            ((C8065q) apply).subscribe(this);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }
}
