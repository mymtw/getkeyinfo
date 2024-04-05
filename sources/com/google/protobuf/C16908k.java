package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.C16935v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k */
public final class C16908k extends C16872c<Double> implements RandomAccess, C16930s0 {

    /* renamed from: c */
    public double[] f37243c;

    /* renamed from: d */
    public int f37244d;

    static {
        new C16908k(new double[0], 0).f37182b = false;
    }

    public C16908k() {
        this(new double[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo59861a();
        if (i < 0 || i > (i2 = this.f37244d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37244d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        double[] dArr = this.f37243c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f37243c, i, dArr2, i + 1, this.f37244d - i);
            this.f37243c = dArr2;
        }
        this.f37243c[i] = doubleValue;
        this.f37244d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo59861a();
        Charset charset = C16935v.f37301a;
        collection.getClass();
        if (!(collection instanceof C16908k)) {
            return super.addAll(collection);
        }
        C16908k kVar = (C16908k) collection;
        int i = kVar.f37244d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37244d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f37243c;
            if (i3 > dArr.length) {
                this.f37243c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(kVar.f37243c, 0, this.f37243c, this.f37244d, kVar.f37244d);
            this.f37244d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo59970c(double d) {
        mo59861a();
        int i = this.f37244d;
        double[] dArr = this.f37243c;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f37243c = dArr2;
        }
        double[] dArr3 = this.f37243c;
        int i2 = this.f37244d;
        this.f37244d = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo59972e(int i) {
        if (i < 0 || i >= this.f37244d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37244d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16908k)) {
            return super.equals(obj);
        }
        C16908k kVar = (C16908k) obj;
        if (this.f37244d != kVar.f37244d) {
            return false;
        }
        double[] dArr = kVar.f37243c;
        for (int i = 0; i < this.f37244d; i++) {
            if (Double.doubleToLongBits(this.f37243c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo59972e(i);
        return Double.valueOf(this.f37243c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37244d; i2++) {
            i = (i * 31) + C16935v.m28394a(Double.doubleToLongBits(this.f37243c[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= this.f37244d) {
            return new C16908k(Arrays.copyOf(this.f37243c, i), this.f37244d);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f37244d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37243c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        mo59861a();
        mo59972e(i);
        double[] dArr = this.f37243c;
        double d = dArr[i];
        int i2 = this.f37244d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f37244d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo59861a();
        if (i2 >= i) {
            double[] dArr = this.f37243c;
            System.arraycopy(dArr, i2, dArr, i, this.f37244d - i2);
            this.f37244d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo59861a();
        mo59972e(i);
        double[] dArr = this.f37243c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f37244d;
    }

    public C16908k(double[] dArr, int i) {
        this.f37243c = dArr;
        this.f37244d = i;
    }

    public final boolean add(Object obj) {
        mo59970c(((Double) obj).doubleValue());
        return true;
    }
}
