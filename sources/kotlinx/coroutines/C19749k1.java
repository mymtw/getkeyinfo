package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19434j;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.internal.C19730n;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.C19802c;
import kotlinx.coroutines.selects.C19805f;
import p514bk.C14088a;
import p568fn.C17782b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.k1 */
public class C19749k1 implements C19699g1, C19768q, C19794s1, C19802c {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43700b = AtomicReferenceFieldUpdater.newUpdater(C19749k1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: kotlinx.coroutines.k1$a */
    public static final class C19750a<T> extends C19753l<T> {

        /* renamed from: j */
        public final C19749k1 f43701j;

        public C19750a(C19749k1 k1Var, C19340c cVar) {
            super(1, cVar);
            this.f43701j = k1Var;
        }

        /* renamed from: k */
        public final Throwable mo72533k(C19749k1 k1Var) {
            Throwable b;
            Object h0 = this.f43701j.mo72521h0();
            return (!(h0 instanceof C19752c) || (b = ((C19752c) h0).mo72536b()) == null) ? h0 instanceof C19830v ? ((C19830v) h0).f43842a : k1Var.mo72398h() : b;
        }

        /* renamed from: r */
        public final String mo72534r() {
            return "AwaitContinuation";
        }
    }

    /* renamed from: kotlinx.coroutines.k1$b */
    public static final class C19751b extends C19746j1 {

        /* renamed from: f */
        public final C19749k1 f43702f;

        /* renamed from: g */
        public final C19752c f43703g;

        /* renamed from: h */
        public final C19765p f43704h;

        /* renamed from: i */
        public final Object f43705i;

        public C19751b(C19749k1 k1Var, C19752c cVar, C19765p pVar, Object obj) {
            this.f43702f = k1Var;
            this.f43703g = cVar;
            this.f43704h = pVar;
            this.f43705i = obj;
        }

        /* renamed from: F */
        public final void mo72253F(Throwable th) {
            C19749k1 k1Var = this.f43702f;
            C19752c cVar = this.f43703g;
            C19765p pVar = this.f43704h;
            Object obj = this.f43705i;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C19749k1.f43700b;
            k1Var.getClass();
            C19765p q0 = C19749k1.m33609q0(pVar);
            if (q0 == null || !k1Var.mo72506A0(cVar, q0, obj)) {
                k1Var.mo72252H(k1Var.mo72514W(cVar, obj));
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72253F((Throwable) obj);
            return C19394m.f43287a;
        }
    }

    /* renamed from: kotlinx.coroutines.k1$c */
    public static final class C19752c implements C19466a1 {
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: b */
        public final C19767p1 f43706b;

        public C19752c(C19767p1 p1Var, Throwable th) {
            this.f43706b = p1Var;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        /* renamed from: a */
        public final void mo72535a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(C19383o.m32802l(obj, "State is ").toString());
                }
            }
        }

        /* renamed from: b */
        public final Throwable mo72536b() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: c */
        public final boolean mo72537c() {
            return ((Throwable) this._rootCause) != null;
        }

        /* renamed from: d */
        public final C19767p1 mo72101d() {
            return this.f43706b;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: e */
        public final boolean mo72538e() {
            return this._isCompleting;
        }

        /* renamed from: f */
        public final boolean mo72539f() {
            return this._exceptionsHolder == C14088a.f31036q;
        }

        /* renamed from: g */
        public final ArrayList mo72540g(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(C19383o.m32802l(obj, "State is ").toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !C19383o.m32792b(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C14088a.f31036q;
            return arrayList;
        }

        /* renamed from: h */
        public final void mo72541h() {
            this._isCompleting = 1;
        }

        public final boolean isActive() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [boolean, int] */
        public final String toString() {
            StringBuilder h = C0072d.m201h("Finishing[cancelling=");
            h.append(mo72537c());
            h.append(", completing=");
            h.append(this._isCompleting);
            h.append(", rootCause=");
            h.append((Throwable) this._rootCause);
            h.append(", exceptions=");
            h.append(this._exceptionsHolder);
            h.append(", list=");
            h.append(this.f43706b);
            h.append(']');
            return h.toString();
        }
    }

    public C19749k1(boolean z) {
        this._state = z ? C14088a.f31038s : C14088a.f31037r;
        this._parentHandle = null;
    }

    /* renamed from: q0 */
    public static C19765p m33609q0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo72424y()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo72422w();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo72421u();
            if (!lockFreeLinkedListNode.mo72424y()) {
                if (lockFreeLinkedListNode instanceof C19765p) {
                    return (C19765p) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof C19767p1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: y0 */
    public static String m33610y0(Object obj) {
        if (!(obj instanceof C19752c)) {
            return obj instanceof C19466a1 ? ((C19466a1) obj).isActive() ? "Active" : "New" : obj instanceof C19830v ? "Cancelled" : "Completed";
        }
        C19752c cVar = (C19752c) obj;
        if (cVar.mo72537c()) {
            return "Cancelling";
        }
        if (cVar.mo72538e()) {
            return "Completing";
        }
    }

    /* renamed from: A0 */
    public final boolean mo72506A0(C19752c cVar, C19765p pVar, Object obj) {
        while (C19699g1.C19700a.m33480a(pVar.f43723f, false, new C19751b(this, cVar, pVar, obj), 1) == C19770q1.f43725b) {
            pVar = m33609q0(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public void mo72252H(Object obj) {
    }

    /* renamed from: I */
    public final Object mo72507I(C19340c<Object> cVar) {
        Object h0;
        do {
            h0 = mo72521h0();
            if (!(h0 instanceof C19466a1)) {
                if (!(h0 instanceof C19830v)) {
                    return C14088a.m21796y(h0);
                }
                throw ((C19830v) h0).f43842a;
            }
        } while (mo72531w0(h0) < 0);
        C19750a aVar = new C19750a(this, C19388s.m32873m0(cVar));
        aVar.mo72548n();
        aVar.mo72497O(new C19769q0(mo72401k(new C19548f1(aVar, 1))));
        Object l = aVar.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ef, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x003f A[SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72508K(java.lang.Object r10) {
        /*
            r9 = this;
            kotlinx.coroutines.internal.t r0 = p514bk.C14088a.f31032m
            boolean r1 = r9.mo72407d0()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.mo72521h0()
            boolean r1 = r0 instanceof kotlinx.coroutines.C19466a1
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof kotlinx.coroutines.C19749k1.C19752c
            if (r1 == 0) goto L_0x0020
            r1 = r0
            kotlinx.coroutines.k1$c r1 = (kotlinx.coroutines.C19749k1.C19752c) r1
            boolean r1 = r1.mo72538e()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            kotlinx.coroutines.v r1 = new kotlinx.coroutines.v
            java.lang.Throwable r4 = r9.mo72513V(r10)
            r1.<init>(r4, r3)
            java.lang.Object r0 = r9.mo72532z0(r0, r1)
            kotlinx.coroutines.internal.t r1 = p514bk.C14088a.f31034o
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            kotlinx.coroutines.internal.t r0 = p514bk.C14088a.f31032m
        L_0x0034:
            kotlinx.coroutines.internal.t r1 = p514bk.C14088a.f31033n
            if (r0 != r1) goto L_0x0039
            return r2
        L_0x0039:
            kotlinx.coroutines.internal.t r1 = p514bk.C14088a.f31032m
            if (r0 != r1) goto L_0x00f0
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.mo72521h0()
            boolean r5 = r4 instanceof kotlinx.coroutines.C19749k1.C19752c
            if (r5 == 0) goto L_0x008b
            monitor-enter(r4)
            r5 = r4
            kotlinx.coroutines.k1$c r5 = (kotlinx.coroutines.C19749k1.C19752c) r5     // Catch:{ all -> 0x0088 }
            boolean r5 = r5.mo72539f()     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x0056
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31035p     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            goto L_0x00ef
        L_0x0056:
            r5 = r4
            kotlinx.coroutines.k1$c r5 = (kotlinx.coroutines.C19749k1.C19752c) r5     // Catch:{ all -> 0x0088 }
            boolean r5 = r5.mo72537c()     // Catch:{ all -> 0x0088 }
            if (r10 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x006d
        L_0x0061:
            if (r1 != 0) goto L_0x0067
            java.lang.Throwable r1 = r9.mo72513V(r10)     // Catch:{ all -> 0x0088 }
        L_0x0067:
            r10 = r4
            kotlinx.coroutines.k1$c r10 = (kotlinx.coroutines.C19749k1.C19752c) r10     // Catch:{ all -> 0x0088 }
            r10.mo72535a(r1)     // Catch:{ all -> 0x0088 }
        L_0x006d:
            r10 = r4
            kotlinx.coroutines.k1$c r10 = (kotlinx.coroutines.C19749k1.C19752c) r10     // Catch:{ all -> 0x0088 }
            java.lang.Throwable r10 = r10.mo72536b()     // Catch:{ all -> 0x0088 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0079
            r0 = r10
        L_0x0079:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x007d
            goto L_0x0084
        L_0x007d:
            kotlinx.coroutines.k1$c r4 = (kotlinx.coroutines.C19749k1.C19752c) r4
            kotlinx.coroutines.p1 r10 = r4.f43706b
            r9.mo72526r0(r10, r0)
        L_0x0084:
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31032m
            goto L_0x00ef
        L_0x0088:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x008b:
            boolean r5 = r4 instanceof kotlinx.coroutines.C19466a1
            if (r5 == 0) goto L_0x00ed
            if (r1 != 0) goto L_0x0095
            java.lang.Throwable r1 = r9.mo72513V(r10)
        L_0x0095:
            r5 = r4
            kotlinx.coroutines.a1 r5 = (kotlinx.coroutines.C19466a1) r5
            boolean r6 = r5.isActive()
            if (r6 == 0) goto L_0x00c8
            kotlinx.coroutines.p1 r6 = r9.mo72519e0(r5)
            if (r6 != 0) goto L_0x00a5
            goto L_0x00bd
        L_0x00a5:
            kotlinx.coroutines.k1$c r7 = new kotlinx.coroutines.k1$c
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f43700b
        L_0x00ac:
            boolean r4 = r8.compareAndSet(r9, r5, r7)
            if (r4 == 0) goto L_0x00b4
            r4 = r2
            goto L_0x00bb
        L_0x00b4:
            java.lang.Object r4 = r8.get(r9)
            if (r4 == r5) goto L_0x00ac
            r4 = r3
        L_0x00bb:
            if (r4 != 0) goto L_0x00bf
        L_0x00bd:
            r4 = r3
            goto L_0x00c3
        L_0x00bf:
            r9.mo72526r0(r6, r1)
            r4 = r2
        L_0x00c3:
            if (r4 == 0) goto L_0x003f
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31032m
            goto L_0x00ef
        L_0x00c8:
            kotlinx.coroutines.v r5 = new kotlinx.coroutines.v
            r5.<init>(r1, r3)
            java.lang.Object r5 = r9.mo72532z0(r4, r5)
            kotlinx.coroutines.internal.t r6 = p514bk.C14088a.f31032m
            if (r5 == r6) goto L_0x00dd
            kotlinx.coroutines.internal.t r4 = p514bk.C14088a.f31034o
            if (r5 != r4) goto L_0x00db
            goto L_0x003f
        L_0x00db:
            r0 = r5
            goto L_0x00f0
        L_0x00dd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = kotlin.jvm.internal.C19383o.m32802l(r4, r0)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00ed:
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31035p
        L_0x00ef:
            r0 = r10
        L_0x00f0:
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31032m
            if (r0 != r10) goto L_0x00f5
            goto L_0x0103
        L_0x00f5:
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31033n
            if (r0 != r10) goto L_0x00fa
            goto L_0x0103
        L_0x00fa:
            kotlinx.coroutines.internal.t r10 = p514bk.C14088a.f31035p
            if (r0 != r10) goto L_0x0100
            r2 = r3
            goto L_0x0103
        L_0x0100:
            r9.mo72252H(r0)
        L_0x0103:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72508K(java.lang.Object):boolean");
    }

    /* renamed from: L */
    public void mo72208L(CancellationException cancellationException) {
        mo72508K(cancellationException);
    }

    /* renamed from: M */
    public final CancellationException mo72509M() {
        Throwable th;
        Object h0 = mo72521h0();
        CancellationException cancellationException = null;
        if (h0 instanceof C19752c) {
            th = ((C19752c) h0).mo72536b();
        } else if (h0 instanceof C19830v) {
            th = ((C19830v) h0).f43842a;
        } else if (!(h0 instanceof C19466a1)) {
            th = null;
        } else {
            throw new IllegalStateException(C19383o.m32802l(h0, "Cannot be cancelling child in this state: ").toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new JobCancellationException(C19383o.m32802l(m33610y0(h0), "Parent job is "), th, this) : cancellationException;
    }

    /* renamed from: N */
    public final boolean mo72510N(Throwable th) {
        if (mo72477l0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C19762o oVar = (C19762o) this._parentHandle;
        return (oVar == null || oVar == C19770q1.f43725b) ? z : oVar.mo72559c(th) || z;
    }

    /* renamed from: P */
    public String mo72096P() {
        return "Job was cancelled";
    }

    /* renamed from: R */
    public final void mo72511R(C19749k1 k1Var) {
        mo72508K(k1Var);
    }

    /* renamed from: T */
    public boolean mo72374T(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo72508K(th) && mo72406b0();
    }

    /* renamed from: U */
    public final void mo72512U(C19466a1 a1Var, Object obj) {
        CompletionHandlerException completionHandlerException;
        C19762o oVar = (C19762o) this._parentHandle;
        if (oVar != null) {
            oVar.dispose();
            this._parentHandle = C19770q1.f43725b;
        }
        C19830v vVar = obj instanceof C19830v ? (C19830v) obj : null;
        Throwable th = vVar == null ? null : vVar.f43842a;
        if (a1Var instanceof C19746j1) {
            try {
                ((C19746j1) a1Var).mo72253F(th);
            } catch (Throwable th2) {
                mo72098j0(new CompletionHandlerException("Exception in completion handler " + a1Var + " for " + this, th2));
            }
        } else {
            C19767p1 d = a1Var.mo72101d();
            if (d != null) {
                CompletionHandlerException completionHandlerException2 = null;
                for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) d.mo72420t(); !C19383o.m32792b(lockFreeLinkedListNode, d); lockFreeLinkedListNode = lockFreeLinkedListNode.mo72421u()) {
                    if (lockFreeLinkedListNode instanceof C19746j1) {
                        C19746j1 j1Var = (C19746j1) lockFreeLinkedListNode;
                        try {
                            j1Var.mo72253F(th);
                        } catch (Throwable th3) {
                            if (completionHandlerException2 == null) {
                                completionHandlerException = null;
                            } else {
                                C17782b.m29886t(completionHandlerException2, th3);
                                completionHandlerException = completionHandlerException2;
                            }
                            if (completionHandlerException == null) {
                                completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + j1Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (completionHandlerException2 != null) {
                    mo72098j0(completionHandlerException2);
                }
            }
        }
    }

    /* renamed from: V */
    public final Throwable mo72513V(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo72096P(), (Throwable) null, this) : th;
        } else if (obj != null) {
            return ((C19794s1) obj).mo72509M();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[LOOP:1: B:45:0x009b->B:48:0x00a6, LOOP_START] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72514W(kotlinx.coroutines.C19749k1.C19752c r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.C19830v
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            kotlinx.coroutines.v r0 = (kotlinx.coroutines.C19830v) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.lang.Throwable r1 = r0.f43842a
        L_0x000f:
            monitor-enter(r8)
            r8.mo72537c()     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r0 = r8.mo72540g(r1)     // Catch:{ all -> 0x00ac }
            java.lang.Throwable r2 = r7.mo72518a0(r8, r0)     // Catch:{ all -> 0x00ac }
            r3 = 1
            if (r2 == 0) goto L_0x0054
            int r4 = r0.size()     // Catch:{ all -> 0x00ac }
            if (r4 > r3) goto L_0x0025
            goto L_0x0054
        L_0x0025:
            int r4 = r0.size()     // Catch:{ all -> 0x00ac }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00ac }
            r5.<init>(r4)     // Catch:{ all -> 0x00ac }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00ac }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0036:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00ac }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00ac }
            if (r5 == r2) goto L_0x0036
            if (r5 == r2) goto L_0x0036
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00ac }
            if (r6 != 0) goto L_0x0036
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00ac }
            if (r6 == 0) goto L_0x0036
            p568fn.C17782b.m29886t(r2, r5)     // Catch:{ all -> 0x00ac }
            goto L_0x0036
        L_0x0054:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            if (r2 != r1) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            kotlinx.coroutines.v r9 = new kotlinx.coroutines.v
            r9.<init>(r2, r0)
        L_0x0061:
            if (r2 == 0) goto L_0x0088
            boolean r1 = r7.mo72510N(r2)
            if (r1 != 0) goto L_0x0072
            boolean r1 = r7.mo72522i0(r2)
            if (r1 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r1 = r0
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            if (r1 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0080
            r1 = r9
            kotlinx.coroutines.v r1 = (kotlinx.coroutines.C19830v) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.C19830v.f43841b
            r2.compareAndSet(r1, r0, r3)
            goto L_0x0088
        L_0x0080:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r8.<init>(r9)
            throw r8
        L_0x0088:
            r7.mo72100s0(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f43700b
            boolean r1 = r9 instanceof kotlinx.coroutines.C19466a1
            if (r1 == 0) goto L_0x009a
            kotlinx.coroutines.b1 r1 = new kotlinx.coroutines.b1
            r2 = r9
            kotlinx.coroutines.a1 r2 = (kotlinx.coroutines.C19466a1) r2
            r1.<init>(r2)
            goto L_0x009b
        L_0x009a:
            r1 = r9
        L_0x009b:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x009b
        L_0x00a8:
            r7.mo72512U(r8, r9)
            return r9
        L_0x00ac:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72514W(kotlinx.coroutines.k1$c, java.lang.Object):java.lang.Object");
    }

    /* renamed from: X */
    public final Object mo72515X() {
        Object h0 = mo72521h0();
        if (!(!(h0 instanceof C19466a1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(h0 instanceof C19830v)) {
            return C14088a.m21796y(h0);
        } else {
            throw ((C19830v) h0).f43842a;
        }
    }

    /* renamed from: Y */
    public final Throwable mo72516Y() {
        Object h0 = mo72521h0();
        if (h0 instanceof C19752c) {
            Throwable b = ((C19752c) h0).mo72536b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException(C19383o.m32802l(this, "Job is still new or active: ").toString());
        } else if (h0 instanceof C19466a1) {
            throw new IllegalStateException(C19383o.m32802l(this, "Job is still new or active: ").toString());
        } else if (h0 instanceof C19830v) {
            return ((C19830v) h0).f43842a;
        } else {
            return null;
        }
    }

    /* renamed from: Z */
    public final boolean mo72517Z() {
        Object h0 = mo72521h0();
        return (h0 instanceof C19830v) && ((C19830v) h0).mo72675a();
    }

    /* renamed from: a */
    public void mo72134a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo72096P(), (Throwable) null, this);
        }
        mo72208L(cancellationException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable mo72518a0(kotlinx.coroutines.C19749k1.C19752c r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.mo72537c()
            if (r6 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.mo72096P()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r6 = r7.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L_0x0063
            java.util.Iterator r7 = r7.iterator()
        L_0x0045:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L_0x005a
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x005a
            r4 = r2
            goto L_0x005b
        L_0x005a:
            r4 = r6
        L_0x005b:
            if (r4 == 0) goto L_0x0045
            r1 = r3
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72518a0(kotlinx.coroutines.k1$c, java.util.ArrayList):java.lang.Throwable");
    }

    /* renamed from: b0 */
    public boolean mo72406b0() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72394c0(kotlin.coroutines.C19340c<? super kotlin.C19394m> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo72521h0()
            boolean r1 = r0 instanceof kotlinx.coroutines.C19466a1
            r2 = 1
            if (r1 != 0) goto L_0x000b
            r0 = 0
            goto L_0x0012
        L_0x000b:
            int r0 = r3.mo72531w0(r0)
            if (r0 < 0) goto L_0x0000
            r0 = r2
        L_0x0012:
            if (r0 != 0) goto L_0x001e
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            androidx.compose.p015ui.text.input.C1993m.m4379y(r4)
            kotlin.m r4 = kotlin.C19394m.f43287a
            return r4
        L_0x001e:
            kotlinx.coroutines.l r0 = new kotlinx.coroutines.l
            kotlin.coroutines.c r4 = kotlin.jvm.internal.C19388s.m32873m0(r4)
            r0.<init>(r2, r4)
            r0.mo72548n()
            kotlinx.coroutines.u1 r4 = new kotlinx.coroutines.u1
            r4.<init>(r0)
            kotlinx.coroutines.p0 r4 = r3.mo72401k(r4)
            kotlinx.coroutines.q0 r1 = new kotlinx.coroutines.q0
            r1.<init>(r4)
            r0.mo72497O(r1)
            java.lang.Object r4 = r0.mo72547l()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            kotlin.m r4 = kotlin.C19394m.f43287a
        L_0x0046:
            if (r4 != r0) goto L_0x0049
            return r4
        L_0x0049:
            kotlin.m r4 = kotlin.C19394m.f43287a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72394c0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d0 */
    public boolean mo72407d0() {
        return this instanceof C19792s;
    }

    /* renamed from: e0 */
    public final C19767p1 mo72519e0(C19466a1 a1Var) {
        C19767p1 d = a1Var.mo72101d();
        if (d != null) {
            return d;
        }
        if (a1Var instanceof C19793s0) {
            return new C19767p1();
        }
        if (a1Var instanceof C19746j1) {
            mo72529u0((C19746j1) a1Var);
            return null;
        }
        throw new IllegalStateException(C19383o.m32802l(a1Var, "State should have list: ").toString());
    }

    /* renamed from: f */
    public final boolean mo72395f() {
        return !(mo72521h0() instanceof C19466a1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060 A[LOOP:2: B:34:0x0060->B:37:0x006b, LOOP_START] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.C19766p0 mo72396f0(boolean r11, boolean r12, p753kq.C19857l<? super java.lang.Throwable, kotlin.C19394m> r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            if (r11 == 0) goto L_0x0015
            boolean r2 = r13 instanceof kotlinx.coroutines.C19704h1
            if (r2 == 0) goto L_0x000c
            r2 = r13
            kotlinx.coroutines.h1 r2 = (kotlinx.coroutines.C19704h1) r2
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            if (r2 != 0) goto L_0x0028
            kotlinx.coroutines.e1 r2 = new kotlinx.coroutines.e1
            r2.<init>(r13)
            goto L_0x0028
        L_0x0015:
            boolean r2 = r13 instanceof kotlinx.coroutines.C19746j1
            if (r2 == 0) goto L_0x001d
            r2 = r13
            kotlinx.coroutines.j1 r2 = (kotlinx.coroutines.C19746j1) r2
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            if (r2 != 0) goto L_0x0021
            r2 = r1
        L_0x0021:
            if (r2 != 0) goto L_0x0028
            kotlinx.coroutines.f1 r2 = new kotlinx.coroutines.f1
            r2.<init>(r13, r0)
        L_0x0028:
            r2.f43698e = r10
        L_0x002a:
            java.lang.Object r3 = r10.mo72521h0()
            boolean r4 = r3 instanceof kotlinx.coroutines.C19793s0
            r5 = 1
            if (r4 == 0) goto L_0x006e
            r4 = r3
            kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.C19793s0) r4
            boolean r6 = r4.f43759b
            if (r6 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f43700b
        L_0x003c:
            boolean r4 = r6.compareAndSet(r10, r3, r2)
            if (r4 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            java.lang.Object r4 = r6.get(r10)
            if (r4 == r3) goto L_0x003c
            r5 = r0
        L_0x004a:
            if (r5 == 0) goto L_0x002a
            return r2
        L_0x004d:
            kotlinx.coroutines.p1 r3 = new kotlinx.coroutines.p1
            r3.<init>()
            boolean r5 = r4.f43759b
            if (r5 == 0) goto L_0x0058
            r6 = r3
            goto L_0x005e
        L_0x0058:
            kotlinx.coroutines.z0 r5 = new kotlinx.coroutines.z0
            r5.<init>(r3)
            r6 = r5
        L_0x005e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f43700b
        L_0x0060:
            boolean r3 = r7.compareAndSet(r10, r4, r6)
            if (r3 == 0) goto L_0x0067
            goto L_0x002a
        L_0x0067:
            java.lang.Object r3 = r7.get(r10)
            if (r3 == r4) goto L_0x0060
            goto L_0x002a
        L_0x006e:
            boolean r4 = r3 instanceof kotlinx.coroutines.C19466a1
            if (r4 == 0) goto L_0x00f0
            r4 = r3
            kotlinx.coroutines.a1 r4 = (kotlinx.coroutines.C19466a1) r4
            kotlinx.coroutines.p1 r4 = r4.mo72101d()
            if (r4 != 0) goto L_0x008b
            if (r3 == 0) goto L_0x0083
            kotlinx.coroutines.j1 r3 = (kotlinx.coroutines.C19746j1) r3
            r10.mo72529u0(r3)
            goto L_0x002a
        L_0x0083:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r11.<init>(r12)
            throw r11
        L_0x008b:
            kotlinx.coroutines.q1 r6 = kotlinx.coroutines.C19770q1.f43725b
            r7 = 2
            if (r11 == 0) goto L_0x00d1
            boolean r8 = r3 instanceof kotlinx.coroutines.C19749k1.C19752c
            if (r8 == 0) goto L_0x00d1
            monitor-enter(r3)
            r8 = r3
            kotlinx.coroutines.k1$c r8 = (kotlinx.coroutines.C19749k1.C19752c) r8     // Catch:{ all -> 0x00ce }
            java.lang.Throwable r8 = r8.mo72536b()     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00ab
            boolean r9 = r13 instanceof kotlinx.coroutines.C19765p     // Catch:{ all -> 0x00ce }
            if (r9 == 0) goto L_0x00ca
            r9 = r3
            kotlinx.coroutines.k1$c r9 = (kotlinx.coroutines.C19749k1.C19752c) r9     // Catch:{ all -> 0x00ce }
            boolean r9 = r9.mo72538e()     // Catch:{ all -> 0x00ce }
            if (r9 != 0) goto L_0x00ca
        L_0x00ab:
            kotlinx.coroutines.l1 r6 = new kotlinx.coroutines.l1     // Catch:{ all -> 0x00ce }
            r6.<init>(r2, r10, r3)     // Catch:{ all -> 0x00ce }
        L_0x00b0:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r9 = r4.mo72422w()     // Catch:{ all -> 0x00ce }
            int r9 = r9.mo72416E(r2, r4, r6)     // Catch:{ all -> 0x00ce }
            if (r9 == r5) goto L_0x00bf
            if (r9 == r7) goto L_0x00bd
            goto L_0x00b0
        L_0x00bd:
            r6 = r0
            goto L_0x00c0
        L_0x00bf:
            r6 = r5
        L_0x00c0:
            if (r6 != 0) goto L_0x00c5
            monitor-exit(r3)
            goto L_0x002a
        L_0x00c5:
            if (r8 != 0) goto L_0x00c9
            monitor-exit(r3)
            return r2
        L_0x00c9:
            r6 = r2
        L_0x00ca:
            kotlin.m r9 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00ce }
            monitor-exit(r3)
            goto L_0x00d2
        L_0x00ce:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        L_0x00d1:
            r8 = r1
        L_0x00d2:
            if (r8 == 0) goto L_0x00da
            if (r12 == 0) goto L_0x00d9
            r13.invoke(r8)
        L_0x00d9:
            return r6
        L_0x00da:
            kotlinx.coroutines.l1 r6 = new kotlinx.coroutines.l1
            r6.<init>(r2, r10, r3)
        L_0x00df:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r4.mo72422w()
            int r3 = r3.mo72416E(r2, r4, r6)
            if (r3 == r5) goto L_0x00ed
            if (r3 == r7) goto L_0x00ec
            goto L_0x00df
        L_0x00ec:
            r5 = r0
        L_0x00ed:
            if (r5 == 0) goto L_0x002a
            return r2
        L_0x00f0:
            if (r12 == 0) goto L_0x0102
            boolean r11 = r3 instanceof kotlinx.coroutines.C19830v
            if (r11 == 0) goto L_0x00f9
            kotlinx.coroutines.v r3 = (kotlinx.coroutines.C19830v) r3
            goto L_0x00fa
        L_0x00f9:
            r3 = r1
        L_0x00fa:
            if (r3 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            java.lang.Throwable r1 = r3.f43842a
        L_0x00ff:
            r13.invoke(r1)
        L_0x0102:
            kotlinx.coroutines.q1 r11 = kotlinx.coroutines.C19770q1.f43725b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72396f0(boolean, boolean, kq.l):kotlinx.coroutines.p0");
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: g */
    public final C19434j mo72397g() {
        return new C19434j(new JobSupport$children$1(this, (C19340c<? super JobSupport$children$1>) null));
    }

    /* renamed from: g0 */
    public final C19762o mo72520g0() {
        return (C19762o) this._parentHandle;
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public final CoroutineContext.C19337b<?> getKey() {
        return C19699g1.C19701b.f43635b;
    }

    /* renamed from: h */
    public final CancellationException mo72398h() {
        Object h0 = mo72521h0();
        CancellationException cancellationException = null;
        if (h0 instanceof C19752c) {
            Throwable b = ((C19752c) h0).mo72536b();
            if (b != null) {
                String l = C19383o.m32802l(" is cancelling", getClass().getSimpleName());
                if (b instanceof CancellationException) {
                    cancellationException = (CancellationException) b;
                }
                if (cancellationException == null) {
                    if (l == null) {
                        l = mo72096P();
                    }
                    cancellationException = new JobCancellationException(l, b, this);
                }
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(C19383o.m32802l(this, "Job is still new or active: ").toString());
        } else if (h0 instanceof C19466a1) {
            throw new IllegalStateException(C19383o.m32802l(this, "Job is still new or active: ").toString());
        } else if (!(h0 instanceof C19830v)) {
            return new JobCancellationException(C19383o.m32802l(" has completed normally", getClass().getSimpleName()), (Throwable) null, this);
        } else {
            Throwable th = ((C19830v) h0).f43842a;
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            return cancellationException == null ? new JobCancellationException(mo72096P(), th, this) : cancellationException;
        }
    }

    /* renamed from: h0 */
    public final Object mo72521h0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C19730n)) {
                return obj;
            }
            ((C19730n) obj).mo72436c(this);
        }
    }

    /* renamed from: i0 */
    public boolean mo72522i0(Throwable th) {
        return false;
    }

    public boolean isActive() {
        Object h0 = mo72521h0();
        return (h0 instanceof C19466a1) && ((C19466a1) h0).isActive();
    }

    public final boolean isCancelled() {
        Object h0 = mo72521h0();
        return (h0 instanceof C19830v) || ((h0 instanceof C19752c) && ((C19752c) h0).mo72537c());
    }

    /* renamed from: j */
    public final C19762o mo72400j(C19749k1 k1Var) {
        return (C19762o) C19699g1.C19700a.m33480a(this, true, new C19765p(k1Var), 2);
    }

    /* renamed from: j0 */
    public void mo72098j0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* renamed from: k */
    public final C19766p0 mo72401k(C19857l<? super Throwable, C19394m> lVar) {
        return mo72396f0(false, true, lVar);
    }

    /* renamed from: k0 */
    public final void mo72523k0(C19699g1 g1Var) {
        if (g1Var == null) {
            this._parentHandle = C19770q1.f43725b;
            return;
        }
        g1Var.start();
        C19762o j = g1Var.mo72400j(this);
        this._parentHandle = j;
        if (mo72395f()) {
            j.dispose();
            this._parentHandle = C19770q1.f43725b;
        }
    }

    /* renamed from: l0 */
    public boolean mo72477l0() {
        return this instanceof C19542e;
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    /* renamed from: n0 */
    public final boolean mo72524n0(Object obj) {
        Object z0;
        do {
            z0 = mo72532z0(mo72521h0(), obj);
            if (z0 == C14088a.f31032m) {
                return false;
            }
            if (z0 == C14088a.f31033n) {
                return true;
            }
        } while (z0 == C14088a.f31034o);
        mo72252H(z0);
        return true;
    }

    /* renamed from: o0 */
    public final Object mo72525o0(Object obj) {
        Object z0;
        do {
            z0 = mo72532z0(mo72521h0(), obj);
            if (z0 == C14088a.f31032m) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                C19830v vVar = obj instanceof C19830v ? (C19830v) obj : null;
                if (vVar != null) {
                    th = vVar.f43842a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (z0 == C14088a.f31034o);
        return z0;
    }

    /* renamed from: p0 */
    public String mo72099p0() {
        return getClass().getSimpleName();
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }

    /* renamed from: r0 */
    public final void mo72526r0(C19767p1 p1Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) p1Var.mo72420t(); !C19383o.m32792b(lockFreeLinkedListNode, p1Var); lockFreeLinkedListNode = lockFreeLinkedListNode.mo72421u()) {
            if (lockFreeLinkedListNode instanceof C19704h1) {
                C19746j1 j1Var = (C19746j1) lockFreeLinkedListNode;
                try {
                    j1Var.mo72253F(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        C17782b.m29886t(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + j1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            mo72098j0(completionHandlerException2);
        }
        mo72510N(th);
    }

    /* renamed from: s0 */
    public void mo72100s0(Object obj) {
    }

    public final boolean start() {
        int w0;
        do {
            w0 = mo72531w0(mo72521h0());
            if (w0 == 0) {
                return false;
            }
        } while (w0 != 1);
        return true;
    }

    /* renamed from: t0 */
    public void mo72527t0() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo72099p0() + '{' + m33610y0(mo72521h0()) + '}');
        sb.append('@');
        sb.append(C19543e0.m33300R(this));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[LOOP:2: B:12:0x0036->B:15:0x0041, LOOP_START] */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72529u0(kotlinx.coroutines.C19746j1 r6) {
        /*
            r5 = this;
            kotlinx.coroutines.p1 r0 = new kotlinx.coroutines.p1
            r0.<init>()
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43639c
            r1.lazySet(r0, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
            r1.lazySet(r0, r6)
        L_0x0012:
            java.lang.Object r1 = r6.mo72420t()
            r2 = 0
            if (r1 == r6) goto L_0x001a
            goto L_0x0030
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
        L_0x001c:
            boolean r3 = r1.compareAndSet(r6, r6, r0)
            r4 = 1
            if (r3 == 0) goto L_0x0025
            r2 = r4
            goto L_0x002b
        L_0x0025:
            java.lang.Object r3 = r1.get(r6)
            if (r3 == r6) goto L_0x001c
        L_0x002b:
            if (r2 == 0) goto L_0x0012
            r0.mo72419r(r6)
        L_0x0030:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r6.mo72421u()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f43700b
        L_0x0036:
            boolean r0 = r2.compareAndSet(r5, r6, r1)
            if (r0 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == r6) goto L_0x0036
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72529u0(kotlinx.coroutines.j1):void");
    }

    /* renamed from: v0 */
    public final <T, R> void mo72530v0(C19805f<? super R> fVar, C19861p<? super T, ? super C19340c<? super R>, ? extends Object> pVar) {
        Object h0;
        do {
            h0 = mo72521h0();
            if (!fVar.mo72631e()) {
                if (!(h0 instanceof C19466a1)) {
                    if (!fVar.mo72634k()) {
                        return;
                    }
                    if (h0 instanceof C19830v) {
                        fVar.mo72636n(((C19830v) h0).f43842a);
                        return;
                    } else {
                        C19543e0.m33324n0(pVar, C14088a.m21796y(h0), fVar.mo72635l());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (mo72531w0(h0) != 0);
        fVar.mo72632h(mo72401k(new C19832v1(fVar, pVar)));
    }

    /* renamed from: w0 */
    public final int mo72531w0(Object obj) {
        boolean z = false;
        if (obj instanceof C19793s0) {
            if (((C19793s0) obj).f43759b) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43700b;
            C19793s0 s0Var = C14088a.f31038s;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo72527t0();
            return 1;
        } else if (!(obj instanceof C19844z0)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43700b;
            C19767p1 p1Var = ((C19844z0) obj).f43851b;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, p1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo72527t0();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b1, code lost:
        if (r5 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b4, code lost:
        mo72526r0(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00b9, code lost:
        if ((r8 instanceof kotlinx.coroutines.C19765p) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00bb, code lost:
        r0 = (kotlinx.coroutines.C19765p) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00bf, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c0, code lost:
        if (r0 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c2, code lost:
        r8 = r8.mo72101d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00c6, code lost:
        if (r8 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00c9, code lost:
        r4 = m33609q0(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ce, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00cf, code lost:
        if (r4 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00d5, code lost:
        if (mo72506A0(r3, r4, r9) == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return mo72514W(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return p514bk.C14088a.f31033n;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72532z0(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.C19466a1
            if (r0 != 0) goto L_0x0007
            kotlinx.coroutines.internal.t r8 = p514bk.C14088a.f31032m
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof kotlinx.coroutines.C19793s0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r8 instanceof kotlinx.coroutines.C19746j1
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r8 instanceof kotlinx.coroutines.C19765p
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9 instanceof kotlinx.coroutines.C19830v
            if (r0 != 0) goto L_0x004c
            r0 = r8
            kotlinx.coroutines.a1 r0 = (kotlinx.coroutines.C19466a1) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f43700b
            boolean r8 = r9 instanceof kotlinx.coroutines.C19466a1
            if (r8 == 0) goto L_0x002c
            kotlinx.coroutines.b1 r8 = new kotlinx.coroutines.b1
            r4 = r9
            kotlinx.coroutines.a1 r4 = (kotlinx.coroutines.C19466a1) r4
            r8.<init>(r4)
            r4 = r8
            goto L_0x002d
        L_0x002c:
            r4 = r9
        L_0x002d:
            boolean r8 = r3.compareAndSet(r7, r0, r4)
            if (r8 == 0) goto L_0x0035
            r8 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r8 = r3.get(r7)
            if (r8 == r0) goto L_0x002d
            r8 = r2
        L_0x003c:
            if (r8 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r7.mo72100s0(r9)
            r7.mo72512U(r0, r9)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r9
        L_0x0049:
            kotlinx.coroutines.internal.t r8 = p514bk.C14088a.f31034o
            return r8
        L_0x004c:
            kotlinx.coroutines.a1 r8 = (kotlinx.coroutines.C19466a1) r8
            kotlinx.coroutines.p1 r0 = r7.mo72519e0(r8)
            if (r0 != 0) goto L_0x0058
            kotlinx.coroutines.internal.t r8 = p514bk.C14088a.f31034o
            goto L_0x00de
        L_0x0058:
            boolean r3 = r8 instanceof kotlinx.coroutines.C19749k1.C19752c
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r8
            kotlinx.coroutines.k1$c r3 = (kotlinx.coroutines.C19749k1.C19752c) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            kotlinx.coroutines.k1$c r3 = new kotlinx.coroutines.k1$c
            r3.<init>(r0, r4)
        L_0x0069:
            monitor-enter(r3)
            boolean r5 = r3.mo72538e()     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0075
            kotlinx.coroutines.internal.t r8 = p514bk.C14088a.f31032m     // Catch:{ all -> 0x00df }
            monitor-exit(r3)
            goto L_0x00de
        L_0x0075:
            r3.mo72541h()     // Catch:{ all -> 0x00df }
            if (r3 == r8) goto L_0x0090
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f43700b     // Catch:{ all -> 0x00df }
        L_0x007c:
            boolean r6 = r5.compareAndSet(r7, r8, r3)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x0084
            r2 = r1
            goto L_0x008a
        L_0x0084:
            java.lang.Object r6 = r5.get(r7)     // Catch:{ all -> 0x00df }
            if (r6 == r8) goto L_0x007c
        L_0x008a:
            if (r2 != 0) goto L_0x0090
            kotlinx.coroutines.internal.t r8 = p514bk.C14088a.f31034o     // Catch:{ all -> 0x00df }
            monitor-exit(r3)
            goto L_0x00de
        L_0x0090:
            boolean r2 = r3.mo72537c()     // Catch:{ all -> 0x00df }
            boolean r5 = r9 instanceof kotlinx.coroutines.C19830v     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x009c
            r5 = r9
            kotlinx.coroutines.v r5 = (kotlinx.coroutines.C19830v) r5     // Catch:{ all -> 0x00df }
            goto L_0x009d
        L_0x009c:
            r5 = r4
        L_0x009d:
            if (r5 != 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            java.lang.Throwable r5 = r5.f43842a     // Catch:{ all -> 0x00df }
            r3.mo72535a(r5)     // Catch:{ all -> 0x00df }
        L_0x00a5:
            java.lang.Throwable r5 = r3.mo72536b()     // Catch:{ all -> 0x00df }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r5 = r4
        L_0x00ae:
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00df }
            monitor-exit(r3)
            if (r5 != 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r7.mo72526r0(r0, r5)
        L_0x00b7:
            boolean r0 = r8 instanceof kotlinx.coroutines.C19765p
            if (r0 == 0) goto L_0x00bf
            r0 = r8
            kotlinx.coroutines.p r0 = (kotlinx.coroutines.C19765p) r0
            goto L_0x00c0
        L_0x00bf:
            r0 = r4
        L_0x00c0:
            if (r0 != 0) goto L_0x00ce
            kotlinx.coroutines.p1 r8 = r8.mo72101d()
            if (r8 != 0) goto L_0x00c9
            goto L_0x00cf
        L_0x00c9:
            kotlinx.coroutines.p r4 = m33609q0(r8)
            goto L_0x00cf
        L_0x00ce:
            r4 = r0
        L_0x00cf:
            if (r4 == 0) goto L_0x00da
            boolean r8 = r7.mo72506A0(r3, r4, r9)
            if (r8 == 0) goto L_0x00da
            kotlinx.coroutines.internal.t r8 = p514bk.C14088a.f31033n
            goto L_0x00de
        L_0x00da:
            java.lang.Object r8 = r7.mo72514W(r3, r9)
        L_0x00de:
            return r8
        L_0x00df:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19749k1.mo72532z0(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
