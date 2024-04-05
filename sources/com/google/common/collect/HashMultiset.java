package com.google.common.collect;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    public HashMultiset(int i) {
        super(i);
    }

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public void init(int i) {
        this.backingMap = new C16191k1<>(i);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> HashMultiset<E> create(int i) {
        return new HashMultiset<>(i);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> create = create(Multisets.m26080c(iterable));
        C16201n0.m26210a(iterable, create);
        return create;
    }
}
