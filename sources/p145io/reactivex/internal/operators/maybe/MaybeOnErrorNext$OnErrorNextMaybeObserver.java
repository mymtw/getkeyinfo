package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p248tp.C8059l;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver */
final class MaybeOnErrorNext$OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = 2026620218879969836L;
    public final boolean allowFatal;
    public final C8058k<? super T> downstream;
    public final C8339g<? super Throwable, ? extends C8059l<? extends T>> resumeFunction;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver$a */
    public static final class C19130a<T> implements C8058k<T> {

        /* renamed from: b */
        public final C8058k<? super T> f42708b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f42709c;

        public C19130a(C8058k<? super T> kVar, AtomicReference<Disposable> atomicReference) {
            this.f42708b = kVar;
            this.f42709c = atomicReference;
        }

        public final void onComplete() {
            this.f42708b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42708b.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f42709c, disposable);
        }

        public final void onSuccess(T t) {
            this.f42708b.onSuccess(t);
        }
    }

    public MaybeOnErrorNext$OnErrorNextMaybeObserver(C8058k<? super T> kVar, C8339g<? super Throwable, ? extends C8059l<? extends T>> gVar, boolean z) {
        this.downstream = kVar;
        this.resumeFunction = gVar;
        this.allowFatal = z;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        if (this.allowFatal || (th instanceof Exception)) {
            try {
                Object apply = this.resumeFunction.apply(th);
                C12965a.m20650b(apply, "The resumeFunction returned a null MaybeSource");
                C8059l lVar = (C8059l) apply;
                DisposableHelper.replace(this, (Disposable) null);
                lVar.mo20624a(new C19130a(this.downstream, this));
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        } else {
            this.downstream.onError(th);
        }
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
