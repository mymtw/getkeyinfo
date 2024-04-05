package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p248tp.C8059l;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver */
final class MaybeFlatMapNotification$FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = 4375739915521278546L;
    public final C8058k<? super R> downstream;
    public final Callable<? extends C8059l<? extends R>> onCompleteSupplier;
    public final C8339g<? super Throwable, ? extends C8059l<? extends R>> onErrorMapper;
    public final C8339g<? super T, ? extends C8059l<? extends R>> onSuccessMapper;
    public Disposable upstream;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$FlatMapMaybeObserver$a */
    public final class C19128a implements C8058k<R> {
        public C19128a() {
        }

        public final void onComplete() {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(MaybeFlatMapNotification$FlatMapMaybeObserver.this, disposable);
        }

        public final void onSuccess(R r) {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onSuccess(r);
        }
    }

    public MaybeFlatMapNotification$FlatMapMaybeObserver(C8058k<? super R> kVar, C8339g<? super T, ? extends C8059l<? extends R>> gVar, C8339g<? super Throwable, ? extends C8059l<? extends R>> gVar2, Callable<? extends C8059l<? extends R>> callable) {
        this.downstream = kVar;
        this.onSuccessMapper = gVar;
        this.onErrorMapper = gVar2;
        this.onCompleteSupplier = callable;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        this.upstream.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        try {
            Object call = this.onCompleteSupplier.call();
            C12965a.m20650b(call, "The onCompleteSupplier returned a null MaybeSource");
            ((C8059l) call).mo20624a(new C19128a());
        } catch (Exception e) {
            C19421p.m32940h0(e);
            this.downstream.onError(e);
        }
    }

    public void onError(Throwable th) {
        try {
            Object apply = this.onErrorMapper.apply(th);
            C12965a.m20650b(apply, "The onErrorMapper returned a null MaybeSource");
            ((C8059l) apply).mo20624a(new C19128a());
        } catch (Exception e) {
            C19421p.m32940h0(e);
            this.downstream.onError(new CompositeException(th, e));
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        try {
            Object apply = this.onSuccessMapper.apply(t);
            C12965a.m20650b(apply, "The onSuccessMapper returned a null MaybeSource");
            ((C8059l) apply).mo20624a(new C19128a());
        } catch (Exception e) {
            C19421p.m32940h0(e);
            this.downstream.onError(e);
        }
    }
}
