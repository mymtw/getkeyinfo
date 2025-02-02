package com.fasterxml.jackson.databind.util;

import android.support.p013v4.media.C0072d;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

@Deprecated
public class ISO8601Utils {
    public static final int DEF_8601_LEN = 29;
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_Z);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[Catch:{ Exception -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019e A[Catch:{ Exception -> 0x01a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ Exception -> 0x01a6 }
            int r3 = r0 + 4
            int r0 = parseInt(r1, r0, r3)     // Catch:{ Exception -> 0x01a6 }
            r4 = 45
            boolean r5 = checkOffset(r1, r3, r4)     // Catch:{ Exception -> 0x01a6 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = parseInt(r1, r3, r5)     // Catch:{ Exception -> 0x01a6 }
            boolean r6 = checkOffset(r1, r5, r4)     // Catch:{ Exception -> 0x01a6 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch:{ Exception -> 0x01a6 }
            r7 = 84
            boolean r7 = checkOffset(r1, r6, r7)     // Catch:{ Exception -> 0x01a6 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ Exception -> 0x01a6 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x01a6 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ Exception -> 0x01a6 }
            r2.setIndex(r6)     // Catch:{ Exception -> 0x01a6 }
            java.util.Date r0 = r4.getTime()     // Catch:{ Exception -> 0x01a6 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r11 = 2
            if (r7 == 0) goto L_0x00c1
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = parseInt(r1, r6, r7)     // Catch:{ Exception -> 0x01a6 }
            r12 = 58
            boolean r13 = checkOffset(r1, r7, r12)     // Catch:{ Exception -> 0x01a6 }
            if (r13 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r13 = r7 + 2
            int r7 = parseInt(r1, r7, r13)     // Catch:{ Exception -> 0x01a6 }
            boolean r12 = checkOffset(r1, r13, r12)     // Catch:{ Exception -> 0x01a6 }
            if (r12 == 0) goto L_0x0070
            int r13 = r13 + 1
        L_0x0070:
            int r12 = r17.length()     // Catch:{ Exception -> 0x01a6 }
            if (r12 <= r13) goto L_0x00ba
            char r12 = r1.charAt(r13)     // Catch:{ Exception -> 0x01a6 }
            if (r12 == r10) goto L_0x00ba
            if (r12 == r9) goto L_0x00ba
            if (r12 == r4) goto L_0x00ba
            int r12 = r13 + 2
            int r13 = parseInt(r1, r13, r12)     // Catch:{ Exception -> 0x01a6 }
            r14 = 59
            if (r13 <= r14) goto L_0x0090
            r14 = 63
            if (r13 >= r14) goto L_0x0090
            r13 = 59
        L_0x0090:
            r14 = 46
            boolean r14 = checkOffset(r1, r12, r14)     // Catch:{ Exception -> 0x01a6 }
            if (r14 == 0) goto L_0x00b7
            int r12 = r12 + 1
            int r14 = r12 + 1
            int r14 = indexOfNonDigit(r1, r14)     // Catch:{ Exception -> 0x01a6 }
            int r15 = r12 + 3
            int r15 = java.lang.Math.min(r14, r15)     // Catch:{ Exception -> 0x01a6 }
            int r16 = parseInt(r1, r12, r15)     // Catch:{ Exception -> 0x01a6 }
            int r15 = r15 - r12
            if (r15 == r8) goto L_0x00b3
            if (r15 == r11) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            int r16 = r16 * 10
            goto L_0x00b5
        L_0x00b3:
            int r16 = r16 * 100
        L_0x00b5:
            r12 = r14
            goto L_0x00ca
        L_0x00b7:
            r16 = 0
            goto L_0x00ca
        L_0x00ba:
            r11 = 0
            r16 = r11
            r11 = r7
            r7 = r6
            r6 = r13
            goto L_0x00c6
        L_0x00c1:
            r7 = 0
            r11 = 0
            r12 = 0
            r16 = r12
        L_0x00c6:
            r13 = 0
            r12 = r6
            r6 = r7
            r7 = r11
        L_0x00ca:
            r11 = r16
            int r14 = r17.length()     // Catch:{ Exception -> 0x01a6 }
            if (r14 <= r12) goto L_0x019e
            char r14 = r1.charAt(r12)     // Catch:{ Exception -> 0x01a6 }
            if (r14 != r10) goto L_0x00dd
            java.util.TimeZone r4 = TIMEZONE_Z     // Catch:{ Exception -> 0x01a6 }
            int r12 = r12 + r8
            goto L_0x016d
        L_0x00dd:
            if (r14 == r9) goto L_0x00fe
            if (r14 != r4) goto L_0x00e2
            goto L_0x00fe
        L_0x00e2:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ Exception -> 0x01a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a6 }
            r3.<init>()     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ Exception -> 0x01a6 }
            r3.append(r14)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01a6 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01a6 }
            throw r0     // Catch:{ Exception -> 0x01a6 }
        L_0x00fe:
            java.lang.String r4 = r1.substring(r12)     // Catch:{ Exception -> 0x01a6 }
            int r9 = r4.length()     // Catch:{ Exception -> 0x01a6 }
            int r12 = r12 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ Exception -> 0x01a6 }
            if (r9 != 0) goto L_0x016b
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ Exception -> 0x01a6 }
            if (r9 == 0) goto L_0x0118
            goto L_0x016b
        L_0x0118:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a6 }
            r9.<init>()     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ Exception -> 0x01a6 }
            r9.append(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x01a6 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r10 = r9.getID()     // Catch:{ Exception -> 0x01a6 }
            boolean r14 = r10.equals(r4)     // Catch:{ Exception -> 0x01a6 }
            if (r14 != 0) goto L_0x0169
            java.lang.String r14 = ":"
            java.lang.String r15 = ""
            java.lang.String r10 = r10.replace(r14, r15)     // Catch:{ Exception -> 0x01a6 }
            boolean r10 = r10.equals(r4)     // Catch:{ Exception -> 0x01a6 }
            if (r10 == 0) goto L_0x0146
            goto L_0x0169
        L_0x0146:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ Exception -> 0x01a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a6 }
            r3.<init>()     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ Exception -> 0x01a6 }
            r3.append(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r4 = r9.getID()     // Catch:{ Exception -> 0x01a6 }
            r3.append(r4)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01a6 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01a6 }
            throw r0     // Catch:{ Exception -> 0x01a6 }
        L_0x0169:
            r4 = r9
            goto L_0x016d
        L_0x016b:
            java.util.TimeZone r4 = TIMEZONE_Z     // Catch:{ Exception -> 0x01a6 }
        L_0x016d:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x01a6 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x01a6 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ Exception -> 0x01a6 }
            r9.set(r8, r0)     // Catch:{ Exception -> 0x01a6 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ Exception -> 0x01a6 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ Exception -> 0x01a6 }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ Exception -> 0x01a6 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ Exception -> 0x01a6 }
            r0 = 13
            r9.set(r0, r13)     // Catch:{ Exception -> 0x01a6 }
            r0 = 14
            r9.set(r0, r11)     // Catch:{ Exception -> 0x01a6 }
            r2.setIndex(r12)     // Catch:{ Exception -> 0x01a6 }
            java.util.Date r0 = r9.getTime()     // Catch:{ Exception -> 0x01a6 }
            return r0
        L_0x019e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ Exception -> 0x01a6 }
            throw r0     // Catch:{ Exception -> 0x01a6 }
        L_0x01a6:
            r0 = move-exception
            if (r1 != 0) goto L_0x01ab
            r1 = 0
            goto L_0x01bf
        L_0x01ab:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01bf:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01cb
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01e5
        L_0x01cb:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01e5:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r5 = "Failed to parse date "
            java.lang.String r6 = ": "
            java.lang.String r1 = p003a2.C0015b.m90i(r5, r1, r6, r3)
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder h = C0072d.m201h("Invalid number: ");
                h.append(str.substring(i, i2));
                throw new NumberFormatException(h.toString());
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder h2 = C0072d.m201h("Invalid number: ");
                h2.append(str.substring(i, i2));
                throw new NumberFormatException(h2.toString());
            }
        }
        return -i3;
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_Z);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", new Object[]{Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))}));
        if (z) {
            sb.append(String.format(".%03d", new Object[]{Integer.valueOf(gregorianCalendar.get(14))}));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? '-' : '+');
            objArr[1] = Integer.valueOf(abs);
            objArr[2] = Integer.valueOf(abs2);
            sb.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
