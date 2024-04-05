package com.paypal.android.platform.authsdk.authcommon.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.NoAuthSecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyFactory;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyModel;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.SecureKeyWrapper;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;

public final class PKCEParamHelper {
    private final String AUTO_LOGIN_ASYMMETRIC_KEY;
    private final String CHALLENGE_METHOD_ES256;
    private final String CHALLENGE_METHOD_RS256;
    private final String CHALLENGE_METHOD_S256;
    private final String CODE_CHALLENGE;
    private final String challengeMethod;
    private String codeChallenge;
    private String codeVerifier;
    private final String nonce;

    public PKCEParamHelper(SecureKeyWrapper secureKeyWrapper, Context context) {
        C19383o.m32797g(secureKeyWrapper, "secureKeyWrapper");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.CODE_CHALLENGE = ConstantsKt.CODE_CHALLENGE;
        this.AUTO_LOGIN_ASYMMETRIC_KEY = "asymmetricKeyAlias";
        this.CHALLENGE_METHOD_S256 = "S256";
        this.CHALLENGE_METHOD_ES256 = ConstantsKt.CHALLENGE_METHOD_ES256;
        this.CHALLENGE_METHOD_RS256 = "RS256";
        try {
            SecureKeyModel generateAsymmetricKeyPairAndProvider = ((NoAuthSecureKeyWrapper) secureKeyWrapper).generateAsymmetricKeyPairAndProvider("asymmetricKeyAlias", context);
            this.codeVerifier = generateAsymmetricKeyPairAndProvider.getPublicKey();
            String generateNonceWithNoWrap = generateNonceWithNoWrap();
            this.nonce = generateNonceWithNoWrap;
            String authChallengeMethodBasedOnProvider = getAuthChallengeMethodBasedOnProvider(generateAsymmetricKeyPairAndProvider.getKeyStoreProvider());
            this.challengeMethod = authChallengeMethodBasedOnProvider;
            this.codeChallenge = getAuthCodeChallenge(authChallengeMethodBasedOnProvider, generateNonceWithNoWrap);
        } catch (Throwable th) {
            throw new Throwable("Getting exception while generating asymmetric key and codeChallenge", th);
        }
    }

    private final String getAuthChallengeMethodBasedOnProvider(String str) {
        String str2 = this.CHALLENGE_METHOD_S256;
        return !TextUtils.isEmpty(str) ? C19383o.m32792b("EC", str) ? this.CHALLENGE_METHOD_ES256 : C19383o.m32792b(BaseSecureKeyWrapper.RSA_ALGORITHM, str) ? this.CHALLENGE_METHOD_RS256 : str2 : str2;
    }

    private final String getAuthCodeChallenge(String str, String str2) {
        if (C19383o.m32792b(this.CHALLENGE_METHOD_ES256, str)) {
            SecureKeyWrapper createSecureKeyWrapper = SecureKeyFactory.INSTANCE.createSecureKeyWrapper();
            Signature generateSignature = createSecureKeyWrapper.generateSignature(this.AUTO_LOGIN_ASYMMETRIC_KEY);
            if (generateSignature == null) {
                return null;
            }
            return createSecureKeyWrapper.signDataUsingSignatureObjectAndBase64Encode(generateSignature, str2);
        } else if (!C19383o.m32792b(this.CHALLENGE_METHOD_RS256, str)) {
            return null;
        } else {
            NoAuthSecureKeyWrapper noAuthSecureKeyWrapper = (NoAuthSecureKeyWrapper) SecureKeyFactory.INSTANCE.createSecureKeyWrapper();
            return noAuthSecureKeyWrapper.signDataUsingSignatureObjectAndBase64Encode(noAuthSecureKeyWrapper.generateSignatureForRSA(this.AUTO_LOGIN_ASYMMETRIC_KEY), str2);
        }
    }

    private final String getNonce(int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        byte[] bytes = String.valueOf(new Random(16).nextInt()).getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        return C0326j.m864i(format, Base64.encodeToString(bytes, i));
    }

    public final String generateNonceWithNoWrap() {
        return getNonce(11);
    }

    public final String getAUTO_LOGIN_ASYMMETRIC_KEY() {
        return this.AUTO_LOGIN_ASYMMETRIC_KEY;
    }

    public final String getAuthCodeChallengeMethod() {
        return this.challengeMethod;
    }

    public final String getAuthNonce() {
        return this.nonce;
    }

    public final String getCODE_CHALLENGE() {
        return this.CODE_CHALLENGE;
    }

    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final String getAuthCodeChallenge() {
        return this.codeChallenge;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PKCEParamHelper(SecureKeyWrapper secureKeyWrapper, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SecureKeyFactory.INSTANCE.createSecureKeyWrapper() : secureKeyWrapper, context);
    }
}
