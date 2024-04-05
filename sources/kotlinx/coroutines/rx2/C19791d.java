package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.C19511m;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8058k;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.rx2.d */
public final class C19791d<T> extends C19511m<T> implements Observer<T>, C8058k<T> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43758e = AtomicReferenceFieldUpdater.newUpdater(C19791d.class, Object.class, "_subscription");
    private volatile /* synthetic */ Object _subscription = null;

    public C19791d() {
        super((C19857l) null);
    }

    /* renamed from: k */
    public final void mo72198k() {
        Disposable disposable = (Disposable) f43758e.getAndSet(this, (Object) null);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void onComplete() {
        mo72187C((Throwable) null);
    }

    public final void onError(Throwable th) {
        mo72187C(th);
    }

    public final void onNext(T t) {
        mo72199l(t);
    }

    public final void onSubscribe(Disposable disposable) {
        this._subscription = disposable;
    }

    public final void onSuccess(T t) {
        mo72199l(t);
        mo72187C((Throwable) null);
    }
}
