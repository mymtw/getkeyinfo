package p239t;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C19313f;
import kotlin.jvm.internal.C19383o;

/* renamed from: t.g */
public final class C7919g<K, V> extends C19313f<Map.Entry<Object, Object>> {

    /* renamed from: b */
    public final C7917e<K, V> f17387b;

    public C7919g(C7917e<K, V> eVar) {
        C19383o.m32797g(eVar, "builder");
        this.f17387b = eVar;
    }

    /* renamed from: a */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        V v = this.f17387b.get(entry.getKey());
        return v != null ? C19383o.m32792b(v, entry.getValue()) : entry.getValue() == null && this.f17387b.containsKey(entry.getKey());
    }

    public final boolean add(Object obj) {
        C19383o.m32797g((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        return this.f17387b.remove(entry.getKey(), entry.getValue());
    }

    public final void clear() {
        this.f17387b.clear();
    }

    public final int getSize() {
        return this.f17387b.mo20413c();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C7920h(this.f17387b);
    }
}
