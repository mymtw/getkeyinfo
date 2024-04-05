package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C19543e0;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class C19718c<T> extends C19730n {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43657a = AtomicReferenceFieldUpdater.newUpdater(C19718c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C19543e0.f43496i;

    /* renamed from: a */
    public final C19718c<?> mo72435a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo72436c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C19543e0.f43496i) {
            obj2 = mo72444e(mo72160i(obj));
        }
        mo72434d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo72434d(T t, Object obj);

    /* renamed from: e */
    public final Object mo72444e(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        C19736t tVar = C19543e0.f43496i;
        if (obj2 != tVar) {
            return obj2;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43657a;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, obj)) {
                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z ? obj : this._consensus;
    }

    /* renamed from: f */
    public final Object mo72445f() {
        return this._consensus;
    }

    /* renamed from: g */
    public long mo72446g() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo72447h() {
        return this._consensus != C19543e0.f43496i;
    }

    /* renamed from: i */
    public abstract Object mo72160i(T t);
}
