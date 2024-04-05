package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.measurement.n5 */
public final class C14743n5 extends C14830u4<Float> implements RandomAccess, C14880y6 {

    /* renamed from: c */
    public float[] f32970c;

    /* renamed from: d */
    public int f32971d;

    static {
        new C14743n5(new float[0], 0).f33094b = false;
    }

    public C14743n5() {
        this(new float[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo50891a();
        if (i < 0 || i > (i2 = this.f32971d)) {
            throw new IndexOutOfBoundsException(mo50729e(i));
        }
        float[] fArr = this.f32970c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f32970c, i, fArr2, i + 1, this.f32971d - i);
            this.f32970c = fArr2;
        }
        this.f32970c[i] = floatValue;
        this.f32971d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo50891a();
        Charset charset = C14575a6.f32740a;
        collection.getClass();
        if (!(collection instanceof C14743n5)) {
            return super.addAll(collection);
        }
        C14743n5 n5Var = (C14743n5) collection;
        int i = n5Var.f32971d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32971d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f32970c;
            if (i3 > fArr.length) {
                this.f32970c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(n5Var.f32970c, 0, this.f32970c, this.f32971d, n5Var.f32971d);
            this.f32971d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14891z5 mo50356b(int i) {
        if (i >= this.f32971d) {
            return new C14743n5(Arrays.copyOf(this.f32970c, i), this.f32971d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo50727c(float f) {
        mo50891a();
        int i = this.f32971d;
        float[] fArr = this.f32970c;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f32970c = fArr2;
        }
        float[] fArr3 = this.f32970c;
        int i2 = this.f32971d;
        this.f32971d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo50729e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32971d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14743n5)) {
            return super.equals(obj);
        }
        C14743n5 n5Var = (C14743n5) obj;
        if (this.f32971d != n5Var.f32971d) {
            return false;
        }
        float[] fArr = n5Var.f32970c;
        for (int i = 0; i < this.f32971d; i++) {
            if (Float.floatToIntBits(this.f32970c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo50730g(int i) {
        if (i < 0 || i >= this.f32971d) {
            throw new IndexOutOfBoundsException(mo50729e(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo50730g(i);
        return Float.valueOf(this.f32970c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32971d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f32970c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f32971d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32970c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50891a();
        mo50730g(i);
        float[] fArr = this.f32970c;
        float f = fArr[i];
        int i2 = this.f32971d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f32971d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo50891a();
        if (i2 >= i) {
            float[] fArr = this.f32970c;
            System.arraycopy(fArr, i2, fArr, i, this.f32971d - i2);
            this.f32971d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo50891a();
        mo50730g(i);
        float[] fArr = this.f32970c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f32971d;
    }

    public C14743n5(float[] fArr, int i) {
        this.f32970c = fArr;
        this.f32971d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo50727c(((Float) obj).floatValue());
        return true;
    }
}
