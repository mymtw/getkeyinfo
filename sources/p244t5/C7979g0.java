package p244t5;

import java.io.IOException;

/* renamed from: t5.g0 */
public final class C7979g0 implements C8024u1 {

    /* renamed from: b */
    public C8033x1 f17465b;

    public C7979g0(C8033x1 x1Var) {
        this.f17465b = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return new C7976f0(this.f17465b.mo20588c());
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
