package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15784e;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.common.base.Converter;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Maps {

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C16196m<A, B> bimap;

        public BiMapConverter(C16196m<A, B> mVar) {
            mVar.getClass();
            this.bimap = mVar;
        }

        public A doBackward(B b) {
            A a = this.bimap.inverse().get(b);
            C15794l.m25612f(b, "No non-null mapping present for input: %s", a != null);
            return a;
        }

        public B doForward(A a) {
            B b = this.bimap.get(a);
            C15794l.m25612f(a, "No non-null mapping present for input: %s", b != null);
            return b;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.bimap.equals(((BiMapConverter) obj).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Maps.asConverter(");
            h.append(this.bimap);
            h.append(")");
            return h.toString();
        }
    }

    public enum EntryFunction implements C15784e<Map.Entry<?, ?>, Object> {
        KEY {
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    public static class UnmodifiableBiMap<K, V> extends C16240y<K, V> implements C16196m<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final C16196m<? extends K, ? extends V> delegate;
        @RetainedWith
        @MonotonicNonNullDecl
        public C16196m<V, K> inverse;
        public final Map<K, V> unmodifiableMap;
        @MonotonicNonNullDecl
        public transient Set<V> values;

        public UnmodifiableBiMap(C16196m<? extends K, ? extends V> mVar, @NullableDecl C16196m<V, K> mVar2) {
            this.unmodifiableMap = Collections.unmodifiableMap(mVar);
            this.delegate = mVar;
            this.inverse = mVar2;
        }

        public V forcePut(K k, V v) {
            throw new UnsupportedOperationException();
        }

        public C16196m<V, K> inverse() {
            C16196m<V, K> mVar = this.inverse;
            if (mVar != null) {
                return mVar;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        public Set<V> values() {
            Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
            this.values = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    public static class UnmodifiableNavigableMap<K, V> extends C16168f0<K, V> implements NavigableMap<K, V>, Serializable {
        @MonotonicNonNullDecl

        /* renamed from: b */
        public transient UnmodifiableNavigableMap<K, V> f36075b;
        private final NavigableMap<K, ? extends V> delegate;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        public Map.Entry<K, V> ceilingEntry(K k) {
            return Maps.m26053a(this.delegate.ceilingEntry(k));
        }

        public K ceilingKey(K k) {
            return this.delegate.ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return Sets.m26096f(this.delegate.descendingKeySet());
        }

        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.f36075b;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
            this.f36075b = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        public Map.Entry<K, V> firstEntry() {
            return Maps.m26053a(this.delegate.firstEntry());
        }

        public Map.Entry<K, V> floorEntry(K k) {
            return Maps.m26053a(this.delegate.floorEntry(k));
        }

        public K floorKey(K k) {
            return this.delegate.floorKey(k);
        }

        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public Map.Entry<K, V> higherEntry(K k) {
            return Maps.m26053a(this.delegate.higherEntry(k));
        }

        public K higherKey(K k) {
            return this.delegate.higherKey(k);
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            return Maps.m26053a(this.delegate.lastEntry());
        }

        public Map.Entry<K, V> lowerEntry(K k) {
            return Maps.m26053a(this.delegate.lowerEntry(k));
        }

        public K lowerKey(K k) {
            return this.delegate.lowerKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            return Sets.m26096f(this.delegate.navigableKeySet());
        }

        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        public NavigableMap<K, V> headMap(K k, boolean z) {
            NavigableMap<K, ? extends V> headMap = this.delegate.headMap(k, z);
            headMap.getClass();
            return headMap instanceof UnmodifiableNavigableMap ? headMap : new UnmodifiableNavigableMap(headMap);
        }

        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            NavigableMap<K, ? extends V> subMap = this.delegate.subMap(k, z, k2, z2);
            subMap.getClass();
            return subMap instanceof UnmodifiableNavigableMap ? subMap : new UnmodifiableNavigableMap(subMap);
        }

        public NavigableMap<K, V> tailMap(K k, boolean z) {
            NavigableMap<K, ? extends V> tailMap = this.delegate.tailMap(k, z);
            tailMap.getClass();
            return tailMap instanceof UnmodifiableNavigableMap ? tailMap : new UnmodifiableNavigableMap(tailMap);
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.f36075b = unmodifiableNavigableMap;
        }

        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.delegate);
        }
    }

    /* renamed from: com.google.common.collect.Maps$b */
    public static abstract class C16040b<K, V> extends Sets.C16082a<Map.Entry<K, V>> {
        /* renamed from: a */
        public abstract Map<K, V> mo56096a();

        public final void clear() {
            mo56096a().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object e = Maps.m26057e(key, mo56096a());
            if (C15791j.m25606a(e, entry.getValue())) {
                return e != null || mo56096a().containsKey(key);
            }
            return false;
        }

        public final boolean isEmpty() {
            return mo56096a().isEmpty();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return mo56096a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return Sets.m26094d(this, collection);
            } catch (UnsupportedOperationException unused) {
                return Sets.m26095e(this, collection.iterator());
            }
        }

        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(Maps.m26054b(collection.size()));
                for (Object next : collection) {
                    if (contains(next)) {
                        hashSet.add(((Map.Entry) next).getKey());
                    }
                }
                return mo56096a().keySet().retainAll(hashSet);
            }
        }

        public final int size() {
            return mo56096a().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$c */
    public interface C16041c<K, V1, V2> {
        /* renamed from: a */
        Object mo57120a(@NullableDecl Object obj);
    }

    /* renamed from: com.google.common.collect.Maps$d */
    public static abstract class C16042d<K, V> extends AbstractMap<K, V> {

        /* renamed from: com.google.common.collect.Maps$d$a */
        public class C16043a extends C16040b<K, V> {
            public C16043a() {
            }

            /* renamed from: a */
            public final Map<K, V> mo56096a() {
                return C16042d.this;
            }

            public final Iterator<Map.Entry<K, V>> iterator() {
                return C16042d.this.mo56287a();
            }
        }

        /* renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo56287a();

        public void clear() {
            Iterators.m25979b(mo56287a());
        }

        public final Set<Map.Entry<K, V>> entrySet() {
            return new C16043a();
        }
    }

    /* renamed from: com.google.common.collect.Maps$e */
    public static class C16044e<K, V> extends Sets.C16082a<K> {
        @Weak

        /* renamed from: b */
        public final Map<K, V> f36080b;

        public C16044e(Map<K, V> map) {
            map.getClass();
            this.f36080b = map;
        }

        /* renamed from: a */
        public Map<K, V> mo57123a() {
            return this.f36080b;
        }

        public void clear() {
            mo57123a().clear();
        }

        public boolean contains(Object obj) {
            return mo57123a().containsKey(obj);
        }

        public final boolean isEmpty() {
            return mo57123a().isEmpty();
        }

        public Iterator<K> iterator() {
            return new C16230v0(mo57123a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo57123a().remove(obj);
            return true;
        }

        public final int size() {
            return mo57123a().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$g */
    public static class C16046g<K, V> extends C16044e<K, V> implements SortedSet<K> {
        public C16046g(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: c */
        public SortedMap<K, V> mo57123a() {
            return (SortedMap) this.f36080b;
        }

        public final Comparator<? super K> comparator() {
            return mo57123a().comparator();
        }

        public final K first() {
            return mo57123a().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C16046g(mo57123a().headMap(k));
        }

        public final K last() {
            return mo57123a().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C16046g(mo57123a().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C16046g(mo57123a().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.Maps$h */
    public static class C16047h<K, V1, V2> extends C16042d<K, V2> {

        /* renamed from: b */
        public final Map<K, V1> f36081b;

        /* renamed from: c */
        public final C16041c<? super K, ? super V1, V2> f36082c;

        public C16047h(Map<K, V1> map, C16041c<? super K, ? super V1, V2> cVar) {
            map.getClass();
            this.f36081b = map;
            cVar.getClass();
            this.f36082c = cVar;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V2>> mo56287a() {
            Iterator<Map.Entry<K, V1>> it = this.f36081b.entrySet().iterator();
            C16041c<? super K, ? super V1, V2> cVar = this.f36082c;
            cVar.getClass();
            return new C16209p0(it, new C16227u0(cVar));
        }

        public final void clear() {
            this.f36081b.clear();
        }

        public final boolean containsKey(Object obj) {
            return this.f36081b.containsKey(obj);
        }

        public final V2 get(Object obj) {
            V1 v1 = this.f36081b.get(obj);
            if (v1 != null || this.f36081b.containsKey(obj)) {
                return this.f36082c.mo57120a(v1);
            }
            return null;
        }

        public final Set<K> keySet() {
            return this.f36081b.keySet();
        }

        public final V2 remove(Object obj) {
            if (this.f36081b.containsKey(obj)) {
                return this.f36082c.mo57120a(this.f36081b.remove(obj));
            }
            return null;
        }

        public final int size() {
            return this.f36081b.size();
        }

        public final Collection<V2> values() {
            return new C16051l(this);
        }
    }

    /* renamed from: com.google.common.collect.Maps$i */
    public static class C16048i<K, V1, V2> extends C16047h<K, V1, V2> implements SortedMap<K, V2> {
        public C16048i(SortedMap<K, V1> sortedMap, C16041c<? super K, ? super V1, V2> cVar) {
            super(sortedMap, cVar);
        }

        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.f36081b).comparator();
        }

        public final K firstKey() {
            return ((SortedMap) this.f36081b).firstKey();
        }

        public final SortedMap<K, V2> headMap(K k) {
            return new C16048i(((SortedMap) this.f36081b).headMap(k), this.f36082c);
        }

        public final K lastKey() {
            return ((SortedMap) this.f36081b).lastKey();
        }

        public final SortedMap<K, V2> subMap(K k, K k2) {
            return new C16048i(((SortedMap) this.f36081b).subMap(k, k2), this.f36082c);
        }

        public final SortedMap<K, V2> tailMap(K k) {
            return new C16048i(((SortedMap) this.f36081b).tailMap(k), this.f36082c);
        }
    }

    /* renamed from: com.google.common.collect.Maps$j */
    public static class C16049j<K, V> extends C16229v<Map.Entry<K, V>> {

        /* renamed from: b */
        public final Collection<Map.Entry<K, V>> f36083b;

        public C16049j(Collection<Map.Entry<K, V>> collection) {
            this.f36083b = collection;
        }

        public final Object delegate() {
            return this.f36083b;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C16244z0(this.f36083b.iterator());
        }

        public final Object[] toArray() {
            return standardToArray();
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Collection<Map.Entry<K, V>> m35106delegate() {
            return this.f36083b;
        }

        public final <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.Maps$k */
    public static class C16050k<K, V> extends C16049j<K, V> implements Set<Map.Entry<K, V>> {
        public C16050k(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        public final boolean equals(@NullableDecl Object obj) {
            return Sets.m26091a(this, obj);
        }

        public final int hashCode() {
            return Sets.m26092b(this);
        }
    }

    /* renamed from: com.google.common.collect.Maps$l */
    public static class C16051l<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: b */
        public final Map<K, V> f36084b;

        public C16051l(Map<K, V> map) {
            map.getClass();
            this.f36084b = map;
        }

        public final void clear() {
            this.f36084b.clear();
        }

        public final boolean contains(@NullableDecl Object obj) {
            return this.f36084b.containsValue(obj);
        }

        public final boolean isEmpty() {
            return this.f36084b.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new C16233w0(this.f36084b.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry next : this.f36084b.entrySet()) {
                    if (C15791j.m25606a(obj, next.getValue())) {
                        this.f36084b.remove(next.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.f36084b.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.f36084b.keySet().removeAll(hashSet);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.f36084b.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.f36084b.keySet().retainAll(hashSet);
            }
        }

        public final int size() {
            return this.f36084b.size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$m */
    public static abstract class C16052m<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: b */
        public transient Set<Map.Entry<K, V>> f36085b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        public transient Set<K> f36086c;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public transient Collection<V> f36087d;

        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo56085a();

        /* renamed from: b */
        public Set<K> mo56115b() {
            return new C16044e(this);
        }

        /* renamed from: c */
        public Collection<V> mo57167c() {
            return new C16051l(this);
        }

        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f36085b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo56085a();
            this.f36085b = a;
            return a;
        }

        public Set<K> keySet() {
            Set<K> set = this.f36086c;
            if (set != null) {
                return set;
            }
            Set<K> b = mo56115b();
            this.f36086c = b;
            return b;
        }

        public final Collection<V> values() {
            Collection<V> collection = this.f36087d;
            if (collection != null) {
                return collection;
            }
            Collection<V> c = mo57167c();
            this.f36087d = c;
            return c;
        }
    }

    /* renamed from: a */
    public static C16241y0 m26053a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new C16241y0(entry);
    }

    /* renamed from: b */
    public static int m26054b(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        C16203o.m26215b(i, "expectedSize");
        return i + 1;
    }

    /* renamed from: c */
    public static <E> ImmutableMap<E, Integer> m26055c(Collection<E> collection) {
        Object[] objArr = new Object[(collection.size() * 2)];
        int i = 0;
        int i2 = 0;
        for (E next : collection) {
            int i3 = i + 1;
            Integer valueOf = Integer.valueOf(i);
            int i4 = (i2 + 1) * 2;
            if (i4 > objArr.length) {
                objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i4));
            }
            C16203o.m26214a(next, valueOf);
            objArr[i2 * 2] = next;
            objArr[(i2 * 2) + 1] = valueOf;
            i2++;
            i = i3;
        }
        return RegularImmutableMap.create(i2, objArr);
    }

    @NullableDecl
    /* renamed from: d */
    public static <K> K m26056d(@NullableDecl Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: e */
    public static Object m26057e(@NullableDecl Object obj, Map map) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m26058f(Map<?, ?> map) {
        int size = map.size();
        C16203o.m26215b(size, ResponseConstants.SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(next.getKey());
            sb.append('=');
            sb.append(next.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: g */
    public static C16047h m26059g(Map map, C15784e eVar) {
        return new C16047h(map, new C16142a1(eVar));
    }

    /* renamed from: com.google.common.collect.Maps$a */
    public static abstract class C16039a<K, V> extends C16240y<K, V> implements NavigableMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: b */
        public transient Ordering f36076b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        public transient C16146b1 f36077c;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public transient C16045f f36078d;

        public final Map.Entry<K, V> ceilingEntry(K k) {
            return C16162e.this.floorEntry(k);
        }

        public final K ceilingKey(K k) {
            return C16162e.this.floorKey(k);
        }

        public final Comparator<? super K> comparator() {
            Ordering ordering = this.f36076b;
            if (ordering != null) {
                return ordering;
            }
            Comparator comparator = C16162e.this.comparator();
            if (comparator == null) {
                comparator = Ordering.natural();
            }
            Ordering reverse = Ordering.from(comparator).reverse();
            this.f36076b = reverse;
            return reverse;
        }

        public final Object delegate() {
            return C16162e.this;
        }

        public final NavigableSet<K> descendingKeySet() {
            C16162e eVar = C16162e.this;
            eVar.getClass();
            return new C16045f(eVar);
        }

        public final NavigableMap<K, V> descendingMap() {
            return C16162e.this;
        }

        public final Set<Map.Entry<K, V>> entrySet() {
            C16146b1 b1Var = this.f36077c;
            if (b1Var != null) {
                return b1Var;
            }
            C16146b1 b1Var2 = new C16146b1(this);
            this.f36077c = b1Var2;
            return b1Var2;
        }

        public final Map.Entry<K, V> firstEntry() {
            return C16162e.this.lastEntry();
        }

        public final K firstKey() {
            return C16162e.this.lastKey();
        }

        public final Map.Entry<K, V> floorEntry(K k) {
            return C16162e.this.ceilingEntry(k);
        }

        public final K floorKey(K k) {
            return C16162e.this.ceilingKey(k);
        }

        public final NavigableMap<K, V> headMap(K k, boolean z) {
            return C16162e.this.tailMap(k, z).descendingMap();
        }

        public final Map.Entry<K, V> higherEntry(K k) {
            return C16162e.this.lowerEntry(k);
        }

        public final K higherKey(K k) {
            return C16162e.this.lowerKey(k);
        }

        public final Set<K> keySet() {
            return navigableKeySet();
        }

        public final Map.Entry<K, V> lastEntry() {
            return C16162e.this.firstEntry();
        }

        public final K lastKey() {
            return C16162e.this.firstKey();
        }

        public final Map.Entry<K, V> lowerEntry(K k) {
            return C16162e.this.higherEntry(k);
        }

        public final K lowerKey(K k) {
            return C16162e.this.higherKey(k);
        }

        public final NavigableSet<K> navigableKeySet() {
            C16045f fVar = this.f36078d;
            if (fVar != null) {
                return fVar;
            }
            C16045f fVar2 = new C16045f(this);
            this.f36078d = fVar2;
            return fVar2;
        }

        public final Map.Entry<K, V> pollFirstEntry() {
            return C16162e.this.pollLastEntry();
        }

        public final Map.Entry<K, V> pollLastEntry() {
            return C16162e.this.pollFirstEntry();
        }

        public final NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return C16162e.this.subMap(k2, z2, k, z).descendingMap();
        }

        public final NavigableMap<K, V> tailMap(K k, boolean z) {
            return C16162e.this.headMap(k, z).descendingMap();
        }

        public final String toString() {
            return standardToString();
        }

        public final Collection<V> values() {
            return new C16051l(this);
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Map<K, V> m35105delegate() {
            return C16162e.this;
        }

        public final SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public final SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public final SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    /* renamed from: com.google.common.collect.Maps$f */
    public static class C16045f<K, V> extends C16046g<K, V> implements NavigableSet<K> {
        public C16045f(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        /* renamed from: a */
        public final Map mo57123a() {
            return (NavigableMap) this.f36080b;
        }

        /* renamed from: c */
        public final SortedMap mo57127c() {
            return (NavigableMap) this.f36080b;
        }

        public final K ceiling(K k) {
            return ((NavigableMap) this.f36080b).ceilingKey(k);
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return ((NavigableMap) this.f36080b).descendingKeySet();
        }

        public final K floor(K k) {
            return ((NavigableMap) this.f36080b).floorKey(k);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return ((NavigableMap) this.f36080b).headMap(k, z).navigableKeySet();
        }

        public final K higher(K k) {
            return ((NavigableMap) this.f36080b).higherKey(k);
        }

        public final K lower(K k) {
            return ((NavigableMap) this.f36080b).lowerKey(k);
        }

        public final K pollFirst() {
            return Maps.m26056d(((NavigableMap) this.f36080b).pollFirstEntry());
        }

        public final K pollLast() {
            return Maps.m26056d(((NavigableMap) this.f36080b).pollLastEntry());
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return ((NavigableMap) this.f36080b).subMap(k, z, k2, z2).navigableKeySet();
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return ((NavigableMap) this.f36080b).tailMap(k, z).navigableKeySet();
        }

        public final SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public final SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public final SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }
}
