package com.zhuinden.simplestack;

import android.annotation.TargetApi;
import android.support.p013v4.media.C0071c;
import androidx.compose.animation.C0472h;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* renamed from: com.zhuinden.simplestack.e */
public final class C17527e<T> extends AbstractList<T> {

    /* renamed from: b */
    public final List<T> f38337b;

    /* renamed from: com.zhuinden.simplestack.e$a */
    public static class C17528a implements Iterable<Object> {

        /* renamed from: b */
        public ArrayList<Object> f38338b = new ArrayList<>();

        /* renamed from: a */
        public final <T> C17527e<T> mo68743a() {
            LinkedList linkedList = new LinkedList();
            Iterator<Object> it = this.f38338b.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next());
            }
            return new C17527e<>(linkedList);
        }

        /* renamed from: c */
        public final void mo68744c() {
            if (!this.f38338b.isEmpty()) {
                ArrayList<Object> arrayList = this.f38338b;
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException("Cannot remove element from empty builder");
        }

        public final Iterator<Object> iterator() {
            return this.f38338b.iterator();
        }
    }

    public C17527e() {
        this(Collections.emptyList());
    }

    /* renamed from: a */
    public static C17528a m29386a(List<?> list) {
        for (Object obj : list) {
            if (obj == null) {
                throw new IllegalArgumentException("Cannot provide `null` as a key!");
            }
        }
        C17528a aVar = new C17528a();
        aVar.f38338b.addAll(list);
        return aVar;
    }

    /* renamed from: e */
    public static <T> C17527e<T> m29387e(T... tArr) {
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            if (tArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Cannot provide `null` as a key!");
            }
        }
        return m29386a(Arrays.asList(tArr)).mo68743a();
    }

    public final boolean add(T t) {
        return this.f38337b.add(t);
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        return this.f38337b.addAll(i, collection);
    }

    /* renamed from: c */
    public final <K> K mo68713c(int i) {
        int size = size();
        if (size > 0) {
            int i2 = -size;
            if (i < i2 || i >= size) {
                throw new IllegalArgumentException(C0071c.m191c(C0472h.m1244g("The provided offset value [", i, "] was out of range: [", i2, "; "), size, ")"));
            }
            while (i < 0) {
                i += size;
            }
            return get(((size - 1) - (i % size)) % size);
        }
        throw new IllegalStateException("Cannot obtain elements from an uninitialized history.");
    }

    public final void clear() {
        this.f38337b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f38337b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f38337b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C17527e)) {
            return this.f38337b.equals(((C17527e) obj).f38337b);
        }
        return false;
    }

    @TargetApi(24)
    public final void forEach(Consumer<? super T> consumer) {
        this.f38337b.forEach(consumer);
    }

    public final T get(int i) {
        return this.f38337b.get(i);
    }

    public final int hashCode() {
        return this.f38337b.hashCode() + (super.hashCode() * 31);
    }

    public final int indexOf(Object obj) {
        return this.f38337b.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f38337b.isEmpty();
    }

    public final Iterator<T> iterator() {
        return this.f38337b.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f38337b.lastIndexOf(obj);
    }

    public final ListIterator<T> listIterator() {
        return this.f38337b.listIterator();
    }

    @TargetApi(24)
    public final Stream<T> parallelStream() {
        return this.f38337b.parallelStream();
    }

    public final T remove(int i) {
        return this.f38337b.remove(i);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f38337b.removeAll(collection);
    }

    @TargetApi(24)
    public final boolean removeIf(Predicate<? super T> predicate) {
        return this.f38337b.removeIf(predicate);
    }

    @TargetApi(24)
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        this.f38337b.replaceAll(unaryOperator);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f38337b.retainAll(collection);
    }

    public final T set(int i, T t) {
        return this.f38337b.set(i, t);
    }

    public final int size() {
        return this.f38337b.size();
    }

    @TargetApi(24)
    public final void sort(Comparator<? super T> comparator) {
        this.f38337b.sort(comparator);
    }

    @TargetApi(24)
    public final Spliterator<T> spliterator() {
        return this.f38337b.spliterator();
    }

    @TargetApi(24)
    public final Stream<T> stream() {
        return this.f38337b.stream();
    }

    public final List<T> subList(int i, int i2) {
        return this.f38337b.subList(i, i2);
    }

    public final Object[] toArray() {
        return this.f38337b.toArray();
    }

    public final String toString() {
        return Arrays.toString(this.f38337b.toArray());
    }

    public C17527e(List<T> list) {
        this.f38337b = Collections.unmodifiableList(new ArrayList(list));
    }

    public final void add(int i, T t) {
        this.f38337b.add(i, t);
    }

    public final boolean addAll(Collection<? extends T> collection) {
        return this.f38337b.addAll(collection);
    }

    public final ListIterator<T> listIterator(int i) {
        return this.f38337b.listIterator(i);
    }

    public final boolean remove(Object obj) {
        return this.f38337b.remove(obj);
    }

    public final <T1> T1[] toArray(T1[] t1Arr) {
        return this.f38337b.toArray(t1Arr);
    }
}
