package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER {
            public int resultIndex(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER {
            public int resultIndex(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX {
            public int resultIndex(int i) {
                return ~i;
            }
        };

        public abstract int resultIndex(int i);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT {
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT {
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT {
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER {
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE {
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return KeyPresentBehavior.FIRST_PRESENT.resultIndex(comparator, e, list, i) - 1;
            }
        };

        public abstract <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
    }

    /* renamed from: a */
    public static int m26097a(ImmutableList immutableList, C15784e eVar, @NullableDecl Comparable comparable, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return m26098b(immutableList, eVar, comparable, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    /* renamed from: b */
    public static int m26098b(ImmutableList immutableList, C15784e eVar, @NullableDecl Object obj, Ordering ordering, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        List transformingRandomAccessList = immutableList instanceof RandomAccess ? new Lists.TransformingRandomAccessList(immutableList, eVar) : new Lists.TransformingSequentialList(immutableList, eVar);
        ordering.getClass();
        keyPresentBehavior.getClass();
        keyAbsentBehavior.getClass();
        if (!(transformingRandomAccessList instanceof RandomAccess)) {
            transformingRandomAccessList = Lists.m25992a(transformingRandomAccessList);
        }
        int i = 0;
        int size = transformingRandomAccessList.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = ordering.compare(obj, transformingRandomAccessList.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return i + keyPresentBehavior.resultIndex(ordering, obj, transformingRandomAccessList.subList(i, size + 1), i2 - i);
            } else {
                i = i2 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i);
    }
}
