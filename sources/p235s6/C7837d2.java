package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p568fn.C17782b;

/* renamed from: s6.d2 */
public final class C7837d2 extends C7686e.C7689c {
    public C7837d2(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7837d2(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0109, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(14, r10, p568fn.C17782b.f38653x) != false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012e  */
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
            s6.c2 r2 = (p235s6.C7833c2) r2
            p6.d r4 = r0.f17050c
            s6.c2 r4 = (p235s6.C7833c2) r4
            p6.d r5 = r1.f17049b
            s6.c2 r5 = (p235s6.C7833c2) r5
            p6.d r6 = r17.mo20138q()
            s6.c2 r6 = (p235s6.C7833c2) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.c2 r7 = (p235s6.C7833c2) r7
            p6.d r1 = r17.mo20120a()
            s6.c2 r1 = (p235s6.C7833c2) r1
            r9 = 14
            int[] r10 = new int[r9]
            r11 = 7
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f17299f
            int[] r6 = r6.f17299f
            goto L_0x0066
        L_0x0050:
            int[] r9 = r7.f17299f
            p568fn.C17782b.m29852R(r9, r13)
            int[] r5 = r5.f17299f
            p568fn.C17782b.m29894x(r13, r5, r12)
            int[] r5 = r7.f17299f
            p568fn.C17782b.m29894x(r13, r5, r13)
            int[] r5 = r6.f17299f
            p568fn.C17782b.m29894x(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0071
            int[] r2 = r2.f17299f
            int[] r4 = r4.f17299f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17299f
            p568fn.C17782b.m29852R(r8, r14)
            int[] r2 = r2.f17299f
            p568fn.C17782b.m29894x(r14, r2, r10)
            int[] r2 = r1.f17299f
            p568fn.C17782b.m29894x(r14, r2, r14)
            int[] r2 = r4.f17299f
            p568fn.C17782b.m29894x(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0087:
            int[] r8 = new int[r11]
            p568fn.C17782b.m29853S(r2, r5, r8)
            p568fn.C17782b.m29853S(r4, r6, r12)
            boolean r5 = androidx.datastore.preferences.protobuf.C2606m.m6111F(r8)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = androidx.datastore.preferences.protobuf.C2606m.m6111F(r12)
            if (r1 == 0) goto L_0x00a0
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x00a0:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a5:
            p568fn.C17782b.m29852R(r8, r13)
            int[] r5 = new int[r11]
            p568fn.C17782b.m29894x(r13, r8, r5)
            p568fn.C17782b.m29894x(r13, r2, r13)
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6111F(r5)
            r6 = 1
            if (r2 == 0) goto L_0x00cc
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
            r11 = 6
            r5[r11] = r2
            goto L_0x00d1
        L_0x00cc:
            int[] r2 = p568fn.C17782b.f38652w
            androidx.datastore.preferences.protobuf.C2606m.m6131Z(r2, r5, r5)
        L_0x00d1:
            androidx.datastore.preferences.protobuf.C2606m.m6120O(r4, r5, r10)
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6106A(r13, r13, r5)
            p568fn.C17782b.m29880q(r2, r5)
            s6.c2 r4 = new s6.c2
            r4.<init>((int[]) r14)
            p568fn.C17782b.m29852R(r12, r14)
            int[] r2 = r4.f17299f
            p568fn.C17782b.m29853S(r2, r5, r2)
            s6.c2 r11 = new s6.c2
            r11.<init>((int[]) r5)
            int[] r2 = r4.f17299f
            p568fn.C17782b.m29853S(r13, r2, r5)
            int[] r2 = r11.f17299f
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6126U(r2, r12, r10)
            if (r2 != 0) goto L_0x010c
            r2 = 13
            r2 = r10[r2]
            r5 = -1
            if (r2 != r5) goto L_0x011b
            int[] r2 = p568fn.C17782b.f38653x
            r5 = 14
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r5, r10, r2)
            if (r2 == 0) goto L_0x011b
            goto L_0x010e
        L_0x010c:
            r5 = 14
        L_0x010e:
            int[] r2 = p568fn.C17782b.f38654y
            r12 = 9
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r12, r2, r10)
            if (r2 == 0) goto L_0x011b
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r5, r10, r12)
        L_0x011b:
            int[] r2 = r11.f17299f
            p568fn.C17782b.m29830A(r10, r2)
            s6.c2 r2 = new s6.c2
            r2.<init>((int[]) r8)
            if (r15 != 0) goto L_0x012c
            int[] r5 = r7.f17299f
            p568fn.C17782b.m29894x(r8, r5, r8)
        L_0x012c:
            if (r9 != 0) goto L_0x0135
            int[] r5 = r2.f17299f
            int[] r1 = r1.f17299f
            p568fn.C17782b.m29894x(r5, r1, r5)
        L_0x0135:
            p6.d[] r6 = new p209p6.C7681d[r6]
            r1 = 0
            r6[r1] = r2
            s6.d2 r1 = new s6.d2
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7837d2.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7837d2((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7837d2(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7833c2 c2Var = (C7833c2) this.f17050c;
        if (c2Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7833c2 c2Var2 = (C7833c2) this.f17049b;
        C7833c2 c2Var3 = (C7833c2) this.f17051d[0];
        int[] iArr = new int[7];
        C17782b.m29852R(c2Var.f17299f, iArr);
        int[] iArr2 = new int[7];
        C17782b.m29852R(iArr, iArr2);
        int[] iArr3 = new int[7];
        C17782b.m29852R(c2Var2.f17299f, iArr3);
        C17782b.m29880q(C2606m.m6106A(iArr3, iArr3, iArr3), iArr3);
        C17782b.m29894x(iArr, c2Var2.f17299f, iArr);
        C17782b.m29880q(C2606m.m6114I(7, iArr), iArr);
        int[] iArr4 = new int[7];
        C17782b.m29880q(C2606m.m6156v(7, iArr2, iArr4), iArr4);
        C7833c2 c2Var4 = new C7833c2(iArr2);
        C17782b.m29852R(iArr3, iArr2);
        int[] iArr5 = c2Var4.f17299f;
        C17782b.m29853S(iArr5, iArr, iArr5);
        int[] iArr6 = c2Var4.f17299f;
        C17782b.m29853S(iArr6, iArr, iArr6);
        C7833c2 c2Var5 = new C7833c2(iArr);
        C17782b.m29853S(iArr, c2Var4.f17299f, iArr);
        int[] iArr7 = c2Var5.f17299f;
        C17782b.m29894x(iArr7, iArr3, iArr7);
        int[] iArr8 = c2Var5.f17299f;
        C17782b.m29853S(iArr8, iArr4, iArr8);
        C7833c2 c2Var6 = new C7833c2(iArr3);
        if (C2606m.m6154t(7, 0, c2Var.f17299f, iArr3) != 0 || (iArr3[6] == -1 && C2606m.m6122Q(iArr3, C17782b.f38652w))) {
            C2606m.m6143i(7, 6803, iArr3);
        }
        if (!c2Var3.mo20108q()) {
            int[] iArr9 = c2Var6.f17299f;
            C17782b.m29894x(iArr9, c2Var3.f17299f, iArr9);
        }
        return new C7837d2(cVar, c2Var4, c2Var5, new C7681d[]{c2Var6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
