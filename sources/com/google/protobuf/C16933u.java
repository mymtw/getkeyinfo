package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.C16935v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u */
public final class C16933u extends C16872c<Integer> implements C16935v.C16939d, RandomAccess, C16930s0 {

    /* renamed from: e */
    public static final C16933u f37295e;

    /* renamed from: c */
    public int[] f37296c;

    /* renamed from: d */
    public int f37297d;

    static {
        C16933u uVar = new C16933u(0, new int[0]);
        f37295e = uVar;
        uVar.f37182b = false;
    }

    public C16933u() {
        this(0, new int[10]);
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo59861a();
        if (i < 0 || i > (i2 = this.f37297d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37297d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        int[] iArr = this.f37296c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f37296c, i, iArr2, i + 1, this.f37297d - i);
            this.f37296c = iArr2;
        }
        this.f37296c[i] = intValue;
        this.f37297d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo59861a();
        Charset charset = C16935v.f37301a;
        collection.getClass();
        if (!(collection instanceof C16933u)) {
            return super.addAll(collection);
        }
        C16933u uVar = (C16933u) collection;
        int i = uVar.f37297d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37297d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f37296c;
            if (i3 > iArr.length) {
                this.f37296c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(uVar.f37296c, 0, this.f37296c, this.f37297d, uVar.f37297d);
            this.f37297d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo60041c(int i) {
        mo59861a();
        int i2 = this.f37297d;
        int[] iArr = this.f37296c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f37296c = iArr2;
        }
        int[] iArr3 = this.f37296c;
        int i3 = this.f37297d;
        this.f37297d = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo60043e(int i) {
        if (i < 0 || i >= this.f37297d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37297d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16933u)) {
            return super.equals(obj);
        }
        C16933u uVar = (C16933u) obj;
        if (this.f37297d != uVar.f37297d) {
            return false;
        }
        int[] iArr = uVar.f37296c;
        for (int i = 0; i < this.f37297d; i++) {
            if (this.f37296c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final int mo60044g(int i) {
        mo60043e(i);
        return this.f37296c[i];
    }

    public final Object get(int i) {
        return Integer.valueOf(mo60044g(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37297d; i2++) {
            i = (i * 31) + this.f37296c[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= this.f37297d) {
            return new C16933u(this.f37297d, Arrays.copyOf(this.f37296c, i));
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f37297d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37296c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        mo59861a();
        mo60043e(i);
        int[] iArr = this.f37296c;
        int i2 = iArr[i];
        int i3 = this.f37297d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f37297d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo59861a();
        if (i2 >= i) {
            int[] iArr = this.f37296c;
            System.arraycopy(iArr, i2, iArr, i, this.f37297d - i2);
            this.f37297d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo59861a();
        mo60043e(i);
        int[] iArr = this.f37296c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f37297d;
    }

    public C16933u(int i, int[] iArr) {
        this.f37296c = iArr;
        this.f37297d = i;
    }

    public final boolean add(Object obj) {
        mo60041c(((Integer) obj).intValue());
        return true;
    }
}
