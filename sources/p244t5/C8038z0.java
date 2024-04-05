package p244t5;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6148s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p267v7.C8212a;

/* renamed from: t5.z0 */
public abstract class C8038z0 extends C8018s1 implements C8036y1 {

    /* renamed from: d */
    public static final char[] f17526d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public final byte[] f17527b;

    /* renamed from: c */
    public final int f17528c;

    public C8038z0(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f17527b = C8212a.m16504k(bArr);
            this.f17528c = i;
        }
    }

    /* renamed from: b */
    public final String mo20515b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C8014r1(byteArrayOutputStream).mo20535d(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = f17526d;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder h = C0072d.m201h("Internal error encoding BitString: ");
            h.append(e.getMessage());
            throw new C6148s(h.toString(), e);
        }
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8038z0)) {
            return false;
        }
        C8038z0 z0Var = (C8038z0) s1Var;
        return this.f17528c == z0Var.f17528c && C8212a.m16500g(mo20594s(), z0Var.mo20594s());
    }

    public final int hashCode() {
        return this.f17528c ^ C8212a.m16495b(mo20594s());
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        return new C8012r(this.f17528c, this.f17527b);
    }

    /* renamed from: p */
    public final C8018s1 mo20522p() {
        return new C8010q0(this.f17528c, this.f17527b);
    }

    /* renamed from: q */
    public final byte[] mo20593q() {
        if (this.f17528c == 0) {
            return C8212a.m16504k(this.f17527b);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    /* renamed from: s */
    public final byte[] mo20594s() {
        byte[] bArr = this.f17527b;
        int i = this.f17528c;
        byte[] k = C8212a.m16504k(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            k[length] = (byte) ((255 << i) & k[length]);
        }
        return k;
    }

    public String toString() {
        return mo20515b();
    }
}
