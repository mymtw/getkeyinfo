package com.google.common.collect;

import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.google.common.base.C15784e;
import com.google.common.base.C15794l;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.Maps;
import com.google.common.math.C16284b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Ordering<T> implements Comparator<T> {
    public static final int LEFT_IS_GREATER = 1;
    public static final int RIGHT_IS_GREATER = -1;

    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        public final Object value;

        public IncomparableValueException(Object obj) {
            super("Cannot compare value: " + obj);
            this.value = obj;
        }
    }

    /* renamed from: com.google.common.collect.Ordering$a */
    public static class C16071a extends Ordering<Object> {

        /* renamed from: b */
        public final AtomicInteger f36106b = new AtomicInteger(0);

        /* renamed from: c */
        public final AbstractMap f36107c;

        public C16071a() {
            MapMaker mapMaker = new MapMaker();
            mapMaker.mo56935d(MapMakerInternalMap.Strength.WEAK);
            this.f36107c = (AbstractMap) mapMaker.mo56934c();
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
        /* renamed from: a */
        public final Integer mo57240a(Object obj) {
            Integer num = (Integer) this.f36107c.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f36106b.getAndIncrement());
            Integer num2 = (Integer) this.f36107c.putIfAbsent(obj, valueOf);
            return num2 != null ? num2 : valueOf;
        }

        public final int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int identityHashCode = System.identityHashCode(obj);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode != identityHashCode2) {
                return identityHashCode < identityHashCode2 ? -1 : 1;
            }
            int compareTo = mo57240a(obj).compareTo(mo57240a(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* renamed from: com.google.common.collect.Ordering$b */
    public static class C16072b {

        /* renamed from: a */
        public static final C16071a f36108a = new C16071a();
    }

    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering<Object> arbitrary() {
        return C16072b.f36108a;
    }

    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @NullableDecl T t) {
        return Collections.binarySearch(list, t, this);
    }

    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        comparator.getClass();
        return new CompoundOrdering(this, comparator);
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (((long) collection.size()) <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = max(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = min(next, it.next());
        }
        return next;
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    public <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
        return onResultOf(Maps.EntryFunction.KEY);
    }

    public <F> Ordering<F> onResultOf(C15784e<F, ? extends T> eVar) {
        return new ByFunctionOrdering(eVar, this);
    }

    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends T> java.util.List<E> sortedCopy(java.lang.Iterable<E> r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0007
            java.util.Collection r2 = (java.util.Collection) r2
            goto L_0x000f
        L_0x0007:
            java.util.Iterator r2 = r2.iterator()
            java.util.ArrayList r2 = com.google.common.collect.Lists.m25993b(r2)
        L_0x000f:
            java.lang.Object[] r2 = r2.toArray()
            java.util.Arrays.sort(r2, r1)
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.ArrayList r2 = com.google.common.collect.Lists.m25992a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Ordering.sortedCopy(java.lang.Iterable):java.util.List");
    }

    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(new Lists.OnePlusArrayList(t, tArr));
    }

    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        ordering.getClass();
        return ordering;
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return max(iterable.iterator());
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return min(iterable.iterator());
    }

    public <E extends T> E max(@NullableDecl E e, @NullableDecl E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    public <E extends T> E min(@NullableDecl E e, @NullableDecl E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    public <E extends T> E max(@NullableDecl E e, @NullableDecl E e2, @NullableDecl E e3, E... eArr) {
        E max = max(max(e, e2), e3);
        for (E max2 : eArr) {
            max = max(max, max2);
        }
        return max;
    }

    public <E extends T> E min(@NullableDecl E e, @NullableDecl E e2, @NullableDecl E e3, E... eArr) {
        E min = min(min(e, e2), e3);
        for (E min2 : eArr) {
            min = min(min, min2);
        }
        return min;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i) {
        int i2;
        int i3;
        int i4 = i;
        it.getClass();
        C16203o.m26215b(i4, "k");
        if (i4 == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i4 >= 1073741823) {
            ArrayList<E> b = Lists.m25993b(it);
            Collections.sort(b, this);
            if (b.size() > i4) {
                b.subList(i4, b.size()).clear();
            }
            b.trimToSize();
            return Collections.unmodifiableList(b);
        }
        C15794l.m25609c(i4, "k must be nonnegative, was %s", i4 >= 0);
        int i5 = i4 * 2;
        E[] eArr = new Object[i5];
        int i6 = 0;
        E e = null;
        while (it.hasNext()) {
            E next = it.next();
            if (i4 != 0) {
                if (i6 == 0) {
                    eArr[0] = next;
                    i6 = 1;
                    e = next;
                } else {
                    if (i6 < i4) {
                        i2 = i6 + 1;
                        eArr[i6] = next;
                        if (compare(next, e) > 0) {
                            e = next;
                        }
                    } else if (compare(next, e) < 0) {
                        i2 = i6 + 1;
                        eArr[i6] = next;
                        if (i2 == i5) {
                            int i7 = i5 - 1;
                            int i8 = i7 + 0;
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            if (i8 > 0) {
                                switch (C16284b.C16285a.f36381a[roundingMode.ordinal()]) {
                                    case 1:
                                        if (!(i8 > 0) || !(((i8 + -1) & i8) == 0)) {
                                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        break;
                                    case 4:
                                    case 5:
                                        i3 = 32 - Integer.numberOfLeadingZeros(i8 - 1);
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i8);
                                        i3 = (31 - numberOfLeadingZeros) + ((~(~((-1257966797 >>> numberOfLeadingZeros) - i8))) >>> 31);
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                                i3 = 31 - Integer.numberOfLeadingZeros(i8);
                                int i9 = i3 * 3;
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    if (i10 < i7) {
                                        int i13 = ((i10 + i7) + 1) >>> 1;
                                        E e2 = eArr[i13];
                                        eArr[i13] = eArr[i7];
                                        int i14 = i10;
                                        int i15 = i14;
                                        while (i14 < i7) {
                                            if (compare(eArr[i14], e2) < 0) {
                                                E e3 = eArr[i15];
                                                eArr[i15] = eArr[i14];
                                                eArr[i14] = e3;
                                                i15++;
                                            }
                                            i14++;
                                        }
                                        eArr[i7] = eArr[i15];
                                        eArr[i15] = e2;
                                        if (i15 > i4) {
                                            i7 = i15 - 1;
                                        } else if (i15 < i4) {
                                            i10 = Math.max(i15, i10 + 1);
                                            i12 = i15;
                                        }
                                        i11++;
                                        if (i11 >= i9) {
                                            Arrays.sort(eArr, i10, i7, this);
                                        }
                                    }
                                }
                                E e4 = eArr[i12];
                                e = e4;
                                for (int i16 = i12 + 1; i16 < i4; i16++) {
                                    if (compare(eArr[i16], e) > 0) {
                                        e = eArr[i16];
                                    }
                                }
                                i6 = i4;
                            } else {
                                throw new IllegalArgumentException(EtsyDialogFragment.OPT_X_BUTTON + " (" + i8 + ") must be > 0");
                            }
                        }
                    } else {
                        continue;
                    }
                    i6 = i2;
                }
            }
        }
        Arrays.sort(eArr, 0, i6, this);
        if (i6 > i4) {
            Arrays.fill(eArr, i4, i5, (Object) null);
            E e5 = eArr[i4 - 1];
        } else {
            i4 = i6;
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(eArr, i4)));
    }
}
