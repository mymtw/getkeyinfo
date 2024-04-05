package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l */
public final class C16507l extends C16469c<Double> implements RandomAccess, C16526s0 {

    /* renamed from: c */
    public double[] f36651c;

    /* renamed from: d */
    public int f36652d;

    static {
        new C16507l(new double[0], 0).f36583b = false;
    }

    public C16507l() {
        this(new double[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo58670a();
        if (i < 0 || i > (i2 = this.f36652d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36652d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        double[] dArr = this.f36651c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f36651c, i, dArr2, i + 1, this.f36652d - i);
            this.f36651c = dArr2;
        }
        this.f36651c[i] = doubleValue;
        this.f36652d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo58670a();
        Charset charset = C16531v.f36704a;
        collection.getClass();
        if (!(collection instanceof C16507l)) {
            return super.addAll(collection);
        }
        C16507l lVar = (C16507l) collection;
        int i = lVar.f36652d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36652d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f36651c;
            if (i3 > dArr.length) {
                this.f36651c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(lVar.f36651c, 0, this.f36651c, this.f36652d, lVar.f36652d);
            this.f36652d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo58877c(double d) {
        mo58670a();
        int i = this.f36652d;
        double[] dArr = this.f36651c;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f36651c = dArr2;
        }
        double[] dArr3 = this.f36651c;
        int i2 = this.f36652d;
        this.f36652d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: e */
    public final void mo58878e(int i) {
        if (i < 0 || i >= this.f36652d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36652d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16507l)) {
            return super.equals(obj);
        }
        C16507l lVar = (C16507l) obj;
        if (this.f36652d != lVar.f36652d) {
            return false;
        }
        double[] dArr = lVar.f36651c;
        for (int i = 0; i < this.f36652d; i++) {
            if (Double.doubleToLongBits(this.f36651c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo58878e(i);
        return Double.valueOf(this.f36651c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36652d; i2++) {
            i = (i * 31) + C16531v.m27233a(Double.doubleToLongBits(this.f36651c[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final C16531v.C16535d mo58661i(int i) {
        if (i >= this.f36652d) {
            return new C16507l(Arrays.copyOf(this.f36651c, i), this.f36652d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo58670a();
        for (int i = 0; i < this.f36652d; i++) {
            if (obj.equals(Double.valueOf(this.f36651c[i]))) {
                double[] dArr = this.f36651c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f36652d - i) - 1);
                this.f36652d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo58670a();
        if (i2 >= i) {
            double[] dArr = this.f36651c;
            System.arraycopy(dArr, i2, dArr, i, this.f36652d - i2);
            this.f36652d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo58670a();
        mo58878e(i);
        double[] dArr = this.f36651c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f36652d;
    }

    public C16507l(double[] dArr, int i) {
        this.f36651c = dArr;
        this.f36652d = i;
    }

    public final Object remove(int i) {
        mo58670a();
        mo58878e(i);
        double[] dArr = this.f36651c;
        double d = dArr[i];
        int i2 = this.f36652d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f36652d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean add(Object obj) {
        mo58877c(((Double) obj).doubleValue());
        return true;
    }
}
