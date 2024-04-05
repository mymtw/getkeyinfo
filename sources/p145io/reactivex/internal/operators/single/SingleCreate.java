package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.CancellableDisposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8071s;
import p248tp.C8072t;
import p248tp.C8073u;
import p248tp.C8074v;
import p287xp.C8338f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleCreate */
public final class SingleCreate<T> extends C8071s<T> {

    /* renamed from: b */
    public final C8074v<T> f42891b;

    /* renamed from: io.reactivex.internal.operators.single.SingleCreate$Emitter */
    public static final class Emitter<T> extends AtomicReference<Disposable> implements C8072t<T>, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        public final C8073u<? super T> downstream;

        public Emitter(C8073u<? super T> uVar) {
            this.downstream = uVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C18981a.m32123b(th);
            }
        }

        public void onSuccess(T t) {
            Disposable disposable;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (disposable = (Disposable) getAndSet(disposableHelper)) != disposableHelper) {
                if (t == null) {
                    try {
                        this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.downstream.onSuccess(t);
                }
                if (disposable != null) {
                    disposable.dispose();
                }
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

    public SingleCreate(C8074v<T> vVar) {
        this.f42891b = vVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        Emitter emitter = new Emitter(uVar);
        uVar.onSubscribe(emitter);
        try {
            this.f42891b.mo11996f(emitter);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            emitter.onError(th);
        }
    }
}
