package p239t;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: t.t */
public abstract class C7933t<K, V, T> implements Iterator<T>, C19875a {

    /* renamed from: b */
    public Object[] f17401b = C7931s.f17394e.f17398d;

    /* renamed from: c */
    public int f17402c;

    /* renamed from: d */
    public int f17403d;

    public C7933t() {
        C7931s sVar = C7931s.f17394e;
    }

    public final boolean hasNext() {
        return this.f17403d < this.f17402c;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
