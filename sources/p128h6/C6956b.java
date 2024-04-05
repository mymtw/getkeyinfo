package p128h6;

import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p244t5.C8027v1;

/* renamed from: h6.b */
public final class C6956b extends C8005o1 {

    /* renamed from: b */
    public C8027v1 f15435b;

    public C6956b(C8027v1 v1Var) {
        this.f15435b = v1Var;
    }

    /* renamed from: g */
    public final boolean mo19115g() {
        return this.f15435b.mo20580v() > 1;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        return this.f15435b;
    }

    /* renamed from: l */
    public final C6955a mo19116l() {
        if (this.f15435b.mo20580v() == 0) {
            return null;
        }
        C7984h1 h1Var = (C7984h1) this.f15435b.f17510b.elementAt(0);
        if (h1Var instanceof C6955a) {
            return (C6955a) h1Var;
        }
        if (h1Var != null) {
            return new C6955a(C8021t1.m16151s(h1Var));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    /* renamed from: m */
    public final C6955a[] mo19117m() {
        C6955a aVar;
        int v = this.f15435b.mo20580v();
        C6955a[] aVarArr = new C6955a[v];
        for (int i = 0; i != v; i++) {
            C7984h1 h1Var = (C7984h1) this.f15435b.f17510b.elementAt(i);
            if (h1Var instanceof C6955a) {
                aVar = (C6955a) h1Var;
            } else if (h1Var != null) {
                aVar = new C6955a(C8021t1.m16151s(h1Var));
            } else {
                throw new IllegalArgumentException("null value in getInstance()");
            }
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }
}
