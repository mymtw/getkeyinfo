package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.p013v4.media.C0070b;
import android.util.Base64;
import android.util.Log;
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
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;
import p010a9.C0048b;

public final class CryptoSecureKeyWrapperImpl extends BaseSecureKeyWrapper implements CryptoSecureKeyWrapper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String RSA_PKI_ALGORITHM = "SHA256withRSA";
    /* access modifiers changed from: private */
    public static final String TAG = "CryptoSecureKeyWrapperImpl";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String decryptDataUsingCipher(String str, Cipher cipher, int i) {
            C19383o.m32797g(str, "encryptedData");
            C19383o.m32797g(cipher, "decryptionCipher");
            try {
                String tag = getTAG();
                Log.e(tag, "decryptData: base64EncryptedDataPrefixedByIv is : " + str);
                byte[] decode = Base64.decode(str, 0);
                int length = decode.length - i;
                byte[] bArr = new byte[length];
                System.arraycopy(decode, 0, new byte[i], 0, i);
                System.arraycopy(decode, i, bArr, 0, length);
                byte[] doFinal = cipher.doFinal(bArr);
                C19383o.m32796f(doFinal, "decryptionCipher.doFinal(encryptedByteData)");
                String str2 = new String(doFinal, C19446a.f43373b);
                String tag2 = getTAG();
                Log.d(tag2, "decryptData: Returning decrypted data : " + str2);
                return str2;
            } catch (IllegalBlockSizeException e) {
                Log.e(getTAG(), "decryptData: Exception", e);
                return null;
            } catch (BadPaddingException e2) {
                Log.e(getTAG(), "decryptData: Exception", e2);
                return null;
            }
        }

        public final String encryptDataUsingCipher(String str, Cipher cipher, int i) {
            byte[] bArr;
            C19383o.m32797g(cipher, "encryptionCipher");
            if (str == null) {
                bArr = null;
            } else {
                try {
                    bArr = str.getBytes(C19446a.f43373b);
                    C19383o.m32796f(bArr, "this as java.lang.String).getBytes(charset)");
                } catch (IllegalBlockSizeException e) {
                    Log.e(getTAG(), "Error while encrypting data: Exception", e);
                    throw new RuntimeException(e);
                } catch (BadPaddingException e2) {
                    Log.e(getTAG(), "Error while encrypting data: Exception", e2);
                    throw new RuntimeException(e2);
                }
            }
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] bArr2 = new byte[(doFinal.length + i)];
            System.arraycopy(cipher.getIV(), 0, bArr2, 0, i);
            System.arraycopy(doFinal, 0, bArr2, i, doFinal.length);
            String encodeToString = Base64.encodeToString(bArr2, 0);
            C19383o.m32796f(encodeToString, "{\n                val pl…64.DEFAULT)\n            }");
            return encodeToString;
        }

        public final byte[] getDecryptionIv(String str, int i) {
            C19383o.m32797g(str, "base64EncryptedDataPrefixedByIv");
            byte[] decode = Base64.decode(str, 0);
            C0070b.m187j("getDecryptionIv: encryptedDataPrefixByIv is : ", Arrays.toString(decode), getTAG());
            byte[] bArr = new byte[i];
            System.arraycopy(decode, 0, bArr, 0, i);
            return bArr;
        }

        public final String getTAG() {
            return CryptoSecureKeyWrapperImpl.TAG;
        }
    }

    private final PublicKey getPublicKeyForEncryption(String str) {
        try {
            KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            Certificate certificate = instance.getCertificate(str);
            if (certificate == null) {
                return null;
            }
            return certificate.getPublicKey();
        } catch (Exception e) {
            Log.e(TAG, "Exception in retrieving Public key", e);
            return null;
        }
    }

    public String decryptString(String str, String str2, String str3) {
        C0048b.m167f(str, "keyName", str2, "value", str3, "cipherTransformation");
        try {
            Cipher instance = Cipher.getInstance(str3);
            instance.init(2, getPrivateKey(str));
            byte[] doFinal = instance.doFinal(Base64.decode(str2, 0));
            if (doFinal == null) {
                return null;
            }
            return new String(doFinal, C19446a.f43373b);
        } catch (Exception e) {
            String str4 = TAG;
            String localizedMessage = e.getLocalizedMessage();
            Log.e(str4, "Exception in decrypting String: " + localizedMessage);
            return null;
        }
    }

    public String decryptStringUsingAES(SecretKey secretKey, String str, String str2, int i) {
        C19383o.m32797g(secretKey, "secretKey");
        C19383o.m32797g(str, "value");
        C19383o.m32797g(str2, "cipherTransformation");
        try {
            Cipher instance = Cipher.getInstance(str2);
            Companion companion = Companion;
            instance.init(2, secretKey, new IvParameterSpec(companion.getDecryptionIv(str, i)));
            return companion.decryptDataUsingCipher(str, instance, instance.getIV().length);
        } catch (Exception e) {
            String str3 = TAG;
            String localizedMessage = e.getLocalizedMessage();
            Log.e(str3, "Exception in creating cipher for decrypting String: " + localizedMessage);
            return null;
        }
    }

    public String encryptString(String str, String str2, String str3) {
        C0048b.m167f(str, "keyName", str2, "value", str3, "cipherTransformation");
        try {
            Cipher instance = Cipher.getInstance(str3);
            instance.init(1, getPublicKeyForEncryption(str));
            byte[] bytes = str2.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            return Base64.encodeToString(instance.doFinal(bytes), 0);
        } catch (Exception e) {
            Log.e(TAG, "Exception in encrypting String", e);
            return null;
        }
    }

    public String encryptStringUsingAES(SecretKey secretKey, String str, String str2, int i) {
        C19383o.m32797g(secretKey, "secretKey");
        C19383o.m32797g(str, "value");
        C19383o.m32797g(str2, "cipherTransformation");
        try {
            Cipher instance = Cipher.getInstance(str2);
            instance.init(1, secretKey);
            String str3 = TAG;
            int length = instance.getIV().length;
            Log.d(str3, "IV size : " + length);
            try {
                return Companion.encryptDataUsingCipher(str, instance, i);
            } catch (RuntimeException e) {
                Log.e(TAG, "Exception in encrypting String", e);
                return null;
            }
        } catch (Exception e2) {
            Log.e(TAG, "Exception in creating cipher for encrypting String", e2);
            return null;
        }
    }

    public String generateAsymmetricKeyPair(String str, Context context) throws RuntimeException {
        byte[] encoded;
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, "appContext");
        PublicKey generatePublicKey = generatePublicKey(str, false, context);
        String str2 = null;
        if (!(generatePublicKey == null || (encoded = generatePublicKey.getEncoded()) == null)) {
            str2 = base64AndUrlSafeEncodedStringFromBytes(encoded);
        }
        String valueOf = String.valueOf(str2);
        C0070b.m187j("Encoded public key string: ", valueOf, TAG);
        return valueOf;
    }

    public final SecureKeyModel generateAsymmetricKeyPairAndProvider(String str, Context context) throws RuntimeException {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, "appContext");
        SecureKeyModel secureKeyModel = new SecureKeyModel();
        deleteAsymmetricKey(str);
        PublicKey generatePublicKey = super.generatePublicKey(str, false, context);
        if (generatePublicKey != null) {
            byte[] encoded = generatePublicKey.getEncoded();
            C19383o.m32796f(encoded, "publicKey.encoded");
            String base64AndUrlSafeEncodedStringFromBytes = base64AndUrlSafeEncodedStringFromBytes(encoded);
            String str2 = TAG;
            Log.d(str2, "Encoded public key string: " + base64AndUrlSafeEncodedStringFromBytes);
            Log.d(str2, "keystore provider:" + "EC");
            secureKeyModel.setKeyStoreProvider("EC");
            secureKeyModel.setPublicKey(base64AndUrlSafeEncodedStringFromBytes);
        }
        return secureKeyModel;
    }

    @TargetApi(18)
    public PublicKey generatePublicKey(String str, boolean z, Context context) {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, "appContext");
        return super.generatePublicKey(str, z, context);
    }

    @TargetApi(18)
    public final Signature generateSignatureForRSA(String str) {
        C19383o.m32797g(str, "privateKeyAlias");
        try {
            KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            Key key = instance.getKey(str, (char[]) null);
            if (key != null) {
                Signature instance2 = Signature.getInstance(RSA_PKI_ALGORITHM);
                instance2.initSign((PrivateKey) key);
                return instance2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.PrivateKey");
        } catch (KeyStoreException e) {
            Log.e(TAG, "generateSignature : Exception in generateSignature", e);
            throw new RuntimeException(e);
        } catch (IOException e2) {
            Log.e(TAG, "generateSignature : Exception in generateSignature", e2);
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            Log.e(TAG, "generateSignature : Exception in generateSignature", e3);
            throw new RuntimeException(e3);
        } catch (CertificateException e4) {
            Log.e(TAG, "generateSignature : Exception in generateSignature", e4);
            throw new RuntimeException(e4);
        } catch (UnrecoverableEntryException e5) {
            Log.e(TAG, "generateSignature : Exception in generateSignature", e5);
            throw new RuntimeException(e5);
        } catch (InvalidKeyException e6) {
            Log.e(TAG, "generateSignature : Exception in generateSignature", e6);
            throw new RuntimeException(e6);
        }
    }
}
