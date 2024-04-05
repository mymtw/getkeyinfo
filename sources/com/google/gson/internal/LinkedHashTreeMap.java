package com.google.gson.internal;

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

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: b */
    public static final C16711a f36952b = new C16711a();
    public Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.c entrySet;
    public final C16718f<K, V> header;
    private LinkedHashTreeMap<K, V>.d keySet;
    public int modCount;
    public int size;
    public C16718f<K, V>[] table;
    public int threshold;

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$a */
    public class C16711a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$b */
    public static final class C16712b<K, V> {

        /* renamed from: a */
        public C16718f<K, V> f36953a;

        /* renamed from: b */
        public int f36954b;

        /* renamed from: c */
        public int f36955c;

        /* renamed from: d */
        public int f36956d;

        /* renamed from: a */
        public final void mo59512a(C16718f<K, V> fVar) {
            fVar.f36965d = null;
            fVar.f36963b = null;
            fVar.f36964c = null;
            fVar.f36971j = 1;
            int i = this.f36954b;
            if (i > 0) {
                int i2 = this.f36956d;
                if ((i2 & 1) == 0) {
                    this.f36956d = i2 + 1;
                    this.f36954b = i - 1;
                    this.f36955c++;
                }
            }
            fVar.f36963b = this.f36953a;
            this.f36953a = fVar;
            int i3 = this.f36956d + 1;
            this.f36956d = i3;
            int i4 = this.f36954b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f36956d = i3 + 1;
                this.f36954b = i4 - 1;
                this.f36955c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f36956d & i6) == i6) {
                    int i7 = this.f36955c;
                    if (i7 == 0) {
                        C16718f<K, V> fVar2 = this.f36953a;
                        C16718f<K, V> fVar3 = fVar2.f36963b;
                        C16718f<K, V> fVar4 = fVar3.f36963b;
                        fVar3.f36963b = fVar4.f36963b;
                        this.f36953a = fVar3;
                        fVar3.f36964c = fVar4;
                        fVar3.f36965d = fVar2;
                        fVar3.f36971j = fVar2.f36971j + 1;
                        fVar4.f36963b = fVar3;
                        fVar2.f36963b = fVar3;
                    } else if (i7 == 1) {
                        C16718f<K, V> fVar5 = this.f36953a;
                        C16718f<K, V> fVar6 = fVar5.f36963b;
                        this.f36953a = fVar6;
                        fVar6.f36965d = fVar5;
                        fVar6.f36971j = fVar5.f36971j + 1;
                        fVar5.f36963b = fVar6;
                        this.f36955c = 0;
                    } else if (i7 == 2) {
                        this.f36955c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$c */
    public final class C16713c extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedHashTreeMap$c$a */
        public class C16714a extends LinkedHashTreeMap<K, V>.e<Map.Entry<K, V>> {
            public C16714a(C16713c cVar) {
                super();
            }

            public final Object next() {
                return mo59525a();
            }
        }

        public C16713c() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C16714a(this);
        }

        public final boolean remove(Object obj) {
            C16718f findByEntry;
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

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$d */
    public final class C16715d extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedHashTreeMap$d$a */
        public class C16716a extends LinkedHashTreeMap<K, V>.e<K> {
            public C16716a(C16715d dVar) {
                super();
            }

            public final K next() {
                return mo59525a().f36968g;
            }
        }

        public C16715d() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C16716a(this);
        }

        public final boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$e */
    public abstract class C16717e<T> implements Iterator<T> {

        /* renamed from: b */
        public C16718f<K, V> f36959b;

        /* renamed from: c */
        public C16718f<K, V> f36960c = null;

        /* renamed from: d */
        public int f36961d;

        public C16717e() {
            this.f36959b = LinkedHashTreeMap.this.header.f36966e;
            this.f36961d = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C16718f<K, V> mo59525a() {
            C16718f<K, V> fVar = this.f36959b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (fVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f36961d) {
                this.f36959b = fVar.f36966e;
                this.f36960c = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f36959b != LinkedHashTreeMap.this.header;
        }

        public final void remove() {
            C16718f<K, V> fVar = this.f36960c;
            if (fVar != null) {
                LinkedHashTreeMap.this.removeInternal(fVar, true);
                this.f36960c = null;
                this.f36961d = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedHashTreeMap> cls = LinkedHashTreeMap.class;
    }

    public LinkedHashTreeMap() {
        this(f36952b);
    }

    public static <K, V> C16718f<K, V>[] doubleCapacity(C16718f<K, V>[] fVarArr) {
        C16718f<K, V> fVar;
        C16718f<K, V> fVar2;
        C16718f<K, V> fVar3;
        int length = fVarArr.length;
        C16718f<K, V>[] fVarArr2 = new C16718f[(length * 2)];
        C16712b bVar = new C16712b();
        C16712b bVar2 = new C16712b();
        for (int i = 0; i < length; i++) {
            C16718f<K, V> fVar4 = fVarArr[i];
            if (fVar4 != null) {
                C16718f<K, V> fVar5 = null;
                C16718f<K, V> fVar6 = null;
                for (C16718f<K, V> fVar7 = fVar4; fVar7 != null; fVar7 = fVar7.f36964c) {
                    fVar7.f36963b = fVar6;
                    fVar6 = fVar7;
                }
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (fVar6 != null) {
                        C16718f<K, V> fVar8 = fVar6.f36963b;
                        fVar6.f36963b = null;
                        C16718f<K, V> fVar9 = fVar6.f36965d;
                        while (true) {
                            C16718f<K, V> fVar10 = fVar9;
                            fVar = fVar8;
                            fVar8 = fVar10;
                            if (fVar8 == null) {
                                break;
                            }
                            fVar8.f36963b = fVar;
                            fVar9 = fVar8.f36964c;
                        }
                    } else {
                        fVar = fVar6;
                        fVar6 = null;
                    }
                    if (fVar6 == null) {
                        break;
                    }
                    if ((fVar6.f36969h & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                    fVar6 = fVar;
                }
                bVar.f36954b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
                bVar.f36956d = 0;
                bVar.f36955c = 0;
                bVar.f36953a = null;
                bVar2.f36954b = ((Integer.highestOneBit(i3) * 2) - 1) - i3;
                bVar2.f36956d = 0;
                bVar2.f36955c = 0;
                bVar2.f36953a = null;
                C16718f<K, V> fVar11 = null;
                while (fVar4 != null) {
                    fVar4.f36963b = fVar11;
                    fVar11 = fVar4;
                    fVar4 = fVar4.f36964c;
                }
                while (true) {
                    if (fVar11 != null) {
                        C16718f<K, V> fVar12 = fVar11.f36963b;
                        fVar11.f36963b = null;
                        C16718f<K, V> fVar13 = fVar11.f36965d;
                        while (true) {
                            C16718f<K, V> fVar14 = fVar13;
                            fVar2 = fVar12;
                            fVar12 = fVar14;
                            if (fVar12 == null) {
                                break;
                            }
                            fVar12.f36963b = fVar2;
                            fVar13 = fVar12.f36964c;
                        }
                    } else {
                        fVar2 = fVar11;
                        fVar11 = null;
                    }
                    if (fVar11 == null) {
                        break;
                    }
                    if ((fVar11.f36969h & length) == 0) {
                        bVar.mo59512a(fVar11);
                    } else {
                        bVar2.mo59512a(fVar11);
                    }
                    fVar11 = fVar2;
                }
                if (i2 > 0) {
                    fVar3 = bVar.f36953a;
                    if (fVar3.f36963b != null) {
                        throw new IllegalStateException();
                    }
                } else {
                    fVar3 = null;
                }
                fVarArr2[i] = fVar3;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar5 = bVar2.f36953a;
                    if (fVar5.f36963b != null) {
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
    public final void mo59494a(C16718f<K, V> fVar, boolean z) {
        while (fVar != null) {
            C16718f<K, V> fVar2 = fVar.f36964c;
            C16718f<K, V> fVar3 = fVar.f36965d;
            int i = 0;
            int i2 = fVar2 != null ? fVar2.f36971j : 0;
            int i3 = fVar3 != null ? fVar3.f36971j : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C16718f<K, V> fVar4 = fVar3.f36964c;
                C16718f<K, V> fVar5 = fVar3.f36965d;
                int i5 = fVar5 != null ? fVar5.f36971j : 0;
                if (fVar4 != null) {
                    i = fVar4.f36971j;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    mo59496c(fVar);
                } else {
                    mo59499d(fVar3);
                    mo59496c(fVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C16718f<K, V> fVar6 = fVar2.f36964c;
                C16718f<K, V> fVar7 = fVar2.f36965d;
                int i7 = fVar7 != null ? fVar7.f36971j : 0;
                if (fVar6 != null) {
                    i = fVar6.f36971j;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    mo59499d(fVar);
                } else {
                    mo59496c(fVar2);
                    mo59499d(fVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                fVar.f36971j = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f36971j = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f36963b;
        }
    }

    /* renamed from: b */
    public final void mo59495b(C16718f<K, V> fVar, C16718f<K, V> fVar2) {
        C16718f<K, V> fVar3 = fVar.f36963b;
        fVar.f36963b = null;
        if (fVar2 != null) {
            fVar2.f36963b = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f36969h;
            C16718f<K, V>[] fVarArr = this.table;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f36964c == fVar) {
            fVar3.f36964c = fVar2;
        } else {
            fVar3.f36965d = fVar2;
        }
    }

    /* renamed from: c */
    public final void mo59496c(C16718f<K, V> fVar) {
        C16718f<K, V> fVar2 = fVar.f36964c;
        C16718f<K, V> fVar3 = fVar.f36965d;
        C16718f<K, V> fVar4 = fVar3.f36964c;
        C16718f<K, V> fVar5 = fVar3.f36965d;
        fVar.f36965d = fVar4;
        if (fVar4 != null) {
            fVar4.f36963b = fVar;
        }
        mo59495b(fVar, fVar3);
        fVar3.f36964c = fVar;
        fVar.f36963b = fVar3;
        int i = 0;
        int max = Math.max(fVar2 != null ? fVar2.f36971j : 0, fVar4 != null ? fVar4.f36971j : 0) + 1;
        fVar.f36971j = max;
        if (fVar5 != null) {
            i = fVar5.f36971j;
        }
        fVar3.f36971j = Math.max(max, i) + 1;
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C16718f<K, V> fVar = this.header;
        C16718f<K, V> fVar2 = fVar.f36966e;
        while (fVar2 != fVar) {
            C16718f<K, V> fVar3 = fVar2.f36966e;
            fVar2.f36967f = null;
            fVar2.f36966e = null;
            fVar2 = fVar3;
        }
        fVar.f36967f = fVar;
        fVar.f36966e = fVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    /* renamed from: d */
    public final void mo59499d(C16718f<K, V> fVar) {
        C16718f<K, V> fVar2 = fVar.f36964c;
        C16718f<K, V> fVar3 = fVar.f36965d;
        C16718f<K, V> fVar4 = fVar2.f36964c;
        C16718f<K, V> fVar5 = fVar2.f36965d;
        fVar.f36964c = fVar5;
        if (fVar5 != null) {
            fVar5.f36963b = fVar;
        }
        mo59495b(fVar, fVar2);
        fVar2.f36965d = fVar;
        fVar.f36963b = fVar2;
        int i = 0;
        int max = Math.max(fVar3 != null ? fVar3.f36971j : 0, fVar5 != null ? fVar5.f36971j : 0) + 1;
        fVar.f36971j = max;
        if (fVar4 != null) {
            i = fVar4.f36971j;
        }
        fVar2.f36971j = Math.max(max, i) + 1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new C16713c();
        this.entrySet = cVar2;
        return cVar2;
    }

    public C16718f<K, V> find(K k, boolean z) {
        int i;
        C16718f<K, V> fVar;
        Comparator<? super K> comparator2 = this.comparator;
        C16718f<K, V>[] fVarArr = this.table;
        int hashCode = k.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
        int length = (fVarArr.length - 1) & i3;
        C16718f<K, V> fVar2 = fVarArr[length];
        if (fVar2 != null) {
            Comparable comparable = comparator2 == f36952b ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(fVar2.f36968g) : comparator2.compare(k, fVar2.f36968g);
                if (i == 0) {
                    return fVar2;
                }
                C16718f<K, V> fVar3 = i < 0 ? fVar2.f36964c : fVar2.f36965d;
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar3;
            }
        } else {
            i = 0;
        }
        C16718f<K, V> fVar4 = fVar2;
        int i4 = i;
        if (!z) {
            return null;
        }
        C16718f<K, V> fVar5 = this.header;
        if (fVar4 != null) {
            fVar = new C16718f<>(fVar4, k, i3, fVar5, fVar5.f36967f);
            if (i4 < 0) {
                fVar4.f36964c = fVar;
            } else {
                fVar4.f36965d = fVar;
            }
            mo59494a(fVar4, true);
        } else if (comparator2 != f36952b || (k instanceof Comparable)) {
            fVar = new C16718f<>(fVar4, k, i3, fVar5, fVar5.f36967f);
            fVarArr[length] = fVar;
        } else {
            throw new ClassCastException(C13983i.m21493l(k, new StringBuilder(), " is not Comparable"));
        }
        int i5 = this.size;
        this.size = i5 + 1;
        if (i5 > this.threshold) {
            C16718f<K, V>[] doubleCapacity = doubleCapacity(this.table);
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
    public com.google.gson.internal.LinkedHashTreeMap.C16718f<K, V> findByEntry(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.LinkedHashTreeMap$f r0 = r4.findByObject(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f36970i
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.findByEntry(java.util.Map$Entry):com.google.gson.internal.LinkedHashTreeMap$f");
    }

    public C16718f<K, V> findByObject(Object obj) {
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
        C16718f findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f36970i;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new C16715d();
        this.keySet = dVar2;
        return dVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C16718f find = find(k, true);
            V v2 = find.f36970i;
            find.f36970i = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C16718f removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f36970i;
        }
        return null;
    }

    public void removeInternal(C16718f<K, V> fVar, boolean z) {
        C16718f<K, V> fVar2;
        int i;
        C16718f<K, V> fVar3;
        if (z) {
            C16718f<K, V> fVar4 = fVar.f36967f;
            fVar4.f36966e = fVar.f36966e;
            fVar.f36966e.f36967f = fVar4;
            fVar.f36967f = null;
            fVar.f36966e = null;
        }
        C16718f<K, V> fVar5 = fVar.f36964c;
        C16718f<K, V> fVar6 = fVar.f36965d;
        C16718f<K, V> fVar7 = fVar.f36963b;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                mo59495b(fVar, fVar5);
                fVar.f36964c = null;
            } else if (fVar6 != null) {
                mo59495b(fVar, fVar6);
                fVar.f36965d = null;
            } else {
                mo59495b(fVar, (C16718f<K, V>) null);
            }
            mo59494a(fVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar5.f36971j > fVar6.f36971j) {
            C16718f<K, V> fVar8 = fVar5.f36965d;
            while (true) {
                C16718f<K, V> fVar9 = fVar8;
                fVar2 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                }
                fVar8 = fVar5.f36965d;
            }
        } else {
            C16718f<K, V> fVar10 = fVar6.f36964c;
            while (true) {
                C16718f<K, V> fVar11 = fVar6;
                fVar6 = fVar10;
                fVar3 = fVar11;
                if (fVar6 == null) {
                    break;
                }
                fVar10 = fVar6.f36964c;
            }
            fVar2 = fVar3;
        }
        removeInternal(fVar2, false);
        C16718f<K, V> fVar12 = fVar.f36964c;
        if (fVar12 != null) {
            i = fVar12.f36971j;
            fVar2.f36964c = fVar12;
            fVar12.f36963b = fVar2;
            fVar.f36964c = null;
        } else {
            i = 0;
        }
        C16718f<K, V> fVar13 = fVar.f36965d;
        if (fVar13 != null) {
            i2 = fVar13.f36971j;
            fVar2.f36965d = fVar13;
            fVar13.f36963b = fVar2;
            fVar.f36965d = null;
        }
        fVar2.f36971j = Math.max(i, i2) + 1;
        mo59495b(fVar, fVar2);
    }

    public C16718f<K, V> removeInternalByKey(Object obj) {
        C16718f<K, V> findByObject = findByObject(obj);
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
        this.comparator = comparator2 == null ? f36952b : comparator2;
        this.header = new C16718f<>();
        this.table = new C16718f[16];
        this.threshold = 12;
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$f */
    public static final class C16718f<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C16718f<K, V> f36963b;

        /* renamed from: c */
        public C16718f<K, V> f36964c;

        /* renamed from: d */
        public C16718f<K, V> f36965d;

        /* renamed from: e */
        public C16718f<K, V> f36966e;

        /* renamed from: f */
        public C16718f<K, V> f36967f;

        /* renamed from: g */
        public final K f36968g;

        /* renamed from: h */
        public final int f36969h;

        /* renamed from: i */
        public V f36970i;

        /* renamed from: j */
        public int f36971j;

        public C16718f() {
            this.f36968g = null;
            this.f36969h = -1;
            this.f36967f = this;
            this.f36966e = this;
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
                K r0 = r3.f36968g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f36970i
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.C16718f.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f36968g;
        }

        public final V getValue() {
            return this.f36970i;
        }

        public final int hashCode() {
            K k = this.f36968g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f36970i;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            V v2 = this.f36970i;
            this.f36970i = v;
            return v2;
        }

        public final String toString() {
            return this.f36968g + "=" + this.f36970i;
        }

        public C16718f(C16718f<K, V> fVar, K k, int i, C16718f<K, V> fVar2, C16718f<K, V> fVar3) {
            this.f36963b = fVar;
            this.f36968g = k;
            this.f36969h = i;
            this.f36971j = 1;
            this.f36966e = fVar2;
            this.f36967f = fVar3;
            fVar3.f36966e = this;
            fVar2.f36967f = this;
        }
    }
}
