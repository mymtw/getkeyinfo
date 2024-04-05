package com.paypal.android.platform.authsdk.authcommon.security.impls.auth;

import android.annotation.TargetApi;
import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.IKeyGenerator;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ISecureKey;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BiometricAuthenticateKey implements ISecureKey {
    private final IKeyGenerator keyGenerator;

    public BiometricAuthenticateKey() {
        this((IKeyGenerator) null, 1, (DefaultConstructorMarker) null);
    }

    public BiometricAuthenticateKey(IKeyGenerator iKeyGenerator) {
        C19383o.m32797g(iKeyGenerator, "keyGenerator");
        this.keyGenerator = iKeyGenerator;
    }

    @TargetApi(23)
    public String generateEncodedKey(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "keyName");
        byte[] encoded = this.keyGenerator.generatePublicKey(context, str, true).getEncoded();
        C19383o.m32796f(encoded, "publicKey.encoded");
        return CryptoUtilsKt.encodeBase64$default(encoded, 0, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricAuthenticateKey(IKeyGenerator iKeyGenerator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new KeyGenerator() : iKeyGenerator);
    }
}
