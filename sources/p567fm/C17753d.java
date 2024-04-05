package p567fm;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p705wl.C18726a;

/* renamed from: fm.d */
public final class C17753d implements C18726a {

    /* renamed from: b */
    public static final C17754a f38585b = new C17754a();

    /* renamed from: a */
    public final SecretKeySpec f38586a;

    /* renamed from: fm.d$a */
    public class C17754a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return C17766m.f38612e.mo69010a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C17753d(byte[] bArr) throws GeneralSecurityException {
        C17778t.m29817a(bArr.length);
        this.f38586a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m29772c(int i, byte[] bArr) throws GeneralSecurityException {
        boolean z;
        int i2;
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            try {
                i2 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt((Object) null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused2) {
                i2 = -1;
            }
            if (i2 <= 19) {
                return new IvParameterSpec(bArr, 0, i);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, i);
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = C17776s.m29816a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c = m29772c(a.length, a);
            C17754a aVar = f38585b;
            ((Cipher) aVar.get()).init(1, this.f38586a, c);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c = m29772c(12, bArr);
            C17754a aVar = f38585b;
            ((Cipher) aVar.get()).init(2, this.f38586a, c);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) aVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
