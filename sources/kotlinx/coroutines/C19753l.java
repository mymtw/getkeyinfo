package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.internal.C19722g;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p383ke.C12995a;
import p514bk.C14088a;
import p744gq.C19059b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.l */
public class C19753l<T> extends C19754l0<T> implements C19747k<T>, C19059b {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43707h = AtomicIntegerFieldUpdater.newUpdater(C19753l.class, "_decision");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43708i = AtomicReferenceFieldUpdater.newUpdater(C19753l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C19473b.f43409b;

    /* renamed from: e */
    public final C19340c<T> f43709e;

    /* renamed from: f */
    public final CoroutineContext f43710f;

    /* renamed from: g */
    public C19766p0 f43711g;

    public C19753l(int i, C19340c cVar) {
        super(i);
        this.f43709e = cVar;
        this.f43710f = cVar.getContext();
    }

    /* renamed from: q */
    public static void m33666q(C19857l lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: w */
    public static Object m33667w(C19773r1 r1Var, Object obj, int i, C19857l lVar, Object obj2) {
        if (obj instanceof C19830v) {
            return obj;
        }
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        if (!z && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(r1Var instanceof C19705i) || (r1Var instanceof C19524d)) && obj2 == null)) {
            return obj;
        }
        return new C19823u(obj, r1Var instanceof C19705i ? (C19705i) r1Var : null, lVar, obj2, (CancellationException) null, 16);
    }

    /* renamed from: D */
    public final boolean mo72495D(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof C19773r1) {
                z2 = obj instanceof C19705i;
                C19756m mVar = new C19756m(this, th, z2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43708i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        C19705i iVar = z2 ? (C19705i) obj : null;
        if (iVar != null) {
            try {
                iVar.mo72155a(th);
            } catch (Throwable th2) {
                C14088a.m21785m(new CompletionHandlerException(C19383o.m32802l(this, "Exception in invokeOnCancellation handler for "), th2), this.f43710f);
            }
        }
        if (!mo72550p()) {
            mo72545h();
        }
        mo72546j(this.f43712d);
        return true;
    }

    /* renamed from: J */
    public final C19736t mo72496J(Object obj, LockFreeLinkedListNode.C19712a aVar, C19857l lVar) {
        return mo72554x(obj, aVar, lVar);
    }

    /* renamed from: O */
    public final void mo72497O(C19857l<? super Throwable, C19394m> lVar) {
        C19705i d1Var = lVar instanceof C19705i ? (C19705i) lVar : new C19526d1(lVar);
        while (true) {
            Object obj = this._state;
            boolean z = true;
            if (obj instanceof C19473b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43708i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
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
                Throwable th = null;
                if (!(obj instanceof C19705i)) {
                    boolean z2 = obj instanceof C19830v;
                    if (z2) {
                        C19830v vVar = (C19830v) obj;
                        vVar.getClass();
                        if (!C19830v.f43841b.compareAndSet(vVar, 0, 1)) {
                            m33666q(lVar, obj);
                            throw null;
                        } else if (obj instanceof C19756m) {
                            if (!z2) {
                                vVar = null;
                            }
                            if (vVar != null) {
                                th = vVar.f43842a;
                            }
                            try {
                                lVar.invoke(th);
                                return;
                            } catch (Throwable th2) {
                                C14088a.m21785m(new CompletionHandlerException(C19383o.m32802l(this, "Exception in invokeOnCancellation handler for "), th2), this.f43710f);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (obj instanceof C19823u) {
                        C19823u uVar = (C19823u) obj;
                        if (uVar.f43827b != null) {
                            m33666q(lVar, obj);
                            throw null;
                        } else if (!(d1Var instanceof C19524d)) {
                            Throwable th3 = uVar.f43830e;
                            if (th3 != null) {
                                try {
                                    lVar.invoke(th3);
                                    return;
                                } catch (Throwable th4) {
                                    C14088a.m21785m(new CompletionHandlerException(C19383o.m32802l(this, "Exception in invokeOnCancellation handler for "), th4), this.f43710f);
                                    return;
                                }
                            } else {
                                C19823u a = C19823u.m33830a(uVar, d1Var, (CancellationException) null, 29);
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43708i;
                                while (true) {
                                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a)) {
                                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
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
                            }
                        } else {
                            return;
                        }
                    } else if (!(d1Var instanceof C19524d)) {
                        C19823u uVar2 = new C19823u(obj, d1Var, (C19857l) null, (Object) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f43708i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, uVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
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
                        return;
                    }
                } else {
                    m33666q(lVar, obj);
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72452a(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C19773r1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C19830v)) {
                boolean z = true;
                if (obj2 instanceof C19823u) {
                    C19823u uVar = (C19823u) obj2;
                    if (!(uVar.f43830e != null)) {
                        C19823u a = C19823u.m33830a(uVar, (C19705i) null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43708i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            C19705i iVar = uVar.f43827b;
                            if (iVar != null) {
                                try {
                                    iVar.mo72155a(cancellationException);
                                } catch (Throwable th) {
                                    C14088a.m21785m(new CompletionHandlerException(C19383o.m32802l(this, "Exception in invokeOnCancellation handler for "), th), this.f43710f);
                                }
                            }
                            C19857l<Throwable, C19394m> lVar = uVar.f43828c;
                            if (lVar != null) {
                                try {
                                    lVar.invoke(cancellationException);
                                    return;
                                } catch (Throwable th2) {
                                    C14088a.m21785m(new CompletionHandlerException(C19383o.m32802l(this, "Exception in resume onCancellation handler for "), th2), this.f43710f);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43708i;
                    C19823u uVar2 = new C19823u(obj2, (C19705i) null, (C19857l) null, (Object) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, uVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
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
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final C19340c<T> mo72453b() {
        return this.f43709e;
    }

    /* renamed from: c */
    public final Throwable mo72543c(Object obj) {
        Throwable c = super.mo72543c(obj);
        if (c == null) {
            return null;
        }
        return c;
    }

    /* renamed from: d */
    public final <T> T mo72544d(Object obj) {
        return obj instanceof C19823u ? ((C19823u) obj).f43826a : obj;
    }

    /* renamed from: f */
    public final boolean mo72498f() {
        return !(this._state instanceof C19773r1);
    }

    /* renamed from: g */
    public final Object mo72454g() {
        return this._state;
    }

    public final C19059b getCallerFrame() {
        C19340c<T> cVar = this.f43709e;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f43710f;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final void mo72545h() {
        C19766p0 p0Var = this.f43711g;
        if (p0Var != null) {
            p0Var.dispose();
            this.f43711g = C19770q1.f43725b;
        }
    }

    /* renamed from: i */
    public final C19736t mo72499i(Object obj, Object obj2) {
        return mo72554x(obj, obj2, (C19857l<? super Throwable, C19394m>) null);
    }

    public final boolean isActive() {
        return this._state instanceof C19773r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72546j(int r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = r2
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f43707h
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r3
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            kotlin.coroutines.c<T> r0 = r6.f43709e
            r4 = 4
            if (r7 != r4) goto L_0x002a
            r4 = r3
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            if (r4 != 0) goto L_0x0080
            boolean r5 = r0 instanceof kotlinx.coroutines.internal.C19722g
            if (r5 == 0) goto L_0x0080
            if (r7 == r3) goto L_0x0038
            if (r7 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r3
        L_0x0039:
            int r5 = r6.f43712d
            if (r5 == r3) goto L_0x003f
            if (r5 != r1) goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            if (r7 != r2) goto L_0x0080
            r7 = r0
            kotlinx.coroutines.internal.g r7 = (kotlinx.coroutines.internal.C19722g) r7
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.f43663e
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            boolean r1 = r7.mo10805C0(r0)
            if (r1 == 0) goto L_0x0055
            r7.mo7108A0(r0, r6)
            goto L_0x0083
        L_0x0055:
            kotlinx.coroutines.t0 r7 = kotlinx.coroutines.C19845z1.m33859a()
            boolean r0 = r7.mo72660H0()
            if (r0 == 0) goto L_0x0063
            r7.mo72658F0(r6)
            goto L_0x0083
        L_0x0063:
            r7.mo72659G0(r3)
            kotlin.coroutines.c<T> r0 = r6.f43709e     // Catch:{ all -> 0x0072 }
            androidx.compose.p015ui.text.input.C1993m.m4364Y(r6, r0, r3)     // Catch:{ all -> 0x0072 }
        L_0x006b:
            boolean r0 = r7.mo72662J0()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006b
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r1 = 0
            r6.mo72555e(r0, r1)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r7.mo72657E0(r3)
            goto L_0x0083
        L_0x007b:
            r0 = move-exception
            r7.mo72657E0(r3)
            throw r0
        L_0x0080:
            androidx.compose.p015ui.text.input.C1993m.m4364Y(r6, r0, r4)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19753l.mo72546j(int):void");
    }

    /* renamed from: k */
    public Throwable mo72533k(C19749k1 k1Var) {
        return k1Var.mo72398h();
    }

    /* renamed from: l */
    public final Object mo72547l() {
        boolean z;
        boolean z2;
        C19699g1 g1Var;
        boolean p = mo72550p();
        while (true) {
            int i = this._decision;
            z = true;
            if (i == 0) {
                if (f43707h.compareAndSet(this, 0, 1)) {
                    z2 = true;
                    break;
                }
            } else if (i == 2) {
                z2 = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        Throwable th = null;
        if (z2) {
            if (this.f43711g == null) {
                mo72549o();
            }
            if (p) {
                C19340c<T> cVar = this.f43709e;
                C19722g gVar = cVar instanceof C19722g ? (C19722g) cVar : null;
                if (gVar != null) {
                    th = gVar.mo72459n(this);
                }
                if (th != null) {
                    mo72545h();
                    mo72495D(th);
                }
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (p) {
            C19340c<T> cVar2 = this.f43709e;
            C19722g gVar2 = cVar2 instanceof C19722g ? (C19722g) cVar2 : null;
            if (gVar2 != null) {
                th = gVar2.mo72459n(this);
            }
            if (th != null) {
                mo72545h();
                mo72495D(th);
            }
        }
        Object obj = this._state;
        if (!(obj instanceof C19830v)) {
            int i2 = this.f43712d;
            if (!(i2 == 1 || i2 == 2)) {
                z = false;
            }
            if (!z || (g1Var = (C19699g1) this.f43710f.get(C19699g1.C19701b.f43635b)) == null || g1Var.isActive()) {
                return mo72544d(obj);
            }
            CancellationException h = g1Var.mo72398h();
            mo72452a(obj, h);
            throw h;
        }
        throw ((C19830v) obj).f43842a;
    }

    /* renamed from: m */
    public final void mo72501m() {
        mo72546j(this.f43712d);
    }

    /* renamed from: n */
    public final void mo72548n() {
        C19766p0 o = mo72549o();
        if (o != null && mo72498f()) {
            o.dispose();
            this.f43711g = C19770q1.f43725b;
        }
    }

    /* renamed from: o */
    public final C19766p0 mo72549o() {
        C19699g1 g1Var = (C19699g1) this.f43710f.get(C19699g1.C19701b.f43635b);
        if (g1Var == null) {
            return null;
        }
        C19766p0 a = C19699g1.C19700a.m33480a(g1Var, true, new C19759n(this), 2);
        this.f43711g = a;
        return a;
    }

    /* renamed from: p */
    public final boolean mo72550p() {
        return (this.f43712d == 2) && ((C19722g) this.f43709e).mo72456j();
    }

    /* renamed from: r */
    public String mo72534r() {
        return "CancellableContinuation";
    }

    public final void resumeWith(Object obj) {
        Throwable r0 = Result.m35483exceptionOrNullimpl(obj);
        if (r0 != null) {
            obj = new C19830v(r0, false);
        }
        mo72553u(obj, this.f43712d, (C19857l<? super Throwable, C19394m>) null);
    }

    /* renamed from: s */
    public final C19736t mo72502s(Throwable th) {
        return mo72554x(new C19830v(th, false), (Object) null, (C19857l<? super Throwable, C19394m>) null);
    }

    /* renamed from: t */
    public final boolean mo72551t() {
        Object obj = this._state;
        if (!(obj instanceof C19823u) || ((C19823u) obj).f43829d == null) {
            this._decision = 0;
            this._state = C19473b.f43409b;
            return true;
        }
        mo72545h();
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo72534r());
        sb.append('(');
        sb.append(C19543e0.m33329q0(this.f43709e));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof C19773r1 ? "Active" : obj instanceof C19756m ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(C19543e0.m33300R(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo72553u(Object obj, int i, C19857l<? super Throwable, C19394m> lVar) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = false;
            if (obj2 instanceof C19773r1) {
                Object w = m33667w((C19773r1) obj2, obj, i, lVar, (Object) null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43708i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, w)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof C19756m) {
                    C19756m mVar = (C19756m) obj2;
                    mVar.getClass();
                    if (C19756m.f43715c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            try {
                                lVar.invoke(mVar.f43842a);
                                return;
                            } catch (Throwable th) {
                                C14088a.m21785m(new CompletionHandlerException(C19383o.m32802l(this, "Exception in resume onCancellation handler for "), th), this.f43710f);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                throw new IllegalStateException(C19383o.m32802l(obj, "Already resumed, but proposed with update ").toString());
            }
        } while (!z);
        if (!mo72550p()) {
            mo72545h();
        }
        mo72546j(i);
    }

    /* renamed from: v */
    public final void mo72503v(C19857l lVar, Object obj) {
        mo72553u(obj, this.f43712d, lVar);
    }

    /* renamed from: x */
    public final C19736t mo72554x(Object obj, Object obj2, C19857l<? super Throwable, C19394m> lVar) {
        boolean z;
        do {
            Object obj3 = this._state;
            if (obj3 instanceof C19773r1) {
                Object w = m33667w((C19773r1) obj3, obj, this.f43712d, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43708i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, w)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof C19823u) || obj2 == null || ((C19823u) obj3).f43829d != obj2) {
                return null;
            } else {
                return C12995a.f28606b;
            }
        } while (!z);
        if (!mo72550p()) {
            mo72545h();
        }
        return C12995a.f28606b;
    }

    /* renamed from: z */
    public final void mo72504z(CoroutineDispatcher coroutineDispatcher, C19394m mVar) {
        C19340c<T> cVar = this.f43709e;
        C19722g gVar = cVar instanceof C19722g ? (C19722g) cVar : null;
        mo72553u(mVar, (gVar == null ? null : gVar.f43663e) == coroutineDispatcher ? 4 : this.f43712d, (C19857l<? super Throwable, C19394m>) null);
    }
}
