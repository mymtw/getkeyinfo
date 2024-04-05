package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableUsing$UsingObserver */
final class CompletableUsing$UsingObserver<R> extends AtomicReference<Object> implements C8050c, Disposable {
    private static final long serialVersionUID = -674404550052917487L;
    public final Consumer<? super R> disposer;
    public final C8050c downstream;
    public final boolean eager;
    public Disposable upstream;

    public CompletableUsing$UsingObserver(C8050c cVar, R r, Consumer<? super R> consumer, boolean z) {
        super(r);
        this.downstream = cVar;
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
}
