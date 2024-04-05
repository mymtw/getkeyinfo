package p193o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p173m.C7279a;
import p193o.C7500h;

/* renamed from: o.d */
public final class C7496d<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f16707f = new int[0];

    /* renamed from: g */
    public static final Object[] f16708g = new Object[0];

    /* renamed from: h */
    public static Object[] f16709h;

    /* renamed from: i */
    public static int f16710i;

    /* renamed from: j */
    public static Object[] f16711j;

    /* renamed from: k */
    public static int f16712k;

    /* renamed from: b */
    public int[] f16713b;

    /* renamed from: c */
    public Object[] f16714c;

    /* renamed from: d */
    public int f16715d;

    /* renamed from: e */
    public C7495c f16716e;

    public C7496d() {
        this(0);
    }

    /* renamed from: c */
    public static void m14454c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C7496d.class) {
                if (f16712k < 10) {
                    objArr[0] = f16711j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f16711j = objArr;
                    f16712k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C7496d.class) {
                if (f16710i < 10) {
                    objArr[0] = f16709h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f16709h = objArr;
                    f16710i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19863a(int i) {
        if (i == 8) {
            synchronized (C7496d.class) {
                Object[] objArr = f16711j;
                if (objArr != null) {
                    this.f16714c = objArr;
                    f16711j = (Object[]) objArr[0];
                    this.f16713b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16712k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C7496d.class) {
                Object[] objArr2 = f16709h;
                if (objArr2 != null) {
                    this.f16714c = objArr2;
                    f16709h = (Object[]) objArr2[0];
                    this.f16713b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16710i--;
                    return;
                }
            }
        }
        this.f16713b = new int[i];
        this.f16714c = new Object[i];
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo19871g();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo19869e(hashCode, e);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f16715d;
        int[] iArr = this.f16713b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f16714c;
            mo19863a(i5);
            int[] iArr2 = this.f16713b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16714c, 0, objArr.length);
            }
            m14454c(iArr, objArr, this.f16715d);
        }
        int i6 = this.f16715d;
        if (i3 < i6) {
            int[] iArr3 = this.f16713b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f16714c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f16715d - i3);
        }
        this.f16713b[i3] = i;
        this.f16714c[i3] = e;
        this.f16715d++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f16715d;
        int[] iArr = this.f16713b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f16714c;
            mo19863a(size);
            int i = this.f16715d;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f16713b, 0, i);
                System.arraycopy(objArr, 0, this.f16714c, 0, this.f16715d);
            }
            m14454c(iArr, objArr, this.f16715d);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void clear() {
        int i = this.f16715d;
        if (i != 0) {
            m14454c(this.f16713b, this.f16714c, i);
            this.f16713b = f16707f;
            this.f16714c = f16708g;
            this.f16715d = 0;
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final int mo19869e(int i, Object obj) {
        int i2 = this.f16715d;
        if (i2 == 0) {
            return -1;
        }
        int d = C7279a.m13946d(i2, i, this.f16713b);
        if (d < 0 || obj.equals(this.f16714c[d])) {
            return d;
        }
        int i3 = d + 1;
        while (i3 < i2 && this.f16713b[i3] == i) {
            if (obj.equals(this.f16714c[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = d - 1;
        while (i4 >= 0 && this.f16713b[i4] == i) {
            if (obj.equals(this.f16714c[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f16715d != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f16715d) {
                try {
                    if (!set.contains(this.f16714c[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo19871g() {
        int i = this.f16715d;
        if (i == 0) {
            return -1;
        }
        int d = C7279a.m13946d(i, 0, this.f16713b);
        if (d < 0 || this.f16714c[d] == null) {
            return d;
        }
        int i2 = d + 1;
        while (i2 < i && this.f16713b[i2] == 0) {
            if (this.f16714c[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = d - 1;
        while (i3 >= 0 && this.f16713b[i3] == 0) {
            if (this.f16714c[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public final int hashCode() {
        int[] iArr = this.f16713b;
        int i = this.f16715d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? mo19871g() : mo19869e(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        return this.f16715d <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f16716e == null) {
            this.f16716e = new C7495c(this);
        }
        C7495c cVar = this.f16716e;
        if (cVar.f16725b == null) {
            cVar.f16725b = new C7500h.C7503c();
        }
        return cVar.f16725b.iterator();
    }

    /* renamed from: l */
    public final void mo19876l(int i) {
        Object[] objArr = this.f16714c;
        Object obj = objArr[i];
        int i2 = this.f16715d;
        if (i2 <= 1) {
            m14454c(this.f16713b, objArr, i2);
            this.f16713b = f16707f;
            this.f16714c = f16708g;
            this.f16715d = 0;
            return;
        }
        int[] iArr = this.f16713b;
        int i3 = 8;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i4 = i2 - 1;
            this.f16715d = i4;
            if (i < i4) {
                int i5 = i + 1;
                System.arraycopy(iArr, i5, iArr, i, i4 - i);
                Object[] objArr2 = this.f16714c;
                System.arraycopy(objArr2, i5, objArr2, i, this.f16715d - i);
            }
            this.f16714c[this.f16715d] = null;
            return;
        }
        if (i2 > 8) {
            i3 = i2 + (i2 >> 1);
        }
        mo19863a(i3);
        this.f16715d--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f16713b, 0, i);
            System.arraycopy(objArr, 0, this.f16714c, 0, i);
        }
        int i6 = this.f16715d;
        if (i < i6) {
            int i7 = i + 1;
            System.arraycopy(iArr, i7, this.f16713b, i, i6 - i);
            System.arraycopy(objArr, i7, this.f16714c, i, this.f16715d - i);
        }
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo19876l(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f16715d - 1; i >= 0; i--) {
            if (!collection.contains(this.f16714c[i])) {
                mo19876l(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f16715d;
    }

    public final Object[] toArray() {
        int i = this.f16715d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f16714c, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16715d * 14);
        sb.append('{');
        for (int i = 0; i < this.f16715d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f16714c[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7496d(int i) {
        if (i == 0) {
            this.f16713b = f16707f;
            this.f16714c = f16708g;
        } else {
            mo19863a(i);
        }
        this.f16715d = 0;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f16715d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f16715d);
        }
        System.arraycopy(this.f16714c, 0, tArr, 0, this.f16715d);
        int length = tArr.length;
        int i = this.f16715d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public C7496d(Set set) {
        this();
        addAll(set);
    }
}
