package okhttp3;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: okhttp3.r */
public final class C20002r {

    /* renamed from: d */
    public static final Pattern f44258d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f44259e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f */
    public static final C20003a f44260f = new C20003a();

    /* renamed from: a */
    public final String f44261a;

    /* renamed from: b */
    public final String f44262b;

    /* renamed from: c */
    public final String[] f44263c;

    /* renamed from: okhttp3.r$a */
    public static final class C20003a {
        /* renamed from: a */
        public static C20002r m34243a(String str) {
            C19383o.m32797g(str, "$this$toMediaType");
            Matcher matcher = C20002r.f44258d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C19383o.m32796f(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                String g = C0087d.m237g(locale, "Locale.US", group, locale, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C19383o.m32796f(group2, "typeSubtype.group(2)");
                C19383o.m32796f(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = C20002r.f44259e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (C19457k.m33025c1(group4, "'", false) && C19457k.m33018V0(group4, "'") && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C19383o.m32796f(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder h = C0072d.m201h("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                        h.append(substring);
                        h.append("\" for: \"");
                        h.append(str);
                        h.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        throw new IllegalArgumentException(h.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new C20002r(str, g, (String[]) array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
        }

        /* renamed from: b */
        public static C20002r m34244b(String str) {
            C19383o.m32797g(str, "$this$toMediaTypeOrNull");
            try {
                return m34243a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public C20002r(String str, String str2, String[] strArr) {
        this.f44261a = str;
        this.f44262b = str2;
        this.f44263c = strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC, Splitter:B:11:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.charset.Charset mo72983a(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String[] r0 = r6.f44263c
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            pq.i r1 = new pq.i
            int r0 = r0.length
            int r0 = r0 + -1
            r2 = 0
            r1.<init>(r2, r0)
            r0 = 2
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r1, r0)
            int r1 = r0.f44414b
            int r2 = r0.f44415c
            int r0 = r0.f44416d
            if (r0 < 0) goto L_0x0020
            if (r1 > r2) goto L_0x0039
            goto L_0x0022
        L_0x0020:
            if (r1 < r2) goto L_0x0039
        L_0x0022:
            java.lang.String[] r3 = r6.f44263c
            r3 = r3[r1]
            r4 = 1
            java.lang.String r5 = "charset"
            boolean r3 = kotlin.text.C19457k.m33019W0(r3, r5, r4)
            if (r3 == 0) goto L_0x0035
            java.lang.String[] r0 = r6.f44263c
            int r1 = r1 + r4
            r0 = r0[r1]
            goto L_0x003a
        L_0x0035:
            if (r1 == r2) goto L_0x0039
            int r1 = r1 + r0
            goto L_0x0022
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch:{ IllegalArgumentException -> 0x0040 }
        L_0x0040:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C20002r.mo72983a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20002r) && C19383o.m32792b(((C20002r) obj).f44261a, this.f44261a);
    }

    public final int hashCode() {
        return this.f44261a.hashCode();
    }

    public final String toString() {
        return this.f44261a;
    }
}
