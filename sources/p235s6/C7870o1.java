package p235s6;

import androidx.activity.C0114h;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;

/* renamed from: s6.o1 */
public final class C7870o1 extends C7686e.C7689c {
    public C7870o1(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7870o1(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
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
            s6.t1 r2 = (p235s6.C7885t1) r2
            p6.d r4 = r0.f17050c
            s6.t1 r4 = (p235s6.C7885t1) r4
            p6.d r5 = r1.f17049b
            s6.t1 r5 = (p235s6.C7885t1) r5
            p6.d r6 = r17.mo20138q()
            s6.t1 r6 = (p235s6.C7885t1) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.t1 r7 = (p235s6.C7885t1) r7
            p6.d r1 = r17.mo20120a()
            s6.t1 r1 = (p235s6.C7885t1) r1
            r9 = 10
            int[] r9 = new int[r9]
            r10 = 5
            int[] r11 = new int[r10]
            int[] r12 = new int[r10]
            int[] r13 = new int[r10]
            boolean r14 = r7.mo20108q()
            if (r14 == 0) goto L_0x0050
            int[] r5 = r5.f17346f
            int[] r6 = r6.f17346f
            goto L_0x0066
        L_0x0050:
            int[] r15 = r7.f17346f
            androidx.activity.C0114h.m291V(r15, r12)
            int[] r5 = r5.f17346f
            androidx.activity.C0114h.m271C(r12, r5, r11)
            int[] r5 = r7.f17346f
            androidx.activity.C0114h.m271C(r12, r5, r12)
            int[] r5 = r6.f17346f
            androidx.activity.C0114h.m271C(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x0066:
            boolean r15 = r1.mo20108q()
            if (r15 == 0) goto L_0x0071
            int[] r2 = r2.f17346f
            int[] r4 = r4.f17346f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17346f
            androidx.activity.C0114h.m291V(r8, r13)
            int[] r2 = r2.f17346f
            androidx.activity.C0114h.m271C(r13, r2, r9)
            int[] r2 = r1.f17346f
            androidx.activity.C0114h.m271C(r13, r2, r13)
            int[] r2 = r4.f17346f
            androidx.activity.C0114h.m271C(r13, r2, r13)
            r2 = r9
            r4 = r13
        L_0x0087:
            int[] r8 = new int[r10]
            androidx.activity.C0114h.m292W(r2, r5, r8)
            androidx.activity.C0114h.m292W(r4, r6, r11)
            boolean r5 = androidx.preference.C3039b.m7146P(r8)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = androidx.preference.C3039b.m7146P(r11)
            if (r1 == 0) goto L_0x00a0
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x00a0:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a5:
            androidx.activity.C0114h.m291V(r8, r12)
            int[] r5 = new int[r10]
            androidx.activity.C0114h.m271C(r12, r8, r5)
            androidx.activity.C0114h.m271C(r12, r2, r12)
            boolean r2 = androidx.preference.C3039b.m7146P(r5)
            r6 = 1
            if (r2 == 0) goto L_0x00c6
            r2 = 0
            r5[r2] = r2
            r5[r6] = r2
            r10 = 2
            r5[r10] = r2
            r10 = 3
            r5[r10] = r2
            r10 = 4
            r5[r10] = r2
            goto L_0x00cb
        L_0x00c6:
            int[] r2 = androidx.activity.C0114h.f183t
            androidx.preference.C3039b.m7178o0(r2, r5, r5)
        L_0x00cb:
            androidx.preference.C3039b.m7159c0(r4, r5, r9)
            int r2 = androidx.preference.C3039b.m7141J(r12, r12, r5)
            androidx.activity.C0114h.m327x(r2, r5)
            s6.t1 r4 = new s6.t1
            r4.<init>((int[]) r13)
            androidx.activity.C0114h.m291V(r11, r13)
            int[] r2 = r4.f17346f
            androidx.activity.C0114h.m292W(r2, r5, r2)
            s6.t1 r10 = new s6.t1
            r10.<init>((int[]) r5)
            int[] r2 = r4.f17346f
            androidx.activity.C0114h.m292W(r12, r2, r5)
            int[] r2 = r10.f17346f
            androidx.activity.C0114h.m279J(r2, r11, r9)
            int[] r2 = r10.f17346f
            androidx.activity.C0114h.m278I(r9, r2)
            s6.t1 r2 = new s6.t1
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x0102
            int[] r5 = r7.f17346f
            androidx.activity.C0114h.m271C(r8, r5, r8)
        L_0x0102:
            if (r15 != 0) goto L_0x010b
            int[] r5 = r2.f17346f
            int[] r1 = r1.f17346f
            androidx.activity.C0114h.m271C(r5, r1, r5)
        L_0x010b:
            p6.d[] r6 = new p209p6.C7681d[r6]
            r1 = 0
            r6[r1] = r2
            s6.o1 r1 = new s6.o1
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7870o1.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7870o1((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7870o1(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7885t1 t1Var = (C7885t1) this.f17050c;
        if (t1Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7885t1 t1Var2 = (C7885t1) this.f17049b;
        C7885t1 t1Var3 = (C7885t1) this.f17051d[0];
        int[] iArr = new int[5];
        C0114h.m291V(t1Var.f17346f, iArr);
        int[] iArr2 = new int[5];
        C0114h.m291V(iArr, iArr2);
        int[] iArr3 = new int[5];
        C0114h.m291V(t1Var2.f17346f, iArr3);
        C0114h.m327x(C3039b.m7141J(iArr3, iArr3, iArr3), iArr3);
        C0114h.m271C(iArr, t1Var2.f17346f, iArr);
        C0114h.m327x(C2606m.m6114I(5, iArr), iArr);
        int[] iArr4 = new int[5];
        C0114h.m327x(C2606m.m6156v(5, iArr2, iArr4), iArr4);
        C7885t1 t1Var4 = new C7885t1(iArr2);
        C0114h.m291V(iArr3, iArr2);
        int[] iArr5 = t1Var4.f17346f;
        C0114h.m292W(iArr5, iArr, iArr5);
        int[] iArr6 = t1Var4.f17346f;
        C0114h.m292W(iArr6, iArr, iArr6);
        C7885t1 t1Var5 = new C7885t1(iArr);
        C0114h.m292W(iArr, t1Var4.f17346f, iArr);
        int[] iArr7 = t1Var5.f17346f;
        C0114h.m271C(iArr7, iArr3, iArr7);
        int[] iArr8 = t1Var5.f17346f;
        C0114h.m292W(iArr8, iArr4, iArr8);
        C7885t1 t1Var6 = new C7885t1(iArr3);
        if (C2606m.m6154t(5, 0, t1Var.f17346f, iArr3) != 0 || (iArr3[4] == -1 && C3039b.m7147Q(iArr3, C0114h.f183t))) {
            C2606m.m6143i(5, 21389, iArr3);
        }
        if (!t1Var3.mo20108q()) {
            int[] iArr9 = t1Var6.f17346f;
            C0114h.m271C(iArr9, t1Var3.f17346f, iArr9);
        }
        return new C7870o1(cVar, t1Var4, t1Var5, new C7681d[]{t1Var6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
