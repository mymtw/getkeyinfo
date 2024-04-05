package p259v;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p239t.C7915c;
import p504ai.C13983i;
import p755lq.C19875a;

/* renamed from: v.c */
public final class C8183c<E> implements Iterator<E>, C19875a {

    /* renamed from: b */
    public Object f17963b;

    /* renamed from: c */
    public final Map<E, C8181a> f17964c;

    /* renamed from: d */
    public int f17965d;

    public C8183c(Object obj, C7915c cVar) {
        C19383o.m32797g(cVar, "map");
        this.f17963b = obj;
        this.f17964c = cVar;
    }

    public final boolean hasNext() {
        return this.f17965d < this.f17964c.size();
    }

    public final E next() {
        if (hasNext()) {
            E e = this.f17963b;
            this.f17965d++;
            C8181a aVar = this.f17964c.get(e);
            if (aVar != null) {
                this.f17963b = aVar.f17958b;
                return e;
            }
            throw new ConcurrentModificationException(C13983i.m21494m("Hash code of an element (", e, ") has changed after it was added to the persistent set."));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
