package com.google.common.collect;

import com.google.common.base.C15794l;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap((int[]) null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    public final transient Object[] alternatingKeysAndValues;

    /* renamed from: f */
    public final transient int[] f36122f;

    /* renamed from: g */
    public final transient int f36123g;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: d */
        public final transient ImmutableMap<K, V> f36124d;

        /* renamed from: e */
        public final transient Object[] f36125e;

        /* renamed from: f */
        public final transient int f36126f;

        /* renamed from: g */
        public final transient int f36127g;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f36124d = immutableMap;
            this.f36125e = objArr;
            this.f36126f = i;
            this.f36127g = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f36124d.get(key));
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() {
                public boolean isPartialView() {
                    return true;
                }

                public int size() {
                    return EntrySet.this.f36127g;
                }

                public Map.Entry<K, V> get(int i) {
                    C15794l.m25616j(i, EntrySet.this.f36127g);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(EntrySet.this.f36125e[EntrySet.this.f36126f + i2], EntrySet.this.f36125e[i2 + (EntrySet.this.f36126f ^ 1)]);
                }
            };
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f36127g;
        }

        public C16170f2<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: d */
        public final transient ImmutableMap<K, ?> f36128d;

        /* renamed from: e */
        public final transient ImmutableList<K> f36129e;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f36128d = immutableMap;
            this.f36129e = immutableList;
        }

        public ImmutableList<K> asList() {
            return this.f36129e;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f36128d.get(obj) != null;
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f36128d.size();
        }

        public C16170f2<K> iterator() {
            return asList().iterator();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: d */
        public final transient Object[] f36130d;

        /* renamed from: e */
        public final transient int f36131e;

        /* renamed from: f */
        public final transient int f36132f;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.f36130d = objArr;
            this.f36131e = i;
            this.f36132f = i2;
        }

        public Object get(int i) {
            C15794l.m25616j(i, this.f36132f);
            return this.f36130d[(i * 2) + this.f36131e];
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f36132f;
        }
    }

    public RegularImmutableMap(int[] iArr, Object[] objArr, int i) {
        this.f36122f = iArr;
        this.alternatingKeysAndValues = objArr;
        this.f36123g = i;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr) {
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            C16203o.m26214a(objArr[0], objArr[1]);
            return new RegularImmutableMap<>((int[]) null, objArr, 1);
        }
        C15794l.m25618l(i, objArr.length >> 1);
        return new RegularImmutableMap<>(createHashTable(objArr, i, ImmutableSet.chooseTableSize(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] createHashTable(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.google.common.collect.C16203o.m26214a(r11, r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.google.common.collect.C16203o.m26214a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.google.common.collect.C16184i0.m26179b(r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.createHashTable(java.lang.Object[], int, int, int):int[]");
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.f36123g);
    }

    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.f36123g));
    }

    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.f36123g);
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return get(this.f36122f, this.alternatingKeysAndValues, this.f36123g, 0, obj);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f36123g;
    }

    public static Object get(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int b = C16184i0.m26179b(obj.hashCode());
            while (true) {
                int i3 = b & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                b = i3 + 1;
            }
        }
    }
}
