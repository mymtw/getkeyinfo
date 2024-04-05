package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Enumeration;

/* renamed from: t5.a1 */
public final class C7962a1 implements Enumeration {

    /* renamed from: a */
    public C7996l1 f17439a;

    /* renamed from: b */
    public C8018s1 f17440b = mo20517a();

    public C7962a1(byte[] bArr) {
        this.f17439a = new C7996l1(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    /* renamed from: a */
    public final C8018s1 mo20517a() {
        try {
            return this.f17439a.mo20554h();
        } catch (IOException e) {
            throw new C6148s("malformed DER construction: " + e, e);
        }
    }

    public final boolean hasMoreElements() {
        return this.f17440b != null;
    }

    public final Object nextElement() {
        C8018s1 s1Var = this.f17440b;
        this.f17440b = mo20517a();
        return s1Var;
    }
}
