package com.google.common.collect;

import com.google.common.base.C15804s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements C15804s<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            C16203o.m26215b(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    public static final class EnumSetSupplier<V extends Enum<V>> implements C15804s<Set<V>>, Serializable {
        private final Class<V> clazz;

        public EnumSetSupplier(Class<V> cls) {
            cls.getClass();
            this.clazz = cls;
        }

        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    public static final class HashSetSupplier<V> implements C15804s<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int i) {
            C16203o.m26215b(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        public Set<V> get() {
            return CompactHashSet.createWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    public static final class LinkedHashSetSupplier<V> implements C15804s<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i) {
            C16203o.m26215b(i, "expectedValuesPerKey");
            this.expectedValuesPerKey = i;
        }

        public Set<V> get() {
            return CompactLinkedHashSet.createWithExpectedSize(this.expectedValuesPerKey);
        }
    }

    public enum LinkedListSupplier implements C15804s<List<Object>> {
        INSTANCE;

        public static <V> C15804s<List<V>> instance() {
            return INSTANCE;
        }

        public List<Object> get() {
            return new LinkedList();
        }
    }

    public static final class TreeSetSupplier<V> implements C15804s<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        public TreeSetSupplier(Comparator<? super V> comparator2) {
            comparator2.getClass();
            this.comparator = comparator2;
        }

        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$a */
    public static abstract class C16053a<K0, V0> extends MultimapBuilder<K0, V0> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$b */
    public static abstract class C16054b<K0> {
        /* renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo57170a();
    }
}
