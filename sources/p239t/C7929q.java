package p239t;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.C19383o;

/* renamed from: t.q */
public final class C7929q<K, V> extends AbstractCollection<V> {

    /* renamed from: b */
    public final C7915c<K, V> f17393b;

    public C7929q(C7915c<K, V> cVar) {
        C19383o.m32797g(cVar, "map");
        this.f17393b = cVar;
    }

    /* renamed from: a */
    public final int mo5763a() {
        C7915c<K, V> cVar = this.f17393b;
        cVar.getClass();
        return cVar.f17373c;
    }

    public final boolean contains(Object obj) {
        return this.f17393b.containsValue(obj);
    }

    public final Iterator<V> iterator() {
        return new C7930r(this.f17393b.f17372b);
    }
}
