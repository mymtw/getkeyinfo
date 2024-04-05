package p313aq;

import java.util.concurrent.CountDownLatch;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8050c;
import p248tp.C8058k;
import p248tp.C8073u;

/* renamed from: aq.c */
public final class C8538c<T> extends CountDownLatch implements C8073u<T>, C8050c, C8058k<T> {

    /* renamed from: b */
    public T f18599b;

    /* renamed from: c */
    public Throwable f18600c;

    /* renamed from: d */
    public Disposable f18601d;

    /* renamed from: e */
    public volatile boolean f18602e;

    public C8538c() {
        super(1);
    }

    public final void onComplete() {
        countDown();
    }

    public final void onError(Throwable th) {
        this.f18600c = th;
        countDown();
    }

    public final void onSubscribe(Disposable disposable) {
        this.f18601d = disposable;
        if (this.f18602e) {
            disposable.dispose();
        }
    }

    public final void onSuccess(T t) {
        this.f18599b = t;
        countDown();
    }
}
