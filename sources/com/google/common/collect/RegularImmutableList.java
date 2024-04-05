package com.google.common.collect;

import com.google.common.base.C15794l;

class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> EMPTY = new RegularImmutableList(new Object[0], 0);
    public final transient Object[] array;

    /* renamed from: d */
    public final transient int f36121d;

    public RegularImmutableList(Object[] objArr, int i) {
        this.array = objArr;
        this.f36121d = i;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.f36121d);
        return i + this.f36121d;
    }

    public E get(int i) {
        C15794l.m25616j(i, this.f36121d);
        return this.array[i];
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.f36121d;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f36121d;
    }
}
