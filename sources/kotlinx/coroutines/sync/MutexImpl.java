package kotlinx.coroutines.sync;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19766p0;
import kotlinx.coroutines.internal.C19718c;
import kotlinx.coroutines.internal.C19724i;
import kotlinx.coroutines.internal.C19730n;
import kotlinx.coroutines.internal.C19731o;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.C19804e;
import p514bk.C14088a;

public final class MutexImpl implements C19814c, C19804e<Object, C19814c> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43797b = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    public final class LockCont extends C19809a {

        /* renamed from: g */
        public final C19747k<C19394m> f43798g;

        public LockCont(Object obj, C19753l lVar) {
            super(obj);
            this.f43798g = lVar;
        }

        /* renamed from: F */
        public final void mo72644F() {
            this.f43798g.mo72501m();
        }

        /* renamed from: G */
        public final boolean mo72645G() {
            return C19809a.f43800f.compareAndSet(this, 0, 1) && this.f43798g.mo72496J(C19394m.f43287a, (LockFreeLinkedListNode.C19712a) null, new MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl.this, this)) != null;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LockCont[");
            h.append(this.f43801e);
            h.append(", ");
            h.append(this.f43798g);
            h.append("] for ");
            h.append(MutexImpl.this);
            return h.toString();
        }
    }

    public final class LockSelect<R> extends C19809a {
        public LockSelect() {
            throw null;
        }

        /* renamed from: F */
        public final void mo72644F() {
            throw null;
        }

        /* renamed from: G */
        public final boolean mo72645G() {
            if (!C19809a.f43800f.compareAndSet(this, 0, 1)) {
                return false;
            }
            throw null;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LockSelect[");
            h.append(this.f43801e);
            h.append(", ");
            h.append((Object) null);
            h.append("] for ");
            h.append((Object) null);
            return h.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    public abstract class C19809a extends LockFreeLinkedListNode implements C19766p0 {

        /* renamed from: f */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f43800f = AtomicIntegerFieldUpdater.newUpdater(C19809a.class, "isTaken");

        /* renamed from: e */
        public final Object f43801e;
        private volatile /* synthetic */ int isTaken = 0;

        public C19809a(Object obj) {
            this.f43801e = obj;
        }

        /* renamed from: F */
        public abstract void mo72644F();

        /* renamed from: G */
        public abstract boolean mo72645G();

        public final void dispose() {
            mo72219A();
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$b */
    public static final class C19810b extends C19724i {

        /* renamed from: e */
        public Object f43802e;

        public C19810b(Object obj) {
            this.f43802e = obj;
        }

        public final String toString() {
            return C0073e.m209i(C0072d.m201h("LockedQueue["), this.f43802e, ']');
        }
    }

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$c */
    public static final class C19811c extends C19718c<MutexImpl> {

        /* renamed from: b */
        public final C19810b f43803b;

        public C19811c(C19810b bVar) {
            this.f43803b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:5:0x000b A[LOOP:0: B:5:0x000b->B:8:0x0016, LOOP_START] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo72434d(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                kotlinx.coroutines.sync.MutexImpl r3 = (kotlinx.coroutines.sync.MutexImpl) r3
                if (r4 != 0) goto L_0x0007
                kotlinx.coroutines.sync.b r4 = p514bk.C14088a.f31043x
                goto L_0x0009
            L_0x0007:
                kotlinx.coroutines.sync.MutexImpl$b r4 = r2.f43803b
            L_0x0009:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.f43797b
            L_0x000b:
                boolean r1 = r0.compareAndSet(r3, r2, r4)
                if (r1 == 0) goto L_0x0012
                goto L_0x0018
            L_0x0012:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r2) goto L_0x000b
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.C19811c.mo72434d(java.lang.Object, java.lang.Object):void");
        }

        /* renamed from: i */
        public final Object mo72160i(Object obj) {
            MutexImpl mutexImpl = (MutexImpl) obj;
            C19810b bVar = this.f43803b;
            if (bVar.mo72420t() == bVar) {
                return null;
            }
            return C14088a.f31039t;
        }
    }

    public MutexImpl(boolean z) {
        this._state = z ? C14088a.f31042w : C14088a.f31043x;
    }

    /* renamed from: a */
    public final boolean mo72639a(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            boolean z2 = false;
            if (obj2 instanceof C19813b) {
                if (((C19813b) obj2).f43806a != C14088a.f31041v) {
                    return false;
                }
                C19813b bVar = obj == null ? C14088a.f31042w : new C19813b(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43797b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            } else if (obj2 instanceof C19810b) {
                if (((C19810b) obj2).f43802e == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(C19383o.m32802l(obj, "Already locked by ").toString());
            } else if (obj2 instanceof C19730n) {
                ((C19730n) obj2).mo72436c(this);
            } else {
                throw new IllegalStateException(C19383o.m32802l(obj2, "Illegal state ").toString());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo72640b() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C19813b) {
                return ((C19813b) obj).f43806a != C14088a.f31041v;
            }
            if (obj instanceof C19810b) {
                return true;
            }
            if (obj instanceof C19730n) {
                ((C19730n) obj).mo72436c(this);
            } else {
                throw new IllegalStateException(C19383o.m32802l(obj, "Illegal state ").toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[LOOP:1: B:10:0x0030->B:13:0x003b, LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72641c(java.lang.Object r8, kotlin.coroutines.C19340c<? super kotlin.C19394m> r9) {
        /*
            r7 = this;
            boolean r0 = r7.mo72639a(r8)
            if (r0 == 0) goto L_0x0009
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        L_0x0009:
            kotlin.coroutines.c r9 = kotlin.jvm.internal.C19388s.m32873m0(r9)
            kotlinx.coroutines.l r9 = androidx.compose.foundation.layout.C0761x.m1717e0(r9)
            kotlinx.coroutines.sync.MutexImpl$LockCont r0 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r0.<init>(r8, r9)
        L_0x0016:
            java.lang.Object r1 = r7._state
            boolean r2 = r1 instanceof kotlinx.coroutines.sync.C19813b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0065
            r2 = r1
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.C19813b) r2
            java.lang.Object r5 = r2.f43806a
            kotlinx.coroutines.internal.t r6 = p514bk.C14088a.f31041v
            if (r5 == r6) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f43797b
            kotlinx.coroutines.sync.MutexImpl$b r6 = new kotlinx.coroutines.sync.MutexImpl$b
            java.lang.Object r2 = r2.f43806a
            r6.<init>(r2)
        L_0x0030:
            boolean r2 = r5.compareAndSet(r7, r1, r6)
            if (r2 == 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r2 = r5.get(r7)
            if (r2 == r1) goto L_0x0030
            goto L_0x0016
        L_0x003e:
            if (r8 != 0) goto L_0x0043
            kotlinx.coroutines.sync.b r2 = p514bk.C14088a.f31042w
            goto L_0x0048
        L_0x0043:
            kotlinx.coroutines.sync.b r2 = new kotlinx.coroutines.sync.b
            r2.<init>(r8)
        L_0x0048:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f43797b
        L_0x004a:
            boolean r6 = r5.compareAndSet(r7, r1, r2)
            if (r6 == 0) goto L_0x0052
            r3 = r4
            goto L_0x0058
        L_0x0052:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == r1) goto L_0x004a
        L_0x0058:
            if (r3 == 0) goto L_0x0016
            kotlin.m r0 = kotlin.C19394m.f43287a
            kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1 r1 = new kotlinx.coroutines.sync.MutexImpl$lockSuspend$2$1$1
            r1.<init>(r7, r8)
            r9.mo72503v(r1, r0)
            goto L_0x009a
        L_0x0065:
            boolean r2 = r1 instanceof kotlinx.coroutines.sync.MutexImpl.C19810b
            if (r2 == 0) goto L_0x00bb
            r2 = r1
            kotlinx.coroutines.sync.MutexImpl$b r2 = (kotlinx.coroutines.sync.MutexImpl.C19810b) r2
            java.lang.Object r5 = r2.f43802e
            if (r5 == r8) goto L_0x0072
            r5 = r4
            goto L_0x0073
        L_0x0072:
            r5 = r3
        L_0x0073:
            if (r5 == 0) goto L_0x00ab
        L_0x0075:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r2.mo72422w()
            boolean r5 = r5.mo72417p(r0, r2)
            if (r5 == 0) goto L_0x0075
            java.lang.Object r2 = r7._state
            if (r2 == r1) goto L_0x0092
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl.C19809a.f43800f
            boolean r1 = r1.compareAndSet(r0, r3, r4)
            if (r1 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            kotlinx.coroutines.sync.MutexImpl$LockCont r0 = new kotlinx.coroutines.sync.MutexImpl$LockCont
            r0.<init>(r8, r9)
            goto L_0x0016
        L_0x0092:
            kotlinx.coroutines.t1 r8 = new kotlinx.coroutines.t1
            r8.<init>(r0)
            r9.mo72497O(r8)
        L_0x009a:
            java.lang.Object r8 = r9.mo72547l()
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r9) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            kotlin.m r8 = kotlin.C19394m.f43287a
        L_0x00a5:
            if (r8 != r9) goto L_0x00a8
            return r8
        L_0x00a8:
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        L_0x00ab:
            java.lang.String r9 = "Already locked by "
            java.lang.String r8 = kotlin.jvm.internal.C19383o.m32802l(r8, r9)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x00bb:
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.C19730n
            if (r2 == 0) goto L_0x00c6
            kotlinx.coroutines.internal.n r1 = (kotlinx.coroutines.internal.C19730n) r1
            r1.mo72436c(r7)
            goto L_0x0016
        L_0x00c6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Illegal state "
            java.lang.String r9 = kotlin.jvm.internal.C19383o.m32802l(r1, r9)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.mo72641c(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final void mo72642d(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C19813b) {
                if (obj == null) {
                    if (!(((C19813b) obj2).f43806a != C14088a.f31041v)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C19813b bVar = (C19813b) obj2;
                    if (!(bVar.f43806a == obj)) {
                        StringBuilder h = C0072d.m201h("Mutex is locked by ");
                        h.append(bVar.f43806a);
                        h.append(" but expected ");
                        h.append(obj);
                        throw new IllegalStateException(h.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43797b;
                C19813b bVar2 = C14088a.f31043x;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
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
            } else if (obj2 instanceof C19730n) {
                ((C19730n) obj2).mo72436c(this);
            } else if (obj2 instanceof C19810b) {
                if (obj != null) {
                    C19810b bVar3 = (C19810b) obj2;
                    if (!(bVar3.f43802e == obj)) {
                        StringBuilder h2 = C0072d.m201h("Mutex is locked by ");
                        h2.append(bVar3.f43802e);
                        h2.append(" but expected ");
                        h2.append(obj);
                        throw new IllegalStateException(h2.toString().toString());
                    }
                }
                C19810b bVar4 = (C19810b) obj2;
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) bVar4.mo72420t();
                    if (lockFreeLinkedListNode == bVar4) {
                        lockFreeLinkedListNode = null;
                        break;
                    } else if (lockFreeLinkedListNode.mo72219A()) {
                        break;
                    } else {
                        ((C19731o) lockFreeLinkedListNode.mo72420t()).f43682a.mo72423x();
                    }
                }
                if (lockFreeLinkedListNode == null) {
                    C19811c cVar = new C19811c(bVar4);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43797b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, cVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z && cVar.mo72436c(this) == null) {
                        return;
                    }
                } else {
                    C19809a aVar = (C19809a) lockFreeLinkedListNode;
                    if (aVar.mo72645G()) {
                        Object obj3 = aVar.f43801e;
                        if (obj3 == null) {
                            obj3 = C14088a.f31040u;
                        }
                        bVar4.f43802e = obj3;
                        aVar.mo72644F();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(C19383o.m32802l(obj2, "Illegal state ").toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C19813b) {
                return C0073e.m209i(C0072d.m201h("Mutex["), ((C19813b) obj).f43806a, ']');
            }
            if (obj instanceof C19730n) {
                ((C19730n) obj).mo72436c(this);
            } else if (obj instanceof C19810b) {
                return C0073e.m209i(C0072d.m201h("Mutex["), ((C19810b) obj).f43802e, ']');
            } else {
                throw new IllegalStateException(C19383o.m32802l(obj, "Illegal state ").toString());
            }
        }
    }
}
