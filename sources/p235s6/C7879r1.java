package p235s6;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;

/* renamed from: s6.r1 */
public final class C7879r1 extends C7686e.C7689c {
    public C7879r1(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7879r1(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0103, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(10, r10, androidx.compose.foundation.layout.C0761x.f1564h) != false) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
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
            s6.q1 r2 = (p235s6.C7876q1) r2
            p6.d r4 = r0.f17050c
            s6.q1 r4 = (p235s6.C7876q1) r4
            p6.d r5 = r1.f17049b
            s6.q1 r5 = (p235s6.C7876q1) r5
            p6.d r6 = r17.mo20138q()
            s6.q1 r6 = (p235s6.C7876q1) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.q1 r7 = (p235s6.C7876q1) r7
            p6.d r1 = r17.mo20120a()
            s6.q1 r1 = (p235s6.C7876q1) r1
            r9 = 10
            int[] r10 = new int[r9]
            r11 = 5
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f17337f
            int[] r6 = r6.f17337f
            goto L_0x0066
        L_0x0050:
            int[] r9 = r7.f17337f
            androidx.compose.foundation.layout.C0761x.m1679M(r9, r13)
            int[] r5 = r5.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r13, r5, r12)
            int[] r5 = r7.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r13, r5, r13)
            int[] r5 = r6.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0071
            int[] r2 = r2.f17337f
            int[] r4 = r4.f17337f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17337f
            androidx.compose.foundation.layout.C0761x.m1679M(r8, r14)
            int[] r2 = r2.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r14, r2, r10)
            int[] r2 = r1.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r14, r2, r14)
            int[] r2 = r4.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0087:
            int[] r8 = new int[r11]
            androidx.compose.foundation.layout.C0761x.m1681N(r2, r5, r8)
            androidx.compose.foundation.layout.C0761x.m1681N(r4, r6, r12)
            boolean r5 = androidx.preference.C3039b.m7146P(r8)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = androidx.preference.C3039b.m7146P(r12)
            if (r1 == 0) goto L_0x00a0
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x00a0:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a5:
            androidx.compose.foundation.layout.C0761x.m1679M(r8, r13)
            int[] r5 = new int[r11]
            androidx.compose.foundation.layout.C0761x.m1756z(r13, r8, r5)
            androidx.compose.foundation.layout.C0761x.m1756z(r13, r2, r13)
            boolean r2 = androidx.preference.C3039b.m7146P(r5)
            r6 = 1
            if (r2 == 0) goto L_0x00c6
            r2 = 0
            r5[r2] = r2
            r5[r6] = r2
            r11 = 2
            r5[r11] = r2
            r11 = 3
            r5[r11] = r2
            r11 = 4
            r5[r11] = r2
            goto L_0x00cb
        L_0x00c6:
            int[] r2 = androidx.compose.foundation.layout.C0761x.f1563g
            androidx.preference.C3039b.m7178o0(r2, r5, r5)
        L_0x00cb:
            androidx.preference.C3039b.m7159c0(r4, r5, r10)
            int r2 = androidx.preference.C3039b.m7141J(r13, r13, r5)
            androidx.compose.foundation.layout.C0761x.m1733m(r2, r5)
            s6.q1 r4 = new s6.q1
            r4.<init>((int[]) r14)
            androidx.compose.foundation.layout.C0761x.m1679M(r12, r14)
            int[] r2 = r4.f17337f
            androidx.compose.foundation.layout.C0761x.m1681N(r2, r5, r2)
            s6.q1 r11 = new s6.q1
            r11.<init>((int[]) r5)
            int[] r2 = r4.f17337f
            androidx.compose.foundation.layout.C0761x.m1681N(r13, r2, r5)
            int[] r2 = r11.f17337f
            int r2 = androidx.preference.C3039b.m7167i0(r2, r12, r10)
            if (r2 != 0) goto L_0x0106
            r2 = 9
            r2 = r10[r2]
            r5 = -1
            if (r2 != r5) goto L_0x0114
            int[] r2 = androidx.compose.foundation.layout.C0761x.f1564h
            r5 = 10
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r5, r10, r2)
            if (r2 == 0) goto L_0x0114
            goto L_0x0108
        L_0x0106:
            r5 = 10
        L_0x0108:
            int[] r2 = androidx.compose.foundation.layout.C0761x.f1565i
            r12 = 7
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r12, r2, r10)
            if (r2 == 0) goto L_0x0114
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r5, r10, r12)
        L_0x0114:
            int[] r2 = r11.f17337f
            androidx.compose.foundation.layout.C0761x.m1663E(r10, r2)
            s6.q1 r2 = new s6.q1
            r2.<init>((int[]) r8)
            if (r15 != 0) goto L_0x0125
            int[] r5 = r7.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r8, r5, r8)
        L_0x0125:
            if (r9 != 0) goto L_0x012e
            int[] r5 = r2.f17337f
            int[] r1 = r1.f17337f
            androidx.compose.foundation.layout.C0761x.m1756z(r5, r1, r5)
        L_0x012e:
            p6.d[] r6 = new p209p6.C7681d[r6]
            r1 = 0
            r6[r1] = r2
            s6.r1 r1 = new s6.r1
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7879r1.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7879r1((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7879r1(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7876q1 q1Var = (C7876q1) this.f17050c;
        if (q1Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7876q1 q1Var2 = (C7876q1) this.f17049b;
        C7876q1 q1Var3 = (C7876q1) this.f17051d[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        C0761x.m1679M(q1Var.f17337f, iArr3);
        int[] iArr4 = new int[5];
        C0761x.m1679M(iArr3, iArr4);
        boolean q = q1Var3.mo20108q();
        int[] iArr5 = q1Var3.f17337f;
        if (!q) {
            C0761x.m1679M(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C0761x.m1681N(q1Var2.f17337f, iArr5, iArr);
        if (C3039b.m7166h(q1Var2.f17337f, iArr5, iArr2) != 0 || (iArr2[4] == -1 && C3039b.m7147Q(iArr2, C0761x.f1563g))) {
            C2606m.m6158x(5, -2147483647, iArr2);
        }
        C0761x.m1756z(iArr2, iArr, iArr2);
        C0761x.m1733m(C3039b.m7141J(iArr2, iArr2, iArr2), iArr2);
        C0761x.m1756z(iArr3, q1Var2.f17337f, iArr3);
        C0761x.m1733m(C2606m.m6114I(5, iArr3), iArr3);
        C0761x.m1733m(C2606m.m6156v(5, iArr4, iArr), iArr);
        C7876q1 q1Var4 = new C7876q1(iArr4);
        C0761x.m1679M(iArr2, iArr4);
        int[] iArr6 = q1Var4.f17337f;
        C0761x.m1681N(iArr6, iArr3, iArr6);
        int[] iArr7 = q1Var4.f17337f;
        C0761x.m1681N(iArr7, iArr3, iArr7);
        C7876q1 q1Var5 = new C7876q1(iArr3);
        C0761x.m1681N(iArr3, q1Var4.f17337f, iArr3);
        int[] iArr8 = q1Var5.f17337f;
        C0761x.m1756z(iArr8, iArr2, iArr8);
        int[] iArr9 = q1Var5.f17337f;
        C0761x.m1681N(iArr9, iArr, iArr9);
        C7876q1 q1Var6 = new C7876q1(iArr2);
        if (C2606m.m6154t(5, 0, q1Var.f17337f, iArr2) != 0 || (iArr2[4] == -1 && C3039b.m7147Q(iArr2, C0761x.f1563g))) {
            C2606m.m6158x(5, -2147483647, iArr2);
        }
        if (!q) {
            int[] iArr10 = q1Var6.f17337f;
            C0761x.m1756z(iArr10, q1Var3.f17337f, iArr10);
        }
        return new C7879r1(cVar, q1Var4, q1Var5, new C7681d[]{q1Var6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
