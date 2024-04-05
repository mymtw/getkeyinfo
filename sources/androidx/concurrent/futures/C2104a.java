package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;

/* renamed from: androidx.concurrent.futures.a */
public final class C2104a<V> extends AbstractResolvableFuture<V> {
    /* renamed from: h */
    public final boolean mo7999h(V v) {
        if (v == null) {
            v = AbstractResolvableFuture.f4740h;
        }
        if (!AbstractResolvableFuture.f4739g.mo7991b(this, (Object) null, v)) {
            return false;
        }
        AbstractResolvableFuture.m4528b(this);
        return true;
    }

    /* renamed from: i */
    public final boolean mo8000i(Throwable th) {
        if (!AbstractResolvableFuture.f4739g.mo7991b(this, (Object) null, new AbstractResolvableFuture.Failure(th))) {
            return false;
        }
        AbstractResolvableFuture.m4528b(this);
        return true;
    }
}
