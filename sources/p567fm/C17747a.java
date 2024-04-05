package p567fm;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: fm.a */
public final class C17747a implements C17771o {

    /* renamed from: d */
    public static final C17748a f38574d = new C17748a();

    /* renamed from: a */
    public final SecretKeySpec f38575a;

    /* renamed from: b */
    public final int f38576b;

    /* renamed from: c */
    public final int f38577c;

    /* renamed from: fm.a$a */
    public class C17748a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return C17766m.f38612e.mo69010a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C17747a(int i, byte[] bArr) throws GeneralSecurityException {
        C17778t.m29817a(bArr.length);
        this.f38575a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f38574d.get()).getBlockSize();
        this.f38577c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f38576b = i;
    }

    /* renamed from: a */
    public final byte[] mo68992a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f38576b;
        if (length <= Api.BaseClientBuilder.API_PRIORITY_OTHER - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a = C17776s.m29816a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f38576b);
            mo68994c(bArr, 0, bArr.length, bArr2, this.f38576b, a, true);
            return bArr2;
        }
        StringBuilder h = C0072d.m201h("plaintext length can not exceed ");
        h.append(Api.BaseClientBuilder.API_PRIORITY_OTHER - this.f38576b);
        throw new GeneralSecurityException(h.toString());
    }

    /* renamed from: b */
    public final byte[] mo68993b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f38576b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f38576b;
            byte[] bArr3 = new byte[(length2 - i2)];
            mo68994c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: c */
    public final void mo68994c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f38574d.get();
        byte[] bArr4 = new byte[this.f38577c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f38576b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f38575a, ivParameterSpec);
        } else {
            cipher.init(2, this.f38575a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
