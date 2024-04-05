package com.google.common.collect;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.k1 */
public class C16191k1<K> {

    /* renamed from: a */
    public transient Object[] f36283a;

    /* renamed from: b */
    public transient int[] f36284b;

    /* renamed from: c */
    public transient int f36285c;

    /* renamed from: d */
    public transient int f36286d;

    /* renamed from: e */
    public transient int[] f36287e;

    /* renamed from: f */
    public transient long[] f36288f;

    /* renamed from: g */
    public transient float f36289g;

    /* renamed from: h */
    public transient int f36290h;

    /* renamed from: com.google.common.collect.k1$a */
    public class C16192a extends Multisets.C16064a<K> {
        @NullableDecl

        /* renamed from: b */
        public final K f36291b;

        /* renamed from: c */
        public int f36292c;

        public C16192a(int i) {
            this.f36291b = C16191k1.this.f36283a[i];
            this.f36292c = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
            if (com.google.common.base.C15791j.m25606a(r4.f36291b, r2.f36283a[r0]) != false) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int getCount() {
            /*
                r4 = this;
                int r0 = r4.f36292c
                r1 = -1
                if (r0 == r1) goto L_0x0017
                com.google.common.collect.k1 r2 = com.google.common.collect.C16191k1.this
                int r3 = r2.f36285c
                if (r0 >= r3) goto L_0x0017
                K r3 = r4.f36291b
                java.lang.Object[] r2 = r2.f36283a
                r0 = r2[r0]
                boolean r0 = com.google.common.base.C15791j.m25606a(r3, r0)
                if (r0 != 0) goto L_0x0021
            L_0x0017:
                com.google.common.collect.k1 r0 = com.google.common.collect.C16191k1.this
                K r2 = r4.f36291b
                int r0 = r0.mo57691f(r2)
                r4.f36292c = r0
            L_0x0021:
                int r0 = r4.f36292c
                if (r0 != r1) goto L_0x0027
                r0 = 0
                goto L_0x002d
            L_0x0027:
                com.google.common.collect.k1 r1 = com.google.common.collect.C16191k1.this
                int[] r1 = r1.f36284b
                r0 = r1[r0]
            L_0x002d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C16191k1.C16192a.getCount():int");
        }

        public final K getElement() {
            return this.f36291b;
        }
    }

    public C16191k1() {
        mo57692g(3);
    }

    /* renamed from: a */
    public void mo57686a() {
        this.f36286d++;
        Arrays.fill(this.f36283a, 0, this.f36285c, (Object) null);
        Arrays.fill(this.f36284b, 0, this.f36285c, 0);
        Arrays.fill(this.f36287e, -1);
        Arrays.fill(this.f36288f, -1);
        this.f36285c = 0;
    }

    /* renamed from: b */
    public final void mo57687b(int i) {
        if (i > this.f36288f.length) {
            mo57700o(i);
        }
        if (i >= this.f36290h) {
            mo57701p(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* renamed from: c */
    public int mo57688c() {
        return this.f36285c == 0 ? -1 : 0;
    }

    /* renamed from: d */
    public final int mo57689d(@NullableDecl Object obj) {
        int f = mo57691f(obj);
        if (f == -1) {
            return 0;
        }
        return this.f36284b[f];
    }

    /* renamed from: e */
    public final int mo57690e(int i) {
        C15794l.m25616j(i, this.f36285c);
        return this.f36284b[i];
    }

    /* renamed from: f */
    public final int mo57691f(@NullableDecl Object obj) {
        int c = C16184i0.m26180c(obj);
        int[] iArr = this.f36287e;
        int i = iArr[(iArr.length - 1) & c];
        while (i != -1) {
            long j = this.f36288f[i];
            if (((int) (j >>> 32)) == c && C15791j.m25606a(obj, this.f36283a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* renamed from: g */
    public void mo57692g(int i) {
        C15794l.m25614h(i >= 0, "Initial capacity must be non-negative");
        int a = C16184i0.m26178a(i, (double) 1.0f);
        int[] iArr = new int[a];
        Arrays.fill(iArr, -1);
        this.f36287e = iArr;
        this.f36289g = 1.0f;
        this.f36283a = new Object[i];
        this.f36284b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f36288f = jArr;
        this.f36290h = Math.max(1, (int) (((float) a) * 1.0f));
    }

    /* renamed from: h */
    public void mo57693h(@NullableDecl Object obj, int i, int i2, int i3) {
        this.f36288f[i] = (((long) i3) << 32) | UnsignedInteger.INT_MASK;
        this.f36283a[i] = obj;
        this.f36284b[i] = i2;
    }

    /* renamed from: i */
    public void mo57694i(int i) {
        int i2 = this.f36285c - 1;
        if (i < i2) {
            Object[] objArr = this.f36283a;
            objArr[i] = objArr[i2];
            int[] iArr = this.f36284b;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.f36288f;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int[] iArr2 = this.f36287e;
            int length = ((int) (j >>> 32)) & (iArr2.length - 1);
            int i3 = iArr2[length];
            if (i3 == i2) {
                iArr2[length] = i;
                return;
            }
            while (true) {
                long[] jArr2 = this.f36288f;
                long j2 = jArr2[i3];
                int i4 = (int) j2;
                if (i4 == i2) {
                    jArr2[i3] = (j2 & -4294967296L) | (((long) i) & UnsignedInteger.INT_MASK);
                    return;
                }
                i3 = i4;
            }
        } else {
            this.f36283a[i] = null;
            this.f36284b[i] = 0;
            this.f36288f[i] = -1;
        }
    }

    /* renamed from: j */
    public int mo57695j(int i) {
        int i2 = i + 1;
        if (i2 < this.f36285c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: k */
    public int mo57696k(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public final int mo57697l(int i, @NullableDecl Object obj) {
        C16203o.m26217d(i, ResponseConstants.COUNT);
        long[] jArr = this.f36288f;
        Object[] objArr = this.f36283a;
        int[] iArr = this.f36284b;
        int c = C16184i0.m26180c(obj);
        int[] iArr2 = this.f36287e;
        int length = (iArr2.length - 1) & c;
        int i2 = this.f36285c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) != c || !C15791j.m25606a(obj, objArr[i3])) {
                    int i4 = (int) j;
                    if (i4 == -1) {
                        jArr[i3] = (-4294967296L & j) | (((long) i2) & UnsignedInteger.INT_MASK);
                        break;
                    }
                    i3 = i4;
                } else {
                    int i5 = iArr[i3];
                    iArr[i3] = i;
                    return i5;
                }
            }
        }
        int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i2 != Integer.MAX_VALUE) {
            int i7 = i2 + 1;
            int length2 = this.f36288f.length;
            if (i7 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i6 = max;
                }
                if (i6 != length2) {
                    mo57700o(i6);
                }
            }
            mo57693h(obj, i2, i, c);
            this.f36285c = i7;
            if (i2 >= this.f36290h) {
                mo57701p(this.f36287e.length * 2);
            }
            this.f36286d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: m */
    public final int mo57698m(@NullableDecl Object obj, int i) {
        int[] iArr = this.f36287e;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f36288f[i2] >>> 32)) != i || !C15791j.m25606a(obj, this.f36283a[i2])) {
                int i4 = (int) this.f36288f[i2];
                if (i4 == -1) {
                    return 0;
                }
                int i5 = i4;
                i3 = i2;
                i2 = i5;
            } else {
                int i6 = this.f36284b[i2];
                if (i3 == -1) {
                    this.f36287e[length] = (int) this.f36288f[i2];
                } else {
                    long[] jArr = this.f36288f;
                    jArr[i3] = (jArr[i3] & -4294967296L) | (((long) ((int) jArr[i2])) & UnsignedInteger.INT_MASK);
                }
                mo57694i(i2);
                this.f36285c--;
                this.f36286d++;
                return i6;
            }
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: n */
    public final int mo57699n(int i) {
        return mo57698m(this.f36283a[i], (int) (this.f36288f[i] >>> 32));
    }

    /* renamed from: o */
    public void mo57700o(int i) {
        this.f36283a = Arrays.copyOf(this.f36283a, i);
        this.f36284b = Arrays.copyOf(this.f36284b, i);
        long[] jArr = this.f36288f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f36288f = copyOf;
    }

    /* renamed from: p */
    public final void mo57701p(int i) {
        if (this.f36287e.length >= 1073741824) {
            this.f36290h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i2 = ((int) (((float) i) * this.f36289g)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f36288f;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.f36285c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & UnsignedInteger.INT_MASK);
        }
        this.f36290h = i2;
        this.f36287e = iArr;
    }

    public C16191k1(C16191k1<? extends K> k1Var) {
        mo57692g(k1Var.f36285c);
        int c = k1Var.mo57688c();
        while (c != -1) {
            C15794l.m25616j(c, k1Var.f36285c);
            mo57697l(k1Var.mo57690e(c), k1Var.f36283a[c]);
            c = k1Var.mo57695j(c);
        }
    }

    public C16191k1(int i) {
        this(i, 0);
    }

    public C16191k1(int i, int i2) {
        mo57692g(i);
    }
}
