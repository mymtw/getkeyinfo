package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p287xp.C8335c;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver */
final class MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> extends AtomicReference<Disposable> implements C8058k<U> {
    private static final long serialVersionUID = -2897979525538174559L;
    public final C8058k<? super R> downstream;
    public final C8335c<? super T, ? super U, ? extends R> resultSelector;
    public T value;

    public MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver(C8058k<? super R> kVar, C8335c<? super T, ? super U, ? extends R> cVar) {
        this.downstream = kVar;
        this.resultSelector = cVar;
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(U u) {
        T t = this.value;
        this.value = null;
        try {
            Object apply = this.resultSelector.apply(t, u);
            C12965a.m20650b(apply, "The resultSelector returned a null value");
            this.downstream.onSuccess(apply);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }
}
