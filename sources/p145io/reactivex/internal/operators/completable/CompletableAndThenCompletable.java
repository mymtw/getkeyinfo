package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8048a;
import p248tp.C8050c;
import p248tp.C8052e;

/* renamed from: io.reactivex.internal.operators.completable.CompletableAndThenCompletable */
public final class CompletableAndThenCompletable extends C8048a {

    /* renamed from: b */
    public final C8052e f42596b;

    /* renamed from: c */
    public final C8052e f42597c;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableAndThenCompletable$SourceObserver */
    public static final class SourceObserver extends AtomicReference<Disposable> implements C8050c, Disposable {
        private static final long serialVersionUID = -4101678820158072998L;
        public final C8050c actualObserver;
        public final C8052e next;

        public SourceObserver(C8050c cVar, C8052e eVar) {
            this.actualObserver = cVar;
            this.next = eVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            this.next.mo20607a(new C19086a(this, this.actualObserver));
        }

        public void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.actualObserver.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableAndThenCompletable$a */
    public static final class C19086a implements C8050c {

        /* renamed from: b */
        public final AtomicReference<Disposable> f42598b;

        /* renamed from: c */
        public final C8050c f42599c;

        public C19086a(AtomicReference<Disposable> atomicReference, C8050c cVar) {
            this.f42598b = atomicReference;
            this.f42599c = cVar;
        }

        public final void onComplete() {
            this.f42599c.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42599c.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f42598b, disposable);
        }
    }

    public CompletableAndThenCompletable(C8052e eVar, C8052e eVar2) {
        this.f42596b = eVar;
        this.f42597c = eVar2;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        this.f42596b.mo20607a(new SourceObserver(cVar, this.f42597c));
    }
}
