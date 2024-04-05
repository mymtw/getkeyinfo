package kotlin.text;

import java.util.Collection;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p568fn.C17782b;
import p764pq.C20056h;
import p764pq.C20057i;

/* renamed from: kotlin.text.k */
public class C19457k extends C19456j {
    /* renamed from: V0 */
    public static boolean m33018V0(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "suffix");
        return str.endsWith(str2);
    }

    /* renamed from: W0 */
    public static final boolean m33019W0(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: X0 */
    public static final boolean m33020X0(CharSequence charSequence) {
        boolean z;
        C19383o.m32797g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            C20057i iVar = new C20057i(0, charSequence.length() - 1);
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                C20056h l = iVar.iterator();
                while (true) {
                    if (l.f44419d) {
                        if (!C17782b.m29863c0(charSequence.charAt(l.nextInt()))) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y0 */
    public static final boolean m33021Y0(int i, int i2, int i3, String str, String str2, boolean z) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: Z0 */
    public static final String m33022Z0(int i, String str) {
        if (i >= 0) {
            if (i != 0) {
                if (i == 1) {
                    return str.toString();
                }
                int length = str.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(str.length() * i);
                        C20056h l = new C20057i(1, i).iterator();
                        while (l.f44419d) {
                            l.nextInt();
                            sb.append(str);
                        }
                        String sb2 = sb.toString();
                        C19383o.m32796f(sb2, "{\n                    va…tring()\n                }");
                        return sb2;
                    }
                    char charAt = str.charAt(0);
                    char[] cArr = new char[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        cArr[i2] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
    }

    /* renamed from: a1 */
    public static final String m33023a1(String str, String str2, String str3, boolean z) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "oldValue");
        C19383o.m32797g(str3, "newValue");
        int i = 0;
        int i1 = C19459m.m33040i1(0, str, str2, z);
        if (i1 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, i1);
                sb.append(str3);
                i = i1 + length;
                if (i1 >= str.length() || (i1 = C19459m.m33040i1(i1 + i2, str, str2, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C19383o.m32796f(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, i1);
                sb.append(str3);
                i = i1 + length;
                break;
            } while ((i1 = C19459m.m33040i1(i1 + i2, str, str2, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C19383o.m32796f(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b1 */
    public static final boolean m33024b1(String str, int i, String str2, boolean z) {
        C19383o.m32797g(str, "<this>");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m33021Y0(i, 0, str2.length(), str, str2, z);
    }

    /* renamed from: c1 */
    public static final boolean m33025c1(String str, String str2, boolean z) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "prefix");
        return !z ? str.startsWith(str2) : m33021Y0(0, 0, str2.length(), str, str2, z);
    }
}
