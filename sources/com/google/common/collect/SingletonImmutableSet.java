package com.google.common.collect;

import androidx.appcompat.widget.C0326j;
import com.google.errorprone.annotations.concurrent.LazyInit;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    @LazyInit

    /* renamed from: d */
    public transient int f36145d;
    public final transient E element;

    public SingletonImmutableSet(E e) {
        e.getClass();
        this.element = e;
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.m25827of(this.element);
    }

    public final int hashCode() {
        int i = this.f36145d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.element.hashCode();
        this.f36145d = hashCode;
        return hashCode;
    }

    public boolean isHashCodeFast() {
        return this.f36145d != 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder k = C0326j.m866k('[');
        k.append(this.element.toString());
        k.append(']');
        return k.toString();
    }

    public C16170f2<E> iterator() {
        return new C16212q0(this.element);
    }

    public SingletonImmutableSet(E e, int i) {
        this.element = e;
        this.f36145d = i;
    }
}
