package com.google.common.collect;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final float DEFAULT_LOAD_FACTOR = 1.0f;
    public static final int DEFAULT_SIZE = 3;
    public static final int UNSET = -1;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient int[] f35801b;

    /* renamed from: c */
    public transient int f35802c;

    /* renamed from: d */
    public transient int f35803d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    public transient Set<K> f35804e;
    @MonotonicNonNullDecl
    public transient long[] entries;
    @MonotonicNonNullDecl

    /* renamed from: f */
    public transient Set<Map.Entry<K, V>> f35805f;
    @MonotonicNonNullDecl

    /* renamed from: g */
    public transient Collection<V> f35806g;
    @MonotonicNonNullDecl
    public transient Object[] keys;
    public transient float loadFactor;
    public transient int modCount;
    @MonotonicNonNullDecl
    public transient Object[] values;

    /* renamed from: com.google.common.collect.CompactHashMap$a */
    public class C15916a extends CompactHashMap<K, V>.e<K> {
        public C15916a() {
            super();
        }

        /* renamed from: a */
        public final K mo56335a(int i) {
            return CompactHashMap.this.keys[i];
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$b */
    public class C15917b extends CompactHashMap<K, V>.e<Map.Entry<K, V>> {
        public C15917b() {
            super();
        }

        /* renamed from: a */
        public final Object mo56335a(int i) {
            return new C15922g(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$c */
    public class C15918c extends CompactHashMap<K, V>.e<V> {
        public C15918c() {
            super();
        }

        /* renamed from: a */
        public final V mo56335a(int i) {
            return CompactHashMap.this.values[i];
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$d */
    public class C15919d extends AbstractSet<Map.Entry<K, V>> {
        public C15919d() {
        }

        public final void clear() {
            CompactHashMap.this.clear();
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int access$200 = CompactHashMap.this.mo56306a(entry.getKey());
            return access$200 != -1 && C15791j.m25606a(CompactHashMap.this.values[access$200], entry.getValue());
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        public final boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int access$200 = CompactHashMap.this.mo56306a(entry.getKey());
            if (access$200 == -1 || !C15791j.m25606a(CompactHashMap.this.values[access$200], entry.getValue())) {
                return false;
            }
            CompactHashMap.access$000(CompactHashMap.this, access$200);
            return true;
        }

        public final int size() {
            return CompactHashMap.this.f35803d;
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$e */
    public abstract class C15920e<T> implements Iterator<T> {

        /* renamed from: b */
        public int f35811b;

        /* renamed from: c */
        public int f35812c;

        /* renamed from: d */
        public int f35813d = -1;

        public C15920e() {
            this.f35811b = CompactHashMap.this.modCount;
            this.f35812c = CompactHashMap.this.firstEntryIndex();
        }

        /* renamed from: a */
        public abstract T mo56335a(int i);

        public final boolean hasNext() {
            return this.f35812c >= 0;
        }

        public final T next() {
            if (CompactHashMap.this.modCount != this.f35811b) {
                throw new ConcurrentModificationException();
            } else if (hasNext()) {
                int i = this.f35812c;
                this.f35813d = i;
                T a = mo56335a(i);
                this.f35812c = CompactHashMap.this.getSuccessor(this.f35812c);
                return a;
            } else {
                throw new NoSuchElementException();
            }
        }

        public final void remove() {
            if (CompactHashMap.this.modCount == this.f35811b) {
                C16203o.m26218e(this.f35813d >= 0);
                this.f35811b++;
                CompactHashMap.access$000(CompactHashMap.this, this.f35813d);
                this.f35812c = CompactHashMap.this.adjustAfterRemove(this.f35812c, this.f35813d);
                this.f35813d = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$f */
    public class C15921f extends AbstractSet<K> {
        public C15921f() {
        }

        public final void clear() {
            CompactHashMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        public final boolean remove(@NullableDecl Object obj) {
            int access$200 = CompactHashMap.this.mo56306a(obj);
            if (access$200 == -1) {
                return false;
            }
            CompactHashMap.access$000(CompactHashMap.this, access$200);
            return true;
        }

        public final int size() {
            return CompactHashMap.this.f35803d;
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$g */
    public final class C15922g extends C16144b<K, V> {
        @NullableDecl

        /* renamed from: b */
        public final K f35816b;

        /* renamed from: c */
        public int f35817c;

        public C15922g(int i) {
            this.f35816b = CompactHashMap.this.keys[i];
            this.f35817c = i;
        }

        /* renamed from: d */
        public final void mo56349d() {
            int i = this.f35817c;
            if (i == -1 || i >= CompactHashMap.this.size() || !C15791j.m25606a(this.f35816b, CompactHashMap.this.keys[this.f35817c])) {
                this.f35817c = CompactHashMap.this.mo56306a(this.f35816b);
            }
        }

        public final K getKey() {
            return this.f35816b;
        }

        public final V getValue() {
            mo56349d();
            int i = this.f35817c;
            if (i == -1) {
                return null;
            }
            return CompactHashMap.this.values[i];
        }

        public final V setValue(V v) {
            mo56349d();
            int i = this.f35817c;
            if (i == -1) {
                CompactHashMap.this.put(this.f35816b, v);
                return null;
            }
            V[] vArr = CompactHashMap.this.values;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$h */
    public class C15923h extends AbstractCollection<V> {
        public C15923h() {
        }

        public final void clear() {
            CompactHashMap.this.clear();
        }

        public final Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        public final int size() {
            return CompactHashMap.this.f35803d;
        }
    }

    public CompactHashMap() {
        init(3, 1.0f);
    }

    public static Object access$000(CompactHashMap compactHashMap, int i) {
        return compactHashMap.mo56309b(compactHashMap.keys[i], (int) (compactHashMap.entries[i] >>> 32));
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f35803d);
        for (int i = 0; i < this.f35803d; i++) {
            objectOutputStream.writeObject(this.keys[i]);
            objectOutputStream.writeObject(this.values[i]);
        }
    }

    /* renamed from: a */
    public final int mo56306a(@NullableDecl Object obj) {
        int c = C16184i0.m26180c(obj);
        int[] iArr = this.f35801b;
        int i = iArr[(iArr.length - 1) & c];
        while (i != -1) {
            long j = this.entries[i];
            if (((int) (j >>> 32)) == c && C15791j.m25606a(obj, this.keys[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void accessEntry(int i) {
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @NullableDecl
    /* renamed from: b */
    public final V mo56309b(@NullableDecl Object obj, int i) {
        int[] iArr = this.f35801b;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.entries[i2] >>> 32)) != i || !C15791j.m25606a(obj, this.keys[i2])) {
                int i4 = (int) this.entries[i2];
                if (i4 == -1) {
                    return null;
                }
                int i5 = i4;
                i3 = i2;
                i2 = i5;
            } else {
                V v = this.values[i2];
                if (i3 == -1) {
                    this.f35801b[length] = (int) this.entries[i2];
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = (jArr[i3] & -4294967296L) | (((long) ((int) jArr[i2])) & UnsignedInteger.INT_MASK);
                }
                moveLastEntry(i2);
                this.f35803d--;
                this.modCount++;
                return v;
            }
        }
    }

    /* renamed from: c */
    public final void mo56310c(int i) {
        if (this.f35801b.length >= 1073741824) {
            this.f35802c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i2 = ((int) (((float) i) * this.loadFactor)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.entries;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.f35803d; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & UnsignedInteger.INT_MASK);
        }
        this.f35802c = i2;
        this.f35801b = iArr;
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.f35803d, (Object) null);
        Arrays.fill(this.values, 0, this.f35803d, (Object) null);
        Arrays.fill(this.f35801b, -1);
        Arrays.fill(this.entries, -1);
        this.f35803d = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return mo56306a(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f35803d; i++) {
            if (C15791j.m25606a(obj, this.values[i])) {
                return true;
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new C15919d();
    }

    public Set<K> createKeySet() {
        return new C15921f();
    }

    public Collection<V> createValues() {
        return new C15923h();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f35805f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.f35805f = createEntrySet;
        return createEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new C15917b();
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public V get(@NullableDecl Object obj) {
        int a = mo56306a(obj);
        accessEntry(a);
        if (a == -1) {
            return null;
        }
        return this.values[a];
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.f35803d) {
            return i2;
        }
        return -1;
    }

    public void init(int i, float f) {
        boolean z = false;
        C15794l.m25614h(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        C15794l.m25614h(z, "Illegal load factor");
        int a = C16184i0.m26178a(i, (double) f);
        int[] iArr = new int[a];
        Arrays.fill(iArr, -1);
        this.f35801b = iArr;
        this.loadFactor = f;
        this.keys = new Object[i];
        this.values = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.entries = jArr;
        this.f35802c = Math.max(1, (int) (((float) a) * f));
    }

    public void insertEntry(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.entries[i] = (((long) i2) << 32) | UnsignedInteger.INT_MASK;
        this.keys[i] = k;
        this.values[i] = v;
    }

    public boolean isEmpty() {
        return this.f35803d == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f35804e;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.f35804e = createKeySet;
        return createKeySet;
    }

    public Iterator<K> keySetIterator() {
        return new C15916a();
    }

    public void moveLastEntry(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.values;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.entries;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int[] iArr = this.f35801b;
            int length = ((int) (j >>> 32)) & (iArr.length - 1);
            int i2 = iArr[length];
            if (i2 == size) {
                iArr[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.entries;
                long j2 = jArr2[i2];
                int i3 = (int) j2;
                if (i3 == size) {
                    jArr2[i2] = (j2 & -4294967296L) | (((long) i) & UnsignedInteger.INT_MASK);
                    return;
                }
                i2 = i3;
            }
        } else {
            this.keys[i] = null;
            this.values[i] = null;
            this.entries[i] = -1;
        }
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        V[] vArr = this.values;
        int c = C16184i0.m26180c(k);
        int[] iArr = this.f35801b;
        int length = (iArr.length - 1) & c;
        int i = this.f35803d;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) != c || !C15791j.m25606a(k, objArr[i2])) {
                    int i3 = (int) j;
                    if (i3 == -1) {
                        jArr[i2] = (-4294967296L & j) | (((long) i) & UnsignedInteger.INT_MASK);
                        break;
                    }
                    i2 = i3;
                } else {
                    V v2 = vArr[i2];
                    vArr[i2] = v;
                    accessEntry(i2);
                    return v2;
                }
            }
        }
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            int i5 = i + 1;
            int length2 = this.entries.length;
            if (i5 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i4 = max;
                }
                if (i4 != length2) {
                    resizeEntries(i4);
                }
            }
            insertEntry(i, k, v, c);
            this.f35803d = i5;
            if (i >= this.f35802c) {
                mo56310c(this.f35801b.length * 2);
            }
            this.modCount++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        return mo56309b(obj, C16184i0.m26180c(obj));
    }

    public void resizeEntries(int i) {
        this.keys = Arrays.copyOf(this.keys, i);
        this.values = Arrays.copyOf(this.values, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.entries = copyOf;
    }

    public int size() {
        return this.f35803d;
    }

    public void trimToSize() {
        int i = this.f35803d;
        if (i < this.entries.length) {
            resizeEntries(i);
        }
        int max = Math.max(1, Integer.highestOneBit((int) (((float) i) / this.loadFactor)));
        if (max < 1073741824 && ((double) i) / ((double) max) > ((double) this.loadFactor)) {
            max <<= 1;
        }
        if (max < this.f35801b.length) {
            mo56310c(max);
        }
    }

    public Collection<V> values() {
        Collection<V> collection = this.f35806g;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.f35806g = createValues;
        return createValues;
    }

    public Iterator<V> valuesIterator() {
        return new C15918c();
    }

    public CompactHashMap(int i) {
        this(i, 1.0f);
    }

    public CompactHashMap(int i, float f) {
        init(i, f);
    }
}
