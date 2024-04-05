package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

/* renamed from: com.google.common.collect.o1 */
public interface C16205o1<C extends Comparable> {
    Set<Range<C>> asRanges();

    C16205o1<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(C16205o1<C> o1Var);

    C16205o1<C> subRangeSet(Range<C> range);
}
