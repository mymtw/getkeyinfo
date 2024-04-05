package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.IOException;

/* renamed from: t5.o */
public final class C8003o implements C8032x0, C7984h1 {

    /* renamed from: b */
    public boolean f17492b;

    /* renamed from: c */
    public int f17493c;

    /* renamed from: d */
    public C8033x1 f17494d;

    public C8003o(boolean z, int i, C8033x1 x1Var) {
        this.f17492b = z;
        this.f17493c = i;
        this.f17494d = x1Var;
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return this.f17494d.mo20586a(this.f17493c, this.f17492b);
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        try {
            return mo20527e();
        } catch (IOException e) {
            throw new C6148s(e.getMessage());
        }
    }
}
