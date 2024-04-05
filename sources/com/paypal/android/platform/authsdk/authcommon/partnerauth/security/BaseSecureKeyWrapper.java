package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.support.p013v4.media.C0070b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;

public abstract class BaseSecureKeyWrapper implements SecureKeyWrapper {
    private static final String AES_CBC_PKCS5_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM = "EC";
    private static final String ANDROID_KESTORE_BC_WORKARROUND = "AndroidKeyStoreBCWorkaround";
    public static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int CIPHER_IV_SIZE_IN_BYTES = 16;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EC_CURVE = "secp256r1";
    private static final String PKI_ALGORITHM = "SHA256withECDSA";
    public static final String RSA_ALGORITHM = "RSA";
    private static final String RSA_PKCS1_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final String TAG = "BaseSecureKeyWrapper";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String decryptDataUsingCipher(String str, Cipher cipher) {
            C19383o.m32797g(str, "encryptedData");
            C19383o.m32797g(cipher, "decryptionCipher");
            try {
                Log.d(BaseSecureKeyWrapper.TAG, "decryptData: base64EncryptedDataPrefixedByIv is : " + str);
                byte[] decode = Base64.decode(str, 0);
                int length = decode.length - 16;
                byte[] bArr = new byte[length];
                System.arraycopy(decode, 0, new byte[16], 0, 16);
                System.arraycopy(decode, 16, bArr, 0, length);
                byte[] doFinal = cipher.doFinal(bArr);
                C19383o.m32796f(doFinal, "decryptionCipher.doFinal(encryptedByteData)");
                String str2 = new String(doFinal, C19446a.f43373b);
                Log.d(BaseSecureKeyWrapper.TAG, "decryptData: Returning decrypted data : " + str2);
                return str2;
            } catch (IllegalBlockSizeException e) {
                Log.d(BaseSecureKeyWrapper.TAG, "decryptData: Exception", e);
                return null;
            } catch (BadPaddingException e2) {
                Log.d(BaseSecureKeyWrapper.TAG, "decryptData: Exception", e2);
                return null;
            }
        }

        public final String encryptDataUsingCipher(String str, Cipher cipher) {
            C19383o.m32797g(str, "data");
            C19383o.m32797g(cipher, "encryptionCipher");
            try {
                byte[] bytes = str.getBytes(C19446a.f43373b);
                C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] doFinal = cipher.doFinal(bytes);
                byte[] bArr = new byte[(doFinal.length + 16)];
                System.arraycopy(cipher.getIV(), 0, bArr, 0, 16);
                System.arraycopy(doFinal, 0, bArr, 16, doFinal.length);
                String encodeToString = Base64.encodeToString(bArr, 0);
                C19383o.m32796f(encodeToString, "{\n                val pl…64.DEFAULT)\n            }");
                return encodeToString;
            } catch (IllegalBlockSizeException e) {
                Log.d(BaseSecureKeyWrapper.TAG, "Error while encrypting data: Exception", e);
                throw new RuntimeException(e);
            } catch (BadPaddingException e2) {
                Log.d(BaseSecureKeyWrapper.TAG, "Error while encrypting data: Exception", e2);
                throw new RuntimeException(e2);
            }
        }

        public final byte[] getDecryptionIv(String str) {
            C19383o.m32797g(str, "base64EncryptedDataPrefixedByIv");
            byte[] decode = Base64.decode(str, 0);
            C0070b.m187j("getDecryptionIv: encryptedDataPrefixByIv is : ", Arrays.toString(decode), BaseSecureKeyWrapper.TAG);
            byte[] bArr = new byte[16];
            System.arraycopy(decode, 0, bArr, 0, 16);
            return bArr;
        }
    }

    private final PublicKey getPublicKey(String str) {
        try {
            return KeyFactory.getInstance(ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 9)));
        } catch (Exception e) {
            e.printStackTrace();
            C0070b.m187j("exception in generating public key ", e.getMessage(), TAG);
            return null;
        }
    }

    private final PublicKey getPublicKeyForEncryption(String str) {
        try {
            KeyStore instance = KeyStore.getInstance(ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            Certificate certificate = instance.getCertificate(str);
            if (certificate == null) {
                return null;
            }
            return certificate.getPublicKey();
        } catch (Exception e) {
            Log.d(TAG, "Exception in retrieving Public key", e);
            return null;
        }
    }

    private final void setLocale(Locale locale, Context context) {
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    @TargetApi(18)
    private final byte[] signDataUsingSignatureObject(Signature signature, byte[] bArr) {
        try {
            signature.update(bArr);
            byte[] sign = signature.sign();
            C19383o.m32796f(sign, "{\n            signature.…ignature.sign()\n        }");
            return sign;
        } catch (SignatureException e) {
            e.printStackTrace();
            Log.d(TAG, "signDataUsingSignatureObject : Exception in signDataUsingSignatureObject", e);
            throw new RuntimeException(e);
        }
    }

    public String base64AndUrlSafeEncodedStringFromBytes(byte[] bArr) {
        C19383o.m32797g(bArr, "data");
        byte[] encode = Base64.encode(bArr, 11);
        C19383o.m32796f(encode, "encodedData");
        String str = new String(encode, C19446a.f43373b);
        C0070b.m187j("Base64+URL Safe String: ", str, TAG);
        return str;
    }

    public String decryptString(String str, String str2) {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(str2, "value");
        try {
            Cipher instance = Cipher.getInstance(RSA_PKCS1_ALGORITHM);
            instance.init(2, getPrivateKey(str));
            byte[] doFinal = instance.doFinal(Base64.decode(str2, 0));
            if (doFinal == null) {
                return null;
            }
            return new String(doFinal, C19446a.f43373b);
        } catch (Exception unused) {
            return null;
        }
    }

    public String decryptStringUsingAES(SecretKey secretKey, String str) {
        C19383o.m32797g(secretKey, "secretKey");
        C19383o.m32797g(str, "value");
        try {
            Cipher instance = Cipher.getInstance(AES_CBC_PKCS5_ALGORITHM);
            Companion companion = Companion;
            instance.init(2, secretKey, new IvParameterSpec(companion.getDecryptionIv(str)));
            String decryptDataUsingCipher = companion.decryptDataUsingCipher(str, instance);
            C19383o.m32794d(decryptDataUsingCipher);
            return decryptDataUsingCipher;
        } catch (Exception e) {
            C0070b.m187j("Exception in creating cipher for decrypting String", e.getLocalizedMessage(), TAG);
            return null;
        }
    }

    @TargetApi(23)
    public void deleteAsymmetricKey(String str) {
        C19383o.m32797g(str, "key");
        try {
            KeyStore instance = KeyStore.getInstance(ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry(str);
        } catch (KeyStoreException e) {
            C0070b.m187j("Exception while deleting key", e.getMessage(), TAG);
        } catch (CertificateException e2) {
            C0070b.m187j("Exception while deleting key", e2.getMessage(), TAG);
        } catch (NoSuchAlgorithmException e3) {
            C0070b.m187j("Exception while deleting key", e3.getMessage(), TAG);
        } catch (IOException e4) {
            C0070b.m187j("Exception while deleting key", e4.getMessage(), TAG);
        }
    }

    public String encryptString(String str, String str2) {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(str2, "value");
        try {
            Cipher instance = Cipher.getInstance(RSA_PKCS1_ALGORITHM);
            instance.init(1, getPublicKeyForEncryption(str));
            byte[] bytes = str2.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            return Base64.encodeToString(instance.doFinal(bytes), 0);
        } catch (Exception e) {
            Log.d(TAG, "Exception in encrypting String", e);
            return null;
        }
    }

    public String encryptStringUsingAES(SecretKey secretKey, String str) {
        C19383o.m32797g(secretKey, "secretKey");
        C19383o.m32797g(str, "value");
        try {
            Cipher instance = Cipher.getInstance(AES_CBC_PKCS5_ALGORITHM);
            instance.init(1, secretKey);
            int length = instance.getIV().length;
            Log.d(TAG, "IV size : " + length);
            try {
                return Companion.encryptDataUsingCipher(str, instance);
            } catch (RuntimeException e) {
                Log.d(TAG, "Exception in encrypting String", e);
                return null;
            }
        } catch (Exception e2) {
            Log.d(TAG, "Exception in creating cipher for encrypting String", e2);
            return null;
        }
    }

    public SecretKey generateAESSecretKey() throws RuntimeException {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(new SecureRandom());
            SecretKey generateKey = instance.generateKey();
            C19383o.m32796f(generateKey, "{\n            kg = KeyGe…g.generateKey()\n        }");
            return generateKey;
        } catch (NoSuchAlgorithmException e) {
            Log.d(TAG, "Exception in generateAESSecretKey", e);
            throw new RuntimeException(e);
        }
    }

    @TargetApi(23)
    public PublicKey generatePublicKey(String str, boolean z, Context context) {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, "appContext");
        Locale.getDefault();
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(ALGORITHM, ANDROID_KEYSTORE);
            instance.initialize(new KeyGenParameterSpec.Builder(str, 4).setAlgorithmParameterSpec(new ECGenParameterSpec(EC_CURVE)).setDigests(new String[]{"SHA-256"}).setUserAuthenticationRequired(z).build());
            return instance.generateKeyPair().getPublic();
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "Exception in generateAsymmetricKeyPairAndGetPublicKey", e);
            throw new RuntimeException(e);
        } catch (NoSuchProviderException e2) {
            Log.e(TAG, "Exception in generateAsymmetricKeyPairAndGetPublicKey", e2);
            throw new RuntimeException(e2);
        } catch (InvalidAlgorithmParameterException e3) {
            Log.e(TAG, "Exception in generateAsymmetricKeyPairAndGetPublicKey", e3);
            throw new RuntimeException(e3);
        }
    }

    @TargetApi(23)
    public Signature generateSignature(String str) throws RuntimeException {
        C19383o.m32797g(str, "privateKeyAlias");
        try {
            return generateSignature(str, (String) null);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidKeyException) {
                return generateSignature(str, ANDROID_KESTORE_BC_WORKARROUND);
            }
            throw e;
        }
    }

    public final PrivateKey getPrivateKey(String str) {
        C19383o.m32797g(str, "keyName");
        try {
            KeyStore instance = KeyStore.getInstance(ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.Entry entry = instance.getEntry(str, (KeyStore.ProtectionParameter) null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            }
            Log.d(TAG, "Not an instance of a PrivateKeyEntry");
            return null;
        } catch (KeyStoreException e) {
            Log.d(TAG, "Exception in retrieving Private key", e);
            throw new RuntimeException(e);
        } catch (IOException e2) {
            Log.d(TAG, "Exception in retrieving Private key", e2);
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            Log.d(TAG, "Exception in retrieving Private key", e3);
            throw new RuntimeException(e3);
        } catch (CertificateException e4) {
            Log.d(TAG, "Exception in retrieving Private key", e4);
            throw new RuntimeException(e4);
        } catch (UnrecoverableEntryException e5) {
            Log.d(TAG, "Exception in retrieving Private key", e5);
            throw new RuntimeException(e5);
        }
    }

    public String signDataUsingSignatureObjectAndBase64Encode(Signature signature, String str) {
        C19383o.m32797g(signature, "signature");
        C19383o.m32797g(str, "data");
        byte[] bytes = str.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        String base64AndUrlSafeEncodedStringFromBytes = base64AndUrlSafeEncodedStringFromBytes(signDataUsingSignatureObject(signature, bytes));
        C0070b.m187j("encoded Signature String: ", base64AndUrlSafeEncodedStringFromBytes, TAG);
        return base64AndUrlSafeEncodedStringFromBytes;
    }

    public boolean verifySignatureUsingPublicKey(String str, byte[] bArr, String str2) {
        C19383o.m32797g(str, "publicKey");
        C19383o.m32797g(bArr, "data");
        C19383o.m32797g(str2, "signature");
        try {
            Signature instance = Signature.getInstance(PKI_ALGORITHM);
            C19383o.m32796f(instance, "getInstance(PKI_ALGORITHM)");
            Provider provider = instance.getProvider();
            Log.d(TAG, "s.getProvider(): " + provider);
            instance.initVerify(getPublicKey(str));
            instance.update(bArr);
            boolean verify = instance.verify(Base64.decode(str2, 11));
            Log.d(TAG, "isVerified: " + verify);
            Log.d(TAG, "signature verification result: " + verify);
            return verify;
        } catch (SignatureException e) {
            Log.d(TAG, "verifySignatureUsingPublicKey : Exception in verifySignatureUsingPublicKey", e);
            return false;
        } catch (NoSuchAlgorithmException e2) {
            Log.d(TAG, "verifySignatureUsingPublicKey : Exception in verifySignatureUsingPublicKey", e2);
            return false;
        } catch (InvalidKeyException e3) {
            Log.d(TAG, "verifySignatureUsingPublicKey : Exception in verifySignatureUsingPublicKey", e3);
            return false;
        }
    }

    @TargetApi(23)
    private final Signature generateSignature(String str, String str2) throws RuntimeException {
        Signature signature;
        try {
            KeyStore instance = KeyStore.getInstance(ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            PrivateKey privateKey = (PrivateKey) instance.getKey(str, (char[]) null);
            if (privateKey != null) {
                Log.d(TAG, "generateSignature : PrivateKey " + privateKey);
            } else {
                Log.d(TAG, "generateSignature : unable to generate Private key  ");
            }
            if (TextUtils.isEmpty(str2)) {
                signature = Signature.getInstance(PKI_ALGORITHM);
            } else {
                signature = Signature.getInstance(PKI_ALGORITHM, str2);
            }
            Signature signature2 = signature;
            if (signature2 != null) {
                Log.d(TAG, "generateSignature : Signature Object " + signature2);
                if (signature2.getProvider() != null) {
                    String name = signature2.getProvider().getName();
                    Log.d(TAG, "generateSignature : provider " + name);
                } else {
                    Log.d(TAG, "generateSignature : unable to find provider ");
                }
                String algorithm = signature2.getAlgorithm();
                Log.d(TAG, "generateSignature : Signature algorithm " + algorithm);
            } else {
                Log.d(TAG, "generateSignature : unable to generate signature ");
            }
            signature2.initSign(privateKey);
            return signature2;
        } catch (KeyStoreException e) {
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e);
            throw new RuntimeException(e);
        } catch (IOException e2) {
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e2);
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e3);
            throw new RuntimeException(e3);
        } catch (CertificateException e4) {
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e4);
            throw new RuntimeException(e4);
        } catch (UnrecoverableEntryException e5) {
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e5);
            throw new RuntimeException(e5);
        } catch (InvalidKeyException e6) {
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e6);
            throw new RuntimeException(e6);
        } catch (Exception e7) {
            if (C19383o.m32792b("android.security.keystore.UserNotAuthenticatedException", e7.getClass().getName())) {
                Log.d(TAG, "generateSignature : UserNotAuthenticatedException in generateSignature", e7);
                C19383o.m32794d((Object) null);
                return null;
            }
            Log.d(TAG, "generateSignature : Exception in generateSignature" + e7);
            throw new RuntimeException(e7);
        }
    }

    public PublicKey generatePublicKey(String str, Context context) throws RuntimeException {
        C19383o.m32797g(str, "keyName");
        C19383o.m32797g(context, "appContext");
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
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance(RSA_ALGORITHM, ANDROID_KEYSTORE);
            KeyPairGeneratorSpec.Builder serialNumber = new KeyPairGeneratorSpec.Builder(context).setAlias(str).setStartDate(time).setEndDate(time2).setSerialNumber(BigInteger.valueOf(1));
            instance2.initialize(serialNumber.setSubject(new X500Principal("CN=" + str)).build());
            PublicKey publicKey = instance2.generateKeyPair().getPublic();
            Log.d(TAG, "publicKey: " + publicKey);
            return publicKey;
        } catch (Exception e) {
            Log.e(TAG, "Exception in generatePublicKey", e);
            return null;
        }
    }
}
