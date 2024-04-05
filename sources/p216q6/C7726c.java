package p216q6;

import androidx.compose.foundation.layout.C0761x;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;

/* renamed from: q6.c */
public final class C7726c extends C7686e.C7689c {
    public C7726c(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7726c(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* renamed from: a */
    public final C7681d mo20120a() {
        return super.mo20120a();
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [p6.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p6.C7686e mo20131j(p209p6.C7686e r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r23.mo20141t()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r24.mo20141t()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            p6.e r1 = r23.mo20145w()
            return r1
        L_0x0019:
            p6.c r3 = r0.f17048a
            p6.d r2 = r0.f17049b
            q6.b r2 = (p216q6.C7725b) r2
            p6.d r4 = r0.f17050c
            q6.b r4 = (p216q6.C7725b) r4
            p6.d[] r5 = r0.f17051d
            r6 = 0
            r5 = r5[r6]
            q6.b r5 = (p216q6.C7725b) r5
            p6.d r7 = r1.f17049b
            q6.b r7 = (p216q6.C7725b) r7
            p6.d r8 = r24.mo20138q()
            q6.b r8 = (p216q6.C7725b) r8
            p6.d r1 = r24.mo20120a()
            q6.b r1 = (p216q6.C7725b) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r5.mo20108q()
            if (r15 == 0) goto L_0x0051
            int[] r7 = r7.f17138f
            int[] r8 = r8.f17138f
            goto L_0x0067
        L_0x0051:
            int[] r6 = r5.f17138f
            androidx.compose.foundation.layout.C0761x.m1675K(r6, r13)
            int[] r6 = r7.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r13, r6, r12)
            int[] r6 = r5.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r13, r6, r13)
            int[] r6 = r8.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r13, r6, r13)
            r7 = r12
            r8 = r13
        L_0x0067:
            boolean r6 = r1.mo20108q()
            if (r6 == 0) goto L_0x0072
            int[] r2 = r2.f17138f
            int[] r4 = r4.f17138f
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.f17138f
            androidx.compose.foundation.layout.C0761x.m1675K(r9, r14)
            int[] r2 = r2.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r14, r2, r10)
            int[] r2 = r1.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r14, r2, r14)
            int[] r2 = r4.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            androidx.compose.foundation.layout.C0761x.m1677L(r2, r7, r9)
            androidx.compose.foundation.layout.C0761x.m1677L(r4, r8, r12)
            boolean r7 = androidx.work.C3436p.m8257t(r9)
            if (r7 == 0) goto L_0x00a6
            boolean r1 = androidx.work.C3436p.m8257t(r12)
            if (r1 == 0) goto L_0x00a1
            p6.e r1 = r23.mo20145w()
            return r1
        L_0x00a1:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a6:
            int[] r7 = new int[r11]
            androidx.compose.foundation.layout.C0761x.m1675K(r9, r7)
            int[] r8 = new int[r11]
            androidx.compose.foundation.layout.C0761x.m1754y(r7, r9, r8)
            androidx.compose.foundation.layout.C0761x.m1754y(r7, r2, r13)
            boolean r2 = androidx.work.C3436p.m8257t(r8)
            if (r2 == 0) goto L_0x00bd
            androidx.work.C3436p.m8234H(r8)
            goto L_0x00c2
        L_0x00bd:
            int[] r2 = androidx.compose.foundation.layout.C0761x.f1561e
            androidx.work.C3436p.m8238L(r2, r8, r8)
        L_0x00c2:
            androidx.work.C3436p.m8230D(r4, r8, r10)
            int r2 = androidx.work.C3436p.m8256s(r13, r13, r8)
            androidx.compose.foundation.layout.C0761x.m1724h(r2, r8)
            q6.b r4 = new q6.b
            r4.<init>((int[]) r14)
            androidx.compose.foundation.layout.C0761x.m1675K(r12, r14)
            int[] r2 = r4.f17138f
            androidx.compose.foundation.layout.C0761x.m1677L(r2, r8, r2)
            q6.b r14 = new q6.b
            r14.<init>((int[]) r8)
            int[] r2 = r4.f17138f
            androidx.compose.foundation.layout.C0761x.m1677L(r13, r2, r8)
            int[] r2 = r14.f17138f
            androidx.work.C3436p.m8233G(r2, r12, r10)
            int[] r2 = androidx.compose.foundation.layout.C0761x.f1562f
            r8 = 16
            boolean r8 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r8, r10, r2)
            if (r8 == 0) goto L_0x0153
            r8 = 0
            r13 = r10[r8]
            long r11 = (long) r13
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r16
            r13 = r2[r8]
            r18 = r9
            long r8 = (long) r13
            long r8 = r8 & r16
            long r11 = r11 - r8
            int r8 = (int) r11
            r9 = 0
            r10[r9] = r8
            r8 = 32
            long r11 = r11 >> r8
            r19 = 0
            int r9 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r9 == 0) goto L_0x011b
            r9 = 1
            r13 = 8
            int r11 = androidx.datastore.preferences.protobuf.C2606m.m6134b(r13, r10, r9)
            long r11 = (long) r11
            goto L_0x011d
        L_0x011b:
            r13 = 8
        L_0x011d:
            r9 = r10[r13]
            long r8 = (long) r9
            long r8 = r8 & r16
            r21 = 19
            long r8 = r8 + r21
            long r8 = r8 + r11
            int r11 = (int) r8
            r10[r13] = r11
            r11 = 32
            long r8 = r8 >> r11
            int r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            r12 = 15
            if (r11 == 0) goto L_0x013a
            r8 = 9
            int r8 = androidx.datastore.preferences.protobuf.C2606m.m6159y(r12, r10, r8)
            long r8 = (long) r8
        L_0x013a:
            r11 = r10[r12]
            r13 = r3
            r24 = r4
            long r3 = (long) r11
            long r3 = r3 & r16
            r2 = r2[r12]
            r11 = 1
            int r2 = r2 + r11
            r19 = r13
            long r12 = (long) r2
            long r12 = r12 & r16
            long r3 = r3 - r12
            long r3 = r3 + r8
            int r2 = (int) r3
            r3 = 15
            r10[r3] = r2
            goto L_0x0159
        L_0x0153:
            r19 = r3
            r24 = r4
            r18 = r9
        L_0x0159:
            int[] r2 = r14.f17138f
            androidx.compose.foundation.layout.C0761x.m1661D(r10, r2)
            q6.b r2 = new q6.b
            r3 = r18
            r2.<init>((int[]) r3)
            if (r15 != 0) goto L_0x016c
            int[] r4 = r5.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r3, r4, r3)
        L_0x016c:
            if (r6 != 0) goto L_0x0175
            int[] r3 = r2.f17138f
            int[] r1 = r1.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r3, r1, r3)
        L_0x0175:
            if (r15 == 0) goto L_0x017a
            if (r6 == 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r7 = 0
        L_0x017b:
            q6.b r1 = r0.mo20198y(r2, r7)
            r3 = 2
            p6.d[] r6 = new p209p6.C7681d[r3]
            r3 = 0
            r6[r3] = r2
            r2 = 1
            r6[r2] = r1
            q6.c r1 = new q6.c
            boolean r7 = r0.f17052e
            r2 = r1
            r3 = r19
            r4 = r24
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p216q6.C7726c.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20199z(false).mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7726c((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7726c(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        return this.f17050c.mo20109r() ? this.f17048a.mo20089p() : mo20199z(true);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (!mo20141t() && !this.f17050c.mo20109r()) ? mo20199z(false).mo20131j(this) : this;
    }

    /* renamed from: y */
    public final C7725b mo20198y(C7725b bVar, int[] iArr) {
        C7725b bVar2 = (C7725b) this.f17048a.f17024b;
        if (bVar.mo20108q()) {
            return bVar2;
        }
        C7725b bVar3 = new C7725b();
        if (iArr == null) {
            iArr = bVar3.f17138f;
            C0761x.m1675K(bVar.f17138f, iArr);
        }
        C0761x.m1675K(iArr, bVar3.f17138f);
        int[] iArr2 = bVar3.f17138f;
        C0761x.m1754y(iArr2, bVar2.f17138f, iArr2);
        return bVar3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: p6.d[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p216q6.C7726c mo20199z(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            p6.d r1 = r0.f17049b
            q6.b r1 = (p216q6.C7725b) r1
            p6.d r2 = r0.f17050c
            q6.b r2 = (p216q6.C7725b) r2
            p6.d[] r3 = r0.f17051d
            r4 = 0
            r5 = r3[r4]
            r6 = r5
            q6.b r6 = (p216q6.C7725b) r6
            r7 = 1
            r8 = r3[r7]
            q6.b r8 = (p216q6.C7725b) r8
            r9 = 0
            if (r8 != 0) goto L_0x0022
            q6.b r5 = (p216q6.C7725b) r5
            q6.b r8 = r0.mo20198y(r5, r9)
            r3[r7] = r8
        L_0x0022:
            r3 = 8
            int[] r5 = new int[r3]
            int[] r10 = r1.f17138f
            androidx.compose.foundation.layout.C0761x.m1675K(r10, r5)
            int r10 = androidx.work.C3436p.m8256s(r5, r5, r5)
            int[] r11 = r8.f17138f
            r12 = r11[r4]
            long r12 = (long) r12
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            r9 = r5[r4]
            r16 = r8
            long r7 = (long) r9
            long r7 = r7 & r14
            long r12 = r12 + r7
            r7 = 0
            long r12 = r12 + r7
            int r7 = (int) r12
            r5[r4] = r7
            r7 = 32
            long r8 = r12 >>> r7
            r12 = 1
            r13 = r11[r12]
            long r3 = (long) r13
            long r3 = r3 & r14
            r13 = r5[r12]
            long r12 = (long) r13
            long r12 = r12 & r14
            long r3 = r3 + r12
            long r3 = r3 + r8
            int r8 = (int) r3
            r9 = 1
            r5[r9] = r8
            long r3 = r3 >>> r7
            r8 = 2
            r9 = r11[r8]
            long r12 = (long) r9
            long r12 = r12 & r14
            r9 = r5[r8]
            long r7 = (long) r9
            long r7 = r7 & r14
            long r12 = r12 + r7
            long r12 = r12 + r3
            int r3 = (int) r12
            r4 = 2
            r5[r4] = r3
            r3 = 32
            long r7 = r12 >>> r3
            r3 = 3
            r4 = r11[r3]
            long r12 = (long) r4
            long r12 = r12 & r14
            r4 = r5[r3]
            long r3 = (long) r4
            long r3 = r3 & r14
            long r12 = r12 + r3
            long r12 = r12 + r7
            int r3 = (int) r12
            r4 = 3
            r5[r4] = r3
            r3 = 32
            long r7 = r12 >>> r3
            r3 = 4
            r4 = r11[r3]
            long r12 = (long) r4
            long r12 = r12 & r14
            r4 = r5[r3]
            long r3 = (long) r4
            long r3 = r3 & r14
            long r12 = r12 + r3
            long r12 = r12 + r7
            int r3 = (int) r12
            r4 = 4
            r5[r4] = r3
            r3 = 32
            long r7 = r12 >>> r3
            r3 = 5
            r4 = r11[r3]
            long r12 = (long) r4
            long r12 = r12 & r14
            r4 = r5[r3]
            long r3 = (long) r4
            long r3 = r3 & r14
            long r12 = r12 + r3
            long r12 = r12 + r7
            int r3 = (int) r12
            r4 = 5
            r5[r4] = r3
            r3 = 32
            long r7 = r12 >>> r3
            r3 = 6
            r4 = r11[r3]
            long r12 = (long) r4
            long r12 = r12 & r14
            r4 = r5[r3]
            long r3 = (long) r4
            long r3 = r3 & r14
            long r12 = r12 + r3
            long r12 = r12 + r7
            int r3 = (int) r12
            r4 = 6
            r5[r4] = r3
            r3 = 32
            long r7 = r12 >>> r3
            r3 = 7
            r4 = r11[r3]
            long r11 = (long) r4
            long r11 = r11 & r14
            r4 = r5[r3]
            long r3 = (long) r4
            long r3 = r3 & r14
            long r11 = r11 + r3
            long r11 = r11 + r7
            int r3 = (int) r11
            r4 = 7
            r5[r4] = r3
            r3 = 32
            long r3 = r11 >>> r3
            int r3 = (int) r3
            int r10 = r10 + r3
            androidx.compose.foundation.layout.C0761x.m1724h(r10, r5)
            r3 = 8
            int[] r4 = new int[r3]
            int[] r7 = r2.f17138f
            androidx.compose.foundation.layout.C0761x.m1691S(r7, r4)
            int[] r7 = new int[r3]
            int[] r2 = r2.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r4, r2, r7)
            int[] r2 = new int[r3]
            int[] r1 = r1.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r7, r1, r2)
            androidx.compose.foundation.layout.C0761x.m1691S(r2, r2)
            int[] r1 = new int[r3]
            androidx.compose.foundation.layout.C0761x.m1675K(r7, r1)
            androidx.compose.foundation.layout.C0761x.m1691S(r1, r1)
            q6.b r10 = new q6.b
            r10.<init>((int[]) r7)
            androidx.compose.foundation.layout.C0761x.m1675K(r5, r7)
            int[] r3 = r10.f17138f
            androidx.compose.foundation.layout.C0761x.m1677L(r3, r2, r3)
            int[] r3 = r10.f17138f
            androidx.compose.foundation.layout.C0761x.m1677L(r3, r2, r3)
            q6.b r11 = new q6.b
            r11.<init>((int[]) r2)
            int[] r3 = r10.f17138f
            androidx.compose.foundation.layout.C0761x.m1677L(r2, r3, r2)
            int[] r2 = r11.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r2, r5, r2)
            int[] r2 = r11.f17138f
            androidx.compose.foundation.layout.C0761x.m1677L(r2, r1, r2)
            q6.b r2 = new q6.b
            r2.<init>((int[]) r4)
            int[] r3 = r6.f17138f
            boolean r3 = androidx.work.C3436p.m8247i(r3)
            if (r3 != 0) goto L_0x012e
            int[] r3 = r2.f17138f
            int[] r4 = r6.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r3, r4, r3)
        L_0x012e:
            if (r18 == 0) goto L_0x0142
            q6.b r9 = new q6.b
            r9.<init>((int[]) r1)
            r8 = r16
            int[] r3 = r8.f17138f
            androidx.compose.foundation.layout.C0761x.m1754y(r1, r3, r1)
            int[] r1 = r9.f17138f
            androidx.compose.foundation.layout.C0761x.m1691S(r1, r1)
            goto L_0x0143
        L_0x0142:
            r9 = 0
        L_0x0143:
            q6.c r1 = new q6.c
            p6.c r3 = r0.f17048a
            r4 = 2
            p6.d[] r12 = new p209p6.C7681d[r4]
            r4 = 0
            r12[r4] = r2
            r2 = 1
            r12[r2] = r9
            boolean r13 = r0.f17052e
            r8 = r1
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p216q6.C7726c.mo20199z(boolean):q6.c");
    }
}
