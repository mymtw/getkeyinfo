package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.base.C15794l;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Lists {

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final E first;
        public final E[] rest;

        public OnePlusArrayList(@NullableDecl E e, E[] eArr) {
            this.first = e;
            eArr.getClass();
            this.rest = eArr;
        }

        public E get(int i) {
            C15794l.m25616j(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }

        public int size() {
            return Ints.m26384b(((long) this.rest.length) + ((long) 1));
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        public int indexOf(@NullableDecl Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean isPartialView() {
            return false;
        }

        public int lastIndexOf(@NullableDecl Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public int size() {
            return this.string.length();
        }

        public Character get(int i) {
            C15794l.m25616j(i, size());
            return Character.valueOf(this.string.charAt(i));
        }

        public ImmutableList<Character> subList(int i, int i2) {
            C15794l.m25619m(i, i2, size());
            String substring = this.string.substring(i, i2);
            substring.getClass();
            return new StringAsImmutableList(substring);
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> fromList;
        public final C15784e<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingRandomAccessList$a */
        public class C16003a extends C16161d2<F, T> {
            public C16003a(ListIterator listIterator) {
                super(listIterator);
            }

            /* renamed from: a */
            public final T mo56891a(F f) {
                return TransformingRandomAccessList.this.function.apply(f);
            }
        }

        public TransformingRandomAccessList(List<F> list, C15784e<? super F, ? extends T> eVar) {
            list.getClass();
            this.fromList = list;
            eVar.getClass();
            this.function = eVar;
        }

        public void clear() {
            this.fromList.clear();
        }

        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new C16003a(this.fromList.listIterator(i));
        }

        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> fromList;
        public final C15784e<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingSequentialList$a */
        public class C16004a extends C16161d2<F, T> {
            public C16004a(ListIterator listIterator) {
                super(listIterator);
            }

            /* renamed from: a */
            public final T mo56891a(F f) {
                return TransformingSequentialList.this.function.apply(f);
            }
        }

        public TransformingSequentialList(List<F> list, C15784e<? super F, ? extends T> eVar) {
            list.getClass();
            this.fromList = list;
            eVar.getClass();
            this.function = eVar;
        }

        public void clear() {
            this.fromList.clear();
        }

        public ListIterator<T> listIterator(int i) {
            return new C16004a(this.fromList.listIterator(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final E first;
        public final E[] rest;
        @NullableDecl
        public final E second;

        public TwoPlusArrayList(@NullableDecl E e, @NullableDecl E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            eArr.getClass();
            this.rest = eArr;
        }

        public E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            C15794l.m25616j(i, size());
            return this.rest[i - 2];
        }

        public int size() {
            return Ints.m26384b(((long) this.rest.length) + ((long) 2));
        }
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m25992a(Iterable<? extends E> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : m25993b(iterable.iterator());
    }

    /* renamed from: b */
    public static <E> ArrayList<E> m25993b(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        Iterators.m25978a(arrayList, it);
        return arrayList;
    }
}
