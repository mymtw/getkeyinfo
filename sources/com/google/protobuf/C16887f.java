package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.C16935v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f */
public final class C16887f extends C16872c<Boolean> implements RandomAccess, C16930s0 {

    /* renamed from: c */
    public boolean[] f37208c;

    /* renamed from: d */
    public int f37209d;

    static {
        new C16887f(new boolean[0], 0).f37182b = false;
    }

    public C16887f() {
        this(new boolean[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo59861a();
        if (i < 0 || i > (i2 = this.f37209d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37209d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        boolean[] zArr = this.f37208c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f37208c, i, zArr2, i + 1, this.f37209d - i);
            this.f37208c = zArr2;
        }
        this.f37208c[i] = booleanValue;
        this.f37209d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo59861a();
        Charset charset = C16935v.f37301a;
        collection.getClass();
        if (!(collection instanceof C16887f)) {
            return super.addAll(collection);
        }
        C16887f fVar = (C16887f) collection;
        int i = fVar.f37209d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37209d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f37208c;
            if (i3 > zArr.length) {
                this.f37208c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.f37208c, 0, this.f37208c, this.f37209d, fVar.f37209d);
            this.f37209d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo59905c(boolean z) {
        mo59861a();
        int i = this.f37209d;
        boolean[] zArr = this.f37208c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f37208c = zArr2;
        }
        boolean[] zArr3 = this.f37208c;
        int i2 = this.f37209d;
        this.f37209d = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo59907e(int i) {
        if (i < 0 || i >= this.f37209d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37209d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16887f)) {
            return super.equals(obj);
        }
        C16887f fVar = (C16887f) obj;
        if (this.f37209d != fVar.f37209d) {
            return false;
        }
        boolean[] zArr = fVar.f37208c;
        for (int i = 0; i < this.f37209d; i++) {
            if (this.f37208c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo59907e(i);
        return Boolean.valueOf(this.f37208c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37209d; i2++) {
            int i3 = i * 31;
            boolean z = this.f37208c[i2];
            Charset charset = C16935v.f37301a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= this.f37209d) {
            return new C16887f(Arrays.copyOf(this.f37208c, i), this.f37209d);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f37209d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37208c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        mo59861a();
        mo59907e(i);
        boolean[] zArr = this.f37208c;
        boolean z = zArr[i];
        int i2 = this.f37209d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f37209d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo59861a();
        if (i2 >= i) {
            boolean[] zArr = this.f37208c;
            System.arraycopy(zArr, i2, zArr, i, this.f37209d - i2);
            this.f37209d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo59861a();
        mo59907e(i);
        boolean[] zArr = this.f37208c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f37209d;
    }

    public C16887f(boolean[] zArr, int i) {
        this.f37208c = zArr;
        this.f37209d = i;
    }

    public final boolean add(Object obj) {
        mo59905c(((Boolean) obj).booleanValue());
        return true;
    }
}
