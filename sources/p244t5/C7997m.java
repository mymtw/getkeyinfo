package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.IOException;

/* renamed from: t5.m */
public final class C7997m implements C8030w1 {

    /* renamed from: b */
    public C8033x1 f17487b;

    public C7997m(C8033x1 x1Var) {
        this.f17487b = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return new C7994l(this.f17487b.mo20588c());
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
