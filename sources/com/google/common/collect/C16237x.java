package com.google.common.collect;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* renamed from: com.google.common.collect.x */
public abstract class C16237x<T> extends C16153c0 implements Iterator<T> {
    public final boolean hasNext() {
        return ((ConcurrentHashMultiset.C15927c) this).f35838c.hasNext();
    }

    @CanIgnoreReturnValue
    public T next() {
        return ((ConcurrentHashMultiset.C15927c) this).f35838c.next();
    }
}
