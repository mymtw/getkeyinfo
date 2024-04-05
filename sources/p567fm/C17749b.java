package p567fm;

import com.google.android.gms.common.api.Api;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p705wl.C18726a;

/* renamed from: fm.b */
public final class C17749b implements C18726a {

    /* renamed from: e */
    public static final C17750a f38578e = new C17750a();

    /* renamed from: f */
    public static final C17751b f38579f = new C17751b();

    /* renamed from: a */
    public final byte[] f38580a;

    /* renamed from: b */
    public final byte[] f38581b;

    /* renamed from: c */
    public final SecretKeySpec f38582c;

    /* renamed from: d */
    public final int f38583d;

    /* renamed from: fm.b$a */
    public class C17750a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return C17766m.f38612e.mo69010a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: fm.b$b */
    public class C17751b extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return C17766m.f38612e.mo69010a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C17749b(int i, byte[] bArr) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.f38583d = i;
            C17778t.m29817a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f38582c = secretKeySpec;
            Cipher cipher = (Cipher) f38578e.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m29767c(cipher.doFinal(new byte[16]));
            this.f38580a = c;
            this.f38581b = m29767c(c);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: c */
    public static byte[] m29767c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m29768e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i = this.f38583d;
        if (length <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - i) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i + 16)];
            byte[] a = C17776s.m29816a(i);
            System.arraycopy(a, 0, bArr4, 0, this.f38583d);
            Cipher cipher = (Cipher) f38578e.get();
            cipher.init(1, this.f38582c);
            byte[] d = mo68996d(cipher, 0, a, 0, a.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] d2 = mo68996d(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = (Cipher) f38579f.get();
            cipher2.init(1, this.f38582c, new IvParameterSpec(d));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f38583d);
            byte[] d3 = mo68996d(cipher, 2, bArr4, this.f38583d, bArr3.length);
            int length2 = bArr3.length + this.f38583d;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((d2[i2] ^ d[i2]) ^ d3[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f38583d) - 16;
        if (length >= 0) {
            Cipher cipher = (Cipher) f38578e.get();
            cipher.init(1, this.f38582c);
            byte[] d = mo68996d(cipher, 0, bArr, 0, this.f38583d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d2 = mo68996d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d3 = mo68996d(cipher, 2, bArr, this.f38583d, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ d2[i]) ^ d[i]) ^ d3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) f38579f.get();
                cipher2.init(1, this.f38582c, new IvParameterSpec(d));
                return cipher2.doFinal(bArr, this.f38583d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] mo68996d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m29768e(bArr3, this.f38580a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m29768e(copyOfRange, this.f38580a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f38581b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m29768e(doFinal, bArr2));
    }
}
