package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8058k;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeCallbackObserver */
public final class MaybeCallbackObserver<T> extends AtomicReference<Disposable> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = -6076952298809384986L;
    public final C8333a onComplete;
    public final Consumer<? super Throwable> onError;
    public final Consumer<? super T> onSuccess;

    public MaybeCallbackObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C8333a aVar) {
        this.onSuccess = consumer;
        this.onError = consumer2;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.f28541e;
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            C18981a.m32123b(th);
        }
    }

    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            C18981a.m32123b(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            C18981a.m32123b(th);
        }
    }
}
