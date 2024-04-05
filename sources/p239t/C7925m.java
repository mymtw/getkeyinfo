package p239t;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C19314g;
import kotlin.jvm.internal.C19383o;
import p228s.C7790b;

/* renamed from: t.m */
public final class C7925m<K, V> extends C19314g<Map.Entry<? extends K, ? extends V>> implements C7790b<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: b */
    public final C7915c<K, V> f17391b;

    public C7925m(C7915c<K, V> cVar) {
        C19383o.m32797g(cVar, "map");
        this.f17391b = cVar;
    }

    /* renamed from: a */
    public final int mo5763a() {
        C7915c<K, V> cVar = this.f17391b;
        cVar.getClass();
        return cVar.f17373c;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        V v = this.f17391b.get(entry.getKey());
        return v != null ? C19383o.m32792b(v, entry.getValue()) : entry.getValue() == null && this.f17391b.containsKey(entry.getKey());
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C7926n(this.f17391b.f17372b);
    }
}
