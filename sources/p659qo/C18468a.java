package p659qo;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import android.support.p013v4.media.C0070b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Locale;
import java.util.Objects;

/* renamed from: qo.a */
public abstract class C18468a {
    @TargetApi(23)
    /* renamed from: a */
    public static Signature m31167a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        try {
            KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            PrivateKey privateKey = (PrivateKey) instance.getKey(str, (char[]) null);
            if (privateKey != null) {
                str3 = "generateSignature : PrivateKey " + privateKey.toString();
            } else {
                str3 = "generateSignature : unable to generate Private key  ";
            }
            Log.d("BaseSecureKeyWrapper", str3);
            Signature instance2 = TextUtils.isEmpty(str2) ? Signature.getInstance("SHA256withECDSA") : Signature.getInstance("SHA256withECDSA", str2);
            if (instance2 != null) {
                Log.d("BaseSecureKeyWrapper", "generateSignature : Signature Object " + instance2.toString());
                if (instance2.getProvider() != null) {
                    str5 = "generateSignature : provider " + instance2.getProvider().getName();
                } else {
                    str5 = "generateSignature : unable to find provider ";
                }
                Log.d("BaseSecureKeyWrapper", str5);
                str4 = "generateSignature : Signature algorithm " + instance2.getAlgorithm();
            } else {
                str4 = "generateSignature : unable to generate signature ";
            }
            Log.d("BaseSecureKeyWrapper", str4);
            instance2.initSign(privateKey);
            return instance2;
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            Log.d("BaseSecureKeyWrapper", "generateSignature : Exception in generateSignature" + e);
            throw new RuntimeException(e);
        } catch (Exception e2) {
            if ("android.security.keystore.UserNotAuthenticatedException".equals(e2.getClass().getName())) {
                Log.d("BaseSecureKeyWrapper", "generateSignature : UserNotAuthenticatedException in generateSignature", e2);
                return null;
            }
            Log.d("BaseSecureKeyWrapper", "generateSignature : Exception in generateSignature" + e2);
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    public static String m31168b(byte[] bArr) {
        String str = new String(Base64.encode(bArr, 11));
        C0070b.m187j("Base64+URL Safe String: ", str, "BaseSecureKeyWrapper");
        return str;
    }

    /* renamed from: d */
    public static PrivateKey m31169d() {
        try {
            KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.Entry entry = instance.getEntry("CryptoKeyAlias", (KeyStore.ProtectionParameter) null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            }
            Log.d("BaseSecureKeyWrapper", "Not an instance of a PrivateKeyEntry");
            return null;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            Log.d("BaseSecureKeyWrapper", "Exception in retrieving Private key", e);
            throw new RuntimeException(e);
        }
    }

    @TargetApi(23)
    /* renamed from: c */
    public PublicKey mo69984c(String str) {
        Objects.requireNonNull(str);
        Locale.getDefault();
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.initialize(new KeyGenParameterSpec.Builder(str, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests(new String[]{"SHA-256"}).setUserAuthenticationRequired(false).build());
            return instance.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            Log.e("BaseSecureKeyWrapper", "Exception in generateAsymmetricKeyPairAndGetPublicKey", e);
            throw new RuntimeException(e);
        }
    }
}
