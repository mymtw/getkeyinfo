package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p383ke.C12995a;

/* renamed from: s6.d */
public final class C7834d extends C7686e.C7689c {
    public C7834d(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7834d(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0109, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(14, r10, p383ke.C12995a.f28608d) != false) goto L_0x010e;
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
            s6.c r2 = (p235s6.C7830c) r2
            p6.d r4 = r0.f17050c
            s6.c r4 = (p235s6.C7830c) r4
            p6.d r5 = r1.f17049b
            s6.c r5 = (p235s6.C7830c) r5
            p6.d r6 = r17.mo20138q()
            s6.c r6 = (p235s6.C7830c) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.c r7 = (p235s6.C7830c) r7
            p6.d r1 = r17.mo20120a()
            s6.c r1 = (p235s6.C7830c) r1
            r9 = 14
            int[] r10 = new int[r9]
            r11 = 7
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f17294f
            int[] r6 = r6.f17294f
            goto L_0x0066
        L_0x0050:
            int[] r9 = r7.f17294f
            p383ke.C12995a.m20699o(r9, r13)
            int[] r5 = r5.f17294f
            p383ke.C12995a.m20695j(r13, r5, r12)
            int[] r5 = r7.f17294f
            p383ke.C12995a.m20695j(r13, r5, r13)
            int[] r5 = r6.f17294f
            p383ke.C12995a.m20695j(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r9 = r1.mo20108q()
            if (r9 == 0) goto L_0x0071
            int[] r2 = r2.f17294f
            int[] r4 = r4.f17294f
            goto L_0x0087
        L_0x0071:
            int[] r8 = r1.f17294f
            p383ke.C12995a.m20699o(r8, r14)
            int[] r2 = r2.f17294f
            p383ke.C12995a.m20695j(r14, r2, r10)
            int[] r2 = r1.f17294f
            p383ke.C12995a.m20695j(r14, r2, r14)
            int[] r2 = r4.f17294f
            p383ke.C12995a.m20695j(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0087:
            int[] r8 = new int[r11]
            p383ke.C12995a.m20700p(r2, r5, r8)
            p383ke.C12995a.m20700p(r4, r6, r12)
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
            p383ke.C12995a.m20699o(r8, r13)
            int[] r5 = new int[r11]
            p383ke.C12995a.m20695j(r13, r8, r5)
            p383ke.C12995a.m20695j(r13, r2, r13)
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
            int[] r2 = p383ke.C12995a.f28607c
            androidx.datastore.preferences.protobuf.C2606m.m6131Z(r2, r5, r5)
        L_0x00d1:
            androidx.datastore.preferences.protobuf.C2606m.m6120O(r4, r5, r10)
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6106A(r13, r13, r5)
            p383ke.C12995a.m20689d(r2, r5)
            s6.c r4 = new s6.c
            r4.<init>((int[]) r14)
            p383ke.C12995a.m20699o(r12, r14)
            int[] r2 = r4.f17294f
            p383ke.C12995a.m20700p(r2, r5, r2)
            s6.c r11 = new s6.c
            r11.<init>((int[]) r5)
            int[] r2 = r4.f17294f
            p383ke.C12995a.m20700p(r13, r2, r5)
            int[] r2 = r11.f17294f
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6126U(r2, r12, r10)
            if (r2 != 0) goto L_0x010c
            r2 = 13
            r2 = r10[r2]
            r5 = -1
            if (r2 != r5) goto L_0x011b
            int[] r2 = p383ke.C12995a.f28608d
            r5 = 14
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r5, r10, r2)
            if (r2 == 0) goto L_0x011b
            goto L_0x010e
        L_0x010c:
            r5 = 14
        L_0x010e:
            int[] r2 = p383ke.C12995a.f28609e
            r12 = 11
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r12, r2, r10)
            if (r2 == 0) goto L_0x011b
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r5, r10, r12)
        L_0x011b:
            int[] r2 = r11.f17294f
            p383ke.C12995a.m20697l(r10, r2)
            s6.c r2 = new s6.c
            r2.<init>((int[]) r8)
            if (r15 != 0) goto L_0x012c
            int[] r5 = r7.f17294f
            p383ke.C12995a.m20695j(r8, r5, r8)
        L_0x012c:
            if (r9 != 0) goto L_0x0135
            int[] r5 = r2.f17294f
            int[] r1 = r1.f17294f
            p383ke.C12995a.m20695j(r5, r1, r5)
        L_0x0135:
            p6.d[] r6 = new p209p6.C7681d[r6]
            r1 = 0
            r6[r1] = r2
            s6.d r1 = new s6.d
            boolean r7 = r0.f17052e
            r2 = r1
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7834d.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7834d((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7834d(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7830c cVar2 = (C7830c) this.f17050c;
        if (cVar2.mo20109r()) {
            return cVar.mo20089p();
        }
        C7830c cVar3 = (C7830c) this.f17049b;
        C7830c cVar4 = (C7830c) this.f17051d[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        C12995a.m20699o(cVar2.f17294f, iArr3);
        int[] iArr4 = new int[7];
        C12995a.m20699o(iArr3, iArr4);
        boolean q = cVar4.mo20108q();
        int[] iArr5 = cVar4.f17294f;
        if (!q) {
            C12995a.m20699o(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C12995a.m20700p(cVar3.f17294f, iArr5, iArr);
        C12995a.m20692g(cVar3.f17294f, iArr5, iArr2);
        C12995a.m20695j(iArr2, iArr, iArr2);
        C12995a.m20689d(C2606m.m6106A(iArr2, iArr2, iArr2), iArr2);
        C12995a.m20695j(iArr3, cVar3.f17294f, iArr3);
        C12995a.m20689d(C2606m.m6114I(7, iArr3), iArr3);
        C12995a.m20689d(C2606m.m6156v(7, iArr4, iArr), iArr);
        C7830c cVar5 = new C7830c(iArr4);
        C12995a.m20699o(iArr2, iArr4);
        int[] iArr6 = cVar5.f17294f;
        C12995a.m20700p(iArr6, iArr3, iArr6);
        int[] iArr7 = cVar5.f17294f;
        C12995a.m20700p(iArr7, iArr3, iArr7);
        C7830c cVar6 = new C7830c(iArr3);
        C12995a.m20700p(iArr3, cVar5.f17294f, iArr3);
        int[] iArr8 = cVar6.f17294f;
        C12995a.m20695j(iArr8, iArr2, iArr8);
        int[] iArr9 = cVar6.f17294f;
        C12995a.m20700p(iArr9, iArr, iArr9);
        C7830c cVar7 = new C7830c(iArr2);
        if (C2606m.m6154t(7, 0, cVar2.f17294f, iArr2) != 0 || (iArr2[6] == -1 && C2606m.m6122Q(iArr2, C12995a.f28607c))) {
            C12995a.m20691f(iArr2);
        }
        if (!q) {
            int[] iArr10 = cVar7.f17294f;
            C12995a.m20695j(iArr10, cVar4.f17294f, iArr10);
        }
        return new C7834d(cVar, cVar5, cVar6, new C7681d[]{cVar7}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
