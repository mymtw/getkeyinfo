package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p248tp.C8075w;
import p313aq.C8541f;

/* renamed from: io.reactivex.internal.operators.single.SingleDelayWithSingle$OtherObserver */
final class SingleDelayWithSingle$OtherObserver<T, U> extends AtomicReference<Disposable> implements C8073u<U>, Disposable {
    private static final long serialVersionUID = -8565274649390031272L;
    public final C8073u<? super T> downstream;
    public final C8075w<T> source;

    public SingleDelayWithSingle$OtherObserver(C8073u<? super T> uVar, C8075w<T> wVar) {
        this.downstream = uVar;
        this.source = wVar;
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

    public void onSuccess(U u) {
        this.source.mo20655a(new C8541f(this.downstream, this));
    }
}
