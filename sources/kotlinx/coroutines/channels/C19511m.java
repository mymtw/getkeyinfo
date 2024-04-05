package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.C19494a;
import kotlinx.coroutines.internal.C19724i;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.m */
public class C19511m<E> extends AbstractChannel<E> {
    public C19511m(C19857l<? super E, C19394m> lVar) {
        super(lVar);
    }

    /* renamed from: B */
    public final void mo72128B(Object obj, C19509k<?> kVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                C19518t tVar = (C19518t) obj;
                if (tVar instanceof C19494a.C19495a) {
                    C19857l<E, C19394m> lVar = this.f43435b;
                    if (lVar != null) {
                        undeliveredElementException = OnUndeliveredElementKt.m33527b(lVar, ((C19494a.C19495a) tVar).f43437e, (UndeliveredElementException) null);
                    }
                } else {
                    tVar.mo72205H(kVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i = size - 1;
                        C19518t tVar2 = (C19518t) arrayList.get(size);
                        if (tVar2 instanceof C19494a.C19495a) {
                            C19857l<E, C19394m> lVar2 = this.f43435b;
                            undeliveredElementException2 = lVar2 == null ? null : OnUndeliveredElementKt.m33527b(lVar2, ((C19494a.C19495a) tVar2).f43437e, undeliveredElementException2);
                        } else {
                            tVar2.mo72205H(kVar);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* renamed from: h */
    public final boolean mo72195h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo72196i() {
        return false;
    }

    /* renamed from: j */
    public final Object mo72197j(E e) {
        C19516r rVar;
        do {
            Object j = super.mo72197j(e);
            C19736t tVar = C17782b.f38644o;
            if (j == tVar) {
                return tVar;
            }
            if (j == C17782b.f38645p) {
                C19724i iVar = this.f43436c;
                C19494a.C19495a aVar = new C19494a.C19495a(e);
                while (true) {
                    LockFreeLinkedListNode w = iVar.mo72422w();
                    if (!(w instanceof C19516r)) {
                        if (w.mo72417p(aVar, iVar)) {
                            rVar = null;
                            break;
                        }
                    } else {
                        rVar = (C19516r) w;
                        break;
                    }
                }
                if (rVar == null) {
                    return C17782b.f38644o;
                }
            } else if (j instanceof C19509k) {
                return j;
            } else {
                throw new IllegalStateException(C19383o.m32802l(j, "Invalid offerInternal result ").toString());
            }
        } while (!(rVar instanceof C19509k));
        return rVar;
    }

    /* renamed from: u */
    public final boolean mo72142u() {
        return true;
    }

    /* renamed from: v */
    public final boolean mo72143v() {
        return true;
    }
}
