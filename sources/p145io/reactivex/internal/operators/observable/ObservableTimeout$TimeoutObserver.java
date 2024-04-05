package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8065q;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver */
final class ObservableTimeout$TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, C19149b0 {
    private static final long serialVersionUID = 3764492702657003550L;
    public final Observer<? super T> downstream;
    public final C8339g<? super T, ? extends C8065q<?>> itemTimeoutIndicator;
    public final SequentialDisposable task = new SequentialDisposable();
    public final AtomicReference<Disposable> upstream = new AtomicReference<>();

    public ObservableTimeout$TimeoutObserver(Observer<? super T> observer, C8339g<? super T, ? extends C8065q<?>> gVar) {
        this.downstream = observer;
        this.itemTimeoutIndicator = gVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        this.task.dispose();
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
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
                    getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void onTimeout(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(new TimeoutException());
        }
    }

    public void onTimeoutError(long j, Throwable th) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this.upstream);
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
