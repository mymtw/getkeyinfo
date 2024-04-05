package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver */
final class ObservableReplay$ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public static final ObservableReplay$InnerDisposable[] EMPTY = new ObservableReplay$InnerDisposable[0];
    public static final ObservableReplay$InnerDisposable[] TERMINATED = new ObservableReplay$InnerDisposable[0];
    private static final long serialVersionUID = -533785617179540163L;
    public final C19183t<T> buffer;
    public boolean done;
    public final AtomicReference<ObservableReplay$InnerDisposable[]> observers = new AtomicReference<>(EMPTY);
    public final AtomicBoolean shouldConnect = new AtomicBoolean();

    public ObservableReplay$ReplayObserver(C19183t<T> tVar) {
        this.buffer = tVar;
    }

    public boolean add(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        boolean z;
        do {
            ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr = this.observers.get();
            z = false;
            if (observableReplay$InnerDisposableArr != TERMINATED) {
                int length = observableReplay$InnerDisposableArr.length;
                ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr2 = new ObservableReplay$InnerDisposable[(length + 1)];
                System.arraycopy(observableReplay$InnerDisposableArr, 0, observableReplay$InnerDisposableArr2, 0, length);
                observableReplay$InnerDisposableArr2[length] = observableReplay$InnerDisposable;
                AtomicReference<ObservableReplay$InnerDisposable[]> atomicReference = this.observers;
                while (true) {
                    if (!atomicReference.compareAndSet(observableReplay$InnerDisposableArr, observableReplay$InnerDisposableArr2)) {
                        if (atomicReference.get() != observableReplay$InnerDisposableArr) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    public void dispose() {
        this.observers.set(TERMINATED);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.observers.get() == TERMINATED;
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.buffer.complete();
            replayFinal();
        }
    }

    public void onError(Throwable th) {
        if (!this.done) {
            this.done = true;
            this.buffer.error(th);
            replayFinal();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onNext(T t) {
        if (!this.done) {
            this.buffer.next(t);
            replay();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            replay();
        }
    }

    public void remove(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        boolean z;
        ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr;
        do {
            ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr2 = this.observers.get();
            int length = observableReplay$InnerDisposableArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (observableReplay$InnerDisposableArr2[i2].equals(observableReplay$InnerDisposable)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        observableReplay$InnerDisposableArr = EMPTY;
                    } else {
                        ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr3 = new ObservableReplay$InnerDisposable[(length - 1)];
                        System.arraycopy(observableReplay$InnerDisposableArr2, 0, observableReplay$InnerDisposableArr3, 0, i);
                        System.arraycopy(observableReplay$InnerDisposableArr2, i + 1, observableReplay$InnerDisposableArr3, i, (length - i) - 1);
                        observableReplay$InnerDisposableArr = observableReplay$InnerDisposableArr3;
                    }
                    AtomicReference<ObservableReplay$InnerDisposable[]> atomicReference = this.observers;
                    while (true) {
                        if (!atomicReference.compareAndSet(observableReplay$InnerDisposableArr2, observableReplay$InnerDisposableArr)) {
                            if (atomicReference.get() != observableReplay$InnerDisposableArr2) {
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!z);
    }

    public void replay() {
        for (ObservableReplay$InnerDisposable replay : this.observers.get()) {
            this.buffer.replay(replay);
        }
    }

    public void replayFinal() {
        for (ObservableReplay$InnerDisposable replay : this.observers.getAndSet(TERMINATED)) {
            this.buffer.replay(replay);
        }
    }
}
