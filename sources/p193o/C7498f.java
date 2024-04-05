package p193o;

import p173m.C7279a;

/* renamed from: o.f */
public final class C7498f<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f16719f = new Object();

    /* renamed from: b */
    public boolean f16720b;

    /* renamed from: c */
    public long[] f16721c;

    /* renamed from: d */
    public Object[] f16722d;

    /* renamed from: e */
    public int f16723e;

    public C7498f() {
        this(10);
    }

    /* renamed from: a */
    public final void mo19884a(long j, Long l) {
        int i = this.f16723e;
        if (i == 0 || j > this.f16721c[i - 1]) {
            if (this.f16720b && i >= this.f16721c.length) {
                mo19888d();
            }
            int i2 = this.f16723e;
            if (i2 >= this.f16721c.length) {
                int i3 = (i2 + 1) * 8;
                int i4 = 4;
                while (true) {
                    if (i4 >= 32) {
                        break;
                    }
                    int i5 = (1 << i4) - 12;
                    if (i3 <= i5) {
                        i3 = i5;
                        break;
                    }
                    i4++;
                }
                int i6 = i3 / 8;
                long[] jArr = new long[i6];
                Object[] objArr = new Object[i6];
                long[] jArr2 = this.f16721c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f16722d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f16721c = jArr;
                this.f16722d = objArr;
            }
            this.f16721c[i2] = j;
            this.f16722d[i2] = l;
            this.f16723e = i2 + 1;
            return;
        }
        mo19890h(j, l);
    }

    /* renamed from: b */
    public final void mo19885b() {
        int i = this.f16723e;
        Object[] objArr = this.f16722d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f16723e = 0;
        this.f16720b = false;
    }

    /* renamed from: c */
    public final C7498f<E> clone() {
        try {
            C7498f<E> fVar = (C7498f) super.clone();
            fVar.f16721c = (long[]) this.f16721c.clone();
            fVar.f16722d = (Object[]) this.f16722d.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void mo19888d() {
        int i = this.f16723e;
        long[] jArr = this.f16721c;
        Object[] objArr = this.f16722d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f16719f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f16720b = false;
        this.f16723e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f16722d[r3];
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo19889f(long r3, java.lang.Long r5) {
        /*
            r2 = this;
            long[] r0 = r2.f16721c
            int r1 = r2.f16723e
            int r3 = p173m.C7279a.m13947e(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f16722d
            r3 = r4[r3]
            java.lang.Object r4 = f16719f
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o.C7498f.mo19889f(long, java.lang.Long):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo19890h(long j, E e) {
        int e2 = C7279a.m13947e(this.f16721c, this.f16723e, j);
        if (e2 >= 0) {
            this.f16722d[e2] = e;
            return;
        }
        int i = ~e2;
        int i2 = this.f16723e;
        if (i < i2) {
            Object[] objArr = this.f16722d;
            if (objArr[i] == f16719f) {
                this.f16721c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f16720b && i2 >= this.f16721c.length) {
            mo19888d();
            i = ~C7279a.m13947e(this.f16721c, this.f16723e, j);
        }
        int i3 = this.f16723e;
        if (i3 >= this.f16721c.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f16721c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f16722d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16721c = jArr;
            this.f16722d = objArr2;
        }
        int i8 = this.f16723e - i;
        if (i8 != 0) {
            long[] jArr3 = this.f16721c;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f16722d;
            System.arraycopy(objArr4, i, objArr4, i9, this.f16723e - i);
        }
        this.f16721c[i] = j;
        this.f16722d[i] = e;
        this.f16723e++;
    }

    /* renamed from: i */
    public final int mo19891i() {
        if (this.f16720b) {
            mo19888d();
        }
        return this.f16723e;
    }

    /* renamed from: j */
    public final E mo19892j(int i) {
        if (this.f16720b) {
            mo19888d();
        }
        return this.f16722d[i];
    }

    public final String toString() {
        if (mo19891i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16723e * 28);
        sb.append('{');
        for (int i = 0; i < this.f16723e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f16720b) {
                mo19888d();
            }
            sb.append(this.f16721c[i]);
            sb.append('=');
            Object j = mo19892j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7498f(int i) {
        this.f16720b = false;
        if (i == 0) {
            this.f16721c = C7279a.f16140c;
            this.f16722d = C7279a.f16141d;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f16721c = new long[i5];
        this.f16722d = new Object[i5];
    }
}
