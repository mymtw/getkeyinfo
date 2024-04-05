package com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.CryptoSecureKeyWrapper;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class BaseCryptoHelper implements ICryptoHelper {
    private static final String ALGORITHM_AES = "AES";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean hasAESKey(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null) != null;
    }

    private final void persistAESKey(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    private final byte[] readAESKeyFromPreference(CryptoSecureKeyWrapper cryptoSecureKeyWrapper, SharedPreferences sharedPreferences, String str, String str2, String str3) {
        String str4 = null;
        String string = sharedPreferences.getString(str, (String) null);
        if (string != null) {
            str4 = cryptoSecureKeyWrapper.decryptString(str2, string, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            byte[] decode = Base64.decode(str4, 0);
            C19383o.m32796f(decode, "decode(decryptedAESKey, Base64.DEFAULT)");
            return decode;
        }
        throw new RuntimeException("decryptedAESKey is of length zero.");
    }

    public final String decrypt(byte[] bArr, CryptoSecureKeyWrapper cryptoSecureKeyWrapper, String str, int i, String str2) {
        C19383o.m32797g(cryptoSecureKeyWrapper, "secureKeyWrapper");
        C19383o.m32797g(str, "cipherTransformation");
        C19383o.m32797g(str2, "value");
        return (bArr == null || bArr.length <= 0) ? str2 : cryptoSecureKeyWrapper.decryptStringUsingAES(new SecretKeySpec(bArr, 0, bArr.length, ALGORITHM_AES), str2, str, i);
    }

    public final String encrypt(byte[] bArr, CryptoSecureKeyWrapper cryptoSecureKeyWrapper, String str, int i, String str2) {
        C19383o.m32797g(cryptoSecureKeyWrapper, "secureKeyWrapper");
        C19383o.m32797g(str, "cipherTransformation");
        C19383o.m32797g(str2, "value");
        return (bArr == null || bArr.length <= 0) ? str2 : cryptoSecureKeyWrapper.encryptStringUsingAES(new SecretKeySpec(bArr, 0, bArr.length, ALGORITHM_AES), str2, str, i);
    }

    public final byte[] getCryptoKey(CryptoSecureKeyWrapper cryptoSecureKeyWrapper, SharedPreferences sharedPreferences, String str, String str2, String str3, Context context) {
        C19383o.m32797g(cryptoSecureKeyWrapper, "secureKeyWrapper");
        C19383o.m32797g(sharedPreferences, "preferences");
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "keyAlias");
        C19383o.m32797g(str3, "cipherTransformation");
        C19383o.m32797g(context, "appContext");
        cryptoSecureKeyWrapper.generatePublicKey(str2, context);
        try {
            if (!hasAESKey(sharedPreferences, str)) {
                SecretKey generateAESSecretKey = cryptoSecureKeyWrapper.generateAESSecretKey();
                String encodeToString = Base64.encodeToString(generateAESSecretKey == null ? null : generateAESSecretKey.getEncoded(), 0);
                C19383o.m32796f(encodeToString, "encodedAESKey");
                String encryptString = cryptoSecureKeyWrapper.encryptString(str2, encodeToString, str3);
                if (TextUtils.isEmpty(encryptString)) {
                    throw new RuntimeException("encryptedAESKey is of length zero");
                } else if (encryptString != null) {
                    persistAESKey(sharedPreferences, str, encryptString);
                }
            }
            return readAESKeyFromPreference(cryptoSecureKeyWrapper, sharedPreferences, str, str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
