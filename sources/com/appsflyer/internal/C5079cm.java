package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.cm */
public class C5079cm {
    public static void AFKeystoreWrapper(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
