package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import android.annotation.TargetApi;
import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.C19383o;

public final class NoAuthSecureKeyWrapper extends BaseSecureKeyWrapper {
    private final String RSA_PKI_ALGORITHM = "SHA256withRSA";

    public String generateAsymmetricKeyPair(String str, Context context) throws RuntimeException {
        byte[] encoded;
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, "appContext");
        PublicKey generatePublicKey = generatePublicKey(str, false, context);
        String str2 = null;
        if (!(generatePublicKey == null || (encoded = generatePublicKey.getEncoded()) == null)) {
            str2 = base64AndUrlSafeEncodedStringFromBytes(encoded);
        }
        return String.valueOf(str2);
    }

    public final SecureKeyModel generateAsymmetricKeyPairAndProvider(String str, Context context) throws RuntimeException {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        SecureKeyModel secureKeyModel = new SecureKeyModel();
        deleteAsymmetricKey(str);
        PublicKey generatePublicKey = super.generatePublicKey(str, false, context);
        if (generatePublicKey != null) {
            byte[] encoded = generatePublicKey.getEncoded();
            C19383o.m32796f(encoded, "publicKey.encoded");
            String base64AndUrlSafeEncodedStringFromBytes = base64AndUrlSafeEncodedStringFromBytes(encoded);
            secureKeyModel.setKeyStoreProvider("EC");
            secureKeyModel.setPublicKey(base64AndUrlSafeEncodedStringFromBytes);
        }
        return secureKeyModel;
    }

    @TargetApi(18)
    public PublicKey generatePublicKey(String str, boolean z, Context context) {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return super.generatePublicKey(str, context);
    }

    @TargetApi(18)
    public final Signature generateSignatureForRSA(String str) {
        C19383o.m32797g(str, "privateKeyAlias");
        try {
            KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            Key key = instance.getKey(str, (char[]) null);
            if (key != null) {
                Signature instance2 = Signature.getInstance(this.RSA_PKI_ALGORITHM);
                instance2.initSign((PrivateKey) key);
                return instance2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.PrivateKey");
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        } catch (CertificateException e4) {
            throw new RuntimeException(e4);
        } catch (UnrecoverableEntryException e5) {
            throw new RuntimeException(e5);
        } catch (InvalidKeyException e6) {
            throw new RuntimeException(e6);
        }
    }
}
