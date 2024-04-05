package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8050c;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableDoFinally$DoFinallyObserver */
final class CompletableDoFinally$DoFinallyObserver extends AtomicInteger implements C8050c, Disposable {
    private static final long serialVersionUID = 4109457741734051389L;
    public final C8050c downstream;
    public final C8333a onFinally;
    public Disposable upstream;

    public CompletableDoFinally$DoFinallyObserver(C8050c cVar, C8333a aVar) {
        this.downstream = cVar;
        this.onFinally = aVar;
    }

    public void dispose() {
        this.upstream.dispose();
        runFinally();
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }
}
