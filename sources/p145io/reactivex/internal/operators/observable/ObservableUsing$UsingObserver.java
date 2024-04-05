package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableUsing$UsingObserver */
final class ObservableUsing$UsingObserver<T, D> extends AtomicBoolean implements Observer<T>, Disposable {
    private static final long serialVersionUID = 5904473792286235046L;
    public final Consumer<? super D> disposer;
    public final Observer<? super T> downstream;
    public final boolean eager;
    public final D resource;
    public Disposable upstream;

    public ObservableUsing$UsingObserver(Observer<? super T> observer, D d, Consumer<? super D> consumer, boolean z) {
        this.downstream = observer;
        this.resource = d;
        this.disposer = consumer;
        this.eager = z;
    }

    public void dispose() {
        disposeAfter();
        this.upstream.dispose();
    }

    public void disposeAfter() {
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public boolean isDisposed() {
        return get();
    }

    public void onComplete() {
        if (this.eager) {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.downstream.onError(th);
                    return;
                }
            }
            this.upstream.dispose();
            this.downstream.onComplete();
            return;
        }
        this.downstream.onComplete();
        this.upstream.dispose();
        disposeAfter();
    }

    public void onError(Throwable th) {
        if (this.eager) {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.upstream.dispose();
            this.downstream.onError(th);
            return;
        }
        this.downstream.onError(th);
        this.upstream.dispose();
        disposeAfter();
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
