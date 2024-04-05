package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s */
public final class C16525s extends C16469c<Float> implements RandomAccess, C16526s0 {

    /* renamed from: c */
    public float[] f36693c;

    /* renamed from: d */
    public int f36694d;

    static {
        new C16525s(new float[0], 0).f36583b = false;
    }

    public C16525s() {
        this(new float[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo58670a();
        if (i < 0 || i > (i2 = this.f36694d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36694d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        float[] fArr = this.f36693c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f36693c, i, fArr2, i + 1, this.f36694d - i);
            this.f36693c = fArr2;
        }
        this.f36693c[i] = floatValue;
        this.f36694d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo58670a();
        Charset charset = C16531v.f36704a;
        collection.getClass();
        if (!(collection instanceof C16525s)) {
            return super.addAll(collection);
        }
        C16525s sVar = (C16525s) collection;
        int i = sVar.f36694d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36694d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f36693c;
            if (i3 > fArr.length) {
                this.f36693c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(sVar.f36693c, 0, this.f36693c, this.f36694d, sVar.f36694d);
            this.f36694d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo58948c(float f) {
        mo58670a();
        int i = this.f36694d;
        float[] fArr = this.f36693c;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f36693c = fArr2;
        }
        float[] fArr3 = this.f36693c;
        int i2 = this.f36694d;
        this.f36694d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: e */
    public final void mo58949e(int i) {
        if (i < 0 || i >= this.f36694d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36694d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16525s)) {
            return super.equals(obj);
        }
        C16525s sVar = (C16525s) obj;
        if (this.f36694d != sVar.f36694d) {
            return false;
        }
        float[] fArr = sVar.f36693c;
        for (int i = 0; i < this.f36694d; i++) {
            if (Float.floatToIntBits(this.f36693c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo58949e(i);
        return Float.valueOf(this.f36693c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36694d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f36693c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C16531v.C16535d mo58661i(int i) {
        if (i >= this.f36694d) {
            return new C16525s(Arrays.copyOf(this.f36693c, i), this.f36694d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo58670a();
        for (int i = 0; i < this.f36694d; i++) {
            if (obj.equals(Float.valueOf(this.f36693c[i]))) {
                float[] fArr = this.f36693c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f36694d - i) - 1);
                this.f36694d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo58670a();
        if (i2 >= i) {
            float[] fArr = this.f36693c;
            System.arraycopy(fArr, i2, fArr, i, this.f36694d - i2);
            this.f36694d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo58670a();
        mo58949e(i);
        float[] fArr = this.f36693c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f36694d;
    }

    public C16525s(float[] fArr, int i) {
        this.f36693c = fArr;
        this.f36694d = i;
    }

    public final Object remove(int i) {
        mo58670a();
        mo58949e(i);
        float[] fArr = this.f36693c;
        float f = fArr[i];
        int i2 = this.f36694d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f36694d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean add(Object obj) {
        mo58948c(((Float) obj).floatValue());
        return true;
    }
}
