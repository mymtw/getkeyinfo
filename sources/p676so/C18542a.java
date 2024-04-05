package p676so;

import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import p659qo.C18468a;
import p659qo.C18469b;

/* renamed from: so.a */
public abstract class C18542a {
    /* renamed from: a */
    public static byte[] m31281a(C18469b bVar, SharedPreferences sharedPreferences) {
        String str = null;
        String string = sharedPreferences.getString("aes_secret_key", (String) null);
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, C18468a.m31169d());
            byte[] doFinal = instance.doFinal(Base64.decode(string, 0));
            if (doFinal != null) {
                str = new String(doFinal);
            }
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("Exception in decrypting String: ");
            h.append(e.getLocalizedMessage());
            Log.e("CryptoSecureKeyWrapperImpl", h.toString());
        }
        if (!TextUtils.isEmpty(str)) {
            return Base64.decode(str, 0);
        }
        throw new RuntimeException("decryptedAESKey is of length zero.");
    }
}
