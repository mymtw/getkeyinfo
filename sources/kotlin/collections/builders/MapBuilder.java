package kotlin.collections.builders;

import com.etsy.android.lib.models.ResponseConstants;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p755lq.C19875a;
import p755lq.C19878d;
import p764pq.C20056h;
import p764pq.C20057i;

public final class MapBuilder<K, V> implements Map<K, V>, Serializable, C19878d {
    private C19304a<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public K[] keysArray;
    private C19305b<K> keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    public V[] valuesArray;
    private C19306c<V> valuesView;

    /* renamed from: kotlin.collections.builders.MapBuilder$a */
    public static final class C19296a {
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C19297b<K, V> extends C19299d<K, V> implements Iterator<Map.Entry<K, V>>, C19875a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19297b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C19383o.m32797g(mapBuilder, "map");
        }

        public final Object next() {
            if (this.f43169c < this.f43168b.length) {
                int i = this.f43169c;
                this.f43169c = i + 1;
                this.f43170d = i;
                C19298c cVar = new C19298c(this.f43168b, i);
                mo71670a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C19298c<K, V> implements Map.Entry<K, V>, C19878d.C19879a {

        /* renamed from: b */
        public final MapBuilder<K, V> f43166b;

        /* renamed from: c */
        public final int f43167c;

        public C19298c(MapBuilder<K, V> mapBuilder, int i) {
            C19383o.m32797g(mapBuilder, "map");
            this.f43166b = mapBuilder;
            this.f43167c = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C19383o.m32792b(entry.getKey(), getKey()) && C19383o.m32792b(entry.getValue(), getValue());
            }
        }

        public final K getKey() {
            return this.f43166b.keysArray[this.f43167c];
        }

        public final V getValue() {
            V[] access$getValuesArray$p = this.f43166b.valuesArray;
            C19383o.m32794d(access$getValuesArray$p);
            return access$getValuesArray$p[this.f43167c];
        }

        public final int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            this.f43166b.checkIsMutable$kotlin_stdlib();
            V[] access$allocateValuesArray = MapBuilder.access$allocateValuesArray(this.f43166b);
            int i = this.f43167c;
            V v2 = access$allocateValuesArray[i];
            access$allocateValuesArray[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C19299d<K, V> {

        /* renamed from: b */
        public final MapBuilder<K, V> f43168b;

        /* renamed from: c */
        public int f43169c;

        /* renamed from: d */
        public int f43170d = -1;

        public C19299d(MapBuilder<K, V> mapBuilder) {
            C19383o.m32797g(mapBuilder, "map");
            this.f43168b = mapBuilder;
            mo71670a();
        }

        /* renamed from: a */
        public final void mo71670a() {
            while (this.f43169c < this.f43168b.length) {
                int[] access$getPresenceArray$p = this.f43168b.presenceArray;
                int i = this.f43169c;
                if (access$getPresenceArray$p[i] < 0) {
                    this.f43169c = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.f43169c < this.f43168b.length;
        }

        public final void remove() {
            if (this.f43170d != -1) {
                this.f43168b.checkIsMutable$kotlin_stdlib();
                this.f43168b.mo71639e(this.f43170d);
                this.f43170d = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C19300e<K, V> extends C19299d<K, V> implements Iterator<K>, C19875a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19300e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C19383o.m32797g(mapBuilder, "map");
        }

        public final K next() {
            if (this.f43169c < this.f43168b.length) {
                int i = this.f43169c;
                this.f43169c = i + 1;
                this.f43170d = i;
                K k = this.f43168b.keysArray[this.f43170d];
                mo71670a();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C19301f<K, V> extends C19299d<K, V> implements Iterator<V>, C19875a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19301f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C19383o.m32797g(mapBuilder, "map");
        }

        public final V next() {
            if (this.f43169c < this.f43168b.length) {
                int i = this.f43169c;
                this.f43169c = i + 1;
                this.f43170d = i;
                V[] access$getValuesArray$p = this.f43168b.valuesArray;
                C19383o.m32794d(access$getValuesArray$p);
                V v = access$getValuesArray$p[this.f43170d];
                mo71670a();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new C19296a();
    }

    public MapBuilder() {
        this(8);
    }

    public static final Object[] access$allocateValuesArray(MapBuilder mapBuilder) {
        V[] vArr = mapBuilder.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] v = C19543e0.m33338v(mapBuilder.keysArray.length);
        mapBuilder.valuesArray = v;
        return v;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: a */
    public final void mo71627a(int i) {
        V[] vArr;
        int i2 = this.length;
        int i3 = i + i2;
        if (i3 >= 0) {
            K[] kArr = this.keysArray;
            if (i3 > kArr.length) {
                int length2 = (kArr.length * 3) / 2;
                if (i3 <= length2) {
                    i3 = length2;
                }
                K[] copyOf = Arrays.copyOf(kArr, i3);
                C19383o.m32796f(copyOf, "copyOf(this, newSize)");
                this.keysArray = copyOf;
                V[] vArr2 = this.valuesArray;
                if (vArr2 != null) {
                    vArr = Arrays.copyOf(vArr2, i3);
                    C19383o.m32796f(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.valuesArray = vArr;
                int[] copyOf2 = Arrays.copyOf(this.presenceArray, i3);
                C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
                this.presenceArray = copyOf2;
                if (i3 < 1) {
                    i3 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i3 * 3);
                if (highestOneBit > this.hashArray.length) {
                    mo71638d(highestOneBit);
                }
            } else if ((i2 + i3) - size() > this.keysArray.length) {
                mo71638d(this.hashArray.length);
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int c = mo71631c(k);
            int i = this.maxProbeDistance * 2;
            int length2 = this.hashArray.length / 2;
            if (i > length2) {
                i = length2;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[c];
                if (i3 <= 0) {
                    int i4 = this.length;
                    K[] kArr = this.keysArray;
                    if (i4 >= kArr.length) {
                        mo71627a(1);
                    } else {
                        int i5 = i4 + 1;
                        this.length = i5;
                        kArr[i4] = k;
                        this.presenceArray[i4] = c;
                        iArr[c] = i5;
                        this.size = size() + 1;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                } else if (C19383o.m32792b(this.keysArray[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        mo71638d(this.hashArray.length * 2);
                        break;
                    }
                    c = c == 0 ? this.hashArray.length - 1 : c - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo71629b(K k) {
        int c = mo71631c(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[c];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C19383o.m32792b(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            c = c == 0 ? this.hashArray.length - 1 : c - 1;
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        return this;
    }

    /* renamed from: c */
    public final int mo71631c(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.hashShift;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        checkIsMutable$kotlin_stdlib();
        C20056h l = new C20057i(0, this.length - 1).iterator();
        while (l.f44419d) {
            int nextInt = l.nextInt();
            int[] iArr = this.presenceArray;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C19543e0.m33314g0(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C19543e0.m33314g0(0, this.length, vArr);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> collection) {
        C19383o.m32797g(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        C19383o.m32797g(entry, "entry");
        int b = mo71629b(entry.getKey());
        if (b < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C19383o.m32794d(vArr);
        return C19383o.m32792b(vArr[b], entry.getValue());
    }

    public boolean containsKey(Object obj) {
        return mo71629b(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        int i;
        int i2 = this.length;
        while (true) {
            i = -1;
            i2--;
            if (i2 < 0) {
                break;
            } else if (this.presenceArray[i2] >= 0) {
                V[] vArr = this.valuesArray;
                C19383o.m32794d(vArr);
                if (C19383o.m32792b(vArr[i2], obj)) {
                    i = i2;
                    break;
                }
            }
        }
        return i >= 0;
    }

    /* renamed from: d */
    public final void mo71638d(int i) {
        boolean z;
        int i2;
        if (this.length > size()) {
            V[] vArr = this.valuesArray;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.length;
                if (i3 >= i2) {
                    break;
                }
                if (this.presenceArray[i3] >= 0) {
                    K[] kArr = this.keysArray;
                    kArr[i4] = kArr[i3];
                    if (vArr != null) {
                        vArr[i4] = vArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            C19543e0.m33314g0(i4, i2, this.keysArray);
            if (vArr != null) {
                C19543e0.m33314g0(i4, this.length, vArr);
            }
            this.length = i4;
        }
        int[] iArr = this.hashArray;
        if (i != iArr.length) {
            this.hashArray = new int[i];
            this.hashShift = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i5 = 0;
        while (i5 < this.length) {
            int i6 = i5 + 1;
            int c = mo71631c(this.keysArray[i5]);
            int i7 = this.maxProbeDistance;
            while (true) {
                int[] iArr2 = this.hashArray;
                if (iArr2[c] == 0) {
                    iArr2[c] = i6;
                    this.presenceArray[i5] = c;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                c = c == 0 ? iArr2.length - 1 : c - 1;
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71639e(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.keysArray
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.presenceArray
            r0 = r0[r12]
            int r1 = r11.maxProbeDistance
            int r1 = r1 * 2
            int[] r2 = r11.hashArray
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L_0x001e:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0028
            int[] r0 = r11.hashArray
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0029
        L_0x0028:
            r0 = r5
        L_0x0029:
            int r4 = r4 + 1
            int r5 = r11.maxProbeDistance
            if (r4 <= r5) goto L_0x0034
            int[] r0 = r11.hashArray
            r0[r1] = r2
            goto L_0x0063
        L_0x0034:
            int[] r5 = r11.hashArray
            r7 = r5[r0]
            if (r7 != 0) goto L_0x003d
            r5[r1] = r2
            goto L_0x0063
        L_0x003d:
            if (r7 >= 0) goto L_0x0042
            r5[r1] = r6
            goto L_0x005a
        L_0x0042:
            K[] r5 = r11.keysArray
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.mo71631c(r5)
            int r5 = r5 - r0
            int[] r9 = r11.hashArray
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x005c
            r9[r1] = r7
            int[] r4 = r11.presenceArray
            r4[r8] = r1
        L_0x005a:
            r1 = r0
            r4 = r2
        L_0x005c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x001e
            int[] r0 = r11.hashArray
            r0[r1] = r6
        L_0x0063:
            int[] r0 = r11.presenceArray
            r0[r12] = r6
            int r12 = r11.size()
            int r12 = r12 + r6
            r11.size = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.mo71639e(int):void");
    }

    public final C19297b<K, V> entriesIterator$kotlin_stdlib() {
        return new C19297b<>(this);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (!(size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet()))) {
                return false;
            }
        }
        return true;
    }

    public V get(Object obj) {
        int b = mo71629b(obj);
        if (b < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C19383o.m32794d(vArr);
        return vArr[b];
    }

    public Set<Map.Entry<K, V>> getEntries() {
        C19304a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        C19304a<K, V> aVar2 = new C19304a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public Set<K> getKeys() {
        C19305b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        C19305b<K> bVar2 = new C19305b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        C19306c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        C19306c<V> cVar2 = new C19306c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public int hashCode() {
        C19297b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (entriesIterator$kotlin_stdlib.f43169c < entriesIterator$kotlin_stdlib.f43168b.length) {
                int i2 = entriesIterator$kotlin_stdlib.f43169c;
                entriesIterator$kotlin_stdlib.f43169c = i2 + 1;
                entriesIterator$kotlin_stdlib.f43170d = i2;
                Object obj = entriesIterator$kotlin_stdlib.f43168b.keysArray[entriesIterator$kotlin_stdlib.f43170d];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] access$getValuesArray$p = entriesIterator$kotlin_stdlib.f43168b.valuesArray;
                C19383o.m32794d(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[entriesIterator$kotlin_stdlib.f43170d];
                int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
                entriesIterator$kotlin_stdlib.mo71670a();
                i += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final C19300e<K, V> keysIterator$kotlin_stdlib() {
        return new C19300e<>(this);
    }

    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] vArr = this.valuesArray;
        if (vArr == null) {
            vArr = C19543e0.m33338v(this.keysArray.length);
            this.valuesArray = vArr;
        }
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
        vArr[addKey$kotlin_stdlib] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C19383o.m32797g(map, ResponseConstants.FROM);
        checkIsMutable$kotlin_stdlib();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            mo71627a(entrySet.size());
            for (Map.Entry next : entrySet) {
                int addKey$kotlin_stdlib = addKey$kotlin_stdlib(next.getKey());
                V[] vArr = this.valuesArray;
                if (vArr == null) {
                    vArr = C19543e0.m33338v(this.keysArray.length);
                    this.valuesArray = vArr;
                }
                if (addKey$kotlin_stdlib >= 0) {
                    vArr[addKey$kotlin_stdlib] = next.getValue();
                } else {
                    int i = (-addKey$kotlin_stdlib) - 1;
                    if (!C19383o.m32792b(next.getValue(), vArr[i])) {
                        vArr[i] = next.getValue();
                    }
                }
            }
        }
    }

    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C19383o.m32794d(vArr);
        V v = vArr[removeKey$kotlin_stdlib];
        vArr[removeKey$kotlin_stdlib] = null;
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        C19383o.m32797g(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int b = mo71629b(entry.getKey());
        if (b < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C19383o.m32794d(vArr);
        if (!C19383o.m32792b(vArr[b], entry.getValue())) {
            return false;
        }
        mo71639e(b);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int b = mo71629b(k);
        if (b < 0) {
            return -1;
        }
        mo71639e(b);
        return b;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        int i;
        checkIsMutable$kotlin_stdlib();
        int i2 = this.length;
        while (true) {
            i = -1;
            i2--;
            if (i2 < 0) {
                break;
            } else if (this.presenceArray[i2] >= 0) {
                V[] vArr = this.valuesArray;
                C19383o.m32794d(vArr);
                if (C19383o.m32792b(vArr[i2], v)) {
                    i = i2;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        mo71639e(i);
        return true;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C19297b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            if (entriesIterator$kotlin_stdlib.f43169c < entriesIterator$kotlin_stdlib.f43168b.length) {
                int i2 = entriesIterator$kotlin_stdlib.f43169c;
                entriesIterator$kotlin_stdlib.f43169c = i2 + 1;
                entriesIterator$kotlin_stdlib.f43170d = i2;
                Object obj = entriesIterator$kotlin_stdlib.f43168b.keysArray[entriesIterator$kotlin_stdlib.f43170d];
                if (C19383o.m32792b(obj, entriesIterator$kotlin_stdlib.f43168b)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] access$getValuesArray$p = entriesIterator$kotlin_stdlib.f43168b.valuesArray;
                C19383o.m32794d(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[entriesIterator$kotlin_stdlib.f43170d];
                if (C19383o.m32792b(obj2, entriesIterator$kotlin_stdlib.f43168b)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                entriesIterator$kotlin_stdlib.mo71670a();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "sb.toString()");
        return sb2;
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final C19301f<K, V> valuesIterator$kotlin_stdlib() {
        return new C19301f<>(this);
    }

    public MapBuilder(int i) {
        K[] v = C19543e0.m33338v(i);
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = v;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[highestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
