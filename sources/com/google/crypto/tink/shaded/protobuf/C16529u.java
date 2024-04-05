package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u */
public final class C16529u extends C16469c<Integer> implements RandomAccess, C16526s0 {

    /* renamed from: c */
    public int[] f36699c;

    /* renamed from: d */
    public int f36700d;

    static {
        new C16529u(0, new int[0]).f36583b = false;
    }

    public C16529u() {
        this(0, new int[10]);
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo58670a();
        if (i < 0 || i > (i2 = this.f36700d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36700d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        int[] iArr = this.f36699c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f36699c, i, iArr2, i + 1, this.f36700d - i);
            this.f36699c = iArr2;
        }
        this.f36699c[i] = intValue;
        this.f36700d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo58670a();
        Charset charset = C16531v.f36704a;
        collection.getClass();
        if (!(collection instanceof C16529u)) {
            return super.addAll(collection);
        }
        C16529u uVar = (C16529u) collection;
        int i = uVar.f36700d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36700d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f36699c;
            if (i3 > iArr.length) {
                this.f36699c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(uVar.f36699c, 0, this.f36699c, this.f36700d, uVar.f36700d);
            this.f36700d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo58957c(int i) {
        mo58670a();
        int i2 = this.f36700d;
        int[] iArr = this.f36699c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f36699c = iArr2;
        }
        int[] iArr3 = this.f36699c;
        int i3 = this.f36700d;
        this.f36700d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: e */
    public final void mo58958e(int i) {
        if (i < 0 || i >= this.f36700d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36700d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16529u)) {
            return super.equals(obj);
        }
        C16529u uVar = (C16529u) obj;
        if (this.f36700d != uVar.f36700d) {
            return false;
        }
        int[] iArr = uVar.f36699c;
        for (int i = 0; i < this.f36700d; i++) {
            if (this.f36699c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo58958e(i);
        return Integer.valueOf(this.f36699c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36700d; i2++) {
            i = (i * 31) + this.f36699c[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final C16531v.C16535d mo58661i(int i) {
        if (i >= this.f36700d) {
            return new C16529u(this.f36700d, Arrays.copyOf(this.f36699c, i));
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo58670a();
        for (int i = 0; i < this.f36700d; i++) {
            if (obj.equals(Integer.valueOf(this.f36699c[i]))) {
                int[] iArr = this.f36699c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f36700d - i) - 1);
                this.f36700d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo58670a();
        if (i2 >= i) {
            int[] iArr = this.f36699c;
            System.arraycopy(iArr, i2, iArr, i, this.f36700d - i2);
            this.f36700d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo58670a();
        mo58958e(i);
        int[] iArr = this.f36699c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f36700d;
    }

    public C16529u(int i, int[] iArr) {
        this.f36699c = iArr;
        this.f36700d = i;
    }

    public final Object remove(int i) {
        mo58670a();
        mo58958e(i);
        int[] iArr = this.f36699c;
        int i2 = iArr[i];
        int i3 = this.f36700d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f36700d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean add(Object obj) {
        mo58957c(((Integer) obj).intValue());
        return true;
    }
}
