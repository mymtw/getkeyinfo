package com.google.common.collect;

abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public ImmutableList<E> createAsList() {
        return new ImmutableList<E>() {
            public E get(int i) {
                return IndexedImmutableSet.this.get(i);
            }

            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    public abstract E get(int i);

    public C16170f2<E> iterator() {
        return asList().iterator();
    }
}
