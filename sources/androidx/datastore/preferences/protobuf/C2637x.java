package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.x */
public final class C2637x extends C2641y {

    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public static class C2638a<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C2637x> f5979b;

        public C2638a() {
            throw null;
        }

        public C2638a(Map.Entry entry) {
            this.f5979b = entry;
        }

        public final K getKey() {
            return this.f5979b.getKey();
        }

        public final Object getValue() {
            C2637x value = this.f5979b.getValue();
            if (value == null) {
                return null;
            }
            return value.mo9921a((C2602k0) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C2602k0) {
                C2637x value = this.f5979b.getValue();
                C2602k0 k0Var = value.f5981a;
                value.f5982b = null;
                value.f5981a = (C2602k0) obj;
                return k0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    public static class C2639b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f5980b;

        public C2639b(Iterator<Map.Entry<K, Object>> it) {
            this.f5980b = it;
        }

        public final boolean hasNext() {
            return this.f5980b.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f5980b.next();
            return next.getValue() instanceof C2637x ? new C2638a(next) : next;
        }

        public final void remove() {
            this.f5980b.remove();
        }
    }

    public final boolean equals(Object obj) {
        return mo9921a((C2602k0) null).equals(obj);
    }

    public final int hashCode() {
        return mo9921a((C2602k0) null).hashCode();
    }

    public final String toString() {
        return mo9921a((C2602k0) null).toString();
    }
}
