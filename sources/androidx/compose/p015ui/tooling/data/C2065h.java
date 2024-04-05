package androidx.compose.p015ui.tooling.data;

import android.support.p013v4.media.C0072d;
import androidx.compose.runtime.tooling.C1413a;
import androidx.compose.runtime.tooling.C1414b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19451e;
import kotlin.text.C19457k;
import kotlin.text.Regex;
import p174m0.C7289h;

/* renamed from: androidx.compose.ui.tooling.data.h */
public final class C2065h {

    /* renamed from: a */
    public static final C7289h f4671a = new C7289h(0, 0, 0, 0);

    /* renamed from: b */
    public static final Regex f4672b = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");

    /* renamed from: c */
    public static final Regex f4673c = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");

    /* renamed from: a */
    public static final Field m4491a(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        C19383o.m32796f(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (C19383o.m32792b(field.getName(), str)) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    /* renamed from: b */
    public static final C2060c m4492b(C1413a aVar) {
        C19383o.m32797g(aVar, "<this>");
        C1414b bVar = (C1414b) C19327t.m32639U0(aVar.mo5644e());
        return bVar != null ? m4493c(bVar, (C2066i) null) : C2059b.f4652h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:121|122|123) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0275, code lost:
        throw new androidx.compose.p015ui.tooling.data.ParseError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0342, code lost:
        r5 = -1;
        r1 = -1;
        r13 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0270 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0337 A[LOOP:0: B:3:0x002a->B:189:0x0337, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038b A[LOOP:4: B:205:0x0385->B:207:0x038b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0601 A[Catch:{ all -> 0x0613, all -> 0x06d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0367 A[EDGE_INSN: B:389:0x0367->B:203:0x0367 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0604 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0162 A[Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0167 A[Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p015ui.tooling.data.C2060c m4493c(androidx.compose.runtime.tooling.C1414b r29, androidx.compose.p015ui.tooling.data.C2066i r30) {
        /*
            r0 = r30
            java.lang.Object r1 = r29.getKey()
            java.lang.String r2 = r29.mo6102a()
            r5 = 0
            r6 = 0
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            if (r2 == 0) goto L_0x0364
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            kotlin.text.Regex r10 = f4672b
            r11 = 2
            kotlin.text.e r10 = kotlin.text.Regex.find$default(r10, r2, r6, r11, r5)
            r9.element = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r13 = r5
            r18 = r13
            r19 = r6
            r17 = -1
        L_0x002a:
            T r12 = r9.element
            if (r12 == 0) goto L_0x033e
            kotlin.text.e r12 = (kotlin.text.C19451e) r12
            boolean r14 = m4495e(r12)
            java.lang.String r15 = "@"
            if (r14 != 0) goto L_0x027a
            java.lang.String r14 = m4494d(r12)
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r14, r15)
            if (r14 == 0) goto L_0x0044
            goto L_0x027a
        L_0x0044:
            java.lang.String r14 = m4494d(r12)
            java.lang.String r15 = "C"
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r14, r15)
            if (r14 == 0) goto L_0x0054
            m4502l(r9)
            goto L_0x0073
        L_0x0054:
            kotlin.text.MatcherMatchResult$groups$1 r14 = r12.mo72022c()
            r15 = 6
            kotlin.text.d r14 = r14.mo72025c(r15)
            if (r14 == 0) goto L_0x0061
            r14 = 1
            goto L_0x0062
        L_0x0061:
            r14 = r6
        L_0x0062:
            if (r14 == 0) goto L_0x007b
            java.util.List r13 = r12.mo72020a()
            r14 = 8
            java.lang.Object r13 = r13.get(r14)
            java.lang.String r13 = (java.lang.String) r13
            m4502l(r9)
        L_0x0073:
            r20 = r1
            r6 = r11
            r5 = -1
            r19 = 1
            goto L_0x032e
        L_0x007b:
            kotlin.text.MatcherMatchResult$groups$1 r14 = r12.mo72022c()
            r15 = 5
            kotlin.text.d r14 = r14.mo72025c(r15)
            if (r14 == 0) goto L_0x0088
            r14 = 1
            goto L_0x0089
        L_0x0088:
            r14 = r6
        L_0x0089:
            java.lang.String r15 = ","
            if (r14 == 0) goto L_0x01c3
            java.lang.String r14 = m4494d(r12)
            java.lang.String r3 = ")"
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.text.Regex r4 = f4673c
            kotlin.text.e r4 = kotlin.text.Regex.find$default(r4, r14, r6, r11, r5)
            r7.element = r4
            r4 = 4
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r4[r6] = r14
            r14 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            r4[r14] = r16
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r4[r11] = r14
            r14 = 3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            r4[r14] = r16
            java.util.ArrayList r4 = p568fn.C17782b.m29866f0(r4)
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            int r16 = r4.size()
            r18 = -1
            int r11 = r16 + -1
            r14.element = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r6 = "P"
            m4497g(r7, r6)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            java.lang.String r6 = "("
            m4497g(r7, r6)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
        L_0x00df:
            boolean r6 = m4500j(r7, r3)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            if (r6 != 0) goto L_0x0185
            java.lang.String r6 = "!"
            boolean r6 = m4500j(r7, r6)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            if (r6 == 0) goto L_0x0133
            m4501k(r7)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            int r6 = m4499i(r7)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            int r16 = r11.size()     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            int r5 = r16 + r6
            m4496f(r14, r4, r5)     // Catch:{ ParseError -> 0x012f, NumberFormatException -> 0x012b }
            r5 = 0
        L_0x00fe:
            if (r5 >= r6) goto L_0x0126
            r16 = r6
            androidx.compose.ui.tooling.data.e r6 = new androidx.compose.ui.tooling.data.e     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            java.lang.Object r18 = kotlin.collections.C19327t.m32638T0(r4)     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            java.lang.Number r18 = (java.lang.Number) r18     // Catch:{ ParseError -> 0x01b6, NumberFormatException -> 0x01ae }
            r20 = r1
            int r1 = r18.intValue()     // Catch:{ ParseError -> 0x01b8, NumberFormatException -> 0x01b0 }
            r21 = r13
            r13 = 0
            r6.<init>(r1, r13)     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            r11.add(r6)     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            r1 = 0
            r4.remove(r1)     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            int r5 = r5 + 1
            r6 = r16
            r1 = r20
            r13 = r21
            goto L_0x00fe
        L_0x0126:
            r20 = r1
            r21 = r13
            goto L_0x0140
        L_0x012b:
            r20 = r1
            goto L_0x01b0
        L_0x012f:
            r20 = r1
            goto L_0x01b8
        L_0x0133:
            r20 = r1
            r21 = r13
            boolean r1 = m4500j(r7, r15)     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            if (r1 == 0) goto L_0x0142
            m4501k(r7)     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
        L_0x0140:
            r6 = 2
            goto L_0x017a
        L_0x0142:
            int r1 = m4499i(r7)     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            T r5 = r7.element     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            kotlin.text.e r5 = (kotlin.text.C19451e) r5     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            if (r5 == 0) goto L_0x015e
            kotlin.text.MatcherMatchResult$groups$1 r5 = r5.mo72022c()     // Catch:{ ParseError -> 0x0183, NumberFormatException -> 0x0181 }
            r6 = 2
            kotlin.text.d r5 = r5.mo72025c(r6)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            if (r5 == 0) goto L_0x0159
            r5 = 1
            goto L_0x015a
        L_0x0159:
            r5 = 0
        L_0x015a:
            if (r5 == 0) goto L_0x015f
            r5 = 1
            goto L_0x0160
        L_0x015e:
            r6 = 2
        L_0x015f:
            r5 = 0
        L_0x0160:
            if (r5 == 0) goto L_0x0167
            java.lang.String r5 = m4498h(r7)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            goto L_0x0168
        L_0x0167:
            r5 = 0
        L_0x0168:
            androidx.compose.ui.tooling.data.e r13 = new androidx.compose.ui.tooling.data.e     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            r13.<init>(r1, r5)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            r11.add(r13)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            m4496f(r14, r4, r1)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            r4.remove(r1)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
        L_0x017a:
            r1 = r20
            r13 = r21
            r5 = 0
            goto L_0x00df
        L_0x0181:
            r6 = 2
            goto L_0x01b3
        L_0x0183:
            r6 = 2
            goto L_0x01bb
        L_0x0185:
            r20 = r1
            r21 = r13
            r6 = 2
            m4497g(r7, r3)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
        L_0x018d:
            int r1 = r4.size()     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            if (r1 <= 0) goto L_0x01ab
            androidx.compose.ui.tooling.data.e r1 = new androidx.compose.ui.tooling.data.e     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            java.lang.Object r3 = kotlin.collections.C19327t.m32638T0(r4)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            int r3 = r3.intValue()     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            r5 = 0
            r1.<init>(r3, r5)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            r11.add(r1)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            r1 = 0
            r4.remove(r1)     // Catch:{ ParseError -> 0x01bb, NumberFormatException -> 0x01b3 }
            goto L_0x018d
        L_0x01ab:
            r18 = r11
            goto L_0x01bf
        L_0x01ae:
            r20 = r1
        L_0x01b0:
            r21 = r13
            goto L_0x0181
        L_0x01b3:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x01bd
        L_0x01b6:
            r20 = r1
        L_0x01b8:
            r21 = r13
            goto L_0x0183
        L_0x01bb:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x01bd:
            r18 = r1
        L_0x01bf:
            m4502l(r9)
            goto L_0x01dd
        L_0x01c3:
            r20 = r1
            r6 = r11
            r21 = r13
            java.lang.String r1 = m4494d(r12)
            java.lang.String r3 = "*"
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x01e2
            int r1 = r10.size()
            m4502l(r9)
            r17 = r1
        L_0x01dd:
            r13 = r21
            r5 = -1
            goto L_0x032e
        L_0x01e2:
            java.lang.String r1 = m4494d(r12)
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r15)
            if (r1 == 0) goto L_0x01f2
            m4502l(r9)
            r5 = -1
            goto L_0x032c
        L_0x01f2:
            kotlin.text.MatcherMatchResult$groups$1 r1 = r12.mo72022c()
            r3 = 4
            kotlin.text.d r1 = r1.mo72025c(r3)
            if (r1 == 0) goto L_0x01ff
            r1 = 1
            goto L_0x0200
        L_0x01ff:
            r1 = 0
        L_0x0200:
            if (r1 == 0) goto L_0x0342
            pq.i r1 = r12.mo72021b()
            int r1 = r1.f44415c
            r3 = 1
            int r1 = r1 + r3
            java.lang.String r1 = r2.substring(r1)
            kotlin.jvm.internal.C19383o.m32796f(r1, r8)
            java.lang.String r2 = "#"
            r4 = 6
            r5 = 0
            int r2 = kotlin.text.C19459m.m33046o1(r1, r2, r5, r4)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            r5 = -1
            if (r2 != r5) goto L_0x0221
            java.lang.String r2 = ""
            goto L_0x022d
        L_0x0221:
            int r2 = r2 + r3
            int r3 = r1.length()
            java.lang.String r2 = r1.substring(r2, r3)
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
        L_0x022d:
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0235
            r3 = 1
            goto L_0x0236
        L_0x0235:
            r3 = 0
        L_0x0236:
            if (r3 == 0) goto L_0x0276
            int r3 = r1.length()
            int r6 = r2.length()
            int r3 = r3 - r6
            r6 = 1
            int r3 = r3 - r6
            r7 = 0
            pq.i r3 = kotlin.jvm.internal.C19388s.m32816D0(r7, r3)
            java.lang.String r7 = "range"
            kotlin.jvm.internal.C19383o.m32797g(r3, r7)
            java.lang.Integer r7 = r3.mo74309c()
            int r7 = r7.intValue()
            java.lang.Integer r3 = r3.mo74311g()
            int r3 = r3.intValue()
            int r3 = r3 + r6
            java.lang.String r13 = r1.substring(r7, r3)
            kotlin.jvm.internal.C19383o.m32796f(r13, r4)
            r1 = 36
            p568fn.C17782b.m29844J(r1)     // Catch:{ NumberFormatException -> 0x0270 }
            int r1 = java.lang.Integer.parseInt(r2, r1)     // Catch:{ NumberFormatException -> 0x0270 }
            goto L_0x0345
        L_0x0270:
            androidx.compose.ui.tooling.data.ParseError r1 = new androidx.compose.ui.tooling.data.ParseError     // Catch:{ NumberFormatException -> 0x0277 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x0277 }
            throw r1     // Catch:{ NumberFormatException -> 0x0277 }
        L_0x0276:
            r13 = r1
        L_0x0277:
            r1 = r5
            goto L_0x0345
        L_0x027a:
            r20 = r1
            r6 = r11
            r21 = r13
            r5 = -1
            T r1 = r9.element     // Catch:{ ParseError -> 0x0326 }
            kotlin.text.e r1 = (kotlin.text.C19451e) r1     // Catch:{ ParseError -> 0x0326 }
            if (r1 == 0) goto L_0x02ab
            boolean r3 = m4495e(r1)     // Catch:{ ParseError -> 0x0326 }
            if (r3 == 0) goto L_0x02ab
            java.util.List r1 = r1.mo72020a()     // Catch:{ ParseError -> 0x0326 }
            r3 = 1
            java.lang.Object r1 = r1.get(r3)     // Catch:{ ParseError -> 0x0326 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ParseError -> 0x0326 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02a5 }
            int r1 = r1 + r3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ ParseError -> 0x0326 }
            kotlin.text.e r1 = m4502l(r9)     // Catch:{ ParseError -> 0x0326 }
            goto L_0x02ac
        L_0x02a5:
            androidx.compose.ui.tooling.data.ParseError r1 = new androidx.compose.ui.tooling.data.ParseError     // Catch:{ ParseError -> 0x0326 }
            r1.<init>()     // Catch:{ ParseError -> 0x0326 }
            throw r1     // Catch:{ ParseError -> 0x0326 }
        L_0x02ab:
            r13 = 0
        L_0x02ac:
            if (r1 == 0) goto L_0x0317
            java.lang.String r1 = m4494d(r1)     // Catch:{ ParseError -> 0x0326 }
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r15)     // Catch:{ ParseError -> 0x0326 }
            if (r1 == 0) goto L_0x0317
            kotlin.text.e r1 = m4502l(r9)     // Catch:{ ParseError -> 0x0326 }
            if (r1 == 0) goto L_0x0326
            boolean r3 = m4495e(r1)     // Catch:{ ParseError -> 0x0326 }
            if (r3 != 0) goto L_0x02c5
            goto L_0x0326
        L_0x02c5:
            java.util.List r1 = r1.mo72020a()     // Catch:{ ParseError -> 0x0326 }
            r3 = 1
            java.lang.Object r1 = r1.get(r3)     // Catch:{ ParseError -> 0x0326 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ParseError -> 0x0326 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0311 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ParseError -> 0x0326 }
            kotlin.text.e r3 = m4502l(r9)     // Catch:{ ParseError -> 0x0326 }
            if (r3 == 0) goto L_0x0318
            java.lang.String r4 = "L"
            java.lang.String r3 = m4494d(r3)     // Catch:{ ParseError -> 0x0326 }
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)     // Catch:{ ParseError -> 0x0326 }
            if (r3 == 0) goto L_0x0318
            kotlin.text.e r3 = m4502l(r9)     // Catch:{ ParseError -> 0x0326 }
            if (r3 == 0) goto L_0x0326
            boolean r4 = m4495e(r3)     // Catch:{ ParseError -> 0x0326 }
            if (r4 != 0) goto L_0x02f7
            goto L_0x0326
        L_0x02f7:
            java.util.List r3 = r3.mo72020a()     // Catch:{ ParseError -> 0x0326 }
            r4 = 1
            java.lang.Object r3 = r3.get(r4)     // Catch:{ ParseError -> 0x0326 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ParseError -> 0x0326 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x030b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ParseError -> 0x0326 }
            goto L_0x0319
        L_0x030b:
            androidx.compose.ui.tooling.data.ParseError r1 = new androidx.compose.ui.tooling.data.ParseError     // Catch:{ ParseError -> 0x0326 }
            r1.<init>()     // Catch:{ ParseError -> 0x0326 }
            throw r1     // Catch:{ ParseError -> 0x0326 }
        L_0x0311:
            androidx.compose.ui.tooling.data.ParseError r1 = new androidx.compose.ui.tooling.data.ParseError     // Catch:{ ParseError -> 0x0326 }
            r1.<init>()     // Catch:{ ParseError -> 0x0326 }
            throw r1     // Catch:{ ParseError -> 0x0326 }
        L_0x0317:
            r1 = 0
        L_0x0318:
            r3 = 0
        L_0x0319:
            if (r13 == 0) goto L_0x0326
            if (r1 == 0) goto L_0x0326
            if (r3 == 0) goto L_0x0326
            androidx.compose.ui.tooling.data.k r4 = new androidx.compose.ui.tooling.data.k     // Catch:{ ParseError -> 0x0326 }
            r4.<init>(r13, r1, r3)     // Catch:{ ParseError -> 0x0326 }
            r13 = r4
            goto L_0x0327
        L_0x0326:
            r13 = 0
        L_0x0327:
            if (r13 == 0) goto L_0x032c
            r10.add(r13)
        L_0x032c:
            r13 = r21
        L_0x032e:
            T r1 = r9.element
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r12, r1)
            if (r1 == 0) goto L_0x0337
            goto L_0x0367
        L_0x0337:
            r11 = r6
            r1 = r20
            r5 = 0
            r6 = 0
            goto L_0x002a
        L_0x033e:
            r20 = r1
            r21 = r13
        L_0x0342:
            r5 = -1
            r1 = r5
            r13 = 0
        L_0x0345:
            androidx.compose.ui.tooling.data.i r2 = new androidx.compose.ui.tooling.data.i
            if (r13 != 0) goto L_0x0351
            if (r0 == 0) goto L_0x034f
            java.lang.String r3 = r0.f4675b
            r14 = r3
            goto L_0x0352
        L_0x034f:
            r14 = 0
            goto L_0x0352
        L_0x0351:
            r14 = r13
        L_0x0352:
            if (r13 == 0) goto L_0x0355
            goto L_0x0359
        L_0x0355:
            if (r0 == 0) goto L_0x0359
            int r1 = r0.f4676c
        L_0x0359:
            r15 = r1
            r12 = r2
            r13 = r21
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r13 = r2
            goto L_0x0368
        L_0x0364:
            r20 = r1
            r5 = -1
        L_0x0367:
            r13 = 0
        L_0x0368:
            java.lang.Object r2 = r29.mo6103c()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.compose.runtime.o r1 = r29.getData()
            kotlin.collections.C19324q.m32628J0(r1, r7)
            java.lang.Iterable r1 = r29.mo5644e()
            java.util.Iterator r1 = r1.iterator()
        L_0x0385:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0399
            java.lang.Object r3 = r1.next()
            androidx.compose.runtime.tooling.b r3 = (androidx.compose.runtime.tooling.C1414b) r3
            androidx.compose.ui.tooling.data.c r3 = m4493c(r3, r13)
            r9.add(r3)
            goto L_0x0385
        L_0x0399:
            boolean r1 = r2 instanceof androidx.compose.p015ui.layout.C1695m
            if (r1 == 0) goto L_0x03a5
            r3 = r2
            androidx.compose.ui.layout.m r3 = (androidx.compose.p015ui.layout.C1695m) r3
            java.util.List r3 = r3.mo6695a()
            goto L_0x03a7
        L_0x03a5:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x03a7:
            r6 = r3
            if (r1 == 0) goto L_0x03f4
            r1 = r2
            androidx.compose.ui.layout.m r1 = (androidx.compose.p015ui.layout.C1695m) r1
            boolean r3 = r1.mo6696c()
            if (r3 != 0) goto L_0x03c3
            m0.h r3 = new m0.h
            int r4 = r1.getWidth()
            int r1 = r1.getHeight()
            r10 = 0
            r3.<init>(r10, r10, r4, r1)
            goto L_0x047d
        L_0x03c3:
            androidx.compose.ui.node.d r3 = r1.mo6699l()
            long r3 = androidx.activity.C0114h.m322u0(r3)
            androidx.compose.ui.node.d r1 = r1.mo6699l()
            long r10 = r1.f3724d
            float r1 = p288y.C8343c.m16642c(r3)
            int r1 = p173m.C7279a.m13954l(r1)
            float r3 = p288y.C8343c.m16643d(r3)
            int r3 = p173m.C7279a.m13954l(r3)
            r4 = 32
            long r14 = r10 >> r4
            int r4 = (int) r14
            int r4 = r4 + r1
            int r10 = p174m0.C7290i.m13995b(r10)
            int r10 = r10 + r3
            m0.h r11 = new m0.h
            r11.<init>(r1, r3, r4, r10)
            r3 = r11
            goto L_0x047d
        L_0x03f4:
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x03ff
            m0.h r1 = f4671a
            r3 = r1
            goto L_0x047d
        L_0x03ff:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r9)
            r1.<init>(r3)
            java.util.Iterator r3 = r9.iterator()
        L_0x040c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x041e
            java.lang.Object r4 = r3.next()
            androidx.compose.ui.tooling.data.c r4 = (androidx.compose.p015ui.tooling.data.C2060c) r4
            m0.h r4 = r4.f4657e
            r1.add(r4)
            goto L_0x040c
        L_0x041e:
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x06ea
            java.lang.Object r3 = r1.next()
        L_0x042c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x047b
            java.lang.Object r4 = r1.next()
            m0.h r4 = (p174m0.C7289h) r4
            m0.h r3 = (p174m0.C7289h) r3
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r10)
            java.lang.String r10 = "other"
            kotlin.jvm.internal.C19383o.m32797g(r3, r10)
            m0.h r10 = f4671a
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r4, r10)
            if (r11 == 0) goto L_0x044d
            goto L_0x042c
        L_0x044d:
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r3, r10)
            if (r10 == 0) goto L_0x0454
            goto L_0x0479
        L_0x0454:
            int r10 = r4.f16167a
            int r11 = r3.f16167a
            int r10 = java.lang.Math.min(r10, r11)
            int r11 = r4.f16168b
            int r12 = r3.f16168b
            int r11 = java.lang.Math.min(r11, r12)
            int r12 = r4.f16170d
            int r14 = r3.f16170d
            int r12 = java.lang.Math.max(r12, r14)
            int r4 = r4.f16169c
            int r3 = r3.f16169c
            int r3 = java.lang.Math.max(r4, r3)
            m0.h r4 = new m0.h
            r4.<init>(r10, r11, r3, r12)
        L_0x0479:
            r3 = r4
            goto L_0x042c
        L_0x047b:
            m0.h r3 = (p174m0.C7289h) r3
        L_0x047d:
            if (r13 == 0) goto L_0x0486
            boolean r1 = r13.f4680g
            r4 = 1
            if (r1 != r4) goto L_0x0486
            r1 = 1
            goto L_0x0487
        L_0x0486:
            r1 = 0
        L_0x0487:
            if (r1 == 0) goto L_0x04e8
            if (r0 == 0) goto L_0x04e8
            int r1 = r0.f4681h
            java.util.List<androidx.compose.ui.tooling.data.k> r4 = r0.f4677d
            int r4 = r4.size()
            if (r1 < r4) goto L_0x049b
            int r1 = r0.f4678e
            if (r1 < 0) goto L_0x049b
            r0.f4681h = r1
        L_0x049b:
            int r1 = r0.f4681h
            java.util.List<androidx.compose.ui.tooling.data.k> r4 = r0.f4677d
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x04e8
            java.util.List<androidx.compose.ui.tooling.data.k> r1 = r0.f4677d
            int r4 = r0.f4681h
            int r10 = r4 + 1
            r0.f4681h = r10
            java.lang.Object r1 = r1.get(r4)
            androidx.compose.ui.tooling.data.k r1 = (androidx.compose.p015ui.tooling.data.C2068k) r1
            androidx.compose.ui.tooling.data.j r4 = new androidx.compose.ui.tooling.data.j
            java.lang.Integer r10 = r1.f4687a
            if (r10 == 0) goto L_0x04c0
            int r18 = r10.intValue()
            r15 = r18
            goto L_0x04c1
        L_0x04c0:
            r15 = r5
        L_0x04c1:
            java.lang.Integer r10 = r1.f4688b
            if (r10 == 0) goto L_0x04cc
            int r18 = r10.intValue()
            r16 = r18
            goto L_0x04ce
        L_0x04cc:
            r16 = r5
        L_0x04ce:
            java.lang.Integer r1 = r1.f4689c
            if (r1 == 0) goto L_0x04d9
            int r1 = r1.intValue()
            r17 = r1
            goto L_0x04db
        L_0x04d9:
            r17 = r5
        L_0x04db:
            java.lang.String r1 = r0.f4675b
            int r0 = r0.f4676c
            r14 = r4
            r18 = r1
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x04e9
        L_0x04e8:
            r4 = 0
        L_0x04e9:
            if (r2 == 0) goto L_0x04f8
            androidx.compose.ui.tooling.data.d r8 = new androidx.compose.ui.tooling.data.d
            r0 = r8
            r1 = r20
            r4 = r7
            r5 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x06e9
        L_0x04f8:
            androidx.compose.ui.tooling.data.a r10 = new androidx.compose.ui.tooling.data.a
            if (r13 == 0) goto L_0x0500
            java.lang.String r0 = r13.f4674a
            r2 = r0
            goto L_0x0501
        L_0x0500:
            r2 = 0
        L_0x0501:
            if (r13 == 0) goto L_0x0506
            java.lang.String r0 = r13.f4674a
            goto L_0x0507
        L_0x0506:
            r0 = 0
        L_0x0507:
            if (r0 == 0) goto L_0x0512
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0510
            goto L_0x0512
        L_0x0510:
            r0 = 0
            goto L_0x0513
        L_0x0512:
            r0 = 1
        L_0x0513:
            if (r0 != 0) goto L_0x0529
            int r0 = r3.f16170d
            int r1 = r3.f16168b
            int r0 = r0 - r1
            if (r0 > 0) goto L_0x0523
            int r0 = r3.f16169c
            int r1 = r3.f16167a
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0529
        L_0x0523:
            java.lang.Object r0 = r29.mo6104g()
            r5 = r0
            goto L_0x052a
        L_0x0529:
            r5 = 0
        L_0x052a:
            java.lang.String r0 = "it.name"
            boolean r1 = r7.isEmpty()
            r6 = 1
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x06d3
            java.util.Iterator r1 = r7.iterator()
        L_0x0538:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x055a
            java.lang.Object r6 = r1.next()
            if (r6 == 0) goto L_0x0556
            java.lang.Class r11 = r6.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = ".RecomposeScopeImpl"
            boolean r11 = kotlin.text.C19457k.m33018V0(r11, r12)
            if (r11 == 0) goto L_0x0556
            r11 = 1
            goto L_0x0557
        L_0x0556:
            r11 = 0
        L_0x0557:
            if (r11 == 0) goto L_0x0538
            goto L_0x055b
        L_0x055a:
            r6 = 0
        L_0x055b:
            if (r6 == 0) goto L_0x06d3
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x06d3 }
            java.lang.String r11 = "block"
            java.lang.reflect.Field r1 = m4491a(r1, r11)     // Catch:{ all -> 0x06d3 }
            if (r1 == 0) goto L_0x06d3
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x06d3 }
            if (r1 == 0) goto L_0x06d3
            java.lang.Class r6 = r1.getClass()     // Catch:{ all -> 0x06d3 }
            java.lang.String r11 = "$$default"
            java.lang.reflect.Field r11 = m4491a(r6, r11)     // Catch:{ all -> 0x06d3 }
            java.lang.String r12 = "$$changed"
            java.lang.reflect.Field r12 = m4491a(r6, r12)     // Catch:{ all -> 0x06d3 }
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.Int"
            if (r11 == 0) goto L_0x0596
            java.lang.Object r11 = r11.get(r1)     // Catch:{ all -> 0x06d3 }
            if (r11 == 0) goto L_0x0590
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x06d3 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x06d3 }
            goto L_0x0597
        L_0x0590:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x06d3 }
            r0.<init>(r14)     // Catch:{ all -> 0x06d3 }
            throw r0     // Catch:{ all -> 0x06d3 }
        L_0x0596:
            r11 = 0
        L_0x0597:
            if (r12 == 0) goto L_0x05ac
            java.lang.Object r12 = r12.get(r1)     // Catch:{ all -> 0x06d3 }
            if (r12 == 0) goto L_0x05a6
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x06d3 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x06d3 }
            goto L_0x05ad
        L_0x05a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x06d3 }
            r0.<init>(r14)     // Catch:{ all -> 0x06d3 }
            throw r0     // Catch:{ all -> 0x06d3 }
        L_0x05ac:
            r12 = 0
        L_0x05ad:
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()     // Catch:{ all -> 0x06d3 }
            java.lang.String r14 = "blockClass.declaredFields"
            kotlin.jvm.internal.C19383o.m32796f(r6, r14)     // Catch:{ all -> 0x06d3 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x06d3 }
            r14.<init>()     // Catch:{ all -> 0x06d3 }
            int r15 = r6.length     // Catch:{ all -> 0x06d3 }
            r16 = r9
            r9 = 0
        L_0x05bf:
            if (r9 >= r15) goto L_0x0619
            r17 = r15
            r15 = r6[r9]     // Catch:{ all -> 0x0613 }
            r29 = r6
            java.lang.String r6 = r15.getName()     // Catch:{ all -> 0x0613 }
            kotlin.jvm.internal.C19383o.m32796f(r6, r0)     // Catch:{ all -> 0x0613 }
            r18 = r7
            java.lang.String r7 = "$"
            r30 = r5
            r5 = 0
            boolean r6 = kotlin.text.C19457k.m33025c1(r6, r7, r5)     // Catch:{ all -> 0x06d9 }
            if (r6 == 0) goto L_0x05fd
            java.lang.String r5 = r15.getName()     // Catch:{ all -> 0x06d9 }
            kotlin.jvm.internal.C19383o.m32796f(r5, r0)     // Catch:{ all -> 0x06d9 }
            java.lang.String r6 = "$$"
            r7 = 0
            boolean r5 = kotlin.text.C19457k.m33025c1(r5, r6, r7)     // Catch:{ all -> 0x06d9 }
            if (r5 != 0) goto L_0x05fd
            java.lang.String r5 = r15.getName()     // Catch:{ all -> 0x06d9 }
            kotlin.jvm.internal.C19383o.m32796f(r5, r0)     // Catch:{ all -> 0x06d9 }
            java.lang.String r6 = "$jacoco"
            r7 = 0
            boolean r5 = kotlin.text.C19457k.m33025c1(r5, r6, r7)     // Catch:{ all -> 0x06d9 }
            if (r5 != 0) goto L_0x05fe
            r5 = 1
            goto L_0x05ff
        L_0x05fd:
            r7 = 0
        L_0x05fe:
            r5 = r7
        L_0x05ff:
            if (r5 == 0) goto L_0x0604
            r14.add(r15)     // Catch:{ all -> 0x06d9 }
        L_0x0604:
            int r9 = r9 + 1
            r6 = r29
            r5 = r30
            r15 = r17
            r7 = r18
            goto L_0x05bf
        L_0x060f:
            r30 = r5
            goto L_0x06d9
        L_0x0613:
            r30 = r5
            r18 = r7
            goto L_0x06d9
        L_0x0619:
            r30 = r5
            r18 = r7
            r7 = 0
            androidx.compose.ui.tooling.data.g r0 = new androidx.compose.ui.tooling.data.g     // Catch:{ all -> 0x06d9 }
            r0.<init>()     // Catch:{ all -> 0x06d9 }
            java.util.List r0 = kotlin.collections.C19327t.m32656l1(r14, r0)     // Catch:{ all -> 0x06d9 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x06d9 }
            r5.<init>()     // Catch:{ all -> 0x06d9 }
            if (r13 == 0) goto L_0x0632
            java.util.List<androidx.compose.ui.tooling.data.e> r6 = r13.f4679f     // Catch:{ all -> 0x06d9 }
            if (r6 != 0) goto L_0x0634
        L_0x0632:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ all -> 0x06d9 }
        L_0x0634:
            int r9 = r0.size()     // Catch:{ all -> 0x06d9 }
            r13 = r7
        L_0x0639:
            if (r13 >= r9) goto L_0x06d1
            int r14 = r6.size()     // Catch:{ all -> 0x06d9 }
            if (r13 >= r14) goto L_0x0649
            java.lang.Object r14 = r6.get(r13)     // Catch:{ all -> 0x06d9 }
            androidx.compose.ui.tooling.data.e r14 = (androidx.compose.p015ui.tooling.data.C2062e) r14     // Catch:{ all -> 0x06d9 }
            r15 = 0
            goto L_0x064f
        L_0x0649:
            androidx.compose.ui.tooling.data.e r14 = new androidx.compose.ui.tooling.data.e     // Catch:{ all -> 0x06d9 }
            r15 = 0
            r14.<init>(r13, r15)     // Catch:{ all -> 0x06d9 }
        L_0x064f:
            int r7 = r14.f4662a     // Catch:{ all -> 0x06d9 }
            int r15 = r0.size()     // Catch:{ all -> 0x06d9 }
            if (r7 >= r15) goto L_0x06c3
            int r7 = r14.f4662a     // Catch:{ all -> 0x06d9 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x06d9 }
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7     // Catch:{ all -> 0x06d9 }
            r15 = 1
            r7.setAccessible(r15)     // Catch:{ all -> 0x06d9 }
            java.lang.Object r23 = r7.get(r1)     // Catch:{ all -> 0x06d9 }
            int r17 = r15 << r13
            r17 = r17 & r11
            if (r17 == 0) goto L_0x0670
            r24 = r15
            goto L_0x0672
        L_0x0670:
            r24 = 0
        L_0x0672:
            int r17 = r13 * 3
            int r17 = r17 + 1
            r15 = 7
            int r15 = r15 << r17
            r15 = r15 & r12
            int r15 = r15 >> r17
            r29 = r0
            r0 = r15 & 3
            r17 = r1
            r1 = 3
            if (r0 != r1) goto L_0x0688
            r25 = 1
            goto L_0x068a
        L_0x0688:
            r25 = 0
        L_0x068a:
            if (r0 != 0) goto L_0x068e
            r0 = 1
            goto L_0x068f
        L_0x068e:
            r0 = 0
        L_0x068f:
            r15 = r15 & 4
            if (r15 != 0) goto L_0x0696
            r28 = 1
            goto L_0x0698
        L_0x0696:
            r28 = 0
        L_0x0698:
            androidx.compose.ui.tooling.data.f r15 = new androidx.compose.ui.tooling.data.f     // Catch:{ all -> 0x06d9 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x06d9 }
            java.lang.String r1 = "field.name"
            kotlin.jvm.internal.C19383o.m32796f(r7, r1)     // Catch:{ all -> 0x06d9 }
            r1 = 1
            java.lang.String r7 = r7.substring(r1)     // Catch:{ all -> 0x06d9 }
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)     // Catch:{ all -> 0x06d9 }
            if (r0 == 0) goto L_0x06b2
            if (r24 != 0) goto L_0x06b2
            r26 = r1
            goto L_0x06b4
        L_0x06b2:
            r26 = 0
        L_0x06b4:
            java.lang.String r0 = r14.f4663b     // Catch:{ all -> 0x06d9 }
            r21 = r15
            r22 = r7
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x06d9 }
            r5.add(r15)     // Catch:{ all -> 0x06d9 }
            goto L_0x06c8
        L_0x06c3:
            r29 = r0
            r17 = r1
            r1 = 1
        L_0x06c8:
            int r13 = r13 + 1
            r0 = r29
            r1 = r17
            r7 = 0
            goto L_0x0639
        L_0x06d1:
            r6 = r5
            goto L_0x06dc
        L_0x06d3:
            r30 = r5
            r18 = r7
            r16 = r9
        L_0x06d9:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r6 = r0
        L_0x06dc:
            r0 = r10
            r1 = r20
            r5 = r30
            r7 = r18
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r8 = r10
        L_0x06e9:
            return r8
        L_0x06ea:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.tooling.data.C2065h.m4493c(androidx.compose.runtime.tooling.b, androidx.compose.ui.tooling.data.i):androidx.compose.ui.tooling.data.c");
    }

    /* renamed from: d */
    public static final String m4494d(C19451e eVar) {
        return eVar.mo72020a().get(0);
    }

    /* renamed from: e */
    public static final boolean m4495e(C19451e eVar) {
        return eVar.mo72022c().mo72025c(1) != null;
    }

    /* renamed from: f */
    public static final void m4496f(Ref$IntRef ref$IntRef, ArrayList arrayList, int i) {
        int i2 = i - ref$IntRef.element;
        if (i2 > 0) {
            if (i2 < 4) {
                i2 = 4;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(Integer.valueOf(ref$IntRef.element + i3 + 1));
            }
            ref$IntRef.element += i2;
        }
    }

    /* renamed from: g */
    public static final void m4497g(Ref$ObjectRef<C19451e> ref$ObjectRef, String str) {
        C19451e eVar = (C19451e) ref$ObjectRef.element;
        if (eVar == null || !C19383o.m32792b(m4494d(eVar), str)) {
            throw new ParseError();
        }
        m4501k(ref$ObjectRef);
    }

    /* renamed from: h */
    public static final String m4498h(Ref$ObjectRef<C19451e> ref$ObjectRef) {
        C19451e eVar = (C19451e) ref$ObjectRef.element;
        if (eVar != null) {
            if (eVar.mo72022c().mo72025c(2) != null) {
                m4501k(ref$ObjectRef);
                String substring = m4494d(eVar).substring(1);
                C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
                if (!C19457k.m33025c1(substring, "c#", false)) {
                    return substring;
                }
                StringBuilder h = C0072d.m201h("androidx.compose.");
                String substring2 = substring.substring(2);
                C19383o.m32796f(substring2, "this as java.lang.String).substring(startIndex)");
                h.append(substring2);
                return h.toString();
            }
        }
        throw new ParseError();
    }

    /* renamed from: i */
    public static final int m4499i(Ref$ObjectRef<C19451e> ref$ObjectRef) {
        C19451e eVar = (C19451e) ref$ObjectRef.element;
        if (eVar != null) {
            boolean z = true;
            if (eVar.mo72022c().mo72025c(1) == null) {
                z = false;
            }
            if (z) {
                m4501k(ref$ObjectRef);
                try {
                    return Integer.parseInt(m4494d(eVar));
                } catch (NumberFormatException unused) {
                    throw new ParseError();
                }
            }
        }
        throw new ParseError();
    }

    /* renamed from: j */
    public static final boolean m4500j(Ref$ObjectRef<C19451e> ref$ObjectRef, String str) {
        C19451e eVar = (C19451e) ref$ObjectRef.element;
        return eVar == null || C19383o.m32792b(m4494d(eVar), str);
    }

    /* renamed from: k */
    public static final void m4501k(Ref$ObjectRef ref$ObjectRef) {
        C19451e eVar = (C19451e) ref$ObjectRef.element;
        if (eVar != null) {
            ref$ObjectRef.element = eVar.next();
        }
        C19451e eVar2 = (C19451e) ref$ObjectRef.element;
    }

    /* renamed from: l */
    public static final C19451e m4502l(Ref$ObjectRef<C19451e> ref$ObjectRef) {
        C19451e eVar = (C19451e) ref$ObjectRef.element;
        if (eVar != null) {
            ref$ObjectRef.element = eVar.next();
        }
        return (C19451e) ref$ObjectRef.element;
    }
}
