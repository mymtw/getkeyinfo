package org.apache.commons.lang3.math;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtils {
    public static final Byte BYTE_MINUS_ONE = (byte) -1;
    public static final Byte BYTE_ONE = (byte) 1;
    public static final Byte BYTE_ZERO = (byte) 0;
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    public static final Double DOUBLE_ZERO = Double.valueOf(ShadowDrawableWrapper.COS_45);
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    public static final Integer INTEGER_MINUS_ONE = -1;
    public static final Integer INTEGER_ONE = 1;
    public static final Integer INTEGER_ZERO = 0;
    public static final Long LONG_MINUS_ONE = -1L;
    public static final Long LONG_ONE = 1L;
    public static final Long LONG_ZERO = 0L;
    public static final Short SHORT_MINUS_ONE = -1;
    public static final Short SHORT_ONE = 1;
    public static final Short SHORT_ZERO = 0;

    public static BigDecimal createBigDecimal(String str) {
        if (str == null) {
            return null;
        }
        if (!StringUtils.isBlank(str)) {
            return new BigDecimal(str);
        }
        throw new NumberFormatException("A blank string is not a valid number");
    }

    public static BigInteger createBigInteger(String str) {
        if (str == null) {
            return null;
        }
        return new BigInteger(str);
    }

    public static Double createDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static Float createFloat(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static Integer createInteger(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static Long createLong(String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:(1:41)|42|(1:47)(1:46)|48|(5:50|(3:52|(2:54|(2:56|(1:58)))|(2:74|75)(3:68|69|70))|76|77|(1:83))|84|85|(1:91)|92|93|94) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:107|108|109) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x016f, code lost:
        return createLong(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0174, code lost:
        return createBigInteger(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        if (r1 == 'l') goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014f, code lost:
        throw new java.lang.NumberFormatException(androidx.appcompat.widget.C0326j.m864i(r14, " is not a valid number."));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x0198 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x012b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0141 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Number createNumber(java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = org.apache.commons.lang3.StringUtils.isBlank(r14)
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "--"
            boolean r1 = r14.startsWith(r1)
            if (r1 == 0) goto L_0x0013
            return r0
        L_0x0013:
            java.lang.String r1 = "0x"
            boolean r1 = r14.startsWith(r1)
            if (r1 != 0) goto L_0x01b2
            java.lang.String r1 = "-0x"
            boolean r1 = r14.startsWith(r1)
            if (r1 != 0) goto L_0x01b2
            java.lang.String r1 = "0X"
            boolean r1 = r14.startsWith(r1)
            if (r1 != 0) goto L_0x01b2
            java.lang.String r1 = "-0X"
            boolean r1 = r14.startsWith(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x01b2
        L_0x0035:
            int r1 = r14.length()
            r2 = 1
            int r1 = r1 - r2
            char r1 = r14.charAt(r1)
            r3 = 46
            int r4 = r14.indexOf(r3)
            r5 = 101(0x65, float:1.42E-43)
            int r5 = r14.indexOf(r5)
            r6 = 69
            int r6 = r14.indexOf(r6)
            int r6 = r6 + r5
            int r6 = r6 + r2
            java.lang.String r5 = " is not a valid number."
            r7 = -1
            r8 = 0
            if (r4 <= r7) goto L_0x007f
            if (r6 <= r7) goto L_0x0074
            if (r6 < r4) goto L_0x006a
            int r9 = r14.length()
            if (r6 > r9) goto L_0x006a
            int r9 = r4 + 1
            java.lang.String r9 = r14.substring(r9, r6)
            goto L_0x007a
        L_0x006a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = androidx.appcompat.widget.C0326j.m864i(r14, r5)
            r0.<init>(r14)
            throw r0
        L_0x0074:
            int r9 = r4 + 1
            java.lang.String r9 = r14.substring(r9)
        L_0x007a:
            java.lang.String r4 = r14.substring(r8, r4)
            goto L_0x0098
        L_0x007f:
            if (r6 <= r7) goto L_0x0096
            int r4 = r14.length()
            if (r6 > r4) goto L_0x008c
            java.lang.String r4 = r14.substring(r8, r6)
            goto L_0x0097
        L_0x008c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = androidx.appcompat.widget.C0326j.m864i(r14, r5)
            r0.<init>(r14)
            throw r0
        L_0x0096:
            r4 = r14
        L_0x0097:
            r9 = r0
        L_0x0098:
            boolean r10 = java.lang.Character.isDigit(r1)
            r11 = 0
            r13 = 0
            if (r10 != 0) goto L_0x0150
            if (r1 == r3) goto L_0x0150
            if (r6 <= r7) goto L_0x00b6
            int r3 = r14.length()
            int r3 = r3 - r2
            if (r6 >= r3) goto L_0x00b6
            int r6 = r6 + r2
            int r0 = r14.length()
            int r0 = r0 - r2
            java.lang.String r0 = r14.substring(r6, r0)
        L_0x00b6:
            int r3 = r14.length()
            int r3 = r3 - r2
            java.lang.String r3 = r14.substring(r8, r3)
            boolean r4 = isAllZeros(r4)
            if (r4 == 0) goto L_0x00cd
            boolean r4 = isAllZeros(r0)
            if (r4 == 0) goto L_0x00cd
            r4 = r2
            goto L_0x00ce
        L_0x00cd:
            r4 = r8
        L_0x00ce:
            r6 = 68
            if (r1 == r6) goto L_0x012b
            r6 = 70
            if (r1 == r6) goto L_0x0116
            r6 = 76
            if (r1 == r6) goto L_0x00e6
            r6 = 100
            if (r1 == r6) goto L_0x012b
            r6 = 102(0x66, float:1.43E-43)
            if (r1 == r6) goto L_0x0116
            r4 = 108(0x6c, float:1.51E-43)
            if (r1 != r4) goto L_0x0146
        L_0x00e6:
            if (r9 != 0) goto L_0x010c
            if (r0 != 0) goto L_0x010c
            char r0 = r3.charAt(r8)
            r1 = 45
            if (r0 != r1) goto L_0x00fc
            java.lang.String r0 = r3.substring(r2)
            boolean r0 = isDigits(r0)
            if (r0 != 0) goto L_0x0102
        L_0x00fc:
            boolean r0 = isDigits(r3)
            if (r0 == 0) goto L_0x010c
        L_0x0102:
            java.lang.Long r14 = createLong(r3)     // Catch:{ NumberFormatException -> 0x0107 }
            return r14
        L_0x0107:
            java.math.BigInteger r14 = createBigInteger(r3)
            return r14
        L_0x010c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = androidx.appcompat.widget.C0326j.m864i(r14, r5)
            r0.<init>(r14)
            throw r0
        L_0x0116:
            java.lang.Float r0 = createFloat(r3)     // Catch:{ NumberFormatException -> 0x012b }
            boolean r1 = r0.isInfinite()     // Catch:{ NumberFormatException -> 0x012b }
            if (r1 != 0) goto L_0x012b
            float r1 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x012b }
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x012a
            if (r4 == 0) goto L_0x012b
        L_0x012a:
            return r0
        L_0x012b:
            java.lang.Double r0 = createDouble(r3)     // Catch:{ NumberFormatException -> 0x0141 }
            boolean r1 = r0.isInfinite()     // Catch:{ NumberFormatException -> 0x0141 }
            if (r1 != 0) goto L_0x0141
            float r1 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x0141 }
            double r1 = (double) r1
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0140
            if (r4 == 0) goto L_0x0141
        L_0x0140:
            return r0
        L_0x0141:
            java.math.BigDecimal r14 = createBigDecimal(r3)     // Catch:{ NumberFormatException -> 0x0146 }
            return r14
        L_0x0146:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = androidx.appcompat.widget.C0326j.m864i(r14, r5)
            r0.<init>(r14)
            throw r0
        L_0x0150:
            if (r6 <= r7) goto L_0x0162
            int r1 = r14.length()
            int r1 = r1 - r2
            if (r6 >= r1) goto L_0x0162
            int r6 = r6 + r2
            int r0 = r14.length()
            java.lang.String r0 = r14.substring(r6, r0)
        L_0x0162:
            if (r9 != 0) goto L_0x0175
            if (r0 != 0) goto L_0x0175
            java.lang.Integer r14 = createInteger(r14)     // Catch:{ NumberFormatException -> 0x016b }
            return r14
        L_0x016b:
            java.lang.Long r14 = createLong(r14)     // Catch:{ NumberFormatException -> 0x0170 }
            return r14
        L_0x0170:
            java.math.BigInteger r14 = createBigInteger(r14)
            return r14
        L_0x0175:
            boolean r1 = isAllZeros(r4)
            if (r1 == 0) goto L_0x0182
            boolean r0 = isAllZeros(r0)
            if (r0 == 0) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r2 = r8
        L_0x0183:
            java.lang.Float r0 = createFloat(r14)     // Catch:{ NumberFormatException -> 0x0198 }
            boolean r1 = r0.isInfinite()     // Catch:{ NumberFormatException -> 0x0198 }
            if (r1 != 0) goto L_0x0198
            float r1 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x0198 }
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0197
            if (r2 == 0) goto L_0x0198
        L_0x0197:
            return r0
        L_0x0198:
            java.lang.Double r0 = createDouble(r14)     // Catch:{ NumberFormatException -> 0x01ad }
            boolean r1 = r0.isInfinite()     // Catch:{ NumberFormatException -> 0x01ad }
            if (r1 != 0) goto L_0x01ad
            double r3 = r0.doubleValue()     // Catch:{ NumberFormatException -> 0x01ad }
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x01ac
            if (r2 == 0) goto L_0x01ad
        L_0x01ac:
            return r0
        L_0x01ad:
            java.math.BigDecimal r14 = createBigDecimal(r14)
            return r14
        L_0x01b2:
            java.lang.Integer r14 = createInteger(r14)
            return r14
        L_0x01b7:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = "A blank string is not a valid number"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.math.NumberUtils.createNumber(java.lang.String):java.lang.Number");
    }

    private static boolean isAllZeros(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return str.length() > 0;
    }

    public static boolean isDigits(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        if (r3 >= r0.length) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        r0 = r0[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        if (r0 < '0') goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006d, code lost:
        if (r0 > '9') goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        if (r0 == 'e') goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0072, code lost:
        if (r0 != 'E') goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0075, code lost:
        if (r0 != '.') goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0077, code lost:
        if (r13 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        if (r12 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
        if (r6 != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0082, code lost:
        if (r0 == 'd') goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0086, code lost:
        if (r0 == 'D') goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0088, code lost:
        if (r0 == 'f') goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x008c, code lost:
        if (r0 != 'F') goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x008e, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0091, code lost:
        if (r0 == 'l') goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0095, code lost:
        if (r0 != 'L') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0098, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0099, code lost:
        if (r11 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x009b, code lost:
        if (r12 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x009d, code lost:
        if (r13 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00a1, code lost:
        if (r6 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00a3, code lost:
        if (r11 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isNumber(java.lang.String r16) {
        /*
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r16)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            char[] r0 = r16.toCharArray()
            int r2 = r0.length
            char r3 = r0[r1]
            r4 = 45
            r5 = 1
            if (r3 != r4) goto L_0x0016
            r3 = r5
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            int r6 = r3 + 1
            r7 = 70
            r8 = 102(0x66, float:1.43E-43)
            r9 = 57
            r10 = 48
            if (r2 <= r6) goto L_0x004d
            char r11 = r0[r3]
            if (r11 != r10) goto L_0x004d
            char r6 = r0[r6]
            r11 = 120(0x78, float:1.68E-43)
            if (r6 != r11) goto L_0x004d
            int r3 = r3 + 2
            if (r3 != r2) goto L_0x0032
            return r1
        L_0x0032:
            int r2 = r0.length
            if (r3 >= r2) goto L_0x004c
            char r2 = r0[r3]
            if (r2 < r10) goto L_0x003b
            if (r2 <= r9) goto L_0x0048
        L_0x003b:
            r4 = 97
            if (r2 < r4) goto L_0x0041
            if (r2 <= r8) goto L_0x0048
        L_0x0041:
            r4 = 65
            if (r2 < r4) goto L_0x004b
            if (r2 <= r7) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x004b:
            return r1
        L_0x004c:
            return r5
        L_0x004d:
            int r2 = r2 + -1
            r6 = r1
            r11 = r6
            r12 = r11
            r13 = r12
        L_0x0053:
            r14 = 69
            r15 = 101(0x65, float:1.42E-43)
            r4 = 46
            if (r3 < r2) goto L_0x00a7
            int r7 = r2 + 1
            if (r3 >= r7) goto L_0x0066
            if (r6 == 0) goto L_0x0066
            if (r11 != 0) goto L_0x0066
            r7 = 70
            goto L_0x00a7
        L_0x0066:
            int r2 = r0.length
            if (r3 >= r2) goto L_0x00a1
            char r0 = r0[r3]
            if (r0 < r10) goto L_0x0070
            if (r0 > r9) goto L_0x0070
            return r5
        L_0x0070:
            if (r0 == r15) goto L_0x00a0
            if (r0 != r14) goto L_0x0075
            goto L_0x00a0
        L_0x0075:
            if (r0 != r4) goto L_0x007e
            if (r13 != 0) goto L_0x007d
            if (r12 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            return r11
        L_0x007d:
            return r1
        L_0x007e:
            if (r6 != 0) goto L_0x008f
            r2 = 100
            if (r0 == r2) goto L_0x008e
            r2 = 68
            if (r0 == r2) goto L_0x008e
            if (r0 == r8) goto L_0x008e
            r7 = 70
            if (r0 != r7) goto L_0x008f
        L_0x008e:
            return r11
        L_0x008f:
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == r2) goto L_0x0099
            r2 = 76
            if (r0 != r2) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            return r1
        L_0x0099:
            if (r11 == 0) goto L_0x00a0
            if (r12 != 0) goto L_0x00a0
            if (r13 != 0) goto L_0x00a0
            r1 = r5
        L_0x00a0:
            return r1
        L_0x00a1:
            if (r6 != 0) goto L_0x00a6
            if (r11 == 0) goto L_0x00a6
            r1 = r5
        L_0x00a6:
            return r1
        L_0x00a7:
            char r5 = r0[r3]
            if (r5 < r10) goto L_0x00b2
            if (r5 > r9) goto L_0x00b2
            r6 = r1
            r4 = 45
            r11 = 1
            goto L_0x00df
        L_0x00b2:
            if (r5 != r4) goto L_0x00be
            if (r13 != 0) goto L_0x00bd
            if (r12 == 0) goto L_0x00b9
            goto L_0x00bd
        L_0x00b9:
            r4 = 45
            r13 = 1
            goto L_0x00df
        L_0x00bd:
            return r1
        L_0x00be:
            if (r5 == r15) goto L_0x00d5
            if (r5 != r14) goto L_0x00c3
            goto L_0x00d5
        L_0x00c3:
            r4 = 43
            if (r5 == r4) goto L_0x00cd
            r4 = 45
            if (r5 != r4) goto L_0x00cc
            goto L_0x00cf
        L_0x00cc:
            return r1
        L_0x00cd:
            r4 = 45
        L_0x00cf:
            if (r6 != 0) goto L_0x00d2
            return r1
        L_0x00d2:
            r6 = r1
            r11 = r6
            goto L_0x00df
        L_0x00d5:
            r4 = 45
            if (r12 == 0) goto L_0x00da
            return r1
        L_0x00da:
            if (r11 != 0) goto L_0x00dd
            return r1
        L_0x00dd:
            r6 = 1
            r12 = 1
        L_0x00df:
            int r3 = r3 + 1
            r5 = 1
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String):boolean");
    }

    public static byte max(byte b, byte b2, byte b3) {
        if (b2 > b) {
            b = b2;
        }
        return b3 > b ? b3 : b;
    }

    public static int max(int i, int i2, int i3) {
        if (i2 > i) {
            i = i2;
        }
        return i3 > i ? i3 : i;
    }

    public static long max(long j, long j2, long j3) {
        if (j2 > j) {
            j = j2;
        }
        return j3 > j ? j3 : j;
    }

    public static long max(long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (jArr.length != 0) {
            long j = jArr[0];
            for (int i = 1; i < jArr.length; i++) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
            }
            return j;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static short max(short s, short s2, short s3) {
        if (s2 > s) {
            s = s2;
        }
        return s3 > s ? s3 : s;
    }

    public static byte min(byte b, byte b2, byte b3) {
        if (b2 < b) {
            b = b2;
        }
        return b3 < b ? b3 : b;
    }

    public static int min(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        return i3 < i ? i3 : i;
    }

    public static long min(long j, long j2, long j3) {
        if (j2 < j) {
            j = j2;
        }
        return j3 < j ? j3 : j;
    }

    public static long min(long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (jArr.length != 0) {
            long j = jArr[0];
            for (int i = 1; i < jArr.length; i++) {
                long j2 = jArr[i];
                if (j2 < j) {
                    j = j2;
                }
            }
            return j;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static short min(short s, short s2, short s3) {
        if (s2 < s) {
            s = s2;
        }
        return s3 < s ? s3 : s;
    }

    public static byte toByte(String str) {
        return toByte(str, (byte) 0);
    }

    public static double toDouble(String str) {
        return toDouble(str, ShadowDrawableWrapper.COS_45);
    }

    public static float toFloat(String str) {
        return toFloat(str, 0.0f);
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }

    public static long toLong(String str) {
        return toLong(str, 0);
    }

    public static short toShort(String str) {
        return toShort(str, 0);
    }

    public static byte toByte(String str, byte b) {
        if (str == null) {
            return b;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static double toDouble(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static float toFloat(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int toInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long toLong(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static short toShort(String str, short s) {
        if (str == null) {
            return s;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    public static int max(int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (iArr.length != 0) {
            int i = iArr[0];
            for (int i2 = 1; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 > i) {
                    i = i3;
                }
            }
            return i;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static int min(int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (iArr.length != 0) {
            int i = iArr[0];
            for (int i2 = 1; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 < i) {
                    i = i3;
                }
            }
            return i;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static short max(short[] sArr) {
        if (sArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (sArr.length != 0) {
            short s = sArr[0];
            for (int i = 1; i < sArr.length; i++) {
                short s2 = sArr[i];
                if (s2 > s) {
                    s = s2;
                }
            }
            return s;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static short min(short[] sArr) {
        if (sArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (sArr.length != 0) {
            short s = sArr[0];
            for (int i = 1; i < sArr.length; i++) {
                short s2 = sArr[i];
                if (s2 < s) {
                    s = s2;
                }
            }
            return s;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static byte max(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (bArr.length != 0) {
            byte b = bArr[0];
            for (int i = 1; i < bArr.length; i++) {
                byte b2 = bArr[i];
                if (b2 > b) {
                    b = b2;
                }
            }
            return b;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static byte min(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (bArr.length != 0) {
            byte b = bArr[0];
            for (int i = 1; i < bArr.length; i++) {
                byte b2 = bArr[i];
                if (b2 < b) {
                    b = b2;
                }
            }
            return b;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static double max(double[] dArr) {
        if (dArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (dArr.length != 0) {
            double d = dArr[0];
            for (int i = 1; i < dArr.length; i++) {
                if (Double.isNaN(dArr[i])) {
                    return Double.NaN;
                }
                double d2 = dArr[i];
                if (d2 > d) {
                    d = d2;
                }
            }
            return d;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static double min(double[] dArr) {
        if (dArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (dArr.length != 0) {
            double d = dArr[0];
            for (int i = 1; i < dArr.length; i++) {
                if (Double.isNaN(dArr[i])) {
                    return Double.NaN;
                }
                double d2 = dArr[i];
                if (d2 < d) {
                    d = d2;
                }
            }
            return d;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static float max(float[] fArr) {
        if (fArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (fArr.length != 0) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (Float.isNaN(fArr[i])) {
                    return Float.NaN;
                }
                float f2 = fArr[i];
                if (f2 > f) {
                    f = f2;
                }
            }
            return f;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static float min(float[] fArr) {
        if (fArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (fArr.length != 0) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (Float.isNaN(fArr[i])) {
                    return Float.NaN;
                }
                float f2 = fArr[i];
                if (f2 < f) {
                    f = f2;
                }
            }
            return f;
        } else {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static double max(double d, double d2, double d3) {
        return Math.max(Math.max(d, d2), d3);
    }

    public static double min(double d, double d2, double d3) {
        return Math.min(Math.min(d, d2), d3);
    }

    public static float max(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    public static float min(float f, float f2, float f3) {
        return Math.min(Math.min(f, f2), f3);
    }
}
