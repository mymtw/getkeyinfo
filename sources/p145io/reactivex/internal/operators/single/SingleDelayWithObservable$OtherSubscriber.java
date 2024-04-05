package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p248tp.C8075w;
import p313aq.C8541f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleDelayWithObservable$OtherSubscriber */
final class SingleDelayWithObservable$OtherSubscriber<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {
    private static final long serialVersionUID = -8565274649390031272L;
    public boolean done;
    public final C8073u<? super T> downstream;
    public final C8075w<T> source;

    public SingleDelayWithObservable$OtherSubscriber(C8073u<? super T> uVar, C8075w<T> wVar) {
        this.downstream = uVar;
        this.source = wVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.source.mo20655a(new C8541f(this.downstream, this));
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        this.downstream.onError(th);
    }

    public void onNext(U u) {
        ((Disposable) get()).dispose();
        onComplete();
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.set(this, disposable)) {
            this.downstream.onSubscribe(this);
        }
    }
}
