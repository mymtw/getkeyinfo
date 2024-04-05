package com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper;

import android.content.Context;
import android.content.SharedPreferences;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.CryptoSecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyFactory;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CryptoHelperGCM extends BaseCryptoHelper {
    private static final String AES_GCM_NO_PADDING_ALGORITHM = "AES/GCM/NoPadding";
    private static final String AES_SECRET_KEY = "aes_gcm_secret_key";
    private static final int CIPHER_IV_SIZE_IN_BYTES = 12;
    private static final int CIPHER_IV_SIZE_IN_BYTES_BELOW_M = 16;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ENCRYPTION_KEY_ALIAS = "GCMCryptoKeyAlias";
    private static final String RSA_NO_PADDING_ALGORITHM = "RSA/ECB/NoPadding";
    private final byte[] cryptoKey;
    private final SharedPreferences mPreferences;
    private final CryptoSecureKeyWrapper secureKeyWrapper;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CryptoHelperGCM(SharedPreferences sharedPreferences, Context context) {
        C19383o.m32797g(sharedPreferences, "mPreferences");
        C19383o.m32797g(context, "appContext");
        this.mPreferences = sharedPreferences;
        CryptoSecureKeyWrapper createCryptoSecureKeyWrapper = SecureKeyFactory.INSTANCE.createCryptoSecureKeyWrapper();
        this.secureKeyWrapper = createCryptoSecureKeyWrapper;
        this.cryptoKey = getCryptoKey(createCryptoSecureKeyWrapper, sharedPreferences, AES_SECRET_KEY, ENCRYPTION_KEY_ALIAS, RSA_NO_PADDING_ALGORITHM, context);
    }

    private final int getCipherIv() {
        return 12;
    }

    public String decrypt(String str) {
        C19383o.m32797g(str, "value");
        return decrypt(this.cryptoKey, this.secureKeyWrapper, AES_GCM_NO_PADDING_ALGORITHM, getCipherIv(), str);
    }

    public String encrypt(String str) {
        C19383o.m32797g(str, "value");
        return encrypt(this.cryptoKey, this.secureKeyWrapper, AES_GCM_NO_PADDING_ALGORITHM, getCipherIv(), str);
    }
}
