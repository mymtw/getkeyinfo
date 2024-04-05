package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.work.C3436p;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p568fn.C17782b;

/* renamed from: s6.g */
public final class C7844g extends C7686e.C7689c {
    public C7844g(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7844g(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [p6.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (androidx.datastore.preferences.protobuf.C2606m.m6121P(16, r10, p568fn.C17782b.f38650u) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011d  */
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
            s6.f r2 = (p235s6.C7841f) r2
            p6.d r4 = r0.f17050c
            s6.f r4 = (p235s6.C7841f) r4
            p6.d r5 = r1.f17049b
            s6.f r5 = (p235s6.C7841f) r5
            p6.d r6 = r17.mo20138q()
            s6.f r6 = (p235s6.C7841f) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.f r7 = (p235s6.C7841f) r7
            p6.d r1 = r17.mo20120a()
            s6.f r1 = (p235s6.C7841f) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.mo20108q()
            if (r15 == 0) goto L_0x0051
            int[] r5 = r5.f17305f
            int[] r6 = r6.f17305f
            goto L_0x0067
        L_0x0051:
            int[] r8 = r7.f17305f
            p568fn.C17782b.m29850P(r8, r13)
            int[] r5 = r5.f17305f
            p568fn.C17782b.m29892w(r13, r5, r12)
            int[] r5 = r7.f17305f
            p568fn.C17782b.m29892w(r13, r5, r13)
            int[] r5 = r6.f17305f
            p568fn.C17782b.m29892w(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0067:
            boolean r8 = r1.mo20108q()
            if (r8 == 0) goto L_0x0072
            int[] r2 = r2.f17305f
            int[] r4 = r4.f17305f
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.f17305f
            p568fn.C17782b.m29850P(r9, r14)
            int[] r2 = r2.f17305f
            p568fn.C17782b.m29892w(r14, r2, r10)
            int[] r2 = r1.f17305f
            p568fn.C17782b.m29892w(r14, r2, r14)
            int[] r2 = r4.f17305f
            p568fn.C17782b.m29892w(r14, r2, r14)
            r2 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            p568fn.C17782b.m29851Q(r2, r5, r9)
            p568fn.C17782b.m29851Q(r4, r6, r12)
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
            p568fn.C17782b.m29850P(r9, r13)
            int[] r5 = new int[r11]
            p568fn.C17782b.m29892w(r13, r9, r5)
            p568fn.C17782b.m29892w(r13, r2, r13)
            boolean r2 = androidx.work.C3436p.m8257t(r5)
            if (r2 == 0) goto L_0x00bb
            androidx.work.C3436p.m8234H(r5)
            goto L_0x00c0
        L_0x00bb:
            int[] r2 = p568fn.C17782b.f38649t
            androidx.work.C3436p.m8238L(r2, r5, r5)
        L_0x00c0:
            androidx.work.C3436p.m8230D(r4, r5, r10)
            int r2 = androidx.work.C3436p.m8256s(r13, r13, r5)
            p568fn.C17782b.m29875n(r2, r5)
            s6.f r4 = new s6.f
            r4.<init>((int[]) r14)
            p568fn.C17782b.m29850P(r12, r14)
            int[] r2 = r4.f17305f
            p568fn.C17782b.m29851Q(r2, r5, r2)
            s6.f r6 = new s6.f
            r6.<init>((int[]) r5)
            int[] r2 = r4.f17305f
            p568fn.C17782b.m29851Q(r13, r2, r5)
            int[] r2 = r6.f17305f
            int r2 = androidx.work.C3436p.m8233G(r2, r12, r10)
            if (r2 != 0) goto L_0x00fb
            r2 = 15
            r2 = r10[r2]
            r5 = -1
            if (r2 != r5) goto L_0x010a
            int[] r2 = p568fn.C17782b.f38650u
            r5 = 16
            boolean r2 = androidx.datastore.preferences.protobuf.C2606m.m6121P(r5, r10, r2)
            if (r2 == 0) goto L_0x010a
            goto L_0x00fd
        L_0x00fb:
            r5 = 16
        L_0x00fd:
            int[] r2 = p568fn.C17782b.f38651v
            r11 = 10
            int r2 = androidx.datastore.preferences.protobuf.C2606m.m6136c(r11, r2, r10)
            if (r2 == 0) goto L_0x010a
            androidx.datastore.preferences.protobuf.C2606m.m6159y(r5, r10, r11)
        L_0x010a:
            int[] r2 = r6.f17305f
            p568fn.C17782b.m29898z(r10, r2)
            s6.f r2 = new s6.f
            r2.<init>((int[]) r9)
            if (r15 != 0) goto L_0x011b
            int[] r5 = r7.f17305f
            p568fn.C17782b.m29892w(r9, r5, r9)
        L_0x011b:
            if (r8 != 0) goto L_0x0124
            int[] r5 = r2.f17305f
            int[] r1 = r1.f17305f
            p568fn.C17782b.m29892w(r5, r1, r5)
        L_0x0124:
            r1 = 1
            p6.d[] r1 = new p209p6.C7681d[r1]
            r5 = 0
            r1[r5] = r2
            s6.g r8 = new s6.g
            boolean r7 = r0.f17052e
            r2 = r8
            r5 = r6
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7844g.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7844g((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7844g(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7841f fVar = (C7841f) this.f17050c;
        if (fVar.mo20109r()) {
            return cVar.mo20089p();
        }
        C7841f fVar2 = (C7841f) this.f17049b;
        C7841f fVar3 = (C7841f) this.f17051d[0];
        int[] iArr = new int[8];
        C17782b.m29850P(fVar.f17305f, iArr);
        int[] iArr2 = new int[8];
        C17782b.m29850P(iArr, iArr2);
        int[] iArr3 = new int[8];
        C17782b.m29850P(fVar2.f17305f, iArr3);
        C17782b.m29875n(C3436p.m8256s(iArr3, iArr3, iArr3), iArr3);
        C17782b.m29892w(iArr, fVar2.f17305f, iArr);
        C17782b.m29875n(C2606m.m6114I(8, iArr), iArr);
        int[] iArr4 = new int[8];
        C17782b.m29875n(C2606m.m6156v(8, iArr2, iArr4), iArr4);
        C7841f fVar4 = new C7841f(iArr2);
        C17782b.m29850P(iArr3, iArr2);
        int[] iArr5 = fVar4.f17305f;
        C17782b.m29851Q(iArr5, iArr, iArr5);
        int[] iArr6 = fVar4.f17305f;
        C17782b.m29851Q(iArr6, iArr, iArr6);
        C7841f fVar5 = new C7841f(iArr);
        C17782b.m29851Q(iArr, fVar4.f17305f, iArr);
        int[] iArr7 = fVar5.f17305f;
        C17782b.m29892w(iArr7, iArr3, iArr7);
        int[] iArr8 = fVar5.f17305f;
        C17782b.m29851Q(iArr8, iArr4, iArr8);
        C7841f fVar6 = new C7841f(iArr3);
        if (C2606m.m6154t(8, 0, fVar.f17305f, iArr3) != 0 || (iArr3[7] == -1 && C3436p.m8227A(iArr3, C17782b.f38649t))) {
            C2606m.m6143i(8, 977, iArr3);
        }
        if (!fVar3.mo20108q()) {
            int[] iArr9 = fVar6.f17305f;
            C17782b.m29892w(iArr9, fVar3.f17305f, iArr9);
        }
        return new C7844g(cVar, fVar4, fVar5, new C7681d[]{fVar6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
