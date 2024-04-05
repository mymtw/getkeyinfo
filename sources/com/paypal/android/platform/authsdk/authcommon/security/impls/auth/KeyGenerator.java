package com.paypal.android.platform.authsdk.authcommon.security.impls.auth;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.IKeyGenerator;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

public class KeyGenerator implements IKeyGenerator {
    @TargetApi(23)
    public PublicKey generatePublicKey(Context context, String str, boolean z) throws RuntimeException {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "keyName");
        Locale.getDefault();
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(CryptoUtilsKt.getKEY_ALGORITHM_EC(), CryptoUtilsKt.getANDROID_KEYSTORE());
            instance.initialize(new KeyGenParameterSpec.Builder(str, 4).setAlgorithmParameterSpec(new ECGenParameterSpec(CryptoUtilsKt.getEC_CURVE())).setDigests(new String[]{"SHA-256"}).setUserAuthenticationRequired(z).build());
            PublicKey publicKey = instance.generateKeyPair().getPublic();
            C19383o.m32796f(publicKey, "{\n            val initia…}\n            }\n        }");
            return publicKey;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchProviderException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new RuntimeException(e3);
        }
    }
}
