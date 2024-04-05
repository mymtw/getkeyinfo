package com.google.common.collect;

import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.common.collect.C16147b2;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class ArrayTable<R, C, V> extends C16180i<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    /* access modifiers changed from: private */
    public final ImmutableMap<C, Integer> columnKeyToIndex;
    /* access modifiers changed from: private */
    public final ImmutableList<C> columnList;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient ArrayTable<R, C, V>.e f35789d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    public transient ArrayTable<R, C, V>.g f35790e;
    /* access modifiers changed from: private */
    public final ImmutableMap<R, Integer> rowKeyToIndex;
    /* access modifiers changed from: private */
    public final ImmutableList<R> rowList;

    /* renamed from: com.google.common.collect.ArrayTable$a */
    public class C15908a extends C16140a<C16147b2.C16148a<R, C, V>> {
        public C15908a(int i) {
            super(i, 0);
        }

        /* renamed from: a */
        public final Object mo56286a(int i) {
            return ArrayTable.access$000(ArrayTable.this, i);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$b */
    public class C15909b extends C16140a<V> {
        public C15909b(int i) {
            super(i, 0);
        }

        /* renamed from: a */
        public final V mo56286a(int i) {
            return ArrayTable.access$800(ArrayTable.this, i);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$c */
    public static abstract class C15910c<K, V> extends Maps.C16042d<K, V> {

        /* renamed from: b */
        public final ImmutableMap<K, Integer> f35793b;

        /* renamed from: com.google.common.collect.ArrayTable$c$a */
        public class C15911a extends C16140a<Map.Entry<K, V>> {
            public C15911a(int i) {
                super(i, 0);
            }

            /* renamed from: a */
            public final Object mo56286a(int i) {
                C15910c cVar = C15910c.this;
                C15794l.m25616j(i, cVar.size());
                return new C16189k(cVar, i);
            }
        }

        public C15910c(ImmutableMap immutableMap) {
            this.f35793b = immutableMap;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo56287a() {
            return new C15911a(size());
        }

        /* renamed from: b */
        public abstract String mo56288b();

        @NullableDecl
        /* renamed from: c */
        public abstract V mo56289c(int i);

        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public final boolean containsKey(@NullableDecl Object obj) {
            return this.f35793b.containsKey(obj);
        }

        @NullableDecl
        /* renamed from: d */
        public abstract V mo56292d(int i, V v);

        public final V get(@NullableDecl Object obj) {
            Integer num = this.f35793b.get(obj);
            if (num == null) {
                return null;
            }
            return mo56289c(num.intValue());
        }

        public final boolean isEmpty() {
            return this.f35793b.isEmpty();
        }

        public final Set<K> keySet() {
            return this.f35793b.keySet();
        }

        public V put(K k, V v) {
            Integer num = this.f35793b.get(k);
            if (num != null) {
                return mo56292d(num.intValue(), v);
            }
            throw new IllegalArgumentException(mo56288b() + " " + k + " not in " + this.f35793b.keySet());
        }

        public final V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return this.f35793b.size();
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$d */
    public class C15912d extends C15910c<R, V> {

        /* renamed from: c */
        public final int f35795c;

        public C15912d(int i) {
            super(ArrayTable.this.rowKeyToIndex);
            this.f35795c = i;
        }

        /* renamed from: b */
        public final String mo56288b() {
            return "Row";
        }

        /* renamed from: c */
        public final V mo56289c(int i) {
            return ArrayTable.this.mo56255at(i, this.f35795c);
        }

        /* renamed from: d */
        public final V mo56292d(int i, V v) {
            return ArrayTable.this.set(i, this.f35795c, v);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$e */
    public class C15913e extends C15910c<C, Map<R, V>> {
        public C15913e() {
            super(ArrayTable.this.columnKeyToIndex);
        }

        /* renamed from: b */
        public final String mo56288b() {
            return "Column";
        }

        /* renamed from: c */
        public final Object mo56289c(int i) {
            return new C15912d(i);
        }

        /* renamed from: d */
        public final Object mo56292d(int i, Object obj) {
            Map map = (Map) obj;
            throw new UnsupportedOperationException();
        }

        public final Object put(Object obj, Object obj2) {
            Map map = (Map) obj2;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$f */
    public class C15914f extends C15910c<C, V> {

        /* renamed from: c */
        public final int f35798c;

        public C15914f(int i) {
            super(ArrayTable.this.columnKeyToIndex);
            this.f35798c = i;
        }

        /* renamed from: b */
        public final String mo56288b() {
            return "Column";
        }

        /* renamed from: c */
        public final V mo56289c(int i) {
            return ArrayTable.this.mo56255at(this.f35798c, i);
        }

        /* renamed from: d */
        public final V mo56292d(int i, V v) {
            return ArrayTable.this.set(this.f35798c, i, v);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$g */
    public class C15915g extends C15910c<R, Map<C, V>> {
        public C15915g() {
            super(ArrayTable.this.rowKeyToIndex);
        }

        /* renamed from: b */
        public final String mo56288b() {
            return "Row";
        }

        /* renamed from: c */
        public final Object mo56289c(int i) {
            return new C15914f(i);
        }

        /* renamed from: d */
        public final Object mo56292d(int i, Object obj) {
            Map map = (Map) obj;
            throw new UnsupportedOperationException();
        }

        public final Object put(Object obj, Object obj2) {
            Map map = (Map) obj2;
            throw new UnsupportedOperationException();
        }
    }

    public ArrayTable() {
        throw null;
    }

    public ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> copyOf = ImmutableList.copyOf(iterable);
        this.rowList = copyOf;
        ImmutableList<C> copyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = copyOf2;
        C15794l.m25613g(copyOf.isEmpty() == copyOf2.isEmpty());
        this.rowKeyToIndex = Maps.m26055c(copyOf);
        this.columnKeyToIndex = Maps.m26055c(copyOf2);
        int size = copyOf.size();
        int[] iArr = new int[2];
        iArr[1] = copyOf2.size();
        iArr[0] = size;
        this.array = (Object[][]) Array.newInstance(Object.class, iArr);
        eraseAll();
    }

    public static C16147b2.C16148a access$000(ArrayTable arrayTable, int i) {
        arrayTable.getClass();
        return new C16186j(arrayTable, i);
    }

    public static Object access$800(ArrayTable arrayTable, int i) {
        return arrayTable.mo56255at(i / arrayTable.columnList.size(), i % arrayTable.columnList.size());
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* renamed from: at */
    public V mo56255at(int i, int i2) {
        C15794l.m25616j(i, this.rowList.size());
        C15794l.m25616j(i2, this.columnList.size());
        return this.array[i][i2];
    }

    public Iterator<C16147b2.C16148a<R, C, V>> cellIterator() {
        return new C15908a(size());
    }

    public Set<C16147b2.C16148a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Map<R, V> column(C c) {
        c.getClass();
        Integer num = this.columnKeyToIndex.get(c);
        return num == null ? ImmutableMap.m25853of() : new C15912d(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.e eVar = this.f35789d;
        if (eVar != null) {
            return eVar;
        }
        ArrayTable<R, C, V>.e eVar2 = new C15913e();
        this.f35789d = eVar2;
        return eVar2;
    }

    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    public boolean containsColumn(@NullableDecl Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    public boolean containsRow(@NullableDecl Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (V[] vArr : this.array) {
            for (V a : r0[r3]) {
                if (C15791j.m25606a(obj, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public V erase(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), (Object) null);
    }

    public void eraseAll() {
        for (V[] fill : this.array) {
            Arrays.fill(fill, (Object) null);
        }
    }

    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return mo56255at(num.intValue(), num2.intValue());
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @CanIgnoreReturnValue
    public V put(R r, C c, @NullableDecl V v) {
        r.getClass();
        c.getClass();
        Integer num = this.rowKeyToIndex.get(r);
        boolean z = true;
        C15794l.m25611e(r, "Row %s not in %s", this.rowList, num != null);
        Integer num2 = this.columnKeyToIndex.get(c);
        if (num2 == null) {
            z = false;
        }
        C15794l.m25611e(c, "Column %s not in %s", this.columnList, z);
        return set(num.intValue(), num2.intValue(), v);
    }

    public void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
        super.putAll(b2Var);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public Map<C, V> row(R r) {
        r.getClass();
        Integer num = this.rowKeyToIndex.get(r);
        return num == null ? ImmutableMap.m25853of() : new C15914f(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.g gVar = this.f35790e;
        if (gVar != null) {
            return gVar;
        }
        ArrayTable<R, C, V>.g gVar2 = new C15915g();
        this.f35790e = gVar2;
        return gVar2;
    }

    @CanIgnoreReturnValue
    public V set(int i, int i2, @NullableDecl V v) {
        C15794l.m25616j(i, this.rowList.size());
        C15794l.m25616j(i2, this.columnList.size());
        V[] vArr = this.array[i];
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public int size() {
        return this.columnList.size() * this.rowList.size();
    }

    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (Object[][]) Array.newInstance(cls, new int[]{this.rowList.size(), this.columnList.size()});
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = this.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Collection<V> values() {
        return super.values();
    }

    public Iterator<V> valuesIterator() {
        return new C15909b(size());
    }

    public static <R, C, V> ArrayTable<R, C, V> create(C16147b2<R, C, V> b2Var) {
        if (b2Var instanceof ArrayTable) {
            return new ArrayTable<>((ArrayTable) b2Var);
        }
        ArrayTable<R, C, V> arrayTable = new ArrayTable<>(b2Var.rowKeySet(), b2Var.columnKeySet());
        arrayTable.putAll(b2Var);
        return arrayTable;
    }

    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    public ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        int size = immutableList.size();
        int[] iArr = new int[2];
        iArr[1] = immutableList2.size();
        iArr[0] = size;
        V[][] vArr = (Object[][]) Array.newInstance(Object.class, iArr);
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = arrayTable.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }
}
