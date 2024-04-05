package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.C19438m;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0015b;
import p568fn.C17782b;
import p764pq.C20055g;
import p764pq.C20056h;
import p764pq.C20057i;

/* renamed from: kotlin.text.m */
public class C19459m extends C19457k {
    /* renamed from: A1 */
    public static final String m33028A1(CharSequence charSequence, C20057i iVar) {
        C19383o.m32797g(charSequence, "<this>");
        C19383o.m32797g(iVar, "range");
        return charSequence.subSequence(iVar.mo74309c().intValue(), iVar.mo74311g().intValue() + 1).toString();
    }

    /* renamed from: B1 */
    public static final String m33029B1(char c, String str, String str2) {
        C19383o.m32797g(str2, "missingDelimiterValue");
        int k1 = m33042k1(str, c, 0, false, 6);
        if (k1 == -1) {
            return str2;
        }
        String substring = str.substring(k1 + 1, str.length());
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: C1 */
    public static final String m33030C1(String str, String str2, String str3) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "delimiter");
        C19383o.m32797g(str3, "missingDelimiterValue");
        int l1 = m33043l1(str, str2, 0, false, 6);
        if (l1 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + l1, str.length());
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: D1 */
    public static final String m33031D1(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "missingDelimiterValue");
        int n1 = m33045n1(str, ClassUtils.PACKAGE_SEPARATOR_CHAR, 0, 6);
        if (n1 == -1) {
            return str2;
        }
        String substring = str.substring(n1 + 1, str.length());
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: E1 */
    public static final String m33032E1(String str, String str2, String str3) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str3, "missingDelimiterValue");
        int l1 = m33043l1(str, str2, 0, false, 6);
        if (l1 == -1) {
            return str3;
        }
        String substring = str.substring(0, l1);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: F1 */
    public static String m33033F1(String str, char c) {
        int k1 = m33042k1(str, c, 0, false, 6);
        if (k1 == -1) {
            return str;
        }
        String substring = str.substring(0, k1);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G1 */
    public static String m33034G1(String str) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str, "missingDelimiterValue");
        int n1 = m33045n1(str, ClassUtils.PACKAGE_SEPARATOR_CHAR, 0, 6);
        if (n1 == -1) {
            return str;
        }
        String substring = str.substring(0, n1);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H1 */
    public static final CharSequence m33035H1(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c0 = C17782b.m29863c0(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c0) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c0) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: e1 */
    public static final boolean m33036e1(CharSequence charSequence, String str, boolean z) {
        C19383o.m32797g(charSequence, "<this>");
        C19383o.m32797g(str, "other");
        return m33043l1(charSequence, str, 0, z, 2) >= 0;
    }

    /* renamed from: f1 */
    public static boolean m33037f1(CharSequence charSequence, char c) {
        C19383o.m32797g(charSequence, "<this>");
        return m33042k1(charSequence, c, 0, false, 2) >= 0;
    }

    /* renamed from: g1 */
    public static boolean m33038g1(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return C19457k.m33018V0((String) charSequence, str);
        }
        return m33049r1(charSequence, false, charSequence.length() - str.length(), str, 0, str.length());
    }

    /* renamed from: h1 */
    public static final int m33039h1(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: i1 */
    public static final int m33040i1(int i, CharSequence charSequence, String str, boolean z) {
        C19383o.m32797g(charSequence, "<this>");
        C19383o.m32797g(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m33041j1(charSequence, str, i, charSequence.length(), z, false);
    }

    /* renamed from: j1 */
    public static final int m33041j1(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C20055g gVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            gVar = new C20057i(i, i2);
        } else {
            int h1 = m33039h1(charSequence);
            if (i > h1) {
                i = h1;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            gVar = new C20055g(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = gVar.f44414b;
            int i4 = gVar.f44415c;
            int i5 = gVar.f44416d;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!m33049r1(charSequence2, z, 0, charSequence, i3, charSequence2.length())) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        return i3;
                    }
                }
            }
        } else {
            int i6 = gVar.f44414b;
            int i7 = gVar.f44415c;
            int i8 = gVar.f44416d;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!C19457k.m33021Y0(0, i6, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: k1 */
    public static int m33042k1(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C19383o.m32797g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m33044m1(i, charSequence, z, new char[]{c});
    }

    /* renamed from: l1 */
    public static /* synthetic */ int m33043l1(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m33040i1(i, charSequence, str, z);
    }

    /* renamed from: m1 */
    public static final int m33044m1(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        C19383o.m32797g(charSequence, "<this>");
        C19383o.m32797g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            C20056h l = new C20057i(i, m33039h1(charSequence)).iterator();
            while (l.f44419d) {
                int nextInt = l.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C17782b.m29856V(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C19318k.m32617i1(cArr), i);
    }

    /* renamed from: n1 */
    public static int m33045n1(CharSequence charSequence, char c, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            i = m33039h1(charSequence);
        }
        C19383o.m32797g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C19318k.m32617i1(cArr), i);
        }
        int h1 = m33039h1(charSequence);
        if (i > h1) {
            i = h1;
        }
        while (-1 < i) {
            char charAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z = false;
                    break;
                } else if (C17782b.m29856V(cArr[i3], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: o1 */
    public static int m33046o1(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m33039h1(charSequence);
        }
        int i3 = i;
        C19383o.m32797g(charSequence, "<this>");
        C19383o.m32797g(str, "string");
        return !(charSequence instanceof String) ? m33041j1(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* renamed from: p1 */
    public static final List<String> m33047p1(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "<this>");
        return C17782b.m29867g0(SequencesKt___SequencesKt.m32989t1(SequencesKt___SequencesKt.m32985p1(m33048q1(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new StringsKt__StringsKt$splitToSequence$1(charSequence))));
    }

    /* renamed from: q1 */
    public static C19447b m33048q1(CharSequence charSequence, String[] strArr, boolean z, int i) {
        m33053v1(i);
        return new C19447b(charSequence, 0, i, new StringsKt__StringsKt$rangesDelimitedBy$2(C19318k.m32599Q0(strArr), z));
    }

    /* renamed from: r1 */
    public static final boolean m33049r1(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        C19383o.m32797g(charSequence, "<this>");
        C19383o.m32797g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C17782b.m29856V(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s1 */
    public static final String m33050s1(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        if (!m33057z1(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: t1 */
    public static final String m33051t1(String str, String str2) {
        if (!m33038g1(str, str2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: u1 */
    public static final String m33052u1(String str) {
        if (str.length() < "]".length() + "[".length() || !m33057z1(str, "[") || !m33038g1(str, "]")) {
            return str;
        }
        String substring = str.substring("[".length(), str.length() - "]".length());
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: v1 */
    public static final void m33053v1(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0015b.m88g("Limit must be non-negative, but was ", i).toString());
        }
    }

    /* renamed from: w1 */
    public static final List m33054w1(int i, CharSequence charSequence, String str, boolean z) {
        m33053v1(i);
        int i2 = 0;
        int i1 = m33040i1(0, charSequence, str, z);
        if (i1 == -1 || i == 1) {
            return C17782b.m29864d0(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, i1).toString());
            i2 = str.length() + i1;
            if ((z2 && arrayList.size() == i - 1) || (i1 = m33040i1(i2, charSequence, str, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, i1).toString());
            i2 = str.length() + i1;
            break;
        } while ((i1 = m33040i1(i2, charSequence, str, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: x1 */
    public static List m33055x1(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C19383o.m32797g(charSequence, "<this>");
        if (cArr.length == 1) {
            return m33054w1(i, charSequence, String.valueOf(cArr[0]), false);
        }
        m33053v1(i);
        C19438m mVar = new C19438m(new C19447b(charSequence, 0, i, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, false)));
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(mVar));
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m33028A1(charSequence, (C20057i) it.next()));
        }
        return arrayList;
    }

    /* renamed from: y1 */
    public static List m33056y1(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C19383o.m32797g(charSequence, "<this>");
        boolean z = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                return m33054w1(i, charSequence, str, false);
            }
        }
        C19438m mVar = new C19438m(m33048q1(charSequence, strArr, false, i));
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(mVar));
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m33028A1(charSequence, (C20057i) it.next()));
        }
        return arrayList;
    }

    /* renamed from: z1 */
    public static boolean m33057z1(CharSequence charSequence, String str) {
        C19383o.m32797g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return C19457k.m33025c1((String) charSequence, str, false);
        }
        return m33049r1(charSequence, false, 0, str, 0, str.length());
    }
}
