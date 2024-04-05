package p239t;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: t.a */
public class C7913a<K, V> implements Map.Entry<K, V>, C19875a {

    /* renamed from: b */
    public final K f17367b;

    /* renamed from: c */
    public final V f17368c;

    public C7913a(K k, V v) {
        this.f17367b = k;
        this.f17368c = v;
    }

    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && C19383o.m32792b(entry.getKey(), this.f17367b) && C19383o.m32792b(entry.getValue(), getValue());
    }

    public final K getKey() {
        return this.f17367b;
    }

    public V getValue() {
        return this.f17368c;
    }

    public final int hashCode() {
        K k = this.f17367b;
        int i = 0;
        int hashCode = k != null ? k.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17367b);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
