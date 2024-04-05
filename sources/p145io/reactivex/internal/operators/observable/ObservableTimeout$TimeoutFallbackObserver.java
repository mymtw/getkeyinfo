package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import p248tp.C8065q;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutFallbackObserver */
final class ObservableTimeout$TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, C19149b0 {
    private static final long serialVersionUID = -7508389464265974549L;
    public final Observer<? super T> downstream;
    public C8065q<? extends T> fallback;
    public final AtomicLong index;
    public final C8339g<? super T, ? extends C8065q<?>> itemTimeoutIndicator;
    public final SequentialDisposable task = new SequentialDisposable();
    public final AtomicReference<Disposable> upstream;

    public ObservableTimeout$TimeoutFallbackObserver(Observer<? super T> observer, C8339g<? super T, ? extends C8065q<?>> gVar, C8065q<? extends T> qVar) {
        this.downstream = observer;
        this.itemTimeoutIndicator = gVar;
        this.fallback = qVar;
        this.index = new AtomicLong();
        this.upstream = new AtomicReference<>();
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
        this.task.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.task.dispose();
        }
    }

    public void onError(Throwable th) {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onError(th);
            this.task.dispose();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        long j = this.index.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (this.index.compareAndSet(j, j2)) {
                Disposable disposable = (Disposable) this.task.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.downstream.onNext(t);
                try {
                    Object apply = this.itemTimeoutIndicator.apply(t);
                    C12965a.m20650b(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    C8065q qVar = (C8065q) apply;
                    ObservableTimeout$TimeoutConsumer observableTimeout$TimeoutConsumer = new ObservableTimeout$TimeoutConsumer(j2, this);
                    if (this.task.replace(observableTimeout$TimeoutConsumer)) {
                        qVar.subscribe(observableTimeout$TimeoutConsumer);
                    }
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.upstream.get().dispose();
                    this.index.getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void onTimeout(long j) {
        if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this.upstream);
            C8065q<? extends T> qVar = this.fallback;
            this.fallback = null;
            qVar.subscribe(new ObservableTimeoutTimed.C19140a(this.downstream, this));
        }
    }

    public void onTimeoutError(long j, Throwable th) {
        if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this);
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void startFirstTimeout(C8065q<?> qVar) {
        if (qVar != null) {
            ObservableTimeout$TimeoutConsumer observableTimeout$TimeoutConsumer = new ObservableTimeout$TimeoutConsumer(0, this);
            if (this.task.replace(observableTimeout$TimeoutConsumer)) {
                qVar.subscribe(observableTimeout$TimeoutConsumer);
            }
        }
    }
}
