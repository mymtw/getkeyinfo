package p239t;

import java.util.Iterator;
import kotlin.collections.C19307c;
import kotlin.jvm.internal.C19383o;

/* renamed from: t.k */
public final class C7923k<K, V> extends C19307c<V> {

    /* renamed from: b */
    public final C7917e<K, V> f17390b;

    public C7923k(C7917e<K, V> eVar) {
        C19383o.m32797g(eVar, "builder");
        this.f17390b = eVar;
    }

    /* renamed from: a */
    public final int mo20440a() {
        return this.f17390b.mo20413c();
    }

    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f17390b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f17390b.containsValue(obj);
    }

    public final Iterator<V> iterator() {
        return new C7924l(this.f17390b);
    }
}
