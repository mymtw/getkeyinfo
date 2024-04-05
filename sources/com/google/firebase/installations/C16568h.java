package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.h */
public final class C16568h {

    /* renamed from: a */
    public static final byte f36764a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f36765b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static String m27383a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & f36765b) | f36764a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
