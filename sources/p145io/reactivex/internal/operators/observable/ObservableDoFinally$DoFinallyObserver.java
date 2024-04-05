package p145io.reactivex.internal.operators.observable;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.observers.BasicIntQueueDisposable;
import p287xp.C8333a;
import p503zp.C13968d;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableDoFinally$DoFinallyObserver */
final class ObservableDoFinally$DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
    private static final long serialVersionUID = 4109457741734051389L;
    public final Observer<? super T> downstream;
    public final C8333a onFinally;

    /* renamed from: qd */
    public C13968d<T> f42739qd;
    public boolean syncFused;
    public Disposable upstream;

    public ObservableDoFinally$DoFinallyObserver(Observer<? super T> observer, C8333a aVar) {
        this.downstream = observer;
        this.onFinally = aVar;
    }

    public void clear() {
        this.f42739qd.clear();
    }

    public void dispose() {
        this.upstream.dispose();
        runFinally();
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    public boolean isEmpty() {
        return this.f42739qd.isEmpty();
    }

    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            if (disposable instanceof C13968d) {
                this.f42739qd = (C13968d) disposable;
            }
            this.downstream.onSubscribe(this);
        }
    }

    public T poll() throws Exception {
        T poll = this.f42739qd.poll();
        if (poll == null && this.syncFused) {
            runFinally();
        }
        return poll;
    }

    public int requestFusion(int i) {
        C13968d<T> dVar = this.f42739qd;
        boolean z = false;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            if (requestFusion == 1) {
                z = true;
            }
            this.syncFused = z;
        }
        return requestFusion;
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
