package kotlinx.coroutines.internal;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19754l0;
import kotlinx.coroutines.C19821t0;
import kotlinx.coroutines.C19830v;
import kotlinx.coroutines.C19833w;
import kotlinx.coroutines.C19845z1;
import kotlinx.coroutines.CoroutineDispatcher;
import p744gq.C19059b;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C19722g<T> extends C19754l0<T> implements C19059b, C19340c<T> {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43662i = AtomicReferenceFieldUpdater.newUpdater(C19722g.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: e */
    public final CoroutineDispatcher f43663e;

    /* renamed from: f */
    public final C19340c<T> f43664f;

    /* renamed from: g */
    public Object f43665g = C19382n.f43254d;

    /* renamed from: h */
    public final Object f43666h = ThreadContextKt.m33529b(getContext());

    public C19722g(CoroutineDispatcher coroutineDispatcher, C19340c<? super T> cVar) {
        super(-1);
        this.f43663e = coroutineDispatcher;
        this.f43664f = cVar;
    }

    /* renamed from: a */
    public final void mo72452a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C19833w) {
            ((C19833w) obj).f43846b.invoke(cancellationException);
        }
    }

    /* renamed from: b */
    public final C19340c<T> mo72453b() {
        return this;
    }

    /* renamed from: g */
    public final Object mo72454g() {
        Object obj = this.f43665g;
        this.f43665g = C19382n.f43254d;
        return obj;
    }

    public final C19059b getCallerFrame() {
        C19340c<T> cVar = this.f43664f;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f43664f.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final C19753l<T> mo72455h() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C19382n.f43255e;
                return null;
            } else if (obj instanceof C19753l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43662i;
                C19736t tVar = C19382n.f43255e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (C19753l) obj;
                }
            } else if (obj != C19382n.f43255e && !(obj instanceof Throwable)) {
                throw new IllegalStateException(C19383o.m32802l(obj, "Inconsistent state ").toString());
            }
        }
    }

    /* renamed from: j */
    public final boolean mo72456j() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: k */
    public final boolean mo72457k(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C19736t tVar = C19382n.f43255e;
            boolean z = false;
            boolean z2 = true;
            if (C19383o.m32792b(obj, tVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43662i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43662i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo72458l() {
        Object obj = this._reusableCancellableContinuation;
        C19753l lVar = obj instanceof C19753l ? (C19753l) obj : null;
        if (lVar != null) {
            lVar.mo72545h();
        }
    }

    /* renamed from: n */
    public final Throwable mo72459n(C19747k<?> kVar) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            C19736t tVar = C19382n.f43255e;
            z = false;
            if (obj == tVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43662i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43662i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(C19383o.m32802l(obj, "Inconsistent state ").toString());
            }
        } while (!z);
        return null;
    }

    public final void resumeWith(Object obj) {
        CoroutineContext context;
        Object c;
        CoroutineContext context2 = this.f43664f.getContext();
        Throwable r1 = Result.m35483exceptionOrNullimpl(obj);
        Object vVar = r1 == null ? obj : new C19830v(r1, false);
        if (this.f43663e.mo10805C0(context2)) {
            this.f43665g = vVar;
            this.f43712d = 0;
            this.f43663e.mo7108A0(context2, this);
            return;
        }
        C19821t0 a = C19845z1.m33859a();
        if (a.mo72660H0()) {
            this.f43665g = vVar;
            this.f43712d = 0;
            a.mo72658F0(this);
            return;
        }
        a.mo72659G0(true);
        try {
            context = getContext();
            c = ThreadContextKt.m33530c(context, this.f43666h);
            this.f43664f.resumeWith(obj);
            C19394m mVar = C19394m.f43287a;
            ThreadContextKt.m33528a(context, c);
            do {
            } while (a.mo72662J0());
        } catch (Throwable th) {
            try {
                mo72555e(th, (Throwable) null);
            } catch (Throwable th2) {
                a.mo72657E0(true);
                throw th2;
            }
        }
        a.mo72657E0(true);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DispatchedContinuation[");
        h.append(this.f43663e);
        h.append(", ");
        h.append(C19543e0.m33329q0(this.f43664f));
        h.append(']');
        return h.toString();
    }
}
