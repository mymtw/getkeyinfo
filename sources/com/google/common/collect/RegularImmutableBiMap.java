package com.google.common.collect;

import com.google.common.collect.RegularImmutableMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap<Object, Object> EMPTY = new RegularImmutableBiMap<>();
    public final transient Object[] alternatingKeysAndValues;

    /* renamed from: f */
    public final transient int[] f36117f;

    /* renamed from: g */
    public final transient int f36118g;

    /* renamed from: h */
    public final transient int f36119h;

    /* renamed from: i */
    public final transient RegularImmutableBiMap<V, K> f36120i;

    private RegularImmutableBiMap() {
        this.f36117f = null;
        this.alternatingKeysAndValues = new Object[0];
        this.f36118g = 0;
        this.f36119h = 0;
        this.f36120i = this;
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new RegularImmutableMap.EntrySet(this, this.alternatingKeysAndValues, this.f36118g, this.f36119h);
    }

    public ImmutableSet<K> createKeySet() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.alternatingKeysAndValues, this.f36118g, this.f36119h));
    }

    public V get(@NullableDecl Object obj) {
        return RegularImmutableMap.get(this.f36117f, this.alternatingKeysAndValues, this.f36119h, this.f36118g, obj);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f36119h;
    }

    public ImmutableBiMap<V, K> inverse() {
        return this.f36120i;
    }

    public RegularImmutableBiMap(Object[] objArr, int i) {
        this.alternatingKeysAndValues = objArr;
        this.f36119h = i;
        this.f36118g = 0;
        int chooseTableSize = i >= 2 ? ImmutableSet.chooseTableSize(i) : 0;
        this.f36117f = RegularImmutableMap.createHashTable(objArr, i, chooseTableSize, 0);
        this.f36120i = new RegularImmutableBiMap<>(RegularImmutableMap.createHashTable(objArr, i, chooseTableSize, 1), objArr, i, this);
    }

    public RegularImmutableBiMap(int[] iArr, Object[] objArr, int i, RegularImmutableBiMap<V, K> regularImmutableBiMap) {
        this.f36117f = iArr;
        this.alternatingKeysAndValues = objArr;
        this.f36118g = 1;
        this.f36119h = i;
        this.f36120i = regularImmutableBiMap;
    }
}
