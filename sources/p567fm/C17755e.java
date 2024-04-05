package p567fm;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.google.android.play.core.assetpacks.C15588c1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p705wl.C18729c;

/* renamed from: fm.e */
public final class C17755e implements C18729c {

    /* renamed from: c */
    public static final List f38587c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    public static final byte[] f38588d = new byte[16];

    /* renamed from: e */
    public static final byte[] f38589e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final C17772p f38590a;

    /* renamed from: b */
    public final byte[] f38591b;

    public C17755e(byte[] bArr) throws GeneralSecurityException {
        if (f38587c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f38591b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f38590a = new C17772p(copyOfRange);
            return;
        }
        throw new InvalidKeyException(C0071c.m191c(C0072d.m201h("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
    }

    /* renamed from: a */
    public final byte[] mo69000a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483631) {
            Cipher a = C17766m.f38612e.mo69010a("AES/CTR/NoPadding");
            byte[] c = mo69002c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.f38591b, "AES"), new IvParameterSpec(bArr3));
            return C17760g.m29780a(c, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public final byte[] mo69001b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean z;
        if (bArr.length >= 16) {
            Cipher a = C17766m.f38612e.mo69010a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(2, new SecretKeySpec(this.f38591b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null) {
                try {
                    Class.forName("android.app.Application", false, (ClassLoader) null);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    doFinal = new byte[0];
                }
            }
            if (C17760g.m29781b(copyOfRange, mo69002c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    /* renamed from: c */
    public final byte[] mo69002c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArr2;
        if (bArr.length == 0) {
            return this.f38590a.mo47113a(16, f38589e);
        }
        byte[] a = this.f38590a.mo47113a(16, f38588d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr3 = bArr[i];
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            a = C17760g.m29784e(C15588c1.m25312W(a), this.f38590a.mo47113a(16, bArr3));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length >= 16) {
            if (bArr4.length >= a.length) {
                int length = bArr4.length - a.length;
                bArr2 = Arrays.copyOf(bArr4, bArr4.length);
                for (int i2 = 0; i2 < a.length; i2++) {
                    int i3 = length + i2;
                    bArr2[i3] = (byte) (bArr2[i3] ^ a[i2]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr4.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr4, 16);
            copyOf[bArr4.length] = Byte.MIN_VALUE;
            bArr2 = C17760g.m29784e(copyOf, C15588c1.m25312W(a));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return this.f38590a.mo47113a(16, bArr2);
    }
}
