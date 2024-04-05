package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003a2.C0015b;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final int MAX_TABLE_SIZE = 1073741824;
    @NullableDecl
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    public transient ImmutableList<E> f35949c;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf((E[]) this.elements);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$a */
    public static class C15974a<E> extends ImmutableCollection.C15949a<E> {
        @NullableDecl

        /* renamed from: d */
        public Object[] f35950d;

        /* renamed from: e */
        public int f35951e;

        public C15974a() {
            super(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C15974a<E> mo56784d(E e) {
            e.getClass();
            if (this.f35950d != null) {
                int chooseTableSize = ImmutableSet.chooseTableSize(this.f35899b);
                Object[] objArr = this.f35950d;
                if (chooseTableSize <= objArr.length) {
                    int length = objArr.length - 1;
                    int hashCode = e.hashCode();
                    int b = C16184i0.m26179b(hashCode);
                    while (true) {
                        int i = b & length;
                        Object[] objArr2 = this.f35950d;
                        Object obj = objArr2[i];
                        if (obj == null) {
                            objArr2[i] = e;
                            this.f35951e += hashCode;
                            mo56633b(e);
                            break;
                        } else if (obj.equals(e)) {
                            break;
                        } else {
                            b = i + 1;
                        }
                    }
                    return this;
                }
            }
            this.f35950d = null;
            mo56633b(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C15974a<E> mo56785e(Iterator<? extends E> it) {
            it.getClass();
            while (it.hasNext()) {
                mo56784d(it.next());
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.ImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableSet<E> mo56786f() {
            /*
                r8 = this;
                int r0 = r8.f35899b
                if (r0 == 0) goto L_0x0059
                r1 = 1
                if (r0 == r1) goto L_0x004f
                java.lang.Object[] r2 = r8.f35950d
                if (r2 == 0) goto L_0x003b
                int r0 = com.google.common.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r2 = r8.f35950d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003b
                int r0 = r8.f35899b
                java.lang.Object[] r2 = r8.f35898a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.access$000(r0, r2)
                if (r0 == 0) goto L_0x0028
                java.lang.Object[] r0 = r8.f35898a
                int r2 = r8.f35899b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                goto L_0x002a
            L_0x0028:
                java.lang.Object[] r0 = r8.f35898a
            L_0x002a:
                r3 = r0
                com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
                int r4 = r8.f35951e
                java.lang.Object[] r5 = r8.f35950d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f35899b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0049
            L_0x003b:
                int r0 = r8.f35899b
                java.lang.Object[] r2 = r8.f35898a
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m25893a(r0, r2)
                int r2 = r0.size()
                r8.f35899b = r2
            L_0x0049:
                r8.f35900c = r1
                r1 = 0
                r8.f35950d = r1
                return r0
            L_0x004f:
                java.lang.Object[] r0 = r8.f35898a
                r1 = 0
                r0 = r0[r1]
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m25895of(r0)
                return r0
            L_0x0059:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m25894of()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSet.C15974a.mo56786f():com.google.common.collect.ImmutableSet");
        }

        public C15974a(int i) {
            super(i);
            this.f35950d = new Object[ImmutableSet.chooseTableSize(i)];
        }
    }

    /* renamed from: a */
    public static <E> ImmutableSet<E> m25893a(int i, Object... objArr) {
        if (i == 0) {
            return m25894of();
        }
        boolean z = false;
        if (i == 1) {
            return m25895of(objArr[0]);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            Object obj = objArr[i3];
            if (obj != null) {
                int hashCode = obj.hashCode();
                int b = C16184i0.m26179b(hashCode);
                while (true) {
                    int i6 = b & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i5] = obj;
                        objArr2[i6] = obj;
                        i4 += hashCode;
                        i5++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        b++;
                    }
                }
                i3++;
            } else {
                throw new NullPointerException(C0015b.m88g("at index ", i3));
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            return new SingletonImmutableSet(objArr[0], i4);
        }
        if (chooseTableSize(i5) < chooseTableSize / 2) {
            return m25893a(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            z = true;
        }
        if (z) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new RegularImmutableSet(objArr, i4, objArr2, i2, i5);
    }

    public static boolean access$000(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static <E> C15974a<E> builder() {
        return new C15974a<>();
    }

    public static <E> C15974a<E> builderWithExpectedSize(int i) {
        C16203o.m26215b(i, "expectedSize");
        return new C15974a<>(i);
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C15794l.m25614h(z, "collection too large");
        return 1073741824;
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m25893a(array.length, array);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m25894of() {
        return RegularImmutableSet.EMPTY;
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f35949c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.f35949c = createAsList;
        return createAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return Sets.m26091a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Sets.m26092b(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract C16170f2<E> iterator();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m25895of(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m25896of(E e, E e2) {
        return m25893a(2, e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m25897of(E e, E e2, E e3) {
        return m25893a(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m25898of(E e, E e2, E e3, E e4) {
        return m25893a(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m25899of(E e, E e2, E e3, E e4, E e5) {
        return m25893a(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableSet<E> m25900of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C15794l.m25614h(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m25893a(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m25894of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m25895of(next);
        }
        C15974a aVar = new C15974a();
        aVar.mo56784d(next);
        aVar.mo56785e(it);
        return aVar.mo56786f();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m25894of();
        }
        if (length != 1) {
            return m25893a(eArr.length, (Object[]) eArr.clone());
        }
        return m25895of(eArr[0]);
    }
}
