package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import com.google.android.play.core.assetpacks.C15588c1;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;

/* renamed from: s6.p */
public final class C7871p extends C7686e.C7689c {
    public C7871p(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7871p(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
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
            s6.o r2 = (p235s6.C7868o) r2
            p6.d r4 = r0.f17050c
            s6.o r4 = (p235s6.C7868o) r4
            p6.d r5 = r1.f17049b
            s6.o r5 = (p235s6.C7868o) r5
            p6.d r6 = r17.mo20138q()
            s6.o r6 = (p235s6.C7868o) r6
            p6.d[] r7 = r0.f17051d
            r8 = 0
            r7 = r7[r8]
            s6.o r7 = (p235s6.C7868o) r7
            p6.d r1 = r17.mo20120a()
            s6.o r1 = (p235s6.C7868o) r1
            r9 = 17
            int[] r10 = new int[r9]
            int[] r11 = new int[r9]
            int[] r12 = new int[r9]
            int[] r13 = new int[r9]
            boolean r14 = r7.mo20108q()
            if (r14 == 0) goto L_0x004f
            int[] r5 = r5.f17330f
            int[] r6 = r6.f17330f
            goto L_0x0065
        L_0x004f:
            int[] r15 = r7.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25306T(r15, r12)
            int[] r5 = r5.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r12, r5, r11)
            int[] r5 = r7.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r12, r5, r12)
            int[] r5 = r6.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r12, r5, r12)
            r5 = r11
            r6 = r12
        L_0x0065:
            boolean r15 = r1.mo20108q()
            if (r15 == 0) goto L_0x0070
            int[] r2 = r2.f17330f
            int[] r4 = r4.f17330f
            goto L_0x0086
        L_0x0070:
            int[] r8 = r1.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25306T(r8, r13)
            int[] r2 = r2.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r13, r2, r10)
            int[] r2 = r1.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r13, r2, r13)
            int[] r2 = r4.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r13, r2, r13)
            r2 = r10
            r4 = r13
        L_0x0086:
            int[] r8 = new int[r9]
            com.google.android.play.core.assetpacks.C15588c1.m25282H(r2, r5, r8)
            com.google.android.play.core.assetpacks.C15588c1.m25282H(r4, r6, r11)
            boolean r5 = androidx.datastore.preferences.protobuf.C2606m.m6135b0(r9, r8)
            if (r5 == 0) goto L_0x00a4
            boolean r1 = androidx.datastore.preferences.protobuf.C2606m.m6135b0(r9, r11)
            if (r1 == 0) goto L_0x009f
            p6.e r1 = r16.mo20145w()
            return r1
        L_0x009f:
            p6.e r1 = r3.mo20089p()
            return r1
        L_0x00a4:
            com.google.android.play.core.assetpacks.C15588c1.m25306T(r8, r12)
            int[] r5 = new int[r9]
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r12, r8, r5)
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r12, r2, r12)
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r4, r5, r10)
            s6.o r4 = new s6.o
            r4.<init>((int[]) r13)
            com.google.android.play.core.assetpacks.C15588c1.m25306T(r11, r13)
            int[] r2 = r4.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25339p(r2, r5, r2)
            int[] r2 = r4.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25282H(r2, r12, r2)
            int[] r2 = r4.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25282H(r2, r12, r2)
            s6.o r6 = new s6.o
            r6.<init>((int[]) r5)
            int[] r2 = r4.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25282H(r12, r2, r5)
            int[] r2 = r6.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r2, r11, r11)
            int[] r2 = r6.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25282H(r11, r10, r2)
            s6.o r2 = new s6.o
            r2.<init>((int[]) r8)
            if (r14 != 0) goto L_0x00e9
            int[] r5 = r7.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r8, r5, r8)
        L_0x00e9:
            if (r15 != 0) goto L_0x00f2
            int[] r5 = r2.f17330f
            int[] r1 = r1.f17330f
            com.google.android.play.core.assetpacks.C15588c1.m25359z(r5, r1, r5)
        L_0x00f2:
            r1 = 1
            p6.d[] r1 = new p209p6.C7681d[r1]
            r5 = 0
            r1[r5] = r2
            s6.p r8 = new s6.p
            boolean r7 = r0.f17052e
            r2 = r8
            r5 = r6
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p235s6.C7871p.mo20131j(p6.e):p6.e");
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        return this == eVar ? mo20146x() : mo20141t() ? eVar : eVar.mo20141t() ? mo20145w() : this.f17050c.mo20109r() ? eVar : mo20145w().mo20131j(eVar);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7871p((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        return mo20141t() ? this : new C7871p(this.f17048a, this.f17049b, this.f17050c.mo20102k(), this.f17051d, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7868o oVar = (C7868o) this.f17050c;
        if (oVar.mo20109r()) {
            return cVar.mo20089p();
        }
        C7868o oVar2 = (C7868o) this.f17049b;
        C7868o oVar3 = (C7868o) this.f17051d[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        C15588c1.m25306T(oVar.f17330f, iArr3);
        int[] iArr4 = new int[17];
        C15588c1.m25306T(iArr3, iArr4);
        boolean q = oVar3.mo20108q();
        int[] iArr5 = oVar3.f17330f;
        if (!q) {
            C15588c1.m25306T(iArr5, iArr2);
            iArr5 = iArr2;
        }
        C15588c1.m25282H(oVar2.f17330f, iArr5, iArr);
        C15588c1.m25339p(oVar2.f17330f, iArr5, iArr2);
        C15588c1.m25359z(iArr2, iArr, iArr2);
        C2606m.m6160z(17, iArr2, iArr2, iArr2);
        C15588c1.m25335m(iArr2);
        C15588c1.m25359z(iArr3, oVar2.f17330f, iArr3);
        C2606m.m6114I(17, iArr3);
        C15588c1.m25335m(iArr3);
        C2606m.m6156v(17, iArr4, iArr);
        C15588c1.m25335m(iArr);
        C7868o oVar4 = new C7868o(iArr4);
        C15588c1.m25306T(iArr2, iArr4);
        int[] iArr6 = oVar4.f17330f;
        C15588c1.m25282H(iArr6, iArr3, iArr6);
        int[] iArr7 = oVar4.f17330f;
        C15588c1.m25282H(iArr7, iArr3, iArr7);
        C7868o oVar5 = new C7868o(iArr3);
        C15588c1.m25282H(iArr3, oVar4.f17330f, iArr3);
        int[] iArr8 = oVar5.f17330f;
        C15588c1.m25359z(iArr8, iArr2, iArr8);
        int[] iArr9 = oVar5.f17330f;
        C15588c1.m25282H(iArr9, iArr, iArr9);
        C7868o oVar6 = new C7868o(iArr2);
        int[] iArr10 = oVar.f17330f;
        int i = iArr10[16];
        iArr2[16] = (C2606m.m6154t(16, i << 23, iArr10, iArr2) | (i << 1)) & 511;
        if (!q) {
            int[] iArr11 = oVar6.f17330f;
            C15588c1.m25359z(iArr11, oVar3.f17330f, iArr11);
        }
        return new C7871p(cVar, oVar4, oVar5, new C7681d[]{oVar6}, this.f17052e);
    }

    /* renamed from: x */
    public final C7686e mo20146x() {
        return (mo20141t() || this.f17050c.mo20109r()) ? this : mo20145w().mo20131j(this);
    }
}
