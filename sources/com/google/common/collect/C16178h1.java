package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.h1 */
public interface C16178h1<E> extends Collection<E> {

    /* renamed from: com.google.common.collect.h1$a */
    public interface C16179a<E> {
        int getCount();

        E getElement();

        String toString();
    }

    @CanIgnoreReturnValue
    int add(@NullableDecl E e, int i);

    boolean contains(@NullableDecl Object obj);

    boolean containsAll(Collection<?> collection);

    int count(@NullableDecl @CompatibleWith("E") Object obj);

    Set<E> elementSet();

    Set<C16179a<E>> entrySet();

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    int remove(@NullableDecl @CompatibleWith("E") Object obj, int i);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    int setCount(E e, int i);

    @CanIgnoreReturnValue
    boolean setCount(E e, int i, int i2);

    int size();
}
