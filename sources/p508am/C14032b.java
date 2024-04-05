package p508am;

import android.util.Log;
import androidx.appcompat.widget.C0326j;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p705wl.C18726a;

/* renamed from: am.b */
public final class C14032b implements C18726a {

    /* renamed from: a */
    public final SecretKey f30887a;

    public C14032b(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f30887a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(C0326j.m864i("Keystore cannot load the key with ID: ", str));
        }
    }

    /* renamed from: a */
    public final byte[] mo46853a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return mo46856d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return mo46856d(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public final byte[] mo46854b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return mo46855c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return mo46855c(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] mo46855c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f30887a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] mo46856d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f30887a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
