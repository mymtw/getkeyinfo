package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0761x;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.C19389t;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19822t1;
import kotlinx.coroutines.channels.C19503g;
import kotlinx.coroutines.channels.C19519u;
import kotlinx.coroutines.internal.C19724i;
import kotlinx.coroutines.internal.C19731o;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p383ke.C12995a;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.a */
public abstract class C19494a<E> implements C19519u<E> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43434d = AtomicReferenceFieldUpdater.newUpdater(C19494a.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    public final C19857l<E, C19394m> f43435b;

    /* renamed from: c */
    public final C19724i f43436c = new C19724i();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.channels.a$a */
    public static final class C19495a<E> extends C19518t {

        /* renamed from: e */
        public final E f43437e;

        public C19495a(E e) {
            this.f43437e = e;
        }

        /* renamed from: F */
        public final void mo72203F() {
        }

        /* renamed from: G */
        public final Object mo72204G() {
            return this.f43437e;
        }

        /* renamed from: H */
        public final void mo72205H(C19509k<?> kVar) {
        }

        /* renamed from: I */
        public final C19736t mo72206I(LockFreeLinkedListNode.C19714c cVar) {
            C19736t tVar = C12995a.f28606b;
            if (cVar != null) {
                cVar.mo72437d();
            }
            return tVar;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SendBuffered@");
            h.append(C19543e0.m33300R(this));
            h.append('(');
            return C0073e.m209i(h, this.f43437e, ')');
        }
    }

    public C19494a(C19857l<? super E, C19394m> lVar) {
        this.f43435b = lVar;
    }

    /* renamed from: b */
    public static final void m33140b(C19494a aVar, C19753l lVar, Object obj, C19509k kVar) {
        UndeliveredElementException b;
        aVar.mo72194g(kVar);
        Throwable th = kVar.f43452e;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        C19857l<E, C19394m> lVar2 = aVar.f43435b;
        if (lVar2 == null || (b = OnUndeliveredElementKt.m33527b(lVar2, obj, (UndeliveredElementException) null)) == null) {
            lVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
            return;
        }
        C17782b.m29886t(b, th);
        lVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(b)));
    }

    /* renamed from: C */
    public final boolean mo72187C(Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        C19736t tVar;
        C19509k kVar = new C19509k(th);
        C19724i iVar = this.f43436c;
        while (true) {
            LockFreeLinkedListNode w = iVar.mo72422w();
            z = false;
            if (!(w instanceof C19509k)) {
                if (w.mo72417p(kVar, iVar)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            kVar = (C19509k) this.f43436c.mo72422w();
        }
        mo72194g(kVar);
        if (!(!z2 || (obj = this.onCloseHandler) == null || obj == (tVar = C17782b.f38648s))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43434d;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                C19389t.m32910d(1, obj);
                ((C19857l) obj).invoke(th);
            }
        }
        return z2;
    }

    /* renamed from: E */
    public final Object mo72188E(E e, C19340c<? super C19394m> cVar) {
        if (mo72197j(e) == C17782b.f38644o) {
            return C19394m.f43287a;
        }
        C19753l e0 = C0761x.m1717e0(C19388s.m32873m0(cVar));
        while (true) {
            if (!(this.f43436c.mo72421u() instanceof C19516r) && mo72196i()) {
                C19521v vVar = this.f43435b == null ? new C19521v(e, e0) : new C19522w(e, e0, this.f43435b);
                Object d = mo72191d(vVar);
                if (d == null) {
                    e0.mo72497O(new C19822t1(vVar));
                    break;
                } else if (d instanceof C19509k) {
                    m33140b(this, e0, e, (C19509k) d);
                    break;
                } else if (d != C17782b.f38647r && !(d instanceof C19514p)) {
                    throw new IllegalStateException(C19383o.m32802l(d, "enqueueSend returned ").toString());
                }
            }
            Object j = mo72197j(e);
            if (j == C17782b.f38644o) {
                e0.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
                break;
            } else if (j != C17782b.f38645p) {
                if (j instanceof C19509k) {
                    m33140b(this, e0, e, (C19509k) j);
                } else {
                    throw new IllegalStateException(C19383o.m32802l(j, "offerInternal returned ").toString());
                }
            }
        }
        Object l = e0.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (l != coroutineSingletons) {
            l = C19394m.f43287a;
        }
        return l == coroutineSingletons ? l : C19394m.f43287a;
    }

    /* renamed from: F */
    public final boolean mo72189F() {
        return mo72193f() != null;
    }

    /* renamed from: c */
    public final void mo72190c(C19857l<? super Throwable, C19394m> lVar) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43434d;
        while (true) {
            z = false;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Object obj = this.onCloseHandler;
            if (obj == C17782b.f38648s) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(C19383o.m32802l(obj, "Another handler was already registered: "));
        }
        C19509k<?> f = mo72193f();
        if (f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43434d;
            C19736t tVar = C17782b.f38648s;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, tVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                lVar.invoke(f.f43452e);
            }
        }
    }

    /* renamed from: d */
    public Object mo72191d(C19521v vVar) {
        boolean z;
        LockFreeLinkedListNode w;
        if (mo72195h()) {
            C19724i iVar = this.f43436c;
            do {
                w = iVar.mo72422w();
                if (w instanceof C19516r) {
                    return w;
                }
            } while (!w.mo72417p(vVar, iVar));
            return null;
        }
        C19724i iVar2 = this.f43436c;
        C19496b bVar = new C19496b(vVar, this);
        while (true) {
            LockFreeLinkedListNode w2 = iVar2.mo72422w();
            if (!(w2 instanceof C19516r)) {
                int E = w2.mo72416E(vVar, iVar2, bVar);
                z = true;
                if (E != 1) {
                    if (E == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return w2;
            }
        }
        if (!z) {
            return C17782b.f38647r;
        }
        return null;
    }

    /* renamed from: e */
    public String mo72192e() {
        return "";
    }

    /* renamed from: f */
    public final C19509k<?> mo72193f() {
        LockFreeLinkedListNode w = this.f43436c.mo72422w();
        C19509k<?> kVar = w instanceof C19509k ? (C19509k) w : null;
        if (kVar == null) {
            return null;
        }
        mo72194g(kVar);
        return kVar;
    }

    /* renamed from: g */
    public final void mo72194g(C19509k<?> kVar) {
        Object obj = null;
        while (true) {
            LockFreeLinkedListNode w = kVar.mo72422w();
            C19514p pVar = w instanceof C19514p ? (C19514p) w : null;
            if (pVar == null) {
                break;
            } else if (!pVar.mo72219A()) {
                ((C19731o) pVar.mo72420t()).f43682a.mo72423x();
            } else {
                obj = C0761x.m1656A0(obj, pVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((C19514p) obj).mo72150G(kVar);
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((C19514p) arrayList.get(size)).mo72150G(kVar);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            }
        }
        mo72198k();
    }

    /* renamed from: h */
    public abstract boolean mo72195h();

    /* renamed from: i */
    public abstract boolean mo72196i();

    /* renamed from: j */
    public Object mo72197j(E e) {
        C19516r m;
        do {
            m = mo72137m();
            if (m == null) {
                return C17782b.f38645p;
            }
        } while (m.mo72151a(e) == null);
        m.mo72152g(e);
        return m.mo72216b();
    }

    /* renamed from: k */
    public void mo72198k() {
    }

    /* renamed from: l */
    public final Object mo72199l(E e) {
        C19503g.C19504a aVar;
        Object j = mo72197j(e);
        if (j == C17782b.f38644o) {
            return C19394m.f43287a;
        }
        if (j == C17782b.f38645p) {
            C19509k<?> f = mo72193f();
            if (f == null) {
                return C19503g.f43449b;
            }
            mo72194g(f);
            Throwable th = f.f43452e;
            if (th == null) {
                th = new ClosedSendChannelException("Channel was closed");
            }
            aVar = new C19503g.C19504a(th);
        } else if (j instanceof C19509k) {
            C19509k kVar = (C19509k) j;
            mo72194g(kVar);
            Throwable th2 = kVar.f43452e;
            if (th2 == null) {
                th2 = new ClosedSendChannelException("Channel was closed");
            }
            aVar = new C19503g.C19504a(th2);
        } else {
            throw new IllegalStateException(C19383o.m32802l(j, "trySend returned ").toString());
        }
        return aVar;
    }

    /* renamed from: m */
    public C19516r<E> mo72137m() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode B;
        C19724i iVar = this.f43436c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) iVar.mo72420t();
            if (lockFreeLinkedListNode != iVar && (lockFreeLinkedListNode instanceof C19516r)) {
                if (((((C19516r) lockFreeLinkedListNode) instanceof C19509k) && !lockFreeLinkedListNode.mo72424y()) || (B = lockFreeLinkedListNode.mo72414B()) == null) {
                    break;
                }
                B.mo72423x();
            }
        }
        lockFreeLinkedListNode = null;
        return (C19516r) lockFreeLinkedListNode;
    }

    /* renamed from: n */
    public final C19518t mo72200n() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode B;
        C19724i iVar = this.f43436c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) iVar.mo72420t();
            if (lockFreeLinkedListNode != iVar && (lockFreeLinkedListNode instanceof C19518t)) {
                if (((((C19518t) lockFreeLinkedListNode) instanceof C19509k) && !lockFreeLinkedListNode.mo72424y()) || (B = lockFreeLinkedListNode.mo72414B()) == null) {
                    break;
                }
                B.mo72423x();
            }
        }
        lockFreeLinkedListNode = null;
        return (C19518t) lockFreeLinkedListNode;
    }

    public final boolean offer(E e) {
        UndeliveredElementException b;
        try {
            return C19519u.C19520a.m33265a(this, e);
        } catch (Throwable th) {
            C19857l<E, C19394m> lVar = this.f43435b;
            if (lVar == null || (b = OnUndeliveredElementKt.m33527b(lVar, e, (UndeliveredElementException) null)) == null) {
                throw th;
            }
            C17782b.m29886t(b, th);
            throw b;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C19543e0.m33300R(this));
        sb.append('{');
        LockFreeLinkedListNode u = this.f43436c.mo72421u();
        if (u == this.f43436c) {
            str = "EmptyQueue";
        } else {
            String lockFreeLinkedListNode = u instanceof C19509k ? u.toString() : u instanceof C19514p ? "ReceiveQueued" : u instanceof C19518t ? "SendQueued" : C19383o.m32802l(u, "UNEXPECTED:");
            LockFreeLinkedListNode w = this.f43436c.mo72422w();
            if (w != u) {
                StringBuilder k = C0073e.m211k(lockFreeLinkedListNode, ",queueSize=");
                C19724i iVar = this.f43436c;
                int i = 0;
                for (LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) iVar.mo72420t(); !C19383o.m32792b(lockFreeLinkedListNode2, iVar); lockFreeLinkedListNode2 = lockFreeLinkedListNode2.mo72421u()) {
                    if (lockFreeLinkedListNode2 instanceof LockFreeLinkedListNode) {
                        i++;
                    }
                }
                k.append(i);
                str = k.toString();
                if (w instanceof C19509k) {
                    str = str + ",closedForSend=" + w;
                }
            } else {
                str = lockFreeLinkedListNode;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(mo72192e());
        return sb.toString();
    }
}
