package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.work.C3436p;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p388lb.C13006a;

/* renamed from: s6.j */
public final class C7853j extends C7686e.C7689c {
    public C7853j(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7853j(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(16, r10, p388lb.C13006a.f28633E) != false) goto L_0x0101;
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
            s6.i r2 = (p235s6.C7850i) r2
            p6.d r4 = r0.f17050c
            s6.i r4 = (p235s6.C7850i) r4
            p6.d r5 = r1.f17049b
            s6.i r5 = (p235s6.C7850i) r5
            p6.d r6 = r17.mo20138q()
            s6.i r6 = (p235s6.C7850i) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.i r7 = (p235s6.C7850i) r7
            p6.d r1 = r17.mo20120a()
            s6.i r1 = (p235s6.C7850i) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0051
            int[] r5 = r5.f17312f
            int[] r6 = r6.f17312f
            goto L_0x0067
        L_0x0051:
            int[] r8 = r7.f17312f
            p388lb.C13006a.m20720i(r8, r13)
            int[] r5 = r5.f17312f
            p388lb.C13006a.m20715d(r13, r5, r12)
            int[] r5 = r7.f17312f
            p388lb.C13006a.m20715d(r13, r5, r13)
            int[] r5 = r6.f17312f
            p388lb.C13006a.m20715d(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0067:
            boolean r8 = r1.mo20108q()
            if (r8 == 0) goto L_0x0072
            int[] r2 = r2.f17312f
            int[] r4 = r4.f17312f
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.f17312f
            p388lb.C13006a.m20720i(r9, r14)
            int[] r2 = r2.f17312f
            p388lb.C13006a.m20715d(r14, r2, r10)
            int[] r2 = r1.f17312f
            p388lb.C13006a.m20715d(r14, r2, r14)
            int[] r2 = r4.f17312f
            p388lb.C13006a.m20715d(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            p388lb.C13006a.m20721j(r2, r5, r9)
            p388lb.C13006a.m20721j(r4, r6, r12)
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
            p388lb.C13006a.m20720i(r9, r13)
            int[] r5 = new int[r11]
            p388lb.C13006a.m20715d(r13, r9, r5)
            p388lb.C13006a.m20715d(r13, r2, r13)
            boolean r2 = androidx.work.C3436p.m8257t(r5)
            if (r2 == 0) goto L_0x00bb
            androidx.work.C3436p.m8234H(r5)
            goto L_0x00c0
        L_0x00bb:
            int[] r2 = p388lb.C13006a.f28632D
            androidx.work.C3436p.m8238L(r2, r5, r5)
        L_0x00c0:
            androidx.work.C3436p.m8230D(r4, r5, r10)
            int r2 = androidx.work.C3436p.m8256s(r13, r13, r5)
            p388lb.C13006a.m20712a(r2, r5)
            s6.i r4 = new s6.i
            r4.<init>((int[]) r14)
            p388lb.C13006a.m20720i(r12, r14)
            int[] r2 = r4.f17312f
            p388lb.C13006a.m20721j(r2, r5, r2)
            s6.i r6 = new s6.i
            r6.<init>((int[]) r5)
            int[] r2 = r4.f17312f
            p388lb.C13006a.m20721j(r13, r2, r5)
            int[] r2 = r6.f17312f
            int r2 = androidx.work.C3436p.m8233G(r2, r12, r10)
            r5 = 1
            if (r2 != 0) goto L_0x00ff
            r2 = 15
            r2 = r10[r2]
            int r2 = r2 >>> r5
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r2 < r11) goto L_0x0106
            int[] r2 = p388lb.C13006a.f28633E
            r11 = 16
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r11, r10, r2)
            if (r2 == 0) goto L_0x0106
            goto L_0x0101
        L_0x00ff:
            r11 = 16
        L_0x0101:
            int[] r2 = p388lb.C13006a.f28633E
            androidx.datastore.preferences.protobuf.C2606m.m6130Y(r11, r2, r10)
        L_0x0106:
            int[] r2 = r6.f17312f
            p388lb.C13006a.m20717f(r10, r2)
            s6.i r2 = new s6.i
            r2.<init>((int[]) r9)
            if (r15 != 0) goto L_0x0117
            int[] r7 = r7.f17312f
            p388lb.C13006a.m20715d(r9, r7, r9)
        L_0x0117:
            if (r8 != 0) goto L_0x0120
            int[] r7 = r2.f17312f
            int[] r1 = r1.f17312f
            p388lb.C13006a.m20715d(r7, r1, r7)
        L_0x0120:
            p6.d[] r1 = new p209p6.C7681d[r5]
            r5 = 0
            r1[r5] = r2
            s6.j r8 = new s6.j
            boolean r7 = r0.f17052e
            r2 = r8
            r5 = r6
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7853j.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7853j((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7853j(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7850i iVar = (C7850i) this.f17050c;
        if (iVar.mo20109r()) {
            return cVar.mo20089p();
        }
        C7850i iVar2 = (C7850i) this.f17049b;
        C7850i iVar3 = (C7850i) this.f17051d[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        C13006a.m20720i(iVar.f17312f, iArr3);
        int[] iArr4 = new int[8];
        C13006a.m20720i(iArr3, iArr4);
        boolean q = iVar3.mo20108q();
        int[] iArr5 = iVar3.f17312f;
        if (!q) {
            C13006a.m20720i(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C13006a.m20721j(iVar2.f17312f, iArr5, iArr);
        if (C3436p.m8245g(iVar2.f17312f, iArr5, iArr2) != 0 || (iArr2[7] == -1 && C3436p.m8227A(iArr2, C13006a.f28632D))) {
            C13006a.m20714c(iArr2);
        }
        C13006a.m20715d(iArr2, iArr, iArr2);
        C13006a.m20712a(C3436p.m8256s(iArr2, iArr2, iArr2), iArr2);
        C13006a.m20715d(iArr3, iVar2.f17312f, iArr3);
        C13006a.m20712a(C2606m.m6114I(8, iArr3), iArr3);
        C13006a.m20712a(C2606m.m6156v(8, iArr4, iArr), iArr);
        C7850i iVar4 = new C7850i(iArr4);
        C13006a.m20720i(iArr2, iArr4);
        int[] iArr6 = iVar4.f17312f;
        C13006a.m20721j(iArr6, iArr3, iArr6);
        int[] iArr7 = iVar4.f17312f;
        C13006a.m20721j(iArr7, iArr3, iArr7);
        C7850i iVar5 = new C7850i(iArr3);
        C13006a.m20721j(iArr3, iVar4.f17312f, iArr3);
        int[] iArr8 = iVar5.f17312f;
        C13006a.m20715d(iArr8, iArr2, iArr8);
        int[] iArr9 = iVar5.f17312f;
        C13006a.m20721j(iArr9, iArr, iArr9);
        C7850i iVar6 = new C7850i(iArr2);
        if (C2606m.m6154t(8, 0, iVar.f17312f, iArr2) != 0 || (iArr2[7] == -1 && C3436p.m8227A(iArr2, C13006a.f28632D))) {
            C13006a.m20714c(iArr2);
        }
        if (!q) {
            int[] iArr10 = iVar6.f17312f;
            C13006a.m20715d(iArr10, iVar3.f17312f, iArr10);
        }
        return new C7853j(cVar, iVar4, iVar5, new C7681d[]{iVar6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
