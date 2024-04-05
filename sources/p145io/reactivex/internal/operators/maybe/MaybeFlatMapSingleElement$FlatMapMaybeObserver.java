package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p248tp.C8075w;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement$FlatMapMaybeObserver */
final class MaybeFlatMapSingleElement$FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = 4827726964688405508L;
    public final C8058k<? super R> downstream;
    public final C8339g<? super T, ? extends C8075w<? extends R>> mapper;

    public MaybeFlatMapSingleElement$FlatMapMaybeObserver(C8058k<? super R> kVar, C8339g<? super T, ? extends C8075w<? extends R>> gVar) {
        this.downstream = kVar;
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

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null SingleSource");
            ((C8075w) apply).mo20655a(new C19135c(this.downstream, this));
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            onError(th);
        }
    }
}
