package p009a8;

import com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import org.apache.commons.lang3.CharUtils;
import p009a8.C0043b;

/* renamed from: a8.c */
public abstract class C0045c extends C0043b {

    /* renamed from: w */
    public int f126w;

    public C0045c(int i) {
        super(i);
    }

    /* renamed from: b */
    public final void mo73b(boolean[] zArr) {
        int i = this.f112f;
        mo79h(zArr);
        mo87n(i, this.f112f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ed, code lost:
        if (r2 >= com.fasterxml.jackson.core.base.ParserMinimalBase.MIN_INT_L) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fa, code lost:
        if (r2 <= com.fasterxml.jackson.core.base.ParserMinimalBase.MAX_INT_L) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00da  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75d(boolean[] r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f112f
            r18.mo81j()
        L_0x0007:
            char r2 = r0.f107a
            r3 = 57
            r4 = 48
            if (r2 < r4) goto L_0x0016
            if (r2 <= r3) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            r18.mo82k()
            goto L_0x0007
        L_0x0016:
            r5 = 45
            r6 = 101(0x65, float:1.42E-43)
            r7 = 46
            r8 = 26
            r9 = 126(0x7e, float:1.77E-43)
            r10 = 69
            r11 = 1
            if (r2 == r7) goto L_0x0114
            if (r2 == r10) goto L_0x0114
            if (r2 == r6) goto L_0x0114
            r18.mo84m()
            char r2 = r0.f107a
            if (r2 < 0) goto L_0x0051
            if (r2 >= r9) goto L_0x0051
            boolean r3 = r19[r2]
            if (r3 != 0) goto L_0x0051
            if (r2 == r8) goto L_0x0051
            r18.mo79h(r19)
            int r2 = r0.f112f
            r0.mo87n(r1, r2)
            boolean r1 = r0.f115i
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r0.f111e
            return r1
        L_0x0047:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r1 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r2 = r0.f112f
            java.lang.String r3 = r0.f111e
            r1.<init>(r2, r11, r3)
            throw r1
        L_0x0051:
            int r2 = r0.f112f
            r0.mo87n(r1, r2)
            java.lang.String r12 = r0.f111e
            int r1 = r12.length()
            r13 = 0
            char r2 = r12.charAt(r13)
            r3 = 6
            if (r2 != r5) goto L_0x007e
            r2 = 20
            boolean r5 = r0.f113g
            if (r5 != 0) goto L_0x007c
            r5 = 3
            if (r1 < r5) goto L_0x007c
            char r5 = r12.charAt(r11)
            if (r5 == r4) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r1 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r2 = r0.f112f
            r1.<init>(r2, r3, r12)
            throw r1
        L_0x007c:
            r14 = r11
            goto L_0x0097
        L_0x007e:
            boolean r2 = r0.f113g
            if (r2 != 0) goto L_0x0094
            r2 = 2
            if (r1 < r2) goto L_0x0094
            char r2 = r12.charAt(r13)
            if (r2 == r4) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r1 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r2 = r0.f112f
            r1.<init>(r2, r3, r12)
            throw r1
        L_0x0094:
            r2 = 19
            r14 = r13
        L_0x0097:
            r15 = 10
            if (r1 >= r2) goto L_0x009e
            r16 = r13
            goto L_0x00ab
        L_0x009e:
            if (r1 <= r2) goto L_0x00a7
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r12, r15)
            goto L_0x0106
        L_0x00a7:
            int r1 = r1 + -1
            r16 = r11
        L_0x00ab:
            r2 = 0
            r5 = r14
        L_0x00ae:
            r6 = 10
            if (r5 < r1) goto L_0x0107
            if (r16 == 0) goto L_0x00e2
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00be
            goto L_0x00d1
        L_0x00be:
            if (r1 >= 0) goto L_0x00c1
            goto L_0x00d2
        L_0x00c1:
            char r1 = r12.charAt(r5)
            if (r14 == 0) goto L_0x00cc
            r8 = 56
            if (r1 <= r8) goto L_0x00d1
            goto L_0x00d2
        L_0x00cc:
            r8 = 55
            if (r1 <= r8) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r11 = r13
        L_0x00d2:
            if (r11 == 0) goto L_0x00da
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r12, r15)
            goto L_0x0106
        L_0x00da:
            long r2 = r2 * r6
            char r1 = r12.charAt(r5)
            int r4 = r4 - r1
            long r4 = (long) r4
            long r2 = r2 + r4
        L_0x00e2:
            if (r14 == 0) goto L_0x00f0
            boolean r1 = r0.f122p
            if (r1 == 0) goto L_0x0102
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0102
            goto L_0x00fc
        L_0x00f0:
            long r2 = -r2
            boolean r1 = r0.f122p
            if (r1 == 0) goto L_0x0102
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0102
        L_0x00fc:
            int r1 = (int) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0106
        L_0x0102:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        L_0x0106:
            return r1
        L_0x0107:
            long r2 = r2 * r6
            int r6 = r5 + 1
            char r5 = r12.charAt(r5)
            int r5 = 48 - r5
            long r7 = (long) r5
            long r2 = r2 + r7
            r5 = r6
            goto L_0x00ae
        L_0x0114:
            if (r2 != r7) goto L_0x0124
            r18.mo81j()
        L_0x0119:
            char r2 = r0.f107a
            if (r2 < r4) goto L_0x0124
            if (r2 <= r3) goto L_0x0120
            goto L_0x0124
        L_0x0120:
            r18.mo82k()
            goto L_0x0119
        L_0x0124:
            char r2 = r0.f107a
            if (r2 == r10) goto L_0x0152
            if (r2 == r6) goto L_0x0152
            r18.mo84m()
            char r2 = r0.f107a
            if (r2 < 0) goto L_0x01c2
            if (r2 >= r9) goto L_0x01c2
            boolean r3 = r19[r2]
            if (r3 != 0) goto L_0x01c2
            if (r2 == r8) goto L_0x01c2
            r18.mo79h(r19)
            int r2 = r0.f112f
            r0.mo87n(r1, r2)
            boolean r1 = r0.f115i
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = r0.f111e
            return r1
        L_0x0148:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r1 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r2 = r0.f112f
            java.lang.String r3 = r0.f111e
            r1.<init>(r2, r11, r3)
            throw r1
        L_0x0152:
            a8.b$a r2 = r0.f109c
            r2.mo85a(r10)
            r18.mo81j()
            char r2 = r0.f107a
            r6 = 43
            if (r2 == r6) goto L_0x0187
            if (r2 == r5) goto L_0x0187
            if (r2 < r4) goto L_0x0167
            if (r2 > r3) goto L_0x0167
            goto L_0x0187
        L_0x0167:
            r18.mo79h(r19)
            int r2 = r0.f112f
            r0.mo87n(r1, r2)
            boolean r1 = r0.f115i
            if (r1 == 0) goto L_0x017d
            boolean r1 = r0.f113g
            if (r1 != 0) goto L_0x017a
            r18.mo76e()
        L_0x017a:
            java.lang.String r1 = r0.f111e
            return r1
        L_0x017d:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r1 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r2 = r0.f112f
            java.lang.String r3 = r0.f111e
            r1.<init>(r2, r11, r3)
            throw r1
        L_0x0187:
            a8.b$a r5 = r0.f109c
            r5.mo85a(r2)
            r18.mo81j()
        L_0x018f:
            char r2 = r0.f107a
            if (r2 < r4) goto L_0x019a
            if (r2 <= r3) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            r18.mo82k()
            goto L_0x018f
        L_0x019a:
            r18.mo84m()
            char r2 = r0.f107a
            if (r2 < 0) goto L_0x01c2
            if (r2 >= r9) goto L_0x01c2
            boolean r3 = r19[r2]
            if (r3 != 0) goto L_0x01c2
            if (r2 == r8) goto L_0x01c2
            r18.mo79h(r19)
            int r2 = r0.f112f
            r0.mo87n(r1, r2)
            boolean r1 = r0.f115i
            if (r1 == 0) goto L_0x01b8
            java.lang.String r1 = r0.f111e
            return r1
        L_0x01b8:
            com.cardinalcommerce.dependencies.internal.minidev.json.b.i r1 = new com.cardinalcommerce.dependencies.internal.minidev.json.b.i
            int r2 = r0.f112f
            java.lang.String r3 = r0.f111e
            r1.<init>(r2, r11, r3)
            throw r1
        L_0x01c2:
            int r2 = r0.f112f
            r0.mo87n(r1, r2)
            java.lang.Number r1 = r18.mo77f()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0045c.mo75d(boolean[]):java.lang.Object");
    }

    /* renamed from: l */
    public final void mo83l() {
        C0043b.C0044a aVar;
        int i;
        char c;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f116j || this.f107a != '\'') {
            C0046d dVar = (C0046d) this;
            int indexOf = dVar.f127x.indexOf(this.f107a, this.f112f + 1);
            int i5 = -1;
            if (indexOf != -1) {
                dVar.f111e = dVar.f127x.substring(this.f112f + 1, indexOf);
                if (this.f111e.indexOf(92) == -1) {
                    if (!this.f120n) {
                        int length = this.f111e.length();
                        for (int i6 = 0; i6 < length; i6++) {
                            char charAt = this.f111e.charAt(i6);
                            if (charAt >= 0) {
                                if (charAt <= 31) {
                                    throw new C6232i(this.f112f + i6, 0, Character.valueOf(charAt));
                                } else if (charAt == 127 && this.f123q) {
                                    throw new C6232i(this.f112f + i6, 0, Character.valueOf(charAt));
                                }
                            }
                        }
                    }
                    this.f112f = indexOf;
                    mo81j();
                    return;
                }
                this.f109c.f125b = -1;
                char c2 = this.f107a;
                while (true) {
                    mo81j();
                    char c3 = this.f107a;
                    char c4 = JsonFactory.DEFAULT_QUOTE_CHAR;
                    if (c3 == '\"' || c3 == '\'') {
                        if (c2 == c3) {
                            mo81j();
                            this.f111e = this.f109c.toString();
                            return;
                        }
                    } else if (c3 == '\\') {
                        mo81j();
                        char c5 = this.f107a;
                        char c6 = 10;
                        if (c5 != '\"') {
                            if (c5 != '\'') {
                                c4 = JsonPointer.SEPARATOR;
                                if (c5 != '/') {
                                    if (c5 != '\\') {
                                        if (c5 == 'b') {
                                            aVar = this.f109c;
                                            c6 = 8;
                                        } else if (c5 == 'f') {
                                            aVar = this.f109c;
                                            c6 = 12;
                                        } else if (c5 == 'n') {
                                            aVar = this.f109c;
                                        } else if (c5 != 'r') {
                                            if (c5 == 'x') {
                                                aVar = this.f109c;
                                                i = 2;
                                            } else if (c5 == 't') {
                                                aVar = this.f109c;
                                                c6 = 9;
                                            } else if (c5 != 'u') {
                                                continue;
                                            } else {
                                                aVar = this.f109c;
                                                i = 4;
                                            }
                                            int i7 = i4;
                                            int i8 = i7;
                                            while (i7 < i) {
                                                int i9 = i8 * 16;
                                                mo81j();
                                                c = this.f107a;
                                                if (c > '9' || c < '0') {
                                                    if (c <= 'F' && c >= 'A') {
                                                        i3 = c - 'A';
                                                    } else if (c >= 'a' && c <= 'f') {
                                                        i3 = c - 'a';
                                                    }
                                                    i2 = i3 + 10;
                                                } else {
                                                    i2 = c - '0';
                                                }
                                                i8 = i9 + i2;
                                                i7++;
                                            }
                                            c6 = (char) i8;
                                        } else {
                                            aVar = this.f109c;
                                            c6 = CharUtils.f44393CR;
                                        }
                                        aVar.mo85a(c6);
                                    } else {
                                        this.f109c.mo85a('\\');
                                    }
                                }
                            } else {
                                this.f109c.mo85a('\'');
                            }
                            i4 = 0;
                            i5 = -1;
                        }
                        aVar = this.f109c;
                        c6 = c4;
                        aVar.mo85a(c6);
                        i4 = 0;
                        i5 = -1;
                    } else if (c3 != 127) {
                        switch (c3) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                if (this.f120n) {
                                    continue;
                                } else {
                                    throw new C6232i(this.f112f, i4, Character.valueOf(this.f107a));
                                }
                            case 26:
                                throw new C6232i(this.f112f + i5, 3, (Object) null);
                        }
                    } else if (this.f120n) {
                        continue;
                    } else if (this.f123q) {
                        throw new C6232i(this.f112f, i4, Character.valueOf(this.f107a));
                    }
                    this.f109c.mo85a(c3);
                    i4 = 0;
                    i5 = -1;
                }
                if (c == 26) {
                    throw new C6232i(this.f112f, 3, "EOF");
                }
                throw new C6232i(this.f112f, 4, Character.valueOf(this.f107a));
            }
            throw new C6232i(this.f126w, 3, (Object) null);
        } else if (this.f115i) {
            mo73b(C0043b.f102r);
        } else {
            throw new C6232i(this.f112f, 0, Character.valueOf(this.f107a));
        }
    }

    /* renamed from: n */
    public abstract void mo87n(int i, int i2);
}
