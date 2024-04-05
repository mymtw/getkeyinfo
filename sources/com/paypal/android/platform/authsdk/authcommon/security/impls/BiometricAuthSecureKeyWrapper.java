package com.paypal.android.platform.authsdk.authcommon.security.impls;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.security.BaseSecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.security.handlers.CipherHandler;
import com.paypal.android.platform.authsdk.authcommon.security.impls.auth.BiometricAuthenticateKey;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ICipher;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.IKeyGenerator;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ISecureKey;
import javax.crypto.Cipher;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BiometricAuthSecureKeyWrapper extends BaseSecureKeyWrapper {
    private final ICipher cipher;
    private final ISecureKey secureKey;

    public BiometricAuthSecureKeyWrapper() {
        this((ISecureKey) null, (ICipher) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricAuthSecureKeyWrapper(ISecureKey iSecureKey, ICipher iCipher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BiometricAuthenticateKey((IKeyGenerator) null, 1, (DefaultConstructorMarker) null) : iSecureKey, (i & 2) != 0 ? new AesCipher() : iCipher);
    }

    public String getKey(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "keyName");
        return this.secureKey.generateEncodedKey(context, str);
    }

    public final Cipher provideDecryptionCipher(String str, String str2) {
        C19383o.m32797g(str, "encryptedData");
        C19383o.m32797g(str2, "keyName");
        return new CipherHandler(this.cipher).provideDecryptionCipher$auth_sdk_thirdPartyRelease(str, str2);
    }

    public final Cipher provideEncryptionCipher(String str, boolean z) {
        C19383o.m32797g(str, "keyName");
        return new CipherHandler(this.cipher).provideEncryptionCipher$auth_sdk_thirdPartyRelease(str, z);
    }

    public BiometricAuthSecureKeyWrapper(ISecureKey iSecureKey, ICipher iCipher) {
        C19383o.m32797g(iSecureKey, "secureKey");
        C19383o.m32797g(iCipher, "cipher");
        this.secureKey = iSecureKey;
        this.cipher = iCipher;
    }
}
