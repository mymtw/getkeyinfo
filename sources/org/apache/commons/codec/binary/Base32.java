package org.apache.commons.codec.binary;

import android.support.p013v4.media.C0069a;
import p010a9.C0048b;

public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
    private static final byte[] HEX_ENCODE_TABLE = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final int MASK_5BITS = 31;
    private long bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base32() {
        this(false);
    }

    public void decode(byte[] bArr, int i, int i2) {
        byte b;
        int i3 = i2;
        if (!this.eof) {
            boolean z = true;
            if (i3 < 0) {
                this.eof = true;
            }
            int i4 = 0;
            int i5 = i;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                int i6 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 == 61) {
                    this.eof = z;
                    break;
                }
                ensureBufferSize(this.decodeSize);
                if (b2 >= 0) {
                    byte[] bArr2 = this.decodeTable;
                    if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                        int i7 = (this.modulus + (z ? 1 : 0)) % 8;
                        this.modulus = i7;
                        long j = (this.bitWorkArea << 5) + ((long) b);
                        this.bitWorkArea = j;
                        if (i7 == 0) {
                            byte[] bArr3 = this.buffer;
                            int i8 = this.pos;
                            int i9 = i8 + 1;
                            bArr3[i8] = (byte) ((int) ((j >> 32) & 255));
                            int i10 = i9 + 1;
                            byte[] bArr4 = bArr3;
                            bArr4[i9] = (byte) ((int) ((j >> 24) & 255));
                            int i11 = i10 + 1;
                            bArr4[i10] = (byte) ((int) ((j >> 16) & 255));
                            int i12 = i11 + 1;
                            bArr4[i11] = (byte) ((int) ((j >> 8) & 255));
                            this.pos = i12 + 1;
                            bArr4[i12] = (byte) ((int) (j & 255));
                        }
                    }
                }
                i4++;
                i5 = i6;
                z = true;
            }
            if (this.eof && this.modulus >= 2) {
                ensureBufferSize(this.decodeSize);
                switch (this.modulus) {
                    case 2:
                        byte[] bArr5 = this.buffer;
                        int i13 = this.pos;
                        this.pos = i13 + 1;
                        bArr5[i13] = (byte) ((int) ((this.bitWorkArea >> 2) & 255));
                        return;
                    case 3:
                        byte[] bArr6 = this.buffer;
                        int i14 = this.pos;
                        this.pos = i14 + 1;
                        bArr6[i14] = (byte) ((int) ((this.bitWorkArea >> 7) & 255));
                        return;
                    case 4:
                        long j2 = this.bitWorkArea >> 4;
                        this.bitWorkArea = j2;
                        byte[] bArr7 = this.buffer;
                        int i15 = this.pos;
                        int i16 = i15 + 1;
                        bArr7[i15] = (byte) ((int) ((j2 >> 8) & 255));
                        this.pos = i16 + 1;
                        bArr7[i16] = (byte) ((int) (j2 & 255));
                        return;
                    case 5:
                        long j3 = this.bitWorkArea >> 1;
                        this.bitWorkArea = j3;
                        byte[] bArr8 = this.buffer;
                        int i17 = this.pos;
                        int i18 = i17 + 1;
                        bArr8[i17] = (byte) ((int) ((j3 >> 16) & 255));
                        int i19 = i18 + 1;
                        bArr8[i18] = (byte) ((int) ((j3 >> 8) & 255));
                        this.pos = i19 + 1;
                        bArr8[i19] = (byte) ((int) (j3 & 255));
                        return;
                    case 6:
                        long j4 = this.bitWorkArea >> 6;
                        this.bitWorkArea = j4;
                        byte[] bArr9 = this.buffer;
                        int i20 = this.pos;
                        int i21 = i20 + 1;
                        bArr9[i20] = (byte) ((int) ((j4 >> 16) & 255));
                        int i22 = i21 + 1;
                        bArr9[i21] = (byte) ((int) ((j4 >> 8) & 255));
                        this.pos = i22 + 1;
                        bArr9[i22] = (byte) ((int) (j4 & 255));
                        return;
                    case 7:
                        long j5 = this.bitWorkArea >> 3;
                        this.bitWorkArea = j5;
                        byte[] bArr10 = this.buffer;
                        int i23 = this.pos;
                        int i24 = i23 + 1;
                        bArr10[i23] = (byte) ((int) ((j5 >> 24) & 255));
                        int i25 = i24 + 1;
                        bArr10[i24] = (byte) ((int) ((j5 >> 16) & 255));
                        int i26 = i25 + 1;
                        bArr10[i25] = (byte) ((int) ((j5 >> 8) & 255));
                        this.pos = i26 + 1;
                        bArr10[i26] = (byte) ((int) (j5 & 255));
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void encode(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r0.eof
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            r2 = 0
            r3 = 1
            if (r1 >= 0) goto L_0x0185
            r0.eof = r3
            int r1 = r0.modulus
            if (r1 != 0) goto L_0x0018
            int r1 = r0.lineLength
            if (r1 != 0) goto L_0x0018
            return
        L_0x0018:
            int r1 = r0.encodeSize
            r0.ensureBufferSize(r1)
            int r1 = r0.pos
            int r4 = r0.modulus
            r5 = 3
            r6 = 2
            r7 = 61
            if (r4 == r3) goto L_0x012f
            r8 = 4
            if (r4 == r6) goto L_0x00e7
            if (r4 == r5) goto L_0x0094
            if (r4 == r8) goto L_0x0030
            goto L_0x0164
        L_0x0030:
            byte[] r3 = r0.buffer
            int r4 = r1 + 1
            byte[] r8 = r0.encodeTable
            long r9 = r0.bitWorkArea
            r11 = 27
            long r11 = r9 >> r11
            int r11 = (int) r11
            r11 = r11 & 31
            byte r11 = r8[r11]
            r3[r1] = r11
            int r11 = r4 + 1
            r12 = 22
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r8[r12]
            r3[r4] = r12
            int r4 = r11 + 1
            r12 = 17
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r8[r12]
            r3[r11] = r12
            int r11 = r4 + 1
            r12 = 12
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r8[r12]
            r3[r4] = r12
            int r4 = r11 + 1
            r12 = 7
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r8[r12]
            r3[r11] = r12
            int r11 = r4 + 1
            long r12 = r9 >> r6
            int r6 = (int) r12
            r6 = r6 & 31
            byte r6 = r8[r6]
            r3[r4] = r6
            int r4 = r11 + 1
            long r5 = r9 << r5
            int r5 = (int) r5
            r5 = r5 & 31
            byte r5 = r8[r5]
            r3[r11] = r5
            int r5 = r4 + 1
            r0.pos = r5
            r3[r4] = r7
            goto L_0x0164
        L_0x0094:
            byte[] r4 = r0.buffer
            int r5 = r1 + 1
            byte[] r6 = r0.encodeTable
            long r9 = r0.bitWorkArea
            r11 = 19
            long r11 = r9 >> r11
            int r11 = (int) r11
            r11 = r11 & 31
            byte r11 = r6[r11]
            r4[r1] = r11
            int r11 = r5 + 1
            r12 = 14
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r4[r5] = r12
            int r5 = r11 + 1
            r12 = 9
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r4[r11] = r12
            int r11 = r5 + 1
            long r12 = r9 >> r8
            int r8 = (int) r12
            r8 = r8 & 31
            byte r8 = r6[r8]
            r4[r5] = r8
            int r5 = r11 + 1
            long r8 = r9 << r3
            int r3 = (int) r8
            r3 = r3 & 31
            byte r3 = r6[r3]
            r4[r11] = r3
            int r3 = r5 + 1
            r4[r5] = r7
            int r5 = r3 + 1
            r4[r3] = r7
            int r3 = r5 + 1
            r0.pos = r3
            r4[r5] = r7
            goto L_0x0164
        L_0x00e7:
            byte[] r4 = r0.buffer
            int r5 = r1 + 1
            byte[] r6 = r0.encodeTable
            long r9 = r0.bitWorkArea
            r11 = 11
            long r11 = r9 >> r11
            int r11 = (int) r11
            r11 = r11 & 31
            byte r11 = r6[r11]
            r4[r1] = r11
            int r11 = r5 + 1
            r12 = 6
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r4[r5] = r12
            int r5 = r11 + 1
            long r12 = r9 >> r3
            int r3 = (int) r12
            r3 = r3 & 31
            byte r3 = r6[r3]
            r4[r11] = r3
            int r3 = r5 + 1
            long r8 = r9 << r8
            int r8 = (int) r8
            r8 = r8 & 31
            byte r6 = r6[r8]
            r4[r5] = r6
            int r5 = r3 + 1
            r4[r3] = r7
            int r3 = r5 + 1
            r4[r5] = r7
            int r5 = r3 + 1
            r4[r3] = r7
            int r3 = r5 + 1
            r0.pos = r3
            r4[r5] = r7
            goto L_0x0164
        L_0x012f:
            byte[] r3 = r0.buffer
            int r4 = r1 + 1
            byte[] r8 = r0.encodeTable
            long r9 = r0.bitWorkArea
            long r11 = r9 >> r5
            int r5 = (int) r11
            r5 = r5 & 31
            byte r5 = r8[r5]
            r3[r1] = r5
            int r5 = r4 + 1
            long r9 = r9 << r6
            int r6 = (int) r9
            r6 = r6 & 31
            byte r6 = r8[r6]
            r3[r4] = r6
            int r4 = r5 + 1
            r3[r5] = r7
            int r5 = r4 + 1
            r3[r4] = r7
            int r4 = r5 + 1
            r3[r5] = r7
            int r5 = r4 + 1
            r3[r4] = r7
            int r4 = r5 + 1
            r3[r5] = r7
            int r5 = r4 + 1
            r0.pos = r5
            r3[r4] = r7
        L_0x0164:
            int r3 = r0.currentLinePos
            int r4 = r0.pos
            int r1 = r4 - r1
            int r1 = r1 + r3
            r0.currentLinePos = r1
            int r3 = r0.lineLength
            if (r3 <= 0) goto L_0x0233
            if (r1 <= 0) goto L_0x0233
            byte[] r1 = r0.lineSeparator
            byte[] r3 = r0.buffer
            int r5 = r1.length
            java.lang.System.arraycopy(r1, r2, r3, r4, r5)
            int r1 = r0.pos
            byte[] r2 = r0.lineSeparator
            int r2 = r2.length
            int r1 = r1 + r2
            r0.pos = r1
            goto L_0x0233
        L_0x0185:
            r4 = r18
            r5 = r2
        L_0x0188:
            if (r5 >= r1) goto L_0x0233
            int r6 = r0.encodeSize
            r0.ensureBufferSize(r6)
            int r6 = r0.modulus
            int r6 = r6 + r3
            r7 = 5
            int r6 = r6 % r7
            r0.modulus = r6
            int r8 = r4 + 1
            byte r4 = r17[r4]
            if (r4 >= 0) goto L_0x019e
            int r4 = r4 + 256
        L_0x019e:
            long r9 = r0.bitWorkArea
            r11 = 8
            long r9 = r9 << r11
            long r12 = (long) r4
            long r9 = r9 + r12
            r0.bitWorkArea = r9
            if (r6 != 0) goto L_0x022e
            byte[] r4 = r0.buffer
            int r6 = r0.pos
            int r12 = r6 + 1
            byte[] r13 = r0.encodeTable
            r14 = 35
            long r14 = r9 >> r14
            int r14 = (int) r14
            r14 = r14 & 31
            byte r14 = r13[r14]
            r4[r6] = r14
            int r6 = r12 + 1
            r14 = 30
            long r14 = r9 >> r14
            int r14 = (int) r14
            r14 = r14 & 31
            byte r14 = r13[r14]
            r4[r12] = r14
            int r12 = r6 + 1
            r14 = 25
            long r14 = r9 >> r14
            int r14 = (int) r14
            r14 = r14 & 31
            byte r14 = r13[r14]
            r4[r6] = r14
            int r6 = r12 + 1
            r14 = 20
            long r14 = r9 >> r14
            int r14 = (int) r14
            r14 = r14 & 31
            byte r14 = r13[r14]
            r4[r12] = r14
            int r12 = r6 + 1
            r14 = 15
            long r14 = r9 >> r14
            int r14 = (int) r14
            r14 = r14 & 31
            byte r14 = r13[r14]
            r4[r6] = r14
            int r6 = r12 + 1
            r14 = 10
            long r14 = r9 >> r14
            int r14 = (int) r14
            r14 = r14 & 31
            byte r14 = r13[r14]
            r4[r12] = r14
            int r12 = r6 + 1
            long r14 = r9 >> r7
            int r7 = (int) r14
            r7 = r7 & 31
            byte r7 = r13[r7]
            r4[r6] = r7
            int r6 = r12 + 1
            r0.pos = r6
            int r7 = (int) r9
            r7 = r7 & 31
            byte r7 = r13[r7]
            r4[r12] = r7
            int r7 = r0.currentLinePos
            int r7 = r7 + r11
            r0.currentLinePos = r7
            int r9 = r0.lineLength
            if (r9 <= 0) goto L_0x022e
            if (r9 > r7) goto L_0x022e
            byte[] r7 = r0.lineSeparator
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r2, r4, r6, r9)
            int r4 = r0.pos
            byte[] r6 = r0.lineSeparator
            int r6 = r6.length
            int r4 = r4 + r6
            r0.pos = r4
            r0.currentLinePos = r2
        L_0x022e:
            int r5 = r5 + 1
            r4 = r8
            goto L_0x0188
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base32.encode(byte[], int, int):void");
    }

    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.decodeTable;
            return b < bArr.length && bArr[b] != -1;
        }
    }

    public Base32(boolean z) {
        this(0, (byte[]) null, z);
    }

    public Base32(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base32(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Base32(int i, byte[] bArr, boolean z) {
        super(5, 8, i, bArr == null ? 0 : bArr.length);
        if (z) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else if (bArr == null) {
            throw new IllegalArgumentException(C0069a.m175f("lineLength ", i, " > 0, but lineSeparator is null"));
        } else if (!containsAlphabetOrPad(bArr)) {
            this.encodeSize = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.lineSeparator = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            throw new IllegalArgumentException(C0048b.m163a("lineSeparator must not contain Base32 characters: [", StringUtils.newStringUtf8(bArr), "]"));
        }
        this.decodeSize = this.encodeSize - 1;
    }
}
