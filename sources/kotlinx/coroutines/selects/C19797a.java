package kotlinx.coroutines.selects;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19704h1;
import kotlinx.coroutines.C19766p0;
import kotlinx.coroutines.C19830v;
import kotlinx.coroutines.internal.C19717b;
import kotlinx.coroutines.internal.C19718c;
import kotlinx.coroutines.internal.C19724i;
import kotlinx.coroutines.internal.C19730n;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p003a2.C0015b;
import p383ke.C12995a;
import p514bk.C14088a;
import p744gq.C19059b;

/* renamed from: kotlinx.coroutines.selects.a */
public final class C19797a<R> extends C19724i implements C19805f<R>, C19340c<R>, C19059b {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43780f;

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43781g;
    private volatile /* synthetic */ Object _parentHandle = null;
    private volatile /* synthetic */ Object _result = C19806g.f43792c;
    public volatile /* synthetic */ Object _state = C19806g.f43790a;

    /* renamed from: e */
    public final C19340c<R> f43782e;

    /* renamed from: kotlinx.coroutines.selects.a$a */
    public static final class C19798a extends C19718c<Object> {

        /* renamed from: b */
        public final C19797a<?> f43783b;

        /* renamed from: c */
        public final C19717b f43784c;

        /* renamed from: d */
        public final long f43785d;

        public C19798a(C19797a<?> aVar, C19717b bVar) {
            this.f43783b = aVar;
            this.f43784c = bVar;
            C19807h hVar = C19806g.f43794e;
            hVar.getClass();
            this.f43785d = C19807h.f43795a.incrementAndGet(hVar);
            bVar.f43656a = this;
        }

        /* renamed from: d */
        public final void mo72434d(Object obj, Object obj2) {
            boolean z = true;
            boolean z2 = obj2 == null;
            C19736t tVar = z2 ? null : C19806g.f43790a;
            C19797a<?> aVar = this.f43783b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C19797a.f43780f;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(aVar, this, tVar)) {
                    if (atomicReferenceFieldUpdater.get(aVar) != this) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z && z2) {
                this.f43783b.mo72628F();
            }
            this.f43784c.mo72425a(this, obj2);
        }

        /* renamed from: g */
        public final long mo72446g() {
            return this.f43785d;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[LOOP:2: B:26:0x0046->B:29:0x0050, LOOP_START] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo72160i(java.lang.Object r7) {
            /*
                r6 = this;
                if (r7 != 0) goto L_0x0036
                kotlinx.coroutines.selects.a<?> r0 = r6.f43783b
            L_0x0004:
                java.lang.Object r1 = r0._state
                r2 = 0
                if (r1 != r6) goto L_0x000a
                goto L_0x0032
            L_0x000a:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.C19730n
                if (r3 == 0) goto L_0x0016
                kotlinx.coroutines.internal.n r1 = (kotlinx.coroutines.internal.C19730n) r1
                kotlinx.coroutines.selects.a<?> r2 = r6.f43783b
                r1.mo72436c(r2)
                goto L_0x0004
            L_0x0016:
                kotlinx.coroutines.internal.t r3 = kotlinx.coroutines.selects.C19806g.f43790a
                if (r1 != r3) goto L_0x0030
                kotlinx.coroutines.selects.a<?> r1 = r6.f43783b
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.selects.C19797a.f43780f
            L_0x001e:
                boolean r5 = r4.compareAndSet(r1, r3, r6)
                if (r5 == 0) goto L_0x0026
                r1 = 1
                goto L_0x002d
            L_0x0026:
                java.lang.Object r5 = r4.get(r1)
                if (r5 == r3) goto L_0x001e
                r1 = 0
            L_0x002d:
                if (r1 == 0) goto L_0x0004
                goto L_0x0032
            L_0x0030:
                kotlinx.coroutines.internal.t r2 = kotlinx.coroutines.selects.C19806g.f43791b
            L_0x0032:
                if (r2 != 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                return r2
            L_0x0036:
                kotlinx.coroutines.internal.b r0 = r6.f43784c     // Catch:{ all -> 0x003d }
                java.lang.Object r7 = r0.mo72426b(r6)     // Catch:{ all -> 0x003d }
                return r7
            L_0x003d:
                r0 = move-exception
                if (r7 != 0) goto L_0x0053
                kotlinx.coroutines.selects.a<?> r7 = r6.f43783b
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.C19797a.f43780f
                kotlinx.coroutines.internal.t r2 = kotlinx.coroutines.selects.C19806g.f43790a
            L_0x0046:
                boolean r3 = r1.compareAndSet(r7, r6, r2)
                if (r3 != 0) goto L_0x0053
                java.lang.Object r3 = r1.get(r7)
                if (r3 != r6) goto L_0x0053
                goto L_0x0046
            L_0x0053:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C19797a.C19798a.mo72160i(java.lang.Object):java.lang.Object");
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("AtomicSelectOp(sequence="), this.f43785d, ')');
        }
    }

    /* renamed from: kotlinx.coroutines.selects.a$b */
    public static final class C19799b extends LockFreeLinkedListNode {

        /* renamed from: e */
        public final C19766p0 f43786e;

        public C19799b(C19766p0 p0Var) {
            this.f43786e = p0Var;
        }
    }

    /* renamed from: kotlinx.coroutines.selects.a$c */
    public final class C19800c extends C19704h1 {
        public C19800c() {
        }

        /* renamed from: F */
        public final void mo72253F(Throwable th) {
            if (C19797a.this.mo72634k()) {
                C19797a.this.mo72636n(mo72494G().mo72398h());
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72253F((Throwable) obj);
            return C19394m.f43287a;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C19797a> cls2 = C19797a.class;
        f43780f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f43781g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_result");
    }

    public C19797a(ContinuationImpl continuationImpl) {
        this.f43782e = continuationImpl;
    }

    /* renamed from: F */
    public final void mo72628F() {
        C19766p0 p0Var = (C19766p0) this._parentHandle;
        if (p0Var != null) {
            p0Var.dispose();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) mo72420t(); !C19383o.m32792b(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.mo72421u()) {
            if (lockFreeLinkedListNode instanceof C19799b) {
                ((C19799b) lockFreeLinkedListNode).f43786e.dispose();
            }
        }
    }

    /* renamed from: G */
    public final Object mo72629G() {
        C19699g1 g1Var;
        boolean z = true;
        if (!mo72631e() && (g1Var = (C19699g1) getContext().get(C19699g1.C19701b.f43635b)) != null) {
            C19766p0 a = C19699g1.C19700a.m33480a(g1Var, true, new C19800c(), 2);
            this._parentHandle = a;
            if (mo72631e()) {
                a.dispose();
            }
        }
        Object obj = this._result;
        C19736t tVar = C19806g.f43792c;
        if (obj == tVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43781g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, coroutineSingletons)) {
                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
            obj = this._result;
        }
        if (obj == C19806g.f43793d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof C19830v)) {
            return obj;
        } else {
            throw ((C19830v) obj).f43842a;
        }
    }

    /* renamed from: H */
    public final void mo72630H(Throwable th) {
        if (mo72634k()) {
            resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
        } else if (!(th instanceof CancellationException)) {
            Object G = mo72629G();
            if (!(G instanceof C19830v) || ((C19830v) G).f43842a != th) {
                C14088a.m21785m(th, getContext());
            }
        }
    }

    /* renamed from: e */
    public final boolean mo72631e() {
        while (true) {
            Object obj = this._state;
            if (obj == C19806g.f43790a) {
                return false;
            }
            if (!(obj instanceof C19730n)) {
                return true;
            }
            ((C19730n) obj).mo72436c(this);
        }
    }

    public final C19059b getCallerFrame() {
        C19340c<R> cVar = this.f43782e;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f43782e.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final void mo72632h(C19766p0 p0Var) {
        C19799b bVar = new C19799b(p0Var);
        if (!mo72631e()) {
            do {
            } while (!mo72422w().mo72417p(bVar, this));
            if (!mo72631e()) {
                return;
            }
        }
        p0Var.dispose();
    }

    /* renamed from: j */
    public final Object mo72633j() {
        while (true) {
            Object obj = this._state;
            C19736t tVar = C19806g.f43790a;
            if (obj == tVar) {
                boolean z = false;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43780f;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, (Object) null)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    mo72628F();
                    return C12995a.f28606b;
                }
            } else if (!(obj instanceof C19730n)) {
                return null;
            } else {
                ((C19730n) obj).mo72436c(this);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo72634k() {
        Object j = mo72633j();
        if (j == C12995a.f28606b) {
            return true;
        }
        if (j == null) {
            return false;
        }
        throw new IllegalStateException(C19383o.m32802l(j, "Unexpected trySelectIdempotent result ").toString());
    }

    /* renamed from: l */
    public final C19340c<R> mo72635l() {
        return this;
    }

    /* renamed from: n */
    public final void mo72636n(Throwable th) {
        while (true) {
            Object obj = this._result;
            C19736t tVar = C19806g.f43792c;
            boolean z = true;
            if (obj == tVar) {
                C19830v vVar = new C19830v(th, false);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43781g;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, vVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj == coroutineSingletons) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43781g;
                    C19736t tVar2 = C19806g.f43793d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, tVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        C19388s.m32873m0(this.f43782e).resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    /* renamed from: o */
    public final Object mo72637o(C19717b bVar) {
        return new C19798a(this, bVar).mo72436c((Object) null);
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this._result;
            C19736t tVar = C19806g.f43792c;
            boolean z = true;
            if (obj2 == tVar) {
                Throwable r0 = Result.m35483exceptionOrNullimpl(obj);
                Object vVar = r0 == null ? obj : new C19830v(r0, false);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43781g;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, vVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 == coroutineSingletons) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43781g;
                    C19736t tVar2 = C19806g.f43793d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, tVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        if (Result.m35485isFailureimpl(obj)) {
                            C19340c<R> cVar = this.f43782e;
                            Throwable r7 = Result.m35483exceptionOrNullimpl(obj);
                            C19383o.m32794d(r7);
                            cVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(r7)));
                            return;
                        }
                        this.f43782e.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelectInstance(state=");
        h.append(this._state);
        h.append(", result=");
        return C0073e.m209i(h, this._result, ')');
    }
}
