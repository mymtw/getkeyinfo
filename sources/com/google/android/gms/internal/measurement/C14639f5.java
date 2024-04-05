package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
public final class C14639f5 extends C14830u4<Double> implements RandomAccess, C14880y6 {

    /* renamed from: c */
    public double[] f32837c;

    /* renamed from: d */
    public int f32838d;

    static {
        new C14639f5(new double[0], 0).f33094b = false;
    }

    public C14639f5() {
        this(new double[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo50891a();
        if (i < 0 || i > (i2 = this.f32838d)) {
            throw new IndexOutOfBoundsException(mo50522e(i));
        }
        double[] dArr = this.f32837c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f32837c, i, dArr2, i + 1, this.f32838d - i);
            this.f32837c = dArr2;
        }
        this.f32837c[i] = doubleValue;
        this.f32838d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo50891a();
        Charset charset = C14575a6.f32740a;
        collection.getClass();
        if (!(collection instanceof C14639f5)) {
            return super.addAll(collection);
        }
        C14639f5 f5Var = (C14639f5) collection;
        int i = f5Var.f32838d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32838d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f32837c;
            if (i3 > dArr.length) {
                this.f32837c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(f5Var.f32837c, 0, this.f32837c, this.f32838d, f5Var.f32838d);
            this.f32838d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14891z5 mo50356b(int i) {
        if (i >= this.f32838d) {
            return new C14639f5(Arrays.copyOf(this.f32837c, i), this.f32838d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo50520c(double d) {
        mo50891a();
        int i = this.f32838d;
        double[] dArr = this.f32837c;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f32837c = dArr2;
        }
        double[] dArr3 = this.f32837c;
        int i2 = this.f32838d;
        this.f32838d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo50522e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32838d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14639f5)) {
            return super.equals(obj);
        }
        C14639f5 f5Var = (C14639f5) obj;
        if (this.f32838d != f5Var.f32838d) {
            return false;
        }
        double[] dArr = f5Var.f32837c;
        for (int i = 0; i < this.f32838d; i++) {
            if (Double.doubleToLongBits(this.f32837c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo50524g(int i) {
        if (i < 0 || i >= this.f32838d) {
            throw new IndexOutOfBoundsException(mo50522e(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo50524g(i);
        return Double.valueOf(this.f32837c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32838d; i2++) {
            i = (i * 31) + C14575a6.m23369a(Double.doubleToLongBits(this.f32837c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f32838d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32837c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50891a();
        mo50524g(i);
        double[] dArr = this.f32837c;
        double d = dArr[i];
        int i2 = this.f32838d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f32838d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo50891a();
        if (i2 >= i) {
            double[] dArr = this.f32837c;
            System.arraycopy(dArr, i2, dArr, i, this.f32838d - i2);
            this.f32838d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo50891a();
        mo50524g(i);
        double[] dArr = this.f32837c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f32838d;
    }

    public C14639f5(double[] dArr, int i) {
        this.f32837c = dArr;
        this.f32838d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo50520c(((Double) obj).doubleValue());
        return true;
    }
}
