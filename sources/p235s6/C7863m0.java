package p235s6;

import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p504ai.C13983i;

/* renamed from: s6.m0 */
public final class C7863m0 extends C7686e.C7688b {
    public C7863m0(C7676c cVar, C7681d dVar, C7681d dVar2, boolean z) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) == (dVar2 != null ? false : true)) {
            this.f17052e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C7863m0(C7676c cVar, C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f17052e = z;
    }

    /* renamed from: j */
    public final C7686e mo20131j(C7686e eVar) {
        C7681d dVar;
        C7681d dVar2;
        C7681d dVar3;
        C7681d dVar4;
        C7681d dVar5;
        C7681d dVar6;
        if (mo20141t()) {
            return eVar;
        }
        if (eVar.mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7681d dVar7 = this.f17049b;
        C7681d dVar8 = eVar.f17049b;
        if (dVar7.mo20109r()) {
            return dVar8.mo20109r() ? cVar.mo20089p() : eVar.mo20131j(this);
        }
        C7681d dVar9 = this.f17050c;
        C7681d dVar10 = this.f17051d[0];
        C7681d dVar11 = eVar.f17050c;
        C7681d a = eVar.mo20120a();
        boolean q = dVar10.mo20108q();
        if (!q) {
            dVar2 = dVar8.mo20101j(dVar10);
            dVar = dVar11.mo20101j(dVar10);
        } else {
            dVar2 = dVar8;
            dVar = dVar11;
        }
        boolean q2 = a.mo20108q();
        if (!q2) {
            dVar7 = dVar7.mo20101j(a);
            dVar3 = dVar9.mo20101j(a);
        } else {
            dVar3 = dVar9;
        }
        C7681d c = dVar3.mo20094c(dVar);
        C7681d c2 = dVar7.mo20094c(dVar2);
        if (c2.mo20109r()) {
            return c.mo20109r() ? mo20145w() : cVar.mo20089p();
        }
        if (dVar8.mo20109r()) {
            C7686e s = mo20140s();
            C7681d dVar12 = s.f17049b;
            C7681d q3 = s.mo20138q();
            C7681d l = q3.mo20094c(dVar11).mo20103l(dVar12);
            dVar5 = C13983i.m21497p(l, l, dVar12).mo20094c(cVar.f17024b);
            if (dVar5.mo20109r()) {
                return new C7863m0(cVar, dVar5, cVar.f17025c.mo20106o(), this.f17052e);
            }
            C7681d c3 = l.mo20101j(dVar12.mo20094c(dVar5)).mo20094c(dVar5).mo20094c(q3).mo20103l(dVar5).mo20094c(dVar5);
            dVar6 = cVar.mo20073b(C7675b.f17019b);
            dVar4 = c3;
        } else {
            C7681d m = c2.mo20104m();
            C7681d j = c.mo20101j(dVar7);
            C7681d j2 = c.mo20101j(dVar2);
            C7681d j3 = j.mo20101j(j2);
            if (j3.mo20109r()) {
                return new C7863m0(cVar, j3, cVar.f17025c.mo20106o(), this.f17052e);
            }
            C7681d j4 = c.mo20101j(m);
            if (!q2) {
                j4 = j4.mo20101j(a);
            }
            C7681d d = j2.mo20094c(m).mo20095d(j4, dVar9.mo20094c(dVar10));
            C7681d j5 = !q ? j4.mo20101j(dVar10) : j4;
            dVar4 = d;
            dVar5 = j3;
            dVar6 = j5;
        }
        return new C7863m0(cVar, dVar5, dVar4, new C7681d[]{dVar6}, this.f17052e);
    }

    /* renamed from: m */
    public final C7686e mo20134m(C7686e eVar) {
        if (mo20141t()) {
            return eVar;
        }
        if (eVar.mo20141t()) {
            return mo20145w();
        }
        C7676c cVar = this.f17048a;
        C7681d dVar = this.f17049b;
        if (dVar.mo20109r()) {
            return eVar;
        }
        C7681d dVar2 = eVar.f17049b;
        C7681d a = eVar.mo20120a();
        if (dVar2.mo20109r() || !a.mo20108q()) {
            return mo20145w().mo20131j(eVar);
        }
        C7681d dVar3 = this.f17050c;
        C7681d dVar4 = this.f17051d[0];
        C7681d dVar5 = eVar.f17050c;
        C7681d m = dVar.mo20104m();
        C7681d m2 = dVar3.mo20104m();
        C7681d m3 = dVar4.mo20104m();
        C7681d c = cVar.f17024b.mo20101j(m3).mo20094c(m2).mo20094c(dVar3.mo20101j(dVar4));
        C7681d i = dVar5.mo20100i();
        C7681d h = cVar.f17024b.mo20094c(i).mo20101j(m3).mo20094c(m2).mo20099h(c, m, m3);
        C7681d j = dVar2.mo20101j(m3);
        C7681d m4 = j.mo20094c(c).mo20104m();
        if (m4.mo20109r()) {
            return h.mo20109r() ? eVar.mo20145w() : cVar.mo20089p();
        }
        if (h.mo20109r()) {
            return new C7863m0(cVar, h, cVar.f17025c.mo20106o(), this.f17052e);
        }
        C7681d j2 = h.mo20104m().mo20101j(j);
        C7681d j3 = h.mo20101j(m4).mo20101j(m3);
        return new C7863m0(cVar, j2, h.mo20094c(m4).mo20104m().mo20099h(c, i, j3), new C7681d[]{j3}, this.f17052e);
    }

    /* renamed from: n */
    public final C7686e mo20135n() {
        mo20139r();
        return new C7863m0((C7676c) null, this.f17049b, mo20137p(), false);
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
        return new C7863m0(cVar, dVar, dVar2.mo20094c(dVar3), dVarArr, this.f17052e);
    }

    /* renamed from: w */
    public final C7686e mo20145w() {
        if (mo20141t()) {
            return this;
        }
        C7676c cVar = this.f17048a;
        C7681d dVar = this.f17049b;
        if (dVar.mo20109r()) {
            return cVar.mo20089p();
        }
        C7681d dVar2 = this.f17050c;
        C7681d dVar3 = this.f17051d[0];
        boolean q = dVar3.mo20108q();
        C7681d j = q ? dVar2 : dVar2.mo20101j(dVar3);
        C7681d m = q ? dVar3 : dVar3.mo20104m();
        C7681d dVar4 = cVar.f17024b;
        if (!q) {
            dVar4 = dVar4.mo20101j(m);
        }
        C7681d p = C13983i.m21497p(dVar2, j, dVar4);
        if (p.mo20109r()) {
            return new C7863m0(cVar, p, cVar.f17025c.mo20106o(), this.f17052e);
        }
        C7681d m2 = p.mo20104m();
        C7681d j2 = q ? p : p.mo20101j(m);
        if (!q) {
            dVar = dVar.mo20101j(dVar3);
        }
        return new C7863m0(cVar, m2, dVar.mo20095d(p, j).mo20094c(m2).mo20094c(j2), new C7681d[]{j2}, this.f17052e);
    }
}
