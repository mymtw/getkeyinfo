package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8065q;
import p287xp.C8339g;
import p514bk.C14088a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver */
final class ObservableWithLatestFromMany$WithLatestFromObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
    private static final long serialVersionUID = 1577321883966341961L;
    public final C8339g<? super Object[], R> combiner;
    public volatile boolean done;
    public final Observer<? super R> downstream;
    public final AtomicThrowable error;
    public final ObservableWithLatestFromMany$WithLatestInnerObserver[] observers;
    public final AtomicReference<Disposable> upstream;
    public final AtomicReferenceArray<Object> values;

    public ObservableWithLatestFromMany$WithLatestFromObserver(Observer<? super R> observer, C8339g<? super Object[], R> gVar, int i) {
        this.downstream = observer;
        this.combiner = gVar;
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = new ObservableWithLatestFromMany$WithLatestInnerObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            observableWithLatestFromMany$WithLatestInnerObserverArr[i2] = new ObservableWithLatestFromMany$WithLatestInnerObserver(this, i2);
        }
        this.observers = observableWithLatestFromMany$WithLatestInnerObserverArr;
        this.values = new AtomicReferenceArray<>(i);
        this.upstream = new AtomicReference<>();
        this.error = new AtomicThrowable();
    }

    public void cancelAllBut(int i) {
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = this.observers;
        for (int i2 = 0; i2 < observableWithLatestFromMany$WithLatestInnerObserverArr.length; i2++) {
            if (i2 != i) {
                observableWithLatestFromMany$WithLatestInnerObserverArr[i2].dispose();
            }
        }
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        for (ObservableWithLatestFromMany$WithLatestInnerObserver dispose : this.observers) {
            dispose.dispose();
        }
    }

    public void innerComplete(int i, boolean z) {
        if (!z) {
            this.done = true;
            cancelAllBut(i);
            C14088a.m21789r(this.downstream, this, this.error);
        }
    }

    public void innerError(int i, Throwable th) {
        this.done = true;
        DisposableHelper.dispose(this.upstream);
        cancelAllBut(i);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }

    public void innerNext(int i, Object obj) {
        this.values.set(i, obj);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            cancelAllBut(-1);
            C14088a.m21789r(this.downstream, this, this.error);
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        C14088a.m21791t(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        if (!this.done) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[(length + 1)];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj != null) {
                    i++;
                    objArr[i] = obj;
                } else {
                    return;
                }
            }
            try {
                R apply = this.combiner.apply(objArr);
                C12965a.m20650b(apply, "combiner returned a null value");
                C14088a.m21793v(this.downstream, apply, this, this.error);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    public void subscribe(C8065q<?>[] qVarArr, int i) {
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = this.observers;
        AtomicReference<Disposable> atomicReference = this.upstream;
        for (int i2 = 0; i2 < i && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i2++) {
            qVarArr[i2].subscribe(observableWithLatestFromMany$WithLatestInnerObserverArr[i2]);
        }
    }
}
