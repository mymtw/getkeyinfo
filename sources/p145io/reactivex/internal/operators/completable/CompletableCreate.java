package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.CancellableDisposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8048a;
import p248tp.C8049b;
import p248tp.C8050c;
import p248tp.C8051d;
import p287xp.C8338f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableCreate */
public final class CompletableCreate extends C8048a {

    /* renamed from: b */
    public final C8051d f42602b;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableCreate$Emitter */
    public static final class Emitter extends AtomicReference<Disposable> implements C8049b, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        public final C8050c downstream;

        public Emitter(C8050c cVar) {
            this.downstream = cVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            Disposable disposable;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (disposable = (Disposable) getAndSet(disposableHelper)) != disposableHelper) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C18981a.m32123b(th);
            }
        }

        public void setCancellable(C8338f fVar) {
            setDisposable(new CancellableDisposable(fVar));
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{Emitter.class.getSimpleName(), super.toString()});
        }

        public boolean tryOnError(Throwable th) {
            Disposable disposable;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper || (disposable = (Disposable) getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        }
    }

    public CompletableCreate(C8051d dVar) {
        this.f42602b = dVar;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        Emitter emitter = new Emitter(cVar);
        cVar.onSubscribe(emitter);
        try {
            this.f42602b.mo10586d(emitter);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            emitter.onError(th);
        }
    }
}
