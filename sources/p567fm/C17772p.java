package p567fm;

import com.google.android.play.core.assetpacks.C15588c1;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p523cm.C14171a;

@Immutable
/* renamed from: fm.p */
public final class C17772p implements C14171a {

    /* renamed from: a */
    public final SecretKeySpec f38617a;

    /* renamed from: b */
    public byte[] f38618b;

    /* renamed from: c */
    public byte[] f38619c;

    public C17772p(byte[] bArr) throws GeneralSecurityException {
        C17778t.m29817a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f38617a = secretKeySpec;
        Cipher a = C17766m.f38612e.mo69010a("AES/ECB/NoPadding");
        a.init(1, secretKeySpec);
        byte[] W = C15588c1.m25312W(a.doFinal(new byte[16]));
        this.f38618b = W;
        this.f38619c = C15588c1.m25312W(W);
    }

    /* renamed from: a */
    public final byte[] mo47113a(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher a = C17766m.f38612e.mo69010a("AES/ECB/NoPadding");
            boolean z = true;
            a.init(1, this.f38617a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if (max * 16 != bArr.length) {
                z = false;
            }
            if (z) {
                bArr2 = C17760g.m29783d(bArr, (max - 1) * 16, 0, this.f38618b, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    bArr2 = C17760g.m29784e(copyOf, this.f38619c);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = a.doFinal(C17760g.m29783d(bArr3, 0, i2 * 16, bArr, 16));
            }
            return Arrays.copyOf(a.doFinal(C17760g.m29784e(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
