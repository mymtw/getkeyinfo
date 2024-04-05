package kotlinx.coroutines.internal;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;

public class LockFreeLinkedListNode {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43638b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43639c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43640d;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    public static abstract class C19712a extends C19717b {
        /* renamed from: a */
        public final void mo72425a(C19718c<?> cVar, Object obj) {
            LockFreeLinkedListNode g;
            boolean z = true;
            boolean z2 = obj == null;
            LockFreeLinkedListNode f = mo72429f();
            if (f != null && (g = mo72430g()) != null) {
                Object l = z2 ? mo72433l(g) : g;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43638b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(f, cVar, l)) {
                        if (atomicReferenceFieldUpdater.get(f) != cVar) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && z2) {
                    mo72427d(g);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x005f A[LOOP:2: B:36:0x005f->B:39:0x0069, LOOP_START] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo72426b(kotlinx.coroutines.internal.C19718c<?> r7) {
            /*
                r6 = this;
            L_0x0000:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r6.mo72432k(r7)
                if (r0 != 0) goto L_0x0009
                kotlinx.coroutines.internal.t r7 = kotlinx.coroutines.C19543e0.f43497j
                return r7
            L_0x0009:
                java.lang.Object r1 = r0._next
                r2 = 0
                if (r1 != r7) goto L_0x000f
                return r2
            L_0x000f:
                boolean r3 = r7.mo72447h()
                if (r3 == 0) goto L_0x0016
                return r2
            L_0x0016:
                boolean r3 = r1 instanceof kotlinx.coroutines.internal.C19730n
                if (r3 == 0) goto L_0x0029
                kotlinx.coroutines.internal.n r1 = (kotlinx.coroutines.internal.C19730n) r1
                boolean r2 = r7.mo72472b(r1)
                if (r2 == 0) goto L_0x0025
                kotlinx.coroutines.internal.t r7 = kotlinx.coroutines.C19543e0.f43497j
                return r7
            L_0x0025:
                r1.mo72436c(r0)
                goto L_0x0000
            L_0x0029:
                java.lang.Object r3 = r6.mo72157c(r0)
                if (r3 == 0) goto L_0x0030
                return r3
            L_0x0030:
                boolean r3 = r6.mo72431j(r1)
                if (r3 == 0) goto L_0x0037
                goto L_0x0000
            L_0x0037:
                kotlinx.coroutines.internal.LockFreeLinkedListNode$c r3 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$c
                r4 = r1
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
                r3.<init>(r0, r4, r6)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
            L_0x0041:
                boolean r5 = r4.compareAndSet(r0, r1, r3)
                if (r5 == 0) goto L_0x0049
                r4 = 1
                goto L_0x0050
            L_0x0049:
                java.lang.Object r5 = r4.get(r0)
                if (r5 == r1) goto L_0x0041
                r4 = 0
            L_0x0050:
                if (r4 == 0) goto L_0x0000
                java.lang.Object r4 = r3.mo72436c(r0)     // Catch:{ all -> 0x005c }
                kotlinx.coroutines.internal.t r0 = kotlin.reflect.C19421p.f43322l     // Catch:{ all -> 0x005c }
                if (r4 != r0) goto L_0x005b
                goto L_0x0000
            L_0x005b:
                return r2
            L_0x005c:
                r7 = move-exception
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
            L_0x005f:
                boolean r4 = r2.compareAndSet(r0, r3, r1)
                if (r4 != 0) goto L_0x006c
                java.lang.Object r4 = r2.get(r0)
                if (r4 != r3) goto L_0x006c
                goto L_0x005f
            L_0x006c:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.C19712a.mo72426b(kotlinx.coroutines.internal.c):java.lang.Object");
        }

        /* renamed from: c */
        public abstract Object mo72157c(LockFreeLinkedListNode lockFreeLinkedListNode);

        /* renamed from: d */
        public abstract void mo72427d(LockFreeLinkedListNode lockFreeLinkedListNode);

        /* renamed from: e */
        public abstract void mo72428e(C19714c cVar);

        /* renamed from: f */
        public abstract LockFreeLinkedListNode mo72429f();

        /* renamed from: g */
        public abstract LockFreeLinkedListNode mo72430g();

        /* renamed from: h */
        public Object mo72158h(C19714c cVar) {
            mo72428e(cVar);
            return null;
        }

        /* renamed from: i */
        public void mo72159i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        /* renamed from: j */
        public abstract boolean mo72431j(Object obj);

        /* renamed from: k */
        public abstract LockFreeLinkedListNode mo72432k(C19730n nVar);

        /* renamed from: l */
        public abstract C19731o mo72433l(LockFreeLinkedListNode lockFreeLinkedListNode);
    }

    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$b */
    public static abstract class C19713b extends C19718c<LockFreeLinkedListNode> {

        /* renamed from: b */
        public final LockFreeLinkedListNode f43641b;

        /* renamed from: c */
        public LockFreeLinkedListNode f43642c;

        public C19713b(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f43641b = lockFreeLinkedListNode;
        }

        /* renamed from: d */
        public final void mo72434d(Object obj, Object obj2) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            boolean z = true;
            boolean z2 = obj2 == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z2 ? this.f43641b : this.f43642c;
            if (lockFreeLinkedListNode2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43638b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                        if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != this) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && z2) {
                    LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f43641b;
                    LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f43642c;
                    C19383o.m32794d(lockFreeLinkedListNode4);
                    lockFreeLinkedListNode3.mo72419r(lockFreeLinkedListNode4);
                }
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$c */
    public static final class C19714c extends C19730n {

        /* renamed from: a */
        public final LockFreeLinkedListNode f43643a;

        /* renamed from: b */
        public final LockFreeLinkedListNode f43644b;

        /* renamed from: c */
        public final C19712a f43645c;

        public C19714c(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, C19712a aVar) {
            this.f43643a = lockFreeLinkedListNode;
            this.f43644b = lockFreeLinkedListNode2;
            this.f43645c = aVar;
        }

        /* renamed from: a */
        public final C19718c<?> mo72435a() {
            C19718c<?> cVar = this.f43645c.f43656a;
            if (cVar != null) {
                return cVar;
            }
            C19383o.m32805o("atomicOp");
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[LOOP:1: B:24:0x0060->B:27:0x006b, LOOP_START] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo72436c(java.lang.Object r6) {
            /*
                r5 = this;
                if (r6 == 0) goto L_0x006e
                kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r6
                kotlinx.coroutines.internal.LockFreeLinkedListNode$a r0 = r5.f43645c
                java.lang.Object r0 = r0.mo72158h(r5)
                kotlinx.coroutines.internal.t r1 = kotlin.reflect.C19421p.f43322l
                r2 = 0
                if (r0 != r1) goto L_0x0035
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r5.f43644b
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
                kotlinx.coroutines.internal.o r3 = r1.mo72415C()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
            L_0x0019:
                boolean r0 = r4.compareAndSet(r6, r5, r3)
                if (r0 == 0) goto L_0x0021
                r0 = 1
                goto L_0x0028
            L_0x0021:
                java.lang.Object r0 = r4.get(r6)
                if (r0 == r5) goto L_0x0019
                r0 = 0
            L_0x0028:
                if (r0 == 0) goto L_0x0032
                kotlinx.coroutines.internal.LockFreeLinkedListNode$a r0 = r5.f43645c
                r0.mo72159i(r6)
                r1.mo72418q()
            L_0x0032:
                kotlinx.coroutines.internal.t r6 = kotlin.reflect.C19421p.f43322l
                return r6
            L_0x0035:
                if (r0 == 0) goto L_0x0040
                kotlinx.coroutines.internal.c r1 = r5.mo72435a()
                java.lang.Object r0 = r1.mo72444e(r0)
                goto L_0x0048
            L_0x0040:
                kotlinx.coroutines.internal.c r0 = r5.mo72435a()
                java.lang.Object r0 = r0.mo72445f()
            L_0x0048:
                kotlinx.coroutines.internal.t r1 = kotlinx.coroutines.C19543e0.f43496i
                if (r0 != r1) goto L_0x0051
                kotlinx.coroutines.internal.c r0 = r5.mo72435a()
                goto L_0x005e
            L_0x0051:
                if (r0 != 0) goto L_0x005c
                kotlinx.coroutines.internal.LockFreeLinkedListNode$a r0 = r5.f43645c
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r5.f43644b
                kotlinx.coroutines.internal.o r0 = r0.mo72433l(r1)
                goto L_0x005e
            L_0x005c:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r5.f43644b
            L_0x005e:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f43638b
            L_0x0060:
                boolean r3 = r1.compareAndSet(r6, r5, r0)
                if (r3 == 0) goto L_0x0067
                goto L_0x006d
            L_0x0067:
                java.lang.Object r3 = r1.get(r6)
                if (r3 == r5) goto L_0x0060
            L_0x006d:
                return r2
            L_0x006e:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.C19714c.mo72436c(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d */
        public final void mo72437d() {
            this.f43645c.mo72428e(this);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PrepareOp(op=");
            h.append(mo72435a());
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$d */
    public static class C19715d<T> extends C19712a {

        /* renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f43646c;

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f43647d;
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b */
        public final LockFreeLinkedListNode f43648b;

        static {
            Class<Object> cls = Object.class;
            Class<C19715d> cls2 = C19715d.class;
            f43646c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_affectedNode");
            f43647d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_originalNext");
        }

        public C19715d(C19724i iVar) {
            this.f43648b = iVar;
        }

        /* renamed from: c */
        public Object mo72157c(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode == this.f43648b) {
                return C19388s.f43282m;
            }
            return null;
        }

        /* renamed from: d */
        public final void mo72427d(LockFreeLinkedListNode lockFreeLinkedListNode) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43638b;
            lockFreeLinkedListNode.mo72418q();
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x0004 A[LOOP:0: B:1:0x0004->B:4:0x0010, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0016 A[LOOP:1: B:6:0x0016->B:9:0x0021, LOOP_START] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo72428e(kotlinx.coroutines.internal.LockFreeLinkedListNode.C19714c r6) {
            /*
                r5 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f43646c
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r6.f43643a
            L_0x0004:
                r2 = 0
                boolean r3 = r0.compareAndSet(r5, r2, r1)
                if (r3 == 0) goto L_0x000c
                goto L_0x0012
            L_0x000c:
                java.lang.Object r3 = r0.get(r5)
                if (r3 == 0) goto L_0x0004
            L_0x0012:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f43647d
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r6.f43644b
            L_0x0016:
                boolean r6 = r3.compareAndSet(r5, r2, r4)
                if (r6 == 0) goto L_0x001d
                goto L_0x0023
            L_0x001d:
                java.lang.Object r6 = r3.get(r5)
                if (r6 == 0) goto L_0x0016
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.C19715d.mo72428e(kotlinx.coroutines.internal.LockFreeLinkedListNode$c):void");
        }

        /* renamed from: f */
        public final LockFreeLinkedListNode mo72429f() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        /* renamed from: g */
        public final LockFreeLinkedListNode mo72430g() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        /* renamed from: j */
        public final boolean mo72431j(Object obj) {
            if (!(obj instanceof C19731o)) {
                return false;
            }
            ((C19731o) obj).f43682a.mo72423x();
            return true;
        }

        /* renamed from: k */
        public final LockFreeLinkedListNode mo72432k(C19730n nVar) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f43648b;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (!(obj instanceof C19730n)) {
                    return (LockFreeLinkedListNode) obj;
                }
                C19730n nVar2 = (C19730n) obj;
                if (nVar.mo72472b(nVar2)) {
                    return null;
                }
                nVar2.mo72436c(this.f43648b);
            }
        }

        /* renamed from: l */
        public final C19731o mo72433l(LockFreeLinkedListNode lockFreeLinkedListNode) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43638b;
            return lockFreeLinkedListNode.mo72415C();
        }

        /* renamed from: m */
        public final LockFreeLinkedListNode mo72439m() {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) this._affectedNode;
            C19383o.m32794d(lockFreeLinkedListNode);
            return lockFreeLinkedListNode;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<LockFreeLinkedListNode> cls2 = LockFreeLinkedListNode.class;
        f43638b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f43639c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f43640d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: A */
    public boolean mo72219A() {
        return mo72414B() == null;
    }

    /* renamed from: B */
    public final LockFreeLinkedListNode mo72414B() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        boolean z;
        do {
            Object t = mo72420t();
            if (!(t instanceof C19731o)) {
                if (t != this) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) t;
                    C19731o C = lockFreeLinkedListNode.mo72415C();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43638b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, t, C)) {
                            if (atomicReferenceFieldUpdater.get(this) != t) {
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
                } else {
                    return (LockFreeLinkedListNode) t;
                }
            } else {
                return ((C19731o) t).f43682a;
            }
        } while (!z);
        lockFreeLinkedListNode.mo72418q();
        return null;
    }

    /* renamed from: C */
    public final C19731o mo72415C() {
        C19731o oVar = (C19731o) this._removedRef;
        if (oVar != null) {
            return oVar;
        }
        C19731o oVar2 = new C19731o(this);
        f43640d.lazySet(this, oVar2);
        return oVar2;
    }

    /* renamed from: E */
    public final int mo72416E(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, C19713b bVar) {
        boolean z;
        f43639c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43638b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        bVar.f43642c = lockFreeLinkedListNode2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        return bVar.mo72436c(this) == null ? 1 : 2;
    }

    /* renamed from: p */
    public final boolean mo72417p(LockFreeLinkedListNode lockFreeLinkedListNode, C19724i iVar) {
        boolean z;
        f43639c.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43638b;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, iVar);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, lockFreeLinkedListNode)) {
                if (atomicReferenceFieldUpdater.get(this) != iVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        lockFreeLinkedListNode.mo72419r(iVar);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f43638b;
        r4 = ((kotlinx.coroutines.internal.C19731o) r4).f43682a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode mo72418q() {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r0 = r10._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L_0x0024
            if (r0 != r2) goto L_0x0010
            return r2
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f43639c
        L_0x0012:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L_0x001a
            r5 = r6
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r2
        L_0x0024:
            boolean r7 = r10.mo72424y()
            if (r7 == 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r2
        L_0x002e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.C19730n
            if (r7 == 0) goto L_0x0038
            kotlinx.coroutines.internal.n r4 = (kotlinx.coroutines.internal.C19730n) r4
            r4.mo72436c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.C19731o
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f43638b
            kotlinx.coroutines.internal.o r4 = (kotlinx.coroutines.internal.C19731o) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f43682a
        L_0x0044:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L_0x004c
            r5 = r6
            goto L_0x0052
        L_0x004c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r2 = r3
            goto L_0x0006
        L_0x0057:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x0007
        L_0x005c:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.mo72418q():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: r */
    public final void mo72419r(LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean z;
        do {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (mo72420t() == lockFreeLinkedListNode) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43639c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                        if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
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
            } else {
                return;
            }
        } while (!z);
        if (mo72424y()) {
            lockFreeLinkedListNode.mo72418q();
        }
    }

    /* renamed from: t */
    public final Object mo72420t() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C19730n)) {
                return obj;
            }
            ((C19730n) obj).mo72436c(this);
        }
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + C19543e0.m33300R(this);
    }

    /* renamed from: u */
    public final LockFreeLinkedListNode mo72421u() {
        Object t = mo72420t();
        LockFreeLinkedListNode lockFreeLinkedListNode = null;
        C19731o oVar = t instanceof C19731o ? (C19731o) t : null;
        if (oVar != null) {
            lockFreeLinkedListNode = oVar.f43682a;
        }
        return lockFreeLinkedListNode == null ? (LockFreeLinkedListNode) t : lockFreeLinkedListNode;
    }

    /* renamed from: w */
    public final LockFreeLinkedListNode mo72422w() {
        LockFreeLinkedListNode q = mo72418q();
        if (q == null) {
            Object obj = this._prev;
            while (true) {
                q = (LockFreeLinkedListNode) obj;
                if (!q.mo72424y()) {
                    break;
                }
                obj = q._prev;
            }
        }
        return q;
    }

    /* renamed from: x */
    public final void mo72423x() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object t = lockFreeLinkedListNode.mo72420t();
            if (!(t instanceof C19731o)) {
                lockFreeLinkedListNode.mo72418q();
                return;
            }
            lockFreeLinkedListNode = ((C19731o) t).f43682a;
        }
    }

    /* renamed from: y */
    public boolean mo72424y() {
        return mo72420t() instanceof C19731o;
    }
}
