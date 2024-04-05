package p244t5;

import java.io.IOException;

/* renamed from: t5.k */
public final class C7991k implements C8024u1 {

    /* renamed from: b */
    public C8033x1 f17481b;

    public C7991k(C8033x1 x1Var) {
        this.f17481b = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return new C7988j(this.f17481b.mo20588c());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        try {
            return mo20527e();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
