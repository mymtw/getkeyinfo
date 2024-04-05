package p721yl;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p567fm.C17766m;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18726a;

/* renamed from: yl.a */
public final class C18893a implements C18726a {

    /* renamed from: b */
    public static final C18894a f42073b = new C18894a();

    /* renamed from: a */
    public final SecretKeySpec f42074a;

    /* renamed from: yl.a$a */
    public class C18894a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return C17766m.f38612e.mo69010a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C18893a(byte[] bArr) throws GeneralSecurityException {
        C17778t.m29817a(bArr.length);
        this.f42074a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m31980c(int i, byte[] bArr) throws GeneralSecurityException {
        boolean z;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("android.app.Application", false, (ClassLoader) null);
                z = true;
            } catch (Exception unused2) {
                z = false;
            }
            if (z) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = C17776s.m29816a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c = m31980c(a.length, a);
            C18894a aVar = f42073b;
            ((Cipher) aVar.get()).init(1, this.f42074a, c);
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
            AlgorithmParameterSpec c = m31980c(12, bArr);
            C18894a aVar = f42073b;
            ((Cipher) aVar.get()).init(2, this.f42074a, c);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) aVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
