package com.airbnb.lottie.parser.moshi;

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
    public static final C4855a f11031b = new C4855a();
    public Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.c entrySet;
    public final C4862f<K, V> header;
    private LinkedHashTreeMap<K, V>.d keySet;
    public int modCount;
    public int size;
    public C4862f<K, V>[] table;
    public int threshold;

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$a */
    public class C4855a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$b */
    public static final class C4856b<K, V> {

        /* renamed from: a */
        public C4862f<K, V> f11032a;

        /* renamed from: b */
        public int f11033b;

        /* renamed from: c */
        public int f11034c;

        /* renamed from: d */
        public int f11035d;

        /* renamed from: a */
        public final void mo14659a(C4862f<K, V> fVar) {
            fVar.f11044d = null;
            fVar.f11042b = null;
            fVar.f11043c = null;
            fVar.f11050j = 1;
            int i = this.f11033b;
            if (i > 0) {
                int i2 = this.f11035d;
                if ((i2 & 1) == 0) {
                    this.f11035d = i2 + 1;
                    this.f11033b = i - 1;
                    this.f11034c++;
                }
            }
            fVar.f11042b = this.f11032a;
            this.f11032a = fVar;
            int i3 = this.f11035d + 1;
            this.f11035d = i3;
            int i4 = this.f11033b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f11035d = i3 + 1;
                this.f11033b = i4 - 1;
                this.f11034c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f11035d & i6) == i6) {
                    int i7 = this.f11034c;
                    if (i7 == 0) {
                        C4862f<K, V> fVar2 = this.f11032a;
                        C4862f<K, V> fVar3 = fVar2.f11042b;
                        C4862f<K, V> fVar4 = fVar3.f11042b;
                        fVar3.f11042b = fVar4.f11042b;
                        this.f11032a = fVar3;
                        fVar3.f11043c = fVar4;
                        fVar3.f11044d = fVar2;
                        fVar3.f11050j = fVar2.f11050j + 1;
                        fVar4.f11042b = fVar3;
                        fVar2.f11042b = fVar3;
                    } else if (i7 == 1) {
                        C4862f<K, V> fVar5 = this.f11032a;
                        C4862f<K, V> fVar6 = fVar5.f11042b;
                        this.f11032a = fVar6;
                        fVar6.f11044d = fVar5;
                        fVar6.f11050j = fVar5.f11050j + 1;
                        fVar5.f11042b = fVar6;
                        this.f11034c = 0;
                    } else if (i7 == 2) {
                        this.f11034c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$c */
    public final class C4857c extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$c$a */
        public class C4858a extends LinkedHashTreeMap<K, V>.e<Map.Entry<K, V>> {
            public C4858a(C4857c cVar) {
                super();
            }

            public final Object next() {
                return mo14672a();
            }
        }

        public C4857c() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C4858a(this);
        }

        public final boolean remove(Object obj) {
            C4862f findByEntry;
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

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d */
    public final class C4859d extends AbstractSet<K> {

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$d$a */
        public class C4860a extends LinkedHashTreeMap<K, V>.e<K> {
            public C4860a(C4859d dVar) {
                super();
            }

            public final K next() {
                return mo14672a().f11047g;
            }
        }

        public C4859d() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C4860a(this);
        }

        public final boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$e */
    public abstract class C4861e<T> implements Iterator<T> {

        /* renamed from: b */
        public C4862f<K, V> f11038b;

        /* renamed from: c */
        public C4862f<K, V> f11039c = null;

        /* renamed from: d */
        public int f11040d;

        public C4861e() {
            this.f11038b = LinkedHashTreeMap.this.header.f11045e;
            this.f11040d = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C4862f<K, V> mo14672a() {
            C4862f<K, V> fVar = this.f11038b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (fVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f11040d) {
                this.f11038b = fVar.f11045e;
                this.f11039c = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f11038b != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C4862f<K, V> fVar = this.f11039c;
            if (fVar != null) {
                LinkedHashTreeMap.this.removeInternal(fVar, true);
                this.f11039c = null;
                this.f11040d = LinkedHashTreeMap.this.modCount;
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

    public static <K, V> C4862f<K, V>[] doubleCapacity(C4862f<K, V>[] fVarArr) {
        C4862f<K, V> fVar;
        C4862f<K, V> fVar2;
        C4862f<K, V> fVar3;
        int length = fVarArr.length;
        C4862f<K, V>[] fVarArr2 = new C4862f[(length * 2)];
        C4856b bVar = new C4856b();
        C4856b bVar2 = new C4856b();
        for (int i = 0; i < length; i++) {
            C4862f<K, V> fVar4 = fVarArr[i];
            if (fVar4 != null) {
                C4862f<K, V> fVar5 = null;
                C4862f<K, V> fVar6 = null;
                for (C4862f<K, V> fVar7 = fVar4; fVar7 != null; fVar7 = fVar7.f11043c) {
                    fVar7.f11042b = fVar6;
                    fVar6 = fVar7;
                }
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (fVar6 != null) {
                        C4862f<K, V> fVar8 = fVar6.f11042b;
                        fVar6.f11042b = null;
                        C4862f<K, V> fVar9 = fVar6.f11044d;
                        while (true) {
                            C4862f<K, V> fVar10 = fVar9;
                            fVar = fVar8;
                            fVar8 = fVar10;
                            if (fVar8 == null) {
                                break;
                            }
                            fVar8.f11042b = fVar;
                            fVar9 = fVar8.f11043c;
                        }
                    } else {
                        fVar = fVar6;
                        fVar6 = null;
                    }
                    if (fVar6 == null) {
                        break;
                    }
                    if ((fVar6.f11048h & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                    fVar6 = fVar;
                }
                bVar.f11033b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
                bVar.f11035d = 0;
                bVar.f11034c = 0;
                bVar.f11032a = null;
                bVar2.f11033b = ((Integer.highestOneBit(i3) * 2) - 1) - i3;
                bVar2.f11035d = 0;
                bVar2.f11034c = 0;
                bVar2.f11032a = null;
                C4862f<K, V> fVar11 = null;
                while (fVar4 != null) {
                    fVar4.f11042b = fVar11;
                    fVar11 = fVar4;
                    fVar4 = fVar4.f11043c;
                }
                while (true) {
                    if (fVar11 != null) {
                        C4862f<K, V> fVar12 = fVar11.f11042b;
                        fVar11.f11042b = null;
                        C4862f<K, V> fVar13 = fVar11.f11044d;
                        while (true) {
                            C4862f<K, V> fVar14 = fVar13;
                            fVar2 = fVar12;
                            fVar12 = fVar14;
                            if (fVar12 == null) {
                                break;
                            }
                            fVar12.f11042b = fVar2;
                            fVar13 = fVar12.f11043c;
                        }
                    } else {
                        fVar2 = fVar11;
                        fVar11 = null;
                    }
                    if (fVar11 == null) {
                        break;
                    }
                    if ((fVar11.f11048h & length) == 0) {
                        bVar.mo14659a(fVar11);
                    } else {
                        bVar2.mo14659a(fVar11);
                    }
                    fVar11 = fVar2;
                }
                if (i2 > 0) {
                    fVar3 = bVar.f11032a;
                    if (fVar3.f11042b != null) {
                        throw new IllegalStateException();
                    }
                } else {
                    fVar3 = null;
                }
                fVarArr2[i] = fVar3;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar5 = bVar2.f11032a;
                    if (fVar5.f11042b != null) {
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
    public final void mo14641a(C4862f<K, V> fVar, boolean z) {
        while (fVar != null) {
            C4862f<K, V> fVar2 = fVar.f11043c;
            C4862f<K, V> fVar3 = fVar.f11044d;
            int i = 0;
            int i2 = fVar2 != null ? fVar2.f11050j : 0;
            int i3 = fVar3 != null ? fVar3.f11050j : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C4862f<K, V> fVar4 = fVar3.f11043c;
                C4862f<K, V> fVar5 = fVar3.f11044d;
                int i5 = fVar5 != null ? fVar5.f11050j : 0;
                if (fVar4 != null) {
                    i = fVar4.f11050j;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    mo14643c(fVar);
                } else {
                    mo14646d(fVar3);
                    mo14643c(fVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C4862f<K, V> fVar6 = fVar2.f11043c;
                C4862f<K, V> fVar7 = fVar2.f11044d;
                int i7 = fVar7 != null ? fVar7.f11050j : 0;
                if (fVar6 != null) {
                    i = fVar6.f11050j;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    mo14646d(fVar);
                } else {
                    mo14643c(fVar2);
                    mo14646d(fVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                fVar.f11050j = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f11050j = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f11042b;
        }
    }

    /* renamed from: b */
    public final void mo14642b(C4862f<K, V> fVar, C4862f<K, V> fVar2) {
        C4862f<K, V> fVar3 = fVar.f11042b;
        fVar.f11042b = null;
        if (fVar2 != null) {
            fVar2.f11042b = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f11048h;
            C4862f<K, V>[] fVarArr = this.table;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f11043c == fVar) {
            fVar3.f11043c = fVar2;
        } else {
            fVar3.f11044d = fVar2;
        }
    }

    /* renamed from: c */
    public final void mo14643c(C4862f<K, V> fVar) {
        C4862f<K, V> fVar2 = fVar.f11043c;
        C4862f<K, V> fVar3 = fVar.f11044d;
        C4862f<K, V> fVar4 = fVar3.f11043c;
        C4862f<K, V> fVar5 = fVar3.f11044d;
        fVar.f11044d = fVar4;
        if (fVar4 != null) {
            fVar4.f11042b = fVar;
        }
        mo14642b(fVar, fVar3);
        fVar3.f11043c = fVar;
        fVar.f11042b = fVar3;
        int i = 0;
        int max = Math.max(fVar2 != null ? fVar2.f11050j : 0, fVar4 != null ? fVar4.f11050j : 0) + 1;
        fVar.f11050j = max;
        if (fVar5 != null) {
            i = fVar5.f11050j;
        }
        fVar3.f11050j = Math.max(max, i) + 1;
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C4862f<K, V> fVar = this.header;
        C4862f<K, V> fVar2 = fVar.f11045e;
        while (fVar2 != fVar) {
            C4862f<K, V> fVar3 = fVar2.f11045e;
            fVar2.f11046f = null;
            fVar2.f11045e = null;
            fVar2 = fVar3;
        }
        fVar.f11046f = fVar;
        fVar.f11045e = fVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    /* renamed from: d */
    public final void mo14646d(C4862f<K, V> fVar) {
        C4862f<K, V> fVar2 = fVar.f11043c;
        C4862f<K, V> fVar3 = fVar.f11044d;
        C4862f<K, V> fVar4 = fVar2.f11043c;
        C4862f<K, V> fVar5 = fVar2.f11044d;
        fVar.f11043c = fVar5;
        if (fVar5 != null) {
            fVar5.f11042b = fVar;
        }
        mo14642b(fVar, fVar2);
        fVar2.f11044d = fVar;
        fVar.f11042b = fVar2;
        int i = 0;
        int max = Math.max(fVar3 != null ? fVar3.f11050j : 0, fVar5 != null ? fVar5.f11050j : 0) + 1;
        fVar.f11050j = max;
        if (fVar4 != null) {
            i = fVar4.f11050j;
        }
        fVar2.f11050j = Math.max(max, i) + 1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new C4857c();
        this.entrySet = cVar2;
        return cVar2;
    }

    public C4862f<K, V> find(K k, boolean z) {
        int i;
        C4862f<K, V> fVar;
        Comparator<? super K> comparator2 = this.comparator;
        C4862f<K, V>[] fVarArr = this.table;
        int hashCode = k.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
        int length = (fVarArr.length - 1) & i3;
        C4862f<K, V> fVar2 = fVarArr[length];
        if (fVar2 != null) {
            Comparable comparable = comparator2 == f11031b ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(fVar2.f11047g) : comparator2.compare(k, fVar2.f11047g);
                if (i == 0) {
                    return fVar2;
                }
                C4862f<K, V> fVar3 = i < 0 ? fVar2.f11043c : fVar2.f11044d;
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar3;
            }
        } else {
            i = 0;
        }
        C4862f<K, V> fVar4 = fVar2;
        int i4 = i;
        if (!z) {
            return null;
        }
        C4862f<K, V> fVar5 = this.header;
        if (fVar4 != null) {
            fVar = new C4862f<>(fVar4, k, i3, fVar5, fVar5.f11046f);
            if (i4 < 0) {
                fVar4.f11043c = fVar;
            } else {
                fVar4.f11044d = fVar;
            }
            mo14641a(fVar4, true);
        } else if (comparator2 != f11031b || (k instanceof Comparable)) {
            fVar = new C4862f<>(fVar4, k, i3, fVar5, fVar5.f11046f);
            fVarArr[length] = fVar;
        } else {
            throw new ClassCastException(C13983i.m21493l(k, new StringBuilder(), " is not Comparable"));
        }
        int i5 = this.size;
        this.size = i5 + 1;
        if (i5 > this.threshold) {
            C4862f<K, V>[] doubleCapacity = doubleCapacity(this.table);
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
    public com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.C4862f<K, V> findByEntry(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$f r0 = r4.findByObject(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f11049i
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.findByEntry(java.util.Map$Entry):com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$f");
    }

    public C4862f<K, V> findByObject(Object obj) {
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
        C4862f findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f11049i;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new C4859d();
        this.keySet = dVar2;
        return dVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C4862f find = find(k, true);
            V v2 = find.f11049i;
            find.f11049i = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C4862f removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f11049i;
        }
        return null;
    }

    public void removeInternal(C4862f<K, V> fVar, boolean z) {
        C4862f<K, V> fVar2;
        int i;
        C4862f<K, V> fVar3;
        if (z) {
            C4862f<K, V> fVar4 = fVar.f11046f;
            fVar4.f11045e = fVar.f11045e;
            fVar.f11045e.f11046f = fVar4;
            fVar.f11046f = null;
            fVar.f11045e = null;
        }
        C4862f<K, V> fVar5 = fVar.f11043c;
        C4862f<K, V> fVar6 = fVar.f11044d;
        C4862f<K, V> fVar7 = fVar.f11042b;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                mo14642b(fVar, fVar5);
                fVar.f11043c = null;
            } else if (fVar6 != null) {
                mo14642b(fVar, fVar6);
                fVar.f11044d = null;
            } else {
                mo14642b(fVar, (C4862f<K, V>) null);
            }
            mo14641a(fVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar5.f11050j > fVar6.f11050j) {
            C4862f<K, V> fVar8 = fVar5.f11044d;
            while (true) {
                C4862f<K, V> fVar9 = fVar8;
                fVar2 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                }
                fVar8 = fVar5.f11044d;
            }
        } else {
            C4862f<K, V> fVar10 = fVar6.f11043c;
            while (true) {
                C4862f<K, V> fVar11 = fVar6;
                fVar6 = fVar10;
                fVar3 = fVar11;
                if (fVar6 == null) {
                    break;
                }
                fVar10 = fVar6.f11043c;
            }
            fVar2 = fVar3;
        }
        removeInternal(fVar2, false);
        C4862f<K, V> fVar12 = fVar.f11043c;
        if (fVar12 != null) {
            i = fVar12.f11050j;
            fVar2.f11043c = fVar12;
            fVar12.f11042b = fVar2;
            fVar.f11043c = null;
        } else {
            i = 0;
        }
        C4862f<K, V> fVar13 = fVar.f11044d;
        if (fVar13 != null) {
            i2 = fVar13.f11050j;
            fVar2.f11044d = fVar13;
            fVar13.f11042b = fVar2;
            fVar.f11044d = null;
        }
        fVar2.f11050j = Math.max(i, i2) + 1;
        mo14642b(fVar, fVar2);
    }

    public C4862f<K, V> removeInternalByKey(Object obj) {
        C4862f<K, V> findByObject = findByObject(obj);
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
        this.comparator = comparator2 == null ? f11031b : comparator2;
        this.header = new C4862f<>();
        this.table = new C4862f[16];
        this.threshold = 12;
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$f */
    public static final class C4862f<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C4862f<K, V> f11042b;

        /* renamed from: c */
        public C4862f<K, V> f11043c;

        /* renamed from: d */
        public C4862f<K, V> f11044d;

        /* renamed from: e */
        public C4862f<K, V> f11045e;

        /* renamed from: f */
        public C4862f<K, V> f11046f;

        /* renamed from: g */
        public final K f11047g;

        /* renamed from: h */
        public final int f11048h;

        /* renamed from: i */
        public V f11049i;

        /* renamed from: j */
        public int f11050j;

        public C4862f() {
            this.f11047g = null;
            this.f11048h = -1;
            this.f11046f = this;
            this.f11045e = this;
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
                K r0 = r3.f11047g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f11049i
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
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.C4862f.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f11047g;
        }

        public final V getValue() {
            return this.f11049i;
        }

        public final int hashCode() {
            K k = this.f11047g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f11049i;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            V v2 = this.f11049i;
            this.f11049i = v;
            return v2;
        }

        public final String toString() {
            return this.f11047g + "=" + this.f11049i;
        }

        public C4862f(C4862f<K, V> fVar, K k, int i, C4862f<K, V> fVar2, C4862f<K, V> fVar3) {
            this.f11042b = fVar;
            this.f11047g = k;
            this.f11048h = i;
            this.f11050j = 1;
            this.f11045e = fVar2;
            this.f11046f = fVar3;
            fVar3.f11045e = this;
            fVar2.f11046f = this;
        }
    }
}
