package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import com.bugsnag.android.internal.C5763c;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19459m;
import p003a2.C0023f;

/* renamed from: com.bugsnag.android.t0 */
public final class C5912t0 {

    /* renamed from: f */
    public static final C5913a f12608f = new C5913a();

    /* renamed from: a */
    public final String f12609a;

    /* renamed from: b */
    public final String f12610b;

    /* renamed from: c */
    public final long f12611c;

    /* renamed from: d */
    public final String f12612d;

    /* renamed from: e */
    public final Set<ErrorType> f12613e;

    /* renamed from: com.bugsnag.android.t0$a */
    public static final class C5913a {
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
            if (kotlin.jvm.internal.C19383o.m32792b(r1.f12212m, java.lang.Boolean.TRUE) != false) goto L_0x0065;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.bugsnag.android.C5912t0 m11704a(java.lang.Object r8, java.lang.String r9, com.bugsnag.android.internal.C5763c r10) {
            /*
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.C19383o.m32793c(r3, r0)
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = "obj"
                kotlin.jvm.internal.C19383o.m32798h(r8, r0)
                java.lang.String r0 = "config"
                kotlin.jvm.internal.C19383o.m32798h(r10, r0)
                boolean r0 = r8 instanceof com.bugsnag.android.C5908s0
                if (r0 == 0) goto L_0x0028
                r9 = r8
                com.bugsnag.android.s0 r9 = (com.bugsnag.android.C5908s0) r9
                com.bugsnag.android.u0 r9 = r9.f12603b
                java.lang.String r9 = r9.f12654i
            L_0x0026:
                r2 = r9
                goto L_0x0039
            L_0x0028:
                if (r9 == 0) goto L_0x0033
                int r1 = r9.length()
                if (r1 != 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r1 = 0
                goto L_0x0034
            L_0x0033:
                r1 = 1
            L_0x0034:
                if (r1 == 0) goto L_0x0026
                java.lang.String r9 = r10.f12311a
                goto L_0x0026
            L_0x0039:
                java.lang.String r9 = "when {\n                o…e -> apiKey\n            }"
                kotlin.jvm.internal.C19383o.m32793c(r2, r9)
                com.bugsnag.android.t0 r9 = new com.bugsnag.android.t0
                r10 = 0
                if (r0 == 0) goto L_0x005d
                r1 = r8
                com.bugsnag.android.s0 r1 = (com.bugsnag.android.C5908s0) r1
                com.bugsnag.android.u0 r1 = r1.f12603b
                com.bugsnag.android.e r1 = r1.f12655j
                if (r1 == 0) goto L_0x0057
                java.lang.Boolean r1 = r1.f12212m
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
                if (r1 == 0) goto L_0x005d
                goto L_0x0065
            L_0x0057:
                java.lang.String r8 = "app"
                kotlin.jvm.internal.C19383o.m32805o(r8)
                throw r10
            L_0x005d:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r1)
                if (r10 == 0) goto L_0x0069
            L_0x0065:
                java.lang.String r10 = "startupcrash"
            L_0x0067:
                r6 = r10
                goto L_0x006c
            L_0x0069:
                java.lang.String r10 = ""
                goto L_0x0067
            L_0x006c:
                if (r0 == 0) goto L_0x0077
                com.bugsnag.android.s0 r8 = (com.bugsnag.android.C5908s0) r8
                com.bugsnag.android.u0 r8 = r8.f12603b
                java.util.LinkedHashSet r8 = r8.mo16689a()
                goto L_0x007d
            L_0x0077:
                com.bugsnag.android.ErrorType r8 = com.bugsnag.android.ErrorType.C
                java.util.Set r8 = kotlin.jvm.internal.C19382n.m32702C0(r8)
            L_0x007d:
                r7 = r8
                r1 = r9
                r1.<init>(r2, r3, r4, r6, r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5912t0.C5913a.m11704a(java.lang.Object, java.lang.String, com.bugsnag.android.internal.c):com.bugsnag.android.t0");
        }

        /* renamed from: b */
        public static C5912t0 m11705b(File file, C5763c cVar) {
            String str;
            Set set;
            C19383o.m32798h(file, ResponseConstants.FILE);
            C19383o.m32798h(cVar, "config");
            String name = file.getName();
            C19383o.m32793c(name, "file.name");
            String t1 = C19459m.m33051t1(name, "_startupcrash.json");
            int l1 = C19459m.m33043l1(t1, "_", 0, false, 6) + 1;
            int l12 = C19459m.m33043l1(t1, "_", l1, false, 4);
            if (l1 == 0 || l12 == -1 || l12 <= l1) {
                str = null;
            } else {
                str = t1.substring(l1, l12);
                C19383o.m32796f(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            String str2 = str != null ? str : cVar.f12311a;
            String name2 = file.getName();
            C19383o.m32796f(name2, "name");
            int o1 = C19459m.m33046o1(name2, ".", 0, 6);
            if (o1 != -1) {
                name2 = name2.substring(0, o1);
                C19383o.m32796f(name2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String substring = name2.substring(C19459m.m33046o1(name2, "_", 0, 6) + 1);
            C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
            int hashCode = substring.hashCode();
            if (hashCode == -2033965238 ? !substring.equals("startupcrash") : hashCode != 2127567527 || !substring.equals("not-jvm")) {
                substring = "";
            }
            String str3 = substring;
            String name3 = file.getName();
            C19383o.m32793c(name3, "name");
            int o12 = C19459m.m33046o1(name3, "_", C19459m.m33046o1(name3, "_", 0, 6) - 1, 4);
            int o13 = C19459m.m33046o1(name3, "_", o12 - 1, 4) + 1;
            if (o13 < o12) {
                String substring2 = name3.substring(o13, o12);
                C19383o.m32796f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                List y1 = C19459m.m33056y1(substring2, new String[]{","}, 0, 6);
                ErrorType[] values = ErrorType.values();
                ArrayList arrayList = new ArrayList();
                for (ErrorType errorType : values) {
                    if (y1.contains(errorType.getDesc$bugsnag_android_core_release())) {
                        arrayList.add(errorType);
                    }
                }
                set = C19327t.m32664t1(arrayList);
            } else {
                set = EmptySet.INSTANCE;
            }
            return new C5912t0(str2, "", -1, str3, set);
        }
    }

    public C5912t0(String str, String str2, long j, String str3, Set<? extends ErrorType> set) {
        C19383o.m32798h(str, "apiKey");
        C19383o.m32798h(set, "errorTypes");
        this.f12609a = str;
        this.f12610b = str2;
        this.f12611c = j;
        this.f12612d = str3;
        this.f12613e = set;
    }

    /* renamed from: a */
    public final String mo16676a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12611c);
        sb.append('_');
        sb.append(this.f12609a);
        sb.append('_');
        sb.append(C19388s.m32886t0(this.f12613e));
        sb.append('_');
        sb.append(this.f12610b);
        sb.append('_');
        return C0023f.m110k(sb, this.f12612d, ".json");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5912t0)) {
            return false;
        }
        C5912t0 t0Var = (C5912t0) obj;
        return C19383o.m32792b(this.f12609a, t0Var.f12609a) && C19383o.m32792b(this.f12610b, t0Var.f12610b) && this.f12611c == t0Var.f12611c && C19383o.m32792b(this.f12612d, t0Var.f12612d) && C19383o.m32792b(this.f12613e, t0Var.f12613e);
    }

    public final int hashCode() {
        String str = this.f12609a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12610b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.f12611c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.f12612d;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<ErrorType> set = this.f12613e;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EventFilenameInfo(apiKey=");
        h.append(this.f12609a);
        h.append(", uuid=");
        h.append(this.f12610b);
        h.append(", timestamp=");
        h.append(this.f12611c);
        h.append(", suffix=");
        h.append(this.f12612d);
        h.append(", errorTypes=");
        h.append(this.f12613e);
        h.append(")");
        return h.toString();
    }
}
