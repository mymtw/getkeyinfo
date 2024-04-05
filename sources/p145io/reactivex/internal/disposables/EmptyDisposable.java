package p145io.reactivex.internal.disposables;

import p145io.reactivex.Observer;
import p248tp.C8050c;
import p248tp.C8058k;
import p248tp.C8073u;
import p503zp.C13968d;

/* renamed from: io.reactivex.internal.disposables.EmptyDisposable */
public enum EmptyDisposable implements C13968d<Object> {
    INSTANCE,
    NEVER;

    public static void complete(Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable th, Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(th);
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C8058k<?> kVar) {
        kVar.onSubscribe(INSTANCE);
        kVar.onComplete();
    }

    public static void error(Throwable th, C8050c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public static void complete(C8050c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, C8073u<?> uVar) {
        uVar.onSubscribe(INSTANCE);
        uVar.onError(th);
    }

    public static void error(Throwable th, C8058k<?> kVar) {
        kVar.onSubscribe(INSTANCE);
        kVar.onError(th);
    }
}
