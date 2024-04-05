package p145io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p248tp.C8073u;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.SingleDoOnDispose$DoOnDisposeObserver */
final class SingleDoOnDispose$DoOnDisposeObserver<T> extends AtomicReference<C8333a> implements C8073u<T>, Disposable {
    private static final long serialVersionUID = -8583764624474935784L;
    public final C8073u<? super T> downstream;
    public Disposable upstream;

    public SingleDoOnDispose$DoOnDisposeObserver(C8073u<? super T> uVar, C8333a aVar) {
        this.downstream = uVar;
        lazySet(aVar);
    }

    public void dispose() {
        C8333a aVar = (C8333a) getAndSet((Object) null);
        if (aVar != null) {
            try {
                aVar.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
            this.upstream.dispose();
        }
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }

    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
