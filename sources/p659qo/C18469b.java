package p659qo;

import android.annotation.TargetApi;
import android.util.Base64;
import android.util.Log;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.Certificate;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* renamed from: qo.b */
public final class C18469b extends C18468a {
    /* renamed from: e */
    public static String m31171e(String str, Cipher cipher) {
        try {
            byte[] doFinal = cipher.doFinal(str.getBytes());
            byte[] bArr = new byte[(doFinal.length + 16)];
            System.arraycopy(cipher.getIV(), 0, bArr, 0, 16);
            System.arraycopy(doFinal, 0, bArr, 16, doFinal.length);
            return Base64.encodeToString(bArr, 0);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            Log.e("CryptoSecureKeyWrapperImpl", "Error while encrypting data: Exception", e);
            throw new RuntimeException(e);
        }
    }

    @TargetApi(18)
    /* renamed from: c */
    public final PublicKey mo69984c(String str) {
        throw null;
    }

    /* renamed from: f */
    public final String mo69985f(String str) {
        PublicKey publicKey;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            try {
                KeyStore instance2 = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
                instance2.load((KeyStore.LoadStoreParameter) null);
                Certificate certificate = instance2.getCertificate("CryptoKeyAlias");
                if (certificate == null) {
                    publicKey = null;
                    instance.init(1, publicKey);
                    return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
                }
                publicKey = certificate.getPublicKey();
                instance.init(1, publicKey);
                return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
            } catch (Exception e) {
                Log.e("CryptoSecureKeyWrapperImpl", "Exception in retrieving Public key", e);
            }
        } catch (Exception e2) {
            Log.e("CryptoSecureKeyWrapperImpl", "Exception in encrypting String", e2);
            return null;
        }
    }
}
