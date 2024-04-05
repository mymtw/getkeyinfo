package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8073u;
import p248tp.C8075w;
import p287xp.C8339g;
import p313aq.C8541f;

/* renamed from: io.reactivex.internal.operators.single.SingleResumeNext$ResumeMainSingleObserver */
final class SingleResumeNext$ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = -5314538511045349925L;
    public final C8073u<? super T> downstream;
    public final C8339g<? super Throwable, ? extends C8075w<? extends T>> nextFunction;

    public SingleResumeNext$ResumeMainSingleObserver(C8073u<? super T> uVar, C8339g<? super Throwable, ? extends C8075w<? extends T>> gVar) {
        this.downstream = uVar;
        this.nextFunction = gVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onError(Throwable th) {
        try {
            Object apply = this.nextFunction.apply(th);
            C12965a.m20650b(apply, "The nextFunction returned a null SingleSource.");
            ((C8075w) apply).mo20655a(new C8541f(this.downstream, this));
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.downstream.onError(new CompositeException(th, th2));
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
