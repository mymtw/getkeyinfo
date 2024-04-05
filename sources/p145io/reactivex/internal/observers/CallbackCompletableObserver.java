package p145io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.OnErrorNotImplementedException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.observers.CallbackCompletableObserver */
public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements C8050c, Disposable, Consumer<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    public final C8333a onComplete;
    public final Consumer<? super Throwable> onError;

    public CallbackCompletableObserver(C8333a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != this;
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            C18981a.m32123b(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            C18981a.m32123b(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void accept(Throwable th) {
        C18981a.m32123b(new OnErrorNotImplementedException(th));
    }

    public CallbackCompletableObserver(Consumer<? super Throwable> consumer, C8333a aVar) {
        this.onError = consumer;
        this.onComplete = aVar;
    }
}
