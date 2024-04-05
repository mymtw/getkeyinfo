package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.IOException;

/* renamed from: t5.i0 */
public final class C7986i0 implements C8030w1 {

    /* renamed from: b */
    public C8033x1 f17472b;

    public C7986i0(C8033x1 x1Var) {
        this.f17472b = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return new C7983h0(this.f17472b.mo20588c(), 0);
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
