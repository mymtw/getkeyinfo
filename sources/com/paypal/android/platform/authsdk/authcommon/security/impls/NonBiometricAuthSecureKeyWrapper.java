package com.paypal.android.platform.authsdk.authcommon.security.impls;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.security.BaseSecureKeyWrapper;
import com.paypal.android.platform.authsdk.authcommon.security.impls.nonauth.NonBiometricAuthenticateKey;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.IKeyGenerator;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ISecureKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NonBiometricAuthSecureKeyWrapper extends BaseSecureKeyWrapper {
    private final ISecureKey secureKey;

    public NonBiometricAuthSecureKeyWrapper() {
        this((ISecureKey) null, 1, (DefaultConstructorMarker) null);
    }

    public NonBiometricAuthSecureKeyWrapper(ISecureKey iSecureKey) {
        C19383o.m32797g(iSecureKey, "secureKey");
        this.secureKey = iSecureKey;
    }

    public String getKey(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "keyName");
        return this.secureKey.generateEncodedKey(context, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NonBiometricAuthSecureKeyWrapper(ISecureKey iSecureKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new NonBiometricAuthenticateKey((IKeyGenerator) null, 1, (DefaultConstructorMarker) null) : iSecureKey);
    }
}
