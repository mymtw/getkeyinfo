package okhttp3;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.material.badge.BadgeDrawable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import p735br.C18980c;
import p756lr.C19893f;
import p764pq.C20055g;

/* renamed from: okhttp3.p */
public final class C19997p {

    /* renamed from: k */
    public static final char[] f44237k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    public static final C19999b f44238l = new C19999b();

    /* renamed from: a */
    public final boolean f44239a;

    /* renamed from: b */
    public final String f44240b;

    /* renamed from: c */
    public final String f44241c;

    /* renamed from: d */
    public final String f44242d;

    /* renamed from: e */
    public final String f44243e;

    /* renamed from: f */
    public final int f44244f;

    /* renamed from: g */
    public final List<String> f44245g;

    /* renamed from: h */
    public final List<String> f44246h;

    /* renamed from: i */
    public final String f44247i;

    /* renamed from: j */
    public final String f44248j;

    /* renamed from: okhttp3.p$a */
    public static final class C19998a {

        /* renamed from: a */
        public String f44249a;

        /* renamed from: b */
        public String f44250b = "";

        /* renamed from: c */
        public String f44251c = "";

        /* renamed from: d */
        public String f44252d;

        /* renamed from: e */
        public int f44253e = -1;

        /* renamed from: f */
        public final ArrayList f44254f;

        /* renamed from: g */
        public ArrayList f44255g;

        /* renamed from: h */
        public String f44256h;

        public C19998a() {
            ArrayList arrayList = new ArrayList();
            this.f44254f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final void mo72975a(String str, String str2) {
            C19383o.m32797g(str, "encodedName");
            if (this.f44255g == null) {
                this.f44255g = new ArrayList();
            }
            ArrayList arrayList = this.f44255g;
            C19383o.m32794d(arrayList);
            C19999b bVar = C19997p.f44238l;
            arrayList.add(C19999b.m34232a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            ArrayList arrayList2 = this.f44255g;
            C19383o.m32794d(arrayList2);
            arrayList2.add(str2 != null ? C19999b.m34232a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211) : null);
        }

        /* renamed from: b */
        public final void mo72976b(String str) {
            int i = 0;
            do {
                int f = C18980c.m32102f(str, i, str.length(), "/\\");
                mo72981g(str, i, f, f < str.length(), false);
                i = f + 1;
            } while (i <= str.length());
        }

        /* renamed from: c */
        public final void mo72977c(String str, String str2) {
            C19383o.m32797g(str, "name");
            if (this.f44255g == null) {
                this.f44255g = new ArrayList();
            }
            ArrayList arrayList = this.f44255g;
            C19383o.m32794d(arrayList);
            C19999b bVar = C19997p.f44238l;
            arrayList.add(C19999b.m34232a(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
            ArrayList arrayList2 = this.f44255g;
            C19383o.m32794d(arrayList2);
            arrayList2.add(str2 != null ? C19999b.m34232a(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219) : null);
        }

        /* renamed from: d */
        public final C19997p mo72978d() {
            int i;
            ArrayList arrayList;
            String str = this.f44249a;
            if (str != null) {
                C19999b bVar = C19997p.f44238l;
                C19999b bVar2 = bVar;
                String e = C19999b.m34236e(bVar2, this.f44250b, 0, 0, false, 7);
                String e2 = C19999b.m34236e(bVar2, this.f44251c, 0, 0, false, 7);
                String str2 = this.f44252d;
                if (str2 != null) {
                    int i2 = this.f44253e;
                    if (i2 != -1) {
                        i = i2;
                    } else {
                        String str3 = this.f44249a;
                        C19383o.m32794d(str3);
                        bVar.getClass();
                        i = C19999b.m34233b(str3);
                    }
                    ArrayList arrayList2 = this.f44254f;
                    ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(arrayList2));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(C19999b.m34236e(C19997p.f44238l, (String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.f44255g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(C19322o.m32624F0(arrayList4));
                        for (String str4 : arrayList4) {
                            arrayList.add(str4 != null ? C19999b.m34236e(C19997p.f44238l, str4, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f44256h;
                    return new C19997p(str, e, e2, str2, i, arrayList3, arrayList, str5 != null ? C19999b.m34236e(C19997p.f44238l, str5, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: e */
        public final void mo72979e(String str) {
            this.f44255g = str != null ? C19999b.m34237f(C19999b.m34232a(C19997p.f44238l, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211)) : null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: int} */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x025d, code lost:
            if (65535 < r1) goto L_0x0266;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
            if (r9 == ':') goto L_0x0083;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0299  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x02c0  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x02c2  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x02c5  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x0319  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x0393  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x0213 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0345 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01f3  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo72980f(java.lang.String r26, okhttp3.C19997p r27) {
            /*
                r25 = this;
                r0 = r25
                r12 = r26
                r1 = r27
                java.lang.String r2 = "input"
                kotlin.jvm.internal.C19383o.m32797g(r12, r2)
                byte[] r2 = p735br.C18980c.f42301a
                int r2 = r26.length()
                r3 = 0
                int r2 = p735br.C18980c.m32109m(r3, r2, r12)
                int r4 = r26.length()
                int r13 = p735br.C18980c.m32110n(r2, r4, r12)
                int r4 = r13 - r2
                r5 = 58
                r14 = -1
                r6 = 1
                r7 = 2
                if (r4 >= r7) goto L_0x0029
                goto L_0x0082
            L_0x0029:
                char r4 = r12.charAt(r2)
                r8 = 97
                int r9 = kotlin.jvm.internal.C19383o.m32799i(r4, r8)
                r10 = 122(0x7a, float:1.71E-43)
                r11 = 65
                r15 = 90
                if (r9 < 0) goto L_0x0041
                int r9 = kotlin.jvm.internal.C19383o.m32799i(r4, r10)
                if (r9 <= 0) goto L_0x004e
            L_0x0041:
                int r9 = kotlin.jvm.internal.C19383o.m32799i(r4, r11)
                if (r9 < 0) goto L_0x0082
                int r4 = kotlin.jvm.internal.C19383o.m32799i(r4, r15)
                if (r4 <= 0) goto L_0x004e
                goto L_0x0082
            L_0x004e:
                r4 = r2
            L_0x004f:
                int r4 = r4 + r6
                if (r4 >= r13) goto L_0x0082
                char r9 = r12.charAt(r4)
                if (r8 <= r9) goto L_0x0059
                goto L_0x005c
            L_0x0059:
                if (r10 < r9) goto L_0x005c
                goto L_0x007a
            L_0x005c:
                if (r11 <= r9) goto L_0x005f
                goto L_0x0062
            L_0x005f:
                if (r15 < r9) goto L_0x0062
                goto L_0x007a
            L_0x0062:
                r8 = 57
                r10 = 48
                if (r10 <= r9) goto L_0x0069
                goto L_0x006c
            L_0x0069:
                if (r8 < r9) goto L_0x006c
                goto L_0x007a
            L_0x006c:
                r8 = 43
                if (r9 != r8) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r8 = 45
                if (r9 != r8) goto L_0x0076
                goto L_0x007a
            L_0x0076:
                r8 = 46
                if (r9 != r8) goto L_0x007f
            L_0x007a:
                r8 = 97
                r10 = 122(0x7a, float:1.71E-43)
                goto L_0x004f
            L_0x007f:
                if (r9 != r5) goto L_0x0082
                goto L_0x0083
            L_0x0082:
                r4 = r14
            L_0x0083:
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r14) goto L_0x00c4
                java.lang.String r8 = "https:"
                boolean r8 = kotlin.text.C19457k.m33024b1(r12, r2, r8, r6)
                if (r8 == 0) goto L_0x0096
                java.lang.String r4 = "https"
                r0.f44249a = r4
                int r2 = r2 + 6
                goto L_0x00ca
            L_0x0096:
                java.lang.String r8 = "http:"
                boolean r8 = kotlin.text.C19457k.m33024b1(r12, r2, r8, r6)
                if (r8 == 0) goto L_0x00a5
                java.lang.String r4 = "http"
                r0.f44249a = r4
                int r2 = r2 + 5
                goto L_0x00ca
            L_0x00a5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                kotlin.jvm.internal.C19383o.m32796f(r3, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c4:
                if (r1 == 0) goto L_0x03b8
                java.lang.String r4 = r1.f44240b
                r0.f44249a = r4
            L_0x00ca:
                r4 = r2
            L_0x00cb:
                r8 = 92
                r9 = 47
                if (r4 >= r13) goto L_0x00de
                char r10 = r12.charAt(r4)
                if (r10 == r8) goto L_0x00d9
                if (r10 != r9) goto L_0x00de
            L_0x00d9:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00cb
            L_0x00de:
                r4 = 63
                r10 = 35
                if (r3 >= r7) goto L_0x0127
                if (r1 == 0) goto L_0x0127
                java.lang.String r7 = r1.f44240b
                java.lang.String r11 = r0.f44249a
                boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r11)
                r7 = r7 ^ r6
                if (r7 == 0) goto L_0x00f2
                goto L_0x0127
            L_0x00f2:
                java.lang.String r3 = r27.mo72968e()
                r0.f44250b = r3
                java.lang.String r3 = r27.mo72964a()
                r0.f44251c = r3
                java.lang.String r3 = r1.f44243e
                r0.f44252d = r3
                int r3 = r1.f44244f
                r0.f44253e = r3
                java.util.ArrayList r3 = r0.f44254f
                r3.clear()
                java.util.ArrayList r3 = r0.f44254f
                java.util.ArrayList r4 = r27.mo72966c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x011c
                char r3 = r12.charAt(r2)
                if (r3 != r10) goto L_0x0123
            L_0x011c:
                java.lang.String r1 = r27.mo72967d()
                r0.mo72979e(r1)
            L_0x0123:
                r20 = r13
                goto L_0x02c7
            L_0x0127:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r11 = r2
                r17 = r3
            L_0x012f:
                java.lang.String r1 = "@/\\?#"
                int r7 = p735br.C18980c.m32102f(r12, r11, r13, r1)
                if (r7 == r13) goto L_0x013c
                char r1 = r12.charAt(r7)
                goto L_0x013d
            L_0x013c:
                r1 = r14
            L_0x013d:
                if (r1 == r14) goto L_0x01ed
                if (r1 == r10) goto L_0x01ed
                if (r1 == r9) goto L_0x01ed
                if (r1 == r8) goto L_0x01ed
                if (r1 == r4) goto L_0x01ed
                r2 = 64
                if (r1 == r2) goto L_0x014f
                r20 = r13
                goto L_0x01de
            L_0x014f:
                java.lang.String r10 = "%40"
                if (r16 != 0) goto L_0x01ad
                int r9 = p735br.C18980c.m32101e(r12, r5, r11, r7)
                okhttp3.p$b r18 = okhttp3.C19997p.f44238l
                r6 = 1
                r8 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r26
                r3 = r11
                r4 = r9
                r11 = r7
                r7 = r8
                r8 = r19
                r14 = r9
                r9 = r20
                r23 = r10
                r10 = r21
                r20 = r13
                r13 = r11
                r11 = r22
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x018e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f44250b
                r4 = r23
                java.lang.String r1 = android.support.p013v4.media.C0070b.m184f(r2, r3, r4, r1)
            L_0x018e:
                r0.f44250b = r1
                if (r14 == r13) goto L_0x01aa
                int r3 = r14 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r26
                r4 = r13
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f44251c = r1
                r16 = 1
            L_0x01aa:
                r17 = 1
                goto L_0x01dc
            L_0x01ad:
                r4 = r10
                r20 = r13
                r13 = r7
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.f44251c
                r14.append(r1)
                r14.append(r4)
                okhttp3.p$b r1 = okhttp3.C19997p.f44238l
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r26
                r3 = r11
                r4 = r13
                r11 = r18
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f44251c = r1
            L_0x01dc:
                int r11 = r13 + 1
            L_0x01de:
                r10 = 35
                r4 = 63
                r9 = 47
                r8 = 92
                r5 = 58
                r13 = r20
                r14 = -1
                goto L_0x012f
            L_0x01ed:
                r20 = r13
                r13 = r7
                r7 = r11
            L_0x01f1:
                if (r7 >= r13) goto L_0x0213
                char r1 = r12.charAt(r7)
                r2 = 58
                if (r1 == r2) goto L_0x020f
                r2 = 91
                if (r1 == r2) goto L_0x0200
                goto L_0x020c
            L_0x0200:
                int r7 = r7 + 1
                if (r7 >= r13) goto L_0x020c
                char r1 = r12.charAt(r7)
                r2 = 93
                if (r1 != r2) goto L_0x0200
            L_0x020c:
                int r7 = r7 + 1
                goto L_0x01f1
            L_0x020f:
                r1 = 1
                r14 = r1
                r10 = r7
                goto L_0x0216
            L_0x0213:
                r1 = 1
                r14 = r1
                r10 = r13
            L_0x0216:
                int r9 = r10 + 1
                r7 = 34
                if (r9 >= r13) goto L_0x0299
                okhttp3.p$b r7 = okhttp3.C19997p.f44238l
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r26
                r3 = r11
                r4 = r10
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34236e(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1686P0(r1)
                r0.f44252d = r1
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r26
                r3 = r9
                r4 = r13
                r7 = r8
                r8 = r16
                r24 = r9
                r9 = r17
                r27 = r10
                r10 = r18
                r16 = r11
                r11 = r19
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0266 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0266 }
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r14 <= r1) goto L_0x025d
                goto L_0x0266
            L_0x025d:
                if (r2 < r1) goto L_0x0266
                goto L_0x0267
            L_0x0260:
                r24 = r9
                r27 = r10
                r16 = r11
            L_0x0266:
                r1 = -1
            L_0x0267:
                r0.f44253e = r1
                r2 = -1
                if (r1 == r2) goto L_0x026e
                r1 = r14
                goto L_0x026f
            L_0x026e:
                r1 = 0
            L_0x026f:
                if (r1 == 0) goto L_0x0274
                r7 = 34
                goto L_0x02bc
            L_0x0274:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
                r10 = r24
                java.lang.String r2 = r12.substring(r10, r13)
                kotlin.jvm.internal.C19383o.m32796f(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0299:
                r27 = r10
                r16 = r11
                okhttp3.p$b r1 = okhttp3.C19997p.f44238l
                r5 = 0
                r6 = 4
                r2 = r26
                r3 = r16
                r4 = r27
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34236e(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1686P0(r1)
                r0.f44252d = r1
                java.lang.String r1 = r0.f44249a
                kotlin.jvm.internal.C19383o.m32794d(r1)
                int r1 = okhttp3.C19997p.C19999b.m34233b(r1)
                r0.f44253e = r1
            L_0x02bc:
                java.lang.String r1 = r0.f44252d
                if (r1 == 0) goto L_0x02c2
                r1 = r14
                goto L_0x02c3
            L_0x02c2:
                r1 = 0
            L_0x02c3:
                if (r1 == 0) goto L_0x0393
                r2 = r13
                r6 = r14
            L_0x02c7:
                java.lang.String r1 = "?#"
                r3 = r20
                int r1 = p735br.C18980c.m32102f(r12, r2, r3, r1)
                if (r2 != r1) goto L_0x02d8
                r14 = r0
                r8 = r1
                r15 = r3
                r1 = r12
                r13 = r1
                goto L_0x0347
            L_0x02d8:
                char r4 = r12.charAt(r2)
                java.lang.String r5 = ""
                r7 = 47
                if (r4 == r7) goto L_0x02fb
                r7 = 92
                if (r4 != r7) goto L_0x02e7
                goto L_0x02fb
            L_0x02e7:
                java.util.ArrayList r4 = r0.f44254f
                int r7 = r4.size()
                int r7 = r7 - r6
                r4.set(r7, r5)
                r11 = r0
                r13 = r11
                r8 = r1
                r9 = r8
                r4 = r2
                r15 = r3
                r10 = r6
                r1 = r12
                r14 = r1
                goto L_0x0317
            L_0x02fb:
                java.util.ArrayList r4 = r0.f44254f
                r4.clear()
                java.util.ArrayList r4 = r0.f44254f
                r4.add(r5)
                r7 = r0
                r8 = r7
                r4 = r1
                r5 = r2
                r13 = r3
                r2 = r12
                r3 = r4
                r1 = r2
            L_0x030d:
                int r5 = r5 + r6
                r9 = r4
                r4 = r5
                r10 = r6
                r11 = r7
                r14 = r12
                r15 = r13
                r12 = r2
                r13 = r8
                r8 = r3
            L_0x0317:
                if (r4 >= r9) goto L_0x0345
                java.lang.String r2 = "/\\"
                int r7 = p735br.C18980c.m32102f(r14, r4, r9, r2)
                if (r7 >= r9) goto L_0x0324
                r16 = r10
                goto L_0x0327
            L_0x0324:
                r2 = 0
                r16 = r2
            L_0x0327:
                r17 = 1
                r2 = r13
                r3 = r14
                r5 = r7
                r6 = r16
                r18 = r7
                r7 = r17
                r2.mo72981g(r3, r4, r5, r6, r7)
                if (r16 == 0) goto L_0x0342
                r3 = r8
                r4 = r9
                r6 = r10
                r7 = r11
                r2 = r12
                r8 = r13
                r12 = r14
                r13 = r15
                r5 = r18
                goto L_0x030d
            L_0x0342:
                r4 = r18
                goto L_0x0317
            L_0x0345:
                r14 = r11
                r13 = r12
            L_0x0347:
                if (r8 >= r15) goto L_0x0373
                char r2 = r1.charAt(r8)
                r3 = 63
                if (r2 != r3) goto L_0x0373
                r2 = 35
                int r16 = p735br.C18980c.m32101e(r1, r2, r8, r15)
                okhttp3.p$b r2 = okhttp3.C19997p.f44238l
                int r4 = r8 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 208(0xd0, float:2.91E-43)
                java.lang.String r6 = " \"'<>#"
                r3 = r13
                r5 = r16
                java.lang.String r2 = okhttp3.C19997p.C19999b.m34232a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.ArrayList r2 = okhttp3.C19997p.C19999b.m34237f(r2)
                r14.f44255g = r2
                r8 = r16
            L_0x0373:
                if (r8 >= r15) goto L_0x0392
                char r1 = r1.charAt(r8)
                r2 = 35
                if (r1 != r2) goto L_0x0392
                okhttp3.p$b r2 = okhttp3.C19997p.f44238l
                int r4 = r8 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 176(0xb0, float:2.47E-43)
                java.lang.String r6 = ""
                r3 = r13
                r5 = r15
                java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r14.f44256h = r1
            L_0x0392:
                return
            L_0x0393:
                java.lang.String r1 = "Invalid URL host: \""
                java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
                r13 = r27
                r2 = r16
                java.lang.String r2 = r12.substring(r2, r13)
                kotlin.jvm.internal.C19383o.m32796f(r2, r15)
                r1.append(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x03b8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C19997p.C19998a.mo72980f(java.lang.String, okhttp3.p):void");
        }

        /* renamed from: g */
        public final void mo72981g(String str, int i, int i2, boolean z, boolean z2) {
            String a = C19999b.m34232a(C19997p.f44238l, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, (Charset) null, 240);
            boolean z3 = false;
            if (!(C19383o.m32792b(a, ".") || C19457k.m33019W0(a, "%2e", true))) {
                if (C19383o.m32792b(a, "..") || C19457k.m33019W0(a, "%2e.", true) || C19457k.m33019W0(a, ".%2e", true) || C19457k.m33019W0(a, "%2e%2e", true)) {
                    ArrayList arrayList = this.f44254f;
                    if (((String) arrayList.remove(arrayList.size() - 1)).length() == 0) {
                        z3 = true;
                    }
                    if (!z3 || !(!this.f44254f.isEmpty())) {
                        this.f44254f.add("");
                        return;
                    }
                    ArrayList arrayList2 = this.f44254f;
                    arrayList2.set(arrayList2.size() - 1, "");
                    return;
                }
                ArrayList arrayList3 = this.f44254f;
                if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                    z3 = true;
                }
                if (z3) {
                    ArrayList arrayList4 = this.f44254f;
                    arrayList4.set(arrayList4.size() - 1, a);
                } else {
                    this.f44254f.add(a);
                }
                if (z) {
                    this.f44254f.add("");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r6.f44251c.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
            if (r1 != okhttp3.C19997p.C19999b.m34233b(r3)) goto L_0x009b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f44249a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f44250b
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L_0x0023
                r1 = r3
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.f44251c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r3
                goto L_0x0033
            L_0x0032:
                r1 = r2
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r6.f44250b
                r0.append(r1)
                java.lang.String r1 = r6.f44251c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r3 = r2
            L_0x0044:
                if (r3 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r6.f44251c
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r6.f44252d
                if (r1 == 0) goto L_0x0072
                boolean r1 = kotlin.text.C19459m.m33037f1(r1, r4)
                if (r1 == 0) goto L_0x006d
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f44252d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0072
            L_0x006d:
                java.lang.String r1 = r6.f44252d
                r0.append(r1)
            L_0x0072:
                int r1 = r6.f44253e
                r3 = -1
                if (r1 != r3) goto L_0x007b
                java.lang.String r5 = r6.f44249a
                if (r5 == 0) goto L_0x00a1
            L_0x007b:
                if (r1 == r3) goto L_0x007e
                goto L_0x008c
            L_0x007e:
                okhttp3.p$b r1 = okhttp3.C19997p.f44238l
                java.lang.String r3 = r6.f44249a
                kotlin.jvm.internal.C19383o.m32794d(r3)
                r1.getClass()
                int r1 = okhttp3.C19997p.C19999b.m34233b(r3)
            L_0x008c:
                java.lang.String r3 = r6.f44249a
                if (r3 == 0) goto L_0x009b
                okhttp3.p$b r5 = okhttp3.C19997p.f44238l
                r5.getClass()
                int r3 = okhttp3.C19997p.C19999b.m34233b(r3)
                if (r1 == r3) goto L_0x00a1
            L_0x009b:
                r0.append(r4)
                r0.append(r1)
            L_0x00a1:
                okhttp3.p$b r1 = okhttp3.C19997p.f44238l
                java.util.ArrayList r3 = r6.f44254f
                r1.getClass()
                java.lang.String r1 = "$this$toPathString"
                kotlin.jvm.internal.C19383o.m32797g(r3, r1)
                int r1 = r3.size()
            L_0x00b1:
                if (r2 >= r1) goto L_0x00c4
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r3.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r2 = r2 + 1
                goto L_0x00b1
            L_0x00c4:
                java.util.ArrayList r1 = r6.f44255g
                if (r1 == 0) goto L_0x00da
                r1 = 63
                r0.append(r1)
                okhttp3.p$b r1 = okhttp3.C19997p.f44238l
                java.util.ArrayList r2 = r6.f44255g
                kotlin.jvm.internal.C19383o.m32794d(r2)
                r1.getClass()
                okhttp3.C19997p.C19999b.m34238g(r2, r0)
            L_0x00da:
                java.lang.String r1 = r6.f44256h
                if (r1 == 0) goto L_0x00e8
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f44256h
                r0.append(r1)
            L_0x00e8:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C19383o.m32796f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C19997p.C19998a.toString():java.lang.String");
        }
    }

    /* renamed from: okhttp3.p$b */
    public static final class C19999b {
        /* renamed from: a */
        public static String m34232a(C19999b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            String str3 = str;
            String str4 = str2;
            int i4 = i3;
            boolean z5 = false;
            int i5 = (i4 & 1) != 0 ? 0 : i;
            int length = (i4 & 2) != 0 ? str.length() : i2;
            boolean z6 = (i4 & 8) != 0 ? false : z;
            boolean z7 = (i4 & 16) != 0 ? false : z2;
            boolean z8 = (i4 & 32) != 0 ? false : z3;
            if ((i4 & 64) == 0) {
                z5 = z4;
            }
            int i6 = 128;
            Charset charset2 = (i4 & 128) != 0 ? null : charset;
            bVar.getClass();
            C19383o.m32797g(str3, "$this$canonicalize");
            int i7 = i5;
            while (i7 < length) {
                int codePointAt = str3.codePointAt(i7);
                int i8 = 43;
                int i9 = 32;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= i6 && !z5) || C19459m.m33037f1(str4, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !m34235d(i7, length, str3)))) || (codePointAt == 43 && z8)))) {
                    C19893f fVar = new C19893f();
                    fVar.mo72714F0(i5, i7, str3);
                    C19893f fVar2 = null;
                    while (i7 < length) {
                        int codePointAt2 = str3.codePointAt(i7);
                        if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != i8 || !z8) {
                                if (codePointAt2 >= i9 && codePointAt2 != 127) {
                                    if ((codePointAt2 < 128 || z5) && !C19459m.m33037f1(str4, (char) codePointAt2) && (codePointAt2 != 37 || (z6 && (!z7 || m34235d(i7, length, str3))))) {
                                        fVar.mo72717H0(codePointAt2);
                                        i7 += Character.charCount(codePointAt2);
                                        i9 = 32;
                                        i8 = 43;
                                    }
                                }
                                if (fVar2 == null) {
                                    fVar2 = new C19893f();
                                }
                                if (charset2 == null || C19383o.m32792b(charset2, StandardCharsets.UTF_8)) {
                                    fVar2.mo72717H0(codePointAt2);
                                } else {
                                    fVar2.mo72713E0(str3, i7, Character.charCount(codePointAt2) + i7, charset2);
                                }
                                while (!fVar2.mo72733e0()) {
                                    byte readByte = fVar2.readByte() & 255;
                                    fVar.mo72771x0(37);
                                    char[] cArr = C19997p.f44237k;
                                    fVar.mo72771x0(cArr[(readByte >> 4) & 15]);
                                    fVar.mo72771x0(cArr[readByte & 15]);
                                }
                                i7 += Character.charCount(codePointAt2);
                                i9 = 32;
                                i8 = 43;
                            } else {
                                fVar.mo72715G0(z6 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                            }
                        }
                        i7 += Character.charCount(codePointAt2);
                        i9 = 32;
                        i8 = 43;
                    }
                    return fVar.mo72708B();
                }
                i7 += Character.charCount(codePointAt);
                i6 = 128;
            }
            String substring = str3.substring(i5, length);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: b */
        public static int m34233b(String str) {
            C19383o.m32797g(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: c */
        public static C19997p m34234c(String str) {
            C19383o.m32797g(str, "$this$toHttpUrl");
            C19998a aVar = new C19998a();
            aVar.mo72980f(str, (C19997p) null);
            return aVar.mo72978d();
        }

        /* renamed from: d */
        public static boolean m34235d(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C18980c.m32112p(str.charAt(i + 1)) != -1 && C18980c.m32112p(str.charAt(i3)) != -1;
        }

        /* renamed from: e */
        public static String m34236e(C19999b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            int i5;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            bVar.getClass();
            C19383o.m32797g(str, "$this$percentDecode");
            int i6 = i;
            while (i4 < i2) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C19893f fVar = new C19893f();
                    fVar.mo72714F0(i, i4, str);
                    while (i4 < i2) {
                        int codePointAt = str.codePointAt(i4);
                        if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                            int p = C18980c.m32112p(str.charAt(i4 + 1));
                            int p2 = C18980c.m32112p(str.charAt(i5));
                            if (!(p == -1 || p2 == -1)) {
                                fVar.mo72771x0((p << 4) + p2);
                                i4 = Character.charCount(codePointAt) + i5;
                            }
                        } else if (codePointAt == 43 && z) {
                            fVar.mo72771x0(32);
                            i4++;
                        }
                        fVar.mo72717H0(codePointAt);
                        i4 += Character.charCount(codePointAt);
                    }
                    return fVar.mo72708B();
                }
                i6 = i4 + 1;
            }
            String substring = str.substring(i, i2);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: f */
        public static ArrayList m34237f(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int k1 = C19459m.m33042k1(str, '&', i, false, 4);
                if (k1 == -1) {
                    k1 = str.length();
                }
                int k12 = C19459m.m33042k1(str, '=', i, false, 4);
                if (k12 == -1 || k12 > k1) {
                    String substring = str.substring(i, k1);
                    C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, k12);
                    C19383o.m32796f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(k12 + 1, k1);
                    C19383o.m32796f(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = k1 + 1;
            }
            return arrayList;
        }

        /* renamed from: g */
        public static void m34238g(List list, StringBuilder sb) {
            C19383o.m32797g(list, "$this$toQueryString");
            C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, list.size()), 2);
            int i = B0.f44414b;
            int i2 = B0.f44415c;
            int i3 = B0.f44416d;
            if (i3 >= 0) {
                if (i > i2) {
                    return;
                }
            } else if (i < i2) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }
    }

    public C19997p(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f44240b = str;
        this.f44241c = str2;
        this.f44242d = str3;
        this.f44243e = str4;
        this.f44244f = i;
        this.f44245g = arrayList;
        this.f44246h = arrayList2;
        this.f44247i = str5;
        this.f44248j = str6;
        this.f44239a = C19383o.m32792b(str, "https");
    }

    /* renamed from: a */
    public final String mo72964a() {
        if (this.f44242d.length() == 0) {
            return "";
        }
        int k1 = C19459m.m33042k1(this.f44248j, ':', this.f44240b.length() + 3, false, 4) + 1;
        int k12 = C19459m.m33042k1(this.f44248j, '@', 0, false, 6);
        String str = this.f44248j;
        if (str != null) {
            String substring = str.substring(k1, k12);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public final String mo72965b() {
        int k1 = C19459m.m33042k1(this.f44248j, JsonPointer.SEPARATOR, this.f44240b.length() + 3, false, 4);
        String str = this.f44248j;
        int f = C18980c.m32102f(str, k1, str.length(), "?#");
        String str2 = this.f44248j;
        if (str2 != null) {
            String substring = str2.substring(k1, f);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public final ArrayList mo72966c() {
        int k1 = C19459m.m33042k1(this.f44248j, JsonPointer.SEPARATOR, this.f44240b.length() + 3, false, 4);
        String str = this.f44248j;
        int f = C18980c.m32102f(str, k1, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (k1 < f) {
            int i = k1 + 1;
            int e = C18980c.m32101e(this.f44248j, JsonPointer.SEPARATOR, i, f);
            String str2 = this.f44248j;
            if (str2 != null) {
                String substring = str2.substring(i, e);
                C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                k1 = e;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo72967d() {
        if (this.f44246h == null) {
            return null;
        }
        int k1 = C19459m.m33042k1(this.f44248j, RFC1522Codec.SEP, 0, false, 6) + 1;
        String str = this.f44248j;
        int e = C18980c.m32101e(str, '#', k1, str.length());
        String str2 = this.f44248j;
        if (str2 != null) {
            String substring = str2.substring(k1, e);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: e */
    public final String mo72968e() {
        if (this.f44241c.length() == 0) {
            return "";
        }
        int length = this.f44240b.length() + 3;
        String str = this.f44248j;
        int f = C18980c.m32102f(str, length, str.length(), ":@");
        String str2 = this.f44248j;
        if (str2 != null) {
            String substring = str2.substring(length, f);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19997p) && C19383o.m32792b(((C19997p) obj).f44248j, this.f44248j);
    }

    /* renamed from: f */
    public final C19998a mo72970f() {
        String str;
        C19998a aVar = new C19998a();
        aVar.f44249a = this.f44240b;
        aVar.f44250b = mo72968e();
        aVar.f44251c = mo72964a();
        aVar.f44252d = this.f44243e;
        int i = this.f44244f;
        C19999b bVar = f44238l;
        String str2 = this.f44240b;
        bVar.getClass();
        aVar.f44253e = i != C19999b.m34233b(str2) ? this.f44244f : -1;
        aVar.f44254f.clear();
        aVar.f44254f.addAll(mo72966c());
        aVar.mo72979e(mo72967d());
        if (this.f44247i == null) {
            str = null;
        } else {
            int k1 = C19459m.m33042k1(this.f44248j, '#', 0, false, 6) + 1;
            String str3 = this.f44248j;
            if (str3 != null) {
                str = str3.substring(k1);
                C19383o.m32796f(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        aVar.f44256h = str;
        return aVar;
    }

    /* renamed from: g */
    public final URI mo72971g() {
        C19998a f = mo72970f();
        String str = f.f44252d;
        String str2 = null;
        f.f44252d = str != null ? new Regex("[\"<>^`{|}]").replace((CharSequence) str, "") : null;
        int size = f.f44254f.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = f.f44254f;
            arrayList.set(i, C19999b.m34232a(f44238l, (String) arrayList.get(i), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        ArrayList arrayList2 = f.f44255g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str3 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str3 != null ? C19999b.m34232a(f44238l, str3, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195) : null);
            }
        }
        String str4 = f.f44256h;
        if (str4 != null) {
            str2 = C19999b.m34232a(f44238l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        f.f44256h = str2;
        String aVar = f.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace((CharSequence) aVar, ""));
                C19383o.m32796f(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: h */
    public final URL mo72972h() {
        try {
            return new URL(this.f44248j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return this.f44248j.hashCode();
    }

    public final String toString() {
        return this.f44248j;
    }
}
