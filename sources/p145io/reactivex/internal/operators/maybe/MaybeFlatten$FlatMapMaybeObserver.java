package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p248tp.C8059l;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver */
final class MaybeFlatten$FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = 4375739915521278546L;
    public final C8058k<? super R> downstream;
    public final C8339g<? super T, ? extends C8059l<? extends R>> mapper;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver$a */
    public final class C19129a implements C8058k<R> {
        public C19129a() {
        }

        public final void onComplete() {
            MaybeFlatten$FlatMapMaybeObserver.this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            MaybeFlatten$FlatMapMaybeObserver.this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(MaybeFlatten$FlatMapMaybeObserver.this, disposable);
        }

        public final void onSuccess(R r) {
            MaybeFlatten$FlatMapMaybeObserver.this.downstream.onSuccess(r);
        }
    }

    public MaybeFlatten$FlatMapMaybeObserver(C8058k<? super R> kVar, C8339g<? super T, ? extends C8059l<? extends R>> gVar) {
        this.downstream = kVar;
        this.mapper = gVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        this.upstream.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null MaybeSource");
            C8059l lVar = (C8059l) apply;
            if (!isDisposed()) {
                lVar.mo20624a(new C19129a());
            }
        } catch (Exception e) {
            C19421p.m32940h0(e);
            this.downstream.onError(e);
        }
    }
}
