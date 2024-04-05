package p081d6;

import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7959a;
import p244t5.C7984h1;
import p244t5.C7988j;
import p244t5.C8000n;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8020t0;

/* renamed from: d6.b */
public final class C6663b extends C8005o1 implements C6665d {

    /* renamed from: b */
    public C7959a f14693b;

    /* renamed from: c */
    public C7984h1 f14694c;

    /* renamed from: d */
    public boolean f14695d = true;

    public C6663b(C7959a aVar, C6668g gVar) {
        this.f14693b = aVar;
        this.f14694c = gVar;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f14693b);
        C7984h1 h1Var = this.f14694c;
        if (h1Var != null) {
            iVar.mo55343b(new C8000n(true, 0, h1Var));
        }
        return this.f14695d ? new C7988j(iVar) : new C8020t0(iVar);
    }
}
