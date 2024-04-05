package p145io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8073u;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.observers.ConsumerSingleObserver */
public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = -7012088219455310787L;
    public final Consumer<? super Throwable> onError;
    public final Consumer<? super T> onSuccess;

    public ConsumerSingleObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.f28541e;
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
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
