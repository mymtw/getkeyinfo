package p081d6;

import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7983h0;
import p244t5.C7988j;
import p244t5.C7992k0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8027v1;

/* renamed from: d6.g */
public final class C6668g extends C8005o1 implements C6665d {

    /* renamed from: b */
    public C7999m1 f14718b;

    /* renamed from: c */
    public C8027v1 f14719c;

    /* renamed from: d */
    public C6663b f14720d;

    /* renamed from: e */
    public C8027v1 f14721e;

    /* renamed from: f */
    public C8027v1 f14722f = null;

    /* renamed from: g */
    public C8027v1 f14723g;

    public C6668g(C7999m1 m1Var, C7983h0 h0Var, C6663b bVar, C7983h0 h0Var2, C7983h0 h0Var3) {
        this.f14718b = m1Var;
        this.f14719c = h0Var;
        this.f14720d = bVar;
        this.f14721e = h0Var2;
        this.f14723g = h0Var3;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f14718b);
        iVar.mo55343b(this.f14719c);
        iVar.mo55343b(this.f14720d);
        C8027v1 v1Var = this.f14721e;
        if (v1Var != null) {
            iVar.mo55343b(new C7992k0(false, 0, v1Var));
        }
        C8027v1 v1Var2 = this.f14722f;
        if (v1Var2 != null) {
            iVar.mo55343b(new C7992k0(false, 1, v1Var2));
        }
        iVar.mo55343b(this.f14723g);
        return new C7988j(iVar);
    }
}
