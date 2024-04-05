package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.channels.C19503g;
import kotlinx.coroutines.internal.C19735s;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.u */
public interface C19519u<E> {

    /* renamed from: kotlinx.coroutines.channels.u$a */
    public static final class C19520a {
        /* renamed from: a */
        public static <E> boolean m33265a(C19519u<? super E> uVar, E e) {
            Object l = uVar.mo72199l(e);
            if (!(l instanceof C19503g.C19505b)) {
                return true;
            }
            Throwable a = C19503g.m33187a(l);
            if (a == null) {
                return false;
            }
            int i = C19735s.f43686a;
            throw a;
        }
    }

    /* renamed from: C */
    boolean mo72187C(Throwable th);

    /* renamed from: E */
    Object mo72188E(E e, C19340c<? super C19394m> cVar);

    /* renamed from: F */
    boolean mo72189F();

    /* renamed from: c */
    void mo72190c(C19857l<? super Throwable, C19394m> lVar);

    /* renamed from: l */
    Object mo72199l(E e);

    boolean offer(E e);
}
