package com.google.common.collect;

import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final C15954b f35904c = new C15954b(RegularImmutableList.EMPTY, 0);

    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: d */
        public final transient ImmutableList<E> f35905d;

        public ReverseImmutableList(ImmutableList<E> immutableList) {
            this.f35905d = immutableList;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f35905d.contains(obj);
        }

        public E get(int i) {
            C15794l.m25616j(i, size());
            return this.f35905d.get((size() - 1) - i);
        }

        public int indexOf(@NullableDecl Object obj) {
            int lastIndexOf = this.f35905d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return (size() - 1) - lastIndexOf;
            }
            return -1;
        }

        public boolean isPartialView() {
            return this.f35905d.isPartialView();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public int lastIndexOf(@NullableDecl Object obj) {
            int indexOf = this.f35905d.indexOf(obj);
            if (indexOf >= 0) {
                return (size() - 1) - indexOf;
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public ImmutableList<E> reverse() {
            return this.f35905d;
        }

        public int size() {
            return this.f35905d.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            C15794l.m25619m(i, i2, size());
            return this.f35905d.subList(size() - i2, size() - i).reverse();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf((E[]) this.elements);
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int length;
        public final transient int offset;

        public SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        public E get(int i) {
            C15794l.m25616j(i, this.length);
            return ImmutableList.this.get(i + this.offset);
        }

        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.offset;
        }

        public boolean isPartialView() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.length;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            C15794l.m25619m(i, i2, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C15953a<E> extends ImmutableCollection.C15949a<E> {
        public C15953a() {
            super(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final ImmutableCollection.C15950b mo56663d(Object obj) {
            mo56633b(obj);
            return this;
        }

        /* renamed from: e */
        public final ImmutableList<E> mo56664e() {
            this.f35900c = true;
            return ImmutableList.asImmutableList(this.f35898a, this.f35899b);
        }

        public C15953a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$b */
    public static class C15954b<E> extends C16140a<E> {

        /* renamed from: d */
        public final ImmutableList<E> f35906d;

        public C15954b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f35906d = immutableList;
        }

        /* renamed from: a */
        public final E mo56286a(int i) {
            return this.f35906d.get(i);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> C15953a<E> builder() {
        return new C15953a<>();
    }

    public static <E> C15953a<E> builderWithExpectedSize(int i) {
        C16203o.m26215b(i, "expectedSize");
        return new C15953a<>(i);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> asList = ((ImmutableCollection) collection).asList();
            return asList.isPartialView() ? asImmutableList(asList.toArray()) : asList;
        }
        Object[] array = collection.toArray();
        C16188j1.m26182a(array.length, array);
        return asImmutableList(array);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25826of() {
        return RegularImmutableList.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E extends java.lang.Comparable<? super E>> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.lang.Iterable<? extends E> r2) {
        /*
            r0 = 0
            java.lang.Comparable[] r0 = new java.lang.Comparable[r0]
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x000a
            java.util.Collection r2 = (java.util.Collection) r2
            goto L_0x0012
        L_0x000a:
            java.util.Iterator r2 = r2.iterator()
            java.util.ArrayList r2 = com.google.common.collect.Lists.m25993b(r2)
        L_0x0012:
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.Comparable[] r2 = (java.lang.Comparable[]) r2
            int r0 = r2.length
            com.google.common.collect.C16188j1.m26182a(r0, r2)
            java.util.Arrays.sort(r2)
            com.google.common.collect.ImmutableList r2 = asImmutableList(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.sortedCopyOf(java.lang.Iterable):com.google.common.collect.ImmutableList");
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final ImmutableList<E> asList() {
        return this;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C15791j.m25606a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object a : this) {
                    if (it.hasNext()) {
                        if (!C15791j.m25606a(a, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return m25826of();
        }
        return new RegularImmutableList(objArr, i);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableList<E> m25838of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        E[] eArr2 = eArr;
        C15794l.m25614h(eArr2.length <= 2147483635, "the total number of elements must fit in an int");
        int length = eArr2.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        C16188j1.m26182a(length, objArr);
        return asImmutableList(objArr);
    }

    public C16170f2<E> iterator() {
        return listIterator();
    }

    public ImmutableList<E> subList(int i, int i2) {
        C15794l.m25619m(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m25826of();
        }
        return subListUnchecked(i, i2);
    }

    public C16174g2<E> listIterator() {
        return listIterator(0);
    }

    public C16174g2<E> listIterator(int i) {
        C15794l.m25618l(i, size());
        if (isEmpty()) {
            return f35904c;
        }
        return new C15954b(this, i);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m25826of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m25827of(next);
        }
        C15953a aVar = new C15953a();
        aVar.mo56633b(next);
        while (it.hasNext()) {
            aVar.mo56663d(it.next());
        }
        return aVar.mo56664e();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.util.Comparator<? super E> r1, java.lang.Iterable<? extends E> r2) {
        /*
            r1.getClass()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000a
            java.util.Collection r2 = (java.util.Collection) r2
            goto L_0x0012
        L_0x000a:
            java.util.Iterator r2 = r2.iterator()
            java.util.ArrayList r2 = com.google.common.collect.Lists.m25993b(r2)
        L_0x0012:
            java.lang.Object[] r2 = r2.toArray()
            int r0 = r2.length
            com.google.common.collect.C16188j1.m26182a(r0, r2)
            java.util.Arrays.sort(r2, r1)
            com.google.common.collect.ImmutableList r1 = asImmutableList(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.sortedCopyOf(java.util.Comparator, java.lang.Iterable):com.google.common.collect.ImmutableList");
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m25826of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        C16188j1.m26182a(objArr.length, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25827of(E e) {
        Object[] objArr = {e};
        C16188j1.m26182a(1, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25828of(E e, E e2) {
        Object[] objArr = {e, e2};
        C16188j1.m26182a(2, objArr);
        return asImmutableList(objArr);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25829of(E e, E e2, E e3) {
        Object[] objArr = {e, e2, e3};
        C16188j1.m26182a(3, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25830of(E e, E e2, E e3, E e4) {
        Object[] objArr = {e, e2, e3, e4};
        C16188j1.m26182a(4, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25831of(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        C16188j1.m26182a(5, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25832of(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        C16188j1.m26182a(6, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25833of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7};
        C16188j1.m26182a(7, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25834of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        C16188j1.m26182a(8, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25835of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9};
        C16188j1.m26182a(9, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25836of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        C16188j1.m26182a(10, objArr);
        return asImmutableList(objArr);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m25837of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11};
        C16188j1.m26182a(11, objArr);
        return asImmutableList(objArr);
    }
}
