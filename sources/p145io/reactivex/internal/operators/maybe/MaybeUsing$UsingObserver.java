package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8058k;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeUsing$UsingObserver */
final class MaybeUsing$UsingObserver<T, D> extends AtomicReference<Object> implements C8058k<T>, Disposable {
    private static final long serialVersionUID = -674404550052917487L;
    public final Consumer<? super D> disposer;
    public final C8058k<? super T> downstream;
    public final boolean eager;
    public Disposable upstream;

    public MaybeUsing$UsingObserver(C8058k<? super T> kVar, D d, Consumer<? super D> consumer, boolean z) {
        super(d);
        this.downstream = kVar;
        this.disposer = consumer;
        this.eager = z;
    }

    public void dispose() {
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
        disposeResourceAfter();
    }

    public void disposeResourceAfter() {
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

    public void onComplete() {
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
        this.downstream.onComplete();
        if (!this.eager) {
            disposeResourceAfter();
        }
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
            disposeResourceAfter();
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
            disposeResourceAfter();
        }
    }
}
