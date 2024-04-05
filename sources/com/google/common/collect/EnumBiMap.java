package com.google.common.collect;

import com.google.common.base.C15794l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    public transient Class<K> f35854f;

    /* renamed from: g */
    public transient Class<V> f35855g;

    public EnumBiMap(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.f35854f = cls;
        this.f35855g = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }

    public static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).keyType();
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).keyType();
        }
        C15794l.m25613g(!map.isEmpty());
        return ((Enum) map.keySet().iterator().next()).getDeclaringClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f35854f = (Class) objectInputStream.readObject();
        this.f35855g = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.f35854f), new EnumMap(this.f35855g));
        C16213q1.m26245b(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f35854f);
        objectOutputStream.writeObject(this.f35855g);
        C16213q1.m26248e(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ C16196m inverse() {
        return super.inverse();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> keyType() {
        return this.f35854f;
    }

    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public Class<V> valueType() {
        return this.f35855g;
    }

    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        Class<V> cls;
        Class<K> inferKeyType = inferKeyType(map);
        if (map instanceof EnumBiMap) {
            cls = ((EnumBiMap) map).f35855g;
        } else {
            C15794l.m25613g(!map.isEmpty());
            cls = ((Enum) map.values().iterator().next()).getDeclaringClass();
        }
        EnumBiMap<K, V> create = create(inferKeyType, cls);
        create.putAll(map);
        return create;
    }

    public K checkKey(K k) {
        k.getClass();
        return k;
    }

    public V checkValue(V v) {
        v.getClass();
        return v;
    }
}
