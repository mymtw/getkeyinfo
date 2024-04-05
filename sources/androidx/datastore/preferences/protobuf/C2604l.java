package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.C2631w;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.l */
public final class C2604l extends C2563c<Double> implements RandomAccess, C2626t0 {

    /* renamed from: c */
    public double[] f5919c;

    /* renamed from: d */
    public int f5920d;

    static {
        new C2604l(new double[0], 0).f5841b = false;
    }

    public C2604l() {
        this(new double[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo9596a();
        if (i < 0 || i > (i2 = this.f5920d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5920d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        double[] dArr = this.f5919c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f5919c, i, dArr2, i + 1, this.f5920d - i);
            this.f5919c = dArr2;
        }
        this.f5919c[i] = doubleValue;
        this.f5920d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo9596a();
        Charset charset = C2631w.f5973a;
        collection.getClass();
        if (!(collection instanceof C2604l)) {
            return super.addAll(collection);
        }
        C2604l lVar = (C2604l) collection;
        int i = lVar.f5920d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5920d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f5919c;
            if (i3 > dArr.length) {
                this.f5919c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(lVar.f5919c, 0, this.f5919c, this.f5920d, lVar.f5920d);
            this.f5920d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo9817c(double d) {
        mo9596a();
        int i = this.f5920d;
        double[] dArr = this.f5919c;
        if (i == dArr.length) {
            double[] dArr2 = new double[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f5919c = dArr2;
        }
        double[] dArr3 = this.f5919c;
        int i2 = this.f5920d;
        this.f5920d = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: e */
    public final void mo9818e(int i) {
        if (i < 0 || i >= this.f5920d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5920d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2604l)) {
            return super.equals(obj);
        }
        C2604l lVar = (C2604l) obj;
        if (this.f5920d != lVar.f5920d) {
            return false;
        }
        double[] dArr = lVar.f5919c;
        for (int i = 0; i < this.f5920d; i++) {
            if (Double.doubleToLongBits(this.f5919c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo9818e(i);
        return Double.valueOf(this.f5919c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5920d; i2++) {
            i = (i * 31) + C2631w.m6276a(Double.doubleToLongBits(this.f5919c[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= this.f5920d) {
            return new C2604l(Arrays.copyOf(this.f5919c, i), this.f5920d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo9596a();
        for (int i = 0; i < this.f5920d; i++) {
            if (obj.equals(Double.valueOf(this.f5919c[i]))) {
                double[] dArr = this.f5919c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f5920d - i) - 1);
                this.f5920d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo9596a();
        if (i2 >= i) {
            double[] dArr = this.f5919c;
            System.arraycopy(dArr, i2, dArr, i, this.f5920d - i2);
            this.f5920d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo9596a();
        mo9818e(i);
        double[] dArr = this.f5919c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f5920d;
    }

    public C2604l(double[] dArr, int i) {
        this.f5919c = dArr;
        this.f5920d = i;
    }

    public final Object remove(int i) {
        mo9596a();
        mo9818e(i);
        double[] dArr = this.f5919c;
        double d = dArr[i];
        int i2 = this.f5920d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f5920d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean add(Object obj) {
        mo9817c(((Double) obj).doubleValue());
        return true;
    }
}
