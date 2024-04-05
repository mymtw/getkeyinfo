package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u0 */
public final class C16530u0<E> extends C16469c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C16530u0<Object> f36701e;

    /* renamed from: c */
    public E[] f36702c;

    /* renamed from: d */
    public int f36703d;

    static {
        C16530u0<Object> u0Var = new C16530u0<>(new Object[0], 0);
        f36701e = u0Var;
        u0Var.f36583b = false;
    }

    public C16530u0(E[] eArr, int i) {
        this.f36702c = eArr;
        this.f36703d = i;
    }

    public final boolean add(E e) {
        mo58670a();
        int i = this.f36703d;
        E[] eArr = this.f36702c;
        if (i == eArr.length) {
            this.f36702c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f36702c;
        int i2 = this.f36703d;
        this.f36703d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: c */
    public final void mo58965c(int i) {
        if (i < 0 || i >= this.f36703d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36703d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final E get(int i) {
        mo58965c(i);
        return this.f36702c[i];
    }

    /* renamed from: i */
    public final C16531v.C16535d mo58661i(int i) {
        if (i >= this.f36703d) {
            return new C16530u0(Arrays.copyOf(this.f36702c, i), this.f36703d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo58670a();
        mo58965c(i);
        E[] eArr = this.f36702c;
        E e = eArr[i];
        int i2 = this.f36703d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f36703d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo58670a();
        mo58965c(i);
        E[] eArr = this.f36702c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f36703d;
    }

    public final void add(int i, E e) {
        int i2;
        mo58670a();
        if (i < 0 || i > (i2 = this.f36703d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36703d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        E[] eArr = this.f36702c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f36702c, i, eArr2, i + 1, this.f36703d - i);
            this.f36702c = eArr2;
        }
        this.f36702c[i] = e;
        this.f36703d++;
        this.modCount++;
    }
}
