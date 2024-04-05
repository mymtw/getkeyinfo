package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0072d;
import java.util.Arrays;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.icing.k1 */
public final class C14516k1<E> extends C14510j<E> implements RandomAccess {

    /* renamed from: e */
    public static final C14516k1<Object> f32657e;

    /* renamed from: c */
    public E[] f32658c;

    /* renamed from: d */
    public int f32659d;

    static {
        C14516k1<Object> k1Var = new C14516k1<>(new Object[0], 0);
        f32657e = k1Var;
        k1Var.f32650b = false;
    }

    public C14516k1(E[] eArr, int i) {
        this.f32658c = eArr;
        this.f32659d = i;
    }

    public final void add(int i, E e) {
        int i2;
        mo49812a();
        if (i < 0 || i > (i2 = this.f32659d)) {
            throw new IndexOutOfBoundsException(mo49823e(i));
        }
        E[] eArr = this.f32658c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f32658c, i, eArr2, i + 1, this.f32659d - i);
            this.f32658c = eArr2;
        }
        this.f32658c[i] = e;
        this.f32659d++;
        this.modCount++;
    }

    /* renamed from: c */
    public final void mo49822c(int i) {
        if (i < 0 || i >= this.f32659d) {
            throw new IndexOutOfBoundsException(mo49823e(i));
        }
    }

    /* renamed from: e */
    public final String mo49823e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32659d);
    }

    public final E get(int i) {
        mo49822c(i);
        return this.f32658c[i];
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C14511j0 mo49798r(int i) {
        if (i >= this.f32659d) {
            return new C14516k1(Arrays.copyOf(this.f32658c, i), this.f32659d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo49812a();
        mo49822c(i);
        E[] eArr = this.f32658c;
        E e = eArr[i];
        int i2 = this.f32659d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f32659d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo49812a();
        mo49822c(i);
        E[] eArr = this.f32658c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f32659d;
    }

    public final boolean add(E e) {
        mo49812a();
        int i = this.f32659d;
        E[] eArr = this.f32658c;
        if (i == eArr.length) {
            this.f32658c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f32658c;
        int i2 = this.f32659d;
        this.f32659d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
