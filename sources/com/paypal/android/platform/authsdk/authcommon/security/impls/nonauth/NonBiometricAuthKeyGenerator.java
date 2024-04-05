package com.paypal.android.platform.authsdk.authcommon.security.impls.nonauth;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.security.impls.auth.KeyGenerator;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.C19383o;

public final class NonBiometricAuthKeyGenerator extends KeyGenerator {
    private final PublicKey generatePublicKeyForMinimumApiJellyBeanMR2(Context context, String str, boolean z) {
        PublicKey publicKeyForEncryption = getPublicKeyForEncryption(str);
        if (publicKeyForEncryption != null) {
            return publicKeyForEncryption;
        }
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        instance.add(1, 1);
        Date time2 = instance.getTime();
        Locale.getDefault();
        try {
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance(CryptoUtilsKt.getKEY_ALGORITHM_RSA(), CryptoUtilsKt.getANDROID_KEYSTORE());
            C19383o.m32796f(instance2, "getInstance(KEY_ALGORITHM_RSA,ANDROID_KEYSTORE)");
            KeyPairGeneratorSpec.Builder serialNumber = new KeyPairGeneratorSpec.Builder(context).setAlias(str).setStartDate(time).setEndDate(time2).setSerialNumber(BigInteger.valueOf(1));
            instance2.initialize(serialNumber.setSubject(new X500Principal("CN=" + str)).build());
            return instance2.generateKeyPair().getPublic();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private final PublicKey getPublicKeyForEncryption(String str) {
        try {
            KeyStore instance = KeyStore.getInstance(CryptoUtilsKt.getANDROID_KEYSTORE());
            instance.load((KeyStore.LoadStoreParameter) null);
            Certificate certificate = instance.getCertificate(str);
            if (certificate == null) {
                return null;
            }
            return certificate.getPublicKey();
        } catch (Exception unused) {
            return null;
        }
    }

    public PublicKey generatePublicKey(Context context, String str, boolean z) throws RuntimeException {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "keyName");
        return super.generatePublicKey(context, str, z);
    }
}
