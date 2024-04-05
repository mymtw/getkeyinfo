package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.C19511m;
import org.reactivestreams.Subscription;
import p753kq.C19857l;
import p762or.C20024c;

/* renamed from: kotlinx.coroutines.reactive.g */
public final class C19781g<T> extends C19511m<T> implements C20024c<T> {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43740f;

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43741g;
    private volatile /* synthetic */ int _requested;
    private volatile /* synthetic */ Object _subscription;

    /* renamed from: e */
    public final int f43742e;

    static {
        Class<C19781g> cls = C19781g.class;
        f43740f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_subscription");
        f43741g = AtomicIntegerFieldUpdater.newUpdater(cls, "_requested");
    }

    public C19781g(int i) {
        super((C19857l) null);
        this.f43742e = i;
        if (i >= 0) {
            this._subscription = null;
            this._requested = 0;
            return;
        }
        throw new IllegalArgumentException(C19383o.m32802l(Integer.valueOf(i), "Invalid request size: ").toString());
    }

    /* renamed from: D */
    public final void mo72129D() {
        f43741g.incrementAndGet(this);
    }

    /* renamed from: G */
    public final void mo72130G() {
        Subscription subscription;
        int i;
        while (true) {
            int i2 = this._requested;
            subscription = (Subscription) this._subscription;
            i = i2 - 1;
            if (subscription != null && i < 0) {
                int i3 = this.f43742e;
                if (i2 == i3 || f43741g.compareAndSet(this, i2, i3)) {
                    subscription.request((long) (this.f43742e - i));
                }
            } else if (f43741g.compareAndSet(this, i2, i)) {
                return;
            }
        }
        subscription.request((long) (this.f43742e - i));
    }

    /* renamed from: k */
    public final void mo72198k() {
        Subscription subscription = (Subscription) f43740f.getAndSet(this, (Object) null);
        if (subscription != null) {
            subscription.cancel();
        }
    }

    public final void onComplete() {
        mo72187C((Throwable) null);
    }

    public final void onError(Throwable th) {
        mo72187C(th);
    }

    public final void onNext(T t) {
        f43741g.decrementAndGet(this);
        mo72199l(t);
    }

    public final void onSubscribe(Subscription subscription) {
        this._subscription = subscription;
        while (!mo72189F()) {
            int i = this._requested;
            int i2 = this.f43742e;
            if (i < i2) {
                if (f43741g.compareAndSet(this, i, i2)) {
                    subscription.request((long) (this.f43742e - i));
                    return;
                }
            } else {
                return;
            }
        }
        subscription.cancel();
    }
}
