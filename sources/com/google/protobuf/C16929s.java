package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.C16935v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s */
public final class C16929s extends C16872c<Float> implements RandomAccess, C16930s0 {

    /* renamed from: c */
    public float[] f37289c;

    /* renamed from: d */
    public int f37290d;

    static {
        new C16929s(new float[0], 0).f37182b = false;
    }

    public C16929s() {
        this(new float[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo59861a();
        if (i < 0 || i > (i2 = this.f37290d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37290d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        float[] fArr = this.f37289c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f37289c, i, fArr2, i + 1, this.f37290d - i);
            this.f37289c = fArr2;
        }
        this.f37289c[i] = floatValue;
        this.f37290d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo59861a();
        Charset charset = C16935v.f37301a;
        collection.getClass();
        if (!(collection instanceof C16929s)) {
            return super.addAll(collection);
        }
        C16929s sVar = (C16929s) collection;
        int i = sVar.f37290d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37290d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f37289c;
            if (i3 > fArr.length) {
                this.f37289c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(sVar.f37289c, 0, this.f37289c, this.f37290d, sVar.f37290d);
            this.f37290d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo60031c(float f) {
        mo59861a();
        int i = this.f37290d;
        float[] fArr = this.f37289c;
        if (i == fArr.length) {
            float[] fArr2 = new float[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f37289c = fArr2;
        }
        float[] fArr3 = this.f37289c;
        int i2 = this.f37290d;
        this.f37290d = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo60033e(int i) {
        if (i < 0 || i >= this.f37290d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37290d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16929s)) {
            return super.equals(obj);
        }
        C16929s sVar = (C16929s) obj;
        if (this.f37290d != sVar.f37290d) {
            return false;
        }
        float[] fArr = sVar.f37289c;
        for (int i = 0; i < this.f37290d; i++) {
            if (Float.floatToIntBits(this.f37289c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo60033e(i);
        return Float.valueOf(this.f37289c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37290d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f37289c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= this.f37290d) {
            return new C16929s(Arrays.copyOf(this.f37289c, i), this.f37290d);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f37290d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37289c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        mo59861a();
        mo60033e(i);
        float[] fArr = this.f37289c;
        float f = fArr[i];
        int i2 = this.f37290d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f37290d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo59861a();
        if (i2 >= i) {
            float[] fArr = this.f37289c;
            System.arraycopy(fArr, i2, fArr, i, this.f37290d - i2);
            this.f37290d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo59861a();
        mo60033e(i);
        float[] fArr = this.f37289c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f37290d;
    }

    public C16929s(float[] fArr, int i) {
        this.f37289c = fArr;
        this.f37290d = i;
    }

    public final boolean add(Object obj) {
        mo60031c(((Float) obj).floatValue());
        return true;
    }
}
