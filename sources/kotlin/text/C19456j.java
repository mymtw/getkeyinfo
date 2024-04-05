package kotlin.text;

import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: kotlin.text.j */
public class C19456j extends C19455i {
    /* renamed from: S0 */
    public static final BigDecimal m33015S0(String str) {
        C19383o.m32797g(str, "<this>");
        try {
            if (C19452f.f43389a.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: T0 */
    public static final Integer m33016T0(String str) {
        boolean z;
        int i;
        C19383o.m32797g(str, "<this>");
        C17782b.m29844J(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            int i3 = -2147483647;
            int i4 = 1;
            if (C19383o.m32799i(charAt, 48) >= 0) {
                z = false;
                i4 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    i3 = Integer.MIN_VALUE;
                    z = true;
                } else if (charAt == '+') {
                    z = false;
                }
            }
            int i5 = -59652323;
            while (i4 < length) {
                int digit = Character.digit(str.charAt(i4), 10);
                if (digit >= 0 && ((i2 >= i5 || (i5 == -59652323 && i2 >= (i5 = i3 / 10))) && (i = i2 * 10) >= i3 + digit)) {
                    i2 = i - digit;
                    i4++;
                }
            }
            return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
        }
        return null;
    }

    /* renamed from: U0 */
    public static final Long m33017U0(String str) {
        String str2 = str;
        C19383o.m32797g(str2, "<this>");
        C17782b.m29844J(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str2.charAt(0);
            long j = -9223372036854775807L;
            boolean z = true;
            if (C19383o.m32799i(charAt, 48) >= 0) {
                z = false;
            } else if (length != 1) {
                if (charAt == '-') {
                    j = Long.MIN_VALUE;
                    i = 1;
                } else if (charAt == '+') {
                    z = false;
                    i = 1;
                }
            }
            long j2 = 0;
            long j3 = -256204778801521550L;
            while (i < length) {
                int digit = Character.digit(str2.charAt(i), 10);
                if (digit >= 0) {
                    if (j2 < j3) {
                        if (j3 == -256204778801521550L) {
                            j3 = j / ((long) 10);
                            if (j2 < j3) {
                            }
                        }
                    }
                    long j4 = j2 * ((long) 10);
                    long j5 = (long) digit;
                    if (j4 >= j + j5) {
                        j2 = j4 - j5;
                        i++;
                    }
                }
            }
            return z ? Long.valueOf(j2) : Long.valueOf(-j2);
        }
        return null;
    }
}
