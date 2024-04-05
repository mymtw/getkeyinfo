package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.w */
public final class C16944w extends C16948x {

    /* renamed from: com.google.protobuf.w$a */
    public static class C16945a<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C16944w> f37309b;

        public C16945a() {
            throw null;
        }

        public C16945a(Map.Entry entry) {
            this.f37309b = entry;
        }

        public final K getKey() {
            return this.f37309b.getKey();
        }

        public final Object getValue() {
            C16944w value = this.f37309b.getValue();
            if (value == null) {
                return null;
            }
            return value.mo60068a((C16906j0) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C16906j0) {
                C16944w value = this.f37309b.getValue();
                C16906j0 j0Var = value.f37311a;
                value.f37312b = null;
                value.f37311a = (C16906j0) obj;
                return j0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.protobuf.w$b */
    public static class C16946b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f37310b;

        public C16946b(Iterator<Map.Entry<K, Object>> it) {
            this.f37310b = it;
        }

        public final boolean hasNext() {
            return this.f37310b.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f37310b.next();
            return next.getValue() instanceof C16944w ? new C16945a(next) : next;
        }

        public final void remove() {
            this.f37310b.remove();
        }
    }

    public final boolean equals(Object obj) {
        return mo60068a((C16906j0) null).equals(obj);
    }

    public final int hashCode() {
        return mo60068a((C16906j0) null).hashCode();
    }

    public final String toString() {
        return mo60068a((C16906j0) null).toString();
    }
}
