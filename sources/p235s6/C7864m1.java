package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.work.C3436p;
import kotlin.jvm.internal.C19382n;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;

/* renamed from: s6.m1 */
public final class C7864m1 extends C7686e.C7689c {
    public C7864m1(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7864m1(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r38v0, types: [p6.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p6.C7686e mo20131j(p209p6.C7686e r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            boolean r2 = r37.mo20141t()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r38.mo20141t()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            p6.e r1 = r37.mo20145w()
            return r1
        L_0x0019:
            p6.c r3 = r0.f17048a
            p6.d r2 = r0.f17049b
            s6.s0 r2 = (p235s6.C7881s0) r2
            p6.d r4 = r0.f17050c
            s6.s0 r4 = (p235s6.C7881s0) r4
            p6.d r5 = r1.f17049b
            s6.s0 r5 = (p235s6.C7881s0) r5
            p6.d r6 = r38.mo20138q()
            s6.s0 r6 = (p235s6.C7881s0) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.s0 r7 = (p235s6.C7881s0) r7
            p6.d r1 = r38.mo20120a()
            s6.s0 r1 = (p235s6.C7881s0) r1
            r9 = 8
            int[] r10 = new int[r9]
            r11 = 4
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f17340f
            int[] r6 = r6.f17340f
            goto L_0x0066
        L_0x0050:
            int[] r9 = r7.f17340f
            kotlin.jvm.internal.C19382n.m32733U(r9, r13)
            int[] r5 = r5.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r13, r5, r12)
            int[] r5 = r7.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r13, r5, r13)
            int[] r5 = r6.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0071
            int[] r2 = r2.f17340f
            int[] r4 = r4.f17340f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17340f
            kotlin.jvm.internal.C19382n.m32733U(r8, r14)
            int[] r2 = r2.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r14, r2, r10)
            int[] r2 = r1.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r14, r2, r14)
            int[] r2 = r4.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0087:
            int[] r8 = new int[r11]
            kotlin.jvm.internal.C19382n.m32734V(r2, r5, r8)
            kotlin.jvm.internal.C19382n.m32734V(r4, r6, r12)
            boolean r5 = androidx.work.C3436p.m8254q(r8)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = androidx.work.C3436p.m8254q(r12)
            if (r1 == 0) goto L_0x00a0
            p6.e r1 = r37.mo20145w()
            return r1
        L_0x00a0:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a5:
            kotlin.jvm.internal.C19382n.m32733U(r8, r13)
            int[] r5 = new int[r11]
            kotlin.jvm.internal.C19382n.m32711H(r13, r8, r5)
            kotlin.jvm.internal.C19382n.m32711H(r13, r2, r13)
            boolean r2 = androidx.work.C3436p.m8254q(r5)
            r6 = 3
            r16 = 2
            r11 = 1
            if (r2 == 0) goto L_0x00c4
            r2 = 0
            r5[r2] = r2
            r5[r11] = r2
            r5[r16] = r2
            r5[r6] = r2
            goto L_0x00c9
        L_0x00c4:
            int[] r2 = kotlin.jvm.internal.C19382n.f43259i
            androidx.work.C3436p.m8235I(r2, r5, r5)
        L_0x00c9:
            androidx.work.C3436p.m8263z(r4, r5, r10)
            int r2 = androidx.work.C3436p.m8251m(r13, r13, r5)
            kotlin.jvm.internal.C19382n.m32769s(r2, r5)
            s6.s0 r4 = new s6.s0
            r4.<init>((int[]) r14)
            kotlin.jvm.internal.C19382n.m32733U(r12, r14)
            int[] r2 = r4.f17340f
            kotlin.jvm.internal.C19382n.m32734V(r2, r5, r2)
            s6.s0 r14 = new s6.s0
            r14.<init>((int[]) r5)
            int[] r2 = r4.f17340f
            kotlin.jvm.internal.C19382n.m32734V(r13, r2, r5)
            int[] r2 = r14.f17340f
            r5 = 0
            r13 = r12[r5]
            r5 = r7
            long r6 = (long) r13
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r18
            r13 = r12[r11]
            r20 = r3
            r21 = r4
            long r3 = (long) r13
            long r3 = r3 & r18
            r13 = r12[r16]
            r16 = r1
            long r0 = (long) r13
            long r0 = r0 & r18
            r13 = 3
            r12 = r12[r13]
            long r12 = (long) r12
            long r12 = r12 & r18
            r22 = 0
            r25 = r5
            r24 = r8
            r17 = r9
            r8 = r22
            r5 = 4
            r11 = 0
        L_0x011a:
            if (r11 >= r5) goto L_0x0191
            r5 = r2[r11]
            r27 = r14
            r26 = r15
            long r14 = (long) r5
            long r14 = r14 & r18
            long r28 = r14 * r6
            int r5 = r11 + 0
            r30 = r2
            r2 = r10[r5]
            r31 = r6
            long r6 = (long) r2
            long r6 = r6 & r18
            long r28 = r28 + r6
            long r6 = r28 + r22
            int r2 = (int) r6
            r10[r5] = r2
            r2 = 32
            long r5 = r6 >>> r2
            long r28 = r14 * r3
            int r7 = r11 + 1
            r2 = r10[r7]
            r33 = r3
            long r2 = (long) r2
            long r2 = r2 & r18
            long r28 = r28 + r2
            long r2 = r28 + r5
            int r4 = (int) r2
            r10[r7] = r4
            r4 = 32
            long r2 = r2 >>> r4
            long r5 = r14 * r0
            int r28 = r11 + 2
            r4 = r10[r28]
            r35 = r0
            long r0 = (long) r4
            long r0 = r0 & r18
            long r5 = r5 + r0
            long r5 = r5 + r2
            int r0 = (int) r5
            r10[r28] = r0
            r0 = 32
            long r1 = r5 >>> r0
            long r14 = r14 * r12
            int r3 = r11 + 3
            r4 = r10[r3]
            long r4 = (long) r4
            long r4 = r4 & r18
            long r14 = r14 + r4
            long r14 = r14 + r1
            int r1 = (int) r14
            r10[r3] = r1
            long r1 = r14 >>> r0
            int r11 = r11 + 4
            r3 = r10[r11]
            long r3 = (long) r3
            long r3 = r3 & r18
            long r8 = r8 + r3
            long r8 = r8 + r1
            int r1 = (int) r8
            r10[r11] = r1
            long r8 = r8 >>> r0
            r11 = r7
            r15 = r26
            r14 = r27
            r2 = r30
            r6 = r31
            r3 = r33
            r0 = r35
            r5 = 4
            goto L_0x011a
        L_0x0191:
            r27 = r14
            r26 = r15
            int r0 = (int) r8
            if (r0 != 0) goto L_0x01aa
            r0 = 7
            r0 = r10[r0]
            r1 = 1
            int r0 = r0 >>> r1
            r1 = 2147483646(0x7ffffffe, float:NaN)
            if (r0 < r1) goto L_0x01b1
            int[] r0 = kotlin.jvm.internal.C19382n.f43260j
            boolean r0 = androidx.work.C3436p.m8227A(r10, r0)
            if (r0 == 0) goto L_0x01b1
        L_0x01aa:
            int[] r0 = kotlin.jvm.internal.C19382n.f43261k
            r1 = 8
            androidx.datastore.preferences.protobuf.C2606m.m6136c(r1, r0, r10)
        L_0x01b1:
            r0 = r27
            int[] r1 = r0.f17340f
            kotlin.jvm.internal.C19382n.m32721M(r10, r1)
            s6.s0 r1 = new s6.s0
            r2 = r24
            r1.<init>((int[]) r2)
            if (r26 != 0) goto L_0x01c8
            r7 = r25
            int[] r3 = r7.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r2, r3, r2)
        L_0x01c8:
            if (r17 != 0) goto L_0x01d3
            int[] r2 = r1.f17340f
            r3 = r16
            int[] r3 = r3.f17340f
            kotlin.jvm.internal.C19382n.m32711H(r2, r3, r2)
        L_0x01d3:
            r2 = 1
            p6.d[] r6 = new p209p6.C7681d[r2]
            r2 = 0
            r6[r2] = r1
            s6.m1 r1 = new s6.m1
            r8 = r37
            boolean r7 = r8.f17052e
            r2 = r1
            r3 = r20
            r4 = r21
            r5 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7864m1.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7864m1((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7864m1(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7881s0 s0Var = (C7881s0) this.f17050c;
        if (s0Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7881s0 s0Var2 = (C7881s0) this.f17049b;
        C7881s0 s0Var3 = (C7881s0) this.f17051d[0];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        C19382n.m32733U(s0Var.f17340f, iArr3);
        int[] iArr4 = new int[4];
        C19382n.m32733U(iArr3, iArr4);
        boolean q = s0Var3.mo20108q();
        int[] iArr5 = s0Var3.f17340f;
        if (!q) {
            C19382n.m32733U(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C19382n.m32734V(s0Var2.f17340f, iArr5, iArr);
        C19382n.m32779x(s0Var2.f17340f, iArr5, iArr2);
        C19382n.m32711H(iArr2, iArr, iArr2);
        C19382n.m32769s(C3436p.m8251m(iArr2, iArr2, iArr2), iArr2);
        C19382n.m32711H(iArr3, s0Var2.f17340f, iArr3);
        C19382n.m32769s(C2606m.m6114I(4, iArr3), iArr3);
        C19382n.m32769s(C2606m.m6156v(4, iArr4, iArr), iArr);
        C7881s0 s0Var4 = new C7881s0(iArr4);
        C19382n.m32733U(iArr2, iArr4);
        int[] iArr6 = s0Var4.f17340f;
        C19382n.m32734V(iArr6, iArr3, iArr6);
        int[] iArr7 = s0Var4.f17340f;
        C19382n.m32734V(iArr7, iArr3, iArr7);
        C7881s0 s0Var5 = new C7881s0(iArr3);
        C19382n.m32734V(iArr3, s0Var4.f17340f, iArr3);
        int[] iArr8 = s0Var5.f17340f;
        C19382n.m32711H(iArr8, iArr2, iArr8);
        int[] iArr9 = s0Var5.f17340f;
        C19382n.m32734V(iArr9, iArr, iArr9);
        C7881s0 s0Var6 = new C7881s0(iArr2);
        if (C2606m.m6154t(4, 0, s0Var.f17340f, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && C3436p.m8255r(iArr2, C19382n.f43259i))) {
            C19382n.m32777w(iArr2);
        }
        if (!q) {
            int[] iArr10 = s0Var6.f17340f;
            C19382n.m32711H(iArr10, s0Var3.f17340f, iArr10);
        }
        return new C7864m1(cVar, s0Var4, s0Var5, new C7681d[]{s0Var6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
