package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p610kp.C18161c;

/* renamed from: s6.m */
public final class C7862m extends C7686e.C7689c {
    public C7862m(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7862m(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [p6.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p6.C7686e mo20131j(p209p6.C7686e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r17.mo20141t()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r18.mo20141t()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            p6.e r1 = r17.mo20145w()
            return r1
        L_0x0019:
            p6.c r3 = r0.f17048a
            p6.d r2 = r0.f17049b
            s6.l r2 = (p235s6.C7859l) r2
            p6.d r4 = r0.f17050c
            s6.l r4 = (p235s6.C7859l) r4
            p6.d r5 = r1.f17049b
            s6.l r5 = (p235s6.C7859l) r5
            p6.d r6 = r18.mo20138q()
            s6.l r6 = (p235s6.C7859l) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.l r7 = (p235s6.C7859l) r7
            p6.d r1 = r18.mo20120a()
            s6.l r1 = (p235s6.C7859l) r1
            r9 = 24
            int[] r10 = new int[r9]
            int[] r11 = new int[r9]
            r12 = 12
            int[] r13 = new int[r12]
            int[] r14 = new int[r12]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0051
            int[] r5 = r5.f17322f
            int[] r6 = r6.f17322f
            goto L_0x0067
        L_0x0051:
            int[] r9 = r7.f17322f
            p610kp.C18161c.m30666j(r9, r13)
            int[] r5 = r5.f17322f
            p610kp.C18161c.m30665i(r13, r5, r11)
            int[] r5 = r7.f17322f
            p610kp.C18161c.m30665i(r13, r5, r13)
            int[] r5 = r6.f17322f
            p610kp.C18161c.m30665i(r13, r5, r13)
            r5 = r11
            r6 = r13
        L_0x0067:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0072
            int[] r2 = r2.f17322f
            int[] r4 = r4.f17322f
            goto L_0x0088
        L_0x0072:
            int[] r8 = r1.f17322f
            p610kp.C18161c.m30666j(r8, r14)
            int[] r2 = r2.f17322f
            p610kp.C18161c.m30665i(r14, r2, r10)
            int[] r2 = r1.f17322f
            p610kp.C18161c.m30665i(r14, r2, r14)
            int[] r2 = r4.f17322f
            p610kp.C18161c.m30665i(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0088:
            int[] r8 = new int[r12]
            p610kp.C18161c.m30667k(r2, r5, r8)
            int[] r5 = new int[r12]
            p610kp.C18161c.m30667k(r4, r6, r5)
            boolean r6 = androidx.datastore.preferences.protobuf.C2606m.m6135b0(r12, r8)
            if (r6 == 0) goto L_0x00a8
            boolean r1 = androidx.datastore.preferences.protobuf.C2606m.m6135b0(r12, r5)
            if (r1 == 0) goto L_0x00a3
            p6.e r1 = r17.mo20145w()
            return r1
        L_0x00a3:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a8:
            p610kp.C18161c.m30666j(r8, r13)
            int[] r6 = new int[r12]
            p610kp.C18161c.m30665i(r13, r8, r6)
            p610kp.C18161c.m30665i(r13, r2, r13)
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6135b0(r12, r6)
            if (r2 == 0) goto L_0x00c3
            r2 = 0
        L_0x00ba:
            if (r2 >= r12) goto L_0x00c8
            r16 = 0
            r6[r2] = r16
            int r2 = r2 + 1
            goto L_0x00ba
        L_0x00c3:
            int[] r2 = p610kp.C18161c.f39711s1
            androidx.datastore.preferences.protobuf.C2606m.m6125T(r12, r2, r6, r6)
        L_0x00c8:
            androidx.preference.C3039b.m7139H(r4, r6, r10)
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6160z(r12, r13, r13, r6)
            p610kp.C18161c.m30660d(r2, r6)
            s6.l r4 = new s6.l
            r4.<init>((int[]) r14)
            p610kp.C18161c.m30666j(r5, r14)
            int[] r2 = r4.f17322f
            p610kp.C18161c.m30667k(r2, r6, r2)
            s6.l r12 = new s6.l
            r12.<init>((int[]) r6)
            int[] r2 = r4.f17322f
            p610kp.C18161c.m30667k(r13, r2, r6)
            int[] r2 = r12.f17322f
            androidx.preference.C3039b.m7139H(r2, r5, r11)
            r2 = 24
            int r5 = androidx.datastore.preferences.protobuf.C2606m.m6139e(r2, r10, r11, r10)
            if (r5 != 0) goto L_0x0105
            r5 = 23
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x0112
            int[] r5 = p610kp.C18161c.f39713t1
            boolean r5 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r2, r10, r5)
            if (r5 == 0) goto L_0x0112
        L_0x0105:
            int[] r5 = p610kp.C18161c.f39715u1
            r6 = 17
            int r5 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r6, r5, r10)
            if (r5 == 0) goto L_0x0112
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r2, r10, r6)
        L_0x0112:
            int[] r2 = r12.f17322f
            p610kp.C18161c.m30664h(r10, r2)
            s6.l r2 = new s6.l
            r2.<init>((int[]) r8)
            if (r15 != 0) goto L_0x0123
            int[] r5 = r7.f17322f
            p610kp.C18161c.m30665i(r8, r5, r8)
        L_0x0123:
            if (r9 != 0) goto L_0x012c
            int[] r5 = r2.f17322f
            int[] r1 = r1.f17322f
            p610kp.C18161c.m30665i(r5, r1, r5)
        L_0x012c:
            r1 = 1
            p6.d[] r6 = new p209p6.C7681d[r1]
            r1 = 0
            r6[r1] = r2
            s6.m r1 = new s6.m
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7862m.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7862m((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7862m(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7859l lVar = (C7859l) this.f17050c;
        if (lVar.mo20109r()) {
            return cVar.mo20089p();
        }
        C7859l lVar2 = (C7859l) this.f17049b;
        C7859l lVar3 = (C7859l) this.f17051d[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        C18161c.m30666j(lVar.f17322f, iArr3);
        int[] iArr4 = new int[12];
        C18161c.m30666j(iArr3, iArr4);
        boolean q = lVar3.mo20108q();
        int[] iArr5 = lVar3.f17322f;
        if (!q) {
            C18161c.m30666j(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C18161c.m30667k(lVar2.f17322f, iArr5, iArr);
        if (C2606m.m6139e(12, lVar2.f17322f, iArr5, iArr2) != 0 || (iArr2[11] == -1 && C2606m.m6121P(12, iArr2, C18161c.f39711s1))) {
            C18161c.m30662f(iArr2);
        }
        C18161c.m30665i(iArr2, iArr, iArr2);
        C18161c.m30660d(C2606m.m6160z(12, iArr2, iArr2, iArr2), iArr2);
        C18161c.m30665i(iArr3, lVar2.f17322f, iArr3);
        C18161c.m30660d(C2606m.m6114I(12, iArr3), iArr3);
        C18161c.m30660d(C2606m.m6156v(12, iArr4, iArr), iArr);
        C7859l lVar4 = new C7859l(iArr4);
        C18161c.m30666j(iArr2, iArr4);
        int[] iArr6 = lVar4.f17322f;
        C18161c.m30667k(iArr6, iArr3, iArr6);
        int[] iArr7 = lVar4.f17322f;
        C18161c.m30667k(iArr7, iArr3, iArr7);
        C7859l lVar5 = new C7859l(iArr3);
        C18161c.m30667k(iArr3, lVar4.f17322f, iArr3);
        int[] iArr8 = lVar5.f17322f;
        C18161c.m30665i(iArr8, iArr2, iArr8);
        int[] iArr9 = lVar5.f17322f;
        C18161c.m30667k(iArr9, iArr, iArr9);
        C7859l lVar6 = new C7859l(iArr2);
        if (C2606m.m6154t(12, 0, lVar.f17322f, iArr2) != 0 || (iArr2[11] == -1 && C2606m.m6121P(12, iArr2, C18161c.f39711s1))) {
            C18161c.m30662f(iArr2);
        }
        if (!q) {
            int[] iArr10 = lVar6.f17322f;
            C18161c.m30665i(iArr10, lVar3.f17322f, iArr10);
        }
        return new C7862m(cVar, lVar4, lVar5, new C7681d[]{lVar6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
