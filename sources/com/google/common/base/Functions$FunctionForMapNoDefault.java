package com.google.common.base;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Functions$FunctionForMapNoDefault<K, V> implements C15784e<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    public final Map<K, V> map;

    public Functions$FunctionForMapNoDefault(Map<K, V> map2) {
        map2.getClass();
        this.map = map2;
    }

    public V apply(@NullableDecl K k) {
        V v = this.map.get(k);
        C15794l.m25612f(k, "Key '%s' not present in map", v != null || this.map.containsKey(k));
        return v;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Functions$FunctionForMapNoDefault) {
            return this.map.equals(((Functions$FunctionForMapNoDefault) obj).map);
        }
        return false;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Functions.forMap(");
        h.append(this.map);
        h.append(")");
        return h.toString();
    }
}
