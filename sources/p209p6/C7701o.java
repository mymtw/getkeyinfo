package p209p6;

import androidx.compose.runtime.C1353o0;

/* renamed from: p6.o */
public final class C7701o implements C7694h {

    /* renamed from: a */
    public final /* synthetic */ C7700n f17076a;

    /* renamed from: b */
    public final /* synthetic */ C1353o0 f17077b;

    /* renamed from: c */
    public final /* synthetic */ boolean f17078c = true;

    public C7701o(C7700n nVar, C1353o0 o0Var) {
        this.f17076a = nVar;
        this.f17077b = o0Var;
    }

    /* renamed from: a */
    public final C7695i mo20147a(C7695i iVar) {
        C7700n nVar = new C7700n();
        C7686e eVar = this.f17076a.f17075c;
        if (eVar != null) {
            nVar.f17075c = eVar.mo20130i((C7681d) this.f17077b.f2952b);
        }
        C7686e[] eVarArr = this.f17076a.f17073a;
        int length = eVarArr.length;
        C7686e[] eVarArr2 = new C7686e[length];
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i] = eVarArr[i].mo20130i((C7681d) this.f17077b.f2952b);
        }
        nVar.f17073a = eVarArr2;
        if (this.f17078c) {
            C7686e[] eVarArr3 = new C7686e[length];
            for (int i2 = 0; i2 < length; i2++) {
                eVarArr3[i2] = eVarArr2[i2].mo20144v();
            }
            nVar.f17074b = eVarArr3;
        }
        return nVar;
    }
}
