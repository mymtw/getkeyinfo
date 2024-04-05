package com.google.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.C16935v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.b0 */
public final class C16870b0 extends C16872c<Long> implements RandomAccess, C16930s0 {

    /* renamed from: c */
    public long[] f37180c;

    /* renamed from: d */
    public int f37181d;

    static {
        new C16870b0(new long[0], 0).f37182b = false;
    }

    public C16870b0() {
        this(new long[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo59861a();
        if (i < 0 || i > (i2 = this.f37181d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37181d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        long[] jArr = this.f37180c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f37180c, i, jArr2, i + 1, this.f37181d - i);
            this.f37180c = jArr2;
        }
        this.f37180c[i] = longValue;
        this.f37181d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo59861a();
        Charset charset = C16935v.f37301a;
        collection.getClass();
        if (!(collection instanceof C16870b0)) {
            return super.addAll(collection);
        }
        C16870b0 b0Var = (C16870b0) collection;
        int i = b0Var.f37181d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37181d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f37180c;
            if (i3 > jArr.length) {
                this.f37180c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(b0Var.f37180c, 0, this.f37180c, this.f37181d, b0Var.f37181d);
            this.f37181d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo59837c(long j) {
        mo59861a();
        int i = this.f37181d;
        long[] jArr = this.f37180c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f37180c = jArr2;
        }
        long[] jArr3 = this.f37180c;
        int i2 = this.f37181d;
        this.f37181d = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo59839e(int i) {
        if (i < 0 || i >= this.f37181d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f37181d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16870b0)) {
            return super.equals(obj);
        }
        C16870b0 b0Var = (C16870b0) obj;
        if (this.f37181d != b0Var.f37181d) {
            return false;
        }
        long[] jArr = b0Var.f37180c;
        for (int i = 0; i < this.f37181d; i++) {
            if (this.f37180c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo59839e(i);
        return Long.valueOf(this.f37180c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f37181d; i2++) {
            i = (i * 31) + C16935v.m28394a(this.f37180c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C16935v.C16942f mo59843i(int i) {
        if (i >= this.f37181d) {
            return new C16870b0(Arrays.copyOf(this.f37180c, i), this.f37181d);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f37181d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37180c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        mo59861a();
        mo59839e(i);
        long[] jArr = this.f37180c;
        long j = jArr[i];
        int i2 = this.f37181d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f37181d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo59861a();
        if (i2 >= i) {
            long[] jArr = this.f37180c;
            System.arraycopy(jArr, i2, jArr, i, this.f37181d - i2);
            this.f37181d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo59861a();
        mo59839e(i);
        long[] jArr = this.f37180c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f37181d;
    }

    public C16870b0(long[] jArr, int i) {
        this.f37180c = jArr;
        this.f37181d = i;
    }

    public final boolean add(Object obj) {
        mo59837c(((Long) obj).longValue());
        return true;
    }
}
