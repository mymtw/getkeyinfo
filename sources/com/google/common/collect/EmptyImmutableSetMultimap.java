package com.google.common.collect;

import java.util.Comparator;

class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    public static final EmptyImmutableSetMultimap INSTANCE = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.m25853of(), 0, (Comparator) null);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
