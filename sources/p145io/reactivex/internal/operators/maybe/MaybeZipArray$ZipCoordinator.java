package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8058k;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeZipArray$ZipCoordinator */
final class MaybeZipArray$ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
    private static final long serialVersionUID = -5556924161382950569L;
    public final C8058k<? super R> downstream;
    public final MaybeZipArray$ZipMaybeObserver<T>[] observers;
    public final Object[] values;
    public final C8339g<? super Object[], ? extends R> zipper;

    public MaybeZipArray$ZipCoordinator(C8058k<? super R> kVar, int i, C8339g<? super Object[], ? extends R> gVar) {
        super(i);
        this.downstream = kVar;
        this.zipper = gVar;
        MaybeZipArray$ZipMaybeObserver<T>[] maybeZipArray$ZipMaybeObserverArr = new MaybeZipArray$ZipMaybeObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            maybeZipArray$ZipMaybeObserverArr[i2] = new MaybeZipArray$ZipMaybeObserver<>(this, i2);
        }
        this.observers = maybeZipArray$ZipMaybeObserverArr;
        this.values = new Object[i];
    }

    public void dispose() {
        if (getAndSet(0) > 0) {
            for (MaybeZipArray$ZipMaybeObserver<T> dispose : this.observers) {
                dispose.dispose();
            }
        }
    }

    public void disposeExcept(int i) {
        MaybeZipArray$ZipMaybeObserver<T>[] maybeZipArray$ZipMaybeObserverArr = this.observers;
        int length = maybeZipArray$ZipMaybeObserverArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            maybeZipArray$ZipMaybeObserverArr[i2].dispose();
        }
        while (true) {
            i++;
            if (i < length) {
                maybeZipArray$ZipMaybeObserverArr[i].dispose();
            } else {
                return;
            }
        }
    }

    public void innerComplete(int i) {
        if (getAndSet(0) > 0) {
            disposeExcept(i);
            this.downstream.onComplete();
        }
    }

    public void innerError(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            disposeExcept(i);
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public void innerSuccess(T t, int i) {
        this.values[i] = t;
        if (decrementAndGet() == 0) {
            try {
                Object apply = this.zipper.apply(this.values);
                C12965a.m20650b(apply, "The zipper returned a null value");
                this.downstream.onSuccess(apply);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.downstream.onError(th);
            }
        }
    }

    public boolean isDisposed() {
        return get() <= 0;
    }
}
