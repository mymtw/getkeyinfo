package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6147i;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.IOException;

/* renamed from: t5.t */
public final class C8019t implements C8032x0, C7984h1 {

    /* renamed from: b */
    public C8033x1 f17503b;

    public C8019t(C8033x1 x1Var) {
        this.f17503b = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        try {
            return new C8013r0(this.f17503b.mo20588c());
        } catch (IllegalArgumentException e) {
            throw new C6147i(e.getMessage(), e);
        }
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        try {
            return mo20527e();
        } catch (IOException e) {
            throw new C6148s("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C6148s("unable to get DER object", e2);
        }
    }
}
