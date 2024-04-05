package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.C2631w;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.f */
public final class C2576f extends C2563c<Boolean> implements RandomAccess, C2626t0 {

    /* renamed from: c */
    public boolean[] f5866c;

    /* renamed from: d */
    public int f5867d;

    static {
        new C2576f(new boolean[0], 0).f5841b = false;
    }

    public C2576f() {
        this(new boolean[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo9596a();
        if (i < 0 || i > (i2 = this.f5867d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5867d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        boolean[] zArr = this.f5866c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f5866c, i, zArr2, i + 1, this.f5867d - i);
            this.f5866c = zArr2;
        }
        this.f5866c[i] = booleanValue;
        this.f5867d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo9596a();
        Charset charset = C2631w.f5973a;
        collection.getClass();
        if (!(collection instanceof C2576f)) {
            return super.addAll(collection);
        }
        C2576f fVar = (C2576f) collection;
        int i = fVar.f5867d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5867d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f5866c;
            if (i3 > zArr.length) {
                this.f5866c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.f5866c, 0, this.f5866c, this.f5867d, fVar.f5867d);
            this.f5867d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo9647c(boolean z) {
        mo9596a();
        int i = this.f5867d;
        boolean[] zArr = this.f5866c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f5866c = zArr2;
        }
        boolean[] zArr3 = this.f5866c;
        int i2 = this.f5867d;
        this.f5867d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: e */
    public final void mo9648e(int i) {
        if (i < 0 || i >= this.f5867d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5867d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2576f)) {
            return super.equals(obj);
        }
        C2576f fVar = (C2576f) obj;
        if (this.f5867d != fVar.f5867d) {
            return false;
        }
        boolean[] zArr = fVar.f5866c;
        for (int i = 0; i < this.f5867d; i++) {
            if (this.f5866c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo9648e(i);
        return Boolean.valueOf(this.f5866c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5867d; i2++) {
            int i3 = i * 31;
            boolean z = this.f5866c[i2];
            Charset charset = C2631w.f5973a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= this.f5867d) {
            return new C2576f(Arrays.copyOf(this.f5866c, i), this.f5867d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo9596a();
        for (int i = 0; i < this.f5867d; i++) {
            if (obj.equals(Boolean.valueOf(this.f5866c[i]))) {
                boolean[] zArr = this.f5866c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f5867d - i) - 1);
                this.f5867d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo9596a();
        if (i2 >= i) {
            boolean[] zArr = this.f5866c;
            System.arraycopy(zArr, i2, zArr, i, this.f5867d - i2);
            this.f5867d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo9596a();
        mo9648e(i);
        boolean[] zArr = this.f5866c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f5867d;
    }

    public C2576f(boolean[] zArr, int i) {
        this.f5866c = zArr;
        this.f5867d = i;
    }

    public final Object remove(int i) {
        mo9596a();
        mo9648e(i);
        boolean[] zArr = this.f5866c;
        boolean z = zArr[i];
        int i2 = this.f5867d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f5867d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean add(Object obj) {
        mo9647c(((Boolean) obj).booleanValue());
        return true;
    }
}
