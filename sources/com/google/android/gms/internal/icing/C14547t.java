package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.icing.t */
public final class C14547t extends C14510j<Double> implements RandomAccess, C14503h0, C14508i1 {

    /* renamed from: e */
    public static final C14547t f32699e;

    /* renamed from: c */
    public double[] f32700c;

    /* renamed from: d */
    public int f32701d;

    static {
        C14547t tVar = new C14547t(new double[0], 0);
        f32699e = tVar;
        tVar.f32650b = false;
    }

    public C14547t() {
        this(new double[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo49812a();
        if (i < 0 || i > (i2 = this.f32701d)) {
            throw new IndexOutOfBoundsException(mo49919e(i));
        }
        double[] dArr = this.f32700c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f32700c, i, dArr2, i + 1, this.f32701d - i);
            this.f32700c = dArr2;
        }
        this.f32700c[i] = doubleValue;
        this.f32701d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo49812a();
        Charset charset = C14515k0.f32655a;
        collection.getClass();
        if (!(collection instanceof C14547t)) {
            return super.addAll(collection);
        }
        C14547t tVar = (C14547t) collection;
        int i = tVar.f32701d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32701d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f32700c;
            if (i3 > dArr.length) {
                this.f32700c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(tVar.f32700c, 0, this.f32700c, this.f32701d, tVar.f32701d);
            this.f32701d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo49917c(int i) {
        if (i < 0 || i >= this.f32701d) {
            throw new IndexOutOfBoundsException(mo49919e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo49919e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32701d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14547t)) {
            return super.equals(obj);
        }
        C14547t tVar = (C14547t) obj;
        if (this.f32701d != tVar.f32701d) {
            return false;
        }
        double[] dArr = tVar.f32700c;
        for (int i = 0; i < this.f32701d; i++) {
            if (Double.doubleToLongBits(this.f32700c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo49917c(i);
        return Double.valueOf(this.f32700c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32701d; i2++) {
            i = (i * 31) + C14515k0.m23053a(Double.doubleToLongBits(this.f32700c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f32701d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32700c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C14511j0 mo49798r(int i) {
        if (i >= this.f32701d) {
            return new C14547t(Arrays.copyOf(this.f32700c, i), this.f32701d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo49812a();
        mo49917c(i);
        double[] dArr = this.f32700c;
        double d = dArr[i];
        int i2 = this.f32701d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f32701d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo49812a();
        if (i2 >= i) {
            double[] dArr = this.f32700c;
            System.arraycopy(dArr, i2, dArr, i, this.f32701d - i2);
            this.f32701d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo49812a();
        mo49917c(i);
        double[] dArr = this.f32700c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f32701d;
    }

    public C14547t(double[] dArr, int i) {
        this.f32700c = dArr;
        this.f32701d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo49812a();
        int i = this.f32701d;
        double[] dArr = this.f32700c;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f32700c = dArr2;
        }
        double[] dArr3 = this.f32700c;
        int i2 = this.f32701d;
        this.f32701d = i2 + 1;
        dArr3[i2] = doubleValue;
        return true;
    }
}
