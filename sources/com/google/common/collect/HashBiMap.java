package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements C16196m<K, V>, Serializable {

    /* renamed from: b */
    public transient int[] f35868b;

    /* renamed from: c */
    public transient int[] f35869c;

    /* renamed from: d */
    public transient int[] f35870d;

    /* renamed from: e */
    public transient int[] f35871e;
    @NullableDecl

    /* renamed from: f */
    public transient int f35872f;
    @NullableDecl

    /* renamed from: g */
    public transient int f35873g;

    /* renamed from: h */
    public transient int[] f35874h;

    /* renamed from: i */
    public transient int[] f35875i;

    /* renamed from: j */
    public transient C15942e f35876j;

    /* renamed from: k */
    public transient C15943f f35877k;
    public transient K[] keys;

    /* renamed from: l */
    public transient C15940c f35878l;
    @RetainedWith
    @MonotonicNonNullDecl

    /* renamed from: m */
    public transient C16196m<V, K> f35879m;
    public transient int modCount;
    public transient int size;
    public transient V[] values;

    public static class Inverse<K, V> extends AbstractMap<V, K> implements C16196m<V, K>, Serializable {

        /* renamed from: b */
        public transient C15941d f35880b;
        private final HashBiMap<K, V> forward;

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            C16196m unused = this.forward.f35879m = this;
        }

        public void clear() {
            this.forward.clear();
        }

        public boolean containsKey(@NullableDecl Object obj) {
            return this.forward.containsValue(obj);
        }

        public boolean containsValue(@NullableDecl Object obj) {
            return this.forward.containsKey(obj);
        }

        public Set<Map.Entry<V, K>> entrySet() {
            C15941d dVar = this.f35880b;
            if (dVar != null) {
                return dVar;
            }
            C15941d dVar2 = new C15941d(this.forward);
            this.f35880b = dVar2;
            return dVar2;
        }

        @NullableDecl
        @CanIgnoreReturnValue
        public K forcePut(@NullableDecl V v, @NullableDecl K k) {
            return this.forward.putInverse(v, k, true);
        }

        @NullableDecl
        public K get(@NullableDecl Object obj) {
            return this.forward.getInverse(obj);
        }

        public C16196m<K, V> inverse() {
            return this.forward;
        }

        public Set<V> keySet() {
            return this.forward.values();
        }

        @NullableDecl
        @CanIgnoreReturnValue
        public K put(@NullableDecl V v, @NullableDecl K k) {
            return this.forward.putInverse(v, k, false);
        }

        @NullableDecl
        @CanIgnoreReturnValue
        public K remove(@NullableDecl Object obj) {
            return this.forward.removeInverse(obj);
        }

        public int size() {
            return this.forward.size;
        }

        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$a */
    public final class C15938a extends C16144b<K, V> {
        @NullableDecl

        /* renamed from: b */
        public final K f35881b;

        /* renamed from: c */
        public int f35882c;

        public C15938a(int i) {
            this.f35881b = HashBiMap.this.keys[i];
            this.f35882c = i;
        }

        /* renamed from: d */
        public final void mo56588d() {
            int i = this.f35882c;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && C15791j.m25606a(hashBiMap.keys[i], this.f35881b)) {
                    return;
                }
            }
            this.f35882c = HashBiMap.this.findEntryByKey(this.f35881b);
        }

        public final K getKey() {
            return this.f35881b;
        }

        @NullableDecl
        public final V getValue() {
            mo56588d();
            int i = this.f35882c;
            if (i == -1) {
                return null;
            }
            return HashBiMap.this.values[i];
        }

        public final V setValue(V v) {
            mo56588d();
            int i = this.f35882c;
            if (i == -1) {
                return HashBiMap.this.put(this.f35881b, v);
            }
            V v2 = HashBiMap.this.values[i];
            if (C15791j.m25606a(v2, v)) {
                return v;
            }
            HashBiMap.this.mo56567j(v, this.f35882c, false);
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$b */
    public static final class C15939b<K, V> extends C16144b<V, K> {

        /* renamed from: b */
        public final HashBiMap<K, V> f35884b;

        /* renamed from: c */
        public final V f35885c;

        /* renamed from: d */
        public int f35886d;

        public C15939b(HashBiMap<K, V> hashBiMap, int i) {
            this.f35884b = hashBiMap;
            this.f35885c = hashBiMap.values[i];
            this.f35886d = i;
        }

        /* renamed from: d */
        public final void mo56589d() {
            int i = this.f35886d;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.f35884b;
                if (i <= hashBiMap.size && C15791j.m25606a(this.f35885c, hashBiMap.values[i])) {
                    return;
                }
            }
            this.f35886d = this.f35884b.findEntryByValue(this.f35885c);
        }

        public final V getKey() {
            return this.f35885c;
        }

        public final K getValue() {
            mo56589d();
            int i = this.f35886d;
            if (i == -1) {
                return null;
            }
            return this.f35884b.keys[i];
        }

        public final K setValue(K k) {
            mo56589d();
            int i = this.f35886d;
            if (i == -1) {
                return this.f35884b.putInverse(this.f35885c, k, false);
            }
            K k2 = this.f35884b.keys[i];
            if (C15791j.m25606a(k2, k)) {
                return k;
            }
            this.f35884b.mo56565i(k, this.f35886d, false);
            return k2;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$c */
    public final class C15940c extends C15944g<K, V, Map.Entry<K, V>> {
        public C15940c() {
            super(HashBiMap.this);
        }

        /* renamed from: a */
        public final Object mo56590a(int i) {
            return new C15938a(i);
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByKey = HashBiMap.this.findEntryByKey(key);
            return findEntryByKey != -1 && C15791j.m25606a(value, HashBiMap.this.values[findEntryByKey]);
        }

        @CanIgnoreReturnValue
        public final boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = C16184i0.m26180c(key);
            int findEntryByKey = HashBiMap.this.findEntryByKey(key, c);
            if (findEntryByKey == -1 || !C15791j.m25606a(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$d */
    public static class C15941d<K, V> extends C15944g<K, V, Map.Entry<V, K>> {
        public C15941d(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        /* renamed from: a */
        public final Object mo56590a(int i) {
            return new C15939b(this.f35890b, i);
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.f35890b.findEntryByValue(key);
            return findEntryByValue != -1 && C15791j.m25606a(this.f35890b.keys[findEntryByValue], value);
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = C16184i0.m26180c(key);
            int findEntryByValue = this.f35890b.findEntryByValue(key, c);
            if (findEntryByValue == -1 || !C15791j.m25606a(this.f35890b.keys[findEntryByValue], value)) {
                return false;
            }
            this.f35890b.removeEntryValueHashKnown(findEntryByValue, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$e */
    public final class C15942e extends C15944g<K, V, K> {
        public C15942e() {
            super(HashBiMap.this);
        }

        /* renamed from: a */
        public final K mo56590a(int i) {
            return HashBiMap.this.keys[i];
        }

        public final boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        public final boolean remove(@NullableDecl Object obj) {
            int c = C16184i0.m26180c(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, c);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$f */
    public final class C15943f extends C15944g<K, V, V> {
        public C15943f() {
            super(HashBiMap.this);
        }

        /* renamed from: a */
        public final V mo56590a(int i) {
            return HashBiMap.this.values[i];
        }

        public final boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        public final boolean remove(@NullableDecl Object obj) {
            int c = C16184i0.m26180c(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, c);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$g */
    public static abstract class C15944g<K, V, T> extends AbstractSet<T> {

        /* renamed from: b */
        public final HashBiMap<K, V> f35890b;

        /* renamed from: com.google.common.collect.HashBiMap$g$a */
        public class C15945a implements Iterator<T> {

            /* renamed from: b */
            public int f35891b;

            /* renamed from: c */
            public int f35892c = -1;

            /* renamed from: d */
            public int f35893d;

            /* renamed from: e */
            public int f35894e;

            public C15945a() {
                this.f35891b = C15944g.this.f35890b.f35872f;
                HashBiMap<K, V> hashBiMap = C15944g.this.f35890b;
                this.f35893d = hashBiMap.modCount;
                this.f35894e = hashBiMap.size;
            }

            public final boolean hasNext() {
                if (C15944g.this.f35890b.modCount == this.f35893d) {
                    return this.f35891b != -2 && this.f35894e > 0;
                }
                throw new ConcurrentModificationException();
            }

            public final T next() {
                if (hasNext()) {
                    T a = C15944g.this.mo56590a(this.f35891b);
                    this.f35892c = this.f35891b;
                    this.f35891b = C15944g.this.f35890b.f35875i[this.f35891b];
                    this.f35894e--;
                    return a;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                if (C15944g.this.f35890b.modCount == this.f35893d) {
                    C16203o.m26218e(this.f35892c != -1);
                    C15944g.this.f35890b.removeEntry(this.f35892c);
                    int i = this.f35891b;
                    HashBiMap<K, V> hashBiMap = C15944g.this.f35890b;
                    if (i == hashBiMap.size) {
                        this.f35891b = this.f35892c;
                    }
                    this.f35892c = -1;
                    this.f35893d = hashBiMap.modCount;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }

        public C15944g(HashBiMap<K, V> hashBiMap) {
            this.f35890b = hashBiMap;
        }

        /* renamed from: a */
        public abstract T mo56590a(int i);

        public final void clear() {
            this.f35890b.clear();
        }

        public final Iterator<T> iterator() {
            return new C15945a();
        }

        public final int size() {
            return this.f35890b.size;
        }
    }

    public HashBiMap(int i) {
        init(i);
    }

    /* renamed from: b */
    public static int[] m25791b(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        init(16);
        C16213q1.m26245b(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C16213q1.m26248e(this, objectOutputStream);
    }

    /* renamed from: a */
    public final int mo56547a(int i) {
        return i & (this.f35868b.length - 1);
    }

    /* renamed from: c */
    public final void mo56548c(int i, int i2) {
        C15794l.m25613g(i != -1);
        int a = mo56547a(i2);
        int[] iArr = this.f35868b;
        int i3 = iArr[a];
        if (i3 == i) {
            int[] iArr2 = this.f35870d;
            iArr[a] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f35870d[i3];
        while (i4 != -1) {
            if (i4 == i) {
                int[] iArr3 = this.f35870d;
                iArr3[i3] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i3 = i4;
            i4 = this.f35870d[i4];
        }
        StringBuilder h = C0072d.m201h("Expected to find entry with key ");
        h.append(this.keys[i]);
        throw new AssertionError(h.toString());
    }

    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.f35868b, -1);
        Arrays.fill(this.f35869c, -1);
        Arrays.fill(this.f35870d, 0, this.size, -1);
        Arrays.fill(this.f35871e, 0, this.size, -1);
        Arrays.fill(this.f35874h, 0, this.size, -1);
        Arrays.fill(this.f35875i, 0, this.size, -1);
        this.size = 0;
        this.f35872f = -2;
        this.f35873g = -2;
        this.modCount++;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return findEntryByKey(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return findEntryByValue(obj) != -1;
    }

    /* renamed from: d */
    public final void mo56552d(int i, int i2) {
        C15794l.m25613g(i != -1);
        int a = mo56547a(i2);
        int[] iArr = this.f35869c;
        int i3 = iArr[a];
        if (i3 == i) {
            int[] iArr2 = this.f35871e;
            iArr[a] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f35871e[i3];
        while (i4 != -1) {
            if (i4 == i) {
                int[] iArr3 = this.f35871e;
                iArr3[i3] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i3 = i4;
            i4 = this.f35871e[i4];
        }
        StringBuilder h = C0072d.m201h("Expected to find entry with value ");
        h.append(this.values[i]);
        throw new AssertionError(h.toString());
    }

    /* renamed from: e */
    public final void mo56553e(int i) {
        int[] iArr = this.f35870d;
        if (iArr.length < i) {
            int a = ImmutableCollection.C15950b.m25825a(iArr.length, i);
            this.keys = Arrays.copyOf(this.keys, a);
            this.values = Arrays.copyOf(this.values, a);
            int[] iArr2 = this.f35870d;
            int length = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr2, a);
            Arrays.fill(copyOf, length, a, -1);
            this.f35870d = copyOf;
            int[] iArr3 = this.f35871e;
            int length2 = iArr3.length;
            int[] copyOf2 = Arrays.copyOf(iArr3, a);
            Arrays.fill(copyOf2, length2, a, -1);
            this.f35871e = copyOf2;
            int[] iArr4 = this.f35874h;
            int length3 = iArr4.length;
            int[] copyOf3 = Arrays.copyOf(iArr4, a);
            Arrays.fill(copyOf3, length3, a, -1);
            this.f35874h = copyOf3;
            int[] iArr5 = this.f35875i;
            int length4 = iArr5.length;
            int[] copyOf4 = Arrays.copyOf(iArr5, a);
            Arrays.fill(copyOf4, length4, a, -1);
            this.f35875i = copyOf4;
        }
        if (this.f35868b.length < i) {
            int a2 = C16184i0.m26178a(i, 1.0d);
            this.f35868b = m25791b(a2);
            this.f35869c = m25791b(a2);
            for (int i2 = 0; i2 < this.size; i2++) {
                int a3 = mo56547a(C16184i0.m26180c(this.keys[i2]));
                int[] iArr6 = this.f35870d;
                int[] iArr7 = this.f35868b;
                iArr6[i2] = iArr7[a3];
                iArr7[a3] = i2;
                int a4 = mo56547a(C16184i0.m26180c(this.values[i2]));
                int[] iArr8 = this.f35871e;
                int[] iArr9 = this.f35869c;
                iArr8[i2] = iArr9[a4];
                iArr9[a4] = i2;
            }
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C15940c cVar = this.f35878l;
        if (cVar != null) {
            return cVar;
        }
        C15940c cVar2 = new C15940c();
        this.f35878l = cVar2;
        return cVar2;
    }

    /* renamed from: f */
    public final void mo56555f(int i, int i2) {
        C15794l.m25613g(i != -1);
        int a = mo56547a(i2);
        int[] iArr = this.f35870d;
        int[] iArr2 = this.f35868b;
        iArr[i] = iArr2[a];
        iArr2[a] = i;
    }

    public int findEntry(@NullableDecl Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[mo56547a(i)];
        while (i2 != -1) {
            if (C15791j.m25606a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public int findEntryByKey(@NullableDecl Object obj) {
        return findEntryByKey(obj, C16184i0.m26180c(obj));
    }

    public int findEntryByValue(@NullableDecl Object obj) {
        return findEntryByValue(obj, C16184i0.m26180c(obj));
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V forcePut(@NullableDecl K k, @NullableDecl V v) {
        return put(k, v, true);
    }

    /* renamed from: g */
    public final void mo56561g(int i, int i2) {
        C15794l.m25613g(i != -1);
        int a = mo56547a(i2);
        int[] iArr = this.f35871e;
        int[] iArr2 = this.f35869c;
        iArr[i] = iArr2[a];
        iArr2[a] = i;
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    @NullableDecl
    public K getInverse(@NullableDecl Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    /* renamed from: h */
    public final void mo56564h(int i, int i2, int i3) {
        C15794l.m25613g(i != -1);
        mo56548c(i, i2);
        mo56552d(i, i3);
        mo56568k(this.f35874h[i], this.f35875i[i]);
        int i4 = this.size - 1;
        if (i4 != i) {
            int i5 = this.f35874h[i4];
            int i6 = this.f35875i[i4];
            mo56568k(i5, i);
            mo56568k(i, i6);
            K[] kArr = this.keys;
            K k = kArr[i4];
            V[] vArr = this.values;
            V v = vArr[i4];
            kArr[i] = k;
            vArr[i] = v;
            int a = mo56547a(C16184i0.m26180c(k));
            int[] iArr = this.f35868b;
            int i7 = iArr[a];
            if (i7 == i4) {
                iArr[a] = i;
            } else {
                int i8 = this.f35870d[i7];
                while (i8 != i4) {
                    i7 = i8;
                    i8 = this.f35870d[i8];
                }
                this.f35870d[i7] = i;
            }
            int[] iArr2 = this.f35870d;
            iArr2[i] = iArr2[i4];
            iArr2[i4] = -1;
            int a2 = mo56547a(C16184i0.m26180c(v));
            int[] iArr3 = this.f35869c;
            int i9 = iArr3[a2];
            if (i9 == i4) {
                iArr3[a2] = i;
            } else {
                int i10 = this.f35871e[i9];
                while (i10 != i4) {
                    i9 = i10;
                    i10 = this.f35871e[i10];
                }
                this.f35871e[i9] = i;
            }
            int[] iArr4 = this.f35871e;
            iArr4[i] = iArr4[i4];
            iArr4[i4] = -1;
        }
        K[] kArr2 = this.keys;
        int i11 = this.size;
        kArr2[i11 - 1] = null;
        this.values[i11 - 1] = null;
        this.size = i11 - 1;
        this.modCount++;
    }

    /* renamed from: i */
    public final void mo56565i(@NullableDecl Object obj, int i, boolean z) {
        C15794l.m25613g(i != -1);
        int c = C16184i0.m26180c(obj);
        int findEntryByKey = findEntryByKey(obj, c);
        int i2 = this.f35873g;
        int i3 = -2;
        if (findEntryByKey != -1) {
            if (z) {
                i2 = this.f35874h[findEntryByKey];
                i3 = this.f35875i[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, c);
                if (i == this.size) {
                    i = findEntryByKey;
                }
            } else {
                throw new IllegalArgumentException("Key already present in map: " + obj);
            }
        }
        if (i2 == i) {
            i2 = this.f35874h[i];
        } else if (i2 == this.size) {
            i2 = findEntryByKey;
        }
        if (i3 == i) {
            findEntryByKey = this.f35875i[i];
        } else if (i3 != this.size) {
            findEntryByKey = i3;
        }
        mo56568k(this.f35874h[i], this.f35875i[i]);
        mo56548c(i, C16184i0.m26180c(this.keys[i]));
        this.keys[i] = obj;
        mo56555f(i, C16184i0.m26180c(obj));
        mo56568k(i2, i);
        mo56568k(i, findEntryByKey);
    }

    public void init(int i) {
        C16203o.m26215b(i, "expectedSize");
        int a = C16184i0.m26178a(i, 1.0d);
        this.size = 0;
        this.keys = new Object[i];
        this.values = new Object[i];
        this.f35868b = m25791b(a);
        this.f35869c = m25791b(a);
        this.f35870d = m25791b(i);
        this.f35871e = m25791b(i);
        this.f35872f = -2;
        this.f35873g = -2;
        this.f35874h = m25791b(i);
        this.f35875i = m25791b(i);
    }

    public C16196m<V, K> inverse() {
        C16196m<V, K> mVar = this.f35879m;
        if (mVar != null) {
            return mVar;
        }
        Inverse inverse = new Inverse(this);
        this.f35879m = inverse;
        return inverse;
    }

    /* renamed from: j */
    public final void mo56567j(@NullableDecl Object obj, int i, boolean z) {
        C15794l.m25613g(i != -1);
        int c = C16184i0.m26180c(obj);
        int findEntryByValue = findEntryByValue(obj, c);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, c);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + obj);
            }
        }
        mo56552d(i, C16184i0.m26180c(this.values[i]));
        this.values[i] = obj;
        mo56561g(i, c);
    }

    /* renamed from: k */
    public final void mo56568k(int i, int i2) {
        if (i == -2) {
            this.f35872f = i2;
        } else {
            this.f35875i[i] = i2;
        }
        if (i2 == -2) {
            this.f35873g = i;
        } else {
            this.f35874h[i2] = i;
        }
    }

    public Set<K> keySet() {
        C15942e eVar = this.f35876j;
        if (eVar != null) {
            return eVar;
        }
        C15942e eVar2 = new C15942e();
        this.f35876j = eVar2;
        return eVar2;
    }

    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        return put(k, v, false);
    }

    @NullableDecl
    public K putInverse(@NullableDecl V v, @NullableDecl K k, boolean z) {
        int c = C16184i0.m26180c(v);
        int findEntryByValue = findEntryByValue(v, c);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (C15791j.m25606a(k2, k)) {
                return k;
            }
            mo56565i(k, findEntryByValue, z);
            return k2;
        }
        int i = this.f35873g;
        int c2 = C16184i0.m26180c(k);
        int findEntryByKey = findEntryByKey(k, c2);
        if (!z) {
            C15794l.m25612f(k, "Key already present: %s", findEntryByKey == -1);
        } else if (findEntryByKey != -1) {
            i = this.f35874h[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, c2);
        }
        mo56553e(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = k;
        this.values[i2] = v;
        mo56555f(i2, c2);
        mo56561g(this.size, c);
        int i3 = i == -2 ? this.f35872f : this.f35875i[i];
        mo56568k(i, this.size);
        mo56568k(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        int c = C16184i0.m26180c(obj);
        int findEntryByKey = findEntryByKey(obj, c);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, c);
        return v;
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, C16184i0.m26180c(this.keys[i]));
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        mo56564h(i, i2, C16184i0.m26180c(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        mo56564h(i, C16184i0.m26180c(this.keys[i]), i2);
    }

    @NullableDecl
    public K removeInverse(@NullableDecl Object obj) {
        int c = C16184i0.m26180c(obj);
        int findEntryByValue = findEntryByValue(obj, c);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, c);
        return k;
    }

    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    public int findEntryByKey(@NullableDecl Object obj, int i) {
        return findEntry(obj, i, this.f35868b, this.f35870d, this.keys);
    }

    public int findEntryByValue(@NullableDecl Object obj, int i) {
        return findEntry(obj, i, this.f35869c, this.f35871e, this.values);
    }

    @NullableDecl
    public V put(@NullableDecl K k, @NullableDecl V v, boolean z) {
        int c = C16184i0.m26180c(k);
        int findEntryByKey = findEntryByKey(k, c);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (C15791j.m25606a(v2, v)) {
                return v;
            }
            mo56567j(v, findEntryByKey, z);
            return v2;
        }
        int c2 = C16184i0.m26180c(v);
        int findEntryByValue = findEntryByValue(v, c2);
        if (!z) {
            C15794l.m25612f(v, "Value already present: %s", findEntryByValue == -1);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, c2);
        }
        mo56553e(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v;
        mo56555f(i, c);
        mo56561g(this.size, c2);
        mo56568k(this.f35873g, this.size);
        mo56568k(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    public Set<V> values() {
        C15943f fVar = this.f35877k;
        if (fVar != null) {
            return fVar;
        }
        C15943f fVar2 = new C15943f();
        this.f35877k = fVar2;
        return fVar2;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}
