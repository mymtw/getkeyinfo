package p743fr;

import java.io.IOException;
import p737cr.C18982a;

/* renamed from: fr.m */
public final class C19043m extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19027d f42494e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19043m(String str, C19027d dVar) {
        super(str, true);
        this.f42494e = dVar;
    }

    /* renamed from: a */
    public final long mo70418a() {
        C19027d dVar = this.f42494e;
        dVar.getClass();
        try {
            dVar.f42449z.mo70531f(2, 0, false);
            return -1;
        } catch (IOException e) {
            dVar.mo70484b(e);
            return -1;
        }
    }
}
