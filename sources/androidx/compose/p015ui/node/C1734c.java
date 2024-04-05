package androidx.compose.p015ui.node;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19846a;
import p755lq.C19875a;

/* renamed from: androidx.compose.ui.node.c */
public final class C1734c<T> implements List<T>, C19875a {

    /* renamed from: b */
    public Object[] f3891b = new Object[16];

    /* renamed from: c */
    public long[] f3892c = new long[16];

    /* renamed from: d */
    public int f3893d = -1;

    /* renamed from: e */
    public int f3894e;

    /* renamed from: androidx.compose.ui.node.c$b */
    public final class C1736b implements List<T>, C19875a {

        /* renamed from: b */
        public final int f3899b;

        /* renamed from: c */
        public final int f3900c;

        public C1736b(int i, int i2) {
            this.f3899b = i;
            this.f3900c = i2;
        }

        public final void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final T get(int i) {
            return C1734c.this.f3891b[i + this.f3899b];
        }

        public final int indexOf(Object obj) {
            int i = this.f3899b;
            int i2 = this.f3900c;
            if (i > i2) {
                return -1;
            }
            while (!C19383o.m32792b(C1734c.this.f3891b[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f3899b;
        }

        public final boolean isEmpty() {
            return this.f3900c - this.f3899b == 0;
        }

        public final Iterator<T> iterator() {
            C1734c<T> cVar = C1734c.this;
            int i = this.f3899b;
            return new C1735a(i, i, this.f3900c);
        }

        public final int lastIndexOf(Object obj) {
            int i = this.f3900c;
            int i2 = this.f3899b;
            if (i2 > i) {
                return -1;
            }
            while (!C19383o.m32792b(C1734c.this.f3891b[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f3899b;
        }

        public final ListIterator<T> listIterator() {
            C1734c<T> cVar = C1734c.this;
            int i = this.f3899b;
            return new C1735a(i, i, this.f3900c);
        }

        public final T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int size() {
            return this.f3900c - this.f3899b;
        }

        public final void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final List<T> subList(int i, int i2) {
            C1734c<T> cVar = C1734c.this;
            int i3 = this.f3899b;
            return new C1736b(i + i3, i3 + i2);
        }

        public final Object[] toArray() {
            return C18263b.m30861p0(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            C19383o.m32797g(tArr, "array");
            return C18263b.m30863q0(this, tArr);
        }

        public final ListIterator<T> listIterator(int i) {
            C1734c<T> cVar = C1734c.this;
            int i2 = this.f3899b;
            return new C1735a(i + i2, i2, this.f3900c);
        }
    }

    /* renamed from: a */
    public final long mo6834a() {
        long o = C18263b.m30858o(Float.POSITIVE_INFINITY, false);
        int i = this.f3893d + 1;
        int Y = C17782b.m29859Y(this);
        if (i <= Y) {
            while (true) {
                long j = this.f3892c[i];
                if (C19382n.m32731S(j, o) < 0) {
                    o = j;
                }
                if (Float.intBitsToFloat((int) (o >> 32)) >= 0.0f || !C19382n.m32764p0(o)) {
                    if (i == Y) {
                        break;
                    }
                    i++;
                } else {
                    return o;
                }
            }
        }
        return o;
    }

    public final void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public final void mo6839c(T t, float f, boolean z, C19846a<C19394m> aVar) {
        int i = this.f3893d;
        int i2 = i + 1;
        this.f3893d = i2;
        Object[] objArr = this.f3891b;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            this.f3891b = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f3892c, length);
            C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
            this.f3892c = copyOf2;
        }
        Object[] objArr2 = this.f3891b;
        int i3 = this.f3893d;
        objArr2[i3] = t;
        this.f3892c[i3] = C18263b.m30858o(f, z);
        mo6843e();
        aVar.invoke();
        this.f3893d = i;
    }

    public final void clear() {
        this.f3893d = -1;
        mo6843e();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo6843e() {
        int i = this.f3893d + 1;
        int Y = C17782b.m29859Y(this);
        if (i <= Y) {
            while (true) {
                this.f3891b[i] = null;
                if (i == Y) {
                    break;
                }
                i++;
            }
        }
        this.f3894e = this.f3893d + 1;
    }

    public final T get(int i) {
        return this.f3891b[i];
    }

    public final int indexOf(Object obj) {
        int Y = C17782b.m29859Y(this);
        if (Y < 0) {
            return -1;
        }
        int i = 0;
        while (!C19383o.m32792b(this.f3891b[i], obj)) {
            if (i == Y) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f3894e == 0;
    }

    public final Iterator<T> iterator() {
        return new C1735a(this, 0, 7);
    }

    public final int lastIndexOf(Object obj) {
        for (int Y = C17782b.m29859Y(this); -1 < Y; Y--) {
            if (C19383o.m32792b(this.f3891b[Y], obj)) {
                return Y;
            }
        }
        return -1;
    }

    public final ListIterator<T> listIterator() {
        return new C1735a(this, 0, 7);
    }

    public final T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f3894e;
    }

    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<T> subList(int i, int i2) {
        return new C1736b(i, i2);
    }

    public final Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }

    /* renamed from: androidx.compose.ui.node.c$a */
    public final class C1735a implements ListIterator<T>, C19875a {

        /* renamed from: b */
        public int f3895b;

        /* renamed from: c */
        public final int f3896c;

        /* renamed from: d */
        public final int f3897d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1735a(C1734c cVar, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, (i2 & 4) != 0 ? cVar.f3894e : 0);
        }

        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f3895b < this.f3897d;
        }

        public final boolean hasPrevious() {
            return this.f3895b > this.f3896c;
        }

        public final T next() {
            T[] tArr = C1734c.this.f3891b;
            int i = this.f3895b;
            this.f3895b = i + 1;
            return tArr[i];
        }

        public final int nextIndex() {
            return this.f3895b - this.f3896c;
        }

        public final T previous() {
            T[] tArr = C1734c.this.f3891b;
            int i = this.f3895b - 1;
            this.f3895b = i;
            return tArr[i];
        }

        public final int previousIndex() {
            return (this.f3895b - this.f3896c) - 1;
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C1735a(int i, int i2, int i3) {
            this.f3895b = i;
            this.f3896c = i2;
            this.f3897d = i3;
        }
    }

    public final ListIterator<T> listIterator(int i) {
        return new C1735a(this, i, 6);
    }
}
