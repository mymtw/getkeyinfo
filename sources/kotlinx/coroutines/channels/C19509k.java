package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p383ke.C12995a;

/* renamed from: kotlinx.coroutines.channels.k */
public final class C19509k<E> extends C19518t implements C19516r<E> {

    /* renamed from: e */
    public final Throwable f43452e;

    public C19509k(Throwable th) {
        this.f43452e = th;
    }

    /* renamed from: F */
    public final void mo72203F() {
    }

    /* renamed from: G */
    public final Object mo72204G() {
        return this;
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

    /* renamed from: L */
    public final Throwable mo72215L() {
        Throwable th = this.f43452e;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    /* renamed from: a */
    public final C19736t mo72151a(Object obj) {
        return C12995a.f28606b;
    }

    /* renamed from: b */
    public final Object mo72216b() {
        return this;
    }

    /* renamed from: g */
    public final void mo72152g(E e) {
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Closed@");
        h.append(C19543e0.m33300R(this));
        h.append('[');
        return C0070b.m185h(h, this.f43452e, ']');
    }
}
