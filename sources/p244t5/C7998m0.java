package p244t5;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p267v7.C8212a;

/* renamed from: t5.m0 */
public final class C7998m0 extends C8018s1 implements C8036y1 {

    /* renamed from: c */
    public static final char[] f17488c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public final byte[] f17489b;

    public C7998m0(byte[] bArr) {
        this.f17489b = C8212a.m16504k(bArr);
    }

    /* renamed from: b */
    public final String mo20515b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C8014r1(byteArrayOutputStream).mo20535d(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = f17488c;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C6148s("internal error encoding UniversalString");
        }
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(28, C8212a.m16504k(this.f17489b));
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7998m0)) {
            return false;
        }
        return C8212a.m16500g(this.f17489b, ((C7998m0) s1Var).f17489b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17489b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17489b.length) + 1 + this.f17489b.length;
    }

    public final String toString() {
        return mo20515b();
    }
}
