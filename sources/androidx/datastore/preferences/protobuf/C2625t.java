package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.C2631w;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.t */
public final class C2625t extends C2563c<Float> implements RandomAccess, C2626t0 {

    /* renamed from: c */
    public float[] f5962c;

    /* renamed from: d */
    public int f5963d;

    static {
        new C2625t(new float[0], 0).f5841b = false;
    }

    public C2625t() {
        this(new float[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo9596a();
        if (i < 0 || i > (i2 = this.f5963d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5963d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        float[] fArr = this.f5962c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f5962c, i, fArr2, i + 1, this.f5963d - i);
            this.f5962c = fArr2;
        }
        this.f5962c[i] = floatValue;
        this.f5963d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo9596a();
        Charset charset = C2631w.f5973a;
        collection.getClass();
        if (!(collection instanceof C2625t)) {
            return super.addAll(collection);
        }
        C2625t tVar = (C2625t) collection;
        int i = tVar.f5963d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5963d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f5962c;
            if (i3 > fArr.length) {
                this.f5962c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(tVar.f5962c, 0, this.f5962c, this.f5963d, tVar.f5963d);
            this.f5963d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo9888c(float f) {
        mo9596a();
        int i = this.f5963d;
        float[] fArr = this.f5962c;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f5962c = fArr2;
        }
        float[] fArr3 = this.f5962c;
        int i2 = this.f5963d;
        this.f5963d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: e */
    public final void mo9889e(int i) {
        if (i < 0 || i >= this.f5963d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5963d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2625t)) {
            return super.equals(obj);
        }
        C2625t tVar = (C2625t) obj;
        if (this.f5963d != tVar.f5963d) {
            return false;
        }
        float[] fArr = tVar.f5962c;
        for (int i = 0; i < this.f5963d; i++) {
            if (Float.floatToIntBits(this.f5962c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo9889e(i);
        return Float.valueOf(this.f5962c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5963d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f5962c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= this.f5963d) {
            return new C2625t(Arrays.copyOf(this.f5962c, i), this.f5963d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo9596a();
        for (int i = 0; i < this.f5963d; i++) {
            if (obj.equals(Float.valueOf(this.f5962c[i]))) {
                float[] fArr = this.f5962c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f5963d - i) - 1);
                this.f5963d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo9596a();
        if (i2 >= i) {
            float[] fArr = this.f5962c;
            System.arraycopy(fArr, i2, fArr, i, this.f5963d - i2);
            this.f5963d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo9596a();
        mo9889e(i);
        float[] fArr = this.f5962c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f5963d;
    }

    public C2625t(float[] fArr, int i) {
        this.f5962c = fArr;
        this.f5963d = i;
    }

    public final Object remove(int i) {
        mo9596a();
        mo9889e(i);
        float[] fArr = this.f5962c;
        float f = fArr[i];
        int i2 = this.f5963d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f5963d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean add(Object obj) {
        mo9888c(((Float) obj).floatValue());
        return true;
    }
}
