package p193o;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p173m.C7279a;

/* renamed from: o.i */
public class C7506i<K, V> {

    /* renamed from: e */
    public static Object[] f16739e;

    /* renamed from: f */
    public static int f16740f;

    /* renamed from: g */
    public static Object[] f16741g;

    /* renamed from: h */
    public static int f16742h;

    /* renamed from: b */
    public int[] f16743b;

    /* renamed from: c */
    public Object[] f16744c;

    /* renamed from: d */
    public int f16745d;

    public C7506i() {
        this.f16743b = C7279a.f16139b;
        this.f16744c = C7279a.f16141d;
        this.f16745d = 0;
    }

    /* renamed from: a */
    private void m14479a(int i) {
        Class<C7506i> cls = C7506i.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f16741g;
                if (objArr != null) {
                    this.f16744c = objArr;
                    f16741g = (Object[]) objArr[0];
                    this.f16743b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16742h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f16739e;
                if (objArr2 != null) {
                    this.f16744c = objArr2;
                    f16739e = (Object[]) objArr2[0];
                    this.f16743b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16740f--;
                    return;
                }
            }
        }
        this.f16743b = new int[i];
        this.f16744c = new Object[(i << 1)];
    }

    /* renamed from: c */
    public static void m14480c(int[] iArr, Object[] objArr, int i) {
        Class<C7506i> cls = C7506i.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f16742h < 10) {
                    objArr[0] = f16741g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f16741g = objArr;
                    f16742h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f16740f < 10) {
                    objArr[0] = f16739e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f16739e = objArr;
                    f16740f++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo19968b(int i) {
        int i2 = this.f16745d;
        int[] iArr = this.f16743b;
        if (iArr.length < i) {
            Object[] objArr = this.f16744c;
            m14479a(i);
            if (this.f16745d > 0) {
                System.arraycopy(iArr, 0, this.f16743b, 0, i2);
                System.arraycopy(objArr, 0, this.f16744c, 0, i2 << 1);
            }
            m14480c(iArr, objArr, i2);
        }
        if (this.f16745d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f16745d;
        if (i > 0) {
            int[] iArr = this.f16743b;
            Object[] objArr = this.f16744c;
            this.f16743b = C7279a.f16139b;
            this.f16744c = C7279a.f16141d;
            this.f16745d = 0;
            m14480c(iArr, objArr, i);
        }
        if (this.f16745d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return mo19972e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo19975g(obj) >= 0;
    }

    /* renamed from: d */
    public final int mo19971d(int i, Object obj) {
        int i2 = this.f16745d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int d = C7279a.m13946d(i2, i, this.f16743b);
            if (d < 0 || obj.equals(this.f16744c[d << 1])) {
                return d;
            }
            int i3 = d + 1;
            while (i3 < i2 && this.f16743b[i3] == i) {
                if (obj.equals(this.f16744c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = d - 1;
            while (i4 >= 0 && this.f16743b[i4] == i) {
                if (obj.equals(this.f16744c[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int mo19972e(Object obj) {
        return obj == null ? mo19974f() : mo19971d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7506i) {
            C7506i iVar = (C7506i) obj;
            if (this.f16745d != iVar.f16745d) {
                return false;
            }
            int i = 0;
            while (i < this.f16745d) {
                try {
                    Object h = mo19978h(i);
                    Object n = mo19980n(i);
                    Object orDefault = iVar.getOrDefault(h, (Object) null);
                    if (n == null) {
                        if (orDefault != null || !iVar.containsKey(h)) {
                            return false;
                        }
                    } else if (!n.equals(orDefault)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f16745d != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f16745d) {
                try {
                    Object h2 = mo19978h(i2);
                    Object n2 = mo19980n(i2);
                    Object obj2 = map.get(h2);
                    if (n2 == null) {
                        if (obj2 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!n2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo19974f() {
        int i = this.f16745d;
        if (i == 0) {
            return -1;
        }
        try {
            int d = C7279a.m13946d(i, 0, this.f16743b);
            if (d < 0 || this.f16744c[d << 1] == null) {
                return d;
            }
            int i2 = d + 1;
            while (i2 < i && this.f16743b[i2] == 0) {
                if (this.f16744c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = d - 1;
            while (i3 >= 0 && this.f16743b[i3] == 0) {
                if (this.f16744c[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo19975g(Object obj) {
        int i = this.f16745d * 2;
        Object[] objArr = this.f16744c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v) {
        int e = mo19972e(obj);
        return e >= 0 ? this.f16744c[(e << 1) + 1] : v;
    }

    /* renamed from: h */
    public final K mo19978h(int i) {
        return this.f16744c[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f16743b;
        Object[] objArr = this.f16744c;
        int i = this.f16745d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public void mo14352i(C7494b bVar) {
        int i = bVar.f16745d;
        mo19968b(this.f16745d + i);
        if (this.f16745d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(bVar.mo19978h(i2), bVar.mo19980n(i2));
            }
        } else if (i > 0) {
            System.arraycopy(bVar.f16743b, 0, this.f16743b, 0, i);
            System.arraycopy(bVar.f16744c, 0, this.f16744c, 0, i << 1);
            this.f16745d = i;
        }
    }

    public final boolean isEmpty() {
        return this.f16745d <= 0;
    }

    /* renamed from: j */
    public V mo14353j(int i) {
        V[] vArr = this.f16744c;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f16745d;
        int i4 = 0;
        if (i3 <= 1) {
            m14480c(this.f16743b, vArr, i3);
            this.f16743b = C7279a.f16139b;
            this.f16744c = C7279a.f16141d;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f16743b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f16744c;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f16744c;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m14479a(i6);
                if (i3 == this.f16745d) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f16743b, 0, i);
                        System.arraycopy(vArr, 0, this.f16744c, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f16743b, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f16744c, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f16745d) {
            this.f16745d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: k */
    public V mo14354k(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f16744c;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: n */
    public final V mo19980n(int i) {
        return this.f16744c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f16745d;
        if (k == null) {
            i2 = mo19974f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo19971d(hashCode, k);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f16744c;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f16743b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f16744c;
            m14479a(i6);
            if (i3 == this.f16745d) {
                int[] iArr2 = this.f16743b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f16744c, 0, objArr.length);
                }
                m14480c(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f16743b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f16744c;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f16745d - i5) << 1);
        }
        int i8 = this.f16745d;
        if (i3 == i8) {
            int[] iArr4 = this.f16743b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f16744c;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f16745d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public final V remove(Object obj) {
        int e = mo19972e(obj);
        if (e >= 0) {
            return mo14353j(e);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int e = mo19972e(k);
        if (e >= 0) {
            return mo14354k(e, v);
        }
        return null;
    }

    public final int size() {
        return this.f16745d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16745d * 28);
        sb.append('{');
        for (int i = 0; i < this.f16745d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h = mo19978h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object n = mo19980n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = mo19972e(obj);
        if (e < 0) {
            return false;
        }
        Object n = mo19980n(e);
        if (obj2 != n && (obj2 == null || !obj2.equals(n))) {
            return false;
        }
        mo14353j(e);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int e = mo19972e(k);
        if (e < 0) {
            return false;
        }
        V n = mo19980n(e);
        if (n != v && (v == null || !v.equals(n))) {
            return false;
        }
        mo14354k(e, v2);
        return true;
    }

    public C7506i(int i) {
        if (i == 0) {
            this.f16743b = C7279a.f16139b;
            this.f16744c = C7279a.f16141d;
        } else {
            m14479a(i);
        }
        this.f16745d = 0;
    }
}
