package p145io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p287xp.C8333a;
import p287xp.C8340h;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.observers.ForEachWhileObserver */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final C8333a onComplete;
    public final Consumer<? super Throwable> onError;
    public final C8340h<? super T> onNext;

    public ForEachWhileObserver(C8340h<? super T> hVar, Consumer<? super Throwable> consumer, C8333a aVar) {
        this.onNext = hVar;
        this.onError = consumer;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            C18981a.m32123b(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                if (!this.onNext.test(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
