package p193o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p193o.C7500h;

/* renamed from: o.b */
public class C7494b<K, V> extends C7506i<K, V> implements Map<K, V> {

    /* renamed from: i */
    public C7493a f16705i;

    public C7494b() {
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16705i == null) {
            this.f16705i = new C7493a(this);
        }
        C7493a aVar = this.f16705i;
        if (aVar.f16724a == null) {
            aVar.f16724a = new C7500h.C7502b();
        }
        return aVar.f16724a;
    }

    public final Set<K> keySet() {
        if (this.f16705i == null) {
            this.f16705i = new C7493a(this);
        }
        C7493a aVar = this.f16705i;
        if (aVar.f16725b == null) {
            aVar.f16725b = new C7500h.C7503c();
        }
        return aVar.f16725b;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo19968b(map.size() + this.f16745d);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Collection<V> values() {
        if (this.f16705i == null) {
            this.f16705i = new C7493a(this);
        }
        C7493a aVar = this.f16705i;
        if (aVar.f16726c == null) {
            aVar.f16726c = new C7500h.C7505e();
        }
        return aVar.f16726c;
    }

    public C7494b(int i) {
        super(i);
    }

    public C7494b(C7494b bVar) {
        if (bVar != null) {
            mo14352i(bVar);
        }
    }
}
