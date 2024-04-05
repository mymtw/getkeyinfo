package p739dr;

import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C20018z;
import okio.ByteString;
import p735br.C18980c;

/* renamed from: dr.e */
public final class C19005e {
    static {
        ByteString.Companion.getClass();
        ByteString.C20020a.m34295c("\"\\");
        ByteString.C20020a.m34295c("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m32152a(C20018z zVar) {
        if (C19383o.m32792b(zVar.f44362c.f44343c, "HEAD")) {
            return false;
        }
        int i = zVar.f44365f;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && C18980c.m32106j(zVar) == -1 && !C19457k.m33019W0("chunked", C20018z.m34284b(zVar, "Transfer-Encoding"), true)) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bc, code lost:
        if (r5 == false) goto L_0x01d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0214 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m32153b(okhttp3.C19984j r34, okhttp3.C19997p r35, okhttp3.C19994o r36) {
        /*
            r1 = r34
            r2 = r35
            r0 = r36
            java.lang.String r3 = "$this$receiveHeaders"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.lang.String r3 = "url"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            java.lang.String r3 = "headers"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            fn.b r3 = okhttp3.C19984j.f44217g1
            if (r1 != r3) goto L_0x001a
            return
        L_0x001a:
            okhttp3.i$a r3 = okhttp3.C19952i.f44053n
            r3.getClass()
            java.lang.String r3 = "Set-Cookie"
            java.util.List r3 = r0.mo72956n(r3)
            int r4 = r3.size()
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x002c:
            if (r7 >= r4) goto L_0x0219
            java.lang.Object r0 = r3.get(r7)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "setCookie"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            long r10 = java.lang.System.currentTimeMillis()
            byte[] r0 = p735br.C18980c.f42301a
            int r0 = r9.length()
            r12 = 59
            int r0 = p735br.C18980c.m32101e(r9, r12, r6, r0)
            r13 = 61
            int r14 = p735br.C18980c.m32101e(r9, r13, r6, r0)
            if (r14 != r0) goto L_0x0053
            goto L_0x0078
        L_0x0053:
            java.lang.String r16 = p735br.C18980c.m32120x(r6, r14, r9)
            int r15 = r16.length()
            r5 = 1
            if (r15 != 0) goto L_0x0060
            r15 = r5
            goto L_0x0061
        L_0x0060:
            r15 = r6
        L_0x0061:
            if (r15 != 0) goto L_0x0205
            int r15 = p735br.C18980c.m32108l(r16)
            r6 = -1
            if (r15 == r6) goto L_0x006c
            goto L_0x01d1
        L_0x006c:
            int r14 = r14 + 1
            java.lang.String r17 = p735br.C18980c.m32120x(r14, r0, r9)
            int r14 = p735br.C18980c.m32108l(r17)
            if (r14 == r6) goto L_0x007c
        L_0x0078:
            r0 = 0
            r9 = 0
            goto L_0x0207
        L_0x007c:
            int r0 = r0 + 1
            int r6 = r9.length()
            r18 = -1
            r25 = r5
            r20 = r18
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r28 = 0
            r29 = 0
        L_0x0097:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r6) goto L_0x015a
            int r14 = p735br.C18980c.m32101e(r9, r12, r0, r6)
            int r15 = p735br.C18980c.m32101e(r9, r13, r0, r14)
            java.lang.String r0 = p735br.C18980c.m32120x(r0, r15, r9)
            if (r15 >= r14) goto L_0x00b5
            int r15 = r15 + 1
            java.lang.String r15 = p735br.C18980c.m32120x(r15, r14, r9)
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r15 = ""
        L_0x00b7:
            java.lang.String r12 = "expires"
            boolean r12 = kotlin.text.C19457k.m33019W0(r0, r12, r5)
            if (r12 == 0) goto L_0x00c8
            int r0 = r15.length()     // Catch:{ IllegalArgumentException -> 0x0152 }
            long r26 = okhttp3.C19952i.C19953a.m34116b(r0, r15)     // Catch:{ IllegalArgumentException -> 0x0152 }
            goto L_0x00fc
        L_0x00c8:
            java.lang.String r12 = "max-age"
            boolean r12 = kotlin.text.C19457k.m33019W0(r0, r12, r5)
            if (r12 == 0) goto L_0x0100
            long r20 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00e0 }
            r30 = 0
            int r0 = (r20 > r30 ? 1 : (r20 == r30 ? 0 : -1))
            if (r0 > 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r32 = r20
        L_0x00dd:
            r20 = r32
            goto L_0x00fc
        L_0x00e0:
            r0 = move-exception
            r12 = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch:{  }
            java.lang.String r13 = "-?\\d+"
            r0.<init>((java.lang.String) r13)     // Catch:{  }
            boolean r0 = r0.matches(r15)     // Catch:{  }
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = "-"
            r12 = 0
            boolean r0 = kotlin.text.C19457k.m33025c1(r15, r0, r12)     // Catch:{  }
            if (r0 == 0) goto L_0x00fa
            r30 = r32
        L_0x00fa:
            r20 = r30
        L_0x00fc:
            r24 = r5
            goto L_0x0152
        L_0x00ff:
            throw r12     // Catch:{  }
        L_0x0100:
            java.lang.String r12 = "domain"
            boolean r12 = kotlin.text.C19457k.m33019W0(r0, r12, r5)
            if (r12 == 0) goto L_0x0132
            java.lang.String r0 = "."
            boolean r12 = kotlin.text.C19457k.m33018V0(r15, r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            r12 = r12 ^ r5
            if (r12 == 0) goto L_0x0126
            java.lang.String r0 = kotlin.text.C19459m.m33050s1(r15, r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1686P0(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            if (r0 == 0) goto L_0x0120
            r28 = r0
            r25 = 0
            goto L_0x0152
        L_0x0120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0152 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x0126:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0152 }
            java.lang.String r12 = "Failed requirement."
            java.lang.String r12 = r12.toString()     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0.<init>(r12)     // Catch:{ IllegalArgumentException -> 0x0152 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x0132:
            java.lang.String r12 = "path"
            boolean r12 = kotlin.text.C19457k.m33019W0(r0, r12, r5)
            if (r12 == 0) goto L_0x013d
            r29 = r15
            goto L_0x0152
        L_0x013d:
            java.lang.String r12 = "secure"
            boolean r12 = kotlin.text.C19457k.m33019W0(r0, r12, r5)
            if (r12 == 0) goto L_0x0148
            r22 = r5
            goto L_0x0152
        L_0x0148:
            java.lang.String r12 = "httponly"
            boolean r0 = kotlin.text.C19457k.m33019W0(r0, r12, r5)
            if (r0 == 0) goto L_0x0152
            r23 = r5
        L_0x0152:
            int r0 = r14 + 1
            r12 = 59
            r13 = 61
            goto L_0x0097
        L_0x015a:
            int r0 = (r20 > r32 ? 1 : (r20 == r32 ? 0 : -1))
            if (r0 != 0) goto L_0x0161
            r18 = r32
            goto L_0x018b
        L_0x0161:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0189
            r12 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0173
            r0 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r0
            long r30 = r20 * r12
        L_0x0173:
            long r30 = r10 + r30
            int r0 = (r30 > r10 ? 1 : (r30 == r10 ? 0 : -1))
            r9 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r0 < 0) goto L_0x0186
            int r0 = (r30 > r9 ? 1 : (r30 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0183
            goto L_0x0186
        L_0x0183:
            r18 = r30
            goto L_0x018b
        L_0x0186:
            r18 = r9
            goto L_0x018b
        L_0x0189:
            r18 = r26
        L_0x018b:
            java.lang.String r0 = r2.f44243e
            r6 = r28
            if (r6 != 0) goto L_0x0193
            r6 = r0
            goto L_0x01bf
        L_0x0193:
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r0, r6)
            if (r9 == 0) goto L_0x019a
            goto L_0x01bc
        L_0x019a:
            boolean r9 = kotlin.text.C19457k.m33018V0(r0, r6)
            if (r9 == 0) goto L_0x01bb
            int r9 = r0.length()
            int r10 = r6.length()
            int r9 = r9 - r10
            int r9 = r9 - r5
            char r9 = r0.charAt(r9)
            r10 = 46
            if (r9 != r10) goto L_0x01bb
            kotlin.text.Regex r9 = p735br.C18980c.f42306f
            boolean r9 = r9.matches(r0)
            if (r9 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r5 = 0
        L_0x01bc:
            if (r5 != 0) goto L_0x01bf
            goto L_0x01d1
        L_0x01bf:
            int r0 = r0.length()
            int r5 = r6.length()
            if (r0 == r5) goto L_0x01d3
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f44212g
            java.lang.String r0 = r0.mo72938a(r6)
            if (r0 != 0) goto L_0x01d3
        L_0x01d1:
            r9 = 0
            goto L_0x0206
        L_0x01d3:
            java.lang.String r0 = "/"
            r5 = r29
            r9 = 0
            if (r5 == 0) goto L_0x01e4
            boolean r10 = kotlin.text.C19457k.m33025c1(r5, r0, r9)
            if (r10 != 0) goto L_0x01e1
            goto L_0x01e4
        L_0x01e1:
            r21 = r5
            goto L_0x01fc
        L_0x01e4:
            java.lang.String r5 = r35.mo72965b()
            r10 = 47
            r11 = 6
            int r10 = kotlin.text.C19459m.m33045n1(r5, r10, r9, r11)
            if (r10 == 0) goto L_0x01fa
            java.lang.String r0 = r5.substring(r9, r10)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r5)
        L_0x01fa:
            r21 = r0
        L_0x01fc:
            okhttp3.i r0 = new okhttp3.i
            r15 = r0
            r20 = r6
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x0207
        L_0x0205:
            r9 = r6
        L_0x0206:
            r0 = 0
        L_0x0207:
            if (r0 == 0) goto L_0x0214
            if (r8 != 0) goto L_0x0211
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x0211:
            r8.add(r0)
        L_0x0214:
            int r7 = r7 + 1
            r6 = r9
            goto L_0x002c
        L_0x0219:
            if (r8 == 0) goto L_0x0225
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r3 = "Collections.unmodifiableList(cookies)"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            goto L_0x0227
        L_0x0225:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x0227:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x022e
            return
        L_0x022e:
            r1.mo38910i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p739dr.C19005e.m32153b(okhttp3.j, okhttp3.p, okhttp3.o):void");
    }
}
