package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.layout.C0761x;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19524d;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19766p0;
import kotlinx.coroutines.channels.C19503g;
import kotlinx.coroutines.internal.C19724i;
import kotlinx.coroutines.internal.C19731o;
import kotlinx.coroutines.internal.C19735s;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.C19803d;
import kotlinx.coroutines.selects.C19805f;
import kotlinx.coroutines.selects.C19806g;
import p383ke.C12995a;
import p568fn.C17782b;
import p753kq.C19857l;
import p753kq.C19861p;

public abstract class AbstractChannel<E> extends C19494a<E> implements C19499d<E> {

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$a */
    public static final class C19483a<E> implements C19502f<E> {

        /* renamed from: a */
        public final AbstractChannel<E> f43415a;

        /* renamed from: b */
        public Object f43416b = C17782b.f38646q;

        public C19483a(AbstractChannel<E> abstractChannel) {
            this.f43415a = abstractChannel;
        }

        /* renamed from: a */
        public final Object mo72148a(ContinuationImpl continuationImpl) {
            Object obj = this.f43416b;
            C19736t tVar = C17782b.f38646q;
            boolean z = false;
            if (obj != tVar) {
                if (obj instanceof C19509k) {
                    C19509k kVar = (C19509k) obj;
                    if (kVar.f43452e != null) {
                        Throwable L = kVar.mo72215L();
                        int i = C19735s.f43686a;
                        throw L;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            Object H = this.f43415a.mo72131H();
            this.f43416b = H;
            if (H != tVar) {
                if (H instanceof C19509k) {
                    C19509k kVar2 = (C19509k) H;
                    if (kVar2.f43452e != null) {
                        Throwable L2 = kVar2.mo72215L();
                        int i2 = C19735s.f43686a;
                        throw L2;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            C19753l e0 = C0761x.m1717e0(C19388s.m32873m0(continuationImpl));
            C19486d dVar = new C19486d(this, e0);
            while (true) {
                AbstractChannel<E> abstractChannel = this.f43415a;
                boolean s = abstractChannel.mo72141s(dVar);
                if (s) {
                    abstractChannel.mo72130G();
                }
                if (s) {
                    AbstractChannel<E> abstractChannel2 = this.f43415a;
                    abstractChannel2.getClass();
                    e0.mo72497O(new C19488f(dVar));
                    break;
                }
                Object H2 = this.f43415a.mo72131H();
                this.f43416b = H2;
                if (H2 instanceof C19509k) {
                    C19509k kVar3 = (C19509k) H2;
                    if (kVar3.f43452e == null) {
                        e0.resumeWith(Result.m35480constructorimpl(Boolean.FALSE));
                    } else {
                        e0.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(kVar3.mo72215L())));
                    }
                } else if (H2 != C17782b.f38646q) {
                    Boolean bool = Boolean.TRUE;
                    C19857l<E, C19394m> lVar = this.f43415a.f43435b;
                    e0.mo72503v(lVar == null ? null : OnUndeliveredElementKt.m33526a(lVar, H2, e0.f43710f), bool);
                }
            }
            Object l = e0.mo72547l();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return l;
        }

        public final E next() {
            E e = this.f43416b;
            if (!(e instanceof C19509k)) {
                E e2 = C17782b.f38646q;
                if (e != e2) {
                    this.f43416b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable L = ((C19509k) e).mo72215L();
            int i = C19735s.f43686a;
            throw L;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$b */
    public static class C19484b<E> extends C19514p<E> {

        /* renamed from: e */
        public final C19747k<Object> f43417e;

        /* renamed from: f */
        public final int f43418f;

        public C19484b(C19753l lVar, int i) {
            this.f43417e = lVar;
            this.f43418f = i;
        }

        /* renamed from: G */
        public final void mo72150G(C19509k<?> kVar) {
            if (this.f43418f == 1) {
                this.f43417e.resumeWith(Result.m35480constructorimpl(new C19503g(new C19503g.C19504a(kVar.f43452e))));
            } else {
                this.f43417e.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(kVar.mo72215L())));
            }
        }

        /* renamed from: a */
        public final C19736t mo72151a(Object obj) {
            if (this.f43417e.mo72496J(this.f43418f == 1 ? new C19503g(obj) : obj, (LockFreeLinkedListNode.C19712a) null, mo72154F(obj)) == null) {
                return null;
            }
            return C12995a.f28606b;
        }

        /* renamed from: g */
        public final void mo72152g(E e) {
            this.f43417e.mo72501m();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReceiveElement@");
            h.append(C19543e0.m33300R(this));
            h.append("[receiveMode=");
            return C0073e.m208h(h, this.f43418f, ']');
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$c */
    public static final class C19485c<E> extends C19484b<E> {

        /* renamed from: g */
        public final C19857l<E, C19394m> f43419g;

        public C19485c(C19753l lVar, int i, C19857l lVar2) {
            super(lVar, i);
            this.f43419g = lVar2;
        }

        /* renamed from: F */
        public final C19857l<Throwable, C19394m> mo72154F(E e) {
            return OnUndeliveredElementKt.m33526a(this.f43419g, e, this.f43417e.getContext());
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$d */
    public static class C19486d<E> extends C19514p<E> {

        /* renamed from: e */
        public final C19483a<E> f43420e;

        /* renamed from: f */
        public final C19747k<Boolean> f43421f;

        public C19486d(C19483a aVar, C19753l lVar) {
            this.f43420e = aVar;
            this.f43421f = lVar;
        }

        /* renamed from: F */
        public final C19857l<Throwable, C19394m> mo72154F(E e) {
            C19857l<E, C19394m> lVar = this.f43420e.f43415a.f43435b;
            if (lVar == null) {
                return null;
            }
            return OnUndeliveredElementKt.m33526a(lVar, e, this.f43421f.getContext());
        }

        /* renamed from: G */
        public final void mo72150G(C19509k<?> kVar) {
            if ((kVar.f43452e == null ? this.f43421f.mo72499i(Boolean.FALSE, (Object) null) : this.f43421f.mo72502s(kVar.mo72215L())) != null) {
                this.f43420e.f43416b = kVar;
                this.f43421f.mo72501m();
            }
        }

        /* renamed from: a */
        public final C19736t mo72151a(Object obj) {
            if (this.f43421f.mo72496J(Boolean.TRUE, (LockFreeLinkedListNode.C19712a) null, mo72154F(obj)) == null) {
                return null;
            }
            return C12995a.f28606b;
        }

        /* renamed from: g */
        public final void mo72152g(E e) {
            this.f43420e.f43416b = e;
            this.f43421f.mo72501m();
        }

        public final String toString() {
            return C19383o.m32802l(C19543e0.m33300R(this), "ReceiveHasNext@");
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$e */
    public static final class C19487e<R, E> extends C19514p<E> implements C19766p0 {

        /* renamed from: e */
        public final AbstractChannel<E> f43422e;

        /* renamed from: f */
        public final C19805f<R> f43423f;

        /* renamed from: g */
        public final C19861p<Object, C19340c<? super R>, Object> f43424g;

        /* renamed from: h */
        public final int f43425h;

        public C19487e(int i, C19861p pVar, AbstractChannel abstractChannel, C19805f fVar) {
            this.f43422e = abstractChannel;
            this.f43423f = fVar;
            this.f43424g = pVar;
            this.f43425h = i;
        }

        /* renamed from: F */
        public final C19857l<Throwable, C19394m> mo72154F(E e) {
            C19857l<E, C19394m> lVar = this.f43422e.f43435b;
            if (lVar == null) {
                return null;
            }
            return OnUndeliveredElementKt.m33526a(lVar, e, this.f43423f.mo72635l().getContext());
        }

        /* renamed from: G */
        public final void mo72150G(C19509k<?> kVar) {
            if (this.f43423f.mo72634k()) {
                int i = this.f43425h;
                if (i == 0) {
                    this.f43423f.mo72636n(kVar.mo72215L());
                } else if (i == 1) {
                    C19543e0.m33322m0(this.f43424g, new C19503g(new C19503g.C19504a(kVar.f43452e)), this.f43423f.mo72635l(), (C19857l) null);
                }
            }
        }

        /* renamed from: a */
        public final C19736t mo72151a(Object obj) {
            return (C19736t) this.f43423f.mo72633j();
        }

        public final void dispose() {
            if (mo72219A()) {
                this.f43422e.mo72129D();
            }
        }

        /* renamed from: g */
        public final void mo72152g(E e) {
            C19543e0.m33322m0(this.f43424g, this.f43425h == 1 ? new C19503g(e) : e, this.f43423f.mo72635l(), mo72154F(e));
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReceiveSelect@");
            h.append(C19543e0.m33300R(this));
            h.append('[');
            h.append(this.f43423f);
            h.append(",receiveMode=");
            return C0073e.m208h(h, this.f43425h, ']');
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$f */
    public final class C19488f extends C19524d {

        /* renamed from: b */
        public final C19514p<?> f43426b;

        public C19488f(C19514p<?> pVar) {
            this.f43426b = pVar;
        }

        /* renamed from: a */
        public final void mo72155a(Throwable th) {
            if (this.f43426b.mo72219A()) {
                AbstractChannel.this.mo72129D();
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72155a((Throwable) obj);
            return C19394m.f43287a;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RemoveReceiveOnCancel[");
            h.append(this.f43426b);
            h.append(']');
            return h.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$g */
    public static final class C19489g<E> extends LockFreeLinkedListNode.C19715d<C19518t> {
        public C19489g(C19724i iVar) {
            super(iVar);
        }

        /* renamed from: c */
        public final Object mo72157c(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof C19509k) {
                return lockFreeLinkedListNode;
            }
            if (!(lockFreeLinkedListNode instanceof C19518t)) {
                return C17782b.f38646q;
            }
            return null;
        }

        /* renamed from: h */
        public final Object mo72158h(LockFreeLinkedListNode.C19714c cVar) {
            C19736t I = ((C19518t) cVar.f43643a).mo72206I(cVar);
            if (I == null) {
                return C19421p.f43322l;
            }
            C19736t tVar = C19543e0.f43497j;
            if (I == tVar) {
                return tVar;
            }
            return null;
        }

        /* renamed from: i */
        public final void mo72159i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((C19518t) lockFreeLinkedListNode).mo72218K();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$h */
    public static final class C19490h extends LockFreeLinkedListNode.C19713b {

        /* renamed from: d */
        public final /* synthetic */ AbstractChannel f43428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19490h(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f43428d = abstractChannel;
        }

        /* renamed from: i */
        public final Object mo72160i(Object obj) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (this.f43428d.mo72143v()) {
                return null;
            }
            return C19388s.f43281l;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$i */
    public static final class C19491i implements C19803d<E> {

        /* renamed from: b */
        public final /* synthetic */ AbstractChannel<E> f43429b;

        public C19491i(AbstractChannel<E> abstractChannel) {
            this.f43429b = abstractChannel;
        }

        /* renamed from: A */
        public final <R> void mo72161A(C19805f<? super R> fVar, C19861p<? super E, ? super C19340c<? super R>, ? extends Object> pVar) {
            AbstractChannel.m33098r(0, pVar, this.f43429b, fVar);
        }
    }

    /* renamed from: kotlinx.coroutines.channels.AbstractChannel$j */
    public static final class C19492j implements C19803d<C19503g<? extends E>> {

        /* renamed from: b */
        public final /* synthetic */ AbstractChannel<E> f43430b;

        public C19492j(AbstractChannel<E> abstractChannel) {
            this.f43430b = abstractChannel;
        }

        /* renamed from: A */
        public final <R> void mo72161A(C19805f<? super R> fVar, C19861p<? super C19503g<? extends E>, ? super C19340c<? super R>, ? extends Object> pVar) {
            AbstractChannel.m33098r(1, pVar, this.f43430b, fVar);
        }
    }

    public AbstractChannel(C19857l<? super E, C19394m> lVar) {
        super(lVar);
    }

    /* renamed from: r */
    public static final void m33098r(int i, C19861p pVar, AbstractChannel abstractChannel, C19805f fVar) {
        abstractChannel.getClass();
        while (!fVar.mo72631e()) {
            if (abstractChannel.mo72147z()) {
                C19487e eVar = new C19487e(i, pVar, abstractChannel, fVar);
                boolean s = abstractChannel.mo72141s(eVar);
                if (s) {
                    abstractChannel.mo72130G();
                }
                if (s) {
                    fVar.mo72632h(eVar);
                }
                if (s) {
                    return;
                }
            } else {
                Object I = abstractChannel.mo72132I(fVar);
                if (I != C19806g.f43791b) {
                    if (!(I == C17782b.f38646q || I == C19543e0.f43497j)) {
                        boolean z = I instanceof C19509k;
                        if (z) {
                            if (i == 0) {
                                Throwable L = ((C19509k) I).mo72215L();
                                int i2 = C19735s.f43686a;
                                throw L;
                            } else if (i == 1 && fVar.mo72634k()) {
                                C19543e0.m33324n0(pVar, new C19503g(new C19503g.C19504a(((C19509k) I).f43452e)), fVar.mo72635l());
                            }
                        } else if (i == 1) {
                            if (z) {
                                I = new C19503g.C19504a(((C19509k) I).f43452e);
                            }
                            C19543e0.m33324n0(pVar, new C19503g(I), fVar.mo72635l());
                        } else {
                            C19543e0.m33324n0(pVar, I, fVar.mo72635l());
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    public void mo72127A(boolean z) {
        C19509k<?> f = mo72193f();
        if (f != null) {
            Object obj = null;
            while (true) {
                LockFreeLinkedListNode w = f.mo72422w();
                if (w instanceof C19724i) {
                    mo72128B(obj, f);
                    return;
                } else if (!w.mo72219A()) {
                    ((C19731o) w.mo72420t()).f43682a.mo72423x();
                } else {
                    obj = C0761x.m1656A0(obj, (C19518t) w);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: B */
    public void mo72128B(Object obj, C19509k<?> kVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((C19518t) obj).mo72205H(kVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((C19518t) arrayList.get(size)).mo72205H(kVar);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public void mo72129D() {
    }

    /* renamed from: G */
    public void mo72130G() {
    }

    /* renamed from: H */
    public Object mo72131H() {
        while (true) {
            C19518t n = mo72200n();
            if (n == null) {
                return C17782b.f38646q;
            }
            if (n.mo72206I((LockFreeLinkedListNode.C19714c) null) != null) {
                n.mo72203F();
                return n.mo72204G();
            }
            n.mo72218K();
        }
    }

    /* renamed from: I */
    public Object mo72132I(C19805f<?> fVar) {
        C19489g gVar = new C19489g(this.f43436c);
        Object o = fVar.mo72637o(gVar);
        if (o != null) {
            return o;
        }
        ((C19518t) gVar.mo72439m()).mo72203F();
        return ((C19518t) gVar.mo72439m()).mo72204G();
    }

    /* renamed from: J */
    public final Object mo72133J(int i, ContinuationImpl continuationImpl) {
        C19753l e0 = C0761x.m1717e0(C19388s.m32873m0(continuationImpl));
        C19484b bVar = this.f43435b == null ? new C19484b(e0, i) : new C19485c(e0, i, this.f43435b);
        while (true) {
            boolean s = mo72141s(bVar);
            if (s) {
                mo72130G();
            }
            if (s) {
                e0.mo72497O(new C19488f(bVar));
                break;
            }
            Object H = mo72131H();
            if (H instanceof C19509k) {
                bVar.mo72150G((C19509k) H);
                break;
            } else if (H != C17782b.f38646q) {
                e0.mo72503v(bVar.mo72154F(H), bVar.f43418f == 1 ? new C19503g(H) : H);
            }
        }
        Object l = e0.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }

    /* renamed from: a */
    public final void mo72134a(CancellationException cancellationException) {
        if (!mo72145x()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(C19383o.m32802l(" was cancelled", getClass().getSimpleName()));
            }
            mo72127A(mo72187C(cancellationException));
        }
    }

    public boolean isEmpty() {
        return mo72147z();
    }

    public final C19502f<E> iterator() {
        return new C19483a(this);
    }

    /* renamed from: m */
    public final C19516r<E> mo72137m() {
        C19516r<E> m = super.mo72137m();
        if (m != null && !(m instanceof C19509k)) {
            mo72129D();
        }
        return m;
    }

    /* renamed from: o */
    public final Object mo72138o(ContinuationImpl continuationImpl) {
        Object H = mo72131H();
        return (H == C17782b.f38646q || (H instanceof C19509k)) ? mo72133J(0, continuationImpl) : H;
    }

    /* renamed from: p */
    public final C19803d<E> mo72139p() {
        return new C19491i(this);
    }

    /* renamed from: q */
    public final C19803d<C19503g<E>> mo72140q() {
        return new C19492j(this);
    }

    /* renamed from: s */
    public boolean mo72141s(C19514p<? super E> pVar) {
        int E;
        LockFreeLinkedListNode w;
        if (!mo72142u()) {
            C19724i iVar = this.f43436c;
            C19490h hVar = new C19490h(pVar, this);
            do {
                LockFreeLinkedListNode w2 = iVar.mo72422w();
                if (!(!(w2 instanceof C19518t))) {
                    break;
                }
                E = w2.mo72416E(pVar, iVar, hVar);
                if (E == 1) {
                    return true;
                }
            } while (E != 2);
        } else {
            C19724i iVar2 = this.f43436c;
            do {
                w = iVar2.mo72422w();
                if (!(!(w instanceof C19518t))) {
                }
            } while (!w.mo72417p(pVar, iVar2));
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public abstract boolean mo72142u();

    /* renamed from: v */
    public abstract boolean mo72143v();

    /* renamed from: w */
    public final Object mo72144w() {
        Object H = mo72131H();
        return H == C17782b.f38646q ? C19503g.f43449b : H instanceof C19509k ? new C19503g.C19504a(((C19509k) H).f43452e) : H;
    }

    /* renamed from: x */
    public boolean mo72145x() {
        LockFreeLinkedListNode u = this.f43436c.mo72421u();
        C19509k kVar = null;
        C19509k kVar2 = u instanceof C19509k ? (C19509k) u : null;
        if (kVar2 != null) {
            mo72194g(kVar2);
            kVar = kVar2;
        }
        return kVar != null && mo72143v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72146y(kotlin.coroutines.C19340c<? super kotlinx.coroutines.channels.C19503g<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x0052
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            java.lang.Object r5 = r4.mo72131H()
            kotlinx.coroutines.internal.t r2 = p568fn.C17782b.f38646q
            if (r5 == r2) goto L_0x0049
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.C19509k
            if (r0 == 0) goto L_0x0048
            kotlinx.coroutines.channels.k r5 = (kotlinx.coroutines.channels.C19509k) r5
            java.lang.Throwable r5 = r5.f43452e
            kotlinx.coroutines.channels.g$a r0 = new kotlinx.coroutines.channels.g$a
            r0.<init>(r5)
            r5 = r0
        L_0x0048:
            return r5
        L_0x0049:
            r0.label = r3
            java.lang.Object r5 = r4.mo72133J(r3, r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlinx.coroutines.channels.g r5 = (kotlinx.coroutines.channels.C19503g) r5
            java.lang.Object r5 = r5.f43450a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.mo72146y(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: z */
    public final boolean mo72147z() {
        return !(this.f43436c.mo72421u() instanceof C19518t) && mo72143v();
    }
}
