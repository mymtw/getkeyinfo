package com.etsy.android.lib.util;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: com.etsy.android.lib.util.c0 */
public final class C8883c0 {
    /* renamed from: a */
    public static String m17315a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        return Base64.encodeToString(wrap.array(), 11);
    }

    /* renamed from: b */
    public static String m17316b(String str) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(String.valueOf(str).getBytes("UTF-8"));
        byte[] digest = instance.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
