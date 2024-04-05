package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.icing.f0 */
public final class C14495f0 extends C14510j<Integer> implements RandomAccess, C14508i1 {

    /* renamed from: c */
    public int[] f32634c;

    /* renamed from: d */
    public int f32635d;

    static {
        new C14495f0(0, new int[0]).f32650b = false;
    }

    public C14495f0() {
        this(0, new int[10]);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo49812a();
        if (i < 0 || i > (i2 = this.f32635d)) {
            throw new IndexOutOfBoundsException(mo49793e(i));
        }
        int[] iArr = this.f32634c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f32634c, i, iArr2, i + 1, this.f32635d - i);
            this.f32634c = iArr2;
        }
        this.f32634c[i] = intValue;
        this.f32635d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo49812a();
        Charset charset = C14515k0.f32655a;
        collection.getClass();
        if (!(collection instanceof C14495f0)) {
            return super.addAll(collection);
        }
        C14495f0 f0Var = (C14495f0) collection;
        int i = f0Var.f32635d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32635d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f32634c;
            if (i3 > iArr.length) {
                this.f32634c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(f0Var.f32634c, 0, this.f32634c, this.f32635d, f0Var.f32635d);
            this.f32635d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo49791c(int i) {
        if (i < 0 || i >= this.f32635d) {
            throw new IndexOutOfBoundsException(mo49793e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo49793e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32635d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14495f0)) {
            return super.equals(obj);
        }
        C14495f0 f0Var = (C14495f0) obj;
        if (this.f32635d != f0Var.f32635d) {
            return false;
        }
        int[] iArr = f0Var.f32634c;
        for (int i = 0; i < this.f32635d; i++) {
            if (this.f32634c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo49791c(i);
        return Integer.valueOf(this.f32634c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32635d; i2++) {
            i = (i * 31) + this.f32634c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f32635d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32634c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C14511j0 mo49798r(int i) {
        if (i >= this.f32635d) {
            return new C14495f0(this.f32635d, Arrays.copyOf(this.f32634c, i));
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo49812a();
        mo49791c(i);
        int[] iArr = this.f32634c;
        int i2 = iArr[i];
        int i3 = this.f32635d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f32635d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo49812a();
        if (i2 >= i) {
            int[] iArr = this.f32634c;
            System.arraycopy(iArr, i2, iArr, i, this.f32635d - i2);
            this.f32635d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo49812a();
        mo49791c(i);
        int[] iArr = this.f32634c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f32635d;
    }

    public C14495f0(int i, int[] iArr) {
        this.f32634c = iArr;
        this.f32635d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo49812a();
        int i = this.f32635d;
        int[] iArr = this.f32634c;
        if (i == iArr.length) {
            int[] iArr2 = new int[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f32634c = iArr2;
        }
        int[] iArr3 = this.f32634c;
        int i2 = this.f32635d;
        this.f32635d = i2 + 1;
        iArr3[i2] = intValue;
        return true;
    }
}
