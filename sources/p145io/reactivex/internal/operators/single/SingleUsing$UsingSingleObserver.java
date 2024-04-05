package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleUsing$UsingSingleObserver */
final class SingleUsing$UsingSingleObserver<T, U> extends AtomicReference<Object> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = -5331524057054083935L;
    public final Consumer<? super U> disposer;
    public final C8073u<? super T> downstream;
    public final boolean eager;
    public Disposable upstream;

    public SingleUsing$UsingSingleObserver(C8073u<? super T> uVar, U u, boolean z, Consumer<? super U> consumer) {
        super(u);
        this.downstream = uVar;
        this.eager = z;
        this.disposer = consumer;
    }

    public void dispose() {
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
        disposeAfter();
    }

    public void disposeAfter() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.disposer.accept(andSet);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        if (this.eager) {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    th = new CompositeException(th, th2);
                }
            } else {
                return;
            }
        }
        this.downstream.onError(th);
        if (!this.eager) {
            disposeAfter();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.upstream = DisposableHelper.DISPOSED;
        if (this.eager) {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.downstream.onError(th);
                    return;
                }
            } else {
                return;
            }
        }
        this.downstream.onSuccess(t);
        if (!this.eager) {
            disposeAfter();
        }
    }
}
