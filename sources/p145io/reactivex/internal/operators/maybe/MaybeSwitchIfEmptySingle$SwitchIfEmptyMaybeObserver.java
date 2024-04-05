package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver */
final class MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = 4603919676453758899L;
    public final C8073u<? super T> downstream;
    public final C8075w<? extends T> other;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver$a */
    public static final class C19132a<T> implements C8073u<T> {

        /* renamed from: b */
        public final C8073u<? super T> f42712b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f42713c;

        public C19132a(C8073u<? super T> uVar, AtomicReference<Disposable> atomicReference) {
            this.f42712b = uVar;
            this.f42713c = atomicReference;
        }

        public final void onError(Throwable th) {
            this.f42712b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f42713c, disposable);
        }

        public final void onSuccess(T t) {
            this.f42712b.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver(C8073u<? super T> uVar, C8075w<? extends T> wVar) {
        this.downstream = uVar;
        this.other = wVar;
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
            this.other.mo20655a(new C19132a(this.downstream, this));
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
