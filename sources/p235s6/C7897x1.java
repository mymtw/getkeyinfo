package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p772tq.C20203a;

/* renamed from: s6.x1 */
public final class C7897x1 extends C7686e.C7689c {
    public C7897x1(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7897x1(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(12, r10, p772tq.C20203a.f44785o) != false) goto L_0x010b;
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
            s6.w1 r2 = (p235s6.C7894w1) r2
            p6.d r4 = r0.f17050c
            s6.w1 r4 = (p235s6.C7894w1) r4
            p6.d r5 = r1.f17049b
            s6.w1 r5 = (p235s6.C7894w1) r5
            p6.d r6 = r17.mo20138q()
            s6.w1 r6 = (p235s6.C7894w1) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.w1 r7 = (p235s6.C7894w1) r7
            p6.d r1 = r17.mo20120a()
            s6.w1 r1 = (p235s6.C7894w1) r1
            r9 = 12
            int[] r10 = new int[r9]
            r11 = 6
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f17355f
            int[] r6 = r6.f17355f
            goto L_0x0066
        L_0x0050:
            int[] r9 = r7.f17355f
            p772tq.C20203a.m34536x(r9, r13)
            int[] r5 = r5.f17355f
            p772tq.C20203a.m34531s(r13, r5, r12)
            int[] r5 = r7.f17355f
            p772tq.C20203a.m34531s(r13, r5, r13)
            int[] r5 = r6.f17355f
            p772tq.C20203a.m34531s(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0071
            int[] r2 = r2.f17355f
            int[] r4 = r4.f17355f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17355f
            p772tq.C20203a.m34536x(r8, r14)
            int[] r2 = r2.f17355f
            p772tq.C20203a.m34531s(r14, r2, r10)
            int[] r2 = r1.f17355f
            p772tq.C20203a.m34531s(r14, r2, r14)
            int[] r2 = r4.f17355f
            p772tq.C20203a.m34531s(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0087:
            int[] r8 = new int[r11]
            p772tq.C20203a.m34537y(r2, r5, r8)
            p772tq.C20203a.m34537y(r4, r6, r12)
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
            p772tq.C20203a.m34536x(r8, r13)
            int[] r5 = new int[r11]
            p772tq.C20203a.m34531s(r13, r8, r5)
            p772tq.C20203a.m34531s(r13, r2, r13)
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
            int[] r2 = p772tq.C20203a.f44784n
            androidx.preference.C3039b.m7180p0(r2, r5, r5)
        L_0x00ce:
            androidx.preference.C3039b.m7163f0(r4, r5, r10)
            int r2 = androidx.preference.C3039b.m7150T(r13, r13, r5)
            p772tq.C20203a.m34528p(r2, r5)
            s6.w1 r4 = new s6.w1
            r4.<init>((int[]) r14)
            p772tq.C20203a.m34536x(r12, r14)
            int[] r2 = r4.f17355f
            p772tq.C20203a.m34537y(r2, r5, r2)
            s6.w1 r11 = new s6.w1
            r11.<init>((int[]) r5)
            int[] r2 = r4.f17355f
            p772tq.C20203a.m34537y(r13, r2, r5)
            int[] r2 = r11.f17355f
            int r2 = androidx.preference.C3039b.m7173l0(r2, r12, r10)
            if (r2 != 0) goto L_0x0109
            r2 = 11
            r2 = r10[r2]
            r5 = -1
            if (r2 != r5) goto L_0x0118
            int[] r2 = p772tq.C20203a.f44785o
            r5 = 12
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r5, r10, r2)
            if (r2 == 0) goto L_0x0118
            goto L_0x010b
        L_0x0109:
            r5 = 12
        L_0x010b:
            int[] r2 = p772tq.C20203a.f44786p
            r12 = 8
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r12, r2, r10)
            if (r2 == 0) goto L_0x0118
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r5, r10, r12)
        L_0x0118:
            int[] r2 = r11.f17355f
            p772tq.C20203a.m34533u(r10, r2)
            s6.w1 r2 = new s6.w1
            r2.<init>((int[]) r8)
            if (r15 != 0) goto L_0x0129
            int[] r5 = r7.f17355f
            p772tq.C20203a.m34531s(r8, r5, r8)
        L_0x0129:
            if (r9 != 0) goto L_0x0132
            int[] r5 = r2.f17355f
            int[] r1 = r1.f17355f
            p772tq.C20203a.m34531s(r5, r1, r5)
        L_0x0132:
            p6.d[] r6 = new p209p6.C7681d[r6]
            r1 = 0
            r6[r1] = r2
            s6.x1 r1 = new s6.x1
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7897x1.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7897x1((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7897x1(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7894w1 w1Var = (C7894w1) this.f17050c;
        if (w1Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7894w1 w1Var2 = (C7894w1) this.f17049b;
        C7894w1 w1Var3 = (C7894w1) this.f17051d[0];
        int[] iArr = new int[6];
        C20203a.m34536x(w1Var.f17355f, iArr);
        int[] iArr2 = new int[6];
        C20203a.m34536x(iArr, iArr2);
        int[] iArr3 = new int[6];
        C20203a.m34536x(w1Var2.f17355f, iArr3);
        C20203a.m34528p(C3039b.m7150T(iArr3, iArr3, iArr3), iArr3);
        C20203a.m34531s(iArr, w1Var2.f17355f, iArr);
        C20203a.m34528p(C2606m.m6114I(6, iArr), iArr);
        int[] iArr4 = new int[6];
        C20203a.m34528p(C2606m.m6156v(6, iArr2, iArr4), iArr4);
        C7894w1 w1Var4 = new C7894w1(iArr2);
        C20203a.m34536x(iArr3, iArr2);
        int[] iArr5 = w1Var4.f17355f;
        C20203a.m34537y(iArr5, iArr, iArr5);
        int[] iArr6 = w1Var4.f17355f;
        C20203a.m34537y(iArr6, iArr, iArr6);
        C7894w1 w1Var5 = new C7894w1(iArr);
        C20203a.m34537y(iArr, w1Var4.f17355f, iArr);
        int[] iArr7 = w1Var5.f17355f;
        C20203a.m34531s(iArr7, iArr3, iArr7);
        int[] iArr8 = w1Var5.f17355f;
        C20203a.m34537y(iArr8, iArr4, iArr8);
        C7894w1 w1Var6 = new C7894w1(iArr3);
        if (C2606m.m6154t(6, 0, w1Var.f17355f, iArr3) != 0 || (iArr3[5] == -1 && C3039b.m7152V(iArr3, C20203a.f44784n))) {
            C2606m.m6143i(6, 4553, iArr3);
        }
        if (!w1Var3.mo20108q()) {
            int[] iArr9 = w1Var6.f17355f;
            C20203a.m34531s(iArr9, w1Var3.f17355f, iArr9);
        }
        return new C7897x1(cVar, w1Var4, w1Var5, new C7681d[]{w1Var6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
