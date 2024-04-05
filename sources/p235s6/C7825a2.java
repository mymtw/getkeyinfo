package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p383ke.C12995a;

/* renamed from: s6.a2 */
public final class C7825a2 extends C7686e.C7689c {
    public C7825a2(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7825a2(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(12, r10, p383ke.C12995a.f28611g) != false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
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
            s6.z1 r2 = (p235s6.C7903z1) r2
            p6.d r4 = r0.f17050c
            s6.z1 r4 = (p235s6.C7903z1) r4
            p6.d r5 = r1.f17049b
            s6.z1 r5 = (p235s6.C7903z1) r5
            p6.d r6 = r17.mo20138q()
            s6.z1 r6 = (p235s6.C7903z1) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.z1 r7 = (p235s6.C7903z1) r7
            p6.d r1 = r17.mo20120a()
            s6.z1 r1 = (p235s6.C7903z1) r1
            r9 = 12
            int[] r10 = new int[r9]
            r11 = 6
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f17362f
            int[] r6 = r6.f17362f
            goto L_0x0066
        L_0x0050:
            int[] r9 = r7.f17362f
            p383ke.C12995a.m20701q(r9, r13)
            int[] r5 = r5.f17362f
            p383ke.C12995a.m20696k(r13, r5, r12)
            int[] r5 = r7.f17362f
            p383ke.C12995a.m20696k(r13, r5, r13)
            int[] r5 = r6.f17362f
            p383ke.C12995a.m20696k(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0071
            int[] r2 = r2.f17362f
            int[] r4 = r4.f17362f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17362f
            p383ke.C12995a.m20701q(r8, r14)
            int[] r2 = r2.f17362f
            p383ke.C12995a.m20696k(r14, r2, r10)
            int[] r2 = r1.f17362f
            p383ke.C12995a.m20696k(r14, r2, r14)
            int[] r2 = r4.f17362f
            p383ke.C12995a.m20696k(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0087:
            int[] r8 = new int[r11]
            p383ke.C12995a.m20702r(r2, r5, r8)
            p383ke.C12995a.m20702r(r4, r6, r12)
            boolean r5 = androidx.preference.C3039b.m7151U(r8)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = androidx.preference.C3039b.m7151U(r12)
            if (r1 == 0) goto L_0x00a0
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x00a0:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a5:
            p383ke.C12995a.m20701q(r8, r13)
            int[] r5 = new int[r11]
            p383ke.C12995a.m20696k(r13, r8, r5)
            p383ke.C12995a.m20696k(r13, r2, r13)
            boolean r2 = androidx.preference.C3039b.m7151U(r5)
            r6 = 1
            if (r2 == 0) goto L_0x00c9
            r2 = 0
            r5[r2] = r2
            r5[r6] = r2
            r11 = 2
            r5[r11] = r2
            r11 = 3
            r5[r11] = r2
            r11 = 4
            r5[r11] = r2
            r11 = 5
            r5[r11] = r2
            goto L_0x00ce
        L_0x00c9:
            int[] r2 = p383ke.C12995a.f28610f
            androidx.preference.C3039b.m7180p0(r2, r5, r5)
        L_0x00ce:
            androidx.preference.C3039b.m7163f0(r4, r5, r10)
            int r2 = androidx.preference.C3039b.m7150T(r13, r13, r5)
            p383ke.C12995a.m20693h(r2, r5)
            s6.z1 r4 = new s6.z1
            r4.<init>((int[]) r14)
            p383ke.C12995a.m20701q(r12, r14)
            int[] r2 = r4.f17362f
            p383ke.C12995a.m20702r(r2, r5, r2)
            s6.z1 r11 = new s6.z1
            r11.<init>((int[]) r5)
            int[] r2 = r4.f17362f
            p383ke.C12995a.m20702r(r13, r2, r5)
            int[] r2 = r11.f17362f
            int r2 = androidx.preference.C3039b.m7173l0(r2, r12, r10)
            if (r2 != 0) goto L_0x0109
            r2 = 11
            r2 = r10[r2]
            r5 = -1
            if (r2 != r5) goto L_0x0118
            int[] r2 = p383ke.C12995a.f28611g
            r5 = 12
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r5, r10, r2)
            if (r2 == 0) goto L_0x0118
            goto L_0x010b
        L_0x0109:
            r5 = 12
        L_0x010b:
            int[] r2 = p383ke.C12995a.f28612h
            r12 = 9
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r12, r2, r10)
            if (r2 == 0) goto L_0x0118
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r5, r10, r12)
        L_0x0118:
            int[] r2 = r11.f17362f
            p383ke.C12995a.m20698m(r10, r2)
            s6.z1 r2 = new s6.z1
            r2.<init>((int[]) r8)
            if (r15 != 0) goto L_0x0129
            int[] r5 = r7.f17362f
            p383ke.C12995a.m20696k(r8, r5, r8)
        L_0x0129:
            if (r9 != 0) goto L_0x0132
            int[] r5 = r2.f17362f
            int[] r1 = r1.f17362f
            p383ke.C12995a.m20696k(r5, r1, r5)
        L_0x0132:
            p6.d[] r6 = new p209p6.C7681d[r6]
            r1 = 0
            r6[r1] = r2
            s6.a2 r1 = new s6.a2
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7825a2.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7825a2((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7825a2(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7903z1 z1Var = (C7903z1) this.f17050c;
        if (z1Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7903z1 z1Var2 = (C7903z1) this.f17049b;
        C7903z1 z1Var3 = (C7903z1) this.f17051d[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        C12995a.m20701q(z1Var.f17362f, iArr3);
        int[] iArr4 = new int[6];
        C12995a.m20701q(iArr3, iArr4);
        boolean q = z1Var3.mo20108q();
        int[] iArr5 = z1Var3.f17362f;
        if (!q) {
            C12995a.m20701q(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C12995a.m20702r(z1Var2.f17362f, iArr5, iArr);
        if (C3039b.m7133B(z1Var2.f17362f, iArr5, iArr2) != 0 || (iArr2[5] == -1 && C3039b.m7152V(iArr2, C12995a.f28610f))) {
            C12995a.m20694i(iArr2);
        }
        C12995a.m20696k(iArr2, iArr, iArr2);
        C12995a.m20693h(C3039b.m7150T(iArr2, iArr2, iArr2), iArr2);
        C12995a.m20696k(iArr3, z1Var2.f17362f, iArr3);
        C12995a.m20693h(C2606m.m6114I(6, iArr3), iArr3);
        C12995a.m20693h(C2606m.m6156v(6, iArr4, iArr), iArr);
        C7903z1 z1Var4 = new C7903z1(iArr4);
        C12995a.m20701q(iArr2, iArr4);
        int[] iArr6 = z1Var4.f17362f;
        C12995a.m20702r(iArr6, iArr3, iArr6);
        int[] iArr7 = z1Var4.f17362f;
        C12995a.m20702r(iArr7, iArr3, iArr7);
        C7903z1 z1Var5 = new C7903z1(iArr3);
        C12995a.m20702r(iArr3, z1Var4.f17362f, iArr3);
        int[] iArr8 = z1Var5.f17362f;
        C12995a.m20696k(iArr8, iArr2, iArr8);
        int[] iArr9 = z1Var5.f17362f;
        C12995a.m20702r(iArr9, iArr, iArr9);
        C7903z1 z1Var6 = new C7903z1(iArr2);
        if (C2606m.m6154t(6, 0, z1Var.f17362f, iArr2) != 0 || (iArr2[5] == -1 && C3039b.m7152V(iArr2, C12995a.f28610f))) {
            C12995a.m20694i(iArr2);
        }
        if (!q) {
            int[] iArr10 = z1Var6.f17362f;
            C12995a.m20696k(iArr10, z1Var3.f17362f, iArr10);
        }
        return new C7825a2(cVar, z1Var4, z1Var5, new C7681d[]{z1Var6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
