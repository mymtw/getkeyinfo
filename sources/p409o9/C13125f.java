package p409o9;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;

/* renamed from: o9.f */
public final class C13125f {

    /* renamed from: a */
    public static final LinkedHashMap f28856a = C19294b0.m32563t0(new Pair("Oops", "true"), new Pair("ExampleKey", "15"));

    /* renamed from: b */
    public static final LinkedHashMap f28857b = new LinkedHashMap();

    /* renamed from: o9.f$a */
    public static final class C13126a {
        /* renamed from: a */
        public static LinkedHashMap m20790a() {
            return C0326j.m869n(BuildTarget.Companion) ? C13125f.f28856a : C13125f.f28857b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m20791b(kotlin.Pair r8) {
            /*
                java.lang.Object r0 = r8.getSecond()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r8 = r8.getFirst()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r1 = "value"
                kotlin.jvm.internal.C19383o.m32797g(r0, r1)
                kotlin.text.Regex r1 = new kotlin.text.Regex
                java.lang.String r2 = "^[A-Za-z]*$"
                r1.<init>((java.lang.String) r2)
                boolean r1 = r1.matches(r0)
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x002c
                java.lang.String r1 = java.lang.String.valueOf(r1)
                boolean r1 = p628nj.C18263b.m30837c0(r1)
                if (r1 == 0) goto L_0x002c
                r1 = r2
                goto L_0x002d
            L_0x002c:
                r1 = r3
            L_0x002d:
                if (r1 == 0) goto L_0x0031
                goto L_0x008f
            L_0x0031:
                java.lang.String r1 = r0.toString()
                r4 = r3
                r5 = r4
            L_0x0037:
                int r6 = r1.length()
                if (r4 >= r6) goto L_0x004f
                char r6 = r1.charAt(r4)
                r7 = 47
                if (r6 != r7) goto L_0x0047
                r6 = r2
                goto L_0x0048
            L_0x0047:
                r6 = r3
            L_0x0048:
                if (r6 == 0) goto L_0x004c
                int r5 = r5 + 1
            L_0x004c:
                int r4 = r4 + 1
                goto L_0x0037
            L_0x004f:
                if (r5 == r2) goto L_0x0052
                goto L_0x008c
            L_0x0052:
                java.lang.String r4 = "/"
                java.lang.String r5 = kotlin.text.C19459m.m33032E1(r1, r4, r1)
                java.lang.String r1 = kotlin.text.C19459m.m33030C1(r1, r4, r1)
                kotlin.text.Regex r4 = new kotlin.text.Regex
                java.lang.String r6 = "^[A-Za-z0-9_]*$"
                r4.<init>((java.lang.String) r6)
                boolean r4 = r4.matches(r5)
                kotlin.text.Regex r7 = new kotlin.text.Regex
                r7.<init>((java.lang.String) r6)
                boolean r6 = r7.matches(r1)
                boolean r5 = p628nj.C18263b.m30837c0(r5)
                boolean r1 = p628nj.C18263b.m30837c0(r1)
                if (r4 == 0) goto L_0x007e
                if (r5 == 0) goto L_0x007e
                r4 = r2
                goto L_0x007f
            L_0x007e:
                r4 = r3
            L_0x007f:
                if (r6 == 0) goto L_0x0085
                if (r1 == 0) goto L_0x0085
                r1 = r2
                goto L_0x0086
            L_0x0085:
                r1 = r3
            L_0x0086:
                if (r4 == 0) goto L_0x008c
                if (r1 == 0) goto L_0x008c
                r1 = r2
                goto L_0x008d
            L_0x008c:
                r1 = r3
            L_0x008d:
                if (r1 == 0) goto L_0x0091
            L_0x008f:
                r1 = r3
                goto L_0x0092
            L_0x0091:
                r1 = r2
            L_0x0092:
                java.util.List<java.lang.String> r4 = p409o9.C13140r.f28904a
                boolean r4 = r4.contains(r8)
                if (r1 != 0) goto L_0x009e
                if (r4 == 0) goto L_0x009d
                goto L_0x009e
            L_0x009d:
                r2 = r3
            L_0x009e:
                if (r2 == 0) goto L_0x00a8
                com.etsy.android.lib.config.BuildTarget$a r1 = com.etsy.android.lib.config.BuildTarget.Companion
                boolean r1 = androidx.appcompat.widget.C0326j.m869n(r1)
                if (r1 == 0) goto L_0x00d6
            L_0x00a8:
                com.etsy.android.lib.config.BuildTarget$a r1 = com.etsy.android.lib.config.BuildTarget.Companion
                boolean r1 = androidx.appcompat.widget.C0326j.m869n(r1)
                if (r1 == 0) goto L_0x00b6
                java.util.LinkedHashMap r1 = p409o9.C13125f.f28856a
                r1.put(r8, r0)
                goto L_0x00bb
            L_0x00b6:
                java.util.LinkedHashMap r1 = p409o9.C13125f.f28857b
                r1.put(r8, r0)
            L_0x00bb:
                com.etsy.android.lib.core.EtsyApplication r8 = com.etsy.android.lib.core.EtsyApplication.get()
                y9.b r8 = r8.getConfigUpdateStream()
                y9.c r0 = new y9.c
                java.util.List<java.lang.String> r1 = com.etsy.android.lib.config.C8591a.f18700r
                com.etsy.android.lib.config.a r1 = p628nj.C18263b.f40056T
                java.lang.String r2 = "getInstance()"
                kotlin.jvm.internal.C19383o.m32796f(r1, r2)
                r0.<init>(r1, r3)
                com.jakewharton.rxrelay2.b<y9.c> r8 = r8.f30552a
                r8.accept(r0)
            L_0x00d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p409o9.C13125f.C13126a.m20791b(kotlin.Pair):void");
        }
    }
}
