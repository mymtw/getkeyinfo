package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.measurement.u5 */
public final class C14831u5 extends C14830u4<Integer> implements RandomAccess, C14867x5, C14880y6 {

    /* renamed from: e */
    public static final C14831u5 f33095e;

    /* renamed from: c */
    public int[] f33096c;

    /* renamed from: d */
    public int f33097d;

    static {
        C14831u5 u5Var = new C14831u5(0, new int[0]);
        f33095e = u5Var;
        u5Var.f33094b = false;
    }

    public C14831u5() {
        this(0, new int[10]);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo50891a();
        if (i < 0 || i > (i2 = this.f33097d)) {
            throw new IndexOutOfBoundsException(mo50900e(i));
        }
        int[] iArr = this.f33096c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f33096c, i, iArr2, i + 1, this.f33097d - i);
            this.f33096c = iArr2;
        }
        this.f33096c[i] = intValue;
        this.f33097d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo50891a();
        Charset charset = C14575a6.f32740a;
        collection.getClass();
        if (!(collection instanceof C14831u5)) {
            return super.addAll(collection);
        }
        C14831u5 u5Var = (C14831u5) collection;
        int i = u5Var.f33097d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f33097d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f33096c;
            if (i3 > iArr.length) {
                this.f33096c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(u5Var.f33096c, 0, this.f33096c, this.f33097d, u5Var.f33097d);
            this.f33097d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final C14891z5 mo50356b(int i) {
        if (i >= this.f33097d) {
            return new C14831u5(this.f33097d, Arrays.copyOf(this.f33096c, i));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo50898c(int i) {
        mo50891a();
        int i2 = this.f33097d;
        int[] iArr = this.f33096c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f33096c = iArr2;
        }
        int[] iArr3 = this.f33096c;
        int i3 = this.f33097d;
        this.f33097d = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo50900e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f33097d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14831u5)) {
            return super.equals(obj);
        }
        C14831u5 u5Var = (C14831u5) obj;
        if (this.f33097d != u5Var.f33097d) {
            return false;
        }
        int[] iArr = u5Var.f33096c;
        for (int i = 0; i < this.f33097d; i++) {
            if (this.f33096c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo50901g(int i) {
        if (i < 0 || i >= this.f33097d) {
            throw new IndexOutOfBoundsException(mo50900e(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo50901g(i);
        return Integer.valueOf(this.f33096c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f33097d; i2++) {
            i = (i * 31) + this.f33096c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f33097d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f33096c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50891a();
        mo50901g(i);
        int[] iArr = this.f33096c;
        int i2 = iArr[i];
        int i3 = this.f33097d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f33097d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo50891a();
        if (i2 >= i) {
            int[] iArr = this.f33096c;
            System.arraycopy(iArr, i2, iArr, i, this.f33097d - i2);
            this.f33097d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo50891a();
        mo50901g(i);
        int[] iArr = this.f33096c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f33097d;
    }

    public C14831u5(int i, int[] iArr) {
        this.f33096c = iArr;
        this.f33097d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo50898c(((Integer) obj).intValue());
        return true;
    }
}
