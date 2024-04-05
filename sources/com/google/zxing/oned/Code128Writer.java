package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p699vn.C18667b;

public final class Code128Writer extends C16983l {

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: d */
    public static CType m28487d(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (m28487d(r5 + 3, r0) == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        if (r10 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a5, code lost:
        if (r10 == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0037 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean[] mo60130b(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.length()
            if (r1 <= 0) goto L_0x0148
            r2 = 80
            if (r1 > r2) goto L_0x0148
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x002d
            char r4 = r0.charAt(r3)
            switch(r4) {
                case 241: goto L_0x001a;
                case 242: goto L_0x001a;
                case 243: goto L_0x001a;
                case 244: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L_0x001d
        L_0x001a:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x001d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Bad character in input: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x002d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 1
            r8 = r4
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0037:
            r9 = 103(0x67, float:1.44E-43)
            if (r5 >= r1) goto L_0x0104
            com.google.zxing.oned.Code128Writer$CType r10 = m28487d(r5, r0)
            com.google.zxing.oned.Code128Writer$CType r11 = com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT
            r12 = 96
            r13 = 32
            r14 = 100
            r15 = 101(0x65, float:1.42E-43)
            if (r10 != r11) goto L_0x004d
        L_0x004b:
            r12 = r14
            goto L_0x00a9
        L_0x004d:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.UNCODABLE
            if (r10 != r2) goto L_0x0063
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x004b
            char r2 = r0.charAt(r5)
            if (r2 < r13) goto L_0x0061
            if (r7 != r15) goto L_0x004b
            if (r2 >= r12) goto L_0x004b
        L_0x0061:
            r12 = r15
            goto L_0x00a9
        L_0x0063:
            r12 = 99
            if (r7 != r12) goto L_0x0068
            goto L_0x00a9
        L_0x0068:
            if (r7 != r14) goto L_0x0099
            com.google.zxing.oned.Code128Writer$CType r12 = com.google.zxing.oned.Code128Writer.CType.FNC_1
            if (r10 != r12) goto L_0x006f
            goto L_0x004b
        L_0x006f:
            int r10 = r5 + 2
            com.google.zxing.oned.Code128Writer$CType r10 = m28487d(r10, r0)
            if (r10 == r2) goto L_0x004b
            if (r10 != r11) goto L_0x007a
            goto L_0x004b
        L_0x007a:
            if (r10 != r12) goto L_0x0087
            int r2 = r5 + 3
            com.google.zxing.oned.Code128Writer$CType r2 = m28487d(r2, r0)
            com.google.zxing.oned.Code128Writer$CType r10 = com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS
            if (r2 != r10) goto L_0x004b
            goto L_0x00a7
        L_0x0087:
            int r2 = r5 + 4
        L_0x0089:
            com.google.zxing.oned.Code128Writer$CType r10 = m28487d(r2, r0)
            com.google.zxing.oned.Code128Writer$CType r11 = com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS
            if (r10 != r11) goto L_0x0094
            int r2 = r2 + 2
            goto L_0x0089
        L_0x0094:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT
            if (r10 != r2) goto L_0x00a7
            goto L_0x004b
        L_0x0099:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.FNC_1
            if (r10 != r2) goto L_0x00a3
            int r2 = r5 + 1
            com.google.zxing.oned.Code128Writer$CType r10 = m28487d(r2, r0)
        L_0x00a3:
            com.google.zxing.oned.Code128Writer$CType r2 = com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS
            if (r10 != r2) goto L_0x004b
        L_0x00a7:
            r12 = 99
        L_0x00a9:
            if (r12 != r7) goto L_0x00e6
            char r2 = r0.charAt(r5)
            switch(r2) {
                case 241: goto L_0x00bf;
                case 242: goto L_0x00bc;
                case 243: goto L_0x00b9;
                case 244: goto L_0x00b3;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            goto L_0x00c2
        L_0x00b3:
            if (r7 != r15) goto L_0x00b7
            r12 = r15
            goto L_0x00e4
        L_0x00b7:
            r12 = r14
            goto L_0x00e4
        L_0x00b9:
            r12 = 96
            goto L_0x00e4
        L_0x00bc:
            r12 = 97
            goto L_0x00e4
        L_0x00bf:
            r12 = 102(0x66, float:1.43E-43)
            goto L_0x00e4
        L_0x00c2:
            if (r7 == r14) goto L_0x00de
            if (r7 == r15) goto L_0x00d3
            int r2 = r5 + 2
            java.lang.String r2 = r0.substring(r5, r2)
            int r12 = java.lang.Integer.parseInt(r2)
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x00d3:
            char r2 = r0.charAt(r5)
            int r12 = r2 + -32
            if (r12 >= 0) goto L_0x00e4
            int r12 = r12 + 96
            goto L_0x00e4
        L_0x00de:
            char r2 = r0.charAt(r5)
            int r12 = r2 + -32
        L_0x00e4:
            int r5 = r5 + r4
            goto L_0x00f5
        L_0x00e6:
            if (r7 != 0) goto L_0x00f2
            if (r12 == r14) goto L_0x00ef
            if (r12 == r15) goto L_0x00f3
            r9 = 105(0x69, float:1.47E-43)
            goto L_0x00f3
        L_0x00ef:
            r9 = 104(0x68, float:1.46E-43)
            goto L_0x00f3
        L_0x00f2:
            r9 = r12
        L_0x00f3:
            r7 = r12
            r12 = r9
        L_0x00f5:
            int[][] r2 = com.google.zxing.oned.C16974c.f37353c
            r2 = r2[r12]
            r3.add(r2)
            int r12 = r12 * r8
            int r6 = r6 + r12
            if (r5 == 0) goto L_0x0037
            int r8 = r8 + 1
            goto L_0x0037
        L_0x0104:
            int r6 = r6 % r9
            int[][] r0 = com.google.zxing.oned.C16974c.f37353c
            r1 = r0[r6]
            r3.add(r1)
            r1 = 106(0x6a, float:1.49E-43)
            r0 = r0[r1]
            r3.add(r0)
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0118:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x012e
            java.lang.Object r2 = r0.next()
            int[] r2 = (int[]) r2
            int r5 = r2.length
            r6 = 0
        L_0x0126:
            if (r6 >= r5) goto L_0x0118
            r7 = r2[r6]
            int r1 = r1 + r7
            int r6 = r6 + 1
            goto L_0x0126
        L_0x012e:
            boolean[] r0 = new boolean[r1]
            java.util.Iterator r1 = r3.iterator()
            r2 = 0
        L_0x0135:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0147
            java.lang.Object r3 = r1.next()
            int[] r3 = (int[]) r3
            int r3 = com.google.zxing.oned.C16983l.m28506a(r0, r2, r3, r4)
            int r2 = r2 + r3
            goto L_0x0135
        L_0x0147:
            return r0
        L_0x0148:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Contents length should be between 1 and 80 characters, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.mo60130b(java.lang.String):boolean[]");
    }

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.mo4160f(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
