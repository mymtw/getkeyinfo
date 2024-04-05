package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p248tp.C8059l;
import p248tp.C8073u;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapMaybe$FlatMapSingleObserver */
final class SingleFlatMapMaybe$FlatMapSingleObserver<T, R> extends AtomicReference<Disposable> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = -5843758257109742742L;
    public final C8058k<? super R> downstream;
    public final C8339g<? super T, ? extends C8059l<? extends R>> mapper;

    public SingleFlatMapMaybe$FlatMapSingleObserver(C8058k<? super R> kVar, C8339g<? super T, ? extends C8059l<? extends R>> gVar) {
        this.downstream = kVar;
        this.mapper = gVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
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
            C12965a.m20650b(apply, "The mapper returned a null MaybeSource");
            C8059l lVar = (C8059l) apply;
            if (!isDisposed()) {
                lVar.mo20624a(new C19205g(this.downstream, this));
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            onError(th);
        }
    }
}
