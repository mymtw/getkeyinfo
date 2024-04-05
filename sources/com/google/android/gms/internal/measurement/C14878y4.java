package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
public final class C14878y4 extends C14830u4<Boolean> implements RandomAccess, C14880y6 {

    /* renamed from: c */
    public boolean[] f33172c;

    /* renamed from: d */
    public int f33173d;

    static {
        new C14878y4(new boolean[0], 0).f33094b = false;
    }

    public C14878y4() {
        this(new boolean[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo50891a();
        if (i < 0 || i > (i2 = this.f33173d)) {
            throw new IndexOutOfBoundsException(mo50977e(i));
        }
        boolean[] zArr = this.f33172c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f33172c, i, zArr2, i + 1, this.f33173d - i);
            this.f33172c = zArr2;
        }
        this.f33172c[i] = booleanValue;
        this.f33173d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo50891a();
        Charset charset = C14575a6.f32740a;
        collection.getClass();
        if (!(collection instanceof C14878y4)) {
            return super.addAll(collection);
        }
        C14878y4 y4Var = (C14878y4) collection;
        int i = y4Var.f33173d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33173d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f33172c;
            if (i3 > zArr.length) {
                this.f33172c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(y4Var.f33172c, 0, this.f33172c, this.f33173d, y4Var.f33173d);
            this.f33173d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14891z5 mo50356b(int i) {
        if (i >= this.f33173d) {
            return new C14878y4(Arrays.copyOf(this.f33172c, i), this.f33173d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo50975c(boolean z) {
        mo50891a();
        int i = this.f33173d;
        boolean[] zArr = this.f33172c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f33172c = zArr2;
        }
        boolean[] zArr3 = this.f33172c;
        int i2 = this.f33173d;
        this.f33173d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo50977e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f33173d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14878y4)) {
            return super.equals(obj);
        }
        C14878y4 y4Var = (C14878y4) obj;
        if (this.f33173d != y4Var.f33173d) {
            return false;
        }
        boolean[] zArr = y4Var.f33172c;
        for (int i = 0; i < this.f33173d; i++) {
            if (this.f33172c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo50978g(int i) {
        if (i < 0 || i >= this.f33173d) {
            throw new IndexOutOfBoundsException(mo50977e(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo50978g(i);
        return Boolean.valueOf(this.f33172c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33173d; i2++) {
            int i3 = i * 31;
            boolean z = this.f33172c[i2];
            Charset charset = C14575a6.f32740a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f33173d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f33172c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50891a();
        mo50978g(i);
        boolean[] zArr = this.f33172c;
        boolean z = zArr[i];
        int i2 = this.f33173d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f33173d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo50891a();
        if (i2 >= i) {
            boolean[] zArr = this.f33172c;
            System.arraycopy(zArr, i2, zArr, i, this.f33173d - i2);
            this.f33173d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo50891a();
        mo50978g(i);
        boolean[] zArr = this.f33172c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f33173d;
    }

    public C14878y4(boolean[] zArr, int i) {
        this.f33172c = zArr;
        this.f33173d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo50975c(((Boolean) obj).booleanValue());
        return true;
    }
}
