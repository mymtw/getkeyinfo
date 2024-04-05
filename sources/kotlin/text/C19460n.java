package kotlin.text;

import android.support.p013v4.media.C0069a;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.text.n */
public class C19460n extends C19459m {
    /* renamed from: I1 */
    public static final String m33058I1(int i, String str) {
        C19383o.m32797g(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(i);
            C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(C0069a.m175f("Requested character count ", i, " is less than zero.").toString());
    }

    /* renamed from: J1 */
    public static final String m33059J1(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(C0069a.m175f("Requested character count ", i, " is less than zero.").toString());
    }
}
