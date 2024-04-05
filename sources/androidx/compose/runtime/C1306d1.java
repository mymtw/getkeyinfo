package androidx.compose.runtime;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;

/* renamed from: androidx.compose.runtime.d1 */
public final class C1306d1 {

    /* renamed from: a */
    public final C1301c1 f2832a;

    /* renamed from: b */
    public int[] f2833b;

    /* renamed from: c */
    public Object[] f2834c;

    /* renamed from: d */
    public ArrayList<C1296b> f2835d;

    /* renamed from: e */
    public int f2836e;

    /* renamed from: f */
    public int f2837f;

    /* renamed from: g */
    public int f2838g;

    /* renamed from: h */
    public int f2839h;

    /* renamed from: i */
    public int f2840i;

    /* renamed from: j */
    public int f2841j;

    /* renamed from: k */
    public int f2842k;

    /* renamed from: l */
    public int f2843l;

    /* renamed from: m */
    public int f2844m;

    /* renamed from: n */
    public int f2845n;

    /* renamed from: o */
    public final C1423y f2846o = new C1423y();

    /* renamed from: p */
    public final C1423y f2847p = new C1423y();

    /* renamed from: q */
    public final C1423y f2848q = new C1423y();

    /* renamed from: r */
    public int f2849r;

    /* renamed from: s */
    public int f2850s = -1;

    /* renamed from: t */
    public boolean f2851t;

    /* renamed from: u */
    public C1353o0 f2852u;

    /* renamed from: androidx.compose.runtime.d1$a */
    public static final class C1307a {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: kotlin.collections.EmptyList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x017f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.util.List m2683a(androidx.compose.runtime.C1306d1 r21, int r22, androidx.compose.runtime.C1306d1 r23, boolean r24, boolean r25) {
            /*
                r0 = r21
                r1 = r22
                r2 = r23
                int r3 = r21.mo5680o(r22)
                int r4 = r1 + r3
                int[] r5 = r0.f2833b
                int r6 = r21.mo5679n(r22)
                int r5 = r0.mo5672g(r6, r5)
                int[] r6 = r0.f2833b
                int r7 = r0.mo5679n(r4)
                int r6 = r0.mo5672g(r7, r6)
                int r7 = r6 - r5
                r9 = 1
                if (r1 < 0) goto L_0x003c
                int[] r10 = r0.f2833b
                int r11 = r21.mo5679n(r22)
                int r11 = r11 * 5
                int r11 = r11 + r9
                r10 = r10[r11]
                r11 = 201326592(0xc000000, float:9.8607613E-32)
                r10 = r10 & r11
                if (r10 == 0) goto L_0x0037
                r10 = r9
                goto L_0x0038
            L_0x0037:
                r10 = 0
            L_0x0038:
                if (r10 == 0) goto L_0x003c
                r10 = r9
                goto L_0x003d
            L_0x003c:
                r10 = 0
            L_0x003d:
                r2.mo5682q(r3)
                int r11 = r2.f2849r
                r2.mo5683r(r7, r11)
                int r11 = r0.f2836e
                if (r11 >= r4) goto L_0x004c
                r0.mo5687u(r4)
            L_0x004c:
                int r11 = r0.f2841j
                if (r11 >= r6) goto L_0x0053
                r0.mo5688v(r6, r4)
            L_0x0053:
                int[] r11 = r2.f2833b
                int r12 = r2.f2849r
                int[] r13 = r0.f2833b
                int r14 = r12 * 5
                int r15 = r1 * 5
                int r8 = r4 * 5
                kotlin.collections.C19318k.m32600R0(r14, r15, r8, r13, r11)
                java.lang.Object[] r8 = r2.f2834c
                int r13 = r2.f2839h
                java.lang.Object[] r15 = r0.f2834c
                kotlin.collections.C19318k.m32603U0(r15, r13, r8, r5, r6)
                int r6 = r2.f2850s
                int r14 = r14 + 2
                r11[r14] = r6
                int r14 = r12 - r1
                int r15 = r12 + r3
                int r16 = r2.mo5672g(r12, r11)
                int r16 = r13 - r16
                int r9 = r2.f2843l
                r17 = r9
                int r9 = r2.f2842k
                int r8 = r8.length
                r18 = r6
                r6 = r17
                r17 = r10
                r10 = r12
            L_0x0089:
                if (r10 >= r15) goto L_0x00c2
                if (r10 == r12) goto L_0x0097
                int r19 = r10 * 5
                int r19 = r19 + 2
                r20 = r11[r19]
                int r20 = r20 + r14
                r11[r19] = r20
            L_0x0097:
                int r19 = r2.mo5672g(r10, r11)
                r20 = r13
                int r13 = r19 + r16
                if (r6 >= r10) goto L_0x00a5
                r19 = r15
                r15 = 0
                goto L_0x00a9
            L_0x00a5:
                r19 = r15
                int r15 = r2.f2841j
            L_0x00a9:
                if (r13 <= r15) goto L_0x00b1
                int r15 = r8 - r9
                int r15 = r15 - r13
                r13 = 1
                int r15 = r15 + r13
                int r13 = -r15
            L_0x00b1:
                int r15 = r10 * 5
                int r15 = r15 + 4
                r11[r15] = r13
                if (r10 != r6) goto L_0x00bb
                int r6 = r6 + 1
            L_0x00bb:
                int r10 = r10 + 1
                r15 = r19
                r13 = r20
                goto L_0x0089
            L_0x00c2:
                r20 = r13
                r19 = r15
                r2.f2843l = r6
                java.util.ArrayList<androidx.compose.runtime.b> r6 = r0.f2835d
                int r8 = r21.mo5678m()
                int r6 = p001a0.C0005b.m7A(r6, r1, r8)
                java.util.ArrayList<androidx.compose.runtime.b> r8 = r0.f2835d
                int r9 = r21.mo5678m()
                int r4 = p001a0.C0005b.m7A(r8, r4, r9)
                if (r6 >= r4) goto L_0x0119
                java.util.ArrayList<androidx.compose.runtime.b> r8 = r0.f2835d
                java.util.ArrayList r9 = new java.util.ArrayList
                int r10 = r4 - r6
                r9.<init>(r10)
                r10 = r6
            L_0x00e8:
                if (r10 >= r4) goto L_0x0100
                java.lang.Object r13 = r8.get(r10)
                java.lang.String r15 = "sourceAnchors[anchorIndex]"
                kotlin.jvm.internal.C19383o.m32796f(r13, r15)
                androidx.compose.runtime.b r13 = (androidx.compose.runtime.C1296b) r13
                int r15 = r13.f2800a
                int r15 = r15 + r14
                r13.f2800a = r15
                r9.add(r13)
                int r10 = r10 + 1
                goto L_0x00e8
            L_0x0100:
                java.util.ArrayList<androidx.compose.runtime.b> r10 = r2.f2835d
                int r13 = r2.f2849r
                int r14 = r23.mo5678m()
                int r10 = p001a0.C0005b.m7A(r10, r13, r14)
                java.util.ArrayList<androidx.compose.runtime.b> r13 = r2.f2835d
                r13.addAll(r10, r9)
                java.util.List r4 = r8.subList(r6, r4)
                r4.clear()
                goto L_0x011b
            L_0x0119:
                kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.INSTANCE
            L_0x011b:
                int r4 = r21.mo5691y(r22)
                if (r24 == 0) goto L_0x014e
                if (r4 < 0) goto L_0x0125
                r8 = 1
                goto L_0x0126
            L_0x0125:
                r8 = 0
            L_0x0126:
                if (r8 == 0) goto L_0x0134
                r21.mo5661J()
                int r3 = r0.f2849r
                int r4 = r4 - r3
                r0.mo5666a(r4)
                r21.mo5661J()
            L_0x0134:
                int r3 = r0.f2849r
                int r1 = r1 - r3
                r0.mo5666a(r1)
                boolean r1 = r21.mo5653B()
                if (r8 == 0) goto L_0x014c
                r21.mo5658G()
                r21.mo5674i()
                r21.mo5658G()
                r21.mo5674i()
            L_0x014c:
                r4 = 1
                goto L_0x0158
            L_0x014e:
                boolean r3 = r0.mo5654C(r1, r3)
                r4 = 1
                int r1 = r1 - r4
                r0.mo5655D(r5, r7, r1)
                r1 = r3
            L_0x0158:
                r0 = r1 ^ 1
                if (r0 == 0) goto L_0x017f
                int r0 = r2.f2845n
                boolean r1 = p001a0.C0005b.m68y(r12, r11)
                if (r1 == 0) goto L_0x0166
                r1 = r4
                goto L_0x016a
            L_0x0166:
                int r1 = p001a0.C0005b.m8B(r12, r11)
            L_0x016a:
                int r0 = r0 + r1
                r2.f2845n = r0
                if (r25 == 0) goto L_0x0177
                r12 = r19
                r2.f2849r = r12
                int r13 = r20 + r7
                r2.f2839h = r13
            L_0x0177:
                if (r17 == 0) goto L_0x017e
                r0 = r18
                r2.mo5664M(r0)
            L_0x017e:
                return r9
            L_0x017f:
                java.lang.String r0 = "Unexpectedly removed anchors"
                java.lang.String r0 = r0.toString()
                androidx.compose.runtime.ComposerKt.m2526c(r0)
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1306d1.C1307a.m2683a(androidx.compose.runtime.d1, int, androidx.compose.runtime.d1, boolean, boolean):java.util.List");
        }
    }

    static {
        new C1307a();
    }

    public C1306d1(C1301c1 c1Var) {
        C19383o.m32797g(c1Var, "table");
        this.f2832a = c1Var;
        int[] iArr = c1Var.f2820b;
        this.f2833b = iArr;
        Object[] objArr = c1Var.f2822d;
        this.f2834c = objArr;
        this.f2835d = c1Var.f2827i;
        int i = c1Var.f2821c;
        this.f2836e = i;
        this.f2837f = (iArr.length / 5) - i;
        this.f2838g = i;
        int i2 = c1Var.f2823e;
        this.f2841j = i2;
        this.f2842k = objArr.length - i2;
        this.f2843l = i;
    }

    /* renamed from: A */
    public final void mo5652A() {
        boolean z;
        boolean z2;
        C1353o0 o0Var = this.f2852u;
        if (o0Var != null) {
            while (!((List) o0Var.f2952b).isEmpty()) {
                int b = o0Var.mo5904b();
                int n = mo5679n(b);
                int i = b + 1;
                int o = mo5680o(b) + b;
                while (true) {
                    z = false;
                    if (i >= o) {
                        z2 = false;
                        break;
                    }
                    if ((this.f2833b[(mo5679n(i) * 5) + 1] & 201326592) != 0) {
                        z2 = true;
                        break;
                    }
                    i += mo5680o(i);
                }
                if (C0005b.m59s(n, this.f2833b) != z2) {
                    z = true;
                }
                if (z) {
                    int[] iArr = this.f2833b;
                    int i2 = (n * 5) + 1;
                    if (z2) {
                        iArr[i2] = iArr[i2] | 67108864;
                    } else {
                        iArr[i2] = iArr[i2] & -67108865;
                    }
                    int y = mo5691y(b);
                    if (y >= 0) {
                        o0Var.mo5903a(y);
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public final boolean mo5653B() {
        if (this.f2844m == 0) {
            int i = this.f2849r;
            int i2 = this.f2839h;
            int F = mo5657F();
            C1353o0 o0Var = this.f2852u;
            if (o0Var != null) {
                while ((!((List) o0Var.f2952b).isEmpty()) && ((Number) C19327t.m32638T0((List) o0Var.f2952b)).intValue() >= i) {
                    o0Var.mo5904b();
                }
            }
            boolean C = mo5654C(i, this.f2849r - i);
            mo5655D(i2, this.f2839h - i2, i - 1);
            this.f2849r = i;
            this.f2839h = i2;
            this.f2845n -= F;
            return C;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    /* renamed from: C */
    public final boolean mo5654C(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i2 <= 0) {
            return false;
        }
        ArrayList<C1296b> arrayList = this.f2835d;
        mo5687u(i);
        if (!arrayList.isEmpty()) {
            int i3 = i2 + i;
            int A = C0005b.m7A(this.f2835d, i3, (this.f2833b.length / 5) - this.f2837f);
            if (A >= this.f2835d.size()) {
                A--;
            }
            int i4 = A + 1;
            int i5 = 0;
            while (A >= 0) {
                C1296b bVar = this.f2835d.get(A);
                C19383o.m32796f(bVar, "anchors[index]");
                C1296b bVar2 = bVar;
                int c = mo5668c(bVar2);
                if (c < i) {
                    break;
                }
                if (c < i3) {
                    bVar2.f2800a = Integer.MIN_VALUE;
                    if (i5 == 0) {
                        i5 = A + 1;
                    }
                    i4 = A;
                }
                A--;
            }
            z = i4 < i5;
            if (z) {
                this.f2835d.subList(i4, i5).clear();
            }
        } else {
            z = false;
        }
        this.f2836e = i;
        this.f2837f += i2;
        int i6 = this.f2843l;
        if (i6 > i) {
            this.f2843l = Math.max(i, i6 - i2);
        }
        int i7 = this.f2838g;
        if (i7 >= this.f2836e) {
            this.f2838g = i7 - i2;
        }
        int i8 = this.f2850s;
        if (i8 >= 0) {
            if (C0005b.m59s(mo5679n(i8), this.f2833b)) {
                z2 = true;
            }
        }
        if (z2) {
            mo5664M(this.f2850s);
        }
        return z;
    }

    /* renamed from: D */
    public final void mo5655D(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f2842k;
            int i5 = i + i2;
            mo5688v(i5, i3);
            this.f2841j = i;
            this.f2842k = i4 + i2;
            C19318k.m32609a1(i, this.f2834c, i5);
            int i6 = this.f2840i;
            if (i6 >= i) {
                this.f2840i = i6 - i2;
            }
        }
    }

    /* renamed from: E */
    public final Object mo5656E(int i, Object obj) {
        int I = mo5660I(mo5679n(this.f2849r), this.f2833b);
        boolean z = true;
        int g = mo5672g(mo5679n(this.f2849r + 1), this.f2833b);
        int i2 = I + i;
        if (i2 < I || i2 >= g) {
            z = false;
        }
        if (z) {
            int h = mo5673h(i2);
            Object[] objArr = this.f2834c;
            Object obj2 = objArr[h];
            objArr[h] = obj;
            return obj2;
        }
        StringBuilder h2 = C0069a.m177h("Write to an invalid slot index ", i, " for group ");
        h2.append(this.f2849r);
        ComposerKt.m2526c(h2.toString().toString());
        throw null;
    }

    /* renamed from: F */
    public final int mo5657F() {
        int n = mo5679n(this.f2849r);
        int u = C0005b.m63u(n, this.f2833b) + this.f2849r;
        this.f2849r = u;
        this.f2839h = mo5672g(mo5679n(u), this.f2833b);
        if (C0005b.m68y(n, this.f2833b)) {
            return 1;
        }
        return C0005b.m8B(n, this.f2833b);
    }

    /* renamed from: G */
    public final void mo5658G() {
        int i = this.f2838g;
        this.f2849r = i;
        this.f2839h = mo5672g(mo5679n(i), this.f2833b);
    }

    /* renamed from: H */
    public final Object mo5659H(int i, int i2) {
        int I = mo5660I(mo5679n(i), this.f2833b);
        boolean z = true;
        int g = mo5672g(mo5679n(i + 1), this.f2833b);
        int i3 = i2 + I;
        if (I > i3 || i3 >= g) {
            z = false;
        }
        if (!z) {
            return C1302d.C1303a.f2828a;
        }
        return this.f2834c[mo5673h(i3)];
    }

    /* renamed from: I */
    public final int mo5660I(int i, int[] iArr) {
        if (i >= this.f2833b.length / 5) {
            return this.f2834c.length - this.f2842k;
        }
        int F = C0005b.m12F(i, iArr);
        return F < 0 ? (this.f2834c.length - this.f2842k) + F + 1 : F;
    }

    /* renamed from: J */
    public final void mo5661J() {
        if (this.f2844m == 0) {
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            mo5662K(aVar, 0, aVar, false);
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    /* renamed from: K */
    public final void mo5662K(Object obj, int i, Object obj2, boolean z) {
        int i2;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i3 = 1;
        boolean z2 = this.f2844m > 0;
        this.f2848q.mo6115b(this.f2845n);
        if (z2) {
            mo5682q(1);
            int i4 = this.f2849r;
            int n = mo5679n(i4);
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            boolean z3 = obj3 != aVar;
            if (z || obj4 == aVar) {
                i3 = 0;
            }
            int[] iArr = this.f2833b;
            int i5 = this.f2850s;
            int i6 = this.f2839h;
            int i7 = z ? 1073741824 : 0;
            int i8 = z3 ? 536870912 : 0;
            int i9 = i3 != 0 ? 268435456 : 0;
            int i10 = n * 5;
            iArr[i10 + 0] = i;
            iArr[i10 + 1] = i7 | i8 | i9;
            iArr[i10 + 2] = i5;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = i6;
            this.f2840i = i6;
            int i11 = (z ? 1 : 0) + (z3 ? 1 : 0) + i3;
            if (i11 > 0) {
                mo5683r(i11, i4);
                Object[] objArr = this.f2834c;
                int i12 = this.f2839h;
                if (z) {
                    objArr[i12] = obj4;
                    i12++;
                }
                if (z3) {
                    objArr[i12] = obj3;
                    i12++;
                }
                if (i3 != 0) {
                    objArr[i12] = obj4;
                    i12++;
                }
                this.f2839h = i12;
            }
            this.f2845n = 0;
            i2 = i4 + 1;
            this.f2850s = i4;
            this.f2849r = i2;
        } else {
            this.f2846o.mo6115b(this.f2850s);
            this.f2847p.mo6115b(((this.f2833b.length / 5) - this.f2837f) - this.f2838g);
            int i13 = this.f2849r;
            int n2 = mo5679n(i13);
            if (!C19383o.m32792b(obj4, C1302d.C1303a.f2828a)) {
                if (z) {
                    mo5665N(this.f2849r, obj4);
                } else {
                    mo5663L(obj4);
                }
            }
            this.f2839h = mo5660I(n2, this.f2833b);
            this.f2840i = mo5672g(mo5679n(this.f2849r + 1), this.f2833b);
            this.f2845n = C0005b.m8B(n2, this.f2833b);
            this.f2850s = i13;
            this.f2849r = i13 + 1;
            i2 = i13 + C0005b.m63u(n2, this.f2833b);
        }
        this.f2838g = i2;
    }

    /* renamed from: L */
    public final void mo5663L(Object obj) {
        int n = mo5679n(this.f2849r);
        if (C0005b.m65v(n, this.f2833b)) {
            this.f2834c[mo5673h(mo5669d(n, this.f2833b))] = obj;
        } else {
            ComposerKt.m2526c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    /* renamed from: M */
    public final void mo5664M(int i) {
        if (i >= 0) {
            C1353o0 o0Var = this.f2852u;
            if (o0Var == null) {
                o0Var = new C1353o0();
                this.f2852u = o0Var;
            }
            o0Var.mo5903a(i);
        }
    }

    /* renamed from: N */
    public final void mo5665N(int i, Object obj) {
        int n = mo5679n(i);
        int[] iArr = this.f2833b;
        if (n < iArr.length && C0005b.m68y(n, iArr)) {
            this.f2834c[mo5673h(mo5672g(n, this.f2833b))] = obj;
            return;
        }
        ComposerKt.m2526c(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    /* renamed from: a */
    public final void mo5666a(int i) {
        boolean z = true;
        if (i >= 0) {
            if (!(this.f2844m <= 0)) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i != 0) {
                int i2 = this.f2849r + i;
                if (i2 < this.f2850s || i2 > this.f2838g) {
                    z = false;
                }
                if (z) {
                    this.f2849r = i2;
                    int g = mo5672g(mo5679n(i2), this.f2833b);
                    this.f2839h = g;
                    this.f2840i = g;
                    return;
                }
                StringBuilder h = C0072d.m201h("Cannot seek outside the current group (");
                h.append(this.f2850s);
                h.append('-');
                h.append(this.f2838g);
                h.append(')');
                ComposerKt.m2526c(h.toString().toString());
                throw null;
            }
        } else {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
    }

    /* renamed from: b */
    public final C1296b mo5667b(int i) {
        ArrayList<C1296b> arrayList = this.f2835d;
        int n0 = C0005b.m51n0(arrayList, i, mo5678m());
        if (n0 < 0) {
            if (i > this.f2836e) {
                i = -(mo5678m() - i);
            }
            C1296b bVar = new C1296b(i);
            arrayList.add(-(n0 + 1), bVar);
            return bVar;
        }
        C1296b bVar2 = arrayList.get(n0);
        C19383o.m32796f(bVar2, "get(location)");
        return bVar2;
    }

    /* renamed from: c */
    public final int mo5668c(C1296b bVar) {
        C19383o.m32797g(bVar, "anchor");
        int i = bVar.f2800a;
        return i < 0 ? i + mo5678m() : i;
    }

    /* renamed from: d */
    public final int mo5669d(int i, int[] iArr) {
        return C0005b.m27U(iArr[(i * 5) + 1] >> 29) + mo5672g(i, iArr);
    }

    /* renamed from: e */
    public final void mo5670e() {
        int i = this.f2844m;
        this.f2844m = i + 1;
        if (i == 0) {
            this.f2847p.mo6115b(((this.f2833b.length / 5) - this.f2837f) - this.f2838g);
        }
    }

    /* renamed from: f */
    public final void mo5671f() {
        boolean z = true;
        this.f2851t = true;
        if (this.f2846o.f3095b == 0) {
            mo5687u(mo5678m());
            mo5688v(this.f2834c.length - this.f2842k, this.f2836e);
            mo5652A();
        }
        C1301c1 c1Var = this.f2832a;
        int[] iArr = this.f2833b;
        int i = this.f2836e;
        Object[] objArr = this.f2834c;
        int i2 = this.f2841j;
        ArrayList<C1296b> arrayList = this.f2835d;
        c1Var.getClass();
        C19383o.m32797g(iArr, "groups");
        C19383o.m32797g(objArr, "slots");
        C19383o.m32797g(arrayList, "anchors");
        if (this.f2832a != c1Var || !c1Var.f2825g) {
            z = false;
        }
        if (z) {
            c1Var.f2825g = false;
            c1Var.f2820b = iArr;
            c1Var.f2821c = i;
            c1Var.f2822d = objArr;
            c1Var.f2823e = i2;
            c1Var.f2827i = arrayList;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    /* renamed from: g */
    public final int mo5672g(int i, int[] iArr) {
        if (i >= this.f2833b.length / 5) {
            return this.f2834c.length - this.f2842k;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f2834c.length - this.f2842k) + i2 + 1 : i2;
    }

    /* renamed from: h */
    public final int mo5673h(int i) {
        return i < this.f2841j ? i : i + this.f2842k;
    }

    /* renamed from: i */
    public final void mo5674i() {
        int i = 1;
        int i2 = 0;
        boolean z = this.f2844m > 0;
        int i3 = this.f2849r;
        int i4 = this.f2838g;
        int i5 = this.f2850s;
        int n = mo5679n(i5);
        int i6 = this.f2845n;
        int i7 = i3 - i5;
        boolean y = C0005b.m68y(n, this.f2833b);
        if (z) {
            C0005b.m13G(n, i7, this.f2833b);
            C0005b.m14H(n, i6, this.f2833b);
            int a = this.f2848q.mo6114a();
            if (!y) {
                i = i6;
            }
            this.f2845n = a + i;
            this.f2850s = mo5692z(i5, this.f2833b);
            return;
        }
        if (i3 != i4) {
            i = 0;
        }
        if (i != 0) {
            int u = C0005b.m63u(n, this.f2833b);
            int B = C0005b.m8B(n, this.f2833b);
            C0005b.m13G(n, i7, this.f2833b);
            C0005b.m14H(n, i6, this.f2833b);
            int a2 = this.f2846o.mo6114a();
            this.f2838g = ((this.f2833b.length / 5) - this.f2837f) - this.f2847p.mo6114a();
            this.f2850s = a2;
            int z2 = mo5692z(i5, this.f2833b);
            int a3 = this.f2848q.mo6114a();
            this.f2845n = a3;
            if (z2 == a2) {
                if (!y) {
                    i2 = i6 - B;
                }
                this.f2845n = a3 + i2;
                return;
            }
            int i8 = i7 - u;
            int i9 = y ? 0 : i6 - B;
            if (!(i8 == 0 && i9 == 0)) {
                while (z2 != 0 && z2 != a2 && (i9 != 0 || i8 != 0)) {
                    int n2 = mo5679n(z2);
                    if (i8 != 0) {
                        C0005b.m13G(n2, C0005b.m63u(n2, this.f2833b) + i8, this.f2833b);
                    }
                    if (i9 != 0) {
                        int[] iArr = this.f2833b;
                        C0005b.m14H(n2, C0005b.m8B(n2, iArr) + i9, iArr);
                    }
                    if (C0005b.m68y(n2, this.f2833b)) {
                        i9 = 0;
                    }
                    z2 = mo5692z(z2, this.f2833b);
                }
            }
            this.f2845n += i9;
            return;
        }
        throw new IllegalArgumentException("Expected to be at the end of a group".toString());
    }

    /* renamed from: j */
    public final void mo5675j() {
        int i = this.f2844m;
        boolean z = true;
        if (i > 0) {
            int i2 = i - 1;
            this.f2844m = i2;
            if (i2 == 0) {
                if (this.f2848q.f3095b != this.f2846o.f3095b) {
                    z = false;
                }
                if (z) {
                    this.f2838g = ((this.f2833b.length / 5) - this.f2837f) - this.f2847p.mo6114a();
                } else {
                    ComposerKt.m2526c("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    /* renamed from: k */
    public final void mo5676k(int i) {
        boolean z = true;
        if (this.f2844m <= 0) {
            int i2 = this.f2850s;
            if (i2 != i) {
                if (i < i2 || i >= this.f2838g) {
                    z = false;
                }
                if (z) {
                    int i3 = this.f2849r;
                    int i4 = this.f2839h;
                    int i5 = this.f2840i;
                    this.f2849r = i;
                    mo5661J();
                    this.f2849r = i3;
                    this.f2839h = i4;
                    this.f2840i = i5;
                    return;
                }
                throw new IllegalArgumentException(C0087d.m235e("Started group at ", i, " must be a subgroup of the group at ", i2).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    /* renamed from: l */
    public final void mo5677l(int i, int i2, int i3) {
        if (i >= this.f2836e) {
            i = -((mo5678m() - i) + 2);
        }
        while (i3 < i2) {
            this.f2833b[(mo5679n(i3) * 5) + 2] = i;
            int u = C0005b.m63u(mo5679n(i3), this.f2833b) + i3;
            mo5677l(i3, u, i3 + 1);
            i3 = u;
        }
    }

    /* renamed from: m */
    public final int mo5678m() {
        return (this.f2833b.length / 5) - this.f2837f;
    }

    /* renamed from: n */
    public final int mo5679n(int i) {
        return i < this.f2836e ? i : i + this.f2837f;
    }

    /* renamed from: o */
    public final int mo5680o(int i) {
        return C0005b.m63u(mo5679n(i), this.f2833b);
    }

    /* renamed from: p */
    public final boolean mo5681p(int i, int i2) {
        int i3;
        int i4;
        if (i2 == this.f2850s) {
            i3 = this.f2838g;
        } else {
            C1423y yVar = this.f2846o;
            int i5 = yVar.f3095b;
            if (i2 > (i5 > 0 ? yVar.f3094a[i5 - 1] : 0)) {
                i4 = mo5680o(i2);
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        i6 = -1;
                        break;
                    } else if (yVar.f3094a[i6] == i2) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 < 0) {
                    i4 = mo5680o(i2);
                } else {
                    i3 = ((this.f2833b.length / 5) - this.f2837f) - this.f2847p.f3094a[i6];
                }
            }
            i3 = i4 + i2;
        }
        return i > i2 && i < i3;
    }

    /* renamed from: q */
    public final void mo5682q(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.f2849r;
            mo5687u(i3);
            int i4 = this.f2836e;
            int i5 = this.f2837f;
            int[] iArr = this.f2833b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                C19318k.m32600R0(0, 0, i4 * 5, iArr, iArr2);
                C19318k.m32600R0((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.f2833b = iArr2;
                i5 = i8;
            }
            int i9 = this.f2838g;
            if (i9 >= i4) {
                this.f2838g = i9 + i;
            }
            int i10 = i4 + i;
            this.f2836e = i10;
            this.f2837f = i5 - i;
            if (i6 > 0) {
                i2 = mo5672g(mo5679n(i3 + i), this.f2833b);
            } else {
                i2 = 0;
            }
            if (this.f2843l >= i4) {
                i7 = this.f2841j;
            }
            int i11 = this.f2842k;
            int length2 = this.f2834c.length;
            if (i2 > i7) {
                i2 = -(((length2 - i11) - i2) + 1);
            }
            for (int i12 = i4; i12 < i10; i12++) {
                this.f2833b[(i12 * 5) + 4] = i2;
            }
            int i13 = this.f2843l;
            if (i13 >= i4) {
                this.f2843l = i13 + i;
            }
        }
    }

    /* renamed from: r */
    public final void mo5683r(int i, int i2) {
        if (i > 0) {
            mo5688v(this.f2839h, i2);
            int i3 = this.f2841j;
            int i4 = this.f2842k;
            if (i4 < i) {
                Object[] objArr = this.f2834c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C19318k.m32603U0(objArr, 0, objArr2, 0, i3);
                C19318k.m32603U0(objArr, i3 + i7, objArr2, i4 + i3, length);
                this.f2834c = objArr2;
                i4 = i7;
            }
            int i8 = this.f2840i;
            if (i8 >= i3) {
                this.f2840i = i8 + i;
            }
            this.f2841j = i3 + i;
            this.f2842k = i4 - i;
        }
    }

    /* renamed from: s */
    public final boolean mo5684s(int i) {
        return C0005b.m68y(mo5679n(i), this.f2833b);
    }

    /* renamed from: t */
    public final void mo5685t(C1301c1 c1Var, int i) {
        C19383o.m32797g(c1Var, "table");
        if (!(this.f2844m > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (i == 0 && this.f2849r == 0 && this.f2832a.f2821c == 0) {
            int[] iArr = this.f2833b;
            Object[] objArr = this.f2834c;
            ArrayList<C1296b> arrayList = this.f2835d;
            int[] iArr2 = c1Var.f2820b;
            int i2 = c1Var.f2821c;
            Object[] objArr2 = c1Var.f2822d;
            int i3 = c1Var.f2823e;
            this.f2833b = iArr2;
            this.f2834c = objArr2;
            this.f2835d = c1Var.f2827i;
            this.f2836e = i2;
            this.f2837f = (iArr2.length / 5) - i2;
            this.f2841j = i3;
            this.f2842k = objArr2.length - i3;
            this.f2843l = i2;
            C19383o.m32797g(iArr, "groups");
            C19383o.m32797g(objArr, "slots");
            C19383o.m32797g(arrayList, "anchors");
            c1Var.f2820b = iArr;
            c1Var.f2821c = 0;
            c1Var.f2822d = objArr;
            c1Var.f2823e = 0;
            c1Var.f2827i = arrayList;
        } else {
            C1306d1 p = c1Var.mo5649p();
            try {
                C1307a.m2683a(p, i, this, true, true);
            } finally {
                p.mo5671f();
            }
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SlotWriter(current = ");
        h.append(this.f2849r);
        h.append(" end=");
        h.append(this.f2838g);
        h.append(" size = ");
        h.append(mo5678m());
        h.append(" gap=");
        h.append(this.f2836e);
        h.append('-');
        h.append(this.f2836e + this.f2837f);
        h.append(')');
        return h.toString();
    }

    /* renamed from: u */
    public final void mo5687u(int i) {
        int i2;
        int i3;
        int i4 = this.f2837f;
        int i5 = this.f2836e;
        if (i5 != i) {
            boolean z = true;
            if (!this.f2835d.isEmpty()) {
                int length = (this.f2833b.length / 5) - this.f2837f;
                if (i5 >= i) {
                    for (int A = C0005b.m7A(this.f2835d, i, length); A < this.f2835d.size(); A++) {
                        C1296b bVar = this.f2835d.get(A);
                        C19383o.m32796f(bVar, "anchors[index]");
                        C1296b bVar2 = bVar;
                        int i6 = bVar2.f2800a;
                        if (i6 < 0) {
                            break;
                        }
                        bVar2.f2800a = -(length - i6);
                    }
                } else {
                    for (int A2 = C0005b.m7A(this.f2835d, i5, length); A2 < this.f2835d.size(); A2++) {
                        C1296b bVar3 = this.f2835d.get(A2);
                        C19383o.m32796f(bVar3, "anchors[index]");
                        C1296b bVar4 = bVar3;
                        int i7 = bVar4.f2800a;
                        if (i7 >= 0 || (i3 = i7 + length) >= i) {
                            break;
                        }
                        bVar4.f2800a = i3;
                    }
                }
            }
            if (i4 > 0) {
                int[] iArr = this.f2833b;
                int i8 = i * 5;
                int i9 = i4 * 5;
                int i10 = i5 * 5;
                if (i < i5) {
                    C19318k.m32600R0(i9 + i8, i8, i10, iArr, iArr);
                } else {
                    C19318k.m32600R0(i10, i10 + i9, i8 + i9, iArr, iArr);
                }
            }
            if (i < i5) {
                i5 = i + i4;
            }
            int length2 = this.f2833b.length / 5;
            if (i2 >= length2) {
                z = false;
            }
            ComposerKt.m2529f(z);
            while (i2 < length2) {
                int i11 = (i2 * 5) + 2;
                int i12 = this.f2833b[i11];
                int m = i12 > -2 ? i12 : mo5678m() + i12 + 2;
                if (m >= i) {
                    m = -((mo5678m() - m) + 2);
                }
                if (m != i12) {
                    this.f2833b[i11] = m;
                }
                i2++;
                if (i2 == i) {
                    i2 += i4;
                }
            }
        }
        this.f2836e = i;
    }

    /* renamed from: v */
    public final void mo5688v(int i, int i2) {
        int i3 = this.f2842k;
        int i4 = this.f2841j;
        int i5 = this.f2843l;
        if (i4 != i) {
            Object[] objArr = this.f2834c;
            if (i < i4) {
                C19318k.m32603U0(objArr, i + i3, objArr, i, i4);
            } else {
                C19318k.m32603U0(objArr, i4, objArr, i4 + i3, i + i3);
            }
            C19318k.m32609a1(i, objArr, i + i3);
        }
        int min = Math.min(i2 + 1, mo5678m());
        if (i5 != min) {
            int length = this.f2834c.length - i3;
            if (min < i5) {
                int n = mo5679n(min);
                int n2 = mo5679n(i5);
                int i6 = this.f2836e;
                while (n < n2) {
                    int t = C0005b.m61t(n, this.f2833b);
                    if (t >= 0) {
                        this.f2833b[(n * 5) + 4] = -((length - t) + 1);
                        n++;
                        if (n == i6) {
                            n += this.f2837f;
                        }
                    } else {
                        ComposerKt.m2526c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int n3 = mo5679n(i5);
                int n4 = mo5679n(min);
                while (n3 < n4) {
                    int t2 = C0005b.m61t(n3, this.f2833b);
                    if (t2 < 0) {
                        this.f2833b[(n3 * 5) + 4] = t2 + length + 1;
                        n3++;
                        if (n3 == this.f2836e) {
                            n3 += this.f2837f;
                        }
                    } else {
                        ComposerKt.m2526c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.f2843l = min;
        }
        this.f2841j = i;
    }

    /* renamed from: w */
    public final void mo5689w(C1296b bVar, C1306d1 d1Var) {
        C19383o.m32797g(bVar, "anchor");
        boolean z = true;
        if (d1Var.f2844m > 0) {
            if (!(this.f2844m == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (bVar.mo5622a()) {
                int c = mo5668c(bVar) + 1;
                int i = this.f2849r;
                if (i <= c && c < this.f2838g) {
                    int y = mo5691y(c);
                    int o = mo5680o(c);
                    int B = mo5684s(c) ? 1 : C0005b.m8B(mo5679n(c), this.f2833b);
                    C1307a.m2683a(this, c, d1Var, false, false);
                    mo5664M(y);
                    boolean z2 = B > 0;
                    while (y >= i) {
                        int n = mo5679n(y);
                        int[] iArr = this.f2833b;
                        C0005b.m13G(n, C0005b.m63u(n, iArr) - o, iArr);
                        if (z2) {
                            if (C0005b.m68y(n, this.f2833b)) {
                                z2 = false;
                            } else {
                                int[] iArr2 = this.f2833b;
                                C0005b.m14H(n, C0005b.m8B(n, iArr2) - B, iArr2);
                            }
                        }
                        y = mo5691y(y);
                    }
                    if (z2) {
                        if (this.f2845n < B) {
                            z = false;
                        }
                        ComposerKt.m2529f(z);
                        this.f2845n -= B;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: x */
    public final Object mo5690x(int i) {
        int n = mo5679n(i);
        if (C0005b.m68y(n, this.f2833b)) {
            return this.f2834c[mo5673h(mo5672g(n, this.f2833b))];
        }
        return null;
    }

    /* renamed from: y */
    public final int mo5691y(int i) {
        return mo5692z(i, this.f2833b);
    }

    /* renamed from: z */
    public final int mo5692z(int i, int[] iArr) {
        int i2 = iArr[(mo5679n(i) * 5) + 2];
        return i2 > -2 ? i2 : mo5678m() + i2 + 2;
    }
}
