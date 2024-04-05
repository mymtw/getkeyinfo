package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p248tp.C8058k;
import p248tp.C8059l;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$OtherObserver */
final class MaybeDelayWithCompletable$OtherObserver<T> extends AtomicReference<Disposable> implements C8050c, Disposable {
    private static final long serialVersionUID = 703409937383992161L;
    public final C8058k<? super T> downstream;
    public final C8059l<T> source;

    public MaybeDelayWithCompletable$OtherObserver(C8058k<? super T> kVar, C8059l<T> lVar) {
        this.downstream = kVar;
        this.source = lVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.source.mo20624a(new C19133a(this.downstream, this));
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }
}
