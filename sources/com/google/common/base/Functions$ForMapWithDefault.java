package com.google.common.base;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Functions$ForMapWithDefault<K, V> implements C15784e<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    public final V defaultValue;
    public final Map<K, ? extends V> map;

    public Functions$ForMapWithDefault(Map<K, ? extends V> map2, @NullableDecl V v) {
        map2.getClass();
        this.map = map2;
        this.defaultValue = v;
    }

    public V apply(@NullableDecl K k) {
        V v = this.map.get(k);
        return (v != null || this.map.containsKey(k)) ? v : this.defaultValue;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Functions$ForMapWithDefault)) {
            return false;
        }
        Functions$ForMapWithDefault functions$ForMapWithDefault = (Functions$ForMapWithDefault) obj;
        return this.map.equals(functions$ForMapWithDefault.map) && C15791j.m25606a(this.defaultValue, functions$ForMapWithDefault.defaultValue);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.map, this.defaultValue});
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Functions.forMap(");
        h.append(this.map);
        h.append(", defaultValue=");
        return C0071c.m192d(h, this.defaultValue, ")");
    }
}
