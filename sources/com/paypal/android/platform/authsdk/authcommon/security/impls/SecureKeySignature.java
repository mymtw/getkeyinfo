package com.paypal.android.platform.authsdk.authcommon.security.impls;

import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ISecureKeySignature;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.C19383o;

public final class SecureKeySignature implements ISecureKeySignature {
    private final String algorithm;

    public SecureKeySignature(String str) {
        C19383o.m32797g(str, "algorithm");
        this.algorithm = str;
    }

    public Signature generateSignature(String str) {
        C19383o.m32797g(str, "privateKeyAlias");
        try {
            KeyStore instance = KeyStore.getInstance(CryptoUtilsKt.getANDROID_KEYSTORE());
            instance.load((KeyStore.LoadStoreParameter) null);
            Key key = instance.getKey(str, (char[]) null);
            if (key != null) {
                Signature instance2 = Signature.getInstance(this.algorithm);
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
        } catch (Exception e7) {
            if (C19383o.m32792b("android.security.keystore.UserNotAuthenticatedException", e7.getClass().getName())) {
                return null;
            }
            throw new RuntimeException(e7);
        }
    }
}
