package p658qn;

import android.support.p013v4.media.C0072d;
import java.util.TimeZone;

/* renamed from: qn.a */
public final class C18467a {

    /* renamed from: a */
    public static final TimeZone f40671a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m31164a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d0 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m31165b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r3 = r0 + 4
            int r0 = m31166c(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r4 = 45
            boolean r5 = m31164a(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m31166c(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r6 = m31164a(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m31166c(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r7 = 84
            boolean r7 = m31164a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r11 = 2
            if (r7 == 0) goto L_0x00d2
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m31166c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r12 = 58
            boolean r13 = m31164a(r1, r7, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r13 = r7 + 2
            int r7 = m31166c(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r12 = m31164a(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r12 == 0) goto L_0x0070
            int r13 = r13 + 1
        L_0x0070:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r12 <= r13) goto L_0x00cf
            char r12 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r12 == r10) goto L_0x00cf
            if (r12 == r9) goto L_0x00cf
            if (r12 == r4) goto L_0x00cf
            int r4 = r13 + 2
            int r12 = m31166c(r1, r13, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r13 = 59
            if (r12 <= r13) goto L_0x0090
            r13 = 63
            if (r12 >= r13) goto L_0x0090
            r12 = 59
        L_0x0090:
            r13 = 46
            boolean r13 = m31164a(r1, r4, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 == 0) goto L_0x00cd
            int r4 = r4 + 1
            int r13 = r4 + 1
        L_0x009c:
            int r14 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 >= r14) goto L_0x00b2
            char r14 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r15 = 48
            if (r14 < r15) goto L_0x00b6
            r15 = 57
            if (r14 <= r15) goto L_0x00af
            goto L_0x00b6
        L_0x00af:
            int r13 = r13 + 1
            goto L_0x009c
        L_0x00b2:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x00b6:
            int r14 = r4 + 3
            int r14 = java.lang.Math.min(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r15 = m31166c(r1, r4, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r14 = r14 - r4
            if (r14 == r8) goto L_0x00c9
            if (r14 == r11) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r15 = r15 * 10
            goto L_0x00cb
        L_0x00c9:
            int r15 = r15 * 100
        L_0x00cb:
            r4 = r13
            goto L_0x00db
        L_0x00cd:
            r15 = 0
            goto L_0x00db
        L_0x00cf:
            r4 = r6
            r6 = r13
            goto L_0x00d4
        L_0x00d2:
            r4 = 0
            r7 = 0
        L_0x00d4:
            r15 = 0
            r12 = 0
            r16 = r6
            r6 = r4
            r4 = r16
        L_0x00db:
            int r11 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r11 <= r4) goto L_0x01c8
            char r11 = r1.charAt(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r13 = 5
            if (r11 != r10) goto L_0x00ed
            java.util.TimeZone r9 = f40671a     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r4 = r4 + r8
            goto L_0x0197
        L_0x00ed:
            if (r11 == r9) goto L_0x0110
            r9 = 45
            if (r11 != r9) goto L_0x00f4
            goto L_0x0110
        L_0x00f4:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.append(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x0110:
            java.lang.String r9 = r1.substring(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r10 < r13) goto L_0x011b
            goto L_0x012c
        L_0x011b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x012c:
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r4 = r4 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r10 != 0) goto L_0x0195
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r10 == 0) goto L_0x0142
            goto L_0x0195
        L_0x0142:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r11 = "GMT"
            r10.append(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r11 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r13 = r11.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 != 0) goto L_0x0193
            java.lang.String r13 = ":"
            java.lang.String r14 = ""
            java.lang.String r11 = r11.replace(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r11 = r11.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r11 == 0) goto L_0x0170
            goto L_0x0193
        L_0x0170:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x0193:
            r9 = r10
            goto L_0x0197
        L_0x0195:
            java.util.TimeZone r9 = f40671a     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x0197:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10.<init>(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9 = 0
            r10.setLenient(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r3 = r3 - r8
            r0 = 2
            r10.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 5
            r10.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 11
            r10.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 12
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 13
            r10.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 14
            r10.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r2.setIndex(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            return r0
        L_0x01c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            if (r1 != 0) goto L_0x01d9
            r1 = 0
            goto L_0x01ed
        L_0x01d9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01ed:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01f9
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0213
        L_0x01f9:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0213:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r5 = "Failed to parse date ["
            java.lang.String r6 = "]: "
            java.lang.String r1 = p003a2.C0015b.m90i(r5, r1, r6, r3)
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p658qn.C18467a.m31165b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    public static int m31166c(String str, int i, int i2) throws NumberFormatException {
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
