package p235s6;

import androidx.preference.C3039b;
import com.google.android.play.core.appupdate.C15562d;
import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;

/* renamed from: s6.l1 */
public final class C7861l1 extends C7686e.C7688b {
    public C7861l1(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7861l1(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* renamed from: j */
    public final C7686e mo20131j(C7686e eVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        C7849h1 h1Var;
        C7849h1 h1Var2;
        C7849h1 h1Var3;
        C7686e eVar2 = eVar;
        if (mo20141t()) {
            return eVar2;
        }
        if (eVar.mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7849h1 h1Var4 = (C7849h1) this.f17049b;
        C7849h1 h1Var5 = (C7849h1) eVar2.f17049b;
        if (h1Var4.mo20109r()) {
            return h1Var5.mo20109r() ? cVar.mo20089p() : eVar2.mo20131j(this);
        }
        C7849h1 h1Var6 = (C7849h1) this.f17050c;
        C7849h1 h1Var7 = (C7849h1) this.f17051d[0];
        C7849h1 h1Var8 = (C7849h1) eVar2.f17050c;
        C7849h1 h1Var9 = (C7849h1) eVar.mo20120a();
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] h = h1Var7.mo20108q() ? null : C15562d.m25196h(h1Var7.f17310f);
        if (h == null) {
            jArr = h1Var5.f17310f;
            jArr2 = h1Var8.f17310f;
        } else {
            C15562d.m25171I(h1Var5.f17310f, h, jArr5);
            C15562d.m25171I(h1Var8.f17310f, h, jArr7);
            jArr2 = jArr7;
            jArr = jArr5;
        }
        long[] h2 = h1Var9.mo20108q() ? null : C15562d.m25196h(h1Var9.f17310f);
        long[] jArr8 = h1Var4.f17310f;
        if (h2 == null) {
            jArr3 = h1Var6.f17310f;
        } else {
            C15562d.m25171I(jArr8, h2, jArr4);
            C15562d.m25171I(h1Var6.f17310f, h2, jArr6);
            jArr8 = jArr4;
            jArr3 = jArr6;
        }
        C15562d.m25195g(jArr3, jArr2, jArr6);
        C15562d.m25195g(jArr8, jArr, jArr7);
        if (C3039b.m7153W(jArr7)) {
            return C3039b.m7153W(jArr6) ? mo20145w() : cVar.mo20089p();
        }
        if (h1Var5.mo20109r()) {
            C7686e s = mo20140s();
            C7849h1 h1Var10 = (C7849h1) s.f17049b;
            C7681d q = s.mo20138q();
            C7681d l = q.mo20094c(h1Var8).mo20103l(h1Var10);
            h1Var2 = (C7849h1) l.mo20104m().mo20094c(l).mo20094c(h1Var10).mo20100i();
            if (h1Var2.mo20109r()) {
                return new C7861l1(cVar, h1Var2, C7858k1.f17319l, this.f17052e);
            }
            h1Var3 = (C7849h1) cVar.mo20073b(C7675b.f17019b);
            h1Var = (C7849h1) l.mo20101j(h1Var10.mo20094c(h1Var2)).mo20094c(h1Var2).mo20094c(q).mo20103l(h1Var2).mo20094c(h1Var2);
        } else {
            C15562d.m25167E(jArr7, jArr7);
            long[] h3 = C15562d.m25196h(jArr6);
            C15562d.m25171I(jArr8, h3, jArr4);
            C15562d.m25171I(jArr, h3, jArr5);
            C7849h1 h1Var11 = new C7849h1(jArr4);
            C15562d.m25164B(jArr4, jArr5, h1Var11.f17310f);
            if (h1Var11.mo20109r()) {
                return new C7861l1(cVar, h1Var11, C7858k1.f17319l, this.f17052e);
            }
            C7849h1 h1Var12 = new C7849h1(jArr6);
            C15562d.m25171I(jArr7, h3, h1Var12.f17310f);
            if (h2 != null) {
                long[] jArr9 = h1Var12.f17310f;
                C15562d.m25171I(jArr9, h2, jArr9);
            }
            long[] jArr10 = new long[18];
            C15562d.m25195g(jArr5, jArr7, jArr7);
            long[] jArr11 = new long[18];
            C15562d.m25172J(jArr7, jArr11);
            for (int i = 0; i < 18; i++) {
                jArr10[i] = jArr10[i] ^ jArr11[i];
            }
            C15562d.m25195g(h1Var6.f17310f, h1Var7.f17310f, jArr7);
            C15562d.m25168F(jArr7, h1Var12.f17310f, jArr10);
            C7849h1 h1Var13 = new C7849h1(jArr7);
            C15562d.m25202r(jArr10, h1Var13.f17310f);
            if (h != null) {
                long[] jArr12 = h1Var12.f17310f;
                C15562d.m25171I(jArr12, h, jArr12);
            }
            h1Var = h1Var13;
            h1Var2 = h1Var11;
            h1Var3 = h1Var12;
        }
        return new C7861l1(cVar, h1Var2, h1Var, new C7681d[]{h1Var3}, this.f17052e);
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        C7686e eVar2 = eVar;
        if (mo20141t()) {
            return eVar2;
        }
        if (eVar.mo20141t()) {
            return mo20145w();
        }
        C7676c cVar = this.f17048a;
        C7849h1 h1Var = (C7849h1) this.f17049b;
        if (h1Var.mo20109r()) {
            return eVar2;
        }
        C7849h1 h1Var2 = (C7849h1) eVar2.f17049b;
        C7849h1 h1Var3 = (C7849h1) eVar.mo20120a();
        if (h1Var2.mo20109r() || !h1Var3.mo20108q()) {
            return mo20145w().mo20131j(eVar2);
        }
        C7849h1 h1Var4 = (C7849h1) this.f17050c;
        C7849h1 h1Var5 = (C7849h1) this.f17051d[0];
        C7849h1 h1Var6 = (C7849h1) eVar2.f17050c;
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        C15562d.m25167E(h1Var.f17310f, jArr);
        C15562d.m25167E(h1Var4.f17310f, jArr2);
        C15562d.m25167E(h1Var5.f17310f, jArr3);
        C15562d.m25164B(h1Var4.f17310f, h1Var5.f17310f, jArr4);
        C15562d.m25199m(jArr3, jArr2, jArr4);
        long[] h = C15562d.m25196h(jArr3);
        C15562d.m25171I(h1Var6.f17310f, h, jArr3);
        C15562d.m25195g(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        C15562d.m25168F(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[18];
        C15562d.m25177O(jArr, h, jArr6);
        for (int i = 0; i < 18; i++) {
            jArr5[i] = jArr5[i] ^ jArr6[i];
        }
        C15562d.m25202r(jArr5, jArr3);
        C15562d.m25171I(h1Var2.f17310f, h, jArr);
        C15562d.m25195g(jArr, jArr4, jArr2);
        C15562d.m25167E(jArr2, jArr2);
        if (C3039b.m7153W(jArr2)) {
            return C3039b.m7153W(jArr3) ? eVar.mo20145w() : cVar.mo20089p();
        }
        if (C3039b.m7153W(jArr3)) {
            return new C7861l1(cVar, new C7849h1(jArr3), C7858k1.f17319l, this.f17052e);
        }
        C7849h1 h1Var7 = new C7849h1();
        C15562d.m25167E(jArr3, h1Var7.f17310f);
        long[] jArr7 = h1Var7.f17310f;
        C15562d.m25164B(jArr7, jArr, jArr7);
        C7849h1 h1Var8 = new C7849h1(jArr);
        C15562d.m25164B(jArr3, jArr2, h1Var8.f17310f);
        long[] jArr8 = h1Var8.f17310f;
        C15562d.m25171I(jArr8, h, jArr8);
        C7849h1 h1Var9 = new C7849h1(jArr2);
        C15562d.m25195g(jArr3, jArr2, h1Var9.f17310f);
        long[] jArr9 = h1Var9.f17310f;
        C15562d.m25167E(jArr9, jArr9);
        for (int i2 = 0; i2 < 18; i2++) {
            jArr5[i2] = 0;
        }
        C15562d.m25168F(h1Var9.f17310f, jArr4, jArr5);
        long[] jArr10 = h1Var6.f17310f;
        jArr4[0] = jArr10[0] ^ 1;
        for (int i3 = 1; i3 < 9; i3++) {
            jArr4[i3] = jArr10[i3];
        }
        C15562d.m25168F(jArr4, h1Var8.f17310f, jArr5);
        C15562d.m25202r(jArr5, h1Var9.f17310f);
        return new C7861l1(cVar, h1Var7, h1Var9, new C7681d[]{h1Var8}, this.f17052e);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7861l1((C7676c) null, this.f17049b, mo20137p(), false);
    }

    /* renamed from: q */
    public final C7681d mo20138q() {
        C7681d dVar = this.f17049b;
        C7681d dVar2 = this.f17050c;
        if (mo20141t() || dVar.mo20109r()) {
            return dVar2;
        }
        C7681d j = dVar2.mo20094c(dVar).mo20101j(dVar);
        C7681d dVar3 = this.f17051d[0];
        return !dVar3.mo20108q() ? j.mo20103l(dVar3) : j;
    }

    /* renamed from: u */
    public final boolean mo20143u() {
        C7681d dVar = this.f17049b;
        return !dVar.mo20109r() && this.f17050c.mo20110s() != dVar.mo20110s();
    }

    /* renamed from: v */
    public final C7686e mo20144v() {
        if (mo20141t()) {
            return this;
        }
        C7681d dVar = this.f17049b;
        if (dVar.mo20109r()) {
            return this;
        }
        C7681d dVar2 = this.f17050c;
        C7681d dVar3 = this.f17051d[0];
        C7676c cVar = this.f17048a;
        C7681d[] dVarArr = {dVar3};
        return new C7861l1(cVar, dVar, dVar2.mo20094c(dVar3), dVarArr, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        long[] jArr;
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7849h1 h1Var = (C7849h1) this.f17049b;
        if (h1Var.mo20109r()) {
            return cVar.mo20089p();
        }
        C7849h1 h1Var2 = (C7849h1) this.f17050c;
        C7849h1 h1Var3 = (C7849h1) this.f17051d[0];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] h = h1Var3.mo20108q() ? null : C15562d.m25196h(h1Var3.f17310f);
        long[] jArr4 = h1Var2.f17310f;
        if (h == null) {
            jArr = h1Var3.f17310f;
        } else {
            C15562d.m25171I(jArr4, h, jArr2);
            C15562d.m25167E(h1Var3.f17310f, jArr3);
            jArr4 = jArr2;
            jArr = jArr3;
        }
        long[] jArr5 = new long[9];
        C15562d.m25167E(h1Var2.f17310f, jArr5);
        C15562d.m25199m(jArr4, jArr, jArr5);
        if (C3039b.m7153W(jArr5)) {
            return new C7861l1(cVar, new C7849h1(jArr5), C7858k1.f17319l, this.f17052e);
        }
        long[] jArr6 = new long[18];
        C15562d.m25168F(jArr5, jArr4, jArr6);
        C7849h1 h1Var4 = new C7849h1(jArr2);
        C15562d.m25167E(jArr5, h1Var4.f17310f);
        C7849h1 h1Var5 = new C7849h1(jArr5);
        if (h != null) {
            long[] jArr7 = h1Var5.f17310f;
            C15562d.m25164B(jArr7, jArr, jArr7);
        }
        long[] jArr8 = h1Var.f17310f;
        if (h != null) {
            C15562d.m25171I(jArr8, h, jArr3);
            jArr8 = jArr3;
        }
        long[] jArr9 = new long[18];
        C15562d.m25172J(jArr8, jArr9);
        for (int i = 0; i < 18; i++) {
            jArr6[i] = jArr6[i] ^ jArr9[i];
        }
        C15562d.m25202r(jArr6, jArr3);
        C15562d.m25199m(h1Var4.f17310f, h1Var5.f17310f, jArr3);
        return new C7861l1(cVar, h1Var4, new C7849h1(jArr3), new C7681d[]{h1Var5}, this.f17052e);
    }
}
