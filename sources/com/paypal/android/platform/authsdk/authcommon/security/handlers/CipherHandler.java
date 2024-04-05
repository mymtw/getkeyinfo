package com.paypal.android.platform.authsdk.authcommon.security.handlers;

import android.util.Base64;
import com.paypal.android.platform.authsdk.authcommon.security.impls.AesCipher;
import com.paypal.android.platform.authsdk.authcommon.security.interfaces.ICipher;
import com.paypal.android.platform.authsdk.authcommon.security.utils.CryptoUtilsKt;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CipherHandler {
    private final ICipher cipher;

    public CipherHandler() {
        this((ICipher) null, 1, (DefaultConstructorMarker) null);
    }

    public CipherHandler(ICipher iCipher) {
        C19383o.m32797g(iCipher, "cipher");
        this.cipher = iCipher;
    }

    private final byte[] getDecryptionIv(String str) {
        if (str == null) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        int cipher_iv_size_in_bytes = CryptoUtilsKt.getCIPHER_IV_SIZE_IN_BYTES();
        byte[] bArr = new byte[cipher_iv_size_in_bytes];
        System.arraycopy(decode, 0, bArr, 0, cipher_iv_size_in_bytes);
        return bArr;
    }

    public final Cipher provideDecryptionCipher$auth_sdk_thirdPartyRelease(String str, String str2) throws RuntimeException {
        C19383o.m32797g(str, "encryptedData");
        C19383o.m32797g(str2, "keyName");
        try {
            Key key = new SecureKeyHandler().getKeyStoreInstance$auth_sdk_thirdPartyRelease().getKey(str2, (char[]) null);
            if (key != null) {
                Cipher cipher2 = this.cipher.getCipher();
                cipher2.init(2, (SecretKey) key, new IvParameterSpec(getDecryptionIv(str)));
                return cipher2;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.crypto.SecretKey");
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (UnrecoverableKeyException e3) {
            throw new RuntimeException(e3);
        } catch (InvalidAlgorithmParameterException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }

    public final Cipher provideEncryptionCipher$auth_sdk_thirdPartyRelease(String str, boolean z) throws RuntimeException {
        C19383o.m32797g(str, "keyName");
        new SecureKeyHandler().createKeyRemoveExistingIfPresent$auth_sdk_thirdPartyRelease(str, z);
        try {
            Key key = new SecureKeyHandler().getKeyStoreInstance$auth_sdk_thirdPartyRelease().getKey(str, (char[]) null);
            if (key != null) {
                Cipher cipher2 = this.cipher.getCipher();
                cipher2.init(1, (SecretKey) key);
                return cipher2;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.crypto.SecretKey");
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (UnrecoverableKeyException e3) {
            throw new RuntimeException(e3);
        } catch (InvalidKeyException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CipherHandler(ICipher iCipher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AesCipher() : iCipher);
    }
}
