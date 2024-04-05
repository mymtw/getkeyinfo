package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.a2 */
public final class C19467a2 implements C19857l<Throwable, C19394m> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43396e = AtomicIntegerFieldUpdater.newUpdater(C19467a2.class, "_state");
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: b */
    public final C19699g1 f43397b;

    /* renamed from: c */
    public final Thread f43398c = Thread.currentThread();

    /* renamed from: d */
    public C19766p0 f43399d;

    public C19467a2(C19699g1 g1Var) {
        this.f43397b = g1Var;
    }

    /* renamed from: b */
    public static void m33081b(int i) {
        throw new IllegalStateException(C19383o.m32802l(Integer.valueOf(i), "Illegal state ").toString());
    }

    /* renamed from: a */
    public final void mo72103a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m33081b(i);
                        throw null;
                    }
                }
            } else if (f43396e.compareAndSet(this, i, 1)) {
                C19766p0 p0Var = this.f43399d;
                if (p0Var != null) {
                    p0Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo72104c() {
        int i;
        this.f43399d = this.f43397b.mo72396f0(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i != 2 && i != 3) {
                    m33081b(i);
                    throw null;
                }
                return;
            }
        } while (!f43396e.compareAndSet(this, i, 0));
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        while (true) {
            int i = this._state;
            if (i == 0) {
                if (f43396e.compareAndSet(this, i, 2)) {
                    this.f43398c.interrupt();
                    this._state = 3;
                    break;
                }
            } else if (i != 1 && i != 2 && i != 3) {
                m33081b(i);
                throw null;
            }
        }
        return C19394m.f43287a;
    }
}
