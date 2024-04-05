package com.google.zxing.oned;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p699vn.C18667b;

/* renamed from: com.google.zxing.oned.e */
public final class C16976e extends C16983l {
    /* renamed from: d */
    public static void m28492d(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: b */
    public final boolean[] mo60130b(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt = str.charAt(i2);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt == '@') {
                                    sb.append("%V");
                                } else if (charAt == '`') {
                                    sb.append("%W");
                                } else if (!(charAt == '-' || charAt == '.')) {
                                    if (charAt <= 26) {
                                        sb.append('$');
                                        sb.append((char) ((charAt - 1) + 65));
                                    } else if (charAt < ' ') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - 27) + 65));
                                    } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                        sb.append(JsonPointer.SEPARATOR);
                                        sb.append((char) ((charAt - '!') + 65));
                                    } else if (charAt <= '9') {
                                        sb.append((char) ((charAt - '0') + 48));
                                    } else if (charAt <= '?') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - ';') + 70));
                                    } else if (charAt <= 'Z') {
                                        sb.append((char) ((charAt - 'A') + 65));
                                    } else if (charAt <= '_') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - '[') + 75));
                                    } else if (charAt <= 'z') {
                                        sb.append('+');
                                        sb.append((char) ((charAt - 'a') + 65));
                                    } else if (charAt <= 127) {
                                        sb.append('%');
                                        sb.append((char) ((charAt - '{') + 80));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                                    }
                                }
                            }
                            sb.append(charAt);
                        } else {
                            sb.append("%U");
                        }
                    }
                    str = sb.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i3 = length + 25;
            for (int i4 = 0; i4 < length; i4++) {
                m28492d(C16975d.f37354c["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
                for (int i5 = 0; i5 < 9; i5++) {
                    i3 += iArr[i5];
                }
            }
            boolean[] zArr = new boolean[i3];
            m28492d(148, iArr);
            int a = C16983l.m28506a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int a2 = C16983l.m28506a(zArr, a, iArr2, false) + a;
            for (int i6 = 0; i6 < length; i6++) {
                m28492d(C16975d.f37354c["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
                int a3 = C16983l.m28506a(zArr, a2, iArr, true) + a2;
                a2 = C16983l.m28506a(zArr, a3, iArr2, false) + a3;
            }
            m28492d(148, iArr);
            C16983l.m28506a(zArr, a2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.mo4160f(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
