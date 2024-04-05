package com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper;

import android.content.Context;
import android.content.SharedPreferences;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.CryptoSecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyFactory;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CryptoHelperPKCS5 extends BaseCryptoHelper {
    private static final String AES_CBC_PKCS5_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String AES_SECRET_KEY = "aes_secret_key";
    private static final int CIPHER_IV_SIZE_IN_BYTES = 16;
    private static final String CRYPTO_PREF_NAME = "CryptoPref";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ENCRYPTION_KEY_ALIAS = "CryptoKeyAlias";
    private static final String RSA_PKCS1_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private final byte[] cryptoKey;
    private final CryptoSecureKeyWrapper secureKeyWrapper;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CryptoHelperPKCS5(SharedPreferences sharedPreferences, Context context) {
        C19383o.m32797g(sharedPreferences, "cryptoPreferences");
        C19383o.m32797g(context, "appContext");
        CryptoSecureKeyWrapper createCryptoSecureKeyWrapper = SecureKeyFactory.INSTANCE.createCryptoSecureKeyWrapper();
        this.secureKeyWrapper = createCryptoSecureKeyWrapper;
        this.cryptoKey = getCryptoKey(createCryptoSecureKeyWrapper, sharedPreferences, AES_SECRET_KEY, ENCRYPTION_KEY_ALIAS, RSA_PKCS1_ALGORITHM, context);
    }

    public String decrypt(String str) {
        C19383o.m32797g(str, "value");
        return decrypt(this.cryptoKey, this.secureKeyWrapper, AES_CBC_PKCS5_ALGORITHM, 16, str);
    }

    public String encrypt(String str) {
        C19383o.m32797g(str, "value");
        return encrypt(this.cryptoKey, this.secureKeyWrapper, AES_CBC_PKCS5_ALGORITHM, 16, str);
    }
}
