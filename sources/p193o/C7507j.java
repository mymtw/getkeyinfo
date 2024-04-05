package p193o;

import p173m.C7279a;

/* renamed from: o.j */
public final class C7507j<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f16746f = new Object();

    /* renamed from: b */
    public boolean f16747b = false;

    /* renamed from: c */
    public int[] f16748c;

    /* renamed from: d */
    public Object[] f16749d;

    /* renamed from: e */
    public int f16750e;

    public C7507j() {
        int i = 40;
        int i2 = 4;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f16748c = new int[i4];
        this.f16749d = new Object[i4];
    }

    /* renamed from: a */
    public final void mo19988a(int i, E e) {
        int i2 = this.f16750e;
        if (i2 == 0 || i > this.f16748c[i2 - 1]) {
            if (this.f16747b && i2 >= this.f16748c.length) {
                mo19992d();
            }
            int i3 = this.f16750e;
            if (i3 >= this.f16748c.length) {
                int i4 = (i3 + 1) * 4;
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
                int i7 = i4 / 4;
                int[] iArr = new int[i7];
                Object[] objArr = new Object[i7];
                int[] iArr2 = this.f16748c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f16749d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f16748c = iArr;
                this.f16749d = objArr;
            }
            this.f16748c[i3] = i;
            this.f16749d[i3] = e;
            this.f16750e = i3 + 1;
            return;
        }
        mo19994h(i, e);
    }

    /* renamed from: b */
    public final C7507j<E> clone() {
        try {
            C7507j<E> jVar = (C7507j) super.clone();
            jVar.f16748c = (int[]) this.f16748c.clone();
            jVar.f16749d = (Object[]) this.f16749d.clone();
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final boolean mo19990c(int i) {
        if (this.f16747b) {
            mo19992d();
        }
        return C7279a.m13946d(this.f16750e, i, this.f16748c) >= 0;
    }

    /* renamed from: d */
    public final void mo19992d() {
        int i = this.f16750e;
        int[] iArr = this.f16748c;
        Object[] objArr = this.f16749d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f16746f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f16747b = false;
        this.f16750e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f16749d[r3];
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo19993f(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            int[] r0 = r2.f16748c
            int r1 = r2.f16750e
            int r3 = p173m.C7279a.m13946d(r1, r3, r0)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f16749d
            r3 = r0[r3]
            java.lang.Object r0 = f16746f
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o.C7507j.mo19993f(int, java.lang.Integer):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo19994h(int i, E e) {
        int d = C7279a.m13946d(this.f16750e, i, this.f16748c);
        if (d >= 0) {
            this.f16749d[d] = e;
            return;
        }
        int i2 = ~d;
        int i3 = this.f16750e;
        if (i2 < i3) {
            Object[] objArr = this.f16749d;
            if (objArr[i2] == f16746f) {
                this.f16748c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f16747b && i3 >= this.f16748c.length) {
            mo19992d();
            i2 = ~C7279a.m13946d(this.f16750e, i, this.f16748c);
        }
        int i4 = this.f16750e;
        if (i4 >= this.f16748c.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f16748c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16749d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16748c = iArr;
            this.f16749d = objArr2;
        }
        int i9 = this.f16750e - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f16748c;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f16749d;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f16750e - i2);
        }
        this.f16748c[i2] = i;
        this.f16749d[i2] = e;
        this.f16750e++;
    }

    /* renamed from: i */
    public final int mo19995i() {
        if (this.f16747b) {
            mo19992d();
        }
        return this.f16750e;
    }

    /* renamed from: j */
    public final E mo19996j(int i) {
        if (this.f16747b) {
            mo19992d();
        }
        return this.f16749d[i];
    }

    public final String toString() {
        if (mo19995i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16750e * 28);
        sb.append('{');
        for (int i = 0; i < this.f16750e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f16747b) {
                mo19992d();
            }
            sb.append(this.f16748c[i]);
            sb.append('=');
            Object j = mo19996j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
