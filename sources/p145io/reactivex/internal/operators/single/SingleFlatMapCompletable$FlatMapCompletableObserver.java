package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8073u;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapCompletable$FlatMapCompletableObserver */
final class SingleFlatMapCompletable$FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, C8050c, Disposable {
    private static final long serialVersionUID = -2177128922851101253L;
    public final C8050c downstream;
    public final C8339g<? super T, ? extends C8052e> mapper;

    public SingleFlatMapCompletable$FlatMapCompletableObserver(C8050c cVar, C8339g<? super T, ? extends C8052e> gVar) {
        this.downstream = cVar;
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
        DisposableHelper.replace(this, disposable);
    }

    public void onSuccess(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null CompletableSource");
            C8052e eVar = (C8052e) apply;
            if (!isDisposed()) {
                eVar.mo20607a(this);
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            onError(th);
        }
    }
}
