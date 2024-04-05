package p224r6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.work.C3436p;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p772tq.C20203a;

/* renamed from: r6.c */
public final class C7782c extends C7686e.C7689c {
    public C7782c(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7782c(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(16, r10, p772tq.C20203a.f44783m) != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p6.C7686e mo20131j(p209p6.C7686e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.mo20141t()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r17.mo20141t()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x0019:
            p6.c r3 = r0.f17048a
            p6.d r2 = r0.f17049b
            r6.b r2 = (p224r6.C7781b) r2
            p6.d r4 = r0.f17050c
            r6.b r4 = (p224r6.C7781b) r4
            p6.d r5 = r1.f17049b
            r6.b r5 = (p224r6.C7781b) r5
            p6.d r6 = r17.mo20138q()
            r6.b r6 = (p224r6.C7781b) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            r6.b r7 = (p224r6.C7781b) r7
            p6.d r1 = r17.mo20120a()
            r6.b r1 = (p224r6.C7781b) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0051
            int[] r5 = r5.f17218f
            int[] r6 = r6.f17218f
            goto L_0x0067
        L_0x0051:
            int[] r8 = r7.f17218f
            p772tq.C20203a.m34534v(r8, r13)
            int[] r5 = r5.f17218f
            p772tq.C20203a.m34530r(r13, r5, r12)
            int[] r5 = r7.f17218f
            p772tq.C20203a.m34530r(r13, r5, r13)
            int[] r5 = r6.f17218f
            p772tq.C20203a.m34530r(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0067:
            boolean r8 = r1.mo20108q()
            if (r8 == 0) goto L_0x0072
            int[] r2 = r2.f17218f
            int[] r4 = r4.f17218f
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.f17218f
            p772tq.C20203a.m34534v(r9, r14)
            int[] r2 = r2.f17218f
            p772tq.C20203a.m34530r(r14, r2, r10)
            int[] r2 = r1.f17218f
            p772tq.C20203a.m34530r(r14, r2, r14)
            int[] r2 = r4.f17218f
            p772tq.C20203a.m34530r(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            p772tq.C20203a.m34535w(r2, r5, r9)
            p772tq.C20203a.m34535w(r4, r6, r12)
            boolean r5 = androidx.work.C3436p.m8257t(r9)
            if (r5 == 0) goto L_0x00a6
            boolean r1 = androidx.work.C3436p.m8257t(r12)
            if (r1 == 0) goto L_0x00a1
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x00a1:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a6:
            p772tq.C20203a.m34534v(r9, r13)
            int[] r5 = new int[r11]
            p772tq.C20203a.m34530r(r13, r9, r5)
            p772tq.C20203a.m34530r(r13, r2, r13)
            boolean r2 = androidx.work.C3436p.m8257t(r5)
            if (r2 == 0) goto L_0x00bb
            androidx.work.C3436p.m8234H(r5)
            goto L_0x00c0
        L_0x00bb:
            int[] r2 = p772tq.C20203a.f44782l
            androidx.work.C3436p.m8238L(r2, r5, r5)
        L_0x00c0:
            androidx.work.C3436p.m8230D(r4, r5, r10)
            int r2 = androidx.work.C3436p.m8256s(r13, r13, r5)
            p772tq.C20203a.m34525c(r2, r5)
            r6.b r4 = new r6.b
            r4.<init>((int[]) r14)
            p772tq.C20203a.m34534v(r12, r14)
            int[] r2 = r4.f17218f
            p772tq.C20203a.m34535w(r2, r5, r2)
            r6.b r6 = new r6.b
            r6.<init>((int[]) r5)
            int[] r2 = r4.f17218f
            p772tq.C20203a.m34535w(r13, r2, r5)
            int[] r2 = r6.f17218f
            int r2 = androidx.work.C3436p.m8233G(r2, r12, r10)
            r5 = 1
            if (r2 != 0) goto L_0x00ff
            r2 = 15
            r2 = r10[r2]
            int r2 = r2 >>> r5
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r2 < r11) goto L_0x0106
            int[] r2 = p772tq.C20203a.f44783m
            r11 = 16
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r11, r10, r2)
            if (r2 == 0) goto L_0x0106
            goto L_0x0101
        L_0x00ff:
            r11 = 16
        L_0x0101:
            int[] r2 = p772tq.C20203a.f44783m
            androidx.datastore.preferences.protobuf.C2606m.m6130Y(r11, r2, r10)
        L_0x0106:
            int[] r2 = r6.f17218f
            p772tq.C20203a.m34532t(r10, r2)
            r6.b r2 = new r6.b
            r2.<init>((int[]) r9)
            if (r15 != 0) goto L_0x0117
            int[] r7 = r7.f17218f
            p772tq.C20203a.m34530r(r9, r7, r9)
        L_0x0117:
            if (r8 != 0) goto L_0x0120
            int[] r7 = r2.f17218f
            int[] r1 = r1.f17218f
            p772tq.C20203a.m34530r(r7, r1, r7)
        L_0x0120:
            p6.d[] r1 = new p209p6.C7681d[r5]
            r5 = 0
            r1[r5] = r2
            r6.c r8 = new r6.c
            boolean r7 = r0.f17052e
            r2 = r8
            r5 = r6
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p224r6.C7782c.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7782c((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7782c(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7781b bVar = (C7781b) this.f17050c;
        if (bVar.mo20109r()) {
            return cVar.mo20089p();
        }
        C7781b bVar2 = (C7781b) this.f17049b;
        C7781b bVar3 = (C7781b) this.f17051d[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        C20203a.m34534v(bVar.f17218f, iArr3);
        int[] iArr4 = new int[8];
        C20203a.m34534v(iArr3, iArr4);
        boolean q = bVar3.mo20108q();
        int[] iArr5 = bVar3.f17218f;
        if (!q) {
            C20203a.m34534v(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C20203a.m34535w(bVar2.f17218f, iArr5, iArr);
        if (C3436p.m8245g(bVar2.f17218f, iArr5, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && C3436p.m8227A(iArr2, C20203a.f44782l))) {
            C20203a.m34527h(iArr2);
        }
        C20203a.m34530r(iArr2, iArr, iArr2);
        C20203a.m34525c(C3436p.m8256s(iArr2, iArr2, iArr2), iArr2);
        C20203a.m34530r(iArr3, bVar2.f17218f, iArr3);
        C20203a.m34525c(C2606m.m6114I(8, iArr3), iArr3);
        C20203a.m34525c(C2606m.m6156v(8, iArr4, iArr), iArr);
        C7781b bVar4 = new C7781b(iArr4);
        C20203a.m34534v(iArr2, iArr4);
        int[] iArr6 = bVar4.f17218f;
        C20203a.m34535w(iArr6, iArr3, iArr6);
        int[] iArr7 = bVar4.f17218f;
        C20203a.m34535w(iArr7, iArr3, iArr7);
        C7781b bVar5 = new C7781b(iArr3);
        C20203a.m34535w(iArr3, bVar4.f17218f, iArr3);
        int[] iArr8 = bVar5.f17218f;
        C20203a.m34530r(iArr8, iArr2, iArr8);
        int[] iArr9 = bVar5.f17218f;
        C20203a.m34535w(iArr9, iArr, iArr9);
        C7781b bVar6 = new C7781b(iArr2);
        if (C2606m.m6154t(8, 0, bVar.f17218f, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && C3436p.m8227A(iArr2, C20203a.f44782l))) {
            C20203a.m34527h(iArr2);
        }
        if (!q) {
            int[] iArr10 = bVar6.f17218f;
            C20203a.m34530r(iArr10, bVar3.f17218f, iArr10);
        }
        return new C7782c(cVar, bVar4, bVar5, new C7681d[]{bVar6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
