package p743fr;

import java.io.IOException;
import p737cr.C18982a;
import p743fr.C19027d;

/* renamed from: fr.g */
public final class C19037g extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19027d.C19032d f42475e;

    /* renamed from: f */
    public final /* synthetic */ int f42476f;

    /* renamed from: g */
    public final /* synthetic */ int f42477g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19037g(String str, C19027d.C19032d dVar, int i, int i2) {
        super(str, true);
        this.f42475e = dVar;
        this.f42476f = i;
        this.f42477g = i2;
    }

    /* renamed from: a */
    public final long mo70418a() {
        C19027d dVar = C19027d.this;
        int i = this.f42476f;
        int i2 = this.f42477g;
        dVar.getClass();
        try {
            dVar.f42449z.mo70531f(i, i2, true);
            return -1;
        } catch (IOException e) {
            dVar.mo70484b(e);
            return -1;
        }
    }
}
