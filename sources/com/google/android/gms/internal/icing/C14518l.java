package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.icing.l */
public final class C14518l extends C14510j<Boolean> implements RandomAccess, C14499g0, C14508i1 {

    /* renamed from: e */
    public static final C14518l f32660e;

    /* renamed from: c */
    public boolean[] f32661c;

    /* renamed from: d */
    public int f32662d;

    static {
        C14518l lVar = new C14518l(new boolean[0], 0);
        f32660e = lVar;
        lVar.f32650b = false;
    }

    public C14518l() {
        this(new boolean[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo49812a();
        if (i < 0 || i > (i2 = this.f32662d)) {
            throw new IndexOutOfBoundsException(mo49833e(i));
        }
        boolean[] zArr = this.f32661c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f32661c, i, zArr2, i + 1, this.f32662d - i);
            this.f32661c = zArr2;
        }
        this.f32661c[i] = booleanValue;
        this.f32662d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo49812a();
        Charset charset = C14515k0.f32655a;
        collection.getClass();
        if (!(collection instanceof C14518l)) {
            return super.addAll(collection);
        }
        C14518l lVar = (C14518l) collection;
        int i = lVar.f32662d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32662d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f32661c;
            if (i3 > zArr.length) {
                this.f32661c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(lVar.f32661c, 0, this.f32661c, this.f32662d, lVar.f32662d);
            this.f32662d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo49831c(int i) {
        if (i < 0 || i >= this.f32662d) {
            throw new IndexOutOfBoundsException(mo49833e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo49833e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32662d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14518l)) {
            return super.equals(obj);
        }
        C14518l lVar = (C14518l) obj;
        if (this.f32662d != lVar.f32662d) {
            return false;
        }
        boolean[] zArr = lVar.f32661c;
        for (int i = 0; i < this.f32662d; i++) {
            if (this.f32661c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo49831c(i);
        return Boolean.valueOf(this.f32661c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32662d; i2++) {
            int i3 = i * 31;
            boolean z = this.f32661c[i2];
            Charset charset = C14515k0.f32655a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f32662d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32661c[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C14511j0 mo49798r(int i) {
        if (i >= this.f32662d) {
            return new C14518l(Arrays.copyOf(this.f32661c, i), this.f32662d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo49812a();
        mo49831c(i);
        boolean[] zArr = this.f32661c;
        boolean z = zArr[i];
        int i2 = this.f32662d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f32662d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo49812a();
        if (i2 >= i) {
            boolean[] zArr = this.f32661c;
            System.arraycopy(zArr, i2, zArr, i, this.f32662d - i2);
            this.f32662d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo49812a();
        mo49831c(i);
        boolean[] zArr = this.f32661c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f32662d;
    }

    public C14518l(boolean[] zArr, int i) {
        this.f32661c = zArr;
        this.f32662d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo49812a();
        int i = this.f32662d;
        boolean[] zArr = this.f32661c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f32661c = zArr2;
        }
        boolean[] zArr3 = this.f32661c;
        int i2 = this.f32662d;
        this.f32662d = i2 + 1;
        zArr3[i2] = booleanValue;
        return true;
    }
}
