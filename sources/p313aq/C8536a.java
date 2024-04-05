package p313aq;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p503zp.C13968d;
import p736cq.C18981a;

/* renamed from: aq.a */
public abstract class C8536a<T, R> implements Observer<T>, C13968d<R> {

    /* renamed from: b */
    public final Observer<? super R> f18594b;

    /* renamed from: c */
    public Disposable f18595c;

    /* renamed from: d */
    public C13968d<T> f18596d;

    /* renamed from: e */
    public boolean f18597e;

    /* renamed from: f */
    public int f18598f;

    public C8536a(Observer<? super R> observer) {
        this.f18594b = observer;
    }

    /* renamed from: a */
    public final int mo21062a(int i) {
        C13968d<T> dVar = this.f18596d;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f18598f = requestFusion;
        }
        return requestFusion;
    }

    public final void clear() {
        this.f18596d.clear();
    }

    public final void dispose() {
        this.f18595c.dispose();
    }

    public final boolean isDisposed() {
        return this.f18595c.isDisposed();
    }

    public final boolean isEmpty() {
        return this.f18596d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onComplete() {
        if (!this.f18597e) {
            this.f18597e = true;
            this.f18594b.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.f18597e) {
            C18981a.m32123b(th);
            return;
        }
        this.f18597e = true;
        this.f18594b.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f18595c, disposable)) {
            this.f18595c = disposable;
            if (disposable instanceof C13968d) {
                this.f18596d = (C13968d) disposable;
            }
            this.f18594b.onSubscribe(this);
        }
    }
}
