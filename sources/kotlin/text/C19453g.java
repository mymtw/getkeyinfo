package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlin.text.g */
public class C19453g extends C19382n {
    /* renamed from: Q0 */
    public static final String m33013Q0(String str) {
        int i;
        Comparable comparable;
        C19383o.m32797g(str, "<this>");
        List<String> p1 = C19459m.m33047p1(str);
        ArrayList arrayList = new ArrayList();
        for (T next : p1) {
            if (!C19457k.m33020X0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!C17782b.m29863c0(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (p1.size() * 0) + str.length();
        StringsKt__IndentKt$getIndentFunction$1 stringsKt__IndentKt$getIndentFunction$1 = StringsKt__IndentKt$getIndentFunction$1.INSTANCE;
        int Y = C17782b.m29859Y(p1);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : p1) {
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = (String) next2;
                if ((i == 0 || i == Y) && C19457k.m33020X0(str3)) {
                    str3 = null;
                } else {
                    String str4 = (String) stringsKt__IndentKt$getIndentFunction$1.invoke(C19460n.m33058I1(intValue, str3));
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        C19327t.m32642X0(arrayList3, sb, "\n", "", "", -1, "...", (C19857l) null);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m33014R0(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "|"
            boolean r1 = kotlin.text.C19457k.m33020X0(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00a5
            java.util.List r1 = kotlin.text.C19459m.m33047p1(r13)
            int r13 = r13.length()
            int r2 = r1.size()
            r3 = 0
            int r2 = r2 * r3
            int r2 = r2 + r13
            kotlin.text.StringsKt__IndentKt$getIndentFunction$1 r13 = kotlin.text.StringsKt__IndentKt$getIndentFunction$1.INSTANCE
            int r4 = p568fn.C17782b.m29859Y(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
            r6 = r3
        L_0x002e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            r9 = 0
            if (r6 < 0) goto L_0x008d
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L_0x0043
            if (r6 != r4) goto L_0x004a
        L_0x0043:
            boolean r6 = kotlin.text.C19457k.m33020X0(r7)
            if (r6 == 0) goto L_0x004a
            goto L_0x0086
        L_0x004a:
            int r6 = r7.length()
            r10 = r3
        L_0x004f:
            r11 = -1
            if (r10 >= r6) goto L_0x0062
            char r12 = r7.charAt(r10)
            boolean r12 = p568fn.C17782b.m29863c0(r12)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r10 = r10 + 1
            goto L_0x004f
        L_0x0062:
            r10 = r11
        L_0x0063:
            if (r10 != r11) goto L_0x0066
            goto L_0x007a
        L_0x0066:
            boolean r6 = kotlin.text.C19457k.m33024b1(r7, r10, r0, r3)
            if (r6 == 0) goto L_0x007a
            int r6 = r0.length()
            int r6 = r6 + r10
            java.lang.String r9 = r7.substring(r6)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r9, r6)
        L_0x007a:
            if (r9 == 0) goto L_0x0085
            java.lang.Object r6 = r13.invoke(r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0086
        L_0x0085:
            r9 = r7
        L_0x0086:
            if (r9 == 0) goto L_0x008b
            r5.add(r9)
        L_0x008b:
            r6 = r8
            goto L_0x002e
        L_0x008d:
            p568fn.C17782b.m29877o0()
            throw r9
        L_0x0091:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r2)
            java.lang.String r0 = "\n"
            kotlin.collections.C19327t.m32642X0(r5, r13, r0, "", "", -1, "...", (p753kq.C19857l) null)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.C19383o.m32796f(r13, r0)
            return r13
        L_0x00a5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C19453g.m33014R0(java.lang.String):java.lang.String");
    }
}
