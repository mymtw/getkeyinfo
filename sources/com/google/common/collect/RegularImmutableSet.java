package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet<Object> EMPTY = new RegularImmutableSet(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d */
    public final transient int f36135d;

    /* renamed from: e */
    public final transient int f36136e;
    public final transient Object[] elements;

    /* renamed from: f */
    public final transient int f36137f;
    public final transient Object[] table;

    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.table = objArr2;
        this.f36135d = i2;
        this.f36136e = i;
        this.f36137f = i3;
    }

    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.table;
        if (obj == null || objArr == null) {
            return false;
        }
        int c = C16184i0.m26180c(obj);
        while (true) {
            int i = c & this.f36135d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.f36137f);
        return i + this.f36137f;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.elements, this.f36137f);
    }

    public int hashCode() {
        return this.f36136e;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.f36137f;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f36137f;
    }

    public C16170f2<E> iterator() {
        return asList().iterator();
    }
}
