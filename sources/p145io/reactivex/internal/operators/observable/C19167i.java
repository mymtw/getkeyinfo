package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.DeferredScalarDisposable;
import p248tp.C8061n;
import p306z8.C8479f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.i */
public final class C19167i<T> extends C8061n<T> implements Callable<T> {

    /* renamed from: b */
    public final Callable<? extends T> f42842b;

    public C19167i(C8479f fVar) {
        this.f42842b = fVar;
    }

    public final T call() throws Exception {
        T call = this.f42842b.call();
        C12965a.m20650b(call, "The callable returned a null value");
        return call;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                Object call = this.f42842b.call();
                C12965a.m20650b(call, "Callable returned null");
                deferredScalarDisposable.complete(call);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                if (!deferredScalarDisposable.isDisposed()) {
                    observer.onError(th);
                } else {
                    C18981a.m32123b(th);
                }
            }
        }
    }
}
