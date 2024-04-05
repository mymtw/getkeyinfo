package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;
    public transient int expectedValuesPerKey;

    public HashMultimap(int i, int i2) {
        super(CompactHashMap.createWithExpectedSize(i));
        this.expectedValuesPerKey = 2;
        C15794l.m25613g(i2 >= 0);
        this.expectedValuesPerKey = i2;
    }

    public static <K, V> HashMultimap<K, V> create() {
        return new HashMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int readInt = objectInputStream.readInt();
        setMap(CompactHashMap.createWithExpectedSize(12));
        C16213q1.m26246c(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C16213q1.m26249f(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(@NullableDecl Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Set get(@NullableDecl Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C16178h1 keys() {
        return super.keys();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.put(obj, obj2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(C16154c1 c1Var) {
        return super.putAll(c1Var);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set replaceValues(@NullableDecl Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> HashMultimap<K, V> create(int i, int i2) {
        return new HashMultimap<>(i, i2);
    }

    public Set<V> createCollection() {
        return CompactHashSet.createWithExpectedSize(this.expectedValuesPerKey);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> HashMultimap<K, V> create(C16154c1<? extends K, ? extends V> c1Var) {
        return new HashMultimap<>(c1Var);
    }

    private HashMultimap() {
        this(12, 2);
    }

    public HashMultimap(C16154c1<? extends K, ? extends V> c1Var) {
        super(CompactHashMap.createWithExpectedSize(c1Var.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(c1Var);
    }
}
