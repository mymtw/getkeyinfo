package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    /* renamed from: d */
    public final transient EnumSet<E> f35902d;
    @LazyInit

    /* renamed from: e */
    public transient int f35903e;

    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumSet<E> delegate;

        public EnumSerializedForm(EnumSet<E> enumSet) {
            this.delegate = enumSet;
        }

        public Object readResolve() {
            return new ImmutableEnumSet(this.delegate.clone());
        }
    }

    public static ImmutableSet asImmutable(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new ImmutableEnumSet(enumSet) : ImmutableSet.m25895of(C16201n0.m26212c(enumSet)) : ImmutableSet.m25894of();
    }

    public boolean contains(Object obj) {
        return this.f35902d.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).f35902d;
        }
        return this.f35902d.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).f35902d;
        }
        return this.f35902d.equals(obj);
    }

    public int hashCode() {
        int i = this.f35903e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f35902d.hashCode();
        this.f35903e = hashCode;
        return hashCode;
    }

    public boolean isEmpty() {
        return this.f35902d.isEmpty();
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f35902d.size();
    }

    public String toString() {
        return this.f35902d.toString();
    }

    public Object writeReplace() {
        return new EnumSerializedForm(this.f35902d);
    }

    public ImmutableEnumSet(EnumSet<E> enumSet) {
        this.f35902d = enumSet;
    }

    public C16170f2<E> iterator() {
        return Iterators.m25986i(this.f35902d.iterator());
    }
}
