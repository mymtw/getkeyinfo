package com.fasterxml.jackson.core.p333io;

import java.math.BigDecimal;
import p010a9.C0048b;

/* renamed from: com.fasterxml.jackson.core.io.NumberInput */
public final class NumberInput {
    public static final long L_BILLION = 1000000000;
    public static final String MAX_LONG_STR = String.valueOf(Long.MAX_VALUE);
    public static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String NASTY_SMALL_DOUBLE = "2.2250738585072012e-308";

    private static NumberFormatException _badBD(String str) {
        return new NumberFormatException(C0048b.m163a("Value \"", str, "\" can not be represented as BigDecimal"));
    }

    public static boolean inLongRange(char[] cArr, int i, int i2, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        int i3 = 0;
        while (i3 < length) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt == 0) {
                i3++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static double parseAsDouble(String str, double d) {
        if (str == null) {
            return d;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return d;
        }
        try {
            return parseDouble(trim);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r5 = r5.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int parseAsInt(java.lang.String r5, int r6) {
        /*
            if (r5 != 0) goto L_0x0003
            return r6
        L_0x0003:
            java.lang.String r5 = r5.trim()
            int r0 = r5.length()
            if (r0 != 0) goto L_0x000e
            return r6
        L_0x000e:
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0028
            char r3 = r5.charAt(r1)
            r4 = 43
            if (r3 != r4) goto L_0x0023
            java.lang.String r5 = r5.substring(r2)
            int r0 = r5.length()
            goto L_0x0028
        L_0x0023:
            r4 = 45
            if (r3 != r4) goto L_0x0028
            r1 = r2
        L_0x0028:
            if (r1 >= r0) goto L_0x0041
            char r2 = r5.charAt(r1)
            r3 = 57
            if (r2 > r3) goto L_0x003a
            r3 = 48
            if (r2 >= r3) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003a:
            double r5 = parseDouble(r5)     // Catch:{ NumberFormatException -> 0x0040 }
            int r5 = (int) r5
            return r5
        L_0x0040:
            return r6
        L_0x0041:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0046 }
            return r5
        L_0x0046:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p333io.NumberInput.parseAsInt(java.lang.String, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r5 = r5.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long parseAsLong(java.lang.String r5, long r6) {
        /*
            if (r5 != 0) goto L_0x0003
            return r6
        L_0x0003:
            java.lang.String r5 = r5.trim()
            int r0 = r5.length()
            if (r0 != 0) goto L_0x000e
            return r6
        L_0x000e:
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0028
            char r3 = r5.charAt(r1)
            r4 = 43
            if (r3 != r4) goto L_0x0023
            java.lang.String r5 = r5.substring(r2)
            int r0 = r5.length()
            goto L_0x0028
        L_0x0023:
            r4 = 45
            if (r3 != r4) goto L_0x0028
            r1 = r2
        L_0x0028:
            if (r1 >= r0) goto L_0x0041
            char r2 = r5.charAt(r1)
            r3 = 57
            if (r2 > r3) goto L_0x003a
            r3 = 48
            if (r2 >= r3) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003a:
            double r5 = parseDouble(r5)     // Catch:{ NumberFormatException -> 0x0040 }
            long r5 = (long) r5
            return r5
        L_0x0040:
            return r6
        L_0x0041:
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0046 }
            return r5
        L_0x0046:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p333io.NumberInput.parseAsLong(java.lang.String, long):long");
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw _badBD(str);
        }
    }

    public static double parseDouble(String str) throws NumberFormatException {
        if (NASTY_SMALL_DOUBLE.equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return r0 + ((r2[r3] - '0') * 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        r0 = r0 + ((r2[r3] - '0') * com.etsy.android.lib.requests.EtsyRequest.DEFAULT_TIMEOUT);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100);
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int parseInt(char[] r2, int r3, int r4) {
        /*
            int r0 = r3 + r4
            int r0 = r0 + -1
            char r0 = r2[r0]
            int r0 = r0 + -48
            switch(r4) {
                case 2: goto L_0x005a;
                case 3: goto L_0x0050;
                case 4: goto L_0x0046;
                case 5: goto L_0x003c;
                case 6: goto L_0x0030;
                case 7: goto L_0x0024;
                case 8: goto L_0x0018;
                case 9: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0061
        L_0x000c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0018:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 10000000(0x989680, float:1.4012985E-38)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0024:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0030:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x003c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 10000
            int r0 = r0 + r3
            r3 = r4
        L_0x0046:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 1000
            int r0 = r0 + r3
            r3 = r4
        L_0x0050:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 100
            int r0 = r0 + r3
            r3 = r4
        L_0x005a:
            char r2 = r2[r3]
            int r2 = r2 + -48
            int r2 = r2 * 10
            int r0 = r0 + r2
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p333io.NumberInput.parseInt(char[], int, int):int");
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) parseInt(cArr, i, i3)) * L_BILLION) + ((long) parseInt(cArr, i + i3, 9));
    }

    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return (long) parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        int i = 0;
        while (i < length) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt == 0) {
                i++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2) throws NumberFormatException {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw _badBD(new String(cArr, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        return java.lang.Integer.parseInt(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int parseInt(java.lang.String r9) {
        /*
            r0 = 0
            char r1 = r9.charAt(r0)
            int r2 = r9.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L_0x000f
            r0 = r3
        L_0x000f:
            r4 = 10
            if (r0 == 0) goto L_0x0026
            if (r2 == r3) goto L_0x0021
            if (r2 <= r4) goto L_0x0018
            goto L_0x0021
        L_0x0018:
            r1 = 2
            char r3 = r9.charAt(r3)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x002f
        L_0x0021:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0026:
            r5 = 9
            if (r2 <= r5) goto L_0x002f
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x002f:
            r5 = 57
            if (r1 > r5) goto L_0x0084
            r6 = 48
            if (r1 >= r6) goto L_0x0038
            goto L_0x0084
        L_0x0038:
            int r1 = r1 - r6
            if (r3 >= r2) goto L_0x0080
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L_0x007b
            if (r3 >= r6) goto L_0x0046
            goto L_0x007b
        L_0x0046:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L_0x0080
            int r3 = r7 + 1
            char r7 = r9.charAt(r7)
            if (r7 > r5) goto L_0x0076
            if (r7 >= r6) goto L_0x0057
            goto L_0x0076
        L_0x0057:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L_0x0080
        L_0x005d:
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L_0x0071
            if (r3 >= r6) goto L_0x0068
            goto L_0x0071
        L_0x0068:
            int r1 = r1 * r4
            int r3 = r3 + -48
            int r1 = r1 + r3
            if (r7 < r2) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            r3 = r7
            goto L_0x005d
        L_0x0071:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0076:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x007b:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            int r1 = -r1
        L_0x0083:
            return r1
        L_0x0084:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p333io.NumberInput.parseInt(java.lang.String):int");
    }
}
