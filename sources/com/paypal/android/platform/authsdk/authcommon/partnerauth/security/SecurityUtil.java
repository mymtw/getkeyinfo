package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import android.support.p013v4.media.C0070b;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import p010a9.C0048b;

public final class SecurityUtil {
    public static final SecurityUtil INSTANCE = new SecurityUtil();
    private static final String TAG = "SecurityUtil";

    private SecurityUtil() {
    }

    private final String getNonce(int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        byte[] bytes = String.valueOf(new Random(16).nextInt()).getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        return C0326j.m864i(format, Base64.encodeToString(bytes, i));
    }

    public final String generateHmacSignatureForMessage(String str, String str2) {
        String str3;
        C19383o.m32797g(str, "message");
        C19383o.m32797g(str2, "keyString");
        try {
            Charset forName = Charset.forName("UTF-8");
            C19383o.m32796f(forName, "forName(charsetName)");
            byte[] bytes = str2.getBytes(forName);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(secretKeySpec);
            Charset forName2 = Charset.forName("UTF-8");
            C19383o.m32796f(forName2, "forName(charsetName)");
            byte[] bytes2 = str.getBytes(forName2);
            C19383o.m32796f(bytes2, "this as java.lang.String).getBytes(charset)");
            byte[] encode = Base64.encode(instance.doFinal(bytes2), 9);
            C19383o.m32796f(encode, "base64Bytes");
            str3 = new String(encode, C19446a.f43373b);
        } catch (InvalidKeyException e) {
            C0070b.m187j("Error generating HmacSignature ", e.getLocalizedMessage(), TAG);
        } catch (NoSuchAlgorithmException e2) {
            C0070b.m187j("Error generating HmacSignature ", e2.getLocalizedMessage(), TAG);
        } catch (UnsupportedEncodingException e3) {
            C0070b.m187j("Error generating HmacSignature ", e3.getLocalizedMessage(), TAG);
        }
        Log.d(TAG, "Key String:" + str2);
        Log.d(TAG, "Original Message: " + str);
        Log.d(TAG, "HMACSHA1 Base64 Digest - Signature: " + str3);
        return str3;
        str3 = null;
        Log.d(TAG, "Key String:" + str2);
        Log.d(TAG, "Original Message: " + str);
        Log.d(TAG, "HMACSHA1 Base64 Digest - Signature: " + str3);
        return str3;
    }

    public final String generateNonce(String str) {
        C19383o.m32797g(str, "verifier");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        byte[] bytes = String.valueOf(new Random(16).nextInt()).getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        return C0048b.m163a(format, str, Base64.encodeToString(bytes, 9));
    }

    public final String generateNonceWithNoWrap() {
        return getNonce(11);
    }

    public final String generateNonce() {
        return getNonce(9);
    }
}
