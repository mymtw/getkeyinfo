package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.IOException;

/* renamed from: t5.f */
public final class C7975f implements C8032x0, C7984h1 {

    /* renamed from: b */
    public final int f17456b;

    /* renamed from: c */
    public final C8033x1 f17457c;

    public C7975f(int i, C8033x1 x1Var) {
        this.f17456b = i;
        this.f17457c = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return new C7972e(this.f17456b, this.f17457c.mo20588c());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        try {
            return mo20527e();
        } catch (IOException e) {
            throw new C6148s(e.getMessage(), e);
        }
    }
}
