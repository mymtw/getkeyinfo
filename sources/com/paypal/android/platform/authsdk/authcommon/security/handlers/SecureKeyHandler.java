package com.paypal.android.platform.authsdk.authcommon.security.handlers;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import kotlin.jvm.internal.C19383o;

public final class SecureKeyHandler {
    @TargetApi(23)
    public final void createKeyRemoveExistingIfPresent$auth_sdk_thirdPartyRelease(String str, boolean z) {
        C19383o.m32797g(str, "key");
        try {
            deleteKey$auth_sdk_thirdPartyRelease(str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", CryptoUtilsKt.getANDROID_KEYSTORE());
            C19383o.m32796f(instance, "getInstance(\n           …ID_KEYSTORE\n            )");
            instance.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"CBC"}).setUserAuthenticationRequired(z).setEncryptionPaddings(new String[]{"PKCS7Padding"}).build());
            instance.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to create a symmetric key", e);
        } catch (NoSuchProviderException e2) {
            throw new RuntimeException("Failed to create a symmetric key", e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new RuntimeException("Failed to create a symmetric key", e3);
        }
    }

    public final void deleteKey$auth_sdk_thirdPartyRelease(String str) throws RuntimeException {
        C19383o.m32797g(str, "key");
        try {
            KeyStore instance = KeyStore.getInstance(CryptoUtilsKt.getANDROID_KEYSTORE());
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry(str);
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (CertificateException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final KeyStore getKeyStoreInstance$auth_sdk_thirdPartyRelease() {
        try {
            KeyStore instance = KeyStore.getInstance(CryptoUtilsKt.getANDROID_KEYSTORE());
            C19383o.m32796f(instance, "getInstance(ANDROID_KEYSTORE)");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (KeyStoreException e2) {
            throw new RuntimeException(e2);
        } catch (CertificateException e3) {
            throw new RuntimeException(e3);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
