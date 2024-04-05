package androidx.work.impl.utils.futures;

import androidx.work.impl.utils.futures.AbstractFuture;
import com.google.common.util.concurrent.C16388l;

/* renamed from: androidx.work.impl.utils.futures.a */
public final class C3419a<V> extends AbstractFuture<V> {
    /* renamed from: i */
    public final boolean mo12917i(V v) {
        if (v == null) {
            v = AbstractFuture.f7991h;
        }
        if (!AbstractFuture.f7990g.mo12910b(this, (Object) null, v)) {
            return false;
        }
        AbstractFuture.m8178b(this);
        return true;
    }

    /* renamed from: j */
    public final boolean mo12918j(Throwable th) {
        th.getClass();
        if (!AbstractFuture.f7990g.mo12910b(this, (Object) null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.m8178b(this);
        return true;
    }

    /* renamed from: k */
    public final boolean mo12919k(C16388l<? extends V> lVar) {
        AbstractFuture.C3416e eVar;
        AbstractFuture.Failure failure;
        lVar.getClass();
        Object obj = this.f7992b;
        if (obj == null) {
            if (lVar.isDone()) {
                if (!AbstractFuture.f7990g.mo12910b(this, (Object) null, AbstractFuture.m8180f(lVar))) {
                    return false;
                }
                AbstractFuture.m8178b(this);
            } else {
                eVar = new AbstractFuture.C3416e(this, lVar);
                if (AbstractFuture.f7990g.mo12910b(this, (Object) null, eVar)) {
                    try {
                        lVar.mo7981e(eVar, DirectExecutor.INSTANCE);
                    } catch (Throwable unused) {
                        failure = AbstractFuture.Failure.f7995b;
                    }
                } else {
                    obj = this.f7992b;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.C3413b)) {
            return false;
        }
        lVar.cancel(((AbstractFuture.C3413b) obj).f7999a);
        return false;
        AbstractFuture.f7990g.mo12910b(this, eVar, failure);
        return true;
    }
}
