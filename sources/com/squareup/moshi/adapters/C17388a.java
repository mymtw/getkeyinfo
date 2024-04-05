package com.squareup.moshi.adapters;

import android.support.p013v4.media.C0072d;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: com.squareup.moshi.adapters.a */
public final class C17388a {

    /* renamed from: a */
    public static final TimeZone f37950a = TimeZone.getTimeZone("GMT");

    /* renamed from: a */
    public static boolean m29131a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: b */
    public static String m29132b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f37950a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        m29133c(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m29133c(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m29133c(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m29133c(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        m29133c(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        m29133c(sb, gregorianCalendar.get(13), 2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        m29133c(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    /* renamed from: c */
    public static void m29133c(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x01ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a4 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x01ac }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m29134d(java.lang.String r17) {
        /*
            r1 = r17
            r0 = 4
            r2 = 0
            int r2 = m29135e(r1, r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r3 = 45
            boolean r4 = m29131a(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r4 == 0) goto L_0x0011
            r0 = 5
        L_0x0011:
            int r4 = r0 + 2
            int r0 = m29135e(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            boolean r5 = m29131a(r1, r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r5 == 0) goto L_0x001f
            int r4 = r4 + 1
        L_0x001f:
            int r5 = r4 + 2
            int r4 = m29135e(r1, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r6 = 84
            boolean r6 = m29131a(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r7 = 1
            if (r6 != 0) goto L_0x003f
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r8 > r5) goto L_0x003f
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            int r0 = r0 - r7
            r3.<init>(r2, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.util.Date r0 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            return r0
        L_0x003f:
            r8 = 43
            r9 = 90
            if (r6 == 0) goto L_0x00cb
            int r5 = r5 + 1
            int r6 = r5 + 2
            int r5 = m29135e(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r10 = 58
            boolean r11 = m29131a(r1, r6, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r11 == 0) goto L_0x0057
            int r6 = r6 + 1
        L_0x0057:
            int r11 = r6 + 2
            int r6 = m29135e(r1, r6, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            boolean r10 = m29131a(r1, r11, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r10 == 0) goto L_0x0065
            int r11 = r11 + 1
        L_0x0065:
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r10 <= r11) goto L_0x00c6
            char r10 = r1.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r10 == r9) goto L_0x00c6
            if (r10 == r8) goto L_0x00c6
            if (r10 == r3) goto L_0x00c6
            int r3 = r11 + 2
            int r10 = m29135e(r1, r11, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r11 = 59
            if (r10 <= r11) goto L_0x0084
            r12 = 63
            if (r10 >= r12) goto L_0x0084
            r10 = r11
        L_0x0084:
            r11 = 46
            boolean r11 = m29131a(r1, r3, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r11 == 0) goto L_0x00c4
            int r3 = r3 + 1
            int r11 = r3 + 1
        L_0x0090:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r11 >= r12) goto L_0x00a6
            char r12 = r1.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r13 = 48
            if (r12 < r13) goto L_0x00aa
            r13 = 57
            if (r12 <= r13) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            int r11 = r11 + 1
            goto L_0x0090
        L_0x00a6:
            int r11 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
        L_0x00aa:
            int r12 = r3 + 3
            int r12 = java.lang.Math.min(r11, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            int r13 = m29135e(r1, r3, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r12 = r12 - r3
            int r3 = 3 - r12
            double r7 = (double) r3     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            double r7 = java.lang.Math.pow(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            double r13 = (double) r13     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            double r7 = r7 * r13
            int r3 = (int) r7     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r7 = r3
            r3 = r11
            goto L_0x00d6
        L_0x00c4:
            r7 = 0
            goto L_0x00d6
        L_0x00c6:
            r3 = 0
            r7 = r6
            r6 = r5
            r5 = r11
            goto L_0x00ce
        L_0x00cb:
            r3 = 0
            r6 = 0
            r7 = 0
        L_0x00ce:
            r10 = 0
            r16 = r7
            r7 = r3
            r3 = r5
            r5 = r6
            r6 = r16
        L_0x00d6:
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r8 <= r3) goto L_0x01a4
            char r8 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r8 != r9) goto L_0x00e6
            java.util.TimeZone r3 = f37950a     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            goto L_0x0175
        L_0x00e6:
            r9 = 43
            if (r8 == r9) goto L_0x010b
            r9 = 45
            if (r8 != r9) goto L_0x00ef
            goto L_0x010b
        L_0x00ef:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r3 = "Invalid time zone indicator '"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r2.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
        L_0x010b:
            java.lang.String r3 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r8 = "+0000"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r8 != 0) goto L_0x0173
            java.lang.String r8 = "+00:00"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r8 == 0) goto L_0x0120
            goto L_0x0173
        L_0x0120:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r8.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r9 = "GMT"
            r8.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r8.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r3 = r8.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r9 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            boolean r11 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r11 != 0) goto L_0x0171
            java.lang.String r11 = ":"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.replace(r11, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            boolean r9 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            if (r9 == 0) goto L_0x014e
            goto L_0x0171
        L_0x014e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r2.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r3 = " given, resolves to "
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r3 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
        L_0x0171:
            r3 = r8
            goto L_0x0175
        L_0x0173:
            java.util.TimeZone r3 = f37950a     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
        L_0x0175:
            java.util.GregorianCalendar r8 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r8.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r3 = 0
            r8.setLenient(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r3 = 1
            r8.set(r3, r2)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            int r0 = r0 - r3
            r2 = 2
            r8.set(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0 = 5
            r8.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0 = 11
            r8.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0 = 12
            r8.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0 = 13
            r8.set(r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            r0 = 14
            r8.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.util.Date r0 = r8.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            return r0
        L_0x01a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            java.lang.String r2 = "No time zone indicator"
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ae, IllegalArgumentException -> 0x01ac }
        L_0x01ac:
            r0 = move-exception
            goto L_0x01af
        L_0x01ae:
            r0 = move-exception
        L_0x01af:
            com.squareup.moshi.JsonDataException r2 = new com.squareup.moshi.JsonDataException
            java.lang.String r3 = "Not an RFC 3339 date: "
            java.lang.String r1 = androidx.appcompat.widget.C0326j.m864i(r3, r1)
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.adapters.C17388a.m29134d(java.lang.String):java.util.Date");
    }

    /* renamed from: e */
    public static int m29135e(String str, int i, int i2) throws NumberFormatException {
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
}
