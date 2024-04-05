package kotlin.collections.builders;

import android.support.p013v4.media.session.C0087d;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.C19289b;
import kotlin.collections.C19310d;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p755lq.C19875a;

public final class ListBuilder<E> extends C19310d<E> implements RandomAccess, Serializable {
    /* access modifiers changed from: private */
    public E[] array;
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public int offset;
    private final ListBuilder<E> root;

    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    public static final class C19295a<E> implements ListIterator<E>, C19875a {

        /* renamed from: b */
        public final ListBuilder<E> f43163b;

        /* renamed from: c */
        public int f43164c;

        /* renamed from: d */
        public int f43165d = -1;

        public C19295a(ListBuilder<E> listBuilder, int i) {
            C19383o.m32797g(listBuilder, ResponseConstants.LIST);
            this.f43163b = listBuilder;
            this.f43164c = i;
        }

        public final void add(E e) {
            ListBuilder<E> listBuilder = this.f43163b;
            int i = this.f43164c;
            this.f43164c = i + 1;
            listBuilder.add(i, e);
            this.f43165d = -1;
        }

        public final boolean hasNext() {
            return this.f43164c < this.f43163b.length;
        }

        public final boolean hasPrevious() {
            return this.f43164c > 0;
        }

        public final E next() {
            if (this.f43164c < this.f43163b.length) {
                int i = this.f43164c;
                this.f43164c = i + 1;
                this.f43165d = i;
                return this.f43163b.array[this.f43163b.offset + this.f43165d];
            }
            throw new NoSuchElementException();
        }

        public final int nextIndex() {
            return this.f43164c;
        }

        public final E previous() {
            int i = this.f43164c;
            if (i > 0) {
                int i2 = i - 1;
                this.f43164c = i2;
                this.f43165d = i2;
                return this.f43163b.array[this.f43163b.offset + this.f43165d];
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f43164c - 1;
        }

        public final void remove() {
            int i = this.f43165d;
            if (i != -1) {
                this.f43163b.remove(i);
                this.f43164c = this.f43165d;
                this.f43165d = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public final void set(E e) {
            int i = this.f43165d;
            if (i != -1) {
                this.f43163b.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2.root;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object writeReplace() {
        /*
            r2 = this;
            boolean r0 = r2.isReadOnly
            r1 = 0
            if (r0 != 0) goto L_0x0010
            kotlin.collections.builders.ListBuilder<E> r0 = r2.root
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isReadOnly
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0019
            kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
            r0.<init>(r2, r1)
            return r0
        L_0x0019:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The list cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.writeReplace():java.lang.Object");
    }

    /* renamed from: a */
    public final void mo71590a(int i, Collection<? extends E> collection, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo71590a(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        mo71599g(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    public boolean add(E e) {
        mo71597e();
        mo71595c(this.offset + this.length, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        mo71597e();
        int size = collection.size();
        mo71590a(this.offset + this.length, collection, size);
        return size > 0;
    }

    public final List<E> build() {
        if (this.backing == null) {
            mo71597e();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final void mo71595c(int i, E e) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo71595c(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        mo71599g(i, 1);
        this.array[i] = e;
    }

    public void clear() {
        mo71597e();
        mo71609m(this.offset, this.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.root;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71597e() {
        /*
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L_0x000f
            kotlin.collections.builders.ListBuilder<E> r0 = r1.root
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.isReadOnly
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.mo71597e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == r8) goto L_0x0030
            boolean r2 = r9 instanceof java.util.List
            if (r2 == 0) goto L_0x0031
            java.util.List r9 = (java.util.List) r9
            E[] r2 = r8.array
            int r3 = r8.offset
            int r4 = r8.length
            int r5 = r9.size()
            if (r4 == r5) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            r5 = r0
        L_0x0018:
            if (r5 >= r4) goto L_0x002d
            int r6 = r3 + r5
            r6 = r2[r6]
            java.lang.Object r7 = r9.get(r5)
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r7)
            if (r6 != 0) goto L_0x002a
        L_0x0028:
            r9 = r0
            goto L_0x002e
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            r9 = r1
        L_0x002e:
            if (r9 == 0) goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.equals(java.lang.Object):boolean");
    }

    /* renamed from: g */
    public final void mo71599g(int i, int i2) {
        int i3 = this.length + i2;
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i3 >= 0) {
            E[] eArr = this.array;
            if (i3 > eArr.length) {
                int length2 = eArr.length;
                int i4 = length2 + (length2 >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    i4 = i3 > 2147483639 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 2147483639;
                }
                E[] copyOf = Arrays.copyOf(eArr, i4);
                C19383o.m32796f(copyOf, "copyOf(this, newSize)");
                this.array = copyOf;
            }
            E[] eArr2 = this.array;
            C19318k.m32603U0(eArr2, i + i2, eArr2, i, this.offset + this.length);
            this.length += i2;
        } else {
            throw new OutOfMemoryError();
        }
    }

    public E get(int i) {
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return this.array[this.offset + i];
        }
        throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
    }

    public int getSize() {
        return this.length;
    }

    public int hashCode() {
        E[] eArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            E e = eArr[i + i4];
            i3 = (i3 * 31) + (e != null ? e.hashCode() : 0);
        }
        return i3;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (C19383o.m32792b(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Iterator<E> iterator() {
        return new C19295a(this, 0);
    }

    /* renamed from: l */
    public final E mo71605l(int i) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.mo71605l(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        C19318k.m32603U0(eArr, i, eArr, i + 1, this.offset + this.length);
        E[] eArr2 = this.array;
        C19383o.m32797g(eArr2, "<this>");
        eArr2[(this.offset + this.length) - 1] = null;
        this.length--;
        return e;
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (C19383o.m32792b(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C19295a(this, 0);
    }

    /* renamed from: m */
    public final void mo71609m(int i, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo71609m(i, i2);
        } else {
            E[] eArr = this.array;
            C19318k.m32603U0(eArr, i, eArr, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            C19543e0.m33314g0(i3 - i2, i3, eArr2);
        }
        this.length -= i2;
    }

    /* renamed from: n */
    public final int mo71610n(int i, int i2, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int n = listBuilder.mo71610n(i, i2, collection, z);
            this.length -= n;
            return n;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        C19318k.m32603U0(eArr2, i + i4, eArr2, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        C19543e0.m33314g0(i7 - i6, i7, eArr3);
        this.length -= i6;
        return i6;
    }

    public boolean remove(Object obj) {
        mo71597e();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        mo71597e();
        return mo71610n(this.offset, this.length, collection, false) > 0;
    }

    public E removeAt(int i) {
        mo71597e();
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return mo71605l(this.offset + i);
        }
        throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        mo71597e();
        return mo71610n(this.offset, this.length, collection, true) > 0;
    }

    public E set(int i, E e) {
        mo71597e();
        int i2 = this.length;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
        }
        E[] eArr = this.array;
        int i3 = this.offset;
        E e2 = eArr[i3 + i];
        eArr[i3 + i] = e;
        return e2;
    }

    public List<E> subList(int i, int i2) {
        C19289b.C19290a.m32556a(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        ListBuilder<E> listBuilder = this.root;
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder == null ? this : listBuilder);
    }

    public <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "destination");
        int length2 = tArr.length;
        int i = this.length;
        if (length2 < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C19383o.m32796f(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.array;
        C19383o.m32795e(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.offset;
        C19318k.m32603U0(eArr2, 0, tArr, i3, this.length + i3);
        int length3 = tArr.length;
        int i4 = this.length;
        if (length3 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public String toString() {
        E[] eArr = this.array;
        int i = this.offset;
        int i2 = this.length;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "sb.toString()");
        return sb2;
    }

    public ListIterator<E> listIterator(int i) {
        int i2 = this.length;
        if (i >= 0 && i <= i2) {
            return new C19295a(this, i);
        }
        throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
    }

    public void add(int i, E e) {
        mo71597e();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
        }
        mo71595c(this.offset + i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        mo71597e();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
        }
        int size = collection.size();
        mo71590a(this.offset + i, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        return C19318k.m32608Z0(i, this.length + i, eArr);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(C19543e0.m33338v(i), 0, 0, false, (ListBuilder) null, (ListBuilder) null);
    }
}
