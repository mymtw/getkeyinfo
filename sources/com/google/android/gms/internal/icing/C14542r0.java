package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.icing.r0 */
public final class C14542r0 extends C14510j<Long> implements RandomAccess, C14507i0, C14508i1 {

    /* renamed from: e */
    public static final C14542r0 f32688e;

    /* renamed from: c */
    public long[] f32689c;

    /* renamed from: d */
    public int f32690d;

    static {
        C14542r0 r0Var = new C14542r0(new long[0], 0);
        f32688e = r0Var;
        r0Var.f32650b = false;
    }

    public C14542r0() {
        this(new long[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo49812a();
        if (i < 0 || i > (i2 = this.f32690d)) {
            throw new IndexOutOfBoundsException(mo49882e(i));
        }
        long[] jArr = this.f32689c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f32689c, i, jArr2, i + 1, this.f32690d - i);
            this.f32689c = jArr2;
        }
        this.f32689c[i] = longValue;
        this.f32690d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo49812a();
        Charset charset = C14515k0.f32655a;
        collection.getClass();
        if (!(collection instanceof C14542r0)) {
            return super.addAll(collection);
        }
        C14542r0 r0Var = (C14542r0) collection;
        int i = r0Var.f32690d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32690d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f32689c;
            if (i3 > jArr.length) {
                this.f32689c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(r0Var.f32689c, 0, this.f32689c, this.f32690d, r0Var.f32690d);
            this.f32690d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo49880c(int i) {
        if (i < 0 || i >= this.f32690d) {
            throw new IndexOutOfBoundsException(mo49882e(i));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo49882e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32690d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14542r0)) {
            return super.equals(obj);
        }
        C14542r0 r0Var = (C14542r0) obj;
        if (this.f32690d != r0Var.f32690d) {
            return false;
        }
        long[] jArr = r0Var.f32689c;
        for (int i = 0; i < this.f32690d; i++) {
            if (this.f32689c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo49880c(i);
        return Long.valueOf(this.f32689c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32690d; i2++) {
            i = (i * 31) + C14515k0.m23053a(this.f32689c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f32690d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32689c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C14511j0 mo49798r(int i) {
        if (i >= this.f32690d) {
            return new C14542r0(Arrays.copyOf(this.f32689c, i), this.f32690d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo49812a();
        mo49880c(i);
        long[] jArr = this.f32689c;
        long j = jArr[i];
        int i2 = this.f32690d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f32690d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo49812a();
        if (i2 >= i) {
            long[] jArr = this.f32689c;
            System.arraycopy(jArr, i2, jArr, i, this.f32690d - i2);
            this.f32690d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo49812a();
        mo49880c(i);
        long[] jArr = this.f32689c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f32690d;
    }

    public C14542r0(long[] jArr, int i) {
        this.f32689c = jArr;
        this.f32690d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        mo49812a();
        int i = this.f32690d;
        long[] jArr = this.f32689c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f32689c = jArr2;
        }
        long[] jArr3 = this.f32689c;
        int i2 = this.f32690d;
        this.f32690d = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }
}
