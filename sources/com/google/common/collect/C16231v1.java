package com.google.common.collect;

import com.google.common.collect.C16178h1;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: com.google.common.collect.v1 */
public interface C16231v1<E> extends C16178h1, C16228u1<E> {
    Comparator<? super E> comparator();

    C16231v1<E> descendingMultiset();

    NavigableSet<E> elementSet();

    Set<C16178h1.C16179a<E>> entrySet();

    C16178h1.C16179a<E> firstEntry();

    C16231v1<E> headMultiset(E e, BoundType boundType);

    C16178h1.C16179a<E> lastEntry();

    C16178h1.C16179a<E> pollFirstEntry();

    C16178h1.C16179a<E> pollLastEntry();

    C16231v1<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    C16231v1<E> tailMultiset(E e, BoundType boundType);
}
