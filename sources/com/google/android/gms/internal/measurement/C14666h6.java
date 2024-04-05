package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p003a2.C0023f;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
public final class C14666h6 extends C14830u4<Long> implements RandomAccess, C14879y5, C14880y6 {

    /* renamed from: e */
    public static final C14666h6 f32866e;

    /* renamed from: c */
    public long[] f32867c;

    /* renamed from: d */
    public int f32868d;

    static {
        C14666h6 h6Var = new C14666h6(new long[0], 0);
        f32866e = h6Var;
        h6Var.f33094b = false;
    }

    public C14666h6() {
        this(new long[10], 0);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo50891a();
        if (i < 0 || i > (i2 = this.f32868d)) {
            throw new IndexOutOfBoundsException(mo50563e(i));
        }
        long[] jArr = this.f32867c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f32867c, i, jArr2, i + 1, this.f32868d - i);
            this.f32867c = jArr2;
        }
        this.f32867c[i] = longValue;
        this.f32868d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo50891a();
        Charset charset = C14575a6.f32740a;
        collection.getClass();
        if (!(collection instanceof C14666h6)) {
            return super.addAll(collection);
        }
        C14666h6 h6Var = (C14666h6) collection;
        int i = h6Var.f32868d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32868d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f32867c;
            if (i3 > jArr.length) {
                this.f32867c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(h6Var.f32867c, 0, this.f32867c, this.f32868d, h6Var.f32868d);
            this.f32868d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final C14891z5 mo50356b(int i) {
        if (i >= this.f32868d) {
            return new C14666h6(Arrays.copyOf(this.f32867c, i), this.f32868d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo50561c(long j) {
        mo50891a();
        int i = this.f32868d;
        long[] jArr = this.f32867c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f32867c = jArr2;
        }
        long[] jArr3 = this.f32867c;
        int i2 = this.f32868d;
        this.f32868d = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String mo50563e(int i) {
        return C0023f.m107h(35, "Index:", i, ", Size:", this.f32868d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14666h6)) {
            return super.equals(obj);
        }
        C14666h6 h6Var = (C14666h6) obj;
        if (this.f32868d != h6Var.f32868d) {
            return false;
        }
        long[] jArr = h6Var.f32867c;
        for (int i = 0; i < this.f32868d; i++) {
            if (this.f32867c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo50564g(int i) {
        if (i < 0 || i >= this.f32868d) {
            throw new IndexOutOfBoundsException(mo50563e(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo50564g(i);
        return Long.valueOf(this.f32867c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32868d; i2++) {
            i = (i * 31) + C14575a6.m23369a(this.f32867c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f32868d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32867c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo50891a();
        mo50564g(i);
        long[] jArr = this.f32867c;
        long j = jArr[i];
        int i2 = this.f32868d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f32868d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo50891a();
        if (i2 >= i) {
            long[] jArr = this.f32867c;
            System.arraycopy(jArr, i2, jArr, i, this.f32868d - i2);
            this.f32868d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo50891a();
        mo50564g(i);
        long[] jArr = this.f32867c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f32868d;
    }

    public C14666h6(long[] jArr, int i) {
        this.f32867c = jArr;
        this.f32868d = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo50561c(((Long) obj).longValue());
        return true;
    }
}
