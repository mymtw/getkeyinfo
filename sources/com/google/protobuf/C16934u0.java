package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.protobuf.C16935v;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u0 */
public final class C16934u0<E> extends C16872c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C16934u0<Object> f37298e;

    /* renamed from: c */
    public E[] f37299c;

    /* renamed from: d */
    public int f37300d;

    static {
        C16934u0<Object> u0Var = new C16934u0<>(new Object[0], 0);
        f37298e = u0Var;
        u0Var.f37182b = false;
    }

    public C16934u0(E[] eArr, int i) {
        this.f37299c = eArr;
        this.f37300d = i;
    }

    public final boolean add(E e) {
        mo59861a();
        int i = this.f37300d;
        E[] eArr = this.f37299c;
        if (i == eArr.length) {
            this.f37299c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f37299c;
        int i2 = this.f37300d;
        this.f37300d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: c */
    public final void mo60051c(int i) {
        if (i < 0 || i >= this.f37300d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37300d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final E get(int i) {
        mo60051c(i);
        return this.f37299c[i];
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= this.f37300d) {
            return new C16934u0(Arrays.copyOf(this.f37299c, i), this.f37300d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo59861a();
        mo60051c(i);
        E[] eArr = this.f37299c;
        E e = eArr[i];
        int i2 = this.f37300d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f37300d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo59861a();
        mo60051c(i);
        E[] eArr = this.f37299c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f37300d;
    }

    public final void add(int i, E e) {
        int i2;
        mo59861a();
        if (i < 0 || i > (i2 = this.f37300d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37300d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        E[] eArr = this.f37299c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f37299c, i, eArr2, i + 1, this.f37300d - i);
            this.f37299c = eArr2;
        }
        this.f37299c[i] = e;
        this.f37300d++;
        this.modCount++;
    }
}
