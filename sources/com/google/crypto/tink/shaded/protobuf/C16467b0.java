package com.google.crypto.tink.shaded.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b0 */
public final class C16467b0 extends C16469c<Long> implements RandomAccess, C16526s0 {

    /* renamed from: c */
    public long[] f36581c;

    /* renamed from: d */
    public int f36582d;

    static {
        new C16467b0(new long[0], 0).f36583b = false;
    }

    public C16467b0() {
        this(new long[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo58670a();
        if (i < 0 || i > (i2 = this.f36582d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36582d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        long[] jArr = this.f36581c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f36581c, i, jArr2, i + 1, this.f36582d - i);
            this.f36581c = jArr2;
        }
        this.f36581c[i] = longValue;
        this.f36582d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo58670a();
        Charset charset = C16531v.f36704a;
        collection.getClass();
        if (!(collection instanceof C16467b0)) {
            return super.addAll(collection);
        }
        C16467b0 b0Var = (C16467b0) collection;
        int i = b0Var.f36582d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36582d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f36581c;
            if (i3 > jArr.length) {
                this.f36581c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(b0Var.f36581c, 0, this.f36581c, this.f36582d, b0Var.f36582d);
            this.f36582d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo58656c(long j) {
        mo58670a();
        int i = this.f36582d;
        long[] jArr = this.f36581c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f36581c = jArr2;
        }
        long[] jArr3 = this.f36581c;
        int i2 = this.f36582d;
        this.f36582d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: e */
    public final void mo58657e(int i) {
        if (i < 0 || i >= this.f36582d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f36582d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16467b0)) {
            return super.equals(obj);
        }
        C16467b0 b0Var = (C16467b0) obj;
        if (this.f36582d != b0Var.f36582d) {
            return false;
        }
        long[] jArr = b0Var.f36581c;
        for (int i = 0; i < this.f36582d; i++) {
            if (this.f36581c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo58657e(i);
        return Long.valueOf(this.f36581c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36582d; i2++) {
            i = (i * 31) + C16531v.m27233a(this.f36581c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C16531v.C16535d mo58661i(int i) {
        if (i >= this.f36582d) {
            return new C16467b0(Arrays.copyOf(this.f36581c, i), this.f36582d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo58670a();
        for (int i = 0; i < this.f36582d; i++) {
            if (obj.equals(Long.valueOf(this.f36581c[i]))) {
                long[] jArr = this.f36581c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f36582d - i) - 1);
                this.f36582d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo58670a();
        if (i2 >= i) {
            long[] jArr = this.f36581c;
            System.arraycopy(jArr, i2, jArr, i, this.f36582d - i2);
            this.f36582d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo58670a();
        mo58657e(i);
        long[] jArr = this.f36581c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f36582d;
    }

    public C16467b0(long[] jArr, int i) {
        this.f36581c = jArr;
        this.f36582d = i;
    }

    public final Object remove(int i) {
        mo58670a();
        mo58657e(i);
        long[] jArr = this.f36581c;
        long j = jArr[i];
        int i2 = this.f36582d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f36582d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean add(Object obj) {
        mo58656c(((Long) obj).longValue());
        return true;
    }
}
