package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w */
public final class C16537w extends C16541x {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$a */
    public static class C16538a<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, C16537w> f36710b;

        public C16538a() {
            throw null;
        }

        public C16538a(Map.Entry entry) {
            this.f36710b = entry;
        }

        public final K getKey() {
            return this.f36710b.getKey();
        }

        public final Object getValue() {
            C16537w value = this.f36710b.getValue();
            if (value == null) {
                return null;
            }
            return value.mo58981a((C16503j0) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C16503j0) {
                C16537w value = this.f36710b.getValue();
                C16503j0 j0Var = value.f36712a;
                value.f36713b = null;
                value.f36712a = (C16503j0) obj;
                return j0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$b */
    public static class C16539b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f36711b;

        public C16539b(Iterator<Map.Entry<K, Object>> it) {
            this.f36711b = it;
        }

        public final boolean hasNext() {
            return this.f36711b.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f36711b.next();
            return next.getValue() instanceof C16537w ? new C16538a(next) : next;
        }

        public final void remove() {
            this.f36711b.remove();
        }
    }

    public final boolean equals(Object obj) {
        return mo58981a((C16503j0) null).equals(obj);
    }

    public final int hashCode() {
        return mo58981a((C16503j0) null).hashCode();
    }

    public final String toString() {
        return mo58981a((C16503j0) null).toString();
    }
}
