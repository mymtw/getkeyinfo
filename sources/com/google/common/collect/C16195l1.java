package com.google.common.collect;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.util.Arrays;

/* renamed from: com.google.common.collect.l1 */
public final class C16195l1<K> extends C16191k1<K> {

    /* renamed from: i */
    public transient long[] f36296i;

    /* renamed from: j */
    public transient int f36297j;

    /* renamed from: k */
    public transient int f36298k;

    public C16195l1(int i) {
        super(i, 0);
    }

    /* renamed from: a */
    public final void mo57686a() {
        super.mo57686a();
        this.f36297j = -2;
        this.f36298k = -2;
    }

    /* renamed from: c */
    public final int mo57688c() {
        int i = this.f36297j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* renamed from: g */
    public final void mo57692g(int i) {
        super.mo57692g(i);
        this.f36297j = -2;
        this.f36298k = -2;
        long[] jArr = new long[i];
        this.f36296i = jArr;
        Arrays.fill(jArr, -1);
    }

    /* renamed from: h */
    public final void mo57693h(Object obj, int i, int i2, int i3) {
        super.mo57693h(obj, i, i2, i3);
        mo57703q(this.f36298k, i);
        mo57703q(i, -2);
    }

    /* renamed from: i */
    public final void mo57694i(int i) {
        int i2 = this.f36285c - 1;
        long j = this.f36296i[i];
        mo57703q((int) (j >>> 32), (int) j);
        if (i < i2) {
            mo57703q((int) (this.f36296i[i2] >>> 32), i);
            mo57703q(i, (int) this.f36296i[i2]);
        }
        super.mo57694i(i);
    }

    /* renamed from: j */
    public final int mo57695j(int i) {
        int i2 = (int) this.f36296i[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    /* renamed from: k */
    public final int mo57696k(int i, int i2) {
        return i == this.f36285c ? i2 : i;
    }

    /* renamed from: o */
    public final void mo57700o(int i) {
        super.mo57700o(i);
        long[] jArr = this.f36296i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f36296i = copyOf;
        Arrays.fill(copyOf, length, i, -1);
    }

    /* renamed from: q */
    public final void mo57703q(int i, int i2) {
        if (i == -2) {
            this.f36297j = i2;
        } else {
            long[] jArr = this.f36296i;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & UnsignedInteger.INT_MASK);
        }
        if (i2 == -2) {
            this.f36298k = i;
            return;
        }
        long[] jArr2 = this.f36296i;
        jArr2[i2] = (UnsignedInteger.INT_MASK & jArr2[i2]) | (((long) i) << 32);
    }
}
