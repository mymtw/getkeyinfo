package com.google.common.collect;

import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class AbstractBiMap<K, V> extends C16240y<K, V> implements C16196m<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Map<K, V> f35731b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient C15882d f35732c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient C15883e f35733d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    public transient C15881c f35734e;
    @RetainedWith
    @MonotonicNonNullDecl
    public transient AbstractBiMap<V, K> inverse;

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        public Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap, (C15879a) null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            setInverse((AbstractBiMap) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        public K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        public V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        public /* bridge */ /* synthetic */ Object delegate() {
            return AbstractBiMap.super.delegate();
        }

        public Object readResolve() {
            return inverse().inverse();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return AbstractBiMap.super.values();
        }
    }

    /* renamed from: com.google.common.collect.AbstractBiMap$a */
    public class C15879a implements Iterator<Map.Entry<K, V>> {
        @NullableDecl

        /* renamed from: b */
        public Map.Entry<K, V> f35735b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f35736c;

        public C15879a(Iterator it) {
            this.f35736c = it;
        }

        public final boolean hasNext() {
            return this.f35736c.hasNext();
        }

        public final Object next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f35736c.next();
            this.f35735b = entry;
            return new C15880b(entry);
        }

        public final void remove() {
            C16203o.m26218e(this.f35735b != null);
            V value = this.f35735b.getValue();
            this.f35736c.remove();
            AbstractBiMap.access$600(AbstractBiMap.this, value);
            this.f35735b = null;
        }
    }

    /* renamed from: com.google.common.collect.AbstractBiMap$b */
    public class C15880b extends C16243z<K, V> {

        /* renamed from: b */
        public final Map.Entry<K, V> f35738b;

        public C15880b(Map.Entry<K, V> entry) {
            this.f35738b = entry;
        }

        public final Object delegate() {
            return this.f35738b;
        }

        /* renamed from: e */
        public final Map.Entry<K, V> mo56041e() {
            return this.f35738b;
        }

        public final V setValue(V v) {
            AbstractBiMap.this.checkValue(v);
            C15794l.m25624r(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (C15791j.m25606a(v, getValue())) {
                return v;
            }
            C15794l.m25612f(v, "value already present: %s", !AbstractBiMap.this.containsValue(v));
            V value = this.f35738b.setValue(v);
            C15794l.m25624r(C15791j.m25606a(v, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.access$500(AbstractBiMap.this, getKey(), true, value, v);
            return value;
        }
    }

    /* renamed from: com.google.common.collect.AbstractBiMap$c */
    public class C15881c extends C16164e0<Map.Entry<K, V>> {

        /* renamed from: b */
        public final Set<Map.Entry<K, V>> f35740b;

        public C15881c() {
            this.f35740b = AbstractBiMap.this.f35731b.entrySet();
        }

        public final void clear() {
            AbstractBiMap.this.clear();
        }

        public final boolean contains(Object obj) {
            Set<Map.Entry<K, V>> set = this.f35740b;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            return set.contains(new C16241y0(entry));
        }

        public final boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        public final Object delegate() {
            return this.f35740b;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.entrySetIterator();
        }

        public final boolean remove(Object obj) {
            if (!this.f35740b.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.inverse.f35731b.remove(entry.getValue());
            this.f35740b.remove(entry);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public final Object[] toArray() {
            return standardToArray();
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Collection m35099delegate() {
            return this.f35740b;
        }

        public final <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Set<Map.Entry<K, V>> m35100delegate() {
            return this.f35740b;
        }
    }

    /* renamed from: com.google.common.collect.AbstractBiMap$e */
    public class C15883e extends C16164e0<V> {

        /* renamed from: b */
        public final Set<V> f35743b;

        public C15883e() {
            this.f35743b = AbstractBiMap.this.inverse.keySet();
        }

        public final Object delegate() {
            return this.f35743b;
        }

        public final Iterator<V> iterator() {
            return new C16233w0(AbstractBiMap.this.entrySet().iterator());
        }

        public final Object[] toArray() {
            return standardToArray();
        }

        public final String toString() {
            return standardToString();
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Collection m35101delegate() {
            return this.f35743b;
        }

        public final <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Set<V> m35102delegate() {
            return this.f35743b;
        }
    }

    public AbstractBiMap() {
        throw null;
    }

    public AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    public static Object access$200(AbstractBiMap abstractBiMap, Object obj) {
        V remove = abstractBiMap.f35731b.remove(obj);
        abstractBiMap.inverse.f35731b.remove(remove);
        return remove;
    }

    public static void access$500(AbstractBiMap abstractBiMap, Object obj, boolean z, Object obj2, Object obj3) {
        if (z) {
            abstractBiMap.inverse.f35731b.remove(obj2);
        }
        abstractBiMap.inverse.f35731b.put(obj3, obj);
    }

    public static void access$600(AbstractBiMap abstractBiMap, Object obj) {
        abstractBiMap.inverse.f35731b.remove(obj);
    }

    /* renamed from: a */
    public final V mo56020a(@NullableDecl K k, @NullableDecl V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean containsKey = containsKey(k);
        if (containsKey && C15791j.m25606a(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            C15794l.m25612f(v, "value already present: %s", !containsValue(v));
        }
        V put = this.f35731b.put(k, v);
        if (containsKey) {
            this.inverse.f35731b.remove(put);
        }
        this.inverse.f35731b.put(v, k);
        return put;
    }

    @CanIgnoreReturnValue
    public K checkKey(@NullableDecl K k) {
        return k;
    }

    @CanIgnoreReturnValue
    public V checkValue(@NullableDecl V v) {
        return v;
    }

    public void clear() {
        this.f35731b.clear();
        this.inverse.f35731b.clear();
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return this.inverse.containsKey(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C15881c cVar = this.f35734e;
        if (cVar != null) {
            return cVar;
        }
        C15881c cVar2 = new C15881c();
        this.f35734e = cVar2;
        return cVar2;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new C15879a(this.f35731b.entrySet().iterator());
    }

    @CanIgnoreReturnValue
    public V forcePut(@NullableDecl K k, @NullableDecl V v) {
        return mo56020a(k, v, true);
    }

    public C16196m<V, K> inverse() {
        return this.inverse;
    }

    public Set<K> keySet() {
        C15882d dVar = this.f35732c;
        if (dVar != null) {
            return dVar;
        }
        C15882d dVar2 = new C15882d();
        this.f35732c = dVar2;
        return dVar2;
    }

    public AbstractBiMap<V, K> makeInverse(Map<V, K> map) {
        return new Inverse(map, this);
    }

    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        return mo56020a(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        V remove = this.f35731b.remove(obj);
        this.inverse.f35731b.remove(remove);
        return remove;
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        boolean z = true;
        C15794l.m25623q(this.f35731b == null);
        C15794l.m25623q(this.inverse == null);
        C15794l.m25613g(map.isEmpty());
        C15794l.m25613g(map2.isEmpty());
        if (map == map2) {
            z = false;
        }
        C15794l.m25613g(z);
        this.f35731b = map;
        this.inverse = makeInverse(map2);
    }

    public void setInverse(AbstractBiMap<V, K> abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    /* renamed from: com.google.common.collect.AbstractBiMap$d */
    public class C15882d extends C16164e0<K> {
        public C15882d() {
        }

        public final void clear() {
            AbstractBiMap.this.clear();
        }

        public final Iterator<K> iterator() {
            return new C16230v0(AbstractBiMap.this.entrySet().iterator());
        }

        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.access$200(AbstractBiMap.this, obj);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public final Set<K> delegate() {
            return AbstractBiMap.this.f35731b.keySet();
        }
    }

    public Map<K, V> delegate() {
        return this.f35731b;
    }

    public Set<V> values() {
        C15883e eVar = this.f35733d;
        if (eVar != null) {
            return eVar;
        }
        C15883e eVar2 = new C15883e();
        this.f35733d = eVar2;
        return eVar2;
    }

    public AbstractBiMap(Map map, AbstractBiMap abstractBiMap, C15879a aVar) {
        this.f35731b = map;
        this.inverse = abstractBiMap;
    }
}
