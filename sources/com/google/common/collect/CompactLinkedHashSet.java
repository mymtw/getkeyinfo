package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    @MonotonicNonNullDecl

    /* renamed from: f */
    public transient int[] f35830f;
    @MonotonicNonNullDecl

    /* renamed from: g */
    public transient int[] f35831g;

    /* renamed from: h */
    public transient int f35832h;

    /* renamed from: i */
    public transient int f35833i;

    public CompactLinkedHashSet() {
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i) {
        return new CompactLinkedHashSet<>(i);
    }

    public int adjustAfterRemove(int i, int i2) {
        return i == size() ? i2 : i;
    }

    public void clear() {
        super.clear();
        this.f35832h = -2;
        this.f35833i = -2;
        Arrays.fill(this.f35830f, -1);
        Arrays.fill(this.f35831g, -1);
    }

    /* renamed from: e */
    public final void mo56379e(int i, int i2) {
        if (i == -2) {
            this.f35832h = i2;
        } else {
            this.f35831g[i] = i2;
        }
        if (i2 == -2) {
            this.f35833i = i;
        } else {
            this.f35830f[i2] = i;
        }
    }

    public int firstEntryIndex() {
        return this.f35832h;
    }

    public int getSuccessor(int i) {
        return this.f35831g[i];
    }

    public void init(int i, float f) {
        super.init(i, f);
        int[] iArr = new int[i];
        this.f35830f = iArr;
        this.f35831g = new int[i];
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f35831g, -1);
        this.f35832h = -2;
        this.f35833i = -2;
    }

    public void insertEntry(int i, E e, int i2) {
        super.insertEntry(i, e, i2);
        mo56379e(this.f35833i, i);
        mo56379e(i, -2);
    }

    public void moveEntry(int i) {
        int size = size() - 1;
        super.moveEntry(i);
        mo56379e(this.f35830f[i], this.f35831g[i]);
        if (size != i) {
            mo56379e(this.f35830f[size], i);
            mo56379e(i, this.f35831g[size]);
        }
        this.f35830f[size] = -1;
        this.f35831g[size] = -1;
    }

    public void resizeEntries(int i) {
        super.resizeEntries(i);
        int[] iArr = this.f35830f;
        int length = iArr.length;
        this.f35830f = Arrays.copyOf(iArr, i);
        this.f35831g = Arrays.copyOf(this.f35831g, i);
        if (length < i) {
            Arrays.fill(this.f35830f, length, i, -1);
            Arrays.fill(this.f35831g, length, i, -1);
        }
    }

    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        C16188j1.m26183b(this, objArr);
        return objArr;
    }

    public CompactLinkedHashSet(int i) {
        super(i);
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    public <T> T[] toArray(T[] tArr) {
        return C16188j1.m26184c(this, tArr);
    }

    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }
}
