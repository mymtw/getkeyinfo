package p219r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19875a;

/* renamed from: r.c */
public final class C7731c<T> implements Set<T>, C19875a {

    /* renamed from: b */
    public int f17147b;

    /* renamed from: c */
    public Object[] f17148c = new Object[16];

    /* renamed from: r.c$a */
    public static final class C7732a implements Iterator<T>, C19875a {

        /* renamed from: b */
        public int f17149b;

        /* renamed from: c */
        public final /* synthetic */ C7731c<T> f17150c;

        public C7732a(C7731c<T> cVar) {
            this.f17150c = cVar;
        }

        public final boolean hasNext() {
            return this.f17149b < this.f17150c.f17147b;
        }

        public final T next() {
            T[] tArr = this.f17150c.f17148c;
            int i = this.f17149b;
            this.f17149b = i + 1;
            T t = tArr[i];
            if (t != null) {
                return t;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public final int mo20208a(Object obj) {
        int i = this.f17147b - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f17148c[i3];
            if (obj2 != null) {
                int identityHashCode2 = System.identityHashCode(obj2);
                if (identityHashCode2 < identityHashCode) {
                    i2 = i3 + 1;
                } else if (identityHashCode2 > identityHashCode) {
                    i = i3 - 1;
                } else if (obj2 == obj) {
                    return i3;
                } else {
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.f17148c[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.f17147b;
                    while (true) {
                        if (i5 >= i6) {
                            i5 = this.f17147b;
                            break;
                        }
                        Object obj4 = this.f17148c[i5];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i5++;
                    }
                    return -(i5 + 1);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
        }
        return -(i2 + 1);
    }

    public final boolean add(T t) {
        int i;
        C19383o.m32797g(t, "value");
        if (this.f17147b > 0) {
            i = mo20208a(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f17147b;
        Object[] objArr = this.f17148c;
        if (i3 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            C19318k.m32603U0(objArr, i2 + 1, objArr2, i2, i3);
            C19318k.m32605W0(this.f17148c, objArr2, 0, 0, i2, 6);
            this.f17148c = objArr2;
        } else {
            C19318k.m32603U0(objArr, i2 + 1, objArr, i2, i3);
        }
        this.f17148c[i2] = t;
        this.f17147b++;
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        int i = this.f17147b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f17148c[i2] = null;
        }
        this.f17147b = 0;
    }

    public final boolean contains(Object obj) {
        return obj != null && mo20208a(obj) >= 0;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f17147b == 0;
    }

    public final Iterator<T> iterator() {
        return new C7732a(this);
    }

    public final boolean remove(T t) {
        int a;
        if (t == null || (a = mo20208a(t)) < 0) {
            return false;
        }
        int i = this.f17147b;
        if (a < i - 1) {
            Object[] objArr = this.f17148c;
            C19318k.m32603U0(objArr, a, objArr, a + 1, i);
        }
        int i2 = this.f17147b - 1;
        this.f17147b = i2;
        this.f17148c[i2] = null;
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f17147b;
    }

    public final Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }
}
