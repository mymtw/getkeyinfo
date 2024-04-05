package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p504ai.C13983i;

final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: b */
    public static final C17363a f37900b = new C17363a();
    public final Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.c entrySet;
    public final C17370f<K, V> header;
    private LinkedHashTreeMap<K, V>.d keySet;
    public int modCount;
    public int size;
    public C17370f<K, V>[] table;
    public int threshold;

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    public class C17363a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    public static final class C17364b<K, V> {

        /* renamed from: a */
        public C17370f<K, V> f37901a;

        /* renamed from: b */
        public int f37902b;

        /* renamed from: c */
        public int f37903c;

        /* renamed from: d */
        public int f37904d;

        /* renamed from: a */
        public final void mo68446a(C17370f<K, V> fVar) {
            fVar.f37913d = null;
            fVar.f37911b = null;
            fVar.f37912c = null;
            fVar.f37919j = 1;
            int i = this.f37902b;
            if (i > 0) {
                int i2 = this.f37904d;
                if ((i2 & 1) == 0) {
                    this.f37904d = i2 + 1;
                    this.f37902b = i - 1;
                    this.f37903c++;
                }
            }
            fVar.f37911b = this.f37901a;
            this.f37901a = fVar;
            int i3 = this.f37904d + 1;
            this.f37904d = i3;
            int i4 = this.f37902b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f37904d = i3 + 1;
                this.f37902b = i4 - 1;
                this.f37903c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f37904d & i6) == i6) {
                    int i7 = this.f37903c;
                    if (i7 == 0) {
                        C17370f<K, V> fVar2 = this.f37901a;
                        C17370f<K, V> fVar3 = fVar2.f37911b;
                        C17370f<K, V> fVar4 = fVar3.f37911b;
                        fVar3.f37911b = fVar4.f37911b;
                        this.f37901a = fVar3;
                        fVar3.f37912c = fVar4;
                        fVar3.f37913d = fVar2;
                        fVar3.f37919j = fVar2.f37919j + 1;
                        fVar4.f37911b = fVar3;
                        fVar2.f37911b = fVar3;
                    } else if (i7 == 1) {
                        C17370f<K, V> fVar5 = this.f37901a;
                        C17370f<K, V> fVar6 = fVar5.f37911b;
                        this.f37901a = fVar6;
                        fVar6.f37913d = fVar5;
                        fVar6.f37919j = fVar5.f37919j + 1;
                        fVar5.f37911b = fVar6;
                        this.f37903c = 0;
                    } else if (i7 == 2) {
                        this.f37903c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    public final class C17365c extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c$a */
        public class C17366a extends LinkedHashTreeMap<K, V>.e<Map.Entry<K, V>> {
            public C17366a(C17365c cVar) {
                super();
            }

            public final Object next() {
                return mo68459a();
            }
        }

        public C17365c() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C17366a(this);
        }

        public final boolean remove(Object obj) {
            C17370f findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    public final class C17367d extends AbstractSet<K> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d$a */
        public class C17368a extends LinkedHashTreeMap<K, V>.e<K> {
            public C17368a(C17367d dVar) {
                super();
            }

            public final K next() {
                return mo68459a().f37916g;
            }
        }

        public C17367d() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C17368a(this);
        }

        public final boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    public abstract class C17369e<T> implements Iterator<T> {

        /* renamed from: b */
        public C17370f<K, V> f37907b;

        /* renamed from: c */
        public C17370f<K, V> f37908c = null;

        /* renamed from: d */
        public int f37909d;

        public C17369e() {
            this.f37907b = LinkedHashTreeMap.this.header.f37914e;
            this.f37909d = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C17370f<K, V> mo68459a() {
            C17370f<K, V> fVar = this.f37907b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (fVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f37909d) {
                this.f37907b = fVar.f37914e;
                this.f37908c = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f37907b != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C17370f<K, V> fVar = this.f37908c;
            if (fVar != null) {
                LinkedHashTreeMap.this.removeInternal(fVar, true);
                this.f37908c = null;
                this.f37909d = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedHashTreeMap> cls = LinkedHashTreeMap.class;
    }

    public LinkedHashTreeMap() {
        this((Comparator) null);
    }

    public static <K, V> C17370f<K, V>[] doubleCapacity(C17370f<K, V>[] fVarArr) {
        C17370f<K, V> fVar;
        C17370f<K, V> fVar2;
        C17370f<K, V> fVar3;
        int length = fVarArr.length;
        C17370f<K, V>[] fVarArr2 = new C17370f[(length * 2)];
        C17364b bVar = new C17364b();
        C17364b bVar2 = new C17364b();
        for (int i = 0; i < length; i++) {
            C17370f<K, V> fVar4 = fVarArr[i];
            if (fVar4 != null) {
                C17370f<K, V> fVar5 = null;
                C17370f<K, V> fVar6 = null;
                for (C17370f<K, V> fVar7 = fVar4; fVar7 != null; fVar7 = fVar7.f37912c) {
                    fVar7.f37911b = fVar6;
                    fVar6 = fVar7;
                }
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (fVar6 != null) {
                        C17370f<K, V> fVar8 = fVar6.f37911b;
                        fVar6.f37911b = null;
                        C17370f<K, V> fVar9 = fVar6.f37913d;
                        while (true) {
                            C17370f<K, V> fVar10 = fVar9;
                            fVar = fVar8;
                            fVar8 = fVar10;
                            if (fVar8 == null) {
                                break;
                            }
                            fVar8.f37911b = fVar;
                            fVar9 = fVar8.f37912c;
                        }
                    } else {
                        fVar = fVar6;
                        fVar6 = null;
                    }
                    if (fVar6 == null) {
                        break;
                    }
                    if ((fVar6.f37917h & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                    fVar6 = fVar;
                }
                bVar.f37902b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
                bVar.f37904d = 0;
                bVar.f37903c = 0;
                bVar.f37901a = null;
                bVar2.f37902b = ((Integer.highestOneBit(i3) * 2) - 1) - i3;
                bVar2.f37904d = 0;
                bVar2.f37903c = 0;
                bVar2.f37901a = null;
                C17370f<K, V> fVar11 = null;
                while (fVar4 != null) {
                    fVar4.f37911b = fVar11;
                    fVar11 = fVar4;
                    fVar4 = fVar4.f37912c;
                }
                while (true) {
                    if (fVar11 != null) {
                        C17370f<K, V> fVar12 = fVar11.f37911b;
                        fVar11.f37911b = null;
                        C17370f<K, V> fVar13 = fVar11.f37913d;
                        while (true) {
                            C17370f<K, V> fVar14 = fVar13;
                            fVar2 = fVar12;
                            fVar12 = fVar14;
                            if (fVar12 == null) {
                                break;
                            }
                            fVar12.f37911b = fVar2;
                            fVar13 = fVar12.f37912c;
                        }
                    } else {
                        fVar2 = fVar11;
                        fVar11 = null;
                    }
                    if (fVar11 == null) {
                        break;
                    }
                    if ((fVar11.f37917h & length) == 0) {
                        bVar.mo68446a(fVar11);
                    } else {
                        bVar2.mo68446a(fVar11);
                    }
                    fVar11 = fVar2;
                }
                if (i2 > 0) {
                    fVar3 = bVar.f37901a;
                    if (fVar3.f37911b != null) {
                        throw new IllegalStateException();
                    }
                } else {
                    fVar3 = null;
                }
                fVarArr2[i] = fVar3;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar5 = bVar2.f37901a;
                    if (fVar5.f37911b != null) {
                        throw new IllegalStateException();
                    }
                }
                fVarArr2[i4] = fVar5;
            }
        }
        return fVarArr2;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final void mo68428a(C17370f<K, V> fVar, boolean z) {
        while (fVar != null) {
            C17370f<K, V> fVar2 = fVar.f37912c;
            C17370f<K, V> fVar3 = fVar.f37913d;
            int i = 0;
            int i2 = fVar2 != null ? fVar2.f37919j : 0;
            int i3 = fVar3 != null ? fVar3.f37919j : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C17370f<K, V> fVar4 = fVar3.f37912c;
                C17370f<K, V> fVar5 = fVar3.f37913d;
                int i5 = fVar5 != null ? fVar5.f37919j : 0;
                if (fVar4 != null) {
                    i = fVar4.f37919j;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    mo68433d(fVar3);
                }
                mo68430c(fVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C17370f<K, V> fVar6 = fVar2.f37912c;
                C17370f<K, V> fVar7 = fVar2.f37913d;
                int i7 = fVar7 != null ? fVar7.f37919j : 0;
                if (fVar6 != null) {
                    i = fVar6.f37919j;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo68430c(fVar2);
                }
                mo68433d(fVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                fVar.f37919j = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f37919j = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f37911b;
        }
    }

    /* renamed from: b */
    public final void mo68429b(C17370f<K, V> fVar, C17370f<K, V> fVar2) {
        C17370f<K, V> fVar3 = fVar.f37911b;
        fVar.f37911b = null;
        if (fVar2 != null) {
            fVar2.f37911b = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f37917h;
            C17370f<K, V>[] fVarArr = this.table;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f37912c == fVar) {
            fVar3.f37912c = fVar2;
        } else {
            fVar3.f37913d = fVar2;
        }
    }

    /* renamed from: c */
    public final void mo68430c(C17370f<K, V> fVar) {
        C17370f<K, V> fVar2 = fVar.f37912c;
        C17370f<K, V> fVar3 = fVar.f37913d;
        C17370f<K, V> fVar4 = fVar3.f37912c;
        C17370f<K, V> fVar5 = fVar3.f37913d;
        fVar.f37913d = fVar4;
        if (fVar4 != null) {
            fVar4.f37911b = fVar;
        }
        mo68429b(fVar, fVar3);
        fVar3.f37912c = fVar;
        fVar.f37911b = fVar3;
        int i = 0;
        int max = Math.max(fVar2 != null ? fVar2.f37919j : 0, fVar4 != null ? fVar4.f37919j : 0) + 1;
        fVar.f37919j = max;
        if (fVar5 != null) {
            i = fVar5.f37919j;
        }
        fVar3.f37919j = Math.max(max, i) + 1;
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C17370f<K, V> fVar = this.header;
        C17370f<K, V> fVar2 = fVar.f37914e;
        while (fVar2 != fVar) {
            C17370f<K, V> fVar3 = fVar2.f37914e;
            fVar2.f37915f = null;
            fVar2.f37914e = null;
            fVar2 = fVar3;
        }
        fVar.f37915f = fVar;
        fVar.f37914e = fVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    /* renamed from: d */
    public final void mo68433d(C17370f<K, V> fVar) {
        C17370f<K, V> fVar2 = fVar.f37912c;
        C17370f<K, V> fVar3 = fVar.f37913d;
        C17370f<K, V> fVar4 = fVar2.f37912c;
        C17370f<K, V> fVar5 = fVar2.f37913d;
        fVar.f37912c = fVar5;
        if (fVar5 != null) {
            fVar5.f37911b = fVar;
        }
        mo68429b(fVar, fVar2);
        fVar2.f37913d = fVar;
        fVar.f37911b = fVar2;
        int i = 0;
        int max = Math.max(fVar3 != null ? fVar3.f37919j : 0, fVar5 != null ? fVar5.f37919j : 0) + 1;
        fVar.f37919j = max;
        if (fVar4 != null) {
            i = fVar4.f37919j;
        }
        fVar2.f37919j = Math.max(max, i) + 1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new C17365c();
        this.entrySet = cVar2;
        return cVar2;
    }

    public C17370f<K, V> find(K k, boolean z) {
        int i;
        C17370f<K, V> fVar;
        Comparator<? super K> comparator2 = this.comparator;
        C17370f<K, V>[] fVarArr = this.table;
        int hashCode = k.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
        int length = (fVarArr.length - 1) & i3;
        C17370f<K, V> fVar2 = fVarArr[length];
        if (fVar2 != null) {
            Comparable comparable = comparator2 == f37900b ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(fVar2.f37916g) : comparator2.compare(k, fVar2.f37916g);
                if (i == 0) {
                    return fVar2;
                }
                C17370f<K, V> fVar3 = i < 0 ? fVar2.f37912c : fVar2.f37913d;
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar3;
            }
        } else {
            i = 0;
        }
        C17370f<K, V> fVar4 = fVar2;
        int i4 = i;
        if (!z) {
            return null;
        }
        C17370f<K, V> fVar5 = this.header;
        if (fVar4 != null) {
            fVar = new C17370f<>(fVar4, k, i3, fVar5, fVar5.f37915f);
            if (i4 < 0) {
                fVar4.f37912c = fVar;
            } else {
                fVar4.f37913d = fVar;
            }
            mo68428a(fVar4, true);
        } else if (comparator2 != f37900b || (k instanceof Comparable)) {
            fVar = new C17370f<>(fVar4, k, i3, fVar5, fVar5.f37915f);
            fVarArr[length] = fVar;
        } else {
            throw new ClassCastException(C13983i.m21493l(k, new StringBuilder(), " is not Comparable"));
        }
        int i5 = this.size;
        this.size = i5 + 1;
        if (i5 > this.threshold) {
            C17370f<K, V>[] doubleCapacity = doubleCapacity(this.table);
            this.table = doubleCapacity;
            this.threshold = (doubleCapacity.length / 4) + (doubleCapacity.length / 2);
        }
        this.modCount++;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.squareup.moshi.LinkedHashTreeMap.C17370f<K, V> findByEntry(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.squareup.moshi.LinkedHashTreeMap$f r0 = r4.findByObject(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f37918i
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
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.findByEntry(java.util.Map$Entry):com.squareup.moshi.LinkedHashTreeMap$f");
    }

    public C17370f<K, V> findByObject(Object obj) {
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
        C17370f findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f37918i;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new C17367d();
        this.keySet = dVar2;
        return dVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C17370f find = find(k, true);
            V v2 = find.f37918i;
            find.f37918i = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C17370f removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f37918i;
        }
        return null;
    }

    public void removeInternal(C17370f<K, V> fVar, boolean z) {
        C17370f<K, V> fVar2;
        int i;
        C17370f<K, V> fVar3;
        if (z) {
            C17370f<K, V> fVar4 = fVar.f37915f;
            fVar4.f37914e = fVar.f37914e;
            fVar.f37914e.f37915f = fVar4;
            fVar.f37915f = null;
            fVar.f37914e = null;
        }
        C17370f<K, V> fVar5 = fVar.f37912c;
        C17370f<K, V> fVar6 = fVar.f37913d;
        C17370f<K, V> fVar7 = fVar.f37911b;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                mo68429b(fVar, fVar5);
                fVar.f37912c = null;
            } else if (fVar6 != null) {
                mo68429b(fVar, fVar6);
                fVar.f37913d = null;
            } else {
                mo68429b(fVar, (C17370f<K, V>) null);
            }
            mo68428a(fVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar5.f37919j > fVar6.f37919j) {
            C17370f<K, V> fVar8 = fVar5.f37913d;
            while (true) {
                C17370f<K, V> fVar9 = fVar8;
                fVar2 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                }
                fVar8 = fVar5.f37913d;
            }
        } else {
            C17370f<K, V> fVar10 = fVar6.f37912c;
            while (true) {
                C17370f<K, V> fVar11 = fVar6;
                fVar6 = fVar10;
                fVar3 = fVar11;
                if (fVar6 == null) {
                    break;
                }
                fVar10 = fVar6.f37912c;
            }
            fVar2 = fVar3;
        }
        removeInternal(fVar2, false);
        C17370f<K, V> fVar12 = fVar.f37912c;
        if (fVar12 != null) {
            i = fVar12.f37919j;
            fVar2.f37912c = fVar12;
            fVar12.f37911b = fVar2;
            fVar.f37912c = null;
        } else {
            i = 0;
        }
        C17370f<K, V> fVar13 = fVar.f37913d;
        if (fVar13 != null) {
            i2 = fVar13.f37919j;
            fVar2.f37913d = fVar13;
            fVar13.f37911b = fVar2;
            fVar.f37913d = null;
        }
        fVar2.f37919j = Math.max(i, i2) + 1;
        mo68429b(fVar, fVar2);
    }

    public C17370f<K, V> removeInternalByKey(Object obj) {
        C17370f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? f37900b : comparator2;
        this.header = new C17370f<>();
        this.table = new C17370f[16];
        this.threshold = 12;
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    public static final class C17370f<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C17370f<K, V> f37911b;

        /* renamed from: c */
        public C17370f<K, V> f37912c;

        /* renamed from: d */
        public C17370f<K, V> f37913d;

        /* renamed from: e */
        public C17370f<K, V> f37914e;

        /* renamed from: f */
        public C17370f<K, V> f37915f;

        /* renamed from: g */
        public final K f37916g;

        /* renamed from: h */
        public final int f37917h;

        /* renamed from: i */
        public V f37918i;

        /* renamed from: j */
        public int f37919j;

        public C17370f() {
            this.f37916g = null;
            this.f37917h = -1;
            this.f37915f = this;
            this.f37914e = this;
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
                K r0 = r3.f37916g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f37918i
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
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.C17370f.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f37916g;
        }

        public final V getValue() {
            return this.f37918i;
        }

        public final int hashCode() {
            K k = this.f37916g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f37918i;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            V v2 = this.f37918i;
            this.f37918i = v;
            return v2;
        }

        public final String toString() {
            return this.f37916g + "=" + this.f37918i;
        }

        public C17370f(C17370f<K, V> fVar, K k, int i, C17370f<K, V> fVar2, C17370f<K, V> fVar3) {
            this.f37911b = fVar;
            this.f37916g = k;
            this.f37917h = i;
            this.f37919j = 1;
            this.f37914e = fVar2;
            this.f37915f = fVar3;
            fVar3.f37914e = this;
            fVar2.f37915f = this;
        }
    }
}
