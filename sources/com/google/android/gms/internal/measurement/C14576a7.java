package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import java.util.Arrays;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.measurement.a7 */
public final class C14576a7<E> extends C14830u4<E> implements RandomAccess {

    /* renamed from: e */
    public static final C14576a7<Object> f32742e;

    /* renamed from: c */
    public E[] f32743c;

    /* renamed from: d */
    public int f32744d;

    static {
        C14576a7<Object> a7Var = new C14576a7<>(new Object[0], 0);
        f32742e = a7Var;
        a7Var.f33094b = false;
    }

    public C14576a7(E[] eArr, int i) {
        this.f32743c = eArr;
        this.f32744d = i;
    }

    public final void add(int i, E e) {
        int i2;
        mo50891a();
        if (i < 0 || i > (i2 = this.f32744d)) {
            throw new IndexOutOfBoundsException(mo50357c(i));
        }
        E[] eArr = this.f32743c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f32743c, i, eArr2, i + 1, this.f32744d - i);
            this.f32743c = eArr2;
        }
        this.f32743c[i] = e;
        this.f32744d++;
        this.modCount++;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14891z5 mo50356b(int i) {
        if (i >= this.f32744d) {
            return new C14576a7(Arrays.copyOf(this.f32743c, i), this.f32744d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final String mo50357c(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32744d);
    }

    /* renamed from: e */
    public final void mo50358e(int i) {
        if (i < 0 || i >= this.f32744d) {
            throw new IndexOutOfBoundsException(mo50357c(i));
        }
    }

    public final E get(int i) {
        mo50358e(i);
        return this.f32743c[i];
    }

    public final E remove(int i) {
        mo50891a();
        mo50358e(i);
        E[] eArr = this.f32743c;
        E e = eArr[i];
        int i2 = this.f32744d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f32744d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo50891a();
        mo50358e(i);
        E[] eArr = this.f32743c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f32744d;
    }

    public final boolean add(E e) {
        mo50891a();
        int i = this.f32744d;
        E[] eArr = this.f32743c;
        if (i == eArr.length) {
            this.f32743c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f32743c;
        int i2 = this.f32744d;
        this.f32744d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
