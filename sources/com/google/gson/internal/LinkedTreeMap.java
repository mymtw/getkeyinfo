package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p504ai.C13983i;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: b */
    public static final C16719a f36972b = new C16719a();
    public Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    public final C16725e<K, V> header;
    private LinkedTreeMap<K, V>.c keySet;
    public int modCount;
    public C16725e<K, V> root;
    public int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    public class C16719a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    public class C16720b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$b$a */
        public class C16721a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            public C16721a(C16720b bVar) {
                super();
            }

            public final Object next() {
                return mo59564a();
            }
        }

        public C16720b() {
        }

        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C16721a(this);
        }

        public final boolean remove(Object obj) {
            C16725e findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    public final class C16722c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$c$a */
        public class C16723a extends LinkedTreeMap<K, V>.d<K> {
            public C16723a(C16722c cVar) {
                super();
            }

            public final K next() {
                return mo59564a().f36984g;
            }
        }

        public C16722c() {
        }

        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C16723a(this);
        }

        public final boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    public abstract class C16724d<T> implements Iterator<T> {

        /* renamed from: b */
        public C16725e<K, V> f36975b;

        /* renamed from: c */
        public C16725e<K, V> f36976c = null;

        /* renamed from: d */
        public int f36977d;

        public C16724d() {
            this.f36975b = LinkedTreeMap.this.header.f36982e;
            this.f36977d = LinkedTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C16725e<K, V> mo59564a() {
            C16725e<K, V> eVar = this.f36975b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.modCount == this.f36977d) {
                this.f36975b = eVar.f36982e;
                this.f36976c = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f36975b != LinkedTreeMap.this.header;
        }

        public final void remove() {
            C16725e<K, V> eVar = this.f36976c;
            if (eVar != null) {
                LinkedTreeMap.this.removeInternal(eVar, true);
                this.f36976c = null;
                this.f36977d = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedTreeMap> cls = LinkedTreeMap.class;
    }

    public LinkedTreeMap() {
        this(f36972b);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final void mo59534a(C16725e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C16725e<K, V> eVar2 = eVar.f36980c;
            C16725e<K, V> eVar3 = eVar.f36981d;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f36986i : 0;
            int i3 = eVar3 != null ? eVar3.f36986i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C16725e<K, V> eVar4 = eVar3.f36980c;
                C16725e<K, V> eVar5 = eVar3.f36981d;
                int i5 = eVar5 != null ? eVar5.f36986i : 0;
                if (eVar4 != null) {
                    i = eVar4.f36986i;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    mo59536c(eVar);
                } else {
                    mo59539d(eVar3);
                    mo59536c(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C16725e<K, V> eVar6 = eVar2.f36980c;
                C16725e<K, V> eVar7 = eVar2.f36981d;
                int i7 = eVar7 != null ? eVar7.f36986i : 0;
                if (eVar6 != null) {
                    i = eVar6.f36986i;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    mo59539d(eVar);
                } else {
                    mo59536c(eVar2);
                    mo59539d(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f36986i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f36986i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f36979b;
        }
    }

    /* renamed from: b */
    public final void mo59535b(C16725e<K, V> eVar, C16725e<K, V> eVar2) {
        C16725e<K, V> eVar3 = eVar.f36979b;
        eVar.f36979b = null;
        if (eVar2 != null) {
            eVar2.f36979b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f36980c == eVar) {
            eVar3.f36980c = eVar2;
        } else {
            eVar3.f36981d = eVar2;
        }
    }

    /* renamed from: c */
    public final void mo59536c(C16725e<K, V> eVar) {
        C16725e<K, V> eVar2 = eVar.f36980c;
        C16725e<K, V> eVar3 = eVar.f36981d;
        C16725e<K, V> eVar4 = eVar3.f36980c;
        C16725e<K, V> eVar5 = eVar3.f36981d;
        eVar.f36981d = eVar4;
        if (eVar4 != null) {
            eVar4.f36979b = eVar;
        }
        mo59535b(eVar, eVar3);
        eVar3.f36980c = eVar;
        eVar.f36979b = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f36986i : 0, eVar4 != null ? eVar4.f36986i : 0) + 1;
        eVar.f36986i = max;
        if (eVar5 != null) {
            i = eVar5.f36986i;
        }
        eVar3.f36986i = Math.max(max, i) + 1;
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C16725e<K, V> eVar = this.header;
        eVar.f36983f = eVar;
        eVar.f36982e = eVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    /* renamed from: d */
    public final void mo59539d(C16725e<K, V> eVar) {
        C16725e<K, V> eVar2 = eVar.f36980c;
        C16725e<K, V> eVar3 = eVar.f36981d;
        C16725e<K, V> eVar4 = eVar2.f36980c;
        C16725e<K, V> eVar5 = eVar2.f36981d;
        eVar.f36980c = eVar5;
        if (eVar5 != null) {
            eVar5.f36979b = eVar;
        }
        mo59535b(eVar, eVar2);
        eVar2.f36981d = eVar;
        eVar.f36979b = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f36986i : 0, eVar5 != null ? eVar5.f36986i : 0) + 1;
        eVar.f36986i = max;
        if (eVar4 != null) {
            i = eVar4.f36986i;
        }
        eVar2.f36986i = Math.max(max, i) + 1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new C16720b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public C16725e<K, V> find(K k, boolean z) {
        int i;
        C16725e<K, V> eVar;
        Comparator<? super K> comparator2 = this.comparator;
        C16725e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == f36972b ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(eVar2.f36984g) : comparator2.compare(k, eVar2.f36984g);
                if (i == 0) {
                    return eVar2;
                }
                C16725e<K, V> eVar3 = i < 0 ? eVar2.f36980c : eVar2.f36981d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C16725e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new C16725e<>(eVar2, k, eVar4, eVar4.f36983f);
            if (i < 0) {
                eVar2.f36980c = eVar;
            } else {
                eVar2.f36981d = eVar;
            }
            mo59534a(eVar2, true);
        } else if (comparator2 != f36972b || (k instanceof Comparable)) {
            eVar = new C16725e<>(eVar2, k, eVar4, eVar4.f36983f);
            this.root = eVar;
        } else {
            throw new ClassCastException(C13983i.m21493l(k, new StringBuilder(), " is not Comparable"));
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.internal.LinkedTreeMap.C16725e<K, V> findByEntry(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.LinkedTreeMap$e r0 = r4.findByObject(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f36985h
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.findByEntry(java.util.Map$Entry):com.google.gson.internal.LinkedTreeMap$e");
    }

    public C16725e<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C16725e findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f36985h;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new C16722c();
        this.keySet = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C16725e find = find(k, true);
            V v2 = find.f36985h;
            find.f36985h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C16725e removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f36985h;
        }
        return null;
    }

    public void removeInternal(C16725e<K, V> eVar, boolean z) {
        C16725e<K, V> eVar2;
        int i;
        C16725e<K, V> eVar3;
        if (z) {
            C16725e<K, V> eVar4 = eVar.f36983f;
            eVar4.f36982e = eVar.f36982e;
            eVar.f36982e.f36983f = eVar4;
        }
        C16725e<K, V> eVar5 = eVar.f36980c;
        C16725e<K, V> eVar6 = eVar.f36981d;
        C16725e<K, V> eVar7 = eVar.f36979b;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                mo59535b(eVar, eVar5);
                eVar.f36980c = null;
            } else if (eVar6 != null) {
                mo59535b(eVar, eVar6);
                eVar.f36981d = null;
            } else {
                mo59535b(eVar, (C16725e<K, V>) null);
            }
            mo59534a(eVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar5.f36986i > eVar6.f36986i) {
            C16725e<K, V> eVar8 = eVar5.f36981d;
            while (true) {
                C16725e<K, V> eVar9 = eVar8;
                eVar2 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f36981d;
            }
        } else {
            C16725e<K, V> eVar10 = eVar6.f36980c;
            while (true) {
                C16725e<K, V> eVar11 = eVar6;
                eVar6 = eVar10;
                eVar3 = eVar11;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f36980c;
            }
            eVar2 = eVar3;
        }
        removeInternal(eVar2, false);
        C16725e<K, V> eVar12 = eVar.f36980c;
        if (eVar12 != null) {
            i = eVar12.f36986i;
            eVar2.f36980c = eVar12;
            eVar12.f36979b = eVar2;
            eVar.f36980c = null;
        } else {
            i = 0;
        }
        C16725e<K, V> eVar13 = eVar.f36981d;
        if (eVar13 != null) {
            i2 = eVar13.f36986i;
            eVar2.f36981d = eVar13;
            eVar13.f36979b = eVar2;
            eVar.f36981d = null;
        }
        eVar2.f36986i = Math.max(i, i2) + 1;
        mo59535b(eVar, eVar2);
    }

    public C16725e<K, V> removeInternalByKey(Object obj) {
        C16725e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }

    public LinkedTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.header = new C16725e<>();
        this.comparator = comparator2 == null ? f36972b : comparator2;
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$e */
    public static final class C16725e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C16725e<K, V> f36979b;

        /* renamed from: c */
        public C16725e<K, V> f36980c;

        /* renamed from: d */
        public C16725e<K, V> f36981d;

        /* renamed from: e */
        public C16725e<K, V> f36982e;

        /* renamed from: f */
        public C16725e<K, V> f36983f;

        /* renamed from: g */
        public final K f36984g;

        /* renamed from: h */
        public V f36985h;

        /* renamed from: i */
        public int f36986i;

        public C16725e() {
            this.f36984g = null;
            this.f36983f = this;
            this.f36982e = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f36984g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f36985h
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.C16725e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f36984g;
        }

        public final V getValue() {
            return this.f36985h;
        }

        public final int hashCode() {
            K k = this.f36984g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f36985h;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            V v2 = this.f36985h;
            this.f36985h = v;
            return v2;
        }

        public final String toString() {
            return this.f36984g + "=" + this.f36985h;
        }

        public C16725e(C16725e<K, V> eVar, K k, C16725e<K, V> eVar2, C16725e<K, V> eVar3) {
            this.f36979b = eVar;
            this.f36984g = k;
            this.f36986i = 1;
            this.f36982e = eVar2;
            this.f36983f = eVar3;
            eVar3.f36982e = this;
            eVar2.f36983f = this;
        }
    }
}
