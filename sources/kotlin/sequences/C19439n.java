package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p755lq.C19875a;

/* renamed from: kotlin.sequences.n */
public final class C19439n<T, R> implements C19431g<R> {

    /* renamed from: a */
    public final C19431g<T> f43362a;

    /* renamed from: b */
    public final C19857l<T, R> f43363b;

    /* renamed from: kotlin.sequences.n$a */
    public static final class C19440a implements Iterator<R>, C19875a {

        /* renamed from: b */
        public final Iterator<T> f43364b;

        /* renamed from: c */
        public final /* synthetic */ C19439n<T, R> f43365c;

        public C19440a(C19439n<T, R> nVar) {
            this.f43365c = nVar;
            this.f43364b = nVar.f43362a.iterator();
        }

        public final boolean hasNext() {
            return this.f43364b.hasNext();
        }

        public final R next() {
            return this.f43365c.f43363b.invoke(this.f43364b.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C19439n(C19431g<? extends T> gVar, C19857l<? super T, ? extends R> lVar) {
        C19383o.m32797g(lVar, "transformer");
        this.f43362a = gVar;
        this.f43363b = lVar;
    }

    public final Iterator<R> iterator() {
        return new C19440a(this);
    }
}
