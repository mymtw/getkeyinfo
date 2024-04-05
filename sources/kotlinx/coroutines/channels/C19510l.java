package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.C19805f;
import kotlinx.coroutines.selects.C19806g;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.l */
public final class C19510l<E> extends AbstractChannel<E> {

    /* renamed from: e */
    public final ReentrantLock f43453e = new ReentrantLock();

    /* renamed from: f */
    public Object f43454f = C17782b.f38643n;

    public C19510l(C19857l<? super E, C19394m> lVar) {
        super(lVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    public final void mo72127A(boolean z) {
        ReentrantLock reentrantLock = this.f43453e;
        reentrantLock.lock();
        try {
            C19736t tVar = C17782b.f38643n;
            Object obj = this.f43454f;
            UndeliveredElementException undeliveredElementException = null;
            if (obj != tVar) {
                C19857l<E, C19394m> lVar = this.f43435b;
                if (lVar != null) {
                    undeliveredElementException = OnUndeliveredElementKt.m33527b(lVar, obj, (UndeliveredElementException) null);
                }
            }
            this.f43454f = tVar;
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            super.mo72127A(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: H */
    public final Object mo72131H() {
        ReentrantLock reentrantLock = this.f43453e;
        reentrantLock.lock();
        try {
            Object obj = this.f43454f;
            C19736t tVar = C17782b.f38643n;
            if (obj == tVar) {
                Object f = mo72193f();
                if (f == null) {
                    f = C17782b.f38646q;
                }
                return f;
            }
            this.f43454f = tVar;
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: I */
    public final Object mo72132I(C19805f<?> fVar) {
        ReentrantLock reentrantLock = this.f43453e;
        reentrantLock.lock();
        try {
            Object obj = this.f43454f;
            C19736t tVar = C17782b.f38643n;
            if (obj == tVar) {
                Object f = mo72193f();
                if (f == null) {
                    f = C17782b.f38646q;
                }
                return f;
            } else if (!fVar.mo72634k()) {
                C19736t tVar2 = C19806g.f43791b;
                reentrantLock.unlock();
                return tVar2;
            } else {
                Object obj2 = this.f43454f;
                this.f43454f = tVar;
                C19394m mVar = C19394m.f43287a;
                reentrantLock.unlock();
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final String mo72192e() {
        return C0073e.m209i(C0072d.m201h("(value="), this.f43454f, ')');
    }

    /* renamed from: h */
    public final boolean mo72195h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo72196i() {
        return false;
    }

    public final boolean isEmpty() {
        ReentrantLock reentrantLock = this.f43453e;
        reentrantLock.lock();
        try {
            return mo72147z();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final Object mo72197j(E e) {
        C19516r m;
        ReentrantLock reentrantLock = this.f43453e;
        reentrantLock.lock();
        try {
            C19509k<?> f = mo72193f();
            if (f == null) {
                if (this.f43454f == C17782b.f38643n) {
                    do {
                        m = mo72137m();
                        if (m != null) {
                            if (m instanceof C19509k) {
                                reentrantLock.unlock();
                                return m;
                            }
                        }
                    } while (m.mo72151a(e) == null);
                    C19394m mVar = C19394m.f43287a;
                    reentrantLock.unlock();
                    m.mo72152g(e);
                    return m.mo72216b();
                }
                Object obj = this.f43454f;
                UndeliveredElementException undeliveredElementException = null;
                if (obj != C17782b.f38643n) {
                    C19857l<E, C19394m> lVar = this.f43435b;
                    if (lVar != null) {
                        undeliveredElementException = OnUndeliveredElementKt.m33527b(lVar, obj, (UndeliveredElementException) null);
                    }
                }
                this.f43454f = e;
                if (undeliveredElementException == null) {
                    C19736t tVar = C17782b.f38644o;
                    reentrantLock.unlock();
                    return tVar;
                }
                throw undeliveredElementException;
            }
            reentrantLock.unlock();
            return f;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: s */
    public final boolean mo72141s(C19514p<? super E> pVar) {
        ReentrantLock reentrantLock = this.f43453e;
        reentrantLock.lock();
        try {
            return super.mo72141s(pVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: u */
    public final boolean mo72142u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo72143v() {
        return this.f43454f == C17782b.f38643n;
    }
}
