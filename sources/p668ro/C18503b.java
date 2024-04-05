package p668ro;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.layout.C0761x;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p010a9.C0048b;
import p659qo.C18469b;
import p676so.C18543b;

/* renamed from: ro.b */
public class C18503b {

    /* renamed from: a */
    public SharedPreferences f40744a;

    /* renamed from: b */
    public SharedPreferences.Editor f40745b;

    /* renamed from: c */
    public SharedPreferences f40746c = this.f40747d.getSharedPreferences("CryptoPref", 0);

    /* renamed from: d */
    public Context f40747d;

    public C18503b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f40747d = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f40744a = sharedPreferences;
        this.f40745b = sharedPreferences.edit();
    }

    /* renamed from: a */
    public static String m31214a(String str) {
        return C0048b.m163a(str, "_", "Encrypted");
    }

    /* renamed from: b */
    public final String mo70009b(String str) {
        if (this.f40744a.contains(m31214a(str))) {
            String string = this.f40744a.getString(m31214a(str), (String) null);
            if (string != null && !TextUtils.isEmpty(string)) {
                SharedPreferences sharedPreferences = this.f40746c;
                Context context = this.f40747d;
                if (C0761x.f1566j == null) {
                    C0761x.f1566j = new C18543b(sharedPreferences, context);
                }
                C18543b bVar = C0761x.f1566j;
                byte[] bArr = bVar.f40808b;
                C18469b bVar2 = bVar.f40807a;
                if (bArr != null && bArr.length > 0) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, 0, bArr.length, "AES");
                    bVar2.getClass();
                    try {
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        byte[] decode = Base64.decode(string, 0);
                        Log.d("CryptoSecureKeyWrapperImpl", "getDecryptionIv: encryptedDataPrefixByIv is : " + Arrays.toString(decode));
                        byte[] bArr2 = new byte[16];
                        System.arraycopy(decode, 0, bArr2, 0, 16);
                        instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        int length = instance.getIV().length;
                        try {
                            Log.e("CryptoSecureKeyWrapperImpl", "decryptData: base64EncryptedDataPrefixedByIv is : " + string);
                            byte[] decode2 = Base64.decode(string, 0);
                            int length2 = decode2.length - length;
                            byte[] bArr3 = new byte[length2];
                            System.arraycopy(decode2, 0, new byte[length], 0, length);
                            System.arraycopy(decode2, length, bArr3, 0, length2);
                            string = new String(instance.doFinal(bArr3));
                            Log.d("CryptoSecureKeyWrapperImpl", "decryptData: Returning decrypted data : " + string);
                        } catch (BadPaddingException | IllegalBlockSizeException e) {
                            Log.e("CryptoSecureKeyWrapperImpl", "decryptData: Exception", e);
                            return null;
                        }
                    } catch (Exception e2) {
                        StringBuilder h = C0072d.m201h("Exception in creating cipher for decrypting String: ");
                        h.append(e2.getLocalizedMessage());
                        Log.e("CryptoSecureKeyWrapperImpl", h.toString());
                        return null;
                    }
                }
            }
            return string;
        }
        String string2 = this.f40744a.getString(str, (String) null);
        if (string2 != null) {
            mo70010c(str, string2);
        }
        return string2;
    }

    /* renamed from: c */
    public final void mo70010c(String str, String str2) {
        String str3;
        SharedPreferences sharedPreferences = this.f40746c;
        Context context = this.f40747d;
        if (C0761x.f1566j == null) {
            C0761x.f1566j = new C18543b(sharedPreferences, context);
        }
        C18543b bVar = C0761x.f1566j;
        byte[] bArr = bVar.f40808b;
        C18469b bVar2 = bVar.f40807a;
        if (bArr != null && bArr.length > 0) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, 0, bArr.length, "AES");
            bVar2.getClass();
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, secretKeySpec);
                Log.d("CryptoSecureKeyWrapperImpl", "IV size : " + instance.getIV().length);
                try {
                    str2 = C18469b.m31171e(str2, instance);
                } catch (RuntimeException e) {
                    e = e;
                    str3 = "Exception in encrypting String";
                    Log.e("CryptoSecureKeyWrapperImpl", str3, e);
                    str2 = null;
                    this.f40745b.putString(m31214a(str), str2);
                    this.f40745b.commit();
                    this.f40745b.remove(str);
                }
            } catch (Exception e2) {
                e = e2;
                str3 = "Exception in creating cipher for encrypting String";
                Log.e("CryptoSecureKeyWrapperImpl", str3, e);
                str2 = null;
                this.f40745b.putString(m31214a(str), str2);
                this.f40745b.commit();
                this.f40745b.remove(str);
            }
        }
        this.f40745b.putString(m31214a(str), str2);
        this.f40745b.commit();
        this.f40745b.remove(str);
    }
}
