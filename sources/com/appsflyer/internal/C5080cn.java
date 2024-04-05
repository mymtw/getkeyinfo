package com.appsflyer.internal;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.cn */
public final class C5080cn extends FilterInputStream {
    private static final int[] AFInAppEventParameterName = C5081co.values;
    private static final int[] AFInAppEventType = C5081co.valueOf;
    private static final byte[] AFKeystoreWrapper = C5081co.AFInAppEventType;
    private static final int[] valueOf = C5081co.AFKeystoreWrapper;
    private static final int[] values = C5081co.AFInAppEventParameterName;
    private final int[] AFLogger$LogLevel;
    private final int[] AFVersionDeclaration = new int[4];
    private final int AppsFlyer2dXConversionCallback;
    private final byte[][] getLevel;
    private final byte[] init = new byte[16];
    private int onAppOpenAttributionNative = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int onAttributionFailureNative = 16;
    private int onDeepLinkingNative = 16;
    private final byte[] onInstallConversionDataLoadedNative = new byte[16];

    public C5080cn(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.AppsFlyer2dXConversionCallback = i;
        this.AFLogger$LogLevel = C5081co.AFKeystoreWrapper(bArr, i);
        this.getLevel = AFInAppEventType(bArr2);
    }

    private static byte[][] AFInAppEventType(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 >= bArr3.length) {
                    break;
                }
                bArr2[i][bArr3[i2]] = (byte) i2;
                i2++;
            }
        }
        return bArr2;
    }

    private void valueOf(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.AFVersionDeclaration;
        char c = 1;
        byte b = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.AFLogger$LogLevel;
        iArr[0] = b ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i = 4;
        int i2 = 1;
        while (i2 < this.AppsFlyer2dXConversionCallback) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.AFVersionDeclaration;
            byte[][] bArr3 = this.getLevel;
            byte[] bArr4 = bArr3[0];
            int i3 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventParameterName;
            byte[] bArr5 = bArr3[c];
            int i4 = i3 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = values;
            byte[] bArr6 = bArr3[2];
            int i5 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i4;
            int[] iArr7 = AFInAppEventType;
            byte[] bArr7 = bArr3[3];
            int i6 = iArr7[iArr4[bArr7[0]] & 255] ^ i5;
            int[] iArr8 = this.AFLogger$LogLevel;
            int i7 = i6 ^ iArr8[i];
            int i8 = ((iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c]] >>> 24] ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c]] & 255]) ^ iArr8[i + 1];
            int i9 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i + 2];
            iArr4[0] = i7;
            iArr4[1] = i8;
            iArr4[2] = i9;
            iArr4[3] = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i + 3];
            i2++;
            i += 4;
            c = 1;
        }
        int[] iArr9 = this.AFLogger$LogLevel;
        int i10 = iArr9[i];
        byte[] bArr8 = AFKeystoreWrapper;
        int[] iArr10 = this.AFVersionDeclaration;
        byte[][] bArr9 = this.getLevel;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i10 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i10 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i10 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i10);
        int i11 = iArr9[i + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i11 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i11 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i11 >>> 8));
        bArr2[7] = (byte) (i11 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i12 = iArr9[i + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i12 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i12 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i12 >>> 8));
        bArr2[11] = (byte) (i12 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i13 = iArr9[i + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i13 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[15] = (byte) (i13 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    public final int available() throws IOException {
        AFInAppEventType();
        return this.onDeepLinkingNative - this.onAttributionFailureNative;
    }

    public final void close() throws IOException {
        super.close();
    }

    public final synchronized void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.onAttributionFailureNative;
        if (i >= this.onDeepLinkingNative) {
            return -1;
        }
        byte[] bArr = this.onInstallConversionDataLoadedNative;
        this.onAttributionFailureNative = i + 1;
        return bArr[i] & 255;
    }

    public final synchronized void reset() throws IOException {
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            AFInAppEventType();
            int i5 = this.onAttributionFailureNative;
            if (i5 < this.onDeepLinkingNative) {
                byte[] bArr2 = this.onInstallConversionDataLoadedNative;
                this.onAttributionFailureNative = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int AFInAppEventType() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.onAppOpenAttributionNative
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.onAppOpenAttributionNative = r0
        L_0x000f:
            int r0 = r7.onAttributionFailureNative
            r1 = 16
            if (r0 != r1) goto L_0x005e
            byte[] r0 = r7.init
            int r2 = r7.onAppOpenAttributionNative
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0058
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.init
            int r6 = 16 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x0052
            byte[] r0 = r7.init
            byte[] r2 = r7.onInstallConversionDataLoadedNative
            r7.valueOf(r0, r2)
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.onAppOpenAttributionNative = r0
            r7.onAttributionFailureNative = r4
            if (r0 >= 0) goto L_0x004f
            byte[] r0 = r7.onInstallConversionDataLoadedNative
            r2 = 15
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004f:
            r7.onDeepLinkingNative = r1
            goto L_0x005e
        L_0x0052:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005e:
            int r0 = r7.onDeepLinkingNative
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5080cn.AFInAppEventType():int");
    }
}
