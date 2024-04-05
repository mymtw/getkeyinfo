package p239t;

import java.util.Iterator;
import kotlin.collections.C19314g;
import kotlin.jvm.internal.C19383o;
import p228s.C7790b;

/* renamed from: t.o */
public final class C7927o<K, V> extends C19314g<K> implements C7790b<K> {

    /* renamed from: b */
    public final C7915c<K, V> f17392b;

    public C7927o(C7915c<K, V> cVar) {
        C19383o.m32797g(cVar, "map");
        this.f17392b = cVar;
    }

    /* renamed from: a */
    public final int mo5763a() {
        C7915c<K, V> cVar = this.f17392b;
        cVar.getClass();
        return cVar.f17373c;
    }

    public final boolean contains(Object obj) {
        return this.f17392b.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return new C7928p(this.f17392b.f17372b);
    }
}
