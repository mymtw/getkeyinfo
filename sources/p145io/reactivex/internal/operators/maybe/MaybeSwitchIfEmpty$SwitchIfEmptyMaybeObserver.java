package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8059l;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver */
final class MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = -2223459372976438024L;
    public final C8058k<? super T> downstream;
    public final C8059l<? extends T> other;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver$a */
    public static final class C19131a<T> implements C8058k<T> {

        /* renamed from: b */
        public final C8058k<? super T> f42710b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f42711c;

        public C19131a(C8058k<? super T> kVar, AtomicReference<Disposable> atomicReference) {
            this.f42710b = kVar;
            this.f42711c = atomicReference;
        }

        public final void onComplete() {
            this.f42710b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42710b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f42711c, disposable);
        }

        public final void onSuccess(T t) {
            this.f42710b.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver(C8058k<? super T> kVar, C8059l<? extends T> lVar) {
        this.downstream = kVar;
        this.other = lVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        Disposable disposable = (Disposable) get();
        if (disposable != DisposableHelper.DISPOSED && compareAndSet(disposable, (Object) null)) {
            this.other.mo20624a(new C19131a(this.downstream, this));
        }
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
        this.downstream.onSuccess(t);
    }
}
