package com.google.zxing.oned;

import com.fasterxml.jackson.core.JsonPointer;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: com.google.zxing.oned.b */
public final class C16973b extends C16983l {

    /* renamed from: b */
    public static final char[] f37349b;

    /* renamed from: c */
    public static final char[] f37350c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    public static final char[] f37351d = {JsonPointer.SEPARATOR, ':', '+', ClassUtils.PACKAGE_SEPARATOR_CHAR};

    /* renamed from: e */
    public static final char f37352e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f37349b = cArr;
        f37352e = cArr[0];
    }

    /* renamed from: b */
    public final boolean[] mo60130b(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f37352e;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f37349b;
            boolean u0 = C16972a.m28490u0(cArr, upperCase);
            boolean u02 = C16972a.m28490u0(cArr, upperCase2);
            char[] cArr2 = f37350c;
            boolean u03 = C16972a.m28490u0(cArr2, upperCase);
            boolean u04 = C16972a.m28490u0(cArr2, upperCase2);
            if (u0) {
                if (!u02) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (u03) {
                if (!u04) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (u02 || u04) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f37352e;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (C16972a.m28490u0(f37351d, str.charAt(i3))) {
                i2 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
            }
        }
        boolean[] zArr = new boolean[((str.length() - 1) + i2)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C16972a.f37347c;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i6]) {
                    i = C16972a.f37348d[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
