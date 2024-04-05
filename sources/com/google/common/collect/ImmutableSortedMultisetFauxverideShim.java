package com.google.common.collect;

import com.google.common.collect.ImmutableSortedMultiset;
import com.google.errorprone.annotations.CompatibleWith;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class ImmutableSortedMultisetFauxverideShim<E> extends ImmutableMultiset<E> {
    @Deprecated
    public static <E> ImmutableSortedMultiset.C15980a<E> builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> copyOf(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25952of(E e) {
        throw new UnsupportedOperationException();
    }

    public abstract /* synthetic */ int count(@NullableDecl @CompatibleWith("E") Object obj);

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25953of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25954of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25955of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25956of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25957of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
