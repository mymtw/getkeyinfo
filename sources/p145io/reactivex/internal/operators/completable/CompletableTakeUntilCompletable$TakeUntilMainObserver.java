package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver */
final class CompletableTakeUntilCompletable$TakeUntilMainObserver extends AtomicReference<Disposable> implements C8050c, Disposable {
    private static final long serialVersionUID = 3533011714830024923L;
    public final C8050c downstream;
    public final AtomicBoolean once = new AtomicBoolean();
    public final OtherObserver other = new OtherObserver(this);

    /* renamed from: io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver */
    public static final class OtherObserver extends AtomicReference<Disposable> implements C8050c {
        private static final long serialVersionUID = 5176264485428790318L;
        public final CompletableTakeUntilCompletable$TakeUntilMainObserver parent;

        public OtherObserver(CompletableTakeUntilCompletable$TakeUntilMainObserver completableTakeUntilCompletable$TakeUntilMainObserver) {
            this.parent = completableTakeUntilCompletable$TakeUntilMainObserver;
        }

        public void onComplete() {
            this.parent.innerComplete();
        }

        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public CompletableTakeUntilCompletable$TakeUntilMainObserver(C8050c cVar) {
        this.downstream = cVar;
    }

    public void dispose() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
        }
    }

    public void innerComplete() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }
    }

    public void innerError(Throwable th) {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this);
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public boolean isDisposed() {
        return this.once.get();
    }

    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
