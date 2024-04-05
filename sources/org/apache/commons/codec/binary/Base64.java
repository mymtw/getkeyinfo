package org.apache.commons.codec.binary;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.apache.commons.codec.net.URLCodec;
import p010a9.C0048b;

public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    public static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, BaseNCodec.PAD_DEFAULT, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, URLCodec.ESCAPE_CHAR, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};
    private static final int MASK_6BITS = 63;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};
    private int bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b) {
        if (b != 61) {
            if (b >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b >= bArr.length || bArr[b] == -1) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = bitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    public void decode(byte[] bArr, int i, int i2) {
        byte b;
        if (!this.eof) {
            if (i2 < 0) {
                this.eof = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                ensureBufferSize(this.decodeSize);
                int i4 = i + 1;
                byte b2 = bArr[i];
                if (b2 == 61) {
                    this.eof = true;
                    break;
                }
                if (b2 >= 0) {
                    byte[] bArr2 = DECODE_TABLE;
                    if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                        int i5 = (this.modulus + 1) % 4;
                        this.modulus = i5;
                        int i6 = (this.bitWorkArea << 6) + b;
                        this.bitWorkArea = i6;
                        if (i5 == 0) {
                            byte[] bArr3 = this.buffer;
                            int i7 = this.pos;
                            int i8 = i7 + 1;
                            bArr3[i7] = (byte) ((i6 >> 16) & 255);
                            int i9 = i8 + 1;
                            bArr3[i8] = (byte) ((i6 >> 8) & 255);
                            this.pos = i9 + 1;
                            bArr3[i9] = (byte) (i6 & 255);
                        }
                    }
                }
                i3++;
                i = i4;
            }
            if (this.eof && this.modulus != 0) {
                ensureBufferSize(this.decodeSize);
                int i10 = this.modulus;
                if (i10 == 2) {
                    int i11 = this.bitWorkArea >> 4;
                    this.bitWorkArea = i11;
                    byte[] bArr4 = this.buffer;
                    int i12 = this.pos;
                    this.pos = i12 + 1;
                    bArr4[i12] = (byte) (i11 & 255);
                } else if (i10 == 3) {
                    int i13 = this.bitWorkArea >> 2;
                    this.bitWorkArea = i13;
                    byte[] bArr5 = this.buffer;
                    int i14 = this.pos;
                    int i15 = i14 + 1;
                    bArr5[i14] = (byte) ((i13 >> 8) & 255);
                    this.pos = i15 + 1;
                    bArr5[i15] = (byte) (i13 & 255);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void encode(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.eof
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r12 >= 0) goto L_0x00a0
            r9.eof = r1
            int r10 = r9.modulus
            if (r10 != 0) goto L_0x0014
            int r10 = r9.lineLength
            if (r10 != 0) goto L_0x0014
            return
        L_0x0014:
            int r10 = r9.encodeSize
            r9.ensureBufferSize(r10)
            int r10 = r9.pos
            int r11 = r9.modulus
            r12 = 61
            if (r11 == r1) goto L_0x0056
            r1 = 2
            if (r11 == r1) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            byte[] r11 = r9.buffer
            int r2 = r10 + 1
            byte[] r3 = r9.encodeTable
            int r4 = r9.bitWorkArea
            int r5 = r4 >> 10
            r5 = r5 & 63
            byte r5 = r3[r5]
            r11[r10] = r5
            int r5 = r2 + 1
            int r6 = r4 >> 4
            r6 = r6 & 63
            byte r6 = r3[r6]
            r11[r2] = r6
            int r2 = r5 + 1
            r9.pos = r2
            int r1 = r4 << 2
            r1 = r1 & 63
            byte r1 = r3[r1]
            r11[r5] = r1
            byte[] r1 = STANDARD_ENCODE_TABLE
            if (r3 != r1) goto L_0x0080
            int r1 = r2 + 1
            r9.pos = r1
            r11[r2] = r12
            goto L_0x0080
        L_0x0056:
            byte[] r11 = r9.buffer
            int r1 = r10 + 1
            byte[] r2 = r9.encodeTable
            int r3 = r9.bitWorkArea
            int r4 = r3 >> 2
            r4 = r4 & 63
            byte r4 = r2[r4]
            r11[r10] = r4
            int r4 = r1 + 1
            r9.pos = r4
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r3 = r2[r3]
            r11[r1] = r3
            byte[] r1 = STANDARD_ENCODE_TABLE
            if (r2 != r1) goto L_0x0080
            int r1 = r4 + 1
            r11[r4] = r12
            int r2 = r1 + 1
            r9.pos = r2
            r11[r1] = r12
        L_0x0080:
            int r11 = r9.currentLinePos
            int r12 = r9.pos
            int r10 = r12 - r10
            int r10 = r10 + r11
            r9.currentLinePos = r10
            int r11 = r9.lineLength
            if (r11 <= 0) goto L_0x010e
            if (r10 <= 0) goto L_0x010e
            byte[] r10 = r9.lineSeparator
            byte[] r11 = r9.buffer
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r0, r11, r12, r1)
            int r10 = r9.pos
            byte[] r11 = r9.lineSeparator
            int r11 = r11.length
            int r10 = r10 + r11
            r9.pos = r10
            goto L_0x010e
        L_0x00a0:
            r2 = r0
        L_0x00a1:
            if (r2 >= r12) goto L_0x010e
            int r3 = r9.encodeSize
            r9.ensureBufferSize(r3)
            int r3 = r9.modulus
            int r3 = r3 + r1
            int r3 = r3 % 3
            r9.modulus = r3
            int r4 = r11 + 1
            byte r11 = r10[r11]
            if (r11 >= 0) goto L_0x00b7
            int r11 = r11 + 256
        L_0x00b7:
            int r5 = r9.bitWorkArea
            int r5 = r5 << 8
            int r5 = r5 + r11
            r9.bitWorkArea = r5
            if (r3 != 0) goto L_0x010a
            byte[] r11 = r9.buffer
            int r3 = r9.pos
            int r6 = r3 + 1
            byte[] r7 = r9.encodeTable
            int r8 = r5 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r3] = r8
            int r3 = r6 + 1
            int r8 = r5 >> 12
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r6] = r8
            int r6 = r3 + 1
            int r8 = r5 >> 6
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r3] = r8
            int r3 = r6 + 1
            r9.pos = r3
            r5 = r5 & 63
            byte r5 = r7[r5]
            r11[r6] = r5
            int r5 = r9.currentLinePos
            int r5 = r5 + 4
            r9.currentLinePos = r5
            int r6 = r9.lineLength
            if (r6 <= 0) goto L_0x010a
            if (r6 > r5) goto L_0x010a
            byte[] r5 = r9.lineSeparator
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r11, r3, r6)
            int r11 = r9.pos
            byte[] r3 = r9.lineSeparator
            int r3 = r3.length
            int r11 = r11 + r3
            r9.pos = r11
            r9.currentLinePos = r0
        L_0x010a:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x00a1
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base64.encode(byte[], int, int):void");
    }

    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.decodeTable;
            return b < bArr.length && bArr[b] != -1;
        }
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !BaseNCodec.isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= ((long) i)) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Base64(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
        } else if (containsAlphabetOrPad(bArr)) {
            throw new IllegalArgumentException(C0048b.m163a("lineSeparator must not contain base64 characters: [", StringUtils.newStringUtf8(bArr), "]"));
        } else if (i > 0) {
            this.encodeSize = bArr.length + 4;
            byte[] bArr2 = new byte[bArr.length];
            this.lineSeparator = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }
}
