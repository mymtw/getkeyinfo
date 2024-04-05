package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.e0 */
public abstract class C16164e0<E> extends C16229v<E> implements Set<E> {
    public abstract Set<E> delegate();

    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(@NullableDecl Object obj) {
        return Sets.m26091a(this, obj);
    }

    public int standardHashCode() {
        return Sets.m26092b(this);
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        collection.getClass();
        return Sets.m26094d(this, collection);
    }
}
