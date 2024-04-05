package com.google.common.collect;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.p1 */
public interface C16210p1<R, C, V> extends C16147b2<R, C, V> {
    SortedSet<R> rowKeySet();

    SortedMap<R, Map<C, V>> rowMap();
}
