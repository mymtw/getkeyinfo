package com.google.common.collect;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.z */
public abstract class C16243z<K, V> extends C16153c0 implements Map.Entry<K, V> {
    /* renamed from: e */
    public abstract Map.Entry<K, V> mo56041e();

    public boolean equals(@NullableDecl Object obj) {
        return mo56041e().equals(obj);
    }

    public final K getKey() {
        return mo56041e().getKey();
    }

    public V getValue() {
        return mo56041e().getValue();
    }

    public final int hashCode() {
        return mo56041e().hashCode();
    }

    public V setValue(V v) {
        return mo56041e().setValue(v);
    }
}
