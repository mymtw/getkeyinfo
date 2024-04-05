package com.google.common.collect;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private final boolean accessOrder;

    /* renamed from: h */
    public transient int f35828h;

    /* renamed from: i */
    public transient int f35829i;
    @MonotonicNonNullDecl
    public transient long[] links;

    public CompactLinkedHashMap() {
        this(3);
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactLinkedHashMap<>(i);
    }

    public void accessEntry(int i) {
        if (this.accessOrder) {
            mo56378d((int) (this.links[i] >>> 32), getSuccessor(i));
            mo56378d(this.f35829i, i);
            mo56378d(i, -2);
            this.modCount++;
        }
    }

    public int adjustAfterRemove(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    public void clear() {
        super.clear();
        this.f35828h = -2;
        this.f35829i = -2;
    }

    /* renamed from: d */
    public final void mo56378d(int i, int i2) {
        if (i == -2) {
            this.f35828h = i2;
        } else {
            long[] jArr = this.links;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & UnsignedInteger.INT_MASK);
        }
        if (i2 == -2) {
            this.f35829i = i;
            return;
        }
        long[] jArr2 = this.links;
        jArr2[i2] = (UnsignedInteger.INT_MASK & jArr2[i2]) | (((long) i) << 32);
    }

    public int firstEntryIndex() {
        return this.f35828h;
    }

    public int getSuccessor(int i) {
        return (int) this.links[i];
    }

    public void init(int i, float f) {
        super.init(i, f);
        this.f35828h = -2;
        this.f35829i = -2;
        long[] jArr = new long[i];
        this.links = jArr;
        Arrays.fill(jArr, -1);
    }

    public void insertEntry(int i, K k, V v, int i2) {
        super.insertEntry(i, k, v, i2);
        mo56378d(this.f35829i, i);
        mo56378d(i, -2);
    }

    public void moveLastEntry(int i) {
        int size = size() - 1;
        mo56378d((int) (this.links[i] >>> 32), getSuccessor(i));
        if (i < size) {
            mo56378d((int) (this.links[size] >>> 32), i);
            mo56378d(i, getSuccessor(size));
        }
        super.moveLastEntry(i);
    }

    public void resizeEntries(int i) {
        super.resizeEntries(i);
        this.links = Arrays.copyOf(this.links, i);
    }

    public CompactLinkedHashMap(int i) {
        this(i, 1.0f, false);
    }

    public CompactLinkedHashMap(int i, float f, boolean z) {
        super(i, f);
        this.accessOrder = z;
    }
}
